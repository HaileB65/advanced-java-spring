package platform.codingnomads.co.aspectorientedprogramming.lab.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Aspect
@Component
public class PrintableAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(PrintableAspect.class);

    // Inform Java that the annotation you are creating can only be used to annotate methods
    @Target(ElementType.METHOD)
// Make your new annotation available in the JVM throughout runtime
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Printable {

    }
    @Pointcut("@annotation(Printable)")
    public void executeLogging3() {
    }

    @Before("executeLogging2()")
    public void logMethodCall3(JoinPoint joinPoint) {
        // Using StringBuilder to build the message that will be logged
        StringBuilder message = new StringBuilder("Hello! : ");
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
