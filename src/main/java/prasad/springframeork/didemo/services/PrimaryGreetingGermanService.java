package prasad.springframeork.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


public class PrimaryGreetingGermanService implements GreetingService {

    GreetingRepository greetingRepository;

    public PrimaryGreetingGermanService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }



    @Override
    public String sayhello() {
        return greetingRepository.getGermanGreeting();
    }
}
