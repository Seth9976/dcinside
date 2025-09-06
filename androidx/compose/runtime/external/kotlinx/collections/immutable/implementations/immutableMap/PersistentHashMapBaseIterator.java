package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import B3.a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.L;
import y4.l;

public abstract class PersistentHashMapBaseIterator implements a, Iterator {
    @l
    private final TrieNodeBaseIterator[] a;
    private int b;
    private boolean c;

    public PersistentHashMapBaseIterator(@l TrieNode trieNode0, @l TrieNodeBaseIterator[] arr_trieNodeBaseIterator) {
        L.p(trieNode0, "node");
        L.p(arr_trieNodeBaseIterator, "path");
        super();
        this.a = arr_trieNodeBaseIterator;
        this.c = true;
        arr_trieNodeBaseIterator[0].j(trieNode0.s(), trieNode0.p() * 2);
        this.b = 0;
        this.c();
    }

    private final void a() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
    }

    protected final Object b() {
        this.a();
        return this.a[this.b].a();
    }

    private final void c() {
        if(this.a[this.b].f()) {
            return;
        }
        for(int v = this.b; -1 < v; --v) {
            int v1 = this.h(v);
            if(v1 == -1 && this.a[v].g()) {
                this.a[v].i();
                v1 = this.h(v);
            }
            if(v1 != -1) {
                this.b = v1;
                return;
            }
            if(v > 0) {
                this.a[v - 1].i();
            }
            this.a[v].j(TrieNode.e.a().s(), 0);
        }
        this.c = false;
    }

    private static void d() {
    }

    @l
    protected final TrieNodeBaseIterator[] f() {
        return this.a;
    }

    protected final int g() {
        return this.b;
    }

    private final int h(int v) {
        if(this.a[v].f()) {
            return v;
        }
        if(this.a[v].g()) {
            TrieNode trieNode0 = this.a[v].b();
            if(v == 6) {
                this.a[7].j(trieNode0.s(), trieNode0.s().length);
                return this.h(7);
            }
            this.a[v + 1].j(trieNode0.s(), trieNode0.p() * 2);
            return this.h(v + 1);
        }
        return -1;
    }

    @Override
    public boolean hasNext() {
        return this.c;
    }

    protected final void i(int v) {
        this.b = v;
    }

    @Override
    public Object next() {
        this.a();
        Object object0 = this.a[this.b].next();
        this.c();
        return object0;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

