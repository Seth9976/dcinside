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
public @interface BuiltInTypeConverters {
    public static enum State {
        ENABLED,
        DISABLED,
        INHERITED;

        private static final State[] a() [...] // Inlined contents
    }

    State byteBuffer() default State.c;

    State enums() default State.c;

    State uuid() default State.c;
}

