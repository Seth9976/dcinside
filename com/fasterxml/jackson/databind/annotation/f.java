package com.fasterxml.jackson.databind.annotation;

import com.fasterxml.jackson.annotation.a;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@a
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
public @interface f {
    public static class com.fasterxml.jackson.databind.annotation.f.a {
        public final String a;
        public final String b;

        public com.fasterxml.jackson.databind.annotation.f.a(f f0) {
            this(f0.buildMethodName(), f0.withPrefix());
        }

        public com.fasterxml.jackson.databind.annotation.f.a(String s, String s1) {
            this.a = s;
            this.b = s1;
        }
    }

    public static final String G0 = "build";
    public static final String H0 = "with";

    String buildMethodName() default "build";

    String withPrefix() default "with";
}

