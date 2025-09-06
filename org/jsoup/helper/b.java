package org.jsoup.helper;

import java.util.ArrayList;
import java.util.Collection;

public abstract class b extends ArrayList {
    public b(int v) {
        super(v);
    }

    public abstract void a();

    @Override
    public void add(int v, Object object0) {
        this.a();
        super.add(v, object0);
    }

    @Override
    public boolean add(Object object0) {
        this.a();
        return super.add(object0);
    }

    @Override
    public boolean addAll(int v, Collection collection0) {
        this.a();
        return super.addAll(v, collection0);
    }

    @Override
    public boolean addAll(Collection collection0) {
        this.a();
        return super.addAll(collection0);
    }

    @Override
    public void clear() {
        this.a();
        super.clear();
    }

    @Override
    public Object remove(int v) {
        this.a();
        return super.remove(v);
    }

    @Override
    public boolean remove(Object object0) {
        this.a();
        return super.remove(object0);
    }

    @Override
    public boolean removeAll(Collection collection0) {
        this.a();
        return super.removeAll(collection0);
    }

    @Override
    protected void removeRange(int v, int v1) {
        this.a();
        super.removeRange(v, v1);
    }

    @Override
    public boolean retainAll(Collection collection0) {
        this.a();
        return super.retainAll(collection0);
    }

    @Override
    public Object set(int v, Object object0) {
        this.a();
        return super.set(v, object0);
    }
}

