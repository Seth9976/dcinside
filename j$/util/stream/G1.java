package j$.util.stream;

import j..com.android.tools.r8.a;
import j..util.function.Consumer.-CC;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

final class g1 extends f1 implements z0 {
    @Override  // j$.util.stream.z0
    public final F0 a() {
        int[] arr_v = this.a;
        if(this.b < arr_v.length) {
            throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", this.b, ((int)arr_v.length)));
        }
        return this;
    }

    @Override  // j$.util.stream.B0
    public final J0 a() {
        this.a();
        return this;
    }

    @Override  // j$.util.stream.n2
    public final void accept(double f) {
        x0.a();
        throw null;
    }

    @Override  // j$.util.stream.l2, j$.util.stream.n2
    public final void accept(int v) {
        int v1 = this.b;
        int[] arr_v = this.a;
        if(v1 >= arr_v.length) {
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", ((int)arr_v.length)));
        }
        this.b = v1 + 1;
        arr_v[v1] = v;
    }

    @Override  // j$.util.stream.n2
    public final void accept(long v) {
        x0.l();
        throw null;
    }

    @Override
    public final void accept(Object object0) {
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

    @Override  // j$.util.stream.n2
    public final void k() {
        int[] arr_v = this.a;
        if(this.b < arr_v.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", this.b, ((int)arr_v.length)));
        }
    }

    @Override  // j$.util.stream.n2
    public final void l(long v) {
        int[] arr_v = this.a;
        if(v != ((long)arr_v.length)) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", v, ((int)arr_v.length)));
        }
        this.b = 0;
    }

    @Override  // j$.util.stream.l2
    public final void m(Integer integer0) {
        x0.g(this, integer0);
    }

    @Override  // j$.util.stream.n2
    public final boolean n() {
        return false;
    }

    @Override  // j$.util.stream.f1
    public final String toString() {
        return String.format("IntFixedNodeBuilder[%d][%s]", ((int)(this.a.length - this.b)), Arrays.toString(this.a));
    }
}

