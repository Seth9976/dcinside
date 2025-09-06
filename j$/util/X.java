package j$.util;

import j..com.android.tools.r8.a;
import java.util.function.DoubleConsumer;

public final class x implements DoubleConsumer {
    private double a;
    private double b;
    private long count;
    private double max;
    private double min;
    private double sum;

    public x() {
        this.min = Infinity;
        this.max = -Infinity;
    }

    @Override
    public final void accept(double f) {
        ++this.count;
        this.b += f;
        this.c(f);
        this.min = Math.min(this.min, f);
        this.max = Math.max(this.max, f);
    }

    @Override
    public final DoubleConsumer andThen(DoubleConsumer doubleConsumer0) {
        return a.a(this, doubleConsumer0);
    }

    public final void b(x x0) {
        this.count += x0.count;
        this.b += x0.b;
        this.c(x0.sum);
        this.c(x0.a);
        this.min = Math.min(this.min, x0.min);
        this.max = Math.max(this.max, x0.max);
    }

    private void c(double f) {
        double f1 = f - this.a;
        double f2 = this.sum + f1;
        this.a = f2 - this.sum - f1;
        this.sum = f2;
    }

    @Override
    public final String toString() {
        Long long0 = this.count;
        Double double0 = (double)(!Double.isNaN(this.sum + this.a) || !Double.isInfinite(this.b) ? this.sum + this.a : this.b);
        Double double1 = this.min;
        return this.count <= 0L ? String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", "x", long0, double0, double1, 0.0, this.max) : String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", "x", long0, double0, double1, ((double)((!Double.isNaN(this.sum + this.a) || !Double.isInfinite(this.b) ? this.sum + this.a : this.b) / ((double)this.count))), this.max);
    }
}

