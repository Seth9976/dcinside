package com.fasterxml.jackson.databind.annotation;

import com.fasterxml.jackson.annotation.a;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@a
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
public @interface g {
    @Deprecated
    public static enum com.fasterxml.jackson.databind.annotation.g.a {
        ALWAYS,
        NON_NULL,
        NON_DEFAULT,
        NON_EMPTY,
        DEFAULT_INCLUSION;

    }

    public static enum b {
        DYNAMIC,
        STATIC,
        DEFAULT_TYPING;

    }

    Class as() default Void.class;

    Class contentAs() default Void.class;

    Class contentConverter() default com.fasterxml.jackson.databind.util.j.a.class;

    Class contentUsing() default com.fasterxml.jackson.databind.r.a.class;

    Class converter() default com.fasterxml.jackson.databind.util.j.a.class;

    @Deprecated
    com.fasterxml.jackson.databind.annotation.g.a include() default com.fasterxml.jackson.databind.annotation.g.a.e;

    Class keyAs() default Void.class;

    Class keyUsing() default com.fasterxml.jackson.databind.r.a.class;

    Class nullsUsing() default com.fasterxml.jackson.databind.r.a.class;

    b typing() default b.c;

    Class using() default com.fasterxml.jackson.databind.r.a.class;
}

