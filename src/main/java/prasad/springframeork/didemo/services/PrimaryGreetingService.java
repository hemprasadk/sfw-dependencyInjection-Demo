package prasad.springframeork.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("en")
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayhello() {
        return "Hello- From the primar greeting service";
    }
}
