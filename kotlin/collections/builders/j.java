package kotlin.collections.builders;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.h;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class j extends h implements B3.h, Serializable, Set {
    static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    private final d a;
    @l
    private static final a b;
    @l
    private static final j c;

    static {
        j.b = new a(null);
        j.c = new j(d.n.e());
    }

    public j() {
        this(new d());
    }

    public j(int v) {
        this(new d(v));
    }

    public j(@l d d0) {
        L.p(d0, "backing");
        super();
        this.a = d0;
    }

    @Override  // kotlin.collections.h
    public int a() {
        return this.a.size();
    }

    @Override  // kotlin.collections.h
    public boolean add(Object object0) {
        return this.a.j(object0) >= 0;
    }

    @Override
    public boolean addAll(@l Collection collection0) {
        L.p(collection0, "elements");
        this.a.o();
        return super.addAll(collection0);
    }

    @l
    public final Set b() {
        this.a.m();
        return this.size() <= 0 ? j.c : this;
    }

    private final Object c() {
        if(!this.a.I()) {
            throw new NotSerializableException("The set cannot be serialized while it is being built.");
        }
        return new kotlin.collections.builders.h(this, 1);
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public boolean contains(Object object0) {
        return this.a.containsKey(object0);
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    @l
    public Iterator iterator() {
        return this.a.J();
    }

    @Override
    public boolean remove(Object object0) {
        return this.a.V(object0);
    }

    @Override
    public boolean removeAll(@l Collection collection0) {
        L.p(collection0, "elements");
        this.a.o();
        return super.removeAll(collection0);
    }

    @Override
    public boolean retainAll(@l Collection collection0) {
        L.p(collection0, "elements");
        this.a.o();
        return super.retainAll(collection0);
    }
}

