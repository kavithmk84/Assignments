package TestCases;

import RequestModel.AddBookRequest;
import ResponseModel.AddBookResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class AddBookAPITest {

    @Test(priority=1)
    public void addBookWithID() {
        RestAssured.baseURI = "http://216.10.245.166";
        AddBookRequest addBookRequest = new AddBookRequest();
        addBookRequest.setName("Leader Wisdom");
        addBookRequest.setIsbn("188");
        addBookRequest.setAisle("7777");
        addBookRequest.setAuthor("Robin Sharma");
        Response response = given().header("ContentType", "application/json")
                .body(addBookRequest)
                .when().post("/Library/Addbook.php")
                .then().log().all()
                .statusCode(200)
                .extract().response();
        System.out.println("Add Book Response Body:"+response.getBody().asString());
        AddBookResponse addBookResponse = response.body().as(AddBookResponse.class);
        System.out.println("Response ID:" + addBookResponse.getId());
        System.out.println("Response Message:" + addBookResponse.getMsg());

        Assert.assertEquals(addBookResponse.getMsg(), "successfully added", "Add book success message is incorrect");
    }
}
