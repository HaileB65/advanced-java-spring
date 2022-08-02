package platform.codingnomads.co.corespring.lab;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import platform.codingnomads.co.corespring.lab.complete.CoreLabConfig;

@SpringBootApplication
public class CoreLabApplication2 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(CoreLabConfig.class);
        Dog dog1 = ctx.getBean(Dog.class);
        System.out.println("Dog name and bread: " + dog1.getName() + " " +
                dog1.getBread());

        ApplicationContext context =
                new ClassPathXmlApplicationContext("xml-config/CoreLab_configuration.xml");
        Pet pet = context.getBean(Pet.class);
        System.out.println(pet.printOutPets());

    }

}
