package com.fasterxml.jackson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@a
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
public @interface z {
    public static enum com.fasterxml.jackson.annotation.z.a {
        AUTO,
        READ_ONLY,
        WRITE_ONLY,
        READ_WRITE;

    }

    public static final String E0 = "";
    public static final int F0 = -1;

    com.fasterxml.jackson.annotation.z.a access() default com.fasterxml.jackson.annotation.z.a.a;

    String defaultValue() default "";

    int index() default -1;

    String namespace() default "";

    boolean required() default false;

    String value() default "";
}

