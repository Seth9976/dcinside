package com.fasterxml.jackson.databind.annotation;

import com.fasterxml.jackson.annotation.a;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@a
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
public @interface com.fasterxml.jackson.databind.annotation.a {
    Class value();
}

