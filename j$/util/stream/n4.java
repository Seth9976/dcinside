package j$.util.stream;

import j..util.Spliterator;
import j..util.function.Consumer.-CC;
import java.util.function.Consumer;
import java.util.function.Predicate;

final class n4 extends o4 implements Consumer {
    final Predicate e;
    Object f;
    public final int g;

    public n4(Spliterator spliterator0, n4 n40, int v) {
        this.g = v;
        super(spliterator0, n40);
        this.e = n40.e;
    }

    public n4(Spliterator spliterator0, Predicate predicate0, int v) {
        this.g = v;
        super(spliterator0);
        this.e = predicate0;
    }

    @Override
    public final void accept(Object object0) {
        this.d = this.d + 1 & 0x3F;
        this.f = object0;
    }

    @Override
    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }

    @Override  // j$.util.stream.o4
    final Spliterator c(Spliterator spliterator0) {
        return this.g == 0 ? new n4(spliterator0, this, 0) : new n4(spliterator0, this, 1);
    }

    @Override  // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer0) {
        boolean z;
        if(this.g != 0) {
            if(!this.c || !this.b() || !this.a.tryAdvance(this)) {
                z = true;
            }
            else {
                z = this.e.test(this.f);
                if(z) {
                    consumer0.accept(this.f);
                    return true;
                }
            }
            this.c = false;
            if(!z) {
                this.b.set(true);
            }
            return false;
        }
        Spliterator spliterator0 = this.a;
        if(this.c) {
            boolean z1 = false;
            this.c = false;
            while(true) {
                boolean z2 = spliterator0.tryAdvance(this);
                if(!z2 || !this.b() || !this.e.test(this.f)) {
                    break;
                }
                z1 = true;
            }
            if(z2) {
                if(z1) {
                    this.b.set(true);
                }
                consumer0.accept(this.f);
                return true;
            }
            return false;
        }
        return spliterator0.tryAdvance(consumer0);
    }

    @Override  // j$.util.stream.o4
    public Spliterator trySplit() {
        if(this.g != 1) {
            return super.trySplit();
        }
        return this.b.get() ? null : super.trySplit();
    }
}

