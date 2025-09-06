package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@Immutable
@g
public final class PointMode {
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
    }

    private final int a;
    @l
    public static final Companion b;
    private static final int c;
    private static final int d;
    private static final int e;

    static {
        PointMode.b = new Companion(null);
        PointMode.c = 0;
        PointMode.d = 1;
        PointMode.e = 2;
    }

    private PointMode(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final int c() [...] // 潜在的解密器

    public static final PointMode d(int v) {
        return new PointMode(v);
    }

    public static int e(int v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return PointMode.f(this.a, object0);
    }

    public static boolean f(int v, Object object0) {
        return object0 instanceof PointMode ? v == ((PointMode)object0).j() : false;
    }

    public static final boolean g(int v, int v1) {
        return v == v1;
    }

    public static int h(int v) [...] // Inlined contents

    @Override
    public int hashCode() {
        return this.a;
    }

    @l
    public static String i(int v) {
        if(PointMode.g(v, PointMode.c)) {
            return "Points";
        }
        if(PointMode.g(v, PointMode.d)) {
            return "Lines";
        }
        return PointMode.g(v, PointMode.e) ? "Polygon" : "Unknown";
    }

    public final int j() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return PointMode.i(this.a);
    }
}

