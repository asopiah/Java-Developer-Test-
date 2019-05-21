package com.intellisoft.aspect;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Component
@Retention(RUNTIME)
@Target(ElementType.PARAMETER)
public @interface NullCheck {
}