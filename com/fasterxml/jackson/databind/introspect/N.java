package com.fasterxml.jackson.databind.introspect;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

public final class n implements Iterable {
    protected Map a;

    public n() {
    }

    public n(Map map0) {
        this.a = map0;
    }

    public l a(String s, Class[] arr_class) {
        return this.a == null ? null : ((l)this.a.get(new C(s, arr_class)));
    }

    public l b(Method method0) {
        return this.a == null ? null : ((l)this.a.get(new C(method0)));
    }

    @Override
    public Iterator iterator() {
        return this.a == null ? Collections.emptyIterator() : this.a.values().iterator();
    }

    public int size() {
        return this.a == null ? 0 : this.a.size();
    }
}

