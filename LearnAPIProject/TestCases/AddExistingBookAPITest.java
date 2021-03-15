package TestCases;

import RequestModel.AddBookRequest;
import ResponseModel.AddExistingBookResponse;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class AddExistingBookAPITest {

    @Test(priority=2)
    public void addExistingBookWith() {
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
                .statusCode(404)
                .extract().response();
        System.out.println("Add existing book Response Body:"+response.getBody().asString());
        AddExistingBookResponse addExistingBookResponse = response.body().as(AddExistingBookResponse.class);
        System.out.println("Response ID:" + addExistingBookResponse.getId());
        System.out.println("Response Message:" + addExistingBookResponse.getMsg());
        Assert.assertEquals(addExistingBookResponse.getMsg(), "Add Book operation failed, looks like the book already exists");
    }
}
