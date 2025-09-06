package kotlin;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import s3.b;
import s3.c;
import s3.f;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@c
@f(allowedTargets = {b.a, b.i, b.d, b.b, b.h, b.k, b.j, b.o})
public @interface k {
    m level() default m.a;

    String message();

    c0 replaceWith() default @c0(expression = "", imports = {});
}

