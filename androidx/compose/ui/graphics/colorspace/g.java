package androidx.compose.ui.graphics.colorspace;

public final class g implements DoubleFunction {
    public final Rgb a;

    public g(Rgb rgb0) {
        this.a = rgb0;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double a(double f) {
        return Rgb.P(this.a, f);
    }
}

