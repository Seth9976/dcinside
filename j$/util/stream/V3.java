package j$.util.stream;

import j..com.android.tools.r8.a;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

public final class v3 implements m2 {
    public final int a;
    public final LongConsumer b;

    public v3(LongConsumer longConsumer0, int v) {
        this.a = v;
        this.b = longConsumer0;
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

    @Override  // j$.util.stream.n2
    public final void accept(int v) {
        if(this.a != 0) {
            x0.k();
            throw null;
        }
        x0.k();
        throw null;
    }

    @Override  // j$.util.stream.m2
    public final void accept(long v) {
        if(this.a != 0) {
            this.b.accept(v);
            return;
        }
        ((U2)this.b).accept(v);
    }

    @Override
    public final void accept(Object object0) {
        if(this.a != 0) {
            x0.j(this, object0);
            return;
        }
        x0.j(this, object0);
    }

    @Override
    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }

    @Override
    public final LongConsumer andThen(LongConsumer longConsumer0) {
        return a.c(this, longConsumer0);
    }

    private final void b(long v) {
    }

    private final void c(long v) {
    }

    private final void d() {
    }

    private final void e() {
    }

    @Override  // j$.util.stream.m2
    public final void j(Long long0) {
        if(this.a != 0) {
            x0.i(this, long0);
            return;
        }
        x0.i(this, long0);
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
}

