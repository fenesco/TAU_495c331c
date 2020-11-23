package chapters;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Chapter01 {

    @Test
    public void requestUsZipCode90210_checkPlaceNameInResponseBody_expectBeverlyHills() {

        given().
        when().
        get("http://zippopotam.us/us/90210").then().assertThat().body("places[0].'place name'", equalTo("Beverly Hills"));
    }
}
