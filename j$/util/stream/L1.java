package j$.util.stream;

import j..util.Spliterator;
import j..util.c0;
import java.util.ArrayDeque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

abstract class l1 extends n1 implements c0 {
    @Override  // j$.util.c0
    public final void forEachRemaining(Object object0) {
        if(this.a == null) {
            return;
        }
        if(this.d == null) {
            Spliterator spliterator0 = this.c;
            if(spliterator0 == null) {
                ArrayDeque arrayDeque0 = this.b();
                I0 i00;
                while((i00 = (I0)n1.a(arrayDeque0)) != null) {
                    i00.e(object0);
                }
                this.a = null;
                return;
            }
            ((c0)spliterator0).forEachRemaining(object0);
            return;
        }
        while(this.tryAdvance(object0)) {
        }
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
        if(!this.c()) {
            return false;
        }
        boolean z = ((c0)this.d).tryAdvance(object0);
        if(!z) {
            if(this.c == null) {
                I0 i00 = (I0)n1.a(this.e);
                if(i00 != null) {
                    c0 c00 = i00.spliterator();
                    this.d = c00;
                    return c00.tryAdvance(object0);
                }
            }
            this.a = null;
        }
        return z;
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

