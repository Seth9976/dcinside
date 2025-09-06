package androidx.compose.ui.graphics.colorspace;

public final class e implements DoubleFunction {
    public final TransferParameters a;

    public e(TransferParameters transferParameters0) {
        this.a = transferParameters0;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double a(double f) {
        return Rgb.L(this.a, f);
    }
}

