package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@Immutable
@g
public final class LineBreak {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        // 去混淆评级： 低(20)
        public final int a() {
            return 0x20203;
        }

        // 去混淆评级： 低(20)
        public final int b() {
            return 0x10402;
        }

        // 去混淆评级： 低(20)
        public final int c() [...] // 潜在的解密器
    }

    @g
    public static final class Strategy {
        public static final class androidx.compose.ui.text.style.LineBreak.Strategy.Companion {
            private androidx.compose.ui.text.style.LineBreak.Strategy.Companion() {
            }

            public androidx.compose.ui.text.style.LineBreak.Strategy.Companion(w w0) {
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
        public static final androidx.compose.ui.text.style.LineBreak.Strategy.Companion b;
        private static final int c;
        private static final int d;
        private static final int e;

        static {
            Strategy.b = new androidx.compose.ui.text.style.LineBreak.Strategy.Companion(null);
            Strategy.c = 1;
            Strategy.d = 2;
            Strategy.e = 3;
        }

        private Strategy(int v) {
            this.a = v;
        }

        public static final int a() [...] // 潜在的解密器

        public static final int b() [...] // 潜在的解密器

        public static final int c() [...] // 潜在的解密器

        public static final Strategy d(int v) {
            return new Strategy(v);
        }

        public static int e(int v) [...] // Inlined contents

        @Override
        public boolean equals(Object object0) {
            return Strategy.f(this.a, object0);
        }

        public static boolean f(int v, Object object0) {
            return object0 instanceof Strategy ? v == ((Strategy)object0).j() : false;
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
            if(Strategy.g(v, 1)) {
                return "Strategy.Simple";
            }
            if(Strategy.g(v, 2)) {
                return "Strategy.HighQuality";
            }
            return Strategy.g(v, 3) ? "Strategy.Balanced" : "Invalid";
        }

        public final int j() {
            return this.a;
        }

        @Override
        @l
        public String toString() {
            return Strategy.i(this.a);
        }
    }

    @g
    public static final class Strictness {
        public static final class androidx.compose.ui.text.style.LineBreak.Strictness.Companion {
            private androidx.compose.ui.text.style.LineBreak.Strictness.Companion() {
            }

            public androidx.compose.ui.text.style.LineBreak.Strictness.Companion(w w0) {
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
        public static final androidx.compose.ui.text.style.LineBreak.Strictness.Companion b;
        private static final int c;
        private static final int d;
        private static final int e;
        private static final int f;

        static {
            Strictness.b = new androidx.compose.ui.text.style.LineBreak.Strictness.Companion(null);
            Strictness.c = 1;
            Strictness.d = 2;
            Strictness.e = 3;
            Strictness.f = 4;
        }

        private Strictness(int v) {
            this.a = v;
        }

        public static final int a() [...] // 潜在的解密器

        public static final int b() [...] // 潜在的解密器

        public static final int c() [...] // 潜在的解密器

        public static final int d() [...] // 潜在的解密器

        public static final Strictness e(int v) {
            return new Strictness(v);
        }

        @Override
        public boolean equals(Object object0) {
            return Strictness.g(this.a, object0);
        }

        public static int f(int v) [...] // Inlined contents

        public static boolean g(int v, Object object0) {
            return object0 instanceof Strictness ? v == ((Strictness)object0).k() : false;
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
            if(Strictness.h(v, Strictness.c)) {
                return "Strictness.None";
            }
            if(Strictness.h(v, 2)) {
                return "Strictness.Loose";
            }
            if(Strictness.h(v, 3)) {
                return "Strictness.Normal";
            }
            return Strictness.h(v, 4) ? "Strictness.Strict" : "Invalid";
        }

        public final int k() {
            return this.a;
        }

        @Override
        @l
        public String toString() {
            return Strictness.j(this.a);
        }
    }

    @g
    public static final class WordBreak {
        public static final class androidx.compose.ui.text.style.LineBreak.WordBreak.Companion {
            private androidx.compose.ui.text.style.LineBreak.WordBreak.Companion() {
            }

            public androidx.compose.ui.text.style.LineBreak.WordBreak.Companion(w w0) {
            }

            // 去混淆评级： 低(20)
            public final int a() [...] // 潜在的解密器

            // 去混淆评级： 低(20)
            public final int b() [...] // 潜在的解密器
        }

        private final int a;
        @l
        public static final androidx.compose.ui.text.style.LineBreak.WordBreak.Companion b;
        private static final int c;
        private static final int d;

        static {
            WordBreak.b = new androidx.compose.ui.text.style.LineBreak.WordBreak.Companion(null);
            WordBreak.c = 1;
            WordBreak.d = 2;
        }

        private WordBreak(int v) {
            this.a = v;
        }

        public static final int a() [...] // 潜在的解密器

        public static final int b() [...] // 潜在的解密器

        public static final WordBreak c(int v) {
            return new WordBreak(v);
        }

        public static int d(int v) [...] // Inlined contents

        public static boolean e(int v, Object object0) {
            return object0 instanceof WordBreak ? v == ((WordBreak)object0).i() : false;
        }

        @Override
        public boolean equals(Object object0) {
            return WordBreak.e(this.a, object0);
        }

        public static final boolean f(int v, int v1) {
            return v == v1;
        }

        public static int g(int v) [...] // Inlined contents

        @l
        public static String h(int v) {
            if(WordBreak.f(v, 1)) {
                return "WordBreak.None";
            }
            return WordBreak.f(v, 2) ? "WordBreak.Phrase" : "Invalid";
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
            return WordBreak.h(this.a);
        }
    }

    private final int a;
    @l
    public static final Companion b;
    private static final int c;
    private static final int d;
    private static final int e;

    // 去混淆评级： 低(48)
    static {
        LineBreak.b = new Companion(null);
        LineBreak.c = 0x10301;
        LineBreak.d = 0x20203;
        LineBreak.e = 0x10402;
    }

    private LineBreak(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final int c() [...] // 潜在的解密器

    public static final LineBreak d(int v) {
        return new LineBreak(v);
    }

    private static int e(int v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return LineBreak.i(this.a, object0);
    }

    public static int f(int v, int v1, int v2) [...] // 潜在的解密器

    public static final int g(int v, int v1, int v2, int v3) {
        return LineBreak.f(v1, v2, v3);
    }

    public static int h(int v, int v1, int v2, int v3, int v4, Object object0) {
        if((v4 & 1) != 0) {
            v1 = LineBreak.k(v);
        }
        if((v4 & 2) != 0) {
            v2 = LineBreak.l(v);
        }
        if((v4 & 4) != 0) {
            v3 = LineBreak.m(v);
        }
        return LineBreak.g(v, v1, v2, v3);
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    public static boolean i(int v, Object object0) {
        return object0 instanceof LineBreak ? v == ((LineBreak)object0).p() : false;
    }

    public static final boolean j(int v, int v1) {
        return v == v1;
    }

    public static final int k(int v) {
        return LineBreak_androidKt.b(v);
    }

    public static final int l(int v) {
        return LineBreak_androidKt.c(v);
    }

    public static final int m(int v) {
        return LineBreak_androidKt.d(v);
    }

    public static int n(int v) [...] // Inlined contents

    @l
    public static String o(int v) {
        return "LineBreak(strategy=" + Strategy.i(LineBreak.k(v)) + ", strictness=" + Strictness.j(LineBreak.l(v)) + ", wordBreak=" + WordBreak.h(LineBreak.m(v)) + ')';
    }

    public final int p() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return LineBreak.o(this.a);
    }
}

