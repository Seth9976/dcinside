package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@Immutable
@g
public final class ClipOp {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        // 去混淆评级： 低(20)
        public final int a() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int b() [...] // 潜在的解密器
    }

    private final int a;
    @l
    public static final Companion b;
    private static final int c;
    private static final int d;

    static {
        ClipOp.b = new Companion(null);
        ClipOp.c = 0;
        ClipOp.d = 1;
    }

    private ClipOp(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final ClipOp c(int v) {
        return new ClipOp(v);
    }

    public static int d(int v) [...] // Inlined contents

    public static boolean e(int v, Object object0) {
        return object0 instanceof ClipOp ? v == ((ClipOp)object0).i() : false;
    }

    @Override
    public boolean equals(Object object0) {
        return ClipOp.e(this.a, object0);
    }

    public static final boolean f(int v, int v1) {
        return v == v1;
    }

    public static int g(int v) [...] // Inlined contents

    @l
    public static String h(int v) {
        if(ClipOp.f(v, ClipOp.c)) {
            return "Difference";
        }
        return ClipOp.f(v, 1) ? "Intersect" : "Unknown";
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    public final int i() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return ClipOp.h(this.a);
    }
}

