package platform.codingnomads.co.corespring.lab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoreLabConfig2 {
    @Bean
    public Dog dog() {
        return new Dog("Rex", "German Shepard");
    }

}
