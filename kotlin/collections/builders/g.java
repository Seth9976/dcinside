package kotlin.collections.builders;

import B3.b;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.e;
import kotlin.jvm.internal.L;
import y4.l;

public final class g extends e implements b, Collection {
    @l
    private final d a;

    public g(@l d d0) {
        L.p(d0, "backing");
        super();
        this.a = d0;
    }

    @Override  // kotlin.collections.e
    public int a() {
        return this.a.size();
    }

    @Override  // kotlin.collections.e
    public boolean add(Object object0) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(@l Collection collection0) {
        L.p(collection0, "elements");
        throw new UnsupportedOperationException();
    }

    @l
    public final d b() {
        return this.a;
    }

    @Override
    public void clear() {
        this.a.clear();
    }

    @Override
    public boolean contains(Object object0) {
        return this.a.containsValue(object0);
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    @l
    public Iterator iterator() {
        return this.a.Y();
    }

    @Override
    public boolean remove(Object object0) {
        return this.a.W(object0);
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

