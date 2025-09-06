package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import s3.a;
import s3.e;
import s3.f;
import y4.l;

@Retention(RetentionPolicy.CLASS)
@Target({})
@e(a.b)
@f(allowedTargets = {})
public @interface ForeignKey {
    @Retention(RetentionPolicy.CLASS)
    @e(a.b)
    public @interface Action {
    }

    public static final class Companion {
        static final Companion a = null;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        public static final int e = 4;
        public static final int f = 5;

        static {
            Companion.a = new Companion();
        }
    }

    public static final int A = 3;
    public static final int B = 4;
    public static final int C = 5;
    @l
    public static final Companion x = null;
    public static final int y = 1;
    public static final int z = 2;

    static {
        ForeignKey.x = Companion.a;
    }

    String[] childColumns();

    boolean deferred() default false;

    Class entity();

    @Action
    int onDelete() default 1;

    @Action
    int onUpdate() default 1;

    String[] parentColumns();
}

