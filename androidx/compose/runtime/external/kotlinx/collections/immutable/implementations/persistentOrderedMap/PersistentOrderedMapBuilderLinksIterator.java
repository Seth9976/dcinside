package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import B3.d;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.v0;
import y4.l;
import y4.m;

public class PersistentOrderedMapBuilderLinksIterator implements d, Iterator {
    @m
    private Object a;
    @l
    private final PersistentOrderedMapBuilder b;
    @m
    private Object c;
    private boolean d;
    private int e;
    private int f;

    public PersistentOrderedMapBuilderLinksIterator(@m Object object0, @l PersistentOrderedMapBuilder persistentOrderedMapBuilder0) {
        L.p(persistentOrderedMapBuilder0, "builder");
        super();
        this.a = object0;
        this.b = persistentOrderedMapBuilder0;
        this.c = EndOfChain.a;
        this.e = persistentOrderedMapBuilder0.g().g();
    }

    private final void a() {
        if(this.b.g().g() != this.e) {
            throw new ConcurrentModificationException();
        }
    }

    private final void b() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void c() {
        if(!this.d) {
            throw new IllegalStateException();
        }
    }

    @l
    public final PersistentOrderedMapBuilder d() {
        return this.b;
    }

    public final int f() {
        return this.f;
    }

    @m
    public final Object g() {
        return this.c;
    }

    @l
    public LinkedValue h() {
        this.a();
        this.b();
        this.c = this.a;
        this.d = true;
        ++this.f;
        Object object0 = this.b.g().get(this.a);
        if(object0 == null) {
            throw new ConcurrentModificationException("Hash code of a key (" + this.a + ") has changed after it was added to the persistent map.");
        }
        this.a = ((LinkedValue)object0).c();
        return (LinkedValue)object0;
    }

    @Override
    public boolean hasNext() {
        return this.f < this.b.size();
    }

    public final void i(int v) {
        this.f = v;
    }

    public final void j(@m Object object0) {
        this.c = object0;
    }

    @Override
    public Object next() {
        return this.h();
    }

    @Override
    public void remove() {
        this.c();
        Object object0 = this.c;
        v0.k(this.b).remove(object0);
        this.c = null;
        this.d = false;
        this.e = this.b.g().g();
        --this.f;
    }
}

