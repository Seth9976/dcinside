package org.intellij.lang.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.PARAMETER, ElementType.METHOD})
public @interface a {
    public static final String A2 = "The return value of this method";
    public static final String B2 = "this";
    public static final String x2 = "The method argument (if parameter was annotated) or this container (if instance method was annotated)";
    public static final String y2 = "this";
    public static final String z2 = "This container (if the parameter was annotated) or the return value (if instance method was annotated)";

    String source() default "The method argument (if parameter was annotated) or this container (if instance method was annotated)";

    boolean sourceIsContainer() default false;

    String target() default "This container (if the parameter was annotated) or the return value (if instance method was annotated)";

    boolean targetIsContainer() default false;
}

