package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import s3.a;
import s3.b;
import s3.c;
import s3.e;
import s3.f;

@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.PACKAGE})
@c
@e(a.b)
@f(allowedTargets = {b.b, b.a, b.i, b.j, b.k, b.h, b.e, b.n})
public @interface RequiresApi {
    int api() default 1;

    int value() default 1;
}

