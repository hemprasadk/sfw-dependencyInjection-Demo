package prasad.springframeork.didemo.controller;

import org.junit.Before;
import org.junit.Test;
import prasad.springframeork.didemo.services.GreetingServiceImpl;

import java.util.Set;

import static org.junit.Assert.*;

public class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @Before
    public void setup()
    {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreeetingService(new GreetingServiceImpl());
    }

    @Test
    public void sayHello() {
        assertEquals(GreetingServiceImpl.hello,setterInjectedController.sayhello());
    }
}