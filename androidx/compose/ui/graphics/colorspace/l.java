package androidx.compose.ui.graphics.colorspace;

public final class l implements DoubleFunction {
    public final double a;

    public l(double f) {
        this.a = f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double a(double f) {
        return Rgb.E(this.a, f);
    }
}

