package io.github.renatonobrega.aulao_spring_security.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("private")
public class PrivateController {

    public String getMessage() {
        return "Hello from private API controller";
    }
}
