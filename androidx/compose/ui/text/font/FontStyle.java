package androidx.compose.ui.text.font;

import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@g
public final class FontStyle {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        // 去混淆评级： 低(20)
        public final int a() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int b() [...] // 潜在的解密器

        // 去混淆评级： 低(40)
        @l
        public final List c() {
            return u.O(new FontStyle[]{FontStyle.c(0), FontStyle.c(1)});
        }
    }

    private final int a;
    @l
    public static final Companion b;
    private static final int c;
    private static final int d;

    static {
        FontStyle.b = new Companion(null);
        FontStyle.c = 0;
        FontStyle.d = 1;
    }

    private FontStyle(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final FontStyle c(int v) {
        return new FontStyle(v);
    }

    public static int d(int v) [...] // Inlined contents

    public static boolean e(int v, Object object0) {
        return object0 instanceof FontStyle ? v == ((FontStyle)object0).j() : false;
    }

    @Override
    public boolean equals(Object object0) {
        return FontStyle.e(this.a, object0);
    }

    public static final boolean f(int v, int v1) {
        return v == v1;
    }

    public final int g() {
        return this.a;
    }

    public static int h(int v) [...] // Inlined contents

    @Override
    public int hashCode() {
        return this.a;
    }

    @l
    public static String i(int v) {
        if(FontStyle.f(v, 0)) {
            return "Normal";
        }
        return FontStyle.f(v, 1) ? "Italic" : "Invalid";
    }

    public final int j() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return FontStyle.i(this.a);
    }
}

