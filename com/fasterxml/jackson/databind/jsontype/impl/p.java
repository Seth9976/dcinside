package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.b;
import com.fasterxml.jackson.databind.cfg.t;
import com.fasterxml.jackson.databind.introspect.d;
import com.fasterxml.jackson.databind.introspect.k;
import com.fasterxml.jackson.databind.jsontype.c;
import com.fasterxml.jackson.databind.jsontype.e;
import com.fasterxml.jackson.databind.m;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class p extends e implements Serializable {
    protected LinkedHashSet a;
    private static final long b = 1L;

    public p() {
    }

    protected p(p p0) {
        this.a = p0.a == null ? null : new LinkedHashSet(p0.a);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.e
    public Collection c(t t0, d d0) {
        b b0 = t0.n();
        HashMap hashMap0 = new HashMap();
        if(this.a != null) {
            Class class0 = d0.f();
            for(Object object0: this.a) {
                c c0 = (c)object0;
                if(class0.isAssignableFrom(c0.a())) {
                    this.k(com.fasterxml.jackson.databind.introspect.e.n(t0, c0.a()), c0, t0, b0, hashMap0);
                }
            }
        }
        this.k(d0, new c(d0.f(), null), t0, b0, hashMap0);
        return new ArrayList(hashMap0.values());
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.e
    public Collection d(t t0, k k0, m m0) {
        Class class0;
        b b0 = t0.n();
        if(m0 != null) {
            class0 = m0.g();
        }
        else if(k0 != null) {
            class0 = k0.f();
        }
        else {
            throw new IllegalArgumentException("Both property and base type are nulls");
        }
        HashMap hashMap0 = new HashMap();
        LinkedHashSet linkedHashSet0 = this.a;
        if(linkedHashSet0 != null) {
            for(Object object0: linkedHashSet0) {
                c c0 = (c)object0;
                if(class0.isAssignableFrom(c0.a())) {
                    this.k(com.fasterxml.jackson.databind.introspect.e.n(t0, c0.a()), c0, t0, b0, hashMap0);
                }
            }
        }
        if(k0 != null) {
            List list0 = b0.p0(k0);
            if(list0 != null) {
                for(Object object1: list0) {
                    this.k(com.fasterxml.jackson.databind.introspect.e.n(t0, ((c)object1).a()), ((c)object1), t0, b0, hashMap0);
                }
            }
        }
        c c1 = new c(class0, null);
        this.k(com.fasterxml.jackson.databind.introspect.e.n(t0, class0), c1, t0, b0, hashMap0);
        return new ArrayList(hashMap0.values());
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.e
    public Collection e(t t0, d d0) {
        Class class0 = d0.f();
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        this.l(d0, new c(class0, null), t0, linkedHashSet0, linkedHashMap0);
        LinkedHashSet linkedHashSet1 = this.a;
        if(linkedHashSet1 != null) {
            for(Object object0: linkedHashSet1) {
                c c0 = (c)object0;
                if(class0.isAssignableFrom(c0.a())) {
                    this.l(com.fasterxml.jackson.databind.introspect.e.n(t0, c0.a()), c0, t0, linkedHashSet0, linkedHashMap0);
                }
            }
        }
        return this.m(class0, linkedHashSet0, linkedHashMap0);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.e
    public Collection f(t t0, k k0, m m0) {
        b b0 = t0.n();
        Class class0 = m0.g();
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        c c0 = new c(class0, null);
        this.l(com.fasterxml.jackson.databind.introspect.e.n(t0, class0), c0, t0, linkedHashSet0, linkedHashMap0);
        if(k0 != null) {
            List list0 = b0.p0(k0);
            if(list0 != null) {
                for(Object object0: list0) {
                    this.l(com.fasterxml.jackson.databind.introspect.e.n(t0, ((c)object0).a()), ((c)object0), t0, linkedHashSet0, linkedHashMap0);
                }
            }
        }
        LinkedHashSet linkedHashSet1 = this.a;
        if(linkedHashSet1 != null) {
            for(Object object1: linkedHashSet1) {
                c c1 = (c)object1;
                if(class0.isAssignableFrom(c1.a())) {
                    this.l(com.fasterxml.jackson.databind.introspect.e.n(t0, c1.a()), c1, t0, linkedHashSet0, linkedHashMap0);
                }
            }
        }
        return this.m(class0, linkedHashSet0, linkedHashMap0);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.e
    public e g() {
        return new p(this);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.e
    public void h(Collection collection0) {
        c[] arr_c = new c[collection0.size()];
        int v = 0;
        for(Object object0: collection0) {
            arr_c[v] = new c(((Class)object0));
            ++v;
        }
        this.i(arr_c);
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.e
    public void i(c[] arr_c) {
        if(this.a == null) {
            this.a = new LinkedHashSet();
        }
        for(int v = 0; v < arr_c.length; ++v) {
            this.a.add(arr_c[v]);
        }
    }

    @Override  // com.fasterxml.jackson.databind.jsontype.e
    public void j(Class[] arr_class) {
        c[] arr_c = new c[arr_class.length];
        for(int v = 0; v < arr_class.length; ++v) {
            arr_c[v] = new c(arr_class[v]);
        }
        this.i(arr_c);
    }

    protected void k(d d0, c c0, t t0, b b0, HashMap hashMap0) {
        if(!c0.b()) {
            String s = b0.q0(d0);
            if(s != null) {
                c0 = new c(c0.a(), s);
            }
        }
        c c1 = new c(c0.a());
        if(hashMap0.containsKey(c1)) {
            if(c0.b() && !((c)hashMap0.get(c1)).b()) {
                hashMap0.put(c1, c0);
            }
            return;
        }
        hashMap0.put(c1, c0);
        List list0 = b0.p0(d0);
        if(list0 != null && !list0.isEmpty()) {
            for(Object object0: list0) {
                this.k(com.fasterxml.jackson.databind.introspect.e.n(t0, ((c)object0).a()), ((c)object0), t0, b0, hashMap0);
            }
        }
    }

    protected void l(d d0, c c0, t t0, Set set0, Map map0) {
        b b0 = t0.n();
        if(!c0.b()) {
            String s = b0.q0(d0);
            if(s != null) {
                c0 = new c(c0.a(), s);
            }
        }
        if(c0.b()) {
            map0.put(c0.getName(), c0);
        }
        if(set0.add(c0.a())) {
            List list0 = b0.p0(d0);
            if(list0 != null && !list0.isEmpty()) {
                for(Object object0: list0) {
                    this.l(com.fasterxml.jackson.databind.introspect.e.n(t0, ((c)object0).a()), ((c)object0), t0, set0, map0);
                }
            }
        }
    }

    protected Collection m(Class class0, Set set0, Map map0) {
        Collection collection0 = new ArrayList(map0.values());
        for(Object object0: map0.values()) {
            set0.remove(((c)object0).a());
        }
        for(Object object1: set0) {
            Class class1 = (Class)object1;
            if(class1 != class0 || !Modifier.isAbstract(class1.getModifiers())) {
                ((ArrayList)collection0).add(new c(class1));
            }
        }
        return collection0;
    }
}

