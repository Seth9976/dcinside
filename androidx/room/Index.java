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
public @interface Index {
    public static enum Order {
        ASC,
        DESC;

        private static final Order[] a() [...] // Inlined contents
    }

    String name() default "";

    Order[] orders() default {};

    boolean unique() default false;

    String[] value();
}

