package androidx.room;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.k;
import s3.a;
import s3.b;
import s3.e;
import s3.f;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD})
@k(message = "Use @MapColumn instead.")
@e(a.b)
@f(allowedTargets = {b.i})
public @interface MapInfo {
    String keyColumn() default "";

    String keyTable() default "";

    String valueColumn() default "";

    String valueTable() default "";
}

