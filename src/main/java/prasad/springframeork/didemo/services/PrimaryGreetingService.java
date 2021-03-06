package prasad.springframeork.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


public class PrimaryGreetingService implements GreetingService {

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    GreetingRepository greetingRepository;


    @Override
    public String sayhello() {
        return greetingRepository.getEnglishGreeting();
    }
}
