package com.google.common.graph;

import com.google.common.base.H;
import com.google.common.collect.Q2;
import com.google.common.collect.q3;
import j..util.DesugarCollections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

@x
final class n0 implements G {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[b.values().length];
            a.a = arr_v;
            try {
                arr_v[b.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[b.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private final Map a;

    private n0(Map map0) {
        this.a = (Map)H.E(map0);
    }

    @Override  // com.google.common.graph.G
    public Set a() {
        return DesugarCollections.unmodifiableSet(this.a.keySet());
    }

    @Override  // com.google.common.graph.G
    public Set b() {
        return this.a();
    }

    @Override  // com.google.common.graph.G
    public Set c() {
        return this.a();
    }

    @Override  // com.google.common.graph.G
    public void d(Object object0, Object object1) {
        this.i(object0, object1);
    }

    @Override  // com.google.common.graph.G
    @o3.a
    public Object e(Object object0) {
        return this.a.get(object0);
    }

    @Override  // com.google.common.graph.G
    @o3.a
    public Object f(Object object0) {
        return this.a.remove(object0);
    }

    @Override  // com.google.common.graph.G
    public void g(Object object0) {
        this.f(object0);
    }

    @Override  // com.google.common.graph.G
    public Iterator h(Object object0) {
        return q3.b0(this.a.keySet().iterator(), (Object object1) -> y.m(object0, object1));
    }

    @Override  // com.google.common.graph.G
    @o3.a
    public Object i(Object object0, Object object1) {
        return this.a.put(object0, object1);
    }

    static n0 l(w w0) {
        switch(w0.h()) {
            case 1: {
                return new n0(new HashMap(2, 1.0f));
            }
            case 2: {
                return new n0(new LinkedHashMap(2, 1.0f));
            }
            default: {
                throw new AssertionError(w0.h());
            }
        }
    }

    static n0 m(Map map0) {
        return new n0(Q2.g(map0));
    }
}

