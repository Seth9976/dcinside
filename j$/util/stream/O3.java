package j$.util.stream;

import j..util.c0;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

abstract class o3 extends p3 implements c0 {
    @Override  // j$.util.c0
    public final void forEachRemaining(Object object0) {
        ((c0)this.a()).forEachRemaining(object0);
    }

    public void forEachRemaining(DoubleConsumer doubleConsumer0) {
        this.forEachRemaining(doubleConsumer0);
    }

    public void forEachRemaining(IntConsumer intConsumer0) {
        this.forEachRemaining(intConsumer0);
    }

    public void forEachRemaining(LongConsumer longConsumer0) {
        this.forEachRemaining(longConsumer0);
    }

    @Override  // j$.util.c0
    public final boolean tryAdvance(Object object0) {
        return ((c0)this.a()).tryAdvance(object0);
    }

    public boolean tryAdvance(DoubleConsumer doubleConsumer0) {
        return this.tryAdvance(doubleConsumer0);
    }

    public boolean tryAdvance(IntConsumer intConsumer0) {
        return this.tryAdvance(intConsumer0);
    }

    public boolean tryAdvance(LongConsumer longConsumer0) {
        return this.tryAdvance(longConsumer0);
    }
}

