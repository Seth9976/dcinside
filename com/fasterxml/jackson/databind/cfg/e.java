package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.i;
import com.fasterxml.jackson.databind.t;
import com.fasterxml.jackson.databind.type.h;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public class e implements Serializable {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[f.values().length];
            a.a = arr_v;
            try {
                arr_v[f.h.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[f.d.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[f.c.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    protected c a;
    protected final v b;
    protected v[] c;
    protected Map d;
    private static final long e = 1L;
    private static final int f;

    static {
        e.f = h.values().length;
    }

    public e() {
        v v0 = new v();
        this(c.b, v0, null, null);
    }

    protected e(c c0, v v0, v[] arr_v, Map map0) {
        this.b = v0;
        this.a = c0;
        this.c = arr_v;
        this.d = map0;
    }

    private static v a(v v0) {
        return v0 == null ? null : v0.c();
    }

    protected boolean b(h h0) {
        return h0 == h.g || h0 == h.f || h0 == h.h || h0 == h.l;
    }

    public e c() {
        v[] arr_v1;
        v[] arr_v = this.c;
        HashMap hashMap0 = null;
        if(arr_v == null) {
            arr_v1 = null;
        }
        else {
            arr_v1 = new v[arr_v.length];
            for(int v = 0; v < arr_v.length; ++v) {
                arr_v1[v] = e.a(this.c[v]);
            }
        }
        if(this.d != null) {
            hashMap0 = new HashMap();
            for(Object object0: this.d.entrySet()) {
                hashMap0.put(((Map.Entry)object0).getKey(), ((v)((Map.Entry)object0).getValue()).c());
            }
        }
        return new e(this.a, this.b.c(), arr_v1, hashMap0);
    }

    public v d() {
        return this.b;
    }

    public c e(g g0, h h0, Class class0, f f0) {
        Map map0 = this.d;
        if(map0 != null && class0 != null) {
            v v0 = (v)map0.get(class0);
            if(v0 != null) {
                c c0 = v0.a(f0);
                if(c0 != null) {
                    return c0;
                }
            }
        }
        v[] arr_v = this.c;
        if(arr_v != null && h0 != null) {
            v v1 = arr_v[h0.ordinal()];
            if(v1 != null) {
                c c1 = v1.a(f0);
                if(c1 != null) {
                    return c1;
                }
            }
        }
        c c2 = this.b.a(f0);
        if(c2 != null) {
            return c2;
        }
        switch(f0) {
            case 1: {
                return g0.t1(i.w) ? c.c : c.a;
            }
            case 2: {
                if(h0 == h.f) {
                    return g0.t1(i.x) ? c.b : c.a;
                }
                break;
            }
            case 3: {
                if(h0 == h.i && g0.t1(i.i)) {
                    return c.a;
                }
            }
        }
        boolean z = this.b(h0);
        if(z && !g0.a0(t.F) && (h0 != h.g || f0 != f.c)) {
            return c.a;
        }
        if(f0 == f.j) {
            if(h0 == h.m) {
                return c.b;
            }
            return z || g0.t1(i.v) ? c.c : c.a;
        }
        return this.a;
    }

    public c f(g g0, h h0, Class class0, c c0) {
        c c1;
        Boolean boolean0;
        Map map0 = this.d;
        if(map0 == null || class0 == null) {
            boolean0 = null;
            c1 = null;
        }
        else {
            v v0 = (v)map0.get(class0);
            if(v0 == null) {
                boolean0 = null;
                c1 = null;
            }
            else {
                boolean0 = v0.b();
                c1 = v0.a(f.j);
            }
        }
        v[] arr_v = this.c;
        if(arr_v != null && h0 != null) {
            v v1 = arr_v[h0.ordinal()];
            if(v1 != null) {
                if(boolean0 == null) {
                    boolean0 = v1.b();
                }
                if(c1 == null) {
                    c1 = v1.a(f.j);
                }
            }
        }
        if(boolean0 == null) {
            boolean0 = this.b.b();
        }
        if(c1 == null) {
            c1 = this.b.a(f.j);
        }
        if(Boolean.FALSE.equals(boolean0)) {
            return c0;
        }
        if(c1 != null) {
            return c1;
        }
        if(this.b(h0)) {
            return c.c;
        }
        return g0.t1(i.v) ? c.c : c0;
    }

    public v g(h h0) {
        if(this.c == null) {
            this.c = new v[e.f];
        }
        v v0 = this.c[h0.ordinal()];
        if(v0 == null) {
            v[] arr_v = this.c;
            v v1 = new v();
            arr_v[h0.ordinal()] = v1;
            return v1;
        }
        return v0;
    }

    public v h(Class class0) {
        if(this.d == null) {
            this.d = new HashMap();
        }
        v v0 = (v)this.d.get(class0);
        if(v0 == null) {
            v0 = new v();
            this.d.put(class0, v0);
        }
        return v0;
    }
}

