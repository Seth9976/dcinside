package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@Immutable
@g
public final class PathFillType {
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
        PathFillType.b = new Companion(null);
        PathFillType.c = 0;
        PathFillType.d = 1;
    }

    private PathFillType(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final PathFillType c(int v) {
        return new PathFillType(v);
    }

    public static int d(int v) [...] // Inlined contents

    public static boolean e(int v, Object object0) {
        return object0 instanceof PathFillType ? v == ((PathFillType)object0).i() : false;
    }

    @Override
    public boolean equals(Object object0) {
        return PathFillType.e(this.a, object0);
    }

    public static final boolean f(int v, int v1) {
        return v == v1;
    }

    public static int g(int v) [...] // Inlined contents

    @l
    public static String h(int v) {
        if(PathFillType.f(v, PathFillType.c)) {
            return "NonZero";
        }
        return PathFillType.f(v, PathFillType.d) ? "EvenOdd" : "Unknown";
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
        return PathFillType.h(this.a);
    }
}

