package org.mp4parser.aj.lang.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SuppressAjWarnings {
    String[] value() default {""};
}

