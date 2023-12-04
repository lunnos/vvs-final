import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class CalculatorApiTest {

    @Test
    void testSumEndpoint() {
             given()
            .baseUri("http://localhost:8080/calculator")
            .get("/sum/2/3")
            .then()
            .statusCode(200)
            .body(equalTo("5"));
    }

    @Test
    void testSubtractEndpoint() {
             given()
            .baseUri("http://localhost:8080/calculator")
            .get("/subtract/5/2")
            .then()
            .statusCode(200)
            .body(equalTo("3"));
    }

    @Test
    void testMultiplyEndpoint() {
             given()
            .baseUri("http://localhost:8080/calculator")
            .get("/multiply/4/3")
            .then()
            .statusCode(200)
            .body(equalTo("12"));
    }

    @Test
    void testDivideEndpoint() {
             given()
            .baseUri("http://localhost:8080/calculator")
            .get("/divide/10/2")
            .then()
            .statusCode(200)
            .body(equalTo("5"));
    }
}

    

