package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.k;
import com.facebook.imagepipeline.common.f;
import com.facebook.imagepipeline.core.z;
import com.facebook.imagepipeline.request.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public class e implements j0 {
    private final d a;
    private final String b;
    @h
    private final String c;
    private final l0 d;
    private final Object e;
    private final com.facebook.imagepipeline.request.d.d f;
    private final Map g;
    @p3.a("this")
    private boolean h;
    @p3.a("this")
    private f i;
    @p3.a("this")
    private boolean j;
    @p3.a("this")
    private boolean k;
    @p3.a("this")
    private final List l;
    private final z m;
    private static final String n = "default";
    public static final Set o;
    public static final Object p;

    static {
        e.o = k.b(new String[]{"id", "uri_source"});
        e.p = new Object();
    }

    public e(d d0, String s, l0 l00, @h Object object0, com.facebook.imagepipeline.request.d.d d$d0, boolean z, boolean z1, f f0, z z2) {
        this(d0, s, null, null, l00, object0, d$d0, z, z1, f0, z2);
    }

    public e(d d0, String s, @h String s1, @h Map map0, l0 l00, @h Object object0, com.facebook.imagepipeline.request.d.d d$d0, boolean z, boolean z1, f f0, z z2) {
        this.a = d0;
        this.b = s;
        HashMap hashMap0 = new HashMap();
        this.g = hashMap0;
        hashMap0.put("id", s);
        String s2 = d0 == null ? "null-request" : d0.z();
        hashMap0.put("uri_source", s2);
        this.k(map0);
        this.c = s1;
        this.d = l00;
        if(object0 == null) {
            object0 = e.p;
        }
        this.e = object0;
        this.f = d$d0;
        this.h = z;
        this.i = f0;
        this.j = z1;
        this.k = false;
        this.l = new ArrayList();
        this.m = z2;
    }

    @h
    public List A(f f0) {
        synchronized(this) {
            if(f0 == this.i) {
                return null;
            }
            this.i = f0;
            return new ArrayList(this.l);
        }
    }

    @Override  // com.facebook.imagepipeline.producers.j0
    public f a() {
        synchronized(this) {
        }
        return this.i;
    }

    @Override  // com.facebook.imagepipeline.producers.j0
    public d b() {
        return this.a;
    }

    @Override  // com.facebook.imagepipeline.producers.j0
    public Object c() {
        return this.e;
    }

    public static void d(@h List list0) {
        if(list0 == null) {
            return;
        }
        for(Object object0: list0) {
            ((k0)object0).b();
        }
    }

    @Override  // com.facebook.imagepipeline.producers.j0
    public z e() {
        return this.m;
    }

    @Override  // com.facebook.fresco.middleware.a
    public void f(String s, @h Object object0) {
        if(e.o.contains(s)) {
            return;
        }
        this.g.put(s, object0);
    }

    public static void g(@h List list0) {
        if(list0 == null) {
            return;
        }
        for(Object object0: list0) {
            ((k0)object0).a();
        }
    }

    @Override  // com.facebook.fresco.middleware.a
    public Map getExtras() {
        return this.g;
    }

    @Override  // com.facebook.imagepipeline.producers.j0
    public String getId() {
        return this.b;
    }

    public static void h(@h List list0) {
        if(list0 == null) {
            return;
        }
        for(Object object0: list0) {
            ((k0)object0).c();
        }
    }

    @Override  // com.facebook.imagepipeline.producers.j0
    public l0 i() {
        return this.d;
    }

    @Override  // com.facebook.fresco.middleware.a
    @h
    public Object j(String s, @h Object object0) {
        Object object1 = this.g.get(s);
        return object1 == null ? object0 : object1;
    }

    @Override  // com.facebook.fresco.middleware.a
    public void k(@h Map map0) {
        if(map0 == null) {
            return;
        }
        for(Object object0: map0.entrySet()) {
            this.f(((String)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
        }
    }

    public static void l(@h List list0) {
        if(list0 == null) {
            return;
        }
        for(Object object0: list0) {
            ((k0)object0).d();
        }
    }

    public void m() {
        e.d(this.r());
    }

    @Override  // com.facebook.imagepipeline.producers.j0
    public void n(k0 k00) {
        synchronized(this) {
            this.l.add(k00);
        }
        if(this.k) {
            k00.b();
        }
    }

    @Override  // com.facebook.imagepipeline.producers.j0
    public void o(@h String s, @h String s1) {
        this.g.put("origin", s);
        this.g.put("origin_sub", s1);
    }

    @Override  // com.facebook.imagepipeline.producers.j0
    @h
    public String p() {
        return this.c;
    }

    @Override  // com.facebook.imagepipeline.producers.j0
    public void q(@h String s) {
        this.o(s, "default");
    }

    @h
    public List r() {
        synchronized(this) {
            if(this.k) {
                return null;
            }
            this.k = true;
            return new ArrayList(this.l);
        }
    }

    @Override  // com.facebook.imagepipeline.producers.j0
    public boolean s() {
        synchronized(this) {
        }
        return this.j;
    }

    @Override  // com.facebook.imagepipeline.producers.j0
    public boolean t() {
        synchronized(this) {
        }
        return this.h;
    }

    public boolean u() {
        synchronized(this) {
        }
        return this.k;
    }

    @Override  // com.facebook.fresco.middleware.a
    @h
    public Object v(String s) {
        return this.g.get(s);
    }

    @Override  // com.facebook.imagepipeline.producers.j0
    public com.facebook.imagepipeline.request.d.d w() {
        return this.f;
    }

    @h
    public List x(boolean z) {
        synchronized(this) {
            if(z == this.j) {
                return null;
            }
            this.j = z;
            return new ArrayList(this.l);
        }
    }

    @h
    public List y(boolean z) {
        synchronized(this) {
            if(z == this.h) {
                return null;
            }
            this.h = z;
            return new ArrayList(this.l);
        }
    }
}

