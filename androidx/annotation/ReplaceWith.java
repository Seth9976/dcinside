package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import s3.b;
import s3.f;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR})
@f(allowedTargets = {b.i, b.e, b.h})
public @interface ReplaceWith {
    String expression();

    String[] imports() default {};
}

