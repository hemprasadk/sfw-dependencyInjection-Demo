package prasad.springframeork.didemo.controller;

import org.springframework.stereotype.Controller;
import prasad.springframeork.didemo.services.GreetingService;

@Controller
public class MyController {
    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    public String hello(){
        System.out.println("Hello!!!1");
        return greetingService.sayhello();
    }
}
