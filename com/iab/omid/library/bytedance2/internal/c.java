package com.iab.omid.library.bytedance2.internal;

import com.iab.omid.library.bytedance2.adsession.a;
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

    public void a(a a0) {
        this.a.add(a0);
    }

    public Collection b() {
        return DesugarCollections.unmodifiableCollection(this.a);
    }

    public void b(a a0) {
        boolean z = this.d();
        this.a.remove(a0);
        this.b.remove(a0);
        if(z && !this.d()) {
            i.c().e();
        }
    }

    public static c c() {
        return c.c;
    }

    public void c(a a0) {
        boolean z = this.d();
        this.b.add(a0);
        if(!z) {
            i.c().d();
        }
    }

    public boolean d() {
        return this.b.size() > 0;
    }
}

