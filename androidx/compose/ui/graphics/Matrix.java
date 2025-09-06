package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import java.util.Arrays;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;
import z3.g;

@s0({"SMAP\nMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,440:1\n39#1:441\n39#1:442\n39#1:443\n42#1,2:444\n42#1,2:446\n42#1,2:448\n42#1,2:450\n42#1,2:452\n42#1,2:454\n42#1,2:456\n42#1,2:458\n42#1,2:460\n42#1,2:462\n42#1,2:464\n42#1,2:466\n42#1,2:468\n42#1,2:470\n42#1,2:472\n42#1,2:474\n39#1:476\n39#1:477\n39#1:478\n39#1:479\n39#1:480\n39#1:481\n39#1:482\n39#1:483\n39#1:484\n39#1:485\n39#1:486\n39#1:487\n39#1:488\n39#1:489\n39#1:490\n39#1:491\n39#1:492\n39#1:493\n39#1:494\n39#1:495\n42#1,2:496\n42#1,2:498\n42#1,2:500\n42#1,2:502\n42#1,2:504\n42#1,2:506\n42#1,2:508\n42#1,2:510\n42#1,2:512\n42#1,2:514\n42#1,2:516\n42#1,2:518\n42#1,2:520\n42#1,2:522\n42#1,2:524\n42#1,2:526\n42#1,2:528\n39#1:530\n39#1:531\n39#1:532\n39#1:533\n39#1:534\n39#1:535\n39#1:536\n39#1:537\n42#1,2:538\n42#1,2:540\n42#1,2:542\n42#1,2:544\n42#1,2:546\n42#1,2:548\n42#1,2:550\n42#1,2:552\n39#1:554\n39#1:555\n39#1:556\n39#1:557\n39#1:558\n39#1:559\n39#1:560\n39#1:561\n42#1,2:562\n42#1,2:564\n42#1,2:566\n42#1,2:568\n42#1,2:570\n42#1,2:572\n42#1,2:574\n42#1,2:576\n39#1:578\n39#1:579\n39#1:580\n39#1:581\n39#1:582\n39#1:583\n39#1:584\n39#1:585\n42#1,2:586\n42#1,2:588\n42#1,2:590\n42#1,2:592\n42#1,2:594\n42#1,2:596\n42#1,2:598\n42#1,2:600\n39#1,5:602\n39#1,5:607\n39#1,5:612\n39#1,5:617\n39#1,5:622\n39#1,5:627\n39#1,5:632\n39#1,5:637\n39#1,5:642\n39#1,5:647\n39#1,5:652\n39#1,5:657\n39#1:662\n39#1:663\n39#1:664\n39#1:665\n39#1:666\n39#1:667\n39#1:668\n39#1:669\n39#1:670\n39#1:671\n39#1:672\n39#1:673\n39#1:674\n39#1:675\n39#1:676\n39#1:677\n42#1,2:678\n42#1,2:680\n42#1,2:682\n42#1,2:684\n*S KotlinDebug\n*F\n+ 1 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n51#1:441\n56#1:442\n57#1:443\n112#1:444,2\n113#1:446,2\n114#1:448,2\n115#1:450,2\n116#1:452,2\n117#1:454,2\n118#1:456,2\n119#1:458,2\n120#1:460,2\n121#1:462,2\n122#1:464,2\n123#1:466,2\n124#1:468,2\n125#1:470,2\n126#1:472,2\n127#1:474,2\n132#1:476\n133#1:477\n134#1:478\n135#1:479\n143#1:480\n144#1:481\n145#1:482\n146#1:483\n147#1:484\n148#1:485\n149#1:486\n150#1:487\n151#1:488\n152#1:489\n153#1:490\n154#1:491\n155#1:492\n156#1:493\n157#1:494\n158#1:495\n177#1:496,2\n178#1:498,2\n179#1:500,2\n180#1:502,2\n181#1:504,2\n182#1:506,2\n183#1:508,2\n184#1:510,2\n185#1:512,2\n186#1:514,2\n187#1:516,2\n188#1:518,2\n189#1:520,2\n190#1:522,2\n191#1:524,2\n192#1:526,2\n201#1:528,2\n220#1:530\n221#1:531\n225#1:532\n226#1:533\n230#1:534\n231#1:535\n235#1:536\n236#1:537\n240#1:538,2\n241#1:540,2\n242#1:542,2\n243#1:544,2\n244#1:546,2\n245#1:548,2\n246#1:550,2\n247#1:552,2\n257#1:554\n258#1:555\n262#1:556\n263#1:557\n267#1:558\n268#1:559\n272#1:560\n273#1:561\n277#1:562,2\n278#1:564,2\n279#1:566,2\n280#1:568,2\n281#1:570,2\n282#1:572,2\n283#1:574,2\n284#1:576,2\n294#1:578\n295#1:579\n299#1:580\n300#1:581\n304#1:582\n305#1:583\n309#1:584\n310#1:585\n314#1:586,2\n315#1:588,2\n316#1:590,2\n317#1:592,2\n318#1:594,2\n319#1:596,2\n320#1:598,2\n321#1:600,2\n326#1:602,5\n327#1:607,5\n328#1:612,5\n329#1:617,5\n330#1:622,5\n331#1:627,5\n332#1:632,5\n333#1:637,5\n334#1:642,5\n335#1:647,5\n336#1:652,5\n337#1:657,5\n342#1:662\n343#1:663\n344#1:664\n345#1:665\n346#1:666\n347#1:667\n348#1:668\n349#1:669\n350#1:670\n351#1:671\n352#1:672\n353#1:673\n354#1:674\n355#1:675\n356#1:676\n357#1:677\n358#1:678,2\n359#1:680,2\n360#1:682,2\n361#1:684,2\n*E\n"})
@g
public final class Matrix {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    private final float[] a;
    @l
    public static final Companion b = null;
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 7;
    public static final int i = 10;
    public static final int j = 12;
    public static final int k = 13;
    public static final int l = 14;
    public static final int m = 15;

