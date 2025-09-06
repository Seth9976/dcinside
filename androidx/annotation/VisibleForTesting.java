package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import s3.a;
import s3.c;
import s3.e;
import y4.l;

@Documented
@Retention(RetentionPolicy.CLASS)
@c
@e(a.b)
public @interface VisibleForTesting {
    public static final class Companion {
        static final Companion a = null;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        public static final int e = 5;

        static {
            Companion.a = new Companion();
        }
    }

    @l
    public static final Companion e = null;
    public static final int f = 2;
    public static final int g = 3;
    public static final int h = 4;
    public static final int i = 5;

    static {
        VisibleForTesting.e = Companion.a;
    }

    int otherwise() default 2;
}

