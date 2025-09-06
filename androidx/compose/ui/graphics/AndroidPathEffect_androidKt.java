package androidx.compose.ui.graphics;

import android.graphics.ComposePathEffect;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.PathDashPathEffect.Style;
import android.graphics.PathDashPathEffect;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nAndroidPathEffect.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPathEffect.android.kt\nandroidx/compose/ui/graphics/AndroidPathEffect_androidKt\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,66:1\n35#2,5:67\n*S KotlinDebug\n*F\n+ 1 AndroidPathEffect.android.kt\nandroidx/compose/ui/graphics/AndroidPathEffect_androidKt\n*L\n53#1:67,5\n*E\n"})
public final class AndroidPathEffect_androidKt {
    @l
    public static final PathEffect a(@l PathEffect pathEffect0, @l PathEffect pathEffect1) {
        L.p(pathEffect0, "outer");
        L.p(pathEffect1, "inner");
        return new AndroidPathEffect(new ComposePathEffect(((AndroidPathEffect)pathEffect0).a(), ((AndroidPathEffect)pathEffect1).a()));
    }

    @l
    public static final PathEffect b(float f) {
        return new AndroidPathEffect(new CornerPathEffect(f));
    }

    @l
    public static final PathEffect c(@l float[] arr_f, float f) {
        L.p(arr_f, "intervals");
        return new AndroidPathEffect(new DashPathEffect(arr_f, f));
    }

    @l
    public static final PathEffect d(@l Path path0, float f, float f1, int v) {
        L.p(path0, "shape");
        if(!(path0 instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return new AndroidPathEffect(new PathDashPathEffect(((AndroidPath)path0).w(), f, f1, AndroidPathEffect_androidKt.f(v)));
    }

    @l
    public static final android.graphics.PathEffect e(@l PathEffect pathEffect0) {
        L.p(pathEffect0, "<this>");
        return ((AndroidPathEffect)pathEffect0).a();
    }

    // 去混淆评级： 低(33)
    @l
    public static final PathDashPathEffect.Style f(int v) {
        if(StampedPathEffectStyle.g(v, 2)) {
            return PathDashPathEffect.Style.MORPH;
        }
        return StampedPathEffectStyle.g(v, 1) ? PathDashPathEffect.Style.ROTATE : PathDashPathEffect.Style.TRANSLATE;
    }

    @l
    public static final PathEffect g(@l android.graphics.PathEffect pathEffect0) {
        L.p(pathEffect0, "<this>");
        return new AndroidPathEffect(pathEffect0);
    }
}

