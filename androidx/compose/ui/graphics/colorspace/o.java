package androidx.compose.ui.graphics.colorspace;

public final class o implements DoubleFunction {
    public final TransferParameters a;

    public o(TransferParameters transferParameters0) {
        this.a = transferParameters0;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double a(double f) {
        return Rgb.J(this.a, f);
    }
}

