package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.enums.d;
import kotlin.jvm.internal.L;
import s3.a;
import s3.b;
import s3.e;
import s3.f;
import y4.l;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.ANNOTATION_TYPE})
@h0(version = "1.3")
@e(a.b)
@f(allowedTargets = {b.b})
public @interface d0 {
    public static enum kotlin.d0.a {
        WARNING,
        ERROR;

        private static final kotlin.d0.a[] c;
        private static final kotlin.enums.a d;

        static {
            kotlin.d0.a.c = arr_d0$a;
            L.p(arr_d0$a, "entries");
            kotlin.d0.a.d = new d(arr_d0$a);
        }

        private static final kotlin.d0.a[] a() [...] // Inlined contents

        @l
        public static kotlin.enums.a b() {
            return kotlin.d0.a.d;
        }
    }

    kotlin.d0.a level() default kotlin.d0.a.b;

    String message() default "";
}

