package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import B3.a;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import y4.l;

public class PersistentHashSetIterator implements a, Iterator {
    @l
    private final List a;
    private int b;
    private boolean c;

    public PersistentHashSetIterator(@l TrieNode trieNode0) {
        L.p(trieNode0, "node");
        super();
        List list0 = u.S(new TrieNodeIterator[]{new TrieNodeIterator()});
        this.a = list0;
        this.c = true;
        TrieNodeIterator.i(((TrieNodeIterator)list0.get(0)), trieNode0.n(), 0, 2, null);
        this.b = 0;
        this.b();
    }

    protected final Object a() {
        return ((TrieNodeIterator)this.a.get(this.b)).a();
    }

    private final void b() {
        if(((TrieNodeIterator)this.a.get(this.b)).d()) {
            return;
        }
        for(int v = this.b; -1 < v; --v) {
            int v1 = this.g(v);
            if(v1 == -1 && ((TrieNodeIterator)this.a.get(v)).c()) {
                ((TrieNodeIterator)this.a.get(v)).f();
                v1 = this.g(v);
            }
            if(v1 != -1) {
                this.b = v1;
                return;
            }
            if(v > 0) {
                ((TrieNodeIterator)this.a.get(v - 1)).f();
            }
            ((TrieNodeIterator)this.a.get(v)).h(TrieNode.d.a().n(), 0);
        }
        this.c = false;
    }

    private static void c() {
    }

    @l
    protected final List d() {
        return this.a;
    }

    protected final int f() {
        return this.b;
    }

    private final int g(int v) {
        if(((TrieNodeIterator)this.a.get(v)).d()) {
            return v;
        }
        if(((TrieNodeIterator)this.a.get(v)).e()) {
            TrieNode trieNode0 = ((TrieNodeIterator)this.a.get(v)).b();
            if(v + 1 == this.a.size()) {
                TrieNodeIterator trieNodeIterator0 = new TrieNodeIterator();
                this.a.add(trieNodeIterator0);
            }
            TrieNodeIterator.i(((TrieNodeIterator)this.a.get(v + 1)), trieNode0.n(), 0, 2, null);
            return this.g(v + 1);
        }
        return -1;
    }

    protected final void h(int v) {
        this.b = v;
    }

    @Override
    public boolean hasNext() {
        return this.c;
    }

    @Override
    public Object next() {
        if(!this.c) {
            throw new NoSuchElementException();
        }
        Object object0 = ((TrieNodeIterator)this.a.get(this.b)).g();
        this.b();
        return object0;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

