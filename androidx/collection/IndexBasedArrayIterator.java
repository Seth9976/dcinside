package androidx.collection;

import B3.d;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.s0;

@s0({"SMAP\nIndexBasedArrayIterator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IndexBasedArrayIterator.kt\nandroidx/collection/IndexBasedArrayIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
public abstract class IndexBasedArrayIterator implements d, Iterator {
    private int a;
    private int b;
    private boolean c;

    public IndexBasedArrayIterator(int v) {
        this.a = v;
    }

    protected abstract Object a(int arg1);

    protected abstract void b(int arg1);

    @Override
    public boolean hasNext() {
        return this.b < this.a;
    }

    @Override
    public Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = this.a(this.b);
        ++this.b;
        this.c = true;
        return object0;
    }

    @Override
    public void remove() {
        if(!this.c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int v = this.b - 1;
        this.b = v;
        this.b(v);
        --this.a;
        this.c = false;
    }
}

