package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.h;
import kotlin.jvm.internal.L;
import y4.l;

public final class f extends h implements B3.h, Set {
    @l
    private final d a;

    public f(@l d d0) {
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
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(@l Collection collection0) {
        L.p(collection0, "elements");
        throw new UnsupportedOperationException();
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

