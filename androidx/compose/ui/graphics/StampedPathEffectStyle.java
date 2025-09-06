package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@Immutable
@g
public final class StampedPathEffectStyle {
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
        StampedPathEffectStyle.b = new Companion(null);
        StampedPathEffectStyle.c = 0;
        StampedPathEffectStyle.d = 1;
        StampedPathEffectStyle.e = 2;
    }

    private StampedPathEffectStyle(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final int c() [...] // 潜在的解密器

    public static final StampedPathEffectStyle d(int v) {
        return new StampedPathEffectStyle(v);
    }

    public static int e(int v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return StampedPathEffectStyle.f(this.a, object0);
    }

    public static boolean f(int v, Object object0) {
        return object0 instanceof StampedPathEffectStyle ? v == ((StampedPathEffectStyle)object0).j() : false;
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
        if(StampedPathEffectStyle.g(v, StampedPathEffectStyle.c)) {
            return "Translate";
        }
        if(StampedPathEffectStyle.g(v, StampedPathEffectStyle.d)) {
            return "Rotate";
        }
        return StampedPathEffectStyle.g(v, StampedPathEffectStyle.e) ? "Morph" : "Unknown";
    }

    public final int j() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return StampedPathEffectStyle.i(this.a);
    }
}

