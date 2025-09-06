package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import s3.a;
import s3.b;
import s3.c;
import s3.e;
import s3.f;
import y4.l;

@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@c
@e(a.b)
@f(allowedTargets = {b.i, b.j, b.k, b.g, b.e, b.f, b.b})
public @interface Dimension {
    public static final class Companion {
        static final Companion a = null;
        public static final int b = 0;
        public static final int c = 1;
        public static final int d = 2;

        static {
            Companion.a = new Companion();
        }
    }

    @l
    public static final Companion a = null;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;

    static {
        Dimension.a = Companion.a;
    }

    int unit() default 1;
}

