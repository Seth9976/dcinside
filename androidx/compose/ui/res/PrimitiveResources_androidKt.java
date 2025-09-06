package androidx.compose.ui.res;

import android.content.Context;
import androidx.annotation.ArrayRes;
import androidx.annotation.BoolRes;
import androidx.annotation.DimenRes;
import androidx.annotation.IntegerRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nPrimitiveResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimitiveResources.android.kt\nandroidx/compose/ui/res/PrimitiveResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,82:1\n76#2:83\n76#2:84\n76#2:85\n76#2:86\n76#2:87\n*S KotlinDebug\n*F\n+ 1 PrimitiveResources.android.kt\nandroidx/compose/ui/res/PrimitiveResources_androidKt\n*L\n38#1:83\n51#1:84\n64#1:85\n77#1:86\n78#1:87\n*E\n"})
public final class PrimitiveResources_androidKt {
    @Composable
    @ReadOnlyComposable
    public static final boolean a(@BoolRes int v, @m Composer composer0, int v1) {
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xE63A2F31, v1, -1, "androidx.compose.ui.res.booleanResource (PrimitiveResources.android.kt:62)");
        }
        boolean z = ((Context)composer0.L(AndroidCompositionLocals_androidKt.g())).getResources().getBoolean(v);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return z;
    }

    @Composable
    @ReadOnlyComposable
    public static final float b(@DimenRes int v, @m Composer composer0, int v1) {
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x2FF10657, v1, -1, "androidx.compose.ui.res.dimensionResource (PrimitiveResources.android.kt:75)");
        }
        Context context0 = (Context)composer0.L(AndroidCompositionLocals_androidKt.g());
        Density density0 = (Density)composer0.L(CompositionLocalsKt.i());
        float f = Dp.g(context0.getResources().getDimension(v) / density0.getDensity());
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return f;
    }

    @Composable
    @ReadOnlyComposable
    @l
    public static final int[] c(@ArrayRes int v, @m Composer composer0, int v1) {
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xFA65CCAA, v1, -1, "androidx.compose.ui.res.integerArrayResource (PrimitiveResources.android.kt:49)");
        }
        int[] arr_v = ((Context)composer0.L(AndroidCompositionLocals_androidKt.g())).getResources().getIntArray(v);
        L.o(arr_v, "context.resources.getIntArray(id)");
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return arr_v;
    }

    @Composable
    @ReadOnlyComposable
    public static final int d(@IntegerRes int v, @m Composer composer0, int v1) {
        if(ComposerKt.g0()) {
            ComposerKt.w0(916701108, v1, -1, "androidx.compose.ui.res.integerResource (PrimitiveResources.android.kt:36)");
        }
        int v2 = ((Context)composer0.L(AndroidCompositionLocals_androidKt.g())).getResources().getInteger(v);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        return v2;
    }
}

