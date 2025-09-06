package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@Immutable
@g
public final class BaselineShift {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        // 去混淆评级： 低(20)
        public final float a() [...] // 潜在的解密器

        @Stable
        public static void b() {
        }

        // 去混淆评级： 低(20)
        public final float c() {
            return -0.5f;
        }

        @Stable
        public static void d() {
        }

        // 去混淆评级： 低(20)
        public final float e() {
            return 0.5f;
        }

        @Stable
        public static void f() {
        }
    }

    private final float a;
    @l
    public static final Companion b;
    private static final float c;
    private static final float d;
    private static final float e;

    static {
        BaselineShift.b = new Companion(null);
        BaselineShift.c = 0.5f;
        BaselineShift.d = -0.5f;
        BaselineShift.e = 0.0f;
    }

    private BaselineShift(float f) {
        this.a = f;
    }

    public static final float a() [...] // 潜在的解密器

    public static final float b() [...] // 潜在的解密器

    public static final float c() [...] // 潜在的解密器

    public static final BaselineShift d(float f) {
        return new BaselineShift(f);
    }

    public static float e(float f) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return BaselineShift.f(this.a, object0);
    }

    public static boolean f(float f, Object object0) {
        return object0 instanceof BaselineShift ? Float.compare(f, ((BaselineShift)object0).k()) == 0 : false;
    }

    public static final boolean g(float f, float f1) {
        return Float.compare(f, f1) == 0;
    }

    public final float h() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return BaselineShift.i(this.a);
    }

    public static int i(float f) {
        return Float.floatToIntBits(f);
    }

    public static String j(float f) [...] // Inlined contents

    public final float k() {
        return this.a;
    }

    @Override
    public String toString() {
        return "BaselineShift(multiplier=" + this.a + ')';
    }
}

