package j$.util.stream;

import j..com.android.tools.r8.a;
import j..util.P;
import j..util.Spliterator;
import j..util.W;
import j..util.c0;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

final class l4 extends o4 implements W, IntConsumer {
    int e;
    public final int f;

    public l4(Spliterator spliterator0, int v) {
        this.f = v;
        super(spliterator0);
    }

    public l4(Spliterator spliterator0, o4 o40, int v) {
        this.f = v;
        super(spliterator0, o40);
    }

    @Override
    public final void accept(int v) {
        this.d = this.d + 1 & 0x3F;
        this.e = v;
    }

    @Override
    public final IntConsumer andThen(IntConsumer intConsumer0) {
        return a.b(this, intConsumer0);
    }

    @Override  // j$.util.stream.o4
    final Spliterator c(Spliterator spliterator0) {
        return this.f == 0 ? new l4(((W)spliterator0), this, 0) : new l4(((W)spliterator0), this, 1);
    }

    @Override  // j$.util.c0
    public final void forEachRemaining(Object object0) {
        this.forEachRemaining(((IntConsumer)object0));
    }

    @Override  // j$.util.stream.o4, j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer0) {
        P.b(this, consumer0);
    }

    @Override  // j$.util.W
    public final void forEachRemaining(IntConsumer intConsumer0) {
        while(this.tryAdvance(intConsumer0)) {
        }
    }

    @Override  // j$.util.c0
    public boolean tryAdvance(Object object0) {
        if(this.f != 1) {
            return this.tryAdvance(((IntConsumer)object0));
        }
        this.tryAdvance(((IntConsumer)object0));
        return false;
    }

    @Override  // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer0) {
        return P.g(this, consumer0);
    }

    @Override  // j$.util.W
    public final boolean tryAdvance(IntConsumer intConsumer0) {
        if(this.f != 0) {
            if(this.c && this.b() && ((W)this.a).tryAdvance(this)) {
                throw new NullPointerException();
            }
            this.c = false;
            return false;
        }
        Spliterator spliterator0 = this.a;
        if(this.c) {
            this.c = false;
            boolean z = ((W)spliterator0).tryAdvance(this);
            if(z && this.b()) {
                throw new NullPointerException();
            }
            if(z) {
                intConsumer0.accept(this.e);
                return true;
            }
            return false;
        }
        return ((W)spliterator0).tryAdvance(intConsumer0);
    }

    @Override  // j$.util.stream.o4, j$.util.Spliterator
    public Spliterator trySplit() {
        return this.f != 1 ? super.trySplit() : this.trySplit();
    }

    @Override  // j$.util.stream.o4, j$.util.W
    public W trySplit() {
        if(this.f != 1) {
            return super.trySplit();
        }
        return this.b.get() ? null : ((W)super.trySplit());
    }

    @Override  // j$.util.stream.o4, j$.util.c0
    public c0 trySplit() {
        return this.f != 1 ? super.trySplit() : this.trySplit();
    }
}

