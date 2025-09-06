package androidx.annotation.experimental;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.c0;
import kotlin.k;
import s3.a;
import s3.b;
import s3.e;
import s3.f;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.ANNOTATION_TYPE})
@k(message = "This annotation has been replaced by `@RequiresOptIn`", replaceWith = @c0(expression = "RequiresOptIn", imports = {"androidx.annotation.RequiresOptIn"}))
@e(a.b)
@f(allowedTargets = {b.b})
public @interface Experimental {
    public static enum Level {
        WARNING,
        ERROR;

        private static final Level[] a() [...] // Inlined contents
    }

    Level level() default Level.b;
}

