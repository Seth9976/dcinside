package androidx.compose.ui.platform;

import android.content.res.Configuration;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.compose.ui.InternalComposeUiApi;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,1941:1\n42#2,2:1942\n42#2,2:1944\n42#2,2:1946\n42#2,2:1948\n42#2,2:1950\n42#2,2:1952\n42#2,2:1954\n42#2,2:1956\n42#2,2:1958\n42#2,2:1960\n42#2,2:1962\n42#2,2:1964\n42#2,2:1966\n42#2,2:1968\n42#2,2:1970\n42#2,2:1972\n39#2:1974\n39#2:1975\n39#2:1976\n39#2:1977\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n*L\n1838#1:1942,2\n1839#1:1944,2\n1840#1:1946,2\n1841#1:1948,2\n1842#1:1950,2\n1843#1:1952,2\n1844#1:1954,2\n1845#1:1956,2\n1846#1:1958,2\n1847#1:1960,2\n1848#1:1962,2\n1849#1:1964,2\n1850#1:1966,2\n1851#1:1968,2\n1852#1:1970,2\n1853#1:1972,2\n1858#1:1974\n1859#1:1975\n1860#1:1976\n1861#1:1977\n*E\n"})
public final class AndroidComposeView_androidKt {
    @RestrictTo({Scope.b})
    @l
    private static Function1 a;

    static {
        AndroidComposeView_androidKt.a = AndroidComposeView_androidKt.textInputServiceFactory.1.e;
    }

    private static final float c(float[] arr_f, int v, float[] arr_f1, int v1) {
        return arr_f[v * 4] * arr_f1[v1] + arr_f[v * 4 + 1] * arr_f1[v1 + 4] + arr_f[v * 4 + 2] * arr_f1[v1 + 8] + arr_f[v * 4 + 3] * arr_f1[v1 + 12];
    }

    @l
    public static final LayoutDirection d(@l Configuration configuration0) {
        L.p(configuration0, "<this>");
        return AndroidComposeView_androidKt.g(configuration0.getLayoutDirection());
    }

    @l
    public static final Function1 e() {
        return AndroidComposeView_androidKt.a;
    }

    @InternalComposeUiApi
    public static void f() {
    }

    private static final LayoutDirection g(int v) {
        switch(v) {
            case 0: {
                return LayoutDirection.a;
            }
            case 1: {
                return LayoutDirection.b;
            }
            default: {
                return LayoutDirection.a;
            }
        }
    }

    private static final void h(float[] arr_f, float[] arr_f1) {
        float f = AndroidComposeView_androidKt.c(arr_f1, 0, arr_f, 0);
        float f1 = AndroidComposeView_androidKt.c(arr_f1, 0, arr_f, 1);
        float f2 = AndroidComposeView_androidKt.c(arr_f1, 0, arr_f, 2);
        float f3 = AndroidComposeView_androidKt.c(arr_f1, 0, arr_f, 3);
        float f4 = AndroidComposeView_androidKt.c(arr_f1, 1, arr_f, 0);
        float f5 = AndroidComposeView_androidKt.c(arr_f1, 1, arr_f, 1);
        float f6 = AndroidComposeView_androidKt.c(arr_f1, 1, arr_f, 2);
        float f7 = AndroidComposeView_androidKt.c(arr_f1, 1, arr_f, 3);
        float f8 = AndroidComposeView_androidKt.c(arr_f1, 2, arr_f, 0);
        float f9 = AndroidComposeView_androidKt.c(arr_f1, 2, arr_f, 1);
        float f10 = AndroidComposeView_androidKt.c(arr_f1, 2, arr_f, 2);
        float f11 = AndroidComposeView_androidKt.c(arr_f1, 2, arr_f, 3);
        float f12 = AndroidComposeView_androidKt.c(arr_f1, 3, arr_f, 0);
        float f13 = AndroidComposeView_androidKt.c(arr_f1, 3, arr_f, 1);
        float f14 = AndroidComposeView_androidKt.c(arr_f1, 3, arr_f, 2);
        float f15 = AndroidComposeView_androidKt.c(arr_f1, 3, arr_f, 3);
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

    public static final void i(@l Function1 function10) {
        L.p(function10, "<set-?>");
        AndroidComposeView_androidKt.a = function10;
    }
}

