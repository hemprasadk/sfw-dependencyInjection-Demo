package prasad.springframeork.didemo.controller;

import org.junit.Before;
import org.junit.Test;
import prasad.springframeork.didemo.services.GreetingServiceImpl;

import static org.junit.Assert.*;

public class ConstructorInjectedControllerTest {
    ConstructorInjectedController constructorInjectedController;

    @Before
    public void setup()
    {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());

    }


    @Test
    public void sayHello() {
        assertEquals(GreetingServiceImpl.hello,constructorInjectedController.sayhello());
    }
}