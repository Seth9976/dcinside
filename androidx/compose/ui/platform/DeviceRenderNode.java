package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import kotlin.jvm.functions.Function1;
import y4.l;
import y4.m;

public interface DeviceRenderNode {
    void A(float arg1);

    void B(float arg1);

    void C(float arg1);

    void D(@m Outline arg1);

    void E(boolean arg1);

    float F();

    float G();

    void H(@l Matrix arg1);

    boolean I(int arg1, int arg2, int arg3, int arg4);

    void J();

    int K();

    boolean L();

    int M();

    float N();

    float O();

    int P();

    void Q(int arg1);

    void R(float arg1);

    void S(@l CanvasHolder arg1, @m Path arg2, @l Function1 arg3);

    void T(@m RenderEffect arg1);

    void U(int arg1);

    float V();

    void W(float arg1);

    float X();

    float Y();

    long a();

    void a0(float arg1);

    void b(@l Canvas arg1);

    float b0();

    int c();

    int d();

    void e(boolean arg1);

    void f(float arg1);

    void g(int arg1);

    int getHeight();

    int getWidth();

    boolean h();

    float i();

    void j(float arg1);

    float k();

    @m
    RenderEffect l();

    float m();

    void n(float arg1);

    @l
    DeviceRenderNodeData o();

    boolean p();

    void q(int arg1);

    boolean r(boolean arg1);

    void s(@l Matrix arg1);

    float t();

    void u(int arg1);

    int v();

    void w(float arg1);

    void x(float arg1);

    void y(float arg1);

    int z();
}

