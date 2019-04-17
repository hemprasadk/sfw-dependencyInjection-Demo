package prasad.springframeork.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String hello= "HELLO WORLD";
    @Override
    public String sayhello() {
        return hello;
    }
}
