package j$.util.stream;

import j..util.Objects;
import j..util.P;
import j..util.Spliterator;
import j..util.Z;
import j..util.c0;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

final class w3 extends e3 implements Z {
    @Override  // j$.util.stream.e3
    final void d() {
        U2 u20 = new U2();  // 初始化器: Lj$/util/stream/W2;-><init>()V
        this.h = u20;
        Objects.requireNonNull(u20);
        v3 v30 = new v3(u20, 0);
        this.e = this.b.X(v30);
        this.f = new a(7, this);
    }

    @Override  // j$.util.stream.e3
    final e3 e(Spliterator spliterator0) {
        return new w3(this.b, spliterator0, this.a);  // 初始化器: Lj$/util/stream/e3;-><init>(Lj$/util/stream/b;Lj$/util/Spliterator;Z)V
    }

    @Override  // j$.util.c0
    public final void forEachRemaining(Object object0) {
        this.forEachRemaining(((LongConsumer)object0));
    }

    @Override  // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer0) {
        P.c(this, consumer0);
    }

    @Override  // j$.util.Z
    public final void forEachRemaining(LongConsumer longConsumer0) {
        if(this.h == null && !this.i) {
            Objects.requireNonNull(longConsumer0);
            this.c();
            Objects.requireNonNull(longConsumer0);
            v3 v30 = new v3(longConsumer0, 1);
            this.b.W(this.d, v30);
            this.i = true;
            return;
        }
        while(this.tryAdvance(longConsumer0)) {
        }
    }

    @Override  // j$.util.c0
    public final boolean tryAdvance(Object object0) {
        return this.tryAdvance(((LongConsumer)object0));
    }

    @Override  // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer0) {
        return P.h(this, consumer0);
    }

    @Override  // j$.util.Z
    public final boolean tryAdvance(LongConsumer longConsumer0) {
        Objects.requireNonNull(longConsumer0);
        boolean z = this.a();
        if(z) {
            U2 u20 = (U2)this.h;
            long v = this.g;
            int v1 = u20.u(v);
            longConsumer0.accept((u20.c != 0 || v1 != 0 ? ((long[][])u20.f)[v1][((int)(v - u20.d[v1]))] : ((long[])u20.e)[((int)v)]));
        }
        return z;
    }

    @Override  // j$.util.stream.e3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (Z)super.trySplit();
    }

    @Override  // j$.util.Z
    public final Z trySplit() {
        return (Z)super.trySplit();
    }

    @Override  // j$.util.c0
    public final c0 trySplit() {
        return (Z)super.trySplit();
    }
}

