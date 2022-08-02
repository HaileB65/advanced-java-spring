package platform.codingnomads.co.aspectorientedprogramming.lab.service;

import org.springframework.stereotype.Service;
import platform.codingnomads.co.aspectorientedprogramming.lab.aspect.PrintableAspect;

@Service
public class GreetingService {

    public String greeting() {
        return "Hello Spring Developer!";
    }

    @PrintableAspect.Printable
    public String greeting2() {
        return "Welcome Back!";
    }
}
