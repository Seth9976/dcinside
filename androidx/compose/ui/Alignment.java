package androidx.compose.ui;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.LayoutDirection;
import y4.l;

@Stable
public interface Alignment {
    public static final class Companion {
        static final Companion a;
        @l
        private static final Alignment b;
        @l
        private static final Alignment c;
        @l
        private static final Alignment d;
        @l
        private static final Alignment e;
        @l
        private static final Alignment f;
        @l
        private static final Alignment g;
        @l
        private static final Alignment h;
        @l
        private static final Alignment i;
        @l
        private static final Alignment j;
        @l
        private static final Vertical k;
        @l
        private static final Vertical l;
        @l
        private static final Vertical m;
        @l
        private static final Horizontal n;
        @l
        private static final Horizontal o;
        @l
        private static final Horizontal p;

        static {
            Companion.a = new Companion();
            Companion.b = new BiasAlignment(-1.0f, -1.0f);
            Companion.c = new BiasAlignment(0.0f, -1.0f);
            Companion.d = new BiasAlignment(1.0f, -1.0f);
            Companion.e = new BiasAlignment(-1.0f, 0.0f);
            Companion.f = new BiasAlignment(0.0f, 0.0f);
            Companion.g = new BiasAlignment(1.0f, 0.0f);
            Companion.h = new BiasAlignment(-1.0f, 1.0f);
            Companion.i = new BiasAlignment(0.0f, 1.0f);
            Companion.j = new BiasAlignment(1.0f, 1.0f);
            Companion.k = new androidx.compose.ui.BiasAlignment.Vertical(-1.0f);
            Companion.l = new androidx.compose.ui.BiasAlignment.Vertical(0.0f);
            Companion.m = new androidx.compose.ui.BiasAlignment.Vertical(1.0f);
            Companion.n = new androidx.compose.ui.BiasAlignment.Horizontal(-1.0f);
            Companion.o = new androidx.compose.ui.BiasAlignment.Horizontal(0.0f);
            Companion.p = new androidx.compose.ui.BiasAlignment.Horizontal(1.0f);
        }

        @l
        public final Alignment A() {
            return Companion.d;
        }

        @Stable
        public static void B() {
        }

        @l
        public final Alignment C() {
            return Companion.b;
        }

        @Stable
        public static void D() {
        }

        @l
        public final Vertical a() {
            return Companion.m;
        }

        @Stable
        public static void b() {
        }

        @l
        public final Alignment c() {
            return Companion.i;
        }

        @Stable
        public static void d() {
        }

        @l
        public final Alignment e() {
            return Companion.j;
        }

        @Stable
        public static void f() {
        }

        @l
        public final Alignment g() {
            return Companion.h;
        }

        @Stable
        public static void h() {
        }

        @l
        public final Alignment i() {
            return Companion.f;
        }

        @Stable
        public static void j() {
        }

        @l
        public final Alignment k() {
            return Companion.g;
        }

        @Stable
        public static void l() {
        }

        @l
        public final Horizontal m() {
            return Companion.o;
        }

        @Stable
        public static void n() {
        }

        @l
        public final Alignment o() {
            return Companion.e;
        }

        @Stable
        public static void p() {
        }

        @l
        public final Vertical q() {
            return Companion.l;
        }

        @Stable
        public static void r() {
        }

        @l
        public final Horizontal s() {
            return Companion.p;
        }

        @Stable
        public static void t() {
        }

        @l
        public final Horizontal u() {
            return Companion.n;
        }

        @Stable
        public static void v() {
        }

        @l
        public final Vertical w() {
            return Companion.k;
        }

        @Stable
        public static void x() {
        }

        @l
        public final Alignment y() {
            return Companion.c;
        }

        @Stable
        public static void z() {
        }
    }

    @Stable
    public interface Horizontal {
        int a(int arg1, int arg2, @l LayoutDirection arg3);
    }

    @Stable
    public interface Vertical {
        int a(int arg1, int arg2);
    }

    @l
    public static final Companion a;

    static {
        Alignment.a = Companion.a;
    }

    long a(long arg1, long arg2, @l LayoutDirection arg3);
}

