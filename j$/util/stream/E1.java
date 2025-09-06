package j$.util.stream;

import j..util.function.Consumer.-CC;
import java.util.Arrays;
import java.util.function.Consumer;

final class e1 extends M0 implements B0 {
    @Override  // j$.util.stream.B0
    public final J0 a() {
        Object[] arr_object = this.a;
        if(this.b < arr_object.length) {
            throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", this.b, ((int)arr_object.length)));
        }
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

    @Override  // j$.util.stream.n2
    public final void accept(long v) {
        x0.l();
        throw null;
    }

    @Override
    public final void accept(Object object0) {
        int v = this.b;
        Object[] arr_object = this.a;
        if(v >= arr_object.length) {
            throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", ((int)arr_object.length)));
        }
        this.b = v + 1;
        arr_object[v] = object0;
    }

    @Override
    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }

    @Override  // j$.util.stream.n2
    public final void k() {
        Object[] arr_object = this.a;
        if(this.b < arr_object.length) {
            throw new IllegalStateException(String.format("End size %d is less than fixed size %d", this.b, ((int)arr_object.length)));
        }
    }

    @Override  // j$.util.stream.n2
    public final void l(long v) {
        Object[] arr_object = this.a;
        if(v != ((long)arr_object.length)) {
            throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", v, ((int)arr_object.length)));
        }
        this.b = 0;
    }

    @Override  // j$.util.stream.n2
    public final boolean n() {
        return false;
    }

    @Override  // j$.util.stream.M0
    public final String toString() {
        return String.format("FixedNodeBuilder[%d][%s]", ((int)(this.a.length - this.b)), Arrays.toString(this.a));
    }
}

