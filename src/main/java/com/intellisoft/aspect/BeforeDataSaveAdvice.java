package com.intellisoft.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Aspect
@Configuration
public class BeforeDataSaveAdvice {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    //What kind of method calls I would intercept
    //execution(* PACKAGE.*.*(..))
    //Weaving & Weaver
    @Before("execution(* com.intellisoft.*.*(..))")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void before(JoinPoint joinPoint) {
        //Advice go here

        logger.info(" check for paramters validation ");
        logger.info(" Allowed execution for {}", joinPoint);
    }
}