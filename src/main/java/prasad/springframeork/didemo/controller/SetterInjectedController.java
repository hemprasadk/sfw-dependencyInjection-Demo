package prasad.springframeork.didemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import prasad.springframeork.didemo.services.GreeetingService;

@Controller
public class SetterInjectedController {


    private GreeetingService greeetingService;

    public String sayhello()
    {
        return greeetingService.sayhello();
    }
    @Autowired
    public void setGreeetingService(GreeetingService greeetingService) {
        this.greeetingService = greeetingService;
    }

}
