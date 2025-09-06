package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@Immutable
@g
public final class TileMode {
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
    }

    private final int a;
    @l
    public static final Companion b;
    private static final int c;
    private static final int d;
    private static final int e;
    private static final int f;

    static {
        TileMode.b = new Companion(null);
        TileMode.c = 0;
        TileMode.d = 1;
        TileMode.e = 2;
        TileMode.f = 3;
    }

    private TileMode(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final int c() [...] // 潜在的解密器

    public static final int d() [...] // 潜在的解密器

    public static final TileMode e(int v) {
        return new TileMode(v);
    }

    @Override
    public boolean equals(Object object0) {
        return TileMode.g(this.a, object0);
    }

    public static int f(int v) [...] // Inlined contents

    public static boolean g(int v, Object object0) {
        return object0 instanceof TileMode ? v == ((TileMode)object0).k() : false;
    }

    public static final boolean h(int v, int v1) {
        return v == v1;
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    public static int i(int v) [...] // Inlined contents

    @l
    public static String j(int v) {
        if(TileMode.h(v, 0)) {
            return "Clamp";
        }
        if(TileMode.h(v, TileMode.d)) {
            return "Repeated";
        }
        if(TileMode.h(v, TileMode.e)) {
            return "Mirror";
        }
        return TileMode.h(v, 3) ? "Decal" : "Unknown";
    }

    public final int k() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return TileMode.j(this.a);
    }
}

