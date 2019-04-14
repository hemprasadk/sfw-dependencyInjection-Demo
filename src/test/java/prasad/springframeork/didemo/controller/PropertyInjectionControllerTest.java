package prasad.springframeork.didemo.controller;

import org.junit.Before;
import org.junit.Test;
import prasad.springframeork.didemo.services.GreetingServiceImpl;

import static org.junit.Assert.*;

public class PropertyInjectionControllerTest {

    PropertyInjectionController propertyInjectionController;

    @Before
    public void setup()
    {
        this.propertyInjectionController = new PropertyInjectionController();
        this.propertyInjectionController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testsayhellow() {
        assertEquals(GreetingServiceImpl.hello,propertyInjectionController.sayhello());
    }
}