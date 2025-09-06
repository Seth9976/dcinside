package androidx.compose.ui.platform;

import A3.o;
import android.graphics.Matrix;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class RenderNodeLayer.Companion.getMatrix.1 extends N implements o {
    public static final RenderNodeLayer.Companion.getMatrix.1 e;

    static {
        RenderNodeLayer.Companion.getMatrix.1.e = new RenderNodeLayer.Companion.getMatrix.1();
    }

    RenderNodeLayer.Companion.getMatrix.1() {
        super(2);
    }

    public final void a(@l DeviceRenderNode deviceRenderNode0, @l Matrix matrix0) {
        L.p(deviceRenderNode0, "rn");
        L.p(matrix0, "matrix");
        deviceRenderNode0.s(matrix0);
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        this.a(((DeviceRenderNode)object0), ((Matrix)object1));
        return S0.a;
    }
}

