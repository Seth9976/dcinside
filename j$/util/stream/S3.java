package j$.util.stream;

import j..util.Objects;
import j..util.P;
import j..util.Spliterator;
import j..util.T;
import j..util.c0;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

final class s3 extends e3 implements T {
    @Override  // j$.util.stream.e3
    final void d() {
        Q2 q20 = new Q2();  // 初始化器: Lj$/util/stream/W2;-><init>()V
        this.h = q20;
        Objects.requireNonNull(q20);
        r3 r30 = new r3(q20, 0);
        this.e = this.b.X(r30);
        this.f = new a(5, this);
    }

    @Override  // j$.util.stream.e3
    final e3 e(Spliterator spliterator0) {
        return new s3(this.b, spliterator0, this.a);  // 初始化器: Lj$/util/stream/e3;-><init>(Lj$/util/stream/b;Lj$/util/Spliterator;Z)V
    }

    @Override  // j$.util.c0
    public final void forEachRemaining(Object object0) {
        this.forEachRemaining(((DoubleConsumer)object0));
    }

    @Override  // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer0) {
        P.a(this, consumer0);
    }

    @Override  // j$.util.T
    public final void forEachRemaining(DoubleConsumer doubleConsumer0) {
        if(this.h == null && !this.i) {
            Objects.requireNonNull(doubleConsumer0);
            this.c();
            Objects.requireNonNull(doubleConsumer0);
            r3 r30 = new r3(doubleConsumer0, 1);
            this.b.W(this.d, r30);
            this.i = true;
            return;
        }
        while(this.tryAdvance(doubleConsumer0)) {
        }
    }

    @Override  // j$.util.c0
    public final boolean tryAdvance(Object object0) {
        return this.tryAdvance(((DoubleConsumer)object0));
    }

    @Override  // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer0) {
        return P.f(this, consumer0);
    }

    @Override  // j$.util.T
    public final boolean tryAdvance(DoubleConsumer doubleConsumer0) {
        Objects.requireNonNull(doubleConsumer0);
        boolean z = this.a();
        if(z) {
            Q2 q20 = (Q2)this.h;
            long v = this.g;
            int v1 = q20.u(v);
            doubleConsumer0.accept((q20.c != 0 || v1 != 0 ? ((double[][])q20.f)[v1][((int)(v - q20.d[v1]))] : ((double[])q20.e)[((int)v)]));
        }
        return z;
    }

    @Override  // j$.util.stream.e3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (T)super.trySplit();
    }

    @Override  // j$.util.T
    public final T trySplit() {
        return (T)super.trySplit();
    }

    @Override  // j$.util.c0
    public final c0 trySplit() {
        return (T)super.trySplit();
    }
}

