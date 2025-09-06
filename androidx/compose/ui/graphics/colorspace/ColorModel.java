package androidx.compose.ui.graphics.colorspace;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@Immutable
@s0({"SMAP\nColorModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorModel.kt\nandroidx/compose/ui/graphics/colorspace/ColorModel\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,89:1\n55#2:90\n48#2:91\n48#2:92\n48#2:93\n48#2:94\n*S KotlinDebug\n*F\n+ 1 ColorModel.kt\nandroidx/compose/ui/graphics/colorspace/ColorModel\n*L\n48#1:90\n57#1:91\n64#1:92\n71#1:93\n79#1:94\n*E\n"})
@g
public final class ColorModel {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        // 去混淆评级： 低(20)
        public final long a() {
            return 0x400000003L;
        }

        // 去混淆评级： 低(20)
        public final long b() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final long c() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final long d() [...] // 潜在的解密器
    }

    private final long a;
    @l
    public static final Companion b;
    private static final long c;
    private static final long d;
    private static final long e;
    private static final long f;

    static {
        ColorModel.b = new Companion(null);
        ColorModel.c = 0x300000000L;
        ColorModel.d = 0x300000001L;
        ColorModel.e = 0x300000002L;
        ColorModel.f = 0x400000003L;
    }

    private ColorModel(long v) {
        this.a = v;
    }

    public static final long a() [...] // 潜在的解密器

    public static final long b() [...] // 潜在的解密器

    public static final long c() [...] // 潜在的解密器

    public static final long d() [...] // 潜在的解密器

    public static final ColorModel e(long v) {
        return new ColorModel(v);
    }

    @Override
    public boolean equals(Object object0) {
        return ColorModel.g(this.a, object0);
    }

    public static long f(long v) [...] // Inlined contents

    public static boolean g(long v, Object object0) {
        return object0 instanceof ColorModel ? v == ((ColorModel)object0).m() : false;
    }

    public static final boolean h(long v, long v1) {
        return v == v1;
    }

    @Override
    public int hashCode() {
        return ColorModel.k(this.a);
    }

    @Stable
    public static void i() {
    }

    public static final int j(long v) [...] // Inlined contents

    public static int k(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    @l
    public static String l(long v) {
        if(ColorModel.h(v, 0x300000000L)) {
            return "Rgb";
        }
        if(ColorModel.h(v, 0x300000001L)) {
            return "Xyz";
        }
        if(ColorModel.h(v, 0x300000002L)) {
            return "Lab";
        }
        return ColorModel.h(v, ColorModel.f) ? "Cmyk" : "Unknown";
    }

    public final long m() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return ColorModel.l(this.a);
    }
}

