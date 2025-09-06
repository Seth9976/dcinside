package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@Immutable
@s0({"SMAP\nTextRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,128:1\n55#2:129\n62#2:130\n*S KotlinDebug\n*F\n+ 1 TextRange.kt\nandroidx/compose/ui/text/TextRange\n*L\n48#1:129\n50#1:130\n*E\n"})
@g
public final class TextRange {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        // 去混淆评级： 低(20)
        public final long a() [...] // 潜在的解密器
    }

    private final long a;
    @l
    public static final Companion b;
    private static final long c;

    static {
        TextRange.b = new Companion(null);
        TextRange.c = TextRangeKt.a(0);
    }

    private TextRange(long v) {
        this.a = v;
    }

    public static final long a() [...] // 潜在的解密器

    public static final TextRange b(long v) {
        return new TextRange(v);
    }

    public static long c(long v) {
        return v;
    }

    public static final boolean d(long v, long v1) {
        return TextRange.l(v) <= TextRange.l(v1) && TextRange.k(v1) <= TextRange.k(v);
    }

    public static final boolean e(long v, int v1) {
        return v1 < TextRange.k(v) && TextRange.l(v) <= v1;
    }

    @Override
    public boolean equals(Object object0) {
        return TextRange.f(this.a, object0);
    }

    public static boolean f(long v, Object object0) {
        return object0 instanceof TextRange ? v == ((TextRange)object0).r() : false;
    }

    public static final boolean g(long v, long v1) {
        return v == v1;
    }

    public static final boolean h(long v) {
        return ((int)(v >> 0x20)) == ((int)(v & 0xFFFFFFFFL));
    }

    @Override
    public int hashCode() {
        return TextRange.o(this.a);
    }

    public static final int i(long v) [...] // Inlined contents

    public static final int j(long v) {
        return TextRange.k(v) - TextRange.l(v);
    }

    public static final int k(long v) {
        return ((int)(v >> 0x20)) <= ((int)(v & 0xFFFFFFFFL)) ? ((int)(v & 0xFFFFFFFFL)) : ((int)(v >> 0x20));
    }

    public static final int l(long v) {
        return ((int)(v >> 0x20)) <= ((int)(v & 0xFFFFFFFFL)) ? ((int)(v >> 0x20)) : ((int)(v & 0xFFFFFFFFL));
    }

    public static final boolean m(long v) {
        return ((int)(v >> 0x20)) > ((int)(v & 0xFFFFFFFFL));
    }

    public static final int n(long v) [...] // Inlined contents

    public static int o(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    public static final boolean p(long v, long v1) {
        return TextRange.l(v) < TextRange.k(v1) && TextRange.l(v1) < TextRange.k(v);
    }

    @l
    public static String q(long v) {
        return "TextRange(" + ((int)(v >> 0x20)) + ", " + ((int)(v & 0xFFFFFFFFL)) + ')';
    }

    public final long r() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return TextRange.q(this.a);
    }
}

