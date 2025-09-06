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
@Target({ElementType.METHOD})
@c
@e(a.b)
@f(allowedTargets = {b.i, b.j, b.k})
public @interface CheckResult {
    String suggest() default "";
}

