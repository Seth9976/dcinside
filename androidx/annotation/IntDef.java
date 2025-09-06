package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import s3.a;
import s3.b;
import s3.e;
import s3.f;

@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.ANNOTATION_TYPE})
@e(a.a)
@f(allowedTargets = {b.b})
public @interface IntDef {
    boolean flag() default false;

    boolean open() default false;

    int[] value() default {};
}

