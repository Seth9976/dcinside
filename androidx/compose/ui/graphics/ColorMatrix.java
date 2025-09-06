package androidx.compose.ui.graphics;

import A3.o;
import java.util.Arrays;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import z3.g;

@s0({"SMAP\nColorMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorMatrix.kt\nandroidx/compose/ui/graphics/ColorMatrix\n*L\n1#1,328:1\n97#1,2:329\n97#1,2:331\n97#1,2:333\n97#1,2:335\n84#1:337\n84#1:338\n84#1:339\n84#1:340\n84#1:341\n84#1:342\n84#1:343\n84#1:344\n84#1:345\n84#1:346\n84#1:347\n84#1:348\n84#1:349\n84#1:350\n84#1:351\n84#1:352\n84#1:353\n84#1:354\n84#1:355\n84#1:356\n97#1,2:357\n97#1,2:359\n97#1,2:361\n97#1,2:363\n97#1,2:365\n97#1,2:367\n97#1,2:369\n97#1,2:371\n97#1,2:373\n97#1,2:375\n97#1,2:377\n97#1,2:379\n97#1,2:381\n97#1,2:383\n97#1,2:385\n97#1,2:387\n97#1,2:389\n97#1,2:391\n97#1,2:393\n97#1,2:395\n84#1:397\n84#1:398\n84#1:399\n84#1:400\n97#1,2:401\n97#1,2:403\n97#1,2:405\n97#1,2:407\n97#1,2:409\n97#1,2:411\n97#1,2:413\n97#1,2:415\n97#1,2:417\n97#1,2:419\n97#1,2:421\n97#1,2:423\n97#1,2:425\n133#1,5:427\n97#1,2:432\n97#1,2:434\n97#1,2:436\n97#1,2:438\n138#1:440\n133#1,5:441\n97#1,2:446\n97#1,2:448\n97#1,2:450\n97#1,2:452\n138#1:454\n133#1,5:455\n97#1,2:460\n97#1,2:462\n97#1,2:464\n97#1,2:466\n138#1:468\n97#1,2:469\n97#1,2:471\n97#1,2:473\n97#1,2:475\n97#1,2:477\n97#1,2:479\n97#1,2:481\n97#1,2:483\n97#1,2:485\n97#1,2:487\n97#1,2:489\n97#1,2:491\n97#1,2:493\n97#1,2:495\n97#1,2:497\n97#1,2:499\n*S KotlinDebug\n*F\n+ 1 ColorMatrix.kt\nandroidx/compose/ui/graphics/ColorMatrix\n*L\n111#1:329,2\n112#1:331,2\n113#1:333,2\n114#1:335,2\n148#1:337\n149#1:338\n150#1:339\n151#1:340\n152#1:341\n158#1:342\n159#1:343\n160#1:344\n161#1:345\n162#1:346\n168#1:347\n169#1:348\n170#1:349\n171#1:350\n172#1:351\n178#1:352\n179#1:353\n180#1:354\n181#1:355\n182#1:356\n184#1:357,2\n185#1:359,2\n186#1:361,2\n187#1:363,2\n188#1:365,2\n189#1:367,2\n190#1:369,2\n191#1:371,2\n192#1:373,2\n193#1:375,2\n194#1:377,2\n195#1:379,2\n196#1:381,2\n197#1:383,2\n198#1:385,2\n199#1:387,2\n200#1:389,2\n201#1:391,2\n202#1:393,2\n203#1:395,2\n211#1:397\n212#1:398\n213#1:399\n214#1:400\n228#1:401,2\n229#1:403,2\n230#1:405,2\n231#1:407,2\n232#1:409,2\n233#1:411,2\n234#1:413,2\n235#1:415,2\n236#1:417,2\n255#1:419,2\n256#1:421,2\n257#1:423,2\n258#1:425,2\n265#1:427,5\n266#1:432,2\n267#1:434,2\n268#1:436,2\n269#1:438,2\n265#1:440\n277#1:441,5\n278#1:446,2\n279#1:448,2\n280#1:450,2\n281#1:452,2\n277#1:454\n289#1:455,5\n290#1:460,2\n291#1:462,2\n292#1:464,2\n293#1:466,2\n289#1:468\n303#1:469,2\n304#1:471,2\n305#1:473,2\n306#1:475,2\n307#1:477,2\n308#1:479,2\n309#1:481,2\n310#1:483,2\n311#1:485,2\n320#1:487,2\n321#1:489,2\n322#1:491,2\n323#1:493,2\n324#1:495,2\n325#1:497,2\n326#1:499,2\n*E\n"})
@g
public final class ColorMatrix {
    @l
    private final float[] a;

