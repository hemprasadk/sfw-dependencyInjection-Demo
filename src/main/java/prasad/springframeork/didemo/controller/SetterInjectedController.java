package prasad.springframeork.didemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import prasad.springframeork.didemo.services.GreetingService;

@Controller
public class SetterInjectedController {


    private GreetingService greeetingService;

    public String sayhello()
    {
        return greeetingService.sayhello();
    }
    @Autowired
    @Qualifier("getterGreetingService")
    public void setGreeetingService(GreetingService greeetingService) {
        this.greeetingService = greeetingService;
    }

}
