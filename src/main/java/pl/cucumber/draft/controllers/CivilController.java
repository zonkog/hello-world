package pl.cucumber.draft.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller is responsible for greetings and farewells
 * Created by logorek on 17.10.2017.
 */
@RestController
public class CivilController {

    @RequestMapping(value = "/greeting", method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
    public String greeting() {
        return "Hello world";
    }

    @RequestMapping(value = "/farewell", method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
    public String farewell() {
        return "Goodbye";
    }
}
