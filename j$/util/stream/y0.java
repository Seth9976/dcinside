package j$.util.stream;

import j..util.Spliterator;
import j..util.c0;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

final class Y0 extends Q2 implements D0, y0 {
    @Override  // j$.util.stream.y0
    public final D0 a() {
        return this;
    }

    @Override  // j$.util.stream.B0
    public final J0 a() {
        return this;
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

    @Override  // j$.util.stream.I0
    public final I0 b(int v) {
        throw new IndexOutOfBoundsException();
    }

    @Override  // j$.util.stream.J0
    public final J0 b(int v) {
        this.b(v);
        throw null;
    }

    @Override  // j$.util.stream.W2, j$.util.stream.I0
    public final Object d() {
        return (double[])super.d();
    }

    @Override  // j$.util.stream.W2, j$.util.stream.I0
    public final void e(Object object0) {
        super.e(((DoubleConsumer)object0));
    }

    @Override  // j$.util.stream.J0
    public final J0 h(long v, long v1, IntFunction intFunction0) {
        return x0.t(this, v, v1);
    }

    @Override  // j$.util.stream.J0
    public final void i(Object[] arr_object, int v) {
        x0.n(this, ((Double[])arr_object), v);
    }

    @Override  // j$.util.stream.n2
    public final void k() {
    }

    @Override  // j$.util.stream.n2
    public final void l(long v) {
        this.clear();
        this.v(v);
    }

    @Override  // j$.util.stream.n2
    public final boolean n() {
        return false;
    }

    @Override  // j$.util.stream.J0
    public final Object[] o(IntFunction intFunction0) {
        return x0.m(this, intFunction0);
    }

    @Override  // j$.util.stream.k2
    public final void p(Double double0) {
        x0.e(this, double0);
    }

    @Override  // j$.util.stream.J0
    public final int q() {
        return 0;
    }

    @Override  // j$.util.stream.W2, j$.util.stream.I0
    public final void r(int v, Object object0) {
        super.r(v, ((double[])object0));
    }

    @Override  // j$.util.stream.Q2, j$.util.stream.J0
    public final Spliterator spliterator() {
        return super.y();
    }

    @Override  // j$.util.stream.I0
    public final c0 spliterator() {
        return super.y();
    }
}

