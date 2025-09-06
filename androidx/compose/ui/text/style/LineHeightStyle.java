package androidx.compose.ui.text.style;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.ExperimentalTextApi;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.g;

@StabilityInferred(parameters = 0)
public final class LineHeightStyle {
    @g
    public static final class Alignment {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            // 去混淆评级： 低(20)
            public final float a() {
                return 1.0f;
            }

            public static void b() {
            }

            // 去混淆评级： 低(20)
            public final float c() {
                return 0.5f;
            }

            public static void d() {
            }

            // 去混淆评级： 低(20)
            public final float e() [...] // 潜在的解密器

            public static void f() {
            }

            // 去混淆评级： 低(20)
            public final float g() {
                return 0.0f;
            }

            public static void h() {
            }
        }

        private final float a;
        @l
        public static final Companion b;
        private static final float c;
        private static final float d;
        private static final float e;
        private static final float f;

        static {
            Alignment.b = new Companion(null);
            Alignment.c = 0.0f;
            Alignment.d = 0.5f;
            Alignment.e = -1.0f;
            Alignment.f = 1.0f;
        }

        @ExperimentalTextApi
        private Alignment(float f) {
            this.a = f;
        }

        public static final float a() [...] // 潜在的解密器

        public static final float b() [...] // 潜在的解密器

        public static final float c() [...] // 潜在的解密器

        public static final float d() [...] // 潜在的解密器

        public static final Alignment e(float f) {
            return new Alignment(f);
        }

        @Override
        public boolean equals(Object object0) {
            return Alignment.g(this.a, object0);
        }

        @ExperimentalTextApi
        public static float f(float f) [...] // Inlined contents

        public static boolean g(float f, Object object0) {
            return object0 instanceof Alignment ? Float.compare(f, ((Alignment)object0).k()) == 0 : false;
        }

        public static final boolean h(float f, float f1) {
            return Float.compare(f, f1) == 0;
        }

        @Override
        public int hashCode() {
            return Alignment.i(this.a);
        }

        public static int i(float f) {
            return Float.floatToIntBits(f);
        }

        @l
        public static String j(float f) {
            if(f == Alignment.c) {
                return "LineHeightStyle.Alignment.Top";
            }
            if(f == Alignment.d) {
                return "LineHeightStyle.Alignment.Center";
            }
            if(f == Alignment.e) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            return f == Alignment.f ? "LineHeightStyle.Alignment.Bottom" : "LineHeightStyle.Alignment(topPercentage = " + f + ')';
        }

        public final float k() {
            return this.a;
        }

        @Override
        @l
        public String toString() {
            return Alignment.j(this.a);
        }
    }

    public static final class androidx.compose.ui.text.style.LineHeightStyle.Companion {
        private androidx.compose.ui.text.style.LineHeightStyle.Companion() {
        }

        public androidx.compose.ui.text.style.LineHeightStyle.Companion(w w0) {
        }

        @l
        public final LineHeightStyle a() {
            return LineHeightStyle.e;
        }
    }

    @g
    public static final class Trim {
        public static final class androidx.compose.ui.text.style.LineHeightStyle.Trim.Companion {
            private androidx.compose.ui.text.style.LineHeightStyle.Trim.Companion() {
            }

            public androidx.compose.ui.text.style.LineHeightStyle.Trim.Companion(w w0) {
            }

            // 去混淆评级： 低(20)
            public final int a() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int b() {
                return 1;
            }

            // 去混淆评级： 低(20)
            public final int c() {
                return 16;
            }

            // 去混淆评级： 低(20)
            public final int d() {
                return 0;
            }
        }

        private final int a;
        @l
        public static final androidx.compose.ui.text.style.LineHeightStyle.Trim.Companion b = null;
        private static final int c = 1;
        private static final int d = 16;
        private static final int e;
        private static final int f;
        private static final int g;
        private static final int h;

        static {
            Trim.b = new androidx.compose.ui.text.style.LineHeightStyle.Trim.Companion(null);
            Trim.e = 1;
            Trim.f = 16;
            Trim.g = 17;
            Trim.h = 0;
        }

        private Trim(int v) {
            this.a = v;
        }

        public static final int a() [...] // 潜在的解密器

        public static final int b() [...] // 潜在的解密器

        public static final int c() [...] // 潜在的解密器

        public static final int d() [...] // 潜在的解密器

        public static final Trim e(int v) {
            return new Trim(v);
        }

        @Override
        public boolean equals(Object object0) {
            return Trim.g(this.a, object0);
        }

        private static int f(int v) [...] // Inlined contents

        public static boolean g(int v, Object object0) {
            return object0 instanceof Trim ? v == ((Trim)object0).m() : false;
        }

        public static final boolean h(int v, int v1) {
            return v == v1;
        }

        @Override
        public int hashCode() {
            return this.a;
        }

        public static int i(int v) [...] // Inlined contents

        public static final boolean j(int v) {
            return (v & 1) > 0;
        }

        public static final boolean k(int v) {
            return (v & 16) > 0;
        }

        @l
        public static String l(int v) {
            if(v == Trim.e) {
                return "LineHeightStyle.Trim.FirstLineTop";
            }
            if(v == Trim.f) {
                return "LineHeightStyle.Trim.LastLineBottom";
            }
            if(v == Trim.g) {
                return "LineHeightStyle.Trim.Both";
            }
            return v == Trim.h ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        public final int m() {
            return this.a;
        }

        @Override
        @l
        public String toString() {
            return Trim.l(this.a);
        }
    }

    private final float a;
    private final int b;
    @l
    public static final androidx.compose.ui.text.style.LineHeightStyle.Companion c;
    public static final int d;
    @l
    private static final LineHeightStyle e;

    static {
        LineHeightStyle.c = new androidx.compose.ui.text.style.LineHeightStyle.Companion(null);
        LineHeightStyle.e = new LineHeightStyle(-1.0f, 17, null);
    }

    private LineHeightStyle(float f, int v) {
        this.a = f;
        this.b = v;
    }

    public LineHeightStyle(float f, int v, w w0) {
        this(f, v);
    }

    public final float b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof LineHeightStyle)) {
            return false;
        }
        return Alignment.h(this.a, ((LineHeightStyle)object0).a) ? Trim.h(this.b, ((LineHeightStyle)object0).b) : false;
    }

    @Override
    public int hashCode() {
        return Alignment.i(this.a) * 0x1F + this.b;
    }

    @Override
    @l
    public String toString() {
        return "LineHeightStyle(alignment=" + Alignment.j(this.a) + ", trim=" + Trim.l(this.b) + ')';
    }
}

