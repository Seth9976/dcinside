package j$.util.stream;

import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

abstract class t0 implements n2 {
    boolean a;
    boolean b;

    t0(u0 u00) {
        this.b = !u00.b;
    }

    @Override  // j$.util.stream.n2
    public void accept(double f) {
        x0.a();
        throw null;
    }

    @Override  // j$.util.stream.n2
    public void accept(int v) {
        x0.k();
        throw null;
    }

    @Override  // j$.util.stream.n2
    public void accept(long v) {
        x0.l();
        throw null;
    }

    @Override
    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }

    @Override  // j$.util.stream.n2
    public final void k() {
    }

    @Override  // j$.util.stream.n2
    public final void l(long v) {
    }

    @Override  // j$.util.stream.n2
    public final boolean n() {
        return this.a;
    }
}

