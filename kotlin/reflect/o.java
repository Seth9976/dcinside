package kotlin.reflect;

import kotlin.h0;
import y4.l;

public interface o extends c {
    public interface a {
        @l
        o a();
    }

    public static final class b {
        @h0(version = "1.1")
        public static void a() {
        }

        @h0(version = "1.1")
        public static void b() {
        }
    }

    public interface kotlin.reflect.o.c extends i, a {
    }

    @l
    kotlin.reflect.o.c getGetter();

    boolean isConst();

    boolean isLateinit();
}

