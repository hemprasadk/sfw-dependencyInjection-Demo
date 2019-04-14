package prasad.springframeork.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import prasad.springframeork.didemo.controller.ConstructorInjectedController;
import prasad.springframeork.didemo.controller.MyController;
import prasad.springframeork.didemo.controller.PropertyInjectionController;
import prasad.springframeork.didemo.controller.SetterInjectedController;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");
        myController.hello();

        System.out.println(ctx.getBean(PropertyInjectionController.class).sayhello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayhello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayhello());
    }

}
