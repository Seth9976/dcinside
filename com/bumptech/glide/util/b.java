package com.bumptech.glide.util;

import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;

public final class b extends ArrayMap {
    private int g;

    @Override  // androidx.collection.SimpleArrayMap
    public void clear() {
        this.g = 0;
        super.clear();
    }

    @Override  // androidx.collection.SimpleArrayMap
    public void h(SimpleArrayMap simpleArrayMap0) {
        this.g = 0;
        super.h(simpleArrayMap0);
    }

    @Override  // androidx.collection.SimpleArrayMap
    public int hashCode() {
        if(this.g == 0) {
            this.g = super.hashCode();
        }
        return this.g;
    }

    @Override  // androidx.collection.SimpleArrayMap
    public Object i(int v) {
        this.g = 0;
        return super.i(v);
    }

    @Override  // androidx.collection.SimpleArrayMap
    public Object j(int v, Object object0) {
        this.g = 0;
        return super.j(v, object0);
    }

    @Override  // androidx.collection.SimpleArrayMap
    public Object put(Object object0, Object object1) {
        this.g = 0;
        return super.put(object0, object1);
    }
}

