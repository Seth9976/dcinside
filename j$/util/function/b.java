package j$.util.function;

import j..com.android.tools.r8.a;
import java.util.function.DoubleConsumer;

public final class b implements DoubleConsumer {
    public final DoubleConsumer a;
    public final DoubleConsumer b;

    public b(DoubleConsumer doubleConsumer0, DoubleConsumer doubleConsumer1) {
        this.a = doubleConsumer0;
        this.b = doubleConsumer1;
    }

    @Override
    public final void accept(double f) {
        this.a.accept(f);
        this.b.accept(f);
    }

    @Override
    public final DoubleConsumer andThen(DoubleConsumer doubleConsumer0) {
        return a.a(this, doubleConsumer0);
    }
}

