package prasad.springframeork.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayhello() {
        return "Hello- I was injected by Constructor";
    }
}
