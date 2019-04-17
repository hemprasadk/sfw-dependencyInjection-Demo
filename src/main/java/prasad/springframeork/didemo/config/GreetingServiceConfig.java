package prasad.springframeork.didemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import prasad.springframeork.didemo.services.GreetingRepository;
import prasad.springframeork.didemo.services.GreetingService;
import prasad.springframeork.didemo.services.GreetingServiceFactory;

@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository)
    {
        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    @Primary
    @Profile({"en","defaut"})
    GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory)
    {
        return greetingServiceFactory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile({"es","defaut"})
    GreetingService primaryGreetingspanishService(GreetingServiceFactory greetingServiceFactory)
    {
        return greetingServiceFactory.createGreetingService("es");
    }


    @Bean
    @Primary
    @Profile({"de","defaut"})
    GreetingService primaryGreetingGermanService(GreetingServiceFactory greetingServiceFactory)
    {
        return greetingServiceFactory.createGreetingService("de");
    }
}
