package prasad.springframeork.didemo.services;

public class GreetingServiceFactory {

    GreetingRepository greetingRepository;
    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang)
    {
        switch(lang){
            case "es":
                return new PrimaryGreetingspanishService(greetingRepository);
            case "en":
                return new PrimaryGreetingService(greetingRepository);
            case "de":
                return new PrimaryGreetingGermanService((greetingRepository));
            default:
                return new PrimaryGreetingService(greetingRepository);
        }
    }

}
