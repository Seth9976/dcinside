package androidx.compose.ui.graphics.colorspace;

import kotlin.jvm.functions.Function1;

public final class n implements DoubleFunction {
    public final Function1 a;

    public n(Function1 function10) {
        this.a = function10;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double a(double f) {
        return Rgb.I(this.a, f);
    }
}

