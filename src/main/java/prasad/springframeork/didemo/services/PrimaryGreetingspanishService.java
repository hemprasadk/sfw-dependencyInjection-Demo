package prasad.springframeork.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class PrimaryGreetingspanishService implements GreetingService {

    @Override
    public String sayhello() {
        return "Hello- From the primar greeting spanish service";
    }
}
