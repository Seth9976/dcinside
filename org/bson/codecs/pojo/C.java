package org.bson.codecs.pojo;

import R3.a;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class c {
    private final List a;
    private p b;
    private t c;
    private Class d;
    private Map e;
    private List f;
    private List g;
    private boolean h;
    private String i;
    private String j;
    private String k;
    static final String l = "_id";

    c(Class class0) {
        this.a = new ArrayList();
        this.e = Collections.emptyMap();
        this.f = k.f;
        this.g = Collections.emptyList();
        z.b(this, ((Class)a.e("type", class0)));
    }

    private void A(String s, List list0) {
        HashMap hashMap0 = new HashMap();
        HashMap hashMap1 = new HashMap();
        HashMap hashMap2 = new HashMap();
        for(Object object0: list0) {
            J j0 = (J)object0;
            if(j0.l()) {
                throw new org.bson.codecs.configuration.a(j0.e());
            }
            this.d("property", j0.f(), hashMap0, s);
            if(j0.m()) {
                this.d("read property", j0.i(), hashMap1, s);
            }
            if(j0.n()) {
                this.d("write property", j0.k(), hashMap2, s);
            }
        }
        if(this.k != null && !hashMap0.containsKey(this.k)) {
            throw new org.bson.codecs.configuration.a(String.format("Invalid id property, property named \'%s\' can not be found.", this.k));
        }
    }

    c a(K k0) {
        Object object0 = a.e("propertyModelBuilder", k0);
        this.a.add(object0);
        return this;
    }

    public c b(List list0) {
        this.g = (List)a.e("annotations", list0);
        return this;
    }

    public b c() {
        ArrayList arrayList0 = new ArrayList();
        z.k("type", this.d);
        for(Object object0: this.f) {
            ((e)object0).a(this);
        }
        z.k("instanceCreatorFactory", this.c);
        if(this.h) {
            z.k("discriminatorKey", this.j);
            z.k("discriminator", this.i);
        }
        J j0 = null;
        for(Object object1: this.a) {
            K k0 = (K)object1;
            boolean z = k0.e().equals(this.k);
            if(z) {
                k0.t("_id").x("_id");
            }
            J j1 = k0.a();
            arrayList0.add(j1);
            if(z) {
                j0 = j1;
            }
        }
        this.A(this.d.getSimpleName(), arrayList0);
        return new b(this.d, this.e, this.c, Boolean.valueOf(this.h), this.j, this.i, r.a(this.d, j0, this.b), DesugarCollections.unmodifiableList(arrayList0));
    }

    private void d(String s, String s1, Map map0, String s2) {
        if(map0.containsKey(s1)) {
            throw new org.bson.codecs.configuration.a(String.format("Duplicate %s named \'%s\' found in %s.", s, s1, s2));
        }
        map0.put(s1, 1);
    }

    public c e(List list0) {
        this.f = (List)a.e("conventions", list0);
        return this;
    }

    public c f(String s) {
        this.i = s;
        return this;
    }

    public c g(String s) {
        this.j = s;
        return this;
    }

    public c h(boolean z) {
        this.h = z;
        return this;
    }

    public List i() {
        return this.g;
    }

    public List j() {
        return this.f;
    }

    public String k() {
        return this.i;
    }

    public String l() {
        return this.j;
    }

    public p m() {
        return this.b;
    }

    public String n() {
        return this.k;
    }

    public t o() {
        return this.c;
    }

    public K p(String s) {
        a.e("propertyName", s);
        for(Object object0: this.a) {
            K k0 = (K)object0;
            if(k0.e().equals(s)) {
                return k0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public List q() {
        return DesugarCollections.unmodifiableList(this.a);
    }

    Map r() {
        return this.e;
    }

    public Class s() {
        return this.d;
    }

    public c t(p p0) {
        this.b = p0;
        return this;
    }

    @Override
    public String toString() {
        return String.format("ClassModelBuilder{type=%s}", this.d);
    }

    public c u(String s) {
        this.k = s;
        return this;
    }

    public c v(t t0) {
        this.c = (t)a.e("instanceCreatorFactory", t0);
        return this;
    }

    c w(Map map0) {
        this.e = DesugarCollections.unmodifiableMap(new HashMap(map0));
        return this;
    }

    public boolean x(String s) {
        K k0 = this.p(((String)a.e("propertyName", s)));
        return this.a.remove(k0);
    }

    public c y(Class class0) {
        this.d = (Class)a.e("type", class0);
        return this;
    }

    public Boolean z() {
        return Boolean.valueOf(this.h);
    }
}

