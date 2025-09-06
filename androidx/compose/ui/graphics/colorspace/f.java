package androidx.compose.ui.graphics.colorspace;

public final class f implements DoubleFunction {
    public final TransferParameters a;

    public f(TransferParameters transferParameters0) {
        this.a = transferParameters0;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double a(double f) {
        return Rgb.M(this.a, f);
    }
}

