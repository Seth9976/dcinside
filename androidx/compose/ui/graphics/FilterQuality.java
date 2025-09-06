package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@Immutable
@g
public final class FilterQuality {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        // 去混淆评级： 低(20)
        public final int a() {
            return 3;
        }

        // 去混淆评级： 低(20)
        public final int b() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int c() {
            return 2;
        }

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
        FilterQuality.b = new Companion(null);
        FilterQuality.c = 0;
        FilterQuality.d = 1;
        FilterQuality.e = 2;
        FilterQuality.f = 3;
    }

    private FilterQuality(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final int c() [...] // 潜在的解密器

    public static final int d() [...] // 潜在的解密器

    public static final FilterQuality e(int v) {
        return new FilterQuality(v);
    }

    @Override
    public boolean equals(Object object0) {
        return FilterQuality.g(this.a, object0);
    }

    public static int f(int v) [...] // Inlined contents

    public static boolean g(int v, Object object0) {
        return object0 instanceof FilterQuality ? v == ((FilterQuality)object0).l() : false;
    }

    public static final boolean h(int v, int v1) {
        return v == v1;
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    public final int i() {
        return this.a;
    }

    public static int j(int v) [...] // Inlined contents

    @l
    public static String k(int v) {
        if(FilterQuality.h(v, FilterQuality.c)) {
            return "None";
        }
        if(FilterQuality.h(v, 1)) {
            return "Low";
        }
        if(FilterQuality.h(v, FilterQuality.e)) {
            return "Medium";
        }
        return FilterQuality.h(v, FilterQuality.f) ? "High" : "Unknown";
    }

    public final int l() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return FilterQuality.k(this.a);
    }
}

