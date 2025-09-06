package androidx.compose.ui.platform;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nInvertMatrix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvertMatrix.kt\nandroidx/compose/ui/platform/InvertMatrixKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,77:1\n39#2:78\n39#2:79\n39#2:80\n39#2:81\n39#2:82\n39#2:83\n39#2:84\n39#2:85\n39#2:86\n39#2:87\n39#2:88\n39#2:89\n39#2:90\n39#2:91\n39#2:92\n39#2:93\n42#2,2:94\n42#2,2:96\n42#2,2:98\n42#2,2:100\n42#2,2:102\n42#2,2:104\n42#2,2:106\n42#2,2:108\n42#2,2:110\n42#2,2:112\n42#2,2:114\n42#2,2:116\n42#2,2:118\n42#2,2:120\n42#2,2:122\n42#2,2:124\n*S KotlinDebug\n*F\n+ 1 InvertMatrix.kt\nandroidx/compose/ui/platform/InvertMatrixKt\n*L\n26#1:78\n27#1:79\n28#1:80\n29#1:81\n30#1:82\n31#1:83\n32#1:84\n33#1:85\n34#1:86\n35#1:87\n36#1:88\n37#1:89\n38#1:90\n39#1:91\n40#1:92\n41#1:93\n60#1:94,2\n61#1:96,2\n62#1:98,2\n63#1:100,2\n64#1:102,2\n65#1:104,2\n66#1:106,2\n67#1:108,2\n68#1:110,2\n69#1:112,2\n70#1:114,2\n71#1:116,2\n72#1:118,2\n73#1:120,2\n74#1:122,2\n75#1:124,2\n*E\n"})
public final class InvertMatrixKt {
    public static final boolean a(@l float[] arr_f, @l float[] arr_f1) {
        L.p(arr_f, "$this$invertTo");
        L.p(arr_f1, "other");
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
            return false;
        }
        arr_f1[0] = (f5 * f27 - f6 * f26 + f7 * f25) * (1.0f / f28);
        arr_f1[1] = (-f1 * f27 + f2 * f26 - f3 * f25) * (1.0f / f28);
        arr_f1[2] = (f13 * f21 - f14 * f20 + f15 * f19) * (1.0f / f28);
        arr_f1[3] = (-f9 * f21 + f10 * f20 - f11 * f19) * (1.0f / f28);
        arr_f1[4] = (-f4 * f27 + f6 * f24 - f7 * f23) * (1.0f / f28);
        arr_f1[5] = (f27 * f - f2 * f24 + f3 * f23) * (1.0f / f28);
        arr_f1[6] = (-f12 * f21 + f14 * f18 - f15 * f17) * (1.0f / f28);
        arr_f1[7] = (f21 * f8 - f10 * f18 + f11 * f17) * (1.0f / f28);
        arr_f1[8] = (f4 * f26 - f5 * f24 + f7 * f22) * (1.0f / f28);
        arr_f1[9] = (-f * f26 + f24 * f1 - f3 * f22) * (1.0f / f28);
        arr_f1[10] = (f12 * f20 - f13 * f18 + f15 * f16) * (1.0f / f28);
        arr_f1[11] = (-f8 * f20 + f18 * f9 - f11 * f16) * (1.0f / f28);
        arr_f1[12] = (-f4 * f25 + f5 * f23 - f6 * f22) * (1.0f / f28);
        arr_f1[13] = (f * f25 - f1 * f23 + f2 * f22) * (1.0f / f28);
        arr_f1[14] = (-f12 * f19 + f13 * f17 - f14 * f16) * (1.0f / f28);
        arr_f1[15] = (f8 * f19 - f9 * f17 + f10 * f16) * (1.0f / f28);
        return true;
    }
}

