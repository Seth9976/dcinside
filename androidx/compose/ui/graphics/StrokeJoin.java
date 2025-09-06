package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@Immutable
@g
public final class StrokeJoin {
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
        StrokeJoin.b = new Companion(null);
        StrokeJoin.c = 0;
        StrokeJoin.d = 1;
        StrokeJoin.e = 2;
    }

    private StrokeJoin(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final int c() [...] // 潜在的解密器

    public static final StrokeJoin d(int v) {
        return new StrokeJoin(v);
    }

    public static int e(int v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return StrokeJoin.f(this.a, object0);
    }

    public static boolean f(int v, Object object0) {
        return object0 instanceof StrokeJoin ? v == ((StrokeJoin)object0).j() : false;
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
        if(StrokeJoin.g(v, 0)) {
            return "Miter";
        }
        if(StrokeJoin.g(v, StrokeJoin.d)) {
            return "Round";
        }
        return StrokeJoin.g(v, StrokeJoin.e) ? "Bevel" : "Unknown";
    }

    public final int j() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return StrokeJoin.i(this.a);
    }
}

