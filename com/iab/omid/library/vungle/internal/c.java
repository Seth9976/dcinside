package com.iab.omid.library.vungle.internal;

import com.iab.omid.library.vungle.adsession.q;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;

public class c {
    private final ArrayList a;
    private final ArrayList b;
    private static c c;

    static {
        c.c = new c();
    }

    private c() {
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public Collection a() {
        return DesugarCollections.unmodifiableCollection(this.b);
    }

    public void b(q q0) {
        this.a.add(q0);
    }

    public Collection c() {
        return DesugarCollections.unmodifiableCollection(this.a);
    }

    public void d(q q0) {
        boolean z = this.g();
        this.a.remove(q0);
        this.b.remove(q0);
        if(z && !this.g()) {
            i.d().f();
        }
    }

    public static c e() {
        return c.c;
    }

    public void f(q q0) {
        boolean z = this.g();
        this.b.add(q0);
        if(!z) {
            i.d().e();
        }
    }

    public boolean g() {
        return this.b.size() > 0;
    }
}

