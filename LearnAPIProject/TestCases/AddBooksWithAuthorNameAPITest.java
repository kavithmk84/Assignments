package TestCases;

import RequestModel.AddBookRequest;
import ResponseModel.AddBookResponse;
import ResponseModel.GetBookResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class AddBooksWithAuthorNameAPITest {
    AddBookRequest[] addBookRequests = new AddBookRequest[]{
            new AddBookRequest("Learn Selenium Automation", "7737", "745", "rob sh"),
            new AddBookRequest("Monk who sold his Ferrari", "7737", "967", "rob sh"),
            new AddBookRequest("Learn API", "7737", "786", "rob sh")
    };
    AddBookRequest addBookRequest = addBookRequests[0];
    @Test(priority=1)
    public void addBooksWithAuthorNames() {
        RestAssured.baseURI = "http://216.10.245.166";
        for(int i=0;i<3;i++) {
            Response response = given().header("ContentType", "application/json")
                    .body(addBookRequests[i])
                    .when().post("/Library/Addbook.php")
                    .then().log().all()
                    .statusCode(200)
                    .extract().response();
            System.out.println("Add Book Response Body:" + response.getBody().asString());
            AddBookResponse addBookResponse = response.body().as(AddBookResponse.class);
            System.out.println("Response ID:" + addBookResponse.getId());
            System.out.println("Response Message:" + addBookResponse.getMsg());
            Assert.assertEquals(addBookResponse.getMsg(), "successfully added", "Add book success message is incorrect");
        }
    }
    @Test(priority=2)
    public void getBooksWithAuthorName(){
        Response response = given()
                .queryParam("AuthorName","rob sh")
                .when()
                .get("/Library/GetBook.php")
                .then()
                .log()
                .body().extract().response();
        System.out.println("Get Books with Author Name Response body:"+response.body().asString());
        GetBookResponse[] getBookResponse=response.body().as(GetBookResponse[].class);
        Assert.assertEquals(getBookResponse.length,3);
        for(int i=0;i<3;i++)
        {
            System.out.println("Printing Book Names:"+getBookResponse[i].getBookname());
        }

    }
}
