package lan.test;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {
    @PostMapping
    public HelloEntity hello(@RequestBody HelloEntity helloEntity) {
        return new HelloEntity(helloEntity.getType());
    }
}
