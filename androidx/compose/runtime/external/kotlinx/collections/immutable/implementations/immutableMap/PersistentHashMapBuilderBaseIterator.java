package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import B3.d;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.v0;
import y4.l;
import y4.m;

public class PersistentHashMapBuilderBaseIterator extends PersistentHashMapBaseIterator implements d, Iterator {
    @l
    private final PersistentHashMapBuilder d;
    @m
    private Object e;
    private boolean f;
    private int g;

    public PersistentHashMapBuilderBaseIterator(@l PersistentHashMapBuilder persistentHashMapBuilder0, @l TrieNodeBaseIterator[] arr_trieNodeBaseIterator) {
        L.p(persistentHashMapBuilder0, "builder");
        L.p(arr_trieNodeBaseIterator, "path");
        super(persistentHashMapBuilder0.h(), arr_trieNodeBaseIterator);
        this.d = persistentHashMapBuilder0;
        this.g = persistentHashMapBuilder0.g();
    }

    private final void j() {
        if(this.d.g() != this.g) {
            throw new ConcurrentModificationException();
        }
    }

    private final void k() {
        if(!this.f) {
            throw new IllegalStateException();
        }
    }

    private final void l(int v, TrieNode trieNode0, Object object0, int v1) {
        if(v1 * 5 > 30) {
            this.f()[v1].k(trieNode0.s(), trieNode0.s().length, 0);
            while(!L.g(this.f()[v1].a(), object0)) {
                this.f()[v1].h();
            }
            this.i(v1);
            return;
        }
        int v2 = v >> v1 * 5 & 0x1F;
        if(trieNode0.t(1 << v2)) {
            this.f()[v1].k(trieNode0.s(), trieNode0.p() * 2, trieNode0.q(1 << v2));
            this.i(v1);
            return;
        }
        int v3 = trieNode0.R(1 << v2);
        TrieNode trieNode1 = trieNode0.Q(v3);
        this.f()[v1].k(trieNode0.s(), trieNode0.p() * 2, v3);
        this.l(v, trieNode1, object0, v1 + 1);
    }

    public final void m(Object object0, Object object1) {
        if(!this.d.containsKey(object0)) {
            return;
        }
        if(this.hasNext()) {
            Object object2 = this.b();
            this.d.put(object0, object1);
            this.l((object2 == null ? 0 : object2.hashCode()), this.d.h(), object2, 0);
        }
        else {
            this.d.put(object0, object1);
        }
        this.g = this.d.g();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator
    public Object next() {
        this.j();
        this.e = this.b();
        this.f = true;
        return super.next();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator
    public void remove() {
        this.k();
        if(this.hasNext()) {
            Object object0 = this.b();
            Object object1 = this.e;
            v0.k(this.d).remove(object1);
            this.l((object0 == null ? 0 : object0.hashCode()), this.d.h(), object0, 0);
        }
        else {
            Object object2 = this.e;
            v0.k(this.d).remove(object2);
        }
        this.e = null;
        this.f = false;
        this.g = this.d.g();
    }
}

