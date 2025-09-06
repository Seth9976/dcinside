package com.fasterxml.jackson.databind.annotation;

import com.fasterxml.jackson.annotation.a;
import com.fasterxml.jackson.databind.D;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@a
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
public @interface e {
    Class value() default D.class;
}

