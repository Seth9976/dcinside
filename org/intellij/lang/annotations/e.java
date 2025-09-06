package org.intellij.lang.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import y4.k;

@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE, ElementType.METHOD})
public @interface e {
    long[] flags() default {};

    Class flagsFromClass() default void.class;

    long[] intValues() default {};

    @k
    String[] stringValues() default {};

    Class valuesFromClass() default void.class;
}

