package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nColorSpace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpace\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,796:1\n25#2,3:797\n*S KotlinDebug\n*F\n+ 1 ColorSpace.kt\nandroidx/compose/ui/graphics/colorspace/ColorSpace\n*L\n288#1:797,3\n*E\n"})
public abstract class ColorSpace {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    private final String a;
    private final long b;
    private final int c;
    @l
    public static final Companion d = null;
    public static final int e = -1;
    public static final int f = 0x3F;

    static {
        ColorSpace.d = new Companion(null);
    }

    private ColorSpace(String s, long v) {
        this(s, v, -1, null);
    }

    private ColorSpace(String s, long v, int v1) {
        this.a = s;
        this.b = v;
        this.c = v1;
        if(s.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if(v1 < -1 || v1 > 0x3F) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public ColorSpace(String s, long v, int v1, w w0) {
        this(s, v, v1);
    }

    public ColorSpace(String s, long v, w w0) {
        this(s, v);
    }

    @l
    public final float[] a(float f, float f1, float f2) {
        float[] arr_f = new float[((int)(this.b >> 0x20))];
        arr_f[0] = f;
        arr_f[1] = f1;
        arr_f[2] = f2;
        return this.b(arr_f);
    }

    @l
    public abstract float[] b(@l float[] arg1);

    public final int c() {
        return (int)(this.b >> 0x20);
    }

    public final int d() {
        return this.c;
    }

    public abstract float e(int arg1);

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || this.getClass() != object0.getClass() || this.c != ((ColorSpace)object0).c) {
            return false;
        }
        return L.g(this.a, ((ColorSpace)object0).a) ? ColorModel.h(this.b, ((ColorSpace)object0).b) : false;
    }

    public abstract float f(int arg1);

    public final long g() {
        return this.b;
    }

    @l
    public final String h() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return (this.a.hashCode() * 0x1F + ColorModel.k(this.b)) * 0x1F + this.c;
    }

    public boolean i() {
        return false;
    }

    public abstract boolean j();

    public long k(float f, float f1, float f2) {
        float[] arr_f = this.l(f, f1, f2);
        return ((long)Float.floatToIntBits(arr_f[0])) << 0x20 | ((long)Float.floatToIntBits(arr_f[1])) & 0xFFFFFFFFL;
    }

    @l
    public final float[] l(float f, float f1, float f2) {
        return this.m(new float[]{f, f1, f2});
    }

    @l
    public abstract float[] m(@l float[] arg1);

    public float n(float f, float f1, float f2) {
        return this.l(f, f1, f2)[2];
    }

    public long o(float f, float f1, float f2, float f3, @l ColorSpace colorSpace0) {
        L.p(colorSpace0, "colorSpace");
        float[] arr_f = this.a(f, f1, f2);
        return ColorKt.a(arr_f[0], arr_f[1], arr_f[2], f3, colorSpace0);
    }

    @Override
    @l
    public String toString() {
        return this.a + " (id=" + this.c + ", model=" + ColorModel.l(this.b) + ')';
    }
}

