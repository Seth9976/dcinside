package j$.util.stream;

import j..com.android.tools.r8.a;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

public final class r3 implements k2 {
    public final int a;
    public final DoubleConsumer b;

    public r3(DoubleConsumer doubleConsumer0, int v) {
        this.a = v;
        this.b = doubleConsumer0;
        super();
    }

    @Override  // j$.util.stream.k2
    public final void accept(double f) {
        if(this.a != 0) {
            this.b.accept(f);
            return;
        }
        ((Q2)this.b).accept(f);
    }

    @Override  // j$.util.stream.n2
    public final void accept(int v) {
        if(this.a != 0) {
            x0.k();
            throw null;
        }
        x0.k();
        throw null;
    }

    @Override  // j$.util.stream.n2
    public final void accept(long v) {
        if(this.a != 0) {
            x0.l();
            throw null;
        }
        x0.l();
        throw null;
    }

    @Override
    public final void accept(Object object0) {
        if(this.a != 0) {
            x0.f(this, object0);
            return;
        }
        x0.f(this, object0);
    }

    @Override
    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }

    @Override
    public final DoubleConsumer andThen(DoubleConsumer doubleConsumer0) {
        return a.a(this, doubleConsumer0);
    }

    private final void b(long v) {
    }

    private final void c(long v) {
    }

    private final void d() {
    }

    private final void e() {
    }

    @Override  // j$.util.stream.n2
    public final void k() {
    }

    @Override  // j$.util.stream.n2
    public final void l(long v) {
    }

    @Override  // j$.util.stream.n2
    public final boolean n() {
        return false;
    }

    @Override  // j$.util.stream.k2
    public final void p(Double double0) {
        if(this.a != 0) {
            x0.e(this, double0);
            return;
        }
        x0.e(this, double0);
    }
}

