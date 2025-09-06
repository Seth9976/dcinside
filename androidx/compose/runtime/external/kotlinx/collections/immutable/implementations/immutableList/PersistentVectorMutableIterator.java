package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import B3.f;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.jvm.internal.L;
import kotlin.ranges.s;
import y4.l;
import y4.m;

public final class PersistentVectorMutableIterator extends AbstractListIterator implements f, ListIterator {
    @l
    private final PersistentVectorBuilder c;
    private int d;
    @m
    private TrieIterator e;
    private int f;

    public PersistentVectorMutableIterator(@l PersistentVectorBuilder persistentVectorBuilder0, int v) {
        L.p(persistentVectorBuilder0, "builder");
        super(v, persistentVectorBuilder0.size());
        this.c = persistentVectorBuilder0;
        this.d = persistentVectorBuilder0.g();
        this.f = -1;
        this.k();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator
    public void add(Object object0) {
        this.h();
        this.c.add(this.c(), object0);
        this.f(this.c() + 1);
        this.j();
    }

    private final void h() {
        if(this.d != this.c.g()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void i() {
        if(this.f == -1) {
            throw new IllegalStateException();
        }
    }

    private final void j() {
        this.g(this.c.size());
        this.d = this.c.g();
        this.f = -1;
        this.k();
    }

    private final void k() {
        Object[] arr_object = this.c.h();
        if(arr_object == null) {
            this.e = null;
            return;
        }
        int v = UtilsKt.d(this.c.size());
        int v1 = s.B(this.c(), v);
        int v2 = this.c.i() / 5 + 1;
        TrieIterator trieIterator0 = this.e;
        if(trieIterator0 == null) {
            this.e = new TrieIterator(arr_object, v1, v, v2);
            return;
        }
        L.m(trieIterator0);
        trieIterator0.k(arr_object, v1, v, v2);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator
    public Object next() {
        this.h();
        this.a();
        this.f = this.c();
        TrieIterator trieIterator0 = this.e;
        if(trieIterator0 == null) {
            int v = this.c();
            this.f(v + 1);
            return this.c.j()[v];
        }
        if(trieIterator0.hasNext()) {
            this.f(this.c() + 1);
            return trieIterator0.next();
        }
        int v1 = this.c();
        this.f(v1 + 1);
        return this.c.j()[v1 - trieIterator0.d()];
    }

    @Override
    public Object previous() {
        this.h();
        this.b();
        this.f = this.c() - 1;
        TrieIterator trieIterator0 = this.e;
        if(trieIterator0 == null) {
            this.f(this.c() - 1);
            return this.c.j()[this.c()];
        }
        if(this.c() > trieIterator0.d()) {
            this.f(this.c() - 1);
            return this.c.j()[this.c() - trieIterator0.d()];
        }
        this.f(this.c() - 1);
        return trieIterator0.previous();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator
    public void remove() {
        this.h();
        this.i();
        this.c.remove(this.f);
        if(this.f < this.c()) {
            this.f(this.f);
        }
        this.j();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator
    public void set(Object object0) {
        this.h();
        this.i();
        this.c.set(this.f, object0);
        this.d = this.c.g();
        this.k();
    }
}

