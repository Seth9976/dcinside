package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.DefaultDateTypeAdapter.b;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import j..util.Objects;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class e {
    private Excluder a;
    private u b;
    private d c;
    private final Map d;
    private final List e;
    private final List f;
    private boolean g;
    private String h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private x r;
    private x s;
    private final LinkedList t;

    public e() {
        this.a = Excluder.h;
        this.b = u.a;
        this.c = c.a;
        this.d = new HashMap();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = false;
        this.h = Gson.H;
        this.i = 2;
        this.j = 2;
        this.k = false;
        this.l = false;
        this.m = true;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = true;
        this.r = Gson.J;
        this.s = Gson.K;
        this.t = new LinkedList();
    }

    e(Gson gson0) {
        this.a = Excluder.h;
        this.b = u.a;
        this.c = c.a;
        HashMap hashMap0 = new HashMap();
        this.d = hashMap0;
        ArrayList arrayList0 = new ArrayList();
        this.e = arrayList0;
        ArrayList arrayList1 = new ArrayList();
        this.f = arrayList1;
        this.g = false;
        this.h = Gson.H;
        this.i = 2;
        this.j = 2;
        this.k = false;
        this.l = false;
        this.m = true;
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = true;
        this.r = Gson.J;
        this.s = Gson.K;
        LinkedList linkedList0 = new LinkedList();
        this.t = linkedList0;
        this.a = gson0.f;
        this.c = gson0.g;
        hashMap0.putAll(gson0.h);
        this.g = gson0.i;
        this.k = gson0.j;
        this.o = gson0.k;
        this.m = gson0.l;
        this.n = gson0.m;
        this.p = gson0.n;
        this.l = gson0.o;
        this.b = gson0.t;
        this.h = gson0.q;
        this.i = gson0.r;
        this.j = gson0.s;
        arrayList0.addAll(gson0.u);
        arrayList1.addAll(gson0.v);
        this.q = gson0.p;
        this.r = gson0.w;
        this.s = gson0.x;
        linkedList0.addAll(gson0.y);
    }

    public e A(x x0) {
        Objects.requireNonNull(x0);
        this.r = x0;
        return this;
    }

    public e B() {
        this.n = true;
        return this;
    }

    public e C(double f) {
        if(Double.isNaN(f) || f < 0.0) {
            throw new IllegalArgumentException("Invalid version: " + f);
        }
        this.a = this.a.r(f);
        return this;
    }

    public e a(a a0) {
        Objects.requireNonNull(a0);
        this.a = this.a.p(a0, false, true);
        return this;
    }

    public e b(v v0) {
        Objects.requireNonNull(v0);
        this.t.addFirst(v0);
        return this;
    }

    public e c(a a0) {
        Objects.requireNonNull(a0);
        this.a = this.a.p(a0, true, false);
        return this;
    }

    private void d(String s, int v, int v1, List list0) {
        y y2;
        y y1;
        boolean z = com.google.gson.internal.sql.a.a;
        y y0 = null;
        if(s != null && !s.trim().isEmpty()) {
            y1 = b.b.c(s);
            if(z) {
                y0 = com.google.gson.internal.sql.a.c.c(s);
                y2 = com.google.gson.internal.sql.a.b.c(s);
            }
            else {
                y2 = null;
            }
            goto label_19;
        }
        else if(v != 2 && v1 != 2) {
            y y3 = b.b.b(v, v1);
            if(z) {
                y0 = com.google.gson.internal.sql.a.c.b(v, v1);
                y1 = y3;
                y2 = com.google.gson.internal.sql.a.b.b(v, v1);
            }
            else {
                y1 = y3;
                y2 = null;
            }
        label_19:
            list0.add(y1);
            if(z) {
                list0.add(y0);
                list0.add(y2);
            }
        }
    }

    public Gson e() {
        ArrayList arrayList0 = new ArrayList(this.e.size() + this.f.size() + 3);
        arrayList0.addAll(this.e);
        Collections.reverse(arrayList0);
        ArrayList arrayList1 = new ArrayList(this.f);
        Collections.reverse(arrayList1);
        arrayList0.addAll(arrayList1);
        this.d(this.h, this.i, this.j, arrayList0);
        return new Gson(this.a, this.c, new HashMap(this.d), this.g, this.k, this.o, this.m, this.n, this.p, this.l, this.q, this.b, this.h, this.i, this.j, new ArrayList(this.e), new ArrayList(this.f), arrayList0, this.r, this.s, new ArrayList(this.t));
    }

    public e f() {
        this.m = false;
        return this;
    }

    public e g() {
        this.a = this.a.c();
        return this;
    }

    public e h() {
        this.q = false;
        return this;
    }

    public e i() {
        this.k = true;
        return this;
    }

    public e j(int[] arr_v) {
        Objects.requireNonNull(arr_v);
        this.a = this.a.q(arr_v);
        return this;
    }

    public e k() {
        this.a = this.a.h();
        return this;
    }

    public e l() {
        this.o = true;
        return this;
    }

    public e m(Type type0, Object object0) {
        Objects.requireNonNull(type0);
        com.google.gson.internal.a.a(object0 instanceof r || object0 instanceof i || object0 instanceof f || object0 instanceof TypeAdapter);
        if(object0 instanceof f) {
            this.d.put(type0, ((f)object0));
        }
        if(object0 instanceof r || object0 instanceof i) {
            y y0 = TreeTypeAdapter.m(com.google.gson.reflect.a.c(type0), object0);
            this.e.add(y0);
        }
        if(object0 instanceof TypeAdapter) {
            y y1 = TypeAdapters.a(com.google.gson.reflect.a.c(type0), ((TypeAdapter)object0));
            this.e.add(y1);
        }
        return this;
    }

    public e n(y y0) {
        Objects.requireNonNull(y0);
        this.e.add(y0);
        return this;
    }

    public e o(Class class0, Object object0) {
        Objects.requireNonNull(class0);
        com.google.gson.internal.a.a(object0 instanceof r || object0 instanceof i || object0 instanceof TypeAdapter);
        if(object0 instanceof i || object0 instanceof r) {
            y y0 = TreeTypeAdapter.n(class0, object0);
            this.f.add(y0);
        }
        if(object0 instanceof TypeAdapter) {
            y y1 = TypeAdapters.e(class0, ((TypeAdapter)object0));
            this.e.add(y1);
        }
        return this;
    }

    public e p() {
        this.g = true;
        return this;
    }

    public e q() {
        this.l = true;
        return this;
    }

    public e r(int v) {
        this.i = v;
        this.h = null;
        return this;
    }

    public e s(int v, int v1) {
        this.i = v;
        this.j = v1;
        this.h = null;
        return this;
    }

    public e t(String s) {
        this.h = s;
        return this;
    }

    public e u(a[] arr_a) {
        Objects.requireNonNull(arr_a);
        for(int v = 0; v < arr_a.length; ++v) {
            this.a = this.a.p(arr_a[v], true, true);
        }
        return this;
    }

    public e v(c c0) {
        return this.w(c0);
    }

    public e w(d d0) {
        Objects.requireNonNull(d0);
        this.c = d0;
        return this;
    }

    public e x() {
        this.p = true;
        return this;
    }

    public e y(u u0) {
        Objects.requireNonNull(u0);
        this.b = u0;
        return this;
    }

    public e z(x x0) {
        Objects.requireNonNull(x0);
        this.s = x0;
        return this;
    }
}

