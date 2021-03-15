package TestCases;

import RequestModel.AddBookRequest;
import RequestModel.DeleteBookRequest;
import ResponseModel.AddBookResponse;
import ResponseModel.DeleteBookResponse;
import ResponseModel.GetBookResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class AddingBooksAndDeletingABook {
    AddBookRequest[] addBookRequests = new AddBookRequest[]{
            new AddBookRequest("Learn Selenium Automation", "11077", "745", "rob sh5"),
            new AddBookRequest("Monk who sold his Ferrari", "11077", "967", "rob sh5"),
            new AddBookRequest("Learn API", "11077", "786", "rob sh5")
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
                .queryParam("AuthorName","rob sh5")
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
            System.out.println("Printing Author Names:"+getBookResponse[i].getAuthor());
        }



        DeleteBookRequest deleteBookRequest = new DeleteBookRequest();
        //deleteBookRequest.setId("717745");
        Response getByOtherAuthorResponse = given()
                .queryParam("AuthorName","rob sh4")
                .body(deleteBookRequest)
                .get("/Library/GetBook.php")
                .then()
               // .statusCode(200)
                .extract()
                .response();
        System.out.println("Get By Author Response Body for rob sh4:"+getByOtherAuthorResponse.body().asString());
        GetBookResponse[] bookResponse=getByOtherAuthorResponse.body().as(GetBookResponse[].class);

        deleteBookRequest.setId(bookResponse[0].getIsbn()+getBookResponse[0].getAisle());
        Response deleteBookResponse = given()
                .body(deleteBookRequest)
                .post("/Library/DeleteBook.php")
                .then()
                .statusCode(200)
                .extract()
                .response();
        System.out.println("Successfully deleted book with id :=" +deleteBookRequest.getId()+"and Author Name 'rob sh4'");

        Response getByAuthorResponse = given()
                .queryParam("AuthorName","rob sh5")
                .when()
                .get("/Library/GetBook.php")
                .then()
                .log()
                .body().extract().response();
        System.out.println("Get By Author Response Body for author rob sh5:"+getByAuthorResponse.body().asString());
        getBookResponse=getByAuthorResponse.body().as(GetBookResponse[].class);
        Assert.assertEquals(getBookResponse.length,3);

    }
}
