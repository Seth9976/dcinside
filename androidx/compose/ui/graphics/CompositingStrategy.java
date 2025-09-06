package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@Immutable
@g
public final class CompositingStrategy {
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
        CompositingStrategy.b = new Companion(null);
        CompositingStrategy.c = 0;
        CompositingStrategy.d = 1;
        CompositingStrategy.e = 2;
    }

    private CompositingStrategy(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final int c() [...] // 潜在的解密器

    public static final CompositingStrategy d(int v) {
        return new CompositingStrategy(v);
    }

    public static int e(int v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return CompositingStrategy.f(this.a, object0);
    }

    public static boolean f(int v, Object object0) {
        return object0 instanceof CompositingStrategy ? v == ((CompositingStrategy)object0).j() : false;
    }

    public static final boolean g(int v, int v1) {
        return v == v1;
    }

    public static int h(int v) [...] // Inlined contents

    @Override
    public int hashCode() {
        return this.a;
    }

    public static String i(int v) [...] // Inlined contents

    public final int j() {
        return this.a;
    }

    @Override
    public String toString() {
        return "CompositingStrategy(value=" + this.a + ')';
    }
}

