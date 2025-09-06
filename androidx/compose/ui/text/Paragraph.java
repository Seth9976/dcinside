package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.List;
import y4.l;
import y4.m;

public interface Paragraph {
    @l
    List A();

    float B(int arg1);

    void C(@l Canvas arg1, long arg2, @m Shadow arg3, @m TextDecoration arg4);

    float a();

    float b();

    @l
    Rect c(int arg1);

    @l
    ResolvedTextDirection d(int arg1);

    float e(int arg1);

    long f(int arg1);

    float g();

    float getHeight();

    float getWidth();

    int h(long arg1);

    int i(int arg1);

    int j(int arg1, boolean arg2);

    float k(int arg1);

    int l(float arg1);

    float m(int arg1);

    float n(int arg1);

    @l
    Rect o(int arg1);

    @ExperimentalTextApi
    void p(@l Canvas arg1, long arg2, @m Shadow arg3, @m TextDecoration arg4, @m DrawStyle arg5, int arg6);

    boolean q(int arg1);

    int r();

    float s(int arg1);

    boolean t();

    @l
    Path u(int arg1, int arg2);

    float v(int arg1, boolean arg2);

    @ExperimentalTextApi
    void w(@l Canvas arg1, @l Brush arg2, float arg3, @m Shadow arg4, @m TextDecoration arg5, @m DrawStyle arg6, int arg7);

    float x();

    int y(int arg1);

    @l
    ResolvedTextDirection z(int arg1);
}

