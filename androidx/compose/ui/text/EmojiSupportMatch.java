package androidx.compose.ui.text;

import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@g
public final class EmojiSupportMatch {
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
        EmojiSupportMatch.b = new Companion(null);
        EmojiSupportMatch.c = 0;
        EmojiSupportMatch.d = 1;
    }

    private EmojiSupportMatch(int v) {
        this.a = v;
    }

    public static final int a() [...] // 潜在的解密器

    public static final int b() [...] // 潜在的解密器

    public static final EmojiSupportMatch c(int v) {
        return new EmojiSupportMatch(v);
    }

    private static int d(int v) [...] // Inlined contents

    public static boolean e(int v, Object object0) {
        return object0 instanceof EmojiSupportMatch ? v == ((EmojiSupportMatch)object0).i() : false;
    }

    @Override
    public boolean equals(Object object0) {
        return EmojiSupportMatch.e(this.a, object0);
    }

    public static final boolean f(int v, int v1) {
        return v == v1;
    }

    public static int g(int v) [...] // Inlined contents

    @l
    public static String h(int v) {
        if(v == EmojiSupportMatch.c) {
            return "EmojiSupportMatch.Default";
        }
        return v == EmojiSupportMatch.d ? "EmojiSupportMatch.None" : "Invalid(value=" + v + ')';
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
        return EmojiSupportMatch.h(this.a);
    }
}

