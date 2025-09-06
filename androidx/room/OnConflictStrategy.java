package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.k;
import s3.a;
import s3.e;
import y4.l;

@Retention(RetentionPolicy.CLASS)
@e(a.b)
public @interface OnConflictStrategy {
    public static final class Companion {
        static final Companion a = null;
        public static final int b = 0;
        public static final int c = 1;
        public static final int d = 2;
        public static final int e = 3;
        public static final int f = 4;
        public static final int g = 5;

        static {
            Companion.a = new Companion();
        }

        @k(message = "Use ABORT instead.")
        public static void a() {
        }

        @k(message = "Use ABORT instead.")
        public static void b() {
        }
    }

    @l
    public static final Companion D = null;
    public static final int E = 0;
    public static final int F = 1;
    public static final int H = 2;
    public static final int I = 3;
    public static final int J = 4;
    public static final int K = 5;

    static {
        OnConflictStrategy.D = Companion.a;
    }
}

