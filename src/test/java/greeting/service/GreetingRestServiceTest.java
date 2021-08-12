package greeting.service;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class GreetingRestServiceTest {

  @Test
  public void testHelloEndpoint() {

    given().when().get("/greeting").then().statusCode(200).body(is("Hello World!"));
  }

  @Test
  public void testHelloNameEndpoint() {

    given().when().get("/greeting/Florian").then().statusCode(200).body(is("Hello Florian!"));
  }

}