    private ColorMatrix(float[] arr_f) {
        this.a = arr_f;
    }

    public static final ColorMatrix a(float[] arr_f) {
        return new ColorMatrix(arr_f);
    }

    @l
    public static float[] b(@l float[] arr_f) {
        L.p(arr_f, "values");
        return arr_f;
    }

    public static float[] c(float[] arr_f, int v, w w0) {
        if((v & 1) != 0) {
            arr_f = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        }
        return ColorMatrix.b(arr_f);
    }

    public static final void d(float[] arr_f) {
        ColorMatrix.l(arr_f);
        arr_f[0] = 0.299f;
        arr_f[1] = 0.587f;
        arr_f[2] = 0.114f;
        arr_f[5] = -0.16874f;
        arr_f[6] = -0.33126f;
        arr_f[7] = 0.5f;
        arr_f[10] = 0.5f;
        arr_f[11] = -0.41869f;
        arr_f[12] = -0.08131f;
    }

    public static final void e(float[] arr_f) {
        ColorMatrix.l(arr_f);
        arr_f[2] = 1.402f;
        arr_f[5] = 1.0f;
        arr_f[6] = -0.34414f;
        arr_f[7] = -0.71414f;
        arr_f[10] = 1.0f;
        arr_f[11] = 1.772f;
        arr_f[12] = 0.0f;
    }

    @Override
    public boolean equals(Object object0) {
        return ColorMatrix.g(this.a, object0);
    }

    private static final float f(float[] arr_f, float[] arr_f1, int v, float[] arr_f2, int v1) {
        return arr_f1[v * 5] * arr_f2[v1] + arr_f1[v * 5 + 1] * arr_f2[v1 + 5] + arr_f1[v * 5 + 2] * arr_f2[v1 + 10] + arr_f1[v * 5 + 3] * arr_f2[v1 + 15];
    }

    // 去混淆评级： 低(20)
    public static boolean g(float[] arr_f, Object object0) {
        return object0 instanceof ColorMatrix ? L.g(arr_f, ((ColorMatrix)object0).w()) : false;
    }

    public static final boolean h(float[] arr_f, float[] arr_f1) {
        return L.g(arr_f, arr_f1);
    }

    @Override
    public int hashCode() {
        return ColorMatrix.k(this.a);
    }

    public static final float i(float[] arr_f, int v, int v1) {
        return arr_f[v * 5 + v1];
    }

    @l
    public final float[] j() {
        return this.a;
    }

    public static int k(float[] arr_f) {
        return Arrays.hashCode(arr_f);
    }

    public static final void l(float[] arr_f) {
        kotlin.collections.l.S1(arr_f, 0.0f, 0, 0, 6, null);
        arr_f[0] = 1.0f;
        arr_f[12] = 1.0f;
        arr_f[6] = 1.0f;
        arr_f[18] = 1.0f;
    }

    private static final void m(float[] arr_f, float f, o o0) {
        ColorMatrix.l(arr_f);
        double f1 = ((double)f) * 3.141593 / 180.0;
        o0.invoke(((float)Math.cos(f1)), ((float)Math.sin(f1)));
    }

    public static final void n(float[] arr_f, int v, int v1, float f) {
        arr_f[v * 5 + v1] = f;
    }

    public static final void o(float[] arr_f, @l float[] arr_f1) {
        L.p(arr_f1, "src");
        kotlin.collections.l.H0(arr_f1, arr_f, 0, 0, 0, 14, null);
    }

    public static final void p(float[] arr_f, float f) {
        ColorMatrix.l(arr_f);
        double f1 = ((double)f) * 3.141593 / 180.0;
        float f2 = (float)Math.cos(f1);
        float f3 = (float)Math.sin(f1);
        arr_f[6] = f2;
        arr_f[0] = f2;
        arr_f[1] = f3;
        arr_f[5] = -f3;
    }

    public static final void q(float[] arr_f, float f) {
        ColorMatrix.l(arr_f);
        double f1 = ((double)f) * 3.141593 / 180.0;
        float f2 = (float)Math.cos(f1);
        float f3 = (float)Math.sin(f1);
        arr_f[12] = f2;
        arr_f[0] = f2;
        arr_f[2] = -f3;
        arr_f[10] = f3;
    }

