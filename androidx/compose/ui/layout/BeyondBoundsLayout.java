package androidx.compose.ui.layout;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.g;

public interface BeyondBoundsLayout {
    public interface BeyondBoundsScope {
        boolean a();
    }

    @g
    public static final class LayoutDirection {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            // 去混淆评级： 低(20)
            public final int a() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int b() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int c() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int d() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int e() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int f() [...] // 潜在的解密器
        }

        private final int a;
        @l
        public static final Companion b;
        private static final int c;
        private static final int d;
        private static final int e;
        private static final int f;
        private static final int g;
        private static final int h;

        static {
            LayoutDirection.b = new Companion(null);
            LayoutDirection.c = 1;
            LayoutDirection.d = 2;
            LayoutDirection.e = 3;
            LayoutDirection.f = 4;
            LayoutDirection.g = 5;
            LayoutDirection.h = 6;
        }

        private LayoutDirection(int v) {
            this.a = v;
        }

        public static final int a() [...] // 潜在的解密器

        public static final int b() [...] // 潜在的解密器

        public static final int c() [...] // 潜在的解密器

        public static final int d() [...] // 潜在的解密器

        public static final int e() [...] // 潜在的解密器

        @Override
        public boolean equals(Object object0) {
            return LayoutDirection.i(this.a, object0);
        }

        public static final int f() [...] // 潜在的解密器

        public static final LayoutDirection g(int v) {
            return new LayoutDirection(v);
        }

        public static int h(int v) [...] // Inlined contents

        @Override
        public int hashCode() {
            return this.a;
        }

        public static boolean i(int v, Object object0) {
            return object0 instanceof LayoutDirection ? v == ((LayoutDirection)object0).m() : false;
        }

        public static final boolean j(int v, int v1) {
            return v == v1;
        }

        public static int k(int v) [...] // Inlined contents

        @l
        public static String l(int v) {
            if(LayoutDirection.j(v, LayoutDirection.c)) {
                return "Before";
            }
            if(LayoutDirection.j(v, LayoutDirection.d)) {
                return "After";
            }
            if(LayoutDirection.j(v, LayoutDirection.e)) {
                return "Left";
            }
            if(LayoutDirection.j(v, LayoutDirection.f)) {
                return "Right";
            }
            if(LayoutDirection.j(v, LayoutDirection.g)) {
                return "Above";
            }
            return LayoutDirection.j(v, LayoutDirection.h) ? "Below" : "invalid LayoutDirection";
        }

        public final int m() {
            return this.a;
        }

        @Override
        @l
        public String toString() {
            return LayoutDirection.l(this.a);
        }
    }

    @m
    Object a(int arg1, @l Function1 arg2);
}

