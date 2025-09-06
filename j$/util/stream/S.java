package j$.util.stream;

import j..com.android.tools.r8.a;
import java.util.function.DoubleConsumer;

public final class s implements DoubleConsumer {
    public final n2 a;

    public s(n2 n20) {
        this.a = n20;
    }

    @Override
    public final void accept(double f) {
        this.a.accept(f);
    }

    @Override
    public final DoubleConsumer andThen(DoubleConsumer doubleConsumer0) {
        return a.a(this, doubleConsumer0);
    }
}

