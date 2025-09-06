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
@h0(version = "1.4")
@c
@f(allowedTargets = {b.a, b.i, b.d, b.b, b.h, b.k, b.j, b.o})
public @interface l {
    String errorSince() default "";

    String hiddenSince() default "";

    String warningSince() default "";
}

