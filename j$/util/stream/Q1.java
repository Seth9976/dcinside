package j$.util.stream;

import j..util.Spliterator;
import j..util.c0;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

final class q1 extends U2 implements A0, H0 {
    @Override  // j$.util.stream.A0
    public final H0 a() {
        return this;
    }

    @Override  // j$.util.stream.B0
    public final J0 a() {
        return this;
    }

    @Override  // j$.util.stream.n2
    public final void accept(double f) {
        x0.a();
        throw null;
    }

    @Override  // j$.util.stream.n2
    public final void accept(int v) {
        x0.k();
        throw null;
    }

    @Override
    public final void accept(Object object0) {
        x0.j(this, object0);
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
        return (long[])super.d();
    }

    @Override  // j$.util.stream.W2, j$.util.stream.I0
    public final void e(Object object0) {
        super.e(((LongConsumer)object0));
    }

    @Override  // j$.util.stream.J0
    public final J0 h(long v, long v1, IntFunction intFunction0) {
        return x0.v(this, v, v1);
    }

    @Override  // j$.util.stream.J0
    public final void i(Object[] arr_object, int v) {
        x0.p(this, ((Long[])arr_object), v);
    }

    @Override  // j$.util.stream.m2
    public final void j(Long long0) {
        x0.i(this, long0);
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

    @Override  // j$.util.stream.J0
    public final int q() {
        return 0;
    }

    @Override  // j$.util.stream.W2, j$.util.stream.I0
    public final void r(int v, Object object0) {
        super.r(v, ((long[])object0));
    }

    @Override  // j$.util.stream.U2, j$.util.stream.J0
    public final Spliterator spliterator() {
        return super.y();
    }

    @Override  // j$.util.stream.I0
    public final c0 spliterator() {
        return super.y();
    }
}

