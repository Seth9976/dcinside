package j$.util;

import j..util.function.Consumer.-CC;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

final class e0 implements Iterator, Consumer {
    boolean a;
    Object b;
    final Spliterator c;

    e0(Spliterator spliterator0) {
        this.c = spliterator0;
        this.a = false;
    }

    @Override
    public final void accept(Object object0) {
        this.a = true;
        this.b = object0;
    }

    @Override
    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }

    @Override
    public final boolean hasNext() {
        if(!this.a) {
            this.c.tryAdvance(this);
        }
        return this.a;
    }

    @Override
    public final Object next() {
        if(!this.a && !this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }
}

