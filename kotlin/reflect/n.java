package kotlin.reflect;

import kotlin.enums.d;
import kotlin.h0;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public interface n extends b {
    public static final class a {
        @h0(version = "1.1")
        public static void a() {
        }
    }

    public static enum kotlin.reflect.n.b {
        INSTANCE,
        EXTENSION_RECEIVER,
        VALUE;

        private static final kotlin.reflect.n.b[] d;
        private static final kotlin.enums.a e;

        static {
            kotlin.reflect.n.b.d = arr_n$b;
            L.p(arr_n$b, "entries");
            kotlin.reflect.n.b.e = new d(arr_n$b);
        }

        private static final kotlin.reflect.n.b[] a() [...] // Inlined contents

        @l
        public static kotlin.enums.a b() {
            return kotlin.reflect.n.b.e;
        }
    }

    int getIndex();

    @l
    kotlin.reflect.n.b getKind();

    @m
    String getName();

    @l
    s getType();

    boolean h();

    boolean i();
}

