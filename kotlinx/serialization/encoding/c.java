package kotlinx.serialization.encoding;

import kotlin.jvm.internal.L;
import kotlinx.serialization.d;
import kotlinx.serialization.descriptors.f;
import y4.l;
import y4.m;

public interface c {
    public static final class a {
        static final a a = null;
        public static final int b = -1;
        public static final int c = -3;

        static {
            a.a = new a();
        }
    }

    public static final class b {
        public static int a(@l c c0, @l f f0) {
            L.p(f0, "descriptor");
            return -1;
        }

        public static Object b(c c0, f f0, int v, d d0, Object object0, int v1, Object object1) {
            if(object1 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeNullableSerializableElement");
            }
            if((v1 & 8) != 0) {
                object0 = null;
            }
            return c0.j(f0, v, d0, object0);
        }

        @kotlinx.serialization.f
        public static boolean c(@l c c0) [...] // Inlined contents

        public static Object d(c c0, f f0, int v, d d0, Object object0, int v1, Object object1) {
            if(object1 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
            }
            if((v1 & 8) != 0) {
                object0 = null;
            }
            return c0.p(f0, v, d0, object0);
        }
    }

    @l
    public static final a a = null;
    public static final int b = -1;
    public static final int c = -3;

    static {
        c.a = a.a;
    }

    byte B(@l f arg1, int arg2);

    boolean C(@l f arg1, int arg2);

    short E(@l f arg1, int arg2);

    double F(@l f arg1, int arg2);

    @l
    kotlinx.serialization.modules.f a();

    void c(@l f arg1);

    long e(@l f arg1, int arg2);

    int f(@l f arg1, int arg2);

    @l
    String i(@l f arg1, int arg2);

    @kotlinx.serialization.f
    @m
    Object j(@l f arg1, int arg2, @l d arg3, @m Object arg4);

    @kotlinx.serialization.f
    boolean k();

    @l
    e l(@l f arg1, int arg2);

    Object p(@l f arg1, int arg2, @l d arg3, @m Object arg4);

    char r(@l f arg1, int arg2);

    int v(@l f arg1);

    int w(@l f arg1);

    float z(@l f arg1, int arg2);
}

