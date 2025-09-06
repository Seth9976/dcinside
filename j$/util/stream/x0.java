package j$.util.stream;

import j..com.android.tools.r8.a;
import j..util.function.Consumer.-CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

final class X0 extends W0 implements y0 {
    @Override  // j$.util.stream.y0
    public final D0 a() {
        double[] arr_f = this.a;
        if(this.b < arr_f.length) {
            throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", this.b, ((int)arr_f.length)));
        }
        return this;
    }

    @Override  // j$.util.stream.B0
    public final J0 a() {
        this.a();
        return this;
    }

    @Override  // j$.util.stream.k2, j$.util.stream.n2
    public final void accept(double f) {
        int v = this.b;
        double[] arr_f = this.a;
        if(v >= arr_f.length) {
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", ((int)arr_f.length)));
        }
        this.b = v + 1;
        arr_f[v] = f;
    }

    @Override  // j$.util.stream.n2
    public final void accept(int v) {
        x0.k();
        throw null;
    }

    @Override  // j$.util.stream.n2
    public final void accept(long v) {
        x0.l();
        throw null;
    }

    @Override
    public final void accept(Object object0) {
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

    @Override  // j$.util.stream.n2
    public final void k() {
        double[] arr_f = this.a;
        if(this.b < arr_f.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", this.b, ((int)arr_f.length)));
        }
    }

    @Override  // j$.util.stream.n2
    public final void l(long v) {
        double[] arr_f = this.a;
        if(v != ((long)arr_f.length)) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", v, ((int)arr_f.length)));
        }
        this.b = 0;
    }

    @Override  // j$.util.stream.n2
    public final boolean n() {
        return false;
    }

    @Override  // j$.util.stream.k2
    public final void p(Double double0) {
        x0.e(this, double0);
    }

    @Override  // j$.util.stream.W0
    public final String toString() {
        return String.format("DoubleFixedNodeBuilder[%d][%s]", ((int)(this.a.length - this.b)), Arrays.toString(this.a));
    }
}

