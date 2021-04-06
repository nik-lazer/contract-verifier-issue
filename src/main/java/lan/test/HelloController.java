package lan.test;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {
    @PostMapping
    public HelloResponse hello() {
        return new HelloResponse("VALVAL");
    }
}
