package androidx.compose.ui.node;

import A3.a;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;
import y4.l;
import y4.m;

public interface OwnedLayer {
    void a(@l MutableRect arg1, boolean arg2);

    void b(@l Canvas arg1);

    void c(@l Function1 arg1, @l a arg2);

    void d(@l float[] arg1);

    void destroy();

    void e(float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10, long arg11, @l Shape arg12, boolean arg13, @m RenderEffect arg14, long arg15, long arg16, int arg17, @l LayoutDirection arg18, @l Density arg19);

    long f(long arg1, boolean arg2);

    void g(long arg1);

    boolean h(long arg1);

    void i(@l float[] arg1);

    void invalidate();

    void j(long arg1);

    void k();
}

