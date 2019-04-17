package prasad.springframeork.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class PrimaryGreetingspanishService implements GreetingService {

    GreetingRepository greetingRepository;

    public PrimaryGreetingspanishService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }



    @Override
    public String sayhello() {
        return greetingRepository.getSpanishGreeting();
    }
}
