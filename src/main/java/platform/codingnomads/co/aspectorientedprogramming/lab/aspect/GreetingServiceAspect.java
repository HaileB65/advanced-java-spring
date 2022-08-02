package platform.codingnomads.co.aspectorientedprogramming.lab.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import platform.codingnomads.co.aspectorientedprogramming.aop.aspect.LoggingAspect;

import java.util.logging.Logger;

@Aspect
@Component
public class GreetingServiceAspect {
    // Initialize the logger factory
    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(GreetingServiceAspect.class);

    // Advice before the Point-cut defined by executeLogging
    @Before(Pointcut(value = "execution(* platform.codingnomads.co.aspectorientedprogramming.lab.GreetingService.greeting())"))
    public void logMethodCall(JoinPoint joinPoint) {
        // Using StringBuilder to build the message that will be logged
        StringBuilder message = new StringBuilder("Before : ");
        message.append(joinPoint.getSignature().getName());
//        final Object[] args = joinPoint.getArgs();
//        if (args != null && args.length > 0) {
//            message.append("method args=|");
//            Arrays.asList(args).forEach(arg -> {
//                message.append("arg=").append(arg).append("|");
//            });
//        }
        LOGGER.info(message.toString());
    }
    @After(Pointcut(value = "execution(* platform.codingnomads.co.aspectorientedprogramming.lab.GreetingService.greeting())"))
    public void logMethodCall(JoinPoint joinPoint) {
        // Using StringBuilder to build the message that will be logged
        StringBuilder message = new StringBuilder("After : ");
        message.append(joinPoint.getSignature().getName());
//        final Object[] args = joinPoint.getArgs();
//        if (args != null && args.length > 0) {
//            message.append("method args=|");
//            Arrays.asList(args).forEach(arg -> {
//                message.append("arg=").append(arg).append("|");
//            });
//        }
        LOGGER.info(message.toString());
    }

    // Define the Point-cut expression
    @Pointcut("execution(* platform.codingnomads.co.aspectorientedprogramming.lab.GreetingService.greeting2())")
    public void executeLogging2() {
    }
    @Before("executeLogging2()")
    public void logMethodCall2(JoinPoint joinPoint) {
        // Using StringBuilder to build the message that will be logged
        StringBuilder message = new StringBuilder("Before greeting 2 : ");
        message.append(joinPoint.getSignature().getName());
//        final Object[] args = joinPoint.getArgs();
//        if (args != null && args.length > 0) {
//            message.append("method args=|");
//            Arrays.asList(args).forEach(arg -> {
//                message.append("arg=").append(arg).append("|");
//            });
//        }
        LOGGER.info(message.toString());
    }

}
