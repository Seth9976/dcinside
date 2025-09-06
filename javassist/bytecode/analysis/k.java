package javassist.bytecode.analysis;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import javassist.E;
import javassist.l;

public class k {
    private final l a;
    private final boolean b;
    private static final Map c;
    public static final k d;
    public static final k e;
    public static final k f;
    public static final k g;
    public static final k h;
    public static final k i;
    public static final k j;
    public static final k k;
    public static final k l;
    public static final k m;
    public static final k n;
    public static final k o;
    public static final k p;
    public static final k q;
    public static final k r;
    public static final k s;
    public static final k t;

    static {
        IdentityHashMap identityHashMap0 = new IdentityHashMap();
        k.c = identityHashMap0;
        k k0 = new k(l.l);
        k.d = k0;
        k k1 = new k(l.e);
        k.e = k1;
        k k2 = new k(l.j);
        k.f = k2;
        k k3 = new k(l.f);
        k.g = k3;
        k k4 = new k(l.g);
        k.h = k4;
        k k5 = new k(l.h);
        k.i = k5;
        k k6 = new k(l.i);
        k.j = k6;
        k k7 = new k(l.k);
        k.k = k7;
        k k8 = new k(l.m);
        k.l = k8;
        k.m = new k(null);
        k.n = new k(null, true);
        k.o = new k(null, true);
        k.p = new k(null, true);
        k.q = k.u("java.lang.Object");
        k.r = k.u("java.io.Serializable");
        k.s = k.u("java.lang.Cloneable");
        k.t = k.u("java.lang.Throwable");
        identityHashMap0.put(l.l, k0);
        identityHashMap0.put(l.j, k2);
        identityHashMap0.put(l.f, k3);
        identityHashMap0.put(l.h, k5);
        identityHashMap0.put(l.i, k6);
        identityHashMap0.put(l.k, k7);
        identityHashMap0.put(l.g, k4);
        identityHashMap0.put(l.e, k1);
        identityHashMap0.put(l.m, k8);
    }

    k(l l0) {
        this(l0, false);
    }

    private k(l l0, boolean z) {
        this.a = l0;
        this.b = z;
    }

    String a(String s, int v) {
        int v1 = s.length();
        int v2 = v * 2 + v1;
        char[] arr_c = new char[v2];
        while(v1 < v2) {
            int v3 = v1 + 1;
            arr_c[v1] = '[';
            v1 += 2;
            arr_c[v3] = ']';
        }
        return new String(arr_c);
    }

    private k b(k k0, int v) {
        if(k0 instanceof h) {
            return new g(((h)k0), v);
        }
        String s = this.a(k0.a.X(), v);
        try {
            return k.h(this.j(k0).s(s));
        }
        catch(E e0) {
            throw new RuntimeException(e0);
        }
    }

    // 去混淆评级： 低(20)
    static boolean c(l l0, l l1) {
        return l0 == l1 || l0 != null && l1 != null && l0.X().equals(l1.X());
    }

    Map d(Map map0, Map map1) {
        l[] arr_l;
        if(map1 == null) {
            map1 = new HashMap();
        }
        if(map0 == null || map0.isEmpty()) {
            map1.clear();
        }
        for(Object object0: map1.keySet()) {
            String s = (String)object0;
            if(!map0.containsKey(s)) {
                map1.remove(s);
            }
        }
        for(Object object1: map1.values()) {
            l l0 = (l)object1;
            try {
                arr_l = l0.T();
            }
            catch(E e0) {
                throw new RuntimeException(e0);
            }
            for(int v = 0; v < arr_l.length; ++v) {
                map1.remove(arr_l[v].X());
            }
        }
        return map1;
    }

    private Map e(k k0) {
        return this.d(this.i(k0.a, null), this.i(this.a, null));
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof k ? object0.getClass() == this.getClass() && k.c(this.a, ((k)object0).a) : false;
    }

    private static l f(l l0, l l1) throws E {
        l l2 = l0;
        for(l l3 = l1; true; l3 = l5) {
            if(k.c(l2, l3) && l2.c0() != null) {
                return l2;
            }
            l l4 = l2.c0();
            l l5 = l3.c0();
            if(l5 == null) {
                break;
            }
            if(l4 == null) {
                l2 = l3;
                l l6 = l1;
                l1 = l0;
                l0 = l6;
                break;
            }
            l2 = l4;
        }
        while(true) {
            l2 = l2.c0();
            if(l2 == null) {
                break;
            }
            l0 = l0.c0();
        }
        while(!k.c(l0, l1)) {
            l0 = l0.c0();
            l1 = l1.c0();
        }
        return l0;
    }

    private Map g(k k0, l l0) {
        Map map0 = this.m(k0.a, null);
        Map map1 = this.m(this.a, null);
        for(Object object0: this.i(l0, null).keySet()) {
            map0.remove(((String)object0));
            map1.remove(((String)object0));
        }
        return this.d(map0, map1);
    }

    public static k h(l l0) {
        k k0 = (k)k.c.get(l0);
        return k0 == null ? new k(l0) : k0;
    }

