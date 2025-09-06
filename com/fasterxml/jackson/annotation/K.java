package com.fasterxml.jackson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@a
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface k {
    public static enum com.fasterxml.jackson.annotation.k.a {
        DEFAULT,
        DELEGATING,
        PROPERTIES,
        DISABLED;

    }

    com.fasterxml.jackson.annotation.k.a mode() default com.fasterxml.jackson.annotation.k.a.a;
}

