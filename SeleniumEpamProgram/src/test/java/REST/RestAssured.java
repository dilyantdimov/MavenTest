package REST;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.equalTo;

public class RestAssured {

    @Test(groups = { "Service tests" })
    public void validateResponse() {
        given().when().get("https://jsonplaceholder.typicode.com/users").then()
                .statusCode(200)
                .assertThat().header("content-type",equalTo("application/json; charset=utf-8"))
                .assertThat().body("size()",is(10));
    }

}
