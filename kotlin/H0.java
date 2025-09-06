package kotlin;

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
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR})
@c
@e(a.b)
@f(allowedTargets = {b.a, b.d, b.e, b.h, b.i, b.j, b.k, b.o})
public @interface h0 {
    String version();
}

