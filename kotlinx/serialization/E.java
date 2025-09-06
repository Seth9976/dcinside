package kotlinx.serialization;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import s3.b;

@Retention(RetentionPolicy.RUNTIME)
@Target({})
@f
@s3.f(allowedTargets = {b.d})
public @interface e {
    @f
    public static enum a {
        ALWAYS,
        NEVER;

        private static final a[] a() [...] // Inlined contents
    }

    a mode() default a.a;
}

