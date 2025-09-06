package com.iab.omid.library.unity3d.internal;

import com.iab.omid.library.unity3d.adsession.p;
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

    public void b(p p0) {
        this.a.add(p0);
    }

    public Collection c() {
        return DesugarCollections.unmodifiableCollection(this.a);
    }

    public void d(p p0) {
        boolean z = this.g();
        this.a.remove(p0);
        this.b.remove(p0);
        if(z && !this.g()) {
            h.d().f();
        }
    }

    public static c e() {
        return c.c;
    }

    public void f(p p0) {
        boolean z = this.g();
        this.b.add(p0);
        if(!z) {
            h.d().e();
        }
    }

    public boolean g() {
        return this.b.size() > 0;
    }
}

