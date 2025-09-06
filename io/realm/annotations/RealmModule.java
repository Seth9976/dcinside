package io.realm.annotations;

import h3.h;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface RealmModule {
    boolean allClasses() default false;

    h classNamingPolicy() default h.a;

    Class[] classes() default {};

    h fieldNamingPolicy() default h.a;

    boolean library() default false;
}