    public static final void r(float[] arr_f, float f) {
        ColorMatrix.l(arr_f);
        double f1 = ((double)f) * 3.141593 / 180.0;
        float f2 = (float)Math.cos(f1);
        float f3 = (float)Math.sin(f1);
        arr_f[12] = f2;
        arr_f[6] = f2;
        arr_f[7] = f3;
        arr_f[11] = -f3;
    }

    public static final void s(float[] arr_f, float f) {
        ColorMatrix.l(arr_f);
        float f1 = 0.213f * (1.0f - f);
        float f2 = 0.715f * (1.0f - f);
        float f3 = (1.0f - f) * 0.072f;
        arr_f[0] = f1 + f;
        arr_f[1] = f2;
        arr_f[2] = f3;
        arr_f[5] = f1;
        arr_f[6] = f2 + f;
        arr_f[7] = f3;
        arr_f[10] = f1;
        arr_f[11] = f2;
        arr_f[12] = f3 + f;
    }

    public static final void t(float[] arr_f, float f, float f1, float f2, float f3) {
        ColorMatrix.l(arr_f);
        arr_f[0] = f;
        arr_f[6] = f1;
        arr_f[12] = f2;
        arr_f[18] = f3;
    }

    @Override
    public String toString() {
        return ColorMatrix.v(this.a);
    }

    public static final void u(float[] arr_f, @l float[] arr_f1) {
        L.p(arr_f1, "colorMatrix");
        float f = ColorMatrix.f(arr_f, arr_f, 0, arr_f1, 0);
        float f1 = ColorMatrix.f(arr_f, arr_f, 0, arr_f1, 1);
        float f2 = ColorMatrix.f(arr_f, arr_f, 0, arr_f1, 2);
        float f3 = ColorMatrix.f(arr_f, arr_f, 0, arr_f1, 3);
        float f4 = arr_f[0] * arr_f1[4] + arr_f[1] * arr_f1[9] + arr_f[2] * arr_f1[14] + arr_f[3] * arr_f1[19] + arr_f[4];
        float f5 = ColorMatrix.f(arr_f, arr_f, 1, arr_f1, 0);
        float f6 = ColorMatrix.f(arr_f, arr_f, 1, arr_f1, 1);
        float f7 = ColorMatrix.f(arr_f, arr_f, 1, arr_f1, 2);
        float f8 = ColorMatrix.f(arr_f, arr_f, 1, arr_f1, 3);
        float f9 = arr_f[5] * arr_f1[4] + arr_f[6] * arr_f1[9] + arr_f[7] * arr_f1[14] + arr_f[8] * arr_f1[19] + arr_f[9];
        float f10 = ColorMatrix.f(arr_f, arr_f, 2, arr_f1, 0);
        float f11 = ColorMatrix.f(arr_f, arr_f, 2, arr_f1, 1);
        float f12 = ColorMatrix.f(arr_f, arr_f, 2, arr_f1, 2);
        float f13 = ColorMatrix.f(arr_f, arr_f, 2, arr_f1, 3);
        float f14 = arr_f[10] * arr_f1[4] + arr_f[11] * arr_f1[9] + arr_f[12] * arr_f1[14] + arr_f[13] * arr_f1[19] + arr_f[14];
        float f15 = ColorMatrix.f(arr_f, arr_f, 3, arr_f1, 0);
        float f16 = ColorMatrix.f(arr_f, arr_f, 3, arr_f1, 1);
        float f17 = ColorMatrix.f(arr_f, arr_f, 3, arr_f1, 2);
        float f18 = ColorMatrix.f(arr_f, arr_f, 3, arr_f1, 3);
        float f19 = arr_f[15] * arr_f1[4] + arr_f[16] * arr_f1[9] + arr_f[17] * arr_f1[14] + arr_f[18] * arr_f1[19] + arr_f[19];
        arr_f[0] = f;
        arr_f[1] = f1;
        arr_f[2] = f2;
        arr_f[3] = f3;
        arr_f[4] = f4;
        arr_f[5] = f5;
        arr_f[6] = f6;
        arr_f[7] = f7;
        arr_f[8] = f8;
        arr_f[9] = f9;
        arr_f[10] = f10;
        arr_f[11] = f11;
        arr_f[12] = f12;
        arr_f[13] = f13;
        arr_f[14] = f14;
        arr_f[15] = f15;
        arr_f[16] = f16;
        arr_f[17] = f17;
        arr_f[18] = f18;
        arr_f[19] = f19;
    }

    public static String v(float[] arr_f) {
        return "ColorMatrix(values=" + Arrays.toString(arr_f) + ')';
    }

    public final float[] w() {
        return this.a;
    }
}

