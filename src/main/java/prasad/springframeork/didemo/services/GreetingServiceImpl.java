package prasad.springframeork.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreeetingService {

    public static final String hello= "HELLO WORLD";
    @Override
    public String sayhello() {
        return hello;
    }
}
