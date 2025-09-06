package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@Immutable
@g
public final class PathOperation {
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
    }

    private final int a;
    @l
    public static final Companion b;
    private static final int c;
    private static final int d;
    private static final int e;
    private static final int f;
    private static final int g;

    static {
        PathOperation.b = new Companion(null);
        PathOperation.c = 0;
        PathOperation.d = 1;
        PathOperation.e = 2;
        PathOperation.f = 3;
        PathOperation.g = 4;
    }

    private PathOperation(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final int c() [...] // 潜在的解密器

    public static final int d() [...] // 潜在的解密器

    public static final int e() [...] // 潜在的解密器

    @Override
    public boolean equals(Object object0) {
        return PathOperation.h(this.a, object0);
    }

    public static final PathOperation f(int v) {
        return new PathOperation(v);
    }

    public static int g(int v) [...] // Inlined contents

    public static boolean h(int v, Object object0) {
        return object0 instanceof PathOperation ? v == ((PathOperation)object0).l() : false;
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    public static final boolean i(int v, int v1) {
        return v == v1;
    }

    public static int j(int v) [...] // Inlined contents

    @l
    public static String k(int v) {
        if(PathOperation.i(v, 0)) {
            return "Difference";
        }
        if(PathOperation.i(v, PathOperation.d)) {
            return "Intersect";
        }
        if(PathOperation.i(v, PathOperation.e)) {
            return "Union";
        }
        if(PathOperation.i(v, PathOperation.f)) {
            return "Xor";
        }
        return PathOperation.i(v, PathOperation.g) ? "ReverseDifference" : "Unknown";
    }

    public final int l() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return PathOperation.k(this.a);
    }
}

