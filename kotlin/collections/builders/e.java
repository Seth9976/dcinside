package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import kotlin.jvm.internal.L;
import y4.l;

public final class e extends a {
    @l
    private final d a;

    public e(@l d d0) {
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
        return this.g(((Map.Entry)object0));
    }

    @Override
    public boolean addAll(@l Collection collection0) {
        L.p(collection0, "elements");
        throw new UnsupportedOperationException();
    }

    @Override  // kotlin.collections.builders.a
    public boolean c(@l Map.Entry map$Entry0) {
        L.p(map$Entry0, "element");
        return this.a.s(map$Entry0);
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public boolean containsAll(@l Collection collection0) {
        L.p(collection0, "elements");
        return this.a.r(collection0);
    }

    @Override  // kotlin.collections.builders.a
    public boolean d(@l Map.Entry map$Entry0) {
        L.p(map$Entry0, "element");
        return this.a.P(map$Entry0);
    }

    public boolean g(@l Map.Entry map$Entry0) {
        L.p(map$Entry0, "element");
        throw new UnsupportedOperationException();
    }

    @l
    public final d h() {
        return this.a;
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    @l
    public Iterator iterator() {
        return this.a.y();
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

