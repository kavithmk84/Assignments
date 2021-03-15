package TestCases;

import RequestModel.AddBookRequest;
import RequestModel.DeleteBookRequest;
import ResponseModel.AddBookResponse;
import ResponseModel.AddExistingBookResponse;
import ResponseModel.DeleteBookResponse;
import ResponseModel.GetBookResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

/* [DELETE]
        1. AddBook(id=123)
        2. Validate Book recently added getBook(id=123)
        3. Delete the Book Added (id=123)
        4. Validate getBook(id=123)
        5. AddBook(id=123) // User Should be able to add Book*/


public class DeleteBookAPI {
    @Test(priority=1)
    public void addBookWithID() {
        RestAssured.baseURI = "http://216.10.245.166";
        AddBookRequest addBookRequest = new AddBookRequest();
        addBookRequest.setName("Leader Wisdom");
        addBookRequest.setIsbn("123");
        addBookRequest.setAisle("77777");
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
        Assert.assertEquals(addBookResponse.getId(), "12377777");
    }
    @Test (priority=2)
    public void verifyDeleteBook()
    {
        DeleteBookRequest deleteBookRequest = new DeleteBookRequest();
        deleteBookRequest.setId("12377777");
        Response response = given()
                .body(deleteBookRequest)
                .post("/Library/DeleteBook.php")
                .then()
                .statusCode(200)
                .extract()
                .response();
        System.out.println("Delete Book Response Body:"+response.body().asString());
        DeleteBookResponse deletebookresponse =response.body().as(DeleteBookResponse.class);
        Assert.assertEquals(deletebookresponse.getMsg(),"book is successfully deleted");
        System.out.println("Successfully deleted book with id" +deleteBookRequest.getId());
    }
    @Test(priority=3)
    public void addBookAgainWithSameID() {
        RestAssured.baseURI = "http://216.10.245.166";
        AddBookRequest addBookRequest = new AddBookRequest();
        addBookRequest.setName("Leader Wisdom");
        addBookRequest.setIsbn("123");
        addBookRequest.setAisle("77777");
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
        Assert.assertEquals(addBookResponse.getId(), "12377777");
    }

}
