package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.b0;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@Immutable
@s0({"SMAP\nTransformOrigin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformOrigin.kt\nandroidx/compose/ui/graphics/TransformOrigin\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,83:1\n34#2:84\n41#2:85\n*S KotlinDebug\n*F\n+ 1 TransformOrigin.kt\nandroidx/compose/ui/graphics/TransformOrigin\n*L\n46#1:84\n55#1:85\n*E\n"})
@g
public final class TransformOrigin {
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
        TransformOrigin.b = new Companion(null);
        TransformOrigin.c = 0x3F0000003F000000L;
    }

    private TransformOrigin(long v) {
        this.a = v;
    }

    public static final long a() [...] // 潜在的解密器

    public static final TransformOrigin b(long v) {
        return new TransformOrigin(v);
    }

    @Stable
    public static final float c(long v) {
        return TransformOrigin.k(v);
    }

    @Stable
    public static final float d(long v) {
        return TransformOrigin.l(v);
    }

    public static long e(long v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return TransformOrigin.h(this.a, object0);
    }

    public static final long f(long v, float f, float f1) {
        return TransformOriginKt.a(f, f1);
    }

    public static long g(long v, float f, float f1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            f = TransformOrigin.k(v);
        }
        if((v1 & 2) != 0) {
            f1 = TransformOrigin.l(v);
        }
        return TransformOrigin.f(v, f, f1);
    }

    public static boolean h(long v, Object object0) {
        return object0 instanceof TransformOrigin ? v == ((TransformOrigin)object0).o() : false;
    }

    @Override
    public int hashCode() {
        return TransformOrigin.m(this.a);
    }

    public static final boolean i(long v, long v1) {
        return v == v1;
    }

    @b0
    public static void j() {
    }

    public static final float k(long v) {
        return Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    public static final float l(long v) {
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    public static int m(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    public static String n(long v) {
        return "TransformOrigin(packedValue=" + v + ')';
    }

    public final long o() {
        return this.a;
    }

    @Override
    public String toString() {
        return TransformOrigin.n(this.a);
    }
}

