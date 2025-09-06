package androidx.compose.ui.graphics;

import android.graphics.BitmapShader;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build.VERSION;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nAndroidShader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,205:1\n69#2,6:206\n*S KotlinDebug\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n*L\n141#1:206,6\n*E\n"})
public final class AndroidShader_androidKt {
    @l
    public static final Shader a(@l ImageBitmap imageBitmap0, int v, int v1) {
        L.p(imageBitmap0, "image");
        return new BitmapShader(AndroidImageBitmap_androidKt.b(imageBitmap0), AndroidTileMode_androidKt.b(v), AndroidTileMode_androidKt.b(v1));
    }

    @l
    public static final Shader b(long v, long v1, @l List list0, @m List list1, int v2) {
        L.p(list0, "colors");
        AndroidShader_androidKt.h(list0, list1);
        int v3 = AndroidShader_androidKt.e(list0);
        return new LinearGradient(Offset.p(v), Offset.r(v), Offset.p(v1), Offset.r(v1), AndroidShader_androidKt.f(list0, v3), AndroidShader_androidKt.g(list1, list0, v3), AndroidTileMode_androidKt.b(v2));
    }

    @l
    public static final Shader c(long v, float f, @l List list0, @m List list1, int v1) {
        L.p(list0, "colors");
        AndroidShader_androidKt.h(list0, list1);
        int v2 = AndroidShader_androidKt.e(list0);
        return new RadialGradient(Offset.p(v), Offset.r(v), f, AndroidShader_androidKt.f(list0, v2), AndroidShader_androidKt.g(list1, list0, v2), AndroidTileMode_androidKt.b(v1));
    }

    @l
    public static final Shader d(long v, @l List list0, @m List list1) {
        L.p(list0, "colors");
        AndroidShader_androidKt.h(list0, list1);
        int v1 = AndroidShader_androidKt.e(list0);
        return new SweepGradient(Offset.p(v), Offset.r(v), AndroidShader_androidKt.f(list0, v1), AndroidShader_androidKt.g(list1, list0, v1));
    }

    @VisibleForTesting
    public static final int e(@l List list0) {
        L.p(list0, "colors");
        int v = 0;
        if(Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int v1 = u.J(list0);
        for(int v2 = 1; v2 < v1; ++v2) {
            if(Color.A(((Color)list0.get(v2)).M()) == 0.0f) {
                ++v;
            }
        }
        return v;
    }

    @VisibleForTesting
    @l
    public static final int[] f(@l List list0, int v) {
        L.p(list0, "colors");
        int v1 = 0;
        if(Build.VERSION.SDK_INT >= 26) {
            int v2 = list0.size();
            int[] arr_v = new int[v2];
            while(v1 < v2) {
                arr_v[v1] = ColorKt.r(((Color)list0.get(v1)).M());
                ++v1;
            }
            return arr_v;
        }
        int[] arr_v1 = new int[list0.size() + v];
        int v3 = u.J(list0);
        int v4 = list0.size();
        int v5 = 0;
        while(v1 < v4) {
            long v6 = ((Color)list0.get(v1)).M();
            if(Color.A(v6) != 0.0f) {
                arr_v1[v5] = ColorKt.r(v6);
                ++v5;
            }
            else if(v1 == 0) {
                arr_v1[v5] = ColorKt.r(Color.w(((Color)list0.get(1)).M(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                ++v5;
            }
            else if(v1 == v3) {
                arr_v1[v5] = ColorKt.r(Color.w(((Color)list0.get(v1 - 1)).M(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                ++v5;
            }
            else {
                int v7 = v5 + 1;
                arr_v1[v5] = ColorKt.r(Color.w(((Color)list0.get(v1 - 1)).M(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                v5 += 2;
                arr_v1[v7] = ColorKt.r(Color.w(((Color)list0.get(v1 + 1)).M(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
            }
            ++v1;
        }
        return arr_v1;
    }

    @VisibleForTesting
    @m
    public static final float[] g(@m List list0, @l List list1, int v) {
        L.p(list1, "colors");
        if(v == 0) {
            return list0 == null ? null : u.S5(list0);
        }
        float[] arr_f = new float[list1.size() + v];
        arr_f[0] = list0 == null ? 0.0f : ((Number)list0.get(0)).floatValue();
        int v1 = u.J(list1);
        int v3 = 1;
        for(int v2 = 1; v2 < v1; ++v2) {
            long v4 = ((Color)list1.get(v2)).M();
            float f = list0 == null ? ((float)v2) / ((float)u.J(list1)) : ((Number)list0.get(v2)).floatValue();
            int v5 = v3 + 1;
            arr_f[v3] = f;
            if(Color.A(v4) == 0.0f) {
                v3 += 2;
                arr_f[v5] = f;
            }
            else {
                v3 = v5;
            }
        }
        arr_f[v3] = list0 == null ? 1.0f : ((Number)list0.get(u.J(list1))).floatValue();
        return arr_f;
    }

    private static final void h(List list0, List list1) {
        if(list1 == null) {
            if(list0.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
            return;
        }
        if(list0.size() != list1.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}

