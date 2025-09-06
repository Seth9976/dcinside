package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import B3.d;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.v0;
import y4.l;
import y4.m;

public final class PersistentHashSetMutableIterator extends PersistentHashSetIterator implements d, Iterator {
    @l
    private final PersistentHashSetBuilder d;
    @m
    private Object e;
    private boolean f;
    private int g;

    public PersistentHashSetMutableIterator(@l PersistentHashSetBuilder persistentHashSetBuilder0) {
        L.p(persistentHashSetBuilder0, "builder");
        super(persistentHashSetBuilder0.d());
        this.d = persistentHashSetBuilder0;
        this.g = persistentHashSetBuilder0.c();
    }

    private final void i() {
        if(this.d.c() != this.g) {
            throw new ConcurrentModificationException();
        }
    }

    private final void j() {
        if(!this.f) {
            throw new IllegalStateException();
        }
    }

    private final boolean k(TrieNode trieNode0) {
        return trieNode0.m() == 0;
    }

    private final void l(int v, TrieNode trieNode0, Object object0, int v1) {
        if(this.k(trieNode0)) {
            int v2 = kotlin.collections.l.If(trieNode0.n(), object0);
            ((TrieNodeIterator)this.d().get(v1)).h(trieNode0.n(), v2);
            this.h(v1);
            return;
        }
        int v3 = trieNode0.q(1 << (v >> v1 * 5 & 0x1F));
        ((TrieNodeIterator)this.d().get(v1)).h(trieNode0.n(), v3);
        Object object1 = trieNode0.n()[v3];
        if(object1 instanceof TrieNode) {
            this.l(v, ((TrieNode)object1), object0, v1 + 1);
            return;
        }
        this.h(v1);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetIterator
    public Object next() {
        this.i();
        Object object0 = super.next();
        this.e = object0;
        this.f = true;
        return object0;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetIterator
    public void remove() {
        this.j();
        if(this.hasNext()) {
            Object object0 = this.a();
            Object object1 = this.e;
            v0.a(this.d).remove(object1);
            this.l((object0 == null ? 0 : object0.hashCode()), this.d.d(), object0, 0);
        }
        else {
            Object object2 = this.e;
            v0.a(this.d).remove(object2);
        }
        this.e = null;
        this.f = false;
        this.g = this.d.c();
    }
}

