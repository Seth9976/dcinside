package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import s3.a;
import s3.b;
import s3.e;
import s3.f;

@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@e(a.a)
@f(allowedTargets = {b.a, b.b, b.c, b.d, b.e, b.f, b.g, b.h, b.i, b.j, b.k, b.l, b.m, b.n, b.o})
public @interface m0 {
    String[] names();
}

