package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.h;
import kotlin.jvm.internal.L;
import y4.l;

public final class PersistentHashSetBuilder extends h implements Builder {
    @l
    private PersistentHashSet a;
    @l
    private MutabilityOwnership b;
    @l
    private TrieNode c;
    private int d;
    private int e;

    public PersistentHashSetBuilder(@l PersistentHashSet persistentHashSet0) {
        L.p(persistentHashSet0, "set");
        super();
        this.a = persistentHashSet0;
        this.b = new MutabilityOwnership();
        this.c = this.a.c();
        this.e = this.a.size();
    }

    @Override  // kotlin.collections.h
    public int a() {
        return this.e;
    }

    @Override  // kotlin.collections.h
    public boolean add(Object object0) {
        this.c = this.c.u((object0 == null ? 0 : object0.hashCode()), object0, 0, this);
        return false;
    }

    @Override
    public boolean addAll(@l Collection collection0) {
        L.p(collection0, "elements");
        PersistentHashSet persistentHashSet0 = collection0 instanceof PersistentHashSet ? ((PersistentHashSet)collection0) : null;
        if(persistentHashSet0 == null) {
            PersistentHashSetBuilder persistentHashSetBuilder0 = collection0 instanceof PersistentHashSetBuilder ? ((PersistentHashSetBuilder)collection0) : null;
            persistentHashSet0 = persistentHashSetBuilder0 == null ? null : persistentHashSetBuilder0.b();
        }
        if(persistentHashSet0 != null) {
            DeltaCounter deltaCounter0 = new DeltaCounter(0, 1, null);
            int v = this.size();
            TrieNode trieNode0 = this.c.v(persistentHashSet0.c(), 0, deltaCounter0, this);
            int v1 = collection0.size() + v - deltaCounter0.d();
            if(v != v1) {
                this.c = trieNode0;
                this.h(v1);
            }
            return v != this.size();
        }
        return super.addAll(collection0);
    }

    @l
    public PersistentHashSet b() {
        PersistentHashSet persistentHashSet0;
        if(this.c == this.a.c()) {
            persistentHashSet0 = this.a;
        }
        else {
            this.b = new MutabilityOwnership();
            persistentHashSet0 = new PersistentHashSet(this.c, this.size());
        }
        this.a = persistentHashSet0;
        return persistentHashSet0;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection$Builder
    public PersistentCollection build() {
        return this.b();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet$Builder
    public PersistentSet build() {
        return this.b();
    }

    public final int c() {
        return this.d;
    }

    @Override
    public void clear() {
        TrieNode trieNode0 = TrieNode.d.a();
        L.n(trieNode0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
        this.c = trieNode0;
        this.h(0);
    }

    @Override
    public boolean contains(Object object0) {
        TrieNode trieNode0 = this.c;
        return object0 == null ? trieNode0.i(0, null, 0) : trieNode0.i(object0.hashCode(), object0, 0);
    }

    @Override
    public boolean containsAll(@l Collection collection0) {
        L.p(collection0, "elements");
        if(collection0 instanceof PersistentHashSet) {
            return this.c.j(((PersistentHashSet)collection0).c(), 0);
        }
        return collection0 instanceof PersistentHashSetBuilder ? this.c.j(((PersistentHashSetBuilder)collection0).c, 0) : super.containsAll(collection0);
    }

    @l
    public final TrieNode d() {
        return this.c;
    }

    @l
    public final MutabilityOwnership g() {
        return this.b;
    }

    public void h(int v) {
        this.e = v;
        ++this.d;
    }

    @Override
    @l
    public Iterator iterator() {
        return new PersistentHashSetMutableIterator(this);
    }

    @Override
    public boolean remove(Object object0) {
        this.c = this.c.E((object0 == null ? 0 : object0.hashCode()), object0, 0, this);
        return false;
    }

    @Override
    public boolean removeAll(@l Collection collection0) {
        L.p(collection0, "elements");
        PersistentHashSet persistentHashSet0 = collection0 instanceof PersistentHashSet ? ((PersistentHashSet)collection0) : null;
        if(persistentHashSet0 == null) {
            PersistentHashSetBuilder persistentHashSetBuilder0 = collection0 instanceof PersistentHashSetBuilder ? ((PersistentHashSetBuilder)collection0) : null;
            persistentHashSet0 = persistentHashSetBuilder0 == null ? null : persistentHashSetBuilder0.b();
        }
        if(persistentHashSet0 != null) {
            DeltaCounter deltaCounter0 = new DeltaCounter(0, 1, null);
            int v = this.size();
            Object object0 = this.c.F(persistentHashSet0.c(), 0, deltaCounter0, this);
            int v1 = v - deltaCounter0.d();
            if(v1 == 0) {
                this.clear();
                return v != this.size();
            }
            if(v1 != v) {
                L.n(object0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
                this.c = (TrieNode)object0;
                this.h(v1);
            }
            return v != this.size();
        }
        return super.removeAll(collection0);
    }

    @Override
    public boolean retainAll(@l Collection collection0) {
        L.p(collection0, "elements");
        PersistentHashSet persistentHashSet0 = collection0 instanceof PersistentHashSet ? ((PersistentHashSet)collection0) : null;
        if(persistentHashSet0 == null) {
            PersistentHashSetBuilder persistentHashSetBuilder0 = collection0 instanceof PersistentHashSetBuilder ? ((PersistentHashSetBuilder)collection0) : null;
            persistentHashSet0 = persistentHashSetBuilder0 == null ? null : persistentHashSetBuilder0.b();
        }
        if(persistentHashSet0 != null) {
            DeltaCounter deltaCounter0 = new DeltaCounter(0, 1, null);
            int v = this.size();
            Object object0 = this.c.H(persistentHashSet0.c(), 0, deltaCounter0, this);
            int v1 = deltaCounter0.d();
            if(v1 == 0) {
                this.clear();
                return v != this.size();
            }
            if(v1 != v) {
                L.n(object0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
                this.c = (TrieNode)object0;
                this.h(v1);
            }
            return v != this.size();
        }
        return super.retainAll(collection0);
    }
}

