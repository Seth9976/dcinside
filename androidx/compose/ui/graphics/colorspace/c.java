package androidx.compose.ui.graphics.colorspace;

public final class c implements DoubleFunction {
    public final Rgb a;

    public c(Rgb rgb0) {
        this.a = rgb0;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double a(double f) {
        return Rgb.j0(this.a, f);
    }
}

