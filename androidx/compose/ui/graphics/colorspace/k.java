package androidx.compose.ui.graphics.colorspace;

public final class k implements DoubleFunction {
    public final double a;

    public k(double f) {
        this.a = f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double a(double f) {
        return Rgb.D(this.a, f);
    }
}

