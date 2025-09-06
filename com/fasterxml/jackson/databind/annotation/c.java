package com.fasterxml.jackson.databind.annotation;

import com.fasterxml.jackson.annotation.a;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@a
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
public @interface c {
    public @interface com.fasterxml.jackson.databind.annotation.c.a {
        com.fasterxml.jackson.annotation.u.a include() default com.fasterxml.jackson.annotation.u.a.b;

        String propName() default "";

        String propNamespace() default "";

        boolean required() default false;

        String value();
    }

    public @interface b {
        com.fasterxml.jackson.annotation.u.a include() default com.fasterxml.jackson.annotation.u.a.b;

        String name() default "";

        String namespace() default "";

        boolean required() default false;

        Class type() default Object.class;

        Class value();
    }

    com.fasterxml.jackson.databind.annotation.c.a[] attrs() default {};

    boolean prepend() default false;

    b[] props() default {};
}

