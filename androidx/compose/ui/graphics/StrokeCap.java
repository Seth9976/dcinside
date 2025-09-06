package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@Immutable
@g
public final class StrokeCap {
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
        StrokeCap.b = new Companion(null);
        StrokeCap.c = 0;
        StrokeCap.d = 1;
        StrokeCap.e = 2;
    }

    private StrokeCap(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final int c() [...] // 潜在的解密器

    public static final StrokeCap d(int v) {
        return new StrokeCap(v);
    }

    public static int e(int v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return StrokeCap.f(this.a, object0);
    }

    public static boolean f(int v, Object object0) {
        return object0 instanceof StrokeCap ? v == ((StrokeCap)object0).j() : false;
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
        if(StrokeCap.g(v, 0)) {
            return "Butt";
        }
        if(StrokeCap.g(v, StrokeCap.d)) {
            return "Round";
        }
        return StrokeCap.g(v, StrokeCap.e) ? "Square" : "Unknown";
    }

    public final int j() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return StrokeCap.i(this.a);
    }
}

