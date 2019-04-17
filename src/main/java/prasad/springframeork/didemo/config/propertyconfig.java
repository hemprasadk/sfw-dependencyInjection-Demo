package prasad.springframeork.didemo.config;


import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import prasad.springframeork.didemo.examplebeam.FakeDatasource;
import prasad.springframeork.didemo.examplebeam.FakejmsDatasource;

@Configuration
//@PropertySource({"classpath:datasource.properties","classpath:jms.properties"})
public class propertyconfig{

    @Autowired
    Environment env;

    @Value("${prasad.username}")
    String username;
    @Value("${prasad.password}")
    String password;
    @Value("${prasad.dburl}")
    String url;
    @Value("${prasad.jms.username}")
    String jmsusername;
    @Value("${prasad.jms.password}")
    String jmspassword;
    @Value("${prasad.jms.dburl}")
    String jmsurl;

    @Bean
    public FakeDatasource factoryBean()
    {
        FakeDatasource fakeDatasource = new FakeDatasource();
        fakeDatasource.setPassword(password);
        fakeDatasource.setUrl(url);
        fakeDatasource.setUser(username);
        //fakeDatasource.setUser(env.getProperty("USERNAME"));
        return fakeDatasource;
    }
    @Bean
    public FakejmsDatasource factoryjmsBean()
    {
        FakejmsDatasource fakejmsDatasource = new FakejmsDatasource();
        fakejmsDatasource.setPassword(jmspassword);
        fakejmsDatasource.setUrl(jmsurl);
        fakejmsDatasource.setUser(jmsusername);

        return fakejmsDatasource;
    }
    @Bean
    public static PropertySourcesPlaceholderConfigurer  properties()
    {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return  propertySourcesPlaceholderConfigurer;
    }

}
