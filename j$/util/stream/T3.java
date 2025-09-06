package j$.util.stream;

import j..com.android.tools.r8.a;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public final class t3 implements l2 {
    public final int a;
    public final IntConsumer b;

    public t3(IntConsumer intConsumer0, int v) {
        this.a = v;
        this.b = intConsumer0;
        super();
    }

    @Override  // j$.util.stream.n2
    public final void accept(double f) {
        if(this.a != 0) {
            x0.a();
            throw null;
        }
        x0.a();
        throw null;
    }

    @Override  // j$.util.stream.l2
    public final void accept(int v) {
        if(this.a != 0) {
            this.b.accept(v);
            return;
        }
        ((S2)this.b).accept(v);
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
            x0.h(this, object0);
            return;
        }
        x0.h(this, object0);
    }

    @Override
    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }

    @Override
    public final IntConsumer andThen(IntConsumer intConsumer0) {
        return a.b(this, intConsumer0);
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

    @Override  // j$.util.stream.l2
    public final void m(Integer integer0) {
        if(this.a != 0) {
            x0.g(this, integer0);
            return;
        }
        x0.g(this, integer0);
    }

    @Override  // j$.util.stream.n2
    public final boolean n() {
        return false;
    }
}

