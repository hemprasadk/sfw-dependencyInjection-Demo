package prasad.springframeork.didemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import prasad.springframeork.didemo.services.GreetingServiceImpl;
@Controller
public class PropertyInjectionController {
    @Autowired
    public GreetingServiceImpl greetingService;

    public String sayhello(){
        return greetingService.sayhello();
    }

    public GreetingServiceImpl getGreetingService() {
        return greetingService;
    }
}
