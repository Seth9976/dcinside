package j$.util.stream;

import j..util.Spliterator;
import j..util.function.Consumer.-CC;
import java.util.concurrent.CountedCompleter;
import java.util.function.Consumer;

abstract class v1 extends CountedCompleter implements n2 {
    protected final Spliterator a;
    protected final b b;
    protected final long c;
    protected long d;
    protected long e;
    protected int f;
    protected int g;

    v1(Spliterator spliterator0, b b0, int v) {
        this.a = spliterator0;
        this.b = b0;
        this.c = e.g(spliterator0.estimateSize());
        this.d = 0L;
        this.e = (long)v;
    }

    v1(v1 v10, Spliterator spliterator0, long v, long v1, int v2) {
        super(v10);
        this.a = spliterator0;
        this.b = v10.b;
        this.c = v10.c;
        this.d = v;
        this.e = v1;
        if(v < 0L || v1 < 0L || v + v1 - 1L >= ((long)v2)) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", v, v, v1, v2));
        }
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

    abstract v1 b(Spliterator arg1, long arg2, long arg3);

    @Override
    public final void compute() {
        Spliterator spliterator0 = this.a;
        v1 v10;
        for(v10 = this; spliterator0.estimateSize() > v10.c; v10 = v10.b(spliterator0, v10.d + v, v10.e - v)) {
            Spliterator spliterator1 = spliterator0.trySplit();
            if(spliterator1 == null) {
                break;
            }
            v10.setPendingCount(1);
            long v = spliterator1.estimateSize();
            v10.b(spliterator1, v10.d, v).fork();
        }
        v10.b.W(spliterator0, v10);
        v10.propagateCompletion();
    }

    @Override  // j$.util.stream.n2
    public final void k() {
    }

    @Override  // j$.util.stream.n2
    public final void l(long v) {
        long v1 = this.e;
        if(v > v1) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        this.f = (int)this.d;
        this.g = ((int)this.d) + ((int)v1);
    }

    @Override  // j$.util.stream.n2
    public final boolean n() {
        return false;
    }
}

