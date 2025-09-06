package androidx.compose.ui.platform;

import A3.o;
import android.graphics.Matrix;
import android.view.View;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class ViewLayer.Companion.getMatrix.1 extends N implements o {
    public static final ViewLayer.Companion.getMatrix.1 e;

    static {
        ViewLayer.Companion.getMatrix.1.e = new ViewLayer.Companion.getMatrix.1();
    }

    ViewLayer.Companion.getMatrix.1() {
        super(2);
    }

    public final void a(@l View view0, @l Matrix matrix0) {
        L.p(view0, "view");
        L.p(matrix0, "matrix");
        matrix0.set(view0.getMatrix());
    }

    @Override  // A3.o
    public Object invoke(Object object0, Object object1) {
        this.a(((View)object0), ((Matrix)object1));
        return S0.a;
    }
}

