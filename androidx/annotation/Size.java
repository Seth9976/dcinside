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
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@c
@e(a.b)
@f(allowedTargets = {b.g, b.f, b.i, b.j, b.k, b.e, b.b})
public @interface Size {
    long max() default 0x7FFFFFFFFFFFFFFFL;

    long min() default 0x8000000000000000L;

    long multiple() default 1L;

    long value() default -1L;
}

