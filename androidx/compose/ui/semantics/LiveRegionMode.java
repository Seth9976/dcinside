package androidx.compose.ui.semantics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@Immutable
@g
public final class LiveRegionMode {
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
        LiveRegionMode.b = new Companion(null);
        LiveRegionMode.c = 0;
        LiveRegionMode.d = 1;
    }

    private LiveRegionMode(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final LiveRegionMode c(int v) {
        return new LiveRegionMode(v);
    }

    private static int d(int v) [...] // Inlined contents

    public static boolean e(int v, Object object0) {
        return object0 instanceof LiveRegionMode ? v == ((LiveRegionMode)object0).i() : false;
    }

    @Override
    public boolean equals(Object object0) {
        return LiveRegionMode.e(this.a, object0);
    }

    public static final boolean f(int v, int v1) {
        return v == v1;
    }

    public static int g(int v) [...] // Inlined contents

    @l
    public static String h(int v) {
        if(LiveRegionMode.f(v, LiveRegionMode.c)) {
            return "Polite";
        }
        return LiveRegionMode.f(v, LiveRegionMode.d) ? "Assertive" : "Unknown";
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
        return LiveRegionMode.h(this.a);
    }
}

