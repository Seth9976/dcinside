package androidx.compose.ui.text.style;

import androidx.compose.foundation.c;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.ExperimentalTextApi;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.g;

@Immutable
@ExperimentalTextApi
public final class TextMotion {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final TextMotion a() {
            return TextMotion.f;
        }

        @l
        public final TextMotion b() {
            return TextMotion.e;
        }
    }

    @g
    public static final class Linearity {
        public static final class androidx.compose.ui.text.style.TextMotion.Linearity.Companion {
            private androidx.compose.ui.text.style.TextMotion.Linearity.Companion() {
            }

            public androidx.compose.ui.text.style.TextMotion.Linearity.Companion(w w0) {
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
        public static final androidx.compose.ui.text.style.TextMotion.Linearity.Companion b;
        private static final int c;
        private static final int d;
        private static final int e;

        static {
            Linearity.b = new androidx.compose.ui.text.style.TextMotion.Linearity.Companion(null);
            Linearity.c = 1;
            Linearity.d = 2;
            Linearity.e = 3;
        }

        private Linearity(int v) {
            this.a = v;
        }

        public static final int a() [...] // 潜在的解密器

        public static final int b() [...] // 潜在的解密器

        public static final int c() [...] // 潜在的解密器

        public static final Linearity d(int v) {
            return new Linearity(v);
        }

        private static int e(int v) [...] // Inlined contents

        @Override
        public boolean equals(Object object0) {
            return Linearity.f(this.a, object0);
        }

        public static boolean f(int v, Object object0) {
            return object0 instanceof Linearity ? v == ((Linearity)object0).j() : false;
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
            if(Linearity.g(v, Linearity.c)) {
                return "Linearity.Linear";
            }
            if(Linearity.g(v, Linearity.d)) {
                return "Linearity.FontHinting";
            }
            return Linearity.g(v, Linearity.e) ? "Linearity.None" : "Invalid";
        }

        public final int j() {
            return this.a;
        }

        @Override
        @l
        public String toString() {
            return Linearity.i(this.a);
        }
    }

    private final int a;
    private final boolean b;
    @l
    public static final Companion c;
    public static final int d;
    @l
    private static final TextMotion e;
    @l
    private static final TextMotion f;

    static {
        TextMotion.c = new Companion(null);
        TextMotion.e = new TextMotion(2, false, null);
        TextMotion.f = new TextMotion(1, true, null);
    }

    private TextMotion(int v, boolean z) {
        this.a = v;
        this.b = z;
    }

    public TextMotion(int v, boolean z, w w0) {
        this(v, z);
    }

    @l
    public final TextMotion c(int v, boolean z) {
        return new TextMotion(v, z, null);
    }

    public static TextMotion d(TextMotion textMotion0, int v, boolean z, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = textMotion0.a;
        }
        if((v1 & 2) != 0) {
            z = textMotion0.b;
        }
        return textMotion0.c(v, z);
    }

    public final int e() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TextMotion)) {
            return false;
        }
        return Linearity.g(this.a, ((TextMotion)object0).a) ? this.b == ((TextMotion)object0).b : false;
    }

    public final boolean f() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.a * 0x1F + c.a(this.b);
    }

    @Override
    @l
    public String toString() {
        if(L.g(this, TextMotion.e)) {
            return "TextMotion.Static";
        }
        return L.g(this, TextMotion.f) ? "TextMotion.Animated" : "Invalid";
    }
}

