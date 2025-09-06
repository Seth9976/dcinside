package j$.util.stream;

import j..com.android.tools.r8.a;
import j..util.P;
import j..util.Spliterator;
import j..util.T;
import j..util.c0;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

final class k4 extends o4 implements T, DoubleConsumer {
    double e;
    public final int f;

    public k4(Spliterator spliterator0, int v) {
        this.f = v;
        super(spliterator0);
    }

    public k4(Spliterator spliterator0, o4 o40, int v) {
        this.f = v;
        super(spliterator0, o40);
    }

    @Override
    public final void accept(double f) {
        this.d = this.d + 1 & 0x3F;
        this.e = f;
    }

    @Override
    public final DoubleConsumer andThen(DoubleConsumer doubleConsumer0) {
        return a.a(this, doubleConsumer0);
    }

    @Override  // j$.util.stream.o4
    final Spliterator c(Spliterator spliterator0) {
        return this.f == 0 ? new k4(((T)spliterator0), this, 0) : new k4(((T)spliterator0), this, 1);
    }

    @Override  // j$.util.c0
    public final void forEachRemaining(Object object0) {
        this.forEachRemaining(((DoubleConsumer)object0));
    }

    @Override  // j$.util.stream.o4, j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer0) {
        P.a(this, consumer0);
    }

    @Override  // j$.util.T
    public final void forEachRemaining(DoubleConsumer doubleConsumer0) {
        while(this.tryAdvance(doubleConsumer0)) {
        }
    }

    @Override  // j$.util.c0
    public boolean tryAdvance(Object object0) {
        if(this.f != 1) {
            return this.tryAdvance(((DoubleConsumer)object0));
        }
        this.tryAdvance(((DoubleConsumer)object0));
        return false;
    }

    @Override  // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer0) {
        return P.f(this, consumer0);
    }

    @Override  // j$.util.T
    public final boolean tryAdvance(DoubleConsumer doubleConsumer0) {
        if(this.f != 0) {
            if(this.c && this.b() && ((T)this.a).tryAdvance(this)) {
                throw new NullPointerException();
            }
            this.c = false;
            return false;
        }
        Spliterator spliterator0 = this.a;
        if(this.c) {
            this.c = false;
            boolean z = ((T)spliterator0).tryAdvance(this);
            if(z && this.b()) {
                throw new NullPointerException();
            }
            if(z) {
                doubleConsumer0.accept(this.e);
                return true;
            }
            return false;
        }
        return ((T)spliterator0).tryAdvance(doubleConsumer0);
    }

    @Override  // j$.util.stream.o4, j$.util.Spliterator
    public Spliterator trySplit() {
        return this.f != 1 ? super.trySplit() : this.trySplit();
    }

    @Override  // j$.util.stream.o4, j$.util.T
    public T trySplit() {
        if(this.f != 1) {
            return super.trySplit();
        }
        return this.b.get() ? null : ((T)super.trySplit());
    }

    @Override  // j$.util.stream.o4, j$.util.c0
    public c0 trySplit() {
        return this.f != 1 ? super.trySplit() : this.trySplit();
    }
}

