package androidx.compose.ui.graphics.colorspace;

public final class d implements DoubleFunction {
    public final TransferParameters a;

    public d(TransferParameters transferParameters0) {
        this.a = transferParameters0;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double a(double f) {
        return Rgb.K(this.a, f);
    }
}