    static {
        Matrix.b = new Companion(null);
    }

    private Matrix(float[] arr_f) {
        this.a = arr_f;
    }

    public static final Matrix a(float[] arr_f) {
        return new Matrix(arr_f);
    }

    @l
    public static float[] b(@l float[] arr_f) {
        L.p(arr_f, "values");
        return arr_f;
    }

    public static float[] c(float[] arr_f, int v, w w0) {
        if((v & 1) != 0) {
            arr_f = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return Matrix.b(arr_f);
    }

    // 去混淆评级： 低(20)
    public static boolean d(float[] arr_f, Object object0) {
        return object0 instanceof Matrix ? L.g(arr_f, ((Matrix)object0).y()) : false;
    }

    public static final boolean e(float[] arr_f, float[] arr_f1) {
        return L.g(arr_f, arr_f1);
    }

    @Override
    public boolean equals(Object object0) {
        return Matrix.d(this.a, object0);
    }

    public static final float f(float[] arr_f, int v, int v1) {
        return arr_f[v * 4 + v1];
    }

    @l
    public final float[] g() {
        return this.a;
    }

    public static int h(float[] arr_f) {
        return Arrays.hashCode(arr_f);
    }

    @Override
    public int hashCode() {
        return Matrix.h(this.a);
    }

    public static final void i(float[] arr_f) {
        float f = arr_f[0];
        float f1 = arr_f[1];
        float f2 = arr_f[2];
        float f3 = arr_f[3];
        float f4 = arr_f[4];
        float f5 = arr_f[5];
        float f6 = arr_f[6];
        float f7 = arr_f[7];
        float f8 = arr_f[8];
        float f9 = arr_f[9];
        float f10 = arr_f[10];
        float f11 = arr_f[11];
        float f12 = arr_f[12];
        float f13 = arr_f[13];
        float f14 = arr_f[14];
        float f15 = arr_f[15];
        float f16 = f * f5 - f1 * f4;
        float f17 = f * f6 - f2 * f4;
        float f18 = f * f7 - f3 * f4;
        float f19 = f1 * f6 - f2 * f5;
        float f20 = f1 * f7 - f3 * f5;
        float f21 = f2 * f7 - f3 * f6;
        float f22 = f8 * f13 - f9 * f12;
        float f23 = f8 * f14 - f10 * f12;
        float f24 = f8 * f15 - f11 * f12;
        float f25 = f9 * f14 - f10 * f13;
        float f26 = f9 * f15 - f11 * f13;
        float f27 = f10 * f15 - f11 * f14;
        float f28 = f16 * f27 - f17 * f26 + f18 * f25 + f19 * f24 - f20 * f23 + f21 * f22;
        if(f28 == 0.0f) {
            return;
        }
        arr_f[0] = (f5 * f27 - f6 * f26 + f7 * f25) * (1.0f / f28);
        arr_f[1] = (-f1 * f27 + f2 * f26 - f3 * f25) * (1.0f / f28);
        arr_f[2] = (f13 * f21 - f14 * f20 + f15 * f19) * (1.0f / f28);
        arr_f[3] = (-f9 * f21 + f10 * f20 - f11 * f19) * (1.0f / f28);
        arr_f[4] = (-f4 * f27 + f6 * f24 - f7 * f23) * (1.0f / f28);
        arr_f[5] = (f27 * f - f2 * f24 + f3 * f23) * (1.0f / f28);
        arr_f[6] = (-f12 * f21 + f14 * f18 - f15 * f17) * (1.0f / f28);
        arr_f[7] = (f21 * f8 - f10 * f18 + f11 * f17) * (1.0f / f28);
        arr_f[8] = (f4 * f26 - f5 * f24 + f7 * f22) * (1.0f / f28);
        arr_f[9] = (-f * f26 + f24 * f1 - f3 * f22) * (1.0f / f28);
        arr_f[10] = (f12 * f20 - f13 * f18 + f15 * f16) * (1.0f / f28);
        arr_f[11] = (-f8 * f20 + f18 * f9 - f11 * f16) * (1.0f / f28);
        arr_f[12] = (-f4 * f25 + f5 * f23 - f6 * f22) * (1.0f / f28);
        arr_f[13] = (f * f25 - f1 * f23 + f2 * f22) * (1.0f / f28);
        arr_f[14] = (-f12 * f19 + f13 * f17 - f14 * f16) * (1.0f / f28);
        arr_f[15] = (f8 * f19 - f9 * f17 + f10 * f16) * (1.0f / f28);
    }

    public static final long j(float[] arr_f, long v) {
        float f = Offset.p(v);
        float f1 = Offset.r(v);
        float f2 = 1.0f / (arr_f[3] * f + arr_f[7] * f1 + arr_f[15]);
        if(Float.isInfinite(f2) || Float.isNaN(f2)) {
            f2 = 0.0f;
        }
        return OffsetKt.a((arr_f[0] * f + arr_f[4] * f1 + arr_f[12]) * f2, f2 * (arr_f[1] * f + arr_f[5] * f1 + arr_f[13]));
    }

    @l
    public static final Rect k(float[] arr_f, @l Rect rect0) {
        L.p(rect0, "rect");
        long v = Matrix.j(arr_f, OffsetKt.a(rect0.t(), rect0.B()));
        long v1 = Matrix.j(arr_f, OffsetKt.a(rect0.t(), rect0.j()));
        long v2 = Matrix.j(arr_f, OffsetKt.a(rect0.x(), rect0.B()));
        long v3 = Matrix.j(arr_f, OffsetKt.a(rect0.x(), rect0.j()));
        return new Rect(Math.min(Math.min(Offset.p(v), Offset.p(v1)), Math.min(Offset.p(v2), Offset.p(v3))), Math.min(Math.min(Offset.r(v), Offset.r(v1)), Math.min(Offset.r(v2), Offset.r(v3))), Math.max(Math.max(Offset.p(v), Offset.p(v1)), Math.max(Offset.p(v2), Offset.p(v3))), Math.max(Math.max(Offset.r(v), Offset.r(v1)), Math.max(Offset.r(v2), Offset.r(v3))));
    }

    public static final void l(float[] arr_f, @l MutableRect mutableRect0) {
        L.p(mutableRect0, "rect");
        long v = Matrix.j(arr_f, OffsetKt.a(mutableRect0.d(), mutableRect0.g()));
        long v1 = Matrix.j(arr_f, OffsetKt.a(mutableRect0.d(), mutableRect0.b()));
        long v2 = Matrix.j(arr_f, OffsetKt.a(mutableRect0.e(), mutableRect0.g()));
        long v3 = Matrix.j(arr_f, OffsetKt.a(mutableRect0.e(), mutableRect0.b()));
        mutableRect0.m(Math.min(Math.min(Offset.p(v), Offset.p(v1)), Math.min(Offset.p(v2), Offset.p(v3))));
        mutableRect0.o(Math.min(Math.min(Offset.r(v), Offset.r(v1)), Math.min(Offset.r(v2), Offset.r(v3))));
        mutableRect0.n(Math.max(Math.max(Offset.p(v), Offset.p(v1)), Math.max(Offset.p(v2), Offset.p(v3))));
        mutableRect0.l(Math.max(Math.max(Offset.r(v), Offset.r(v1)), Math.max(Offset.r(v2), Offset.r(v3))));
    }

    public static final void m(float[] arr_f) {
        for(int v = 0; v < 4; ++v) {
            for(int v1 = 0; v1 < 4; ++v1) {
                arr_f[v1 * 4 + v] = v == v1 ? 1.0f : 0.0f;
            }
        }
    }

    public static final void n(float[] arr_f, float f) {
        double f1 = ((double)f) * 3.141593 / 180.0;
        float f2 = (float)Math.cos(f1);
        float f3 = (float)Math.sin(f1);
        float f4 = arr_f[1];
        float f5 = f4 * f2 - arr_f[2] * f3;
        float f6 = f4 * f3 + arr_f[2] * f2;
        float f7 = arr_f[5];
        float f8 = f7 * f2 - arr_f[6] * f3;
        float f9 = f7 * f3 + arr_f[6] * f2;
        float f10 = arr_f[9];
        float f11 = f10 * f2 - arr_f[10] * f3;
        float f12 = f10 * f3 + arr_f[10] * f2;
        float f13 = arr_f[13];
        float f14 = f13 * f2 - arr_f[14] * f3;
        float f15 = f13 * f3 + arr_f[14] * f2;
        arr_f[1] = f5;
        arr_f[2] = f6;
        arr_f[5] = f8;
        arr_f[6] = f9;
        arr_f[9] = f11;
        arr_f[10] = f12;
        arr_f[13] = f14;
        arr_f[14] = f15;
    }

    public static final void o(float[] arr_f, float f) {
        double f1 = ((double)f) * 3.141593 / 180.0;
        float f2 = (float)Math.cos(f1);
        float f3 = (float)Math.sin(f1);
        float f4 = arr_f[0];
        float f5 = f4 * f2 + arr_f[2] * f3;
        float f6 = -f4 * f3 + arr_f[2] * f2;
        float f7 = arr_f[4];
        float f8 = f7 * f2 + arr_f[6] * f3;
        float f9 = -f7 * f3 + arr_f[6] * f2;
        float f10 = arr_f[8];
        float f11 = f10 * f2 + arr_f[10] * f3;
        float f12 = -f10 * f3 + arr_f[10] * f2;
        float f13 = arr_f[12];
        float f14 = f13 * f2 + arr_f[14] * f3;
        float f15 = -f13 * f3 + arr_f[14] * f2;
        arr_f[0] = f5;
        arr_f[2] = f6;
        arr_f[4] = f8;
        arr_f[6] = f9;
        arr_f[8] = f11;
        arr_f[10] = f12;
        arr_f[12] = f14;
        arr_f[14] = f15;
    }

    public static final void p(float[] arr_f, float f) {
        double f1 = ((double)f) * 3.141593 / 180.0;
        float f2 = (float)Math.cos(f1);
        float f3 = (float)Math.sin(f1);
        float f4 = arr_f[0];
        float f5 = f2 * f4 + f3 * arr_f[4];
        float f6 = f4 * -f3 + arr_f[4] * f2;
        float f7 = arr_f[1];
        float f8 = f2 * f7 + f3 * arr_f[5];
        float f9 = f7 * -f3 + arr_f[5] * f2;
        float f10 = arr_f[2];
        float f11 = f2 * f10 + f3 * arr_f[6];
        float f12 = f10 * -f3 + arr_f[6] * f2;
        float f13 = arr_f[3];
        float f14 = f2 * f13 + f3 * arr_f[7];
        float f15 = -f3 * f13 + f2 * arr_f[7];
        arr_f[0] = f5;
        arr_f[1] = f8;
        arr_f[2] = f11;
        arr_f[3] = f14;
        arr_f[4] = f6;
        arr_f[5] = f9;
        arr_f[6] = f12;
        arr_f[7] = f15;
    }

    public static final void q(float[] arr_f, float f, float f1, float f2) {
        arr_f[0] *= f;
        arr_f[1] *= f;
        arr_f[2] *= f;
        arr_f[3] *= f;
        arr_f[4] *= f1;
        arr_f[5] *= f1;
        arr_f[6] *= f1;
        arr_f[7] *= f1;
        arr_f[8] *= f2;
        arr_f[9] *= f2;
        arr_f[10] *= f2;
        arr_f[11] *= f2;
    }

    public static void r(float[] arr_f, float f, float f1, float f2, int v, Object object0) {
        if((v & 1) != 0) {
            f = 1.0f;
        }
        if((v & 2) != 0) {
            f1 = 1.0f;
        }
        if((v & 4) != 0) {
            f2 = 1.0f;
        }
        Matrix.q(arr_f, f, f1, f2);
    }

    public static final void s(float[] arr_f, int v, int v1, float f) {
        arr_f[v * 4 + v1] = f;
    }

    public static final void t(float[] arr_f, @l float[] arr_f1) {
        L.p(arr_f1, "matrix");
        for(int v = 0; v < 16; ++v) {
            arr_f[v] = arr_f1[v];
        }
    }

    @Override
    @l
    public String toString() {
        return Matrix.v(this.a);
    }

    public static final void u(float[] arr_f, @l float[] arr_f1) {
        L.p(arr_f1, "m");
        float f = MatrixKt.b(arr_f, 0, arr_f1, 0);
        float f1 = MatrixKt.b(arr_f, 0, arr_f1, 1);
        float f2 = MatrixKt.b(arr_f, 0, arr_f1, 2);
        float f3 = MatrixKt.b(arr_f, 0, arr_f1, 3);
        float f4 = MatrixKt.b(arr_f, 1, arr_f1, 0);
        float f5 = MatrixKt.b(arr_f, 1, arr_f1, 1);
        float f6 = MatrixKt.b(arr_f, 1, arr_f1, 2);
        float f7 = MatrixKt.b(arr_f, 1, arr_f1, 3);
        float f8 = MatrixKt.b(arr_f, 2, arr_f1, 0);
        float f9 = MatrixKt.b(arr_f, 2, arr_f1, 1);
        float f10 = MatrixKt.b(arr_f, 2, arr_f1, 2);
        float f11 = MatrixKt.b(arr_f, 2, arr_f1, 3);
        float f12 = MatrixKt.b(arr_f, 3, arr_f1, 0);
        float f13 = MatrixKt.b(arr_f, 3, arr_f1, 1);
        float f14 = MatrixKt.b(arr_f, 3, arr_f1, 2);
        float f15 = MatrixKt.b(arr_f, 3, arr_f1, 3);
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
    }

    @l
    public static String v(float[] arr_f) {
        return v.p(("\n            |" + arr_f[0] + ' ' + arr_f[1] + ' ' + arr_f[2] + ' ' + arr_f[3] + "|\n            |" + arr_f[4] + ' ' + arr_f[5] + ' ' + arr_f[6] + ' ' + arr_f[7] + "|\n            |" + arr_f[8] + ' ' + arr_f[9] + ' ' + arr_f[10] + ' ' + arr_f[11] + "|\n            |" + arr_f[12] + ' ' + arr_f[13] + ' ' + arr_f[14] + ' ' + arr_f[15] + "|\n        "));
    }

    public static final void w(float[] arr_f, float f, float f1, float f2) {
        float f3 = arr_f[0] * f + arr_f[4] * f1 + arr_f[8] * f2 + arr_f[12];
        float f4 = arr_f[1] * f + arr_f[5] * f1 + arr_f[9] * f2 + arr_f[13];
        float f5 = arr_f[2] * f + arr_f[6] * f1 + arr_f[10] * f2 + arr_f[14];
        float f6 = arr_f[3] * f + arr_f[7] * f1 + arr_f[11] * f2 + arr_f[15];
        arr_f[12] = f3;
        arr_f[13] = f4;
        arr_f[14] = f5;
        arr_f[15] = f6;
    }

    public static void x(float[] arr_f, float f, float f1, float f2, int v, Object object0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        if((v & 4) != 0) {
            f2 = 0.0f;
        }
        Matrix.w(arr_f, f, f1, f2);
    }

    public final float[] y() {
        return this.a;
    }
}

