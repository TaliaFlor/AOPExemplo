package aop.aspect;

import aop.annotation.LogAction;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.stream.Collectors;

@Aspect
@Component
public class LogActionAspect {

    @Before("@annotation(logAction)")
    public void logAction(JoinPoint joinPoint, LogAction logAction) {
        String msg = logAction.msg();
        if (logAction.logParam()) {
            msg += getValoresParam(joinPoint);
        }
        System.out.println(msg);
    }

    private String getValoresParam(JoinPoint joinPoint) {
        return Arrays.stream(joinPoint.getArgs())
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

}
