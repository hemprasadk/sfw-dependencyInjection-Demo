package prasad.springframeork.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import prasad.springframeork.didemo.controller.ConstructorInjectedController;
import prasad.springframeork.didemo.controller.MyController;
import prasad.springframeork.didemo.controller.PropertyInjectionController;
import prasad.springframeork.didemo.controller.SetterInjectedController;
import prasad.springframeork.didemo.examplebeam.FakeDatasource;
import prasad.springframeork.didemo.examplebeam.FakejmsDatasource;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");
        //myController.hello();

       /* System.out.println(ctx.getBean(MyController.class).hello());
        System.out.println(ctx.getBean(PropertyInjectionController.class).sayhello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayhello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayhello()); */

        FakeDatasource fakeDatasource = (FakeDatasource) ctx.getBean(FakeDatasource.class);
        System.out.println(fakeDatasource.getUser());
        FakejmsDatasource fakejmsDatasource = (FakejmsDatasource) ctx.getBean(FakejmsDatasource.class);
        System.out.println(fakejmsDatasource.getUser());

    }

}
