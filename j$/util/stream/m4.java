package j$.util.stream;

import j..com.android.tools.r8.a;
import j..util.P;
import j..util.Spliterator;
import j..util.Z;
import j..util.c0;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

final class m4 extends o4 implements Z, LongConsumer {
    long e;
    public final int f;

    public m4(Spliterator spliterator0, int v) {
        this.f = v;
        super(spliterator0);
    }

    public m4(Spliterator spliterator0, o4 o40, int v) {
        this.f = v;
        super(spliterator0, o40);
    }

    @Override
    public final void accept(long v) {
        this.d = this.d + 1 & 0x3F;
        this.e = v;
    }

    @Override
    public final LongConsumer andThen(LongConsumer longConsumer0) {
        return a.c(this, longConsumer0);
    }

    @Override  // j$.util.stream.o4
    final Spliterator c(Spliterator spliterator0) {
        return this.f == 0 ? new m4(((Z)spliterator0), this, 0) : new m4(((Z)spliterator0), this, 1);
    }

    @Override  // j$.util.c0
    public final void forEachRemaining(Object object0) {
        this.forEachRemaining(((LongConsumer)object0));
    }

    @Override  // j$.util.stream.o4, j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer0) {
        P.c(this, consumer0);
    }

    @Override  // j$.util.Z
    public final void forEachRemaining(LongConsumer longConsumer0) {
        while(this.tryAdvance(longConsumer0)) {
        }
    }

    @Override  // j$.util.c0
    public boolean tryAdvance(Object object0) {
        if(this.f != 1) {
            return this.tryAdvance(((LongConsumer)object0));
        }
        this.tryAdvance(((LongConsumer)object0));
        return false;
    }

    @Override  // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer0) {
        return P.h(this, consumer0);
    }

    @Override  // j$.util.Z
    public final boolean tryAdvance(LongConsumer longConsumer0) {
        if(this.f != 0) {
            if(this.c && this.b() && ((Z)this.a).tryAdvance(this)) {
                throw new NullPointerException();
            }
            this.c = false;
            return false;
        }
        Spliterator spliterator0 = this.a;
        if(this.c) {
            this.c = false;
            boolean z = ((Z)spliterator0).tryAdvance(this);
            if(z && this.b()) {
                throw new NullPointerException();
            }
            if(z) {
                longConsumer0.accept(this.e);
                return true;
            }
            return false;
        }
        return ((Z)spliterator0).tryAdvance(longConsumer0);
    }

    @Override  // j$.util.stream.o4, j$.util.Spliterator
    public Spliterator trySplit() {
        return this.f != 1 ? super.trySplit() : this.trySplit();
    }

    @Override  // j$.util.stream.o4, j$.util.Z
    public Z trySplit() {
        if(this.f != 1) {
            return super.trySplit();
        }
        return this.b.get() ? null : ((Z)super.trySplit());
    }

    @Override  // j$.util.stream.o4, j$.util.c0
    public c0 trySplit() {
        return this.f != 1 ? super.trySplit() : this.trySplit();
    }
}