    @Override
    public int hashCode() {
        return this.getClass().hashCode() + this.a.hashCode();
    }

    Map i(l l0, Map map0) {
        if(map0 == null) {
            map0 = new HashMap();
        }
        if(l0.n0()) {
            map0.put(l0.X(), l0);
        }
        try {
            do {
                l[] arr_l = l0.T();
                for(int v = 0; v < arr_l.length; ++v) {
                    l l1 = arr_l[v];
                    map0.put(l1.X(), l1);
                    this.i(l1, map0);
                }
                l0 = l0.c0();
            }
            while(l0 != null);
            return map0;
        }
        catch(E e0) {
            throw new RuntimeException(e0);
        }
    }

    private javassist.g j(k k0) {
        javassist.g g0 = k0.a.w();
        return g0 == null ? javassist.g.T() : g0;
    }

    public k k() {
        l l0;
        if(this.a != null && this.a.k0()) {
            try {
                l0 = this.a.x();
            }
            catch(E e0) {
                throw new RuntimeException(e0);
            }
            k k0 = (k)k.c.get(l0);
            return k0 == null ? new k(l0) : k0;
        }
        return null;
    }

    public l l() {
        return this.a;
    }

    Map m(l l0, Map map0) {
        l[] arr_l;
        if(map0 == null) {
            map0 = new HashMap();
        }
        if(l0.n0()) {
            map0.put(l0.X(), l0);
        }
        try {
            arr_l = l0.T();
        }
        catch(E e0) {
            throw new RuntimeException(e0);
        }
        for(int v = 0; v < arr_l.length; ++v) {
            l l1 = arr_l[v];
            map0.put(l1.X(), l1);
            this.m(l1, map0);
        }
        return map0;
    }

    public int n() {
        int v = 0;
        if(!this.q()) {
            return 0;
        }
        String s = this.a.X();
        int v1 = s.length() - 1;
        while(s.charAt(v1) == 93) {
            v1 -= 2;
            ++v;
        }
        return v;
    }

    k o(k k0) {
        while(k0.q()) {
            k0 = k0.k();
        }
        return k0;
    }

    public int p() {
        return this.a == l.l || this.a == l.j || this == k.o ? 2 : 1;
    }

    public boolean q() {
        return this.a != null && this.a.k0();
    }

    public boolean r(k k0) {
        if(this == k0) {
            return true;
        }
        if(k0 == k.m && this.s() || this == k.m && k0.s()) {
            return true;
        }
        if(k0 instanceof h) {
            return ((h)k0).B(this);
        }
        if(k0 instanceof g) {
            return ((g)k0).z(this);
        }
        if(this.a != null && !this.a.p0()) {
            try {
                return k0.a.K0(this.a);
            }
            catch(Exception exception0) {
                throw new RuntimeException(exception0);
            }
        }
        return false;
    }

    // 去混淆评级： 低(30)
    public boolean s() {
        return !this.b && (this.a == null || !this.a.p0());
    }

    public boolean t() {
        return this.b;
    }

    @Override
    public String toString() {
        if(this == k.p) {
            return "BOGUS";
        }
        if(this == k.m) {
            return "UNINIT";
        }
        if(this == k.n) {
            return "RETURN ADDRESS";
        }
        if(this == k.o) {
            return "TOP";
        }
        return this.a == null ? "null" : this.a.X();
    }

    private static k u(String s) {
        try {
            return new k(javassist.g.T().s(s));
        }
        catch(E e0) {
            throw new RuntimeException(e0);
        }
    }

    public k v(k k0) {
        if(k0 == this) {
            return this;
        }
        if(k0 == null) {
            return this;
        }
        k k1 = k.m;
        if(k0 == k1) {
            return this;
        }
        if(this == k1) {
            return k0;
        }
        if(k0.s() && this.s()) {
            if(k0 instanceof h) {
                return k0.v(this);
            }
            if(k0.q() && this.q()) {
                return this.w(k0);
            }
            try {
                return this.x(k0);
            }
            catch(E e0) {
                throw new RuntimeException(e0);
            }
        }
        return k.p;
    }

    private k w(k k0) {
        k k1 = this.o(k0);
        k k2 = this.o(this);
        int v = k0.n();
        int v1 = this.n();
        if(v == v1) {
            k k3 = k2.v(k1);
            return k3 == k.p ? k.q : this.b(k3, v1);
        }
        if(v >= v1) {
            k1 = k2;
            v = v1;
        }
        return k.c(k.s.a, k1.a) || k.c(k.r.a, k1.a) ? this.b(k1, v) : this.b(k.q, v);
    }

    private k x(k k0) throws E {
        l l0 = k.f(this.a, k0.a);
        if(l0.c0() == null) {
            Map map0 = this.e(k0);
            if(map0.size() == 1) {
                Object object0 = map0.values().iterator().next();
                return new k(((l)object0));
            }
            return map0.size() > 1 ? new h(map0) : new k(l0);
        }
        Map map1 = this.g(k0, l0);
        return map1.size() > 0 ? new h(map1, new k(l0)) : new k(l0);
    }

    boolean y() {
        return false;
    }
}

