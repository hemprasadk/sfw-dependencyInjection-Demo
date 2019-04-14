package prasad.springframeork.didemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import prasad.springframeork.didemo.services.GreeetingService;

@Controller
public class ConstructorInjectedController {

    private GreeetingService greeetingService;

    public ConstructorInjectedController(GreeetingService greeetingService) {
        this.greeetingService = greeetingService;
    }

    public String sayhello()
    {
        return greeetingService.sayhello();
    }
}
