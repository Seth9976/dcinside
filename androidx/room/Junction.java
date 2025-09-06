package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import s3.a;
import s3.e;
import s3.f;

@Retention(RetentionPolicy.CLASS)
@Target({})
@e(a.b)
@f(allowedTargets = {})
public @interface Junction {
    String entityColumn() default "";

    String parentColumn() default "";

    Class value();
}

