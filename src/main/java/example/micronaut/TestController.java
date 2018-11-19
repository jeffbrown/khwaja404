package example.micronaut;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;


@Controller("/hello")
public class TestController {

    // this empty constructor is not
    // needed, but isn't a problem...
    TestController() {
    }

    @Get(value = "/", produces = MediaType.TEXT_PLAIN)
    String getTest() {
        return "some string";
    }
}