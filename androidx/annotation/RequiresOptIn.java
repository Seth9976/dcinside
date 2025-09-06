package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import s3.a;
import s3.b;
import s3.e;
import s3.f;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.ANNOTATION_TYPE})
@e(a.b)
@f(allowedTargets = {b.b})
public @interface RequiresOptIn {
    public static enum Level {
        WARNING,
        ERROR;

        private static final Level[] a() [...] // Inlined contents
    }

    Level level() default Level.b;
}

