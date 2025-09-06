package j$.util.stream;

import j..util.Objects;
import j..util.P;
import j..util.Spliterator;
import j..util.W;
import j..util.c0;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

final class u3 extends e3 implements W {
    @Override  // j$.util.stream.e3
    final void d() {
        S2 s20 = new S2();  // 初始化器: Lj$/util/stream/W2;-><init>()V
        this.h = s20;
        Objects.requireNonNull(s20);
        t3 t30 = new t3(s20, 0);
        this.e = this.b.X(t30);
        this.f = new a(6, this);
    }

    @Override  // j$.util.stream.e3
    final e3 e(Spliterator spliterator0) {
        return new u3(this.b, spliterator0, this.a);  // 初始化器: Lj$/util/stream/e3;-><init>(Lj$/util/stream/b;Lj$/util/Spliterator;Z)V
    }

    @Override  // j$.util.c0
    public final void forEachRemaining(Object object0) {
        this.forEachRemaining(((IntConsumer)object0));
    }

    @Override  // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer0) {
        P.b(this, consumer0);
    }

    @Override  // j$.util.W
    public final void forEachRemaining(IntConsumer intConsumer0) {
        if(this.h == null && !this.i) {
            Objects.requireNonNull(intConsumer0);
            this.c();
            Objects.requireNonNull(intConsumer0);
            t3 t30 = new t3(intConsumer0, 1);
            this.b.W(this.d, t30);
            this.i = true;
            return;
        }
        while(this.tryAdvance(intConsumer0)) {
        }
    }

    @Override  // j$.util.c0
    public final boolean tryAdvance(Object object0) {
        return this.tryAdvance(((IntConsumer)object0));
    }

    @Override  // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer0) {
        return P.g(this, consumer0);
    }

    @Override  // j$.util.W
    public final boolean tryAdvance(IntConsumer intConsumer0) {
        Objects.requireNonNull(intConsumer0);
        boolean z = this.a();
        if(z) {
            S2 s20 = (S2)this.h;
            long v = this.g;
            int v1 = s20.u(v);
            intConsumer0.accept((s20.c != 0 || v1 != 0 ? ((int[][])s20.f)[v1][((int)(v - s20.d[v1]))] : ((int[])s20.e)[((int)v)]));
        }
        return z;
    }

    @Override  // j$.util.stream.e3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (W)super.trySplit();
    }

    @Override  // j$.util.W
    public final W trySplit() {
        return (W)super.trySplit();
    }

    @Override  // j$.util.c0
    public final c0 trySplit() {
        return (W)super.trySplit();
    }
}

