package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.k.a;
import com.fasterxml.jackson.databind.B;
import com.fasterxml.jackson.databind.b;
import com.fasterxml.jackson.databind.c;
import com.fasterxml.jackson.databind.cfg.q;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.type.p;
import com.fasterxml.jackson.databind.util.h;
import com.fasterxml.jackson.databind.util.j;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class t extends c {
    protected final G b;
    protected final com.fasterxml.jackson.databind.cfg.t c;
    protected final b d;
    protected final d e;
    protected Class[] f;
    protected boolean g;
    protected List h;
    protected F i;
    private static final Class[] j;

    static {
        t.j = new Class[0];
    }

    protected t(com.fasterxml.jackson.databind.cfg.t t0, m m0, d d0, List list0) {
        super(m0);
        this.b = null;
        this.c = t0;
        this.d = t0 == null ? null : t0.n();
        this.e = d0;
        this.h = list0;
    }

    protected t(G g0) {
        this(g0, g0.S(), g0.I());
        this.i = g0.P();
    }

    protected t(G g0, m m0, d d0) {
        super(m0);
        this.b = g0;
        com.fasterxml.jackson.databind.cfg.t t0 = g0.J();
        this.c = t0;
        this.d = t0 == null ? null : t0.n();
        this.e = d0;
    }

    @Override  // com.fasterxml.jackson.databind.c
    public d A() {
        return this.e;
    }

    @Override  // com.fasterxml.jackson.databind.c
    public List B() {
        return this.e.x();
    }

    @Override  // com.fasterxml.jackson.databind.c
    public List C() {
        List list0 = this.e.x();
        if(list0.isEmpty()) {
            return Collections.emptyList();
        }
        List list1 = new ArrayList();
        for(Object object0: list0) {
            f f0 = (f)object0;
            a k$a0 = this.d.k(this.c, f0);
            if(k$a0 != a.d) {
                list1.add(com.fasterxml.jackson.databind.introspect.c.a(f0, k$a0));
            }
        }
        return list1;
    }

    @Override  // com.fasterxml.jackson.databind.c
    public List D() {
        List list0 = this.e.z();
        if(list0.isEmpty()) {
            return list0;
        }
        List list1 = null;
        for(Object object0: list0) {
            l l0 = (l)object0;
            if(this.Y(l0)) {
                if(list1 == null) {
                    list1 = new ArrayList();
                }
                list1.add(l0);
            }
        }
        return list1 == null ? Collections.emptyList() : list1;
    }

    @Override  // com.fasterxml.jackson.databind.c
    public List E() {
        List list0 = this.e.z();
        if(list0.isEmpty()) {
            return Collections.emptyList();
        }
        List list1 = null;
        for(Object object0: list0) {
            com.fasterxml.jackson.databind.introspect.c c0 = this.S(((l)object0));
            if(c0 != null) {
                if(list1 == null) {
                    list1 = new ArrayList();
                }
                list1.add(c0);
            }
        }
        return list1 == null ? Collections.emptyList() : list1;
    }

    @Override  // com.fasterxml.jackson.databind.c
    public Set F() {
        Set set0 = this.b == null ? null : this.b.K();
        return set0 == null ? Collections.emptySet() : set0;
    }

    @Override  // com.fasterxml.jackson.databind.c
    public F G() {
        return this.i;
    }

    @Override  // com.fasterxml.jackson.databind.c
    public boolean I() {
        return this.e.D();
    }

    @Override  // com.fasterxml.jackson.databind.c
    public Object J(boolean z) {
        f f0 = this.e.y();
        if(f0 == null) {
            return null;
        }
        if(z) {
            f0.k(this.c.a0(com.fasterxml.jackson.databind.t.q));
        }
        try {
            return f0.w();
        }
        catch(Exception exception0) {
            while(exception0.getCause() != null) {
                exception0 = exception0.getCause();
            }
            h.v0(exception0);
            h.x0(exception0);
            throw new IllegalArgumentException("Failed to instantiate bean of type " + this.e.u().getName() + ": (" + exception0.getClass().getName() + ") " + h.q(exception0), exception0);
        }
    }

    @Override  // com.fasterxml.jackson.databind.c
    @Deprecated
    public m M(Type type0) {
        return this.c.S().t0(type0, this.a.D());
    }

    protected j N(Object object0) {
        j j0 = null;
        if(object0 == null) {
            return null;
        }
        if(object0 instanceof j) {
            return (j)object0;
        }
        if(!(object0 instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned Converter definition of type " + object0.getClass().getName() + "; expected type Converter or Class<Converter> instead");
        }
        if(((Class)object0) != com.fasterxml.jackson.databind.util.j.a.class && !h.U(((Class)object0))) {
            if(!j.class.isAssignableFrom(((Class)object0))) {
                throw new IllegalStateException("AnnotationIntrospector returned Class " + ((Class)object0).getName() + "; expected Class<Converter>");
            }
            q q0 = this.c.M();
            if(q0 != null) {
                j0 = q0.a(this.c, this.e, ((Class)object0));
            }
            return j0 == null ? ((j)h.n(((Class)object0), this.c.c())) : j0;
        }
        return null;
    }

    @Deprecated
    protected B O(o o0) {
        B b0 = this.d.I(o0);
        if(b0 == null || b0.i()) {
            String s = this.d.C(o0);
            return s == null || s.isEmpty() ? b0 : B.a(s);
        }
        return b0;
    }

    @Deprecated
    public LinkedHashMap P(Collection collection0, boolean z) {
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object0: this.Q()) {
            v v0 = (v)object0;
            i i0 = v0.y();
            if(i0 != null) {
                String s = v0.getName();
                if(collection0 == null || !collection0.contains(s)) {
                    linkedHashMap0.put(s, i0);
                }
            }
        }
        return linkedHashMap0;
    }

    protected List Q() {
        if(this.h == null) {
            this.h = this.b.Q();
        }
        return this.h;
    }

    public boolean R(v v0) {
        if(this.X(v0.a())) {
            return false;
        }
        this.Q().add(v0);
        return true;
    }

    protected com.fasterxml.jackson.databind.introspect.c S(l l0) {
        if(!this.y().isAssignableFrom(l0.N())) {
            return null;
        }
        a k$a0 = this.d.k(this.c, l0);
        if(k$a0 != null) {
            return k$a0 == a.d ? null : com.fasterxml.jackson.databind.introspect.c.a(l0, k$a0);
        }
        String s = l0.getName();
        if("valueOf".equals(s) && l0.D() == 1) {
            return com.fasterxml.jackson.databind.introspect.c.a(l0, null);
        }
        if("fromString".equals(s) && l0.D() == 1) {
            Class class0 = l0.F(0);
            return class0 != String.class && !CharSequence.class.isAssignableFrom(class0) ? null : com.fasterxml.jackson.databind.introspect.c.a(l0, null);
        }
        return null;
    }

    public v T(B b0) {
        for(Object object0: this.Q()) {
            v v0 = (v)object0;
            if(v0.K(b0)) {
                return v0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public static t U(G g0) {
        return new t(g0);
    }

    public static t V(com.fasterxml.jackson.databind.cfg.t t0, m m0, d d0) {
        return new t(t0, m0, d0, Collections.emptyList());
    }

    public static t W(G g0) {
        return new t(g0);
    }

    public boolean X(B b0) {
        return this.T(b0) != null;
    }

    protected boolean Y(l l0) {
        if(!this.y().isAssignableFrom(l0.N())) {
            return false;
        }
        a k$a0 = this.d.k(this.c, l0);
        if(k$a0 != null && k$a0 != a.d) {
            return true;
        }
        String s = l0.getName();
        if("valueOf".equals(s) && l0.D() == 1) {
            return true;
        }
        if("fromString".equals(s) && l0.D() == 1) {
            Class class0 = l0.F(0);
            return class0 == String.class || CharSequence.class.isAssignableFrom(class0);
        }
        return false;
    }

    public boolean Z(String s) {
        Iterator iterator0 = this.Q().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(((v)object0).getName().equals(s)) {
                iterator0.remove();
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @Override  // com.fasterxml.jackson.databind.c
    @Deprecated
    public p a() {
        return this.a.D();
    }

    @Override  // com.fasterxml.jackson.databind.c
    public k b() throws IllegalArgumentException {
        G g0 = this.b;
        if(g0 != null) {
            k k0 = g0.F();
            Class class0 = Map.class;
            if(k0 != null) {
                if(!class0.isAssignableFrom(k0.f())) {
                    throw new IllegalArgumentException(String.format("Invalid \'any-getter\' annotation on method %s(): return type is not instance of java.util.Map", k0.getName()));
                }
                return k0;
            }
            k k1 = this.b.E();
            if(k1 != null) {
                if(!class0.isAssignableFrom(k1.f())) {
                    throw new IllegalArgumentException(String.format("Invalid \'any-getter\' annotation on field \'%s\': type is not instance of java.util.Map", k1.getName()));
                }
                return k1;
            }
        }
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.c
    public k d() throws IllegalArgumentException {
        G g0 = this.b;
        if(g0 != null) {
            k k0 = g0.H();
            if(k0 != null) {
                Class class0 = ((l)k0).F(0);
                if(class0 != String.class && class0 != Object.class) {
                    throw new IllegalArgumentException(String.format("Invalid \'any-setter\' annotation on method \'%s()\': first argument not of type String or Object, but %s", ((l)k0).getName(), class0.getName()));
                }
                return k0;
            }
            k k1 = this.b.G();
            if(k1 != null) {
                Class class1 = k1.f();
                if(!Map.class.isAssignableFrom(class1) && !com.fasterxml.jackson.databind.p.class.isAssignableFrom(class1)) {
                    throw new IllegalArgumentException(String.format("Invalid \'any-setter\' annotation on field \'%s\': type is not instance of `java.util.Map` or `JsonNode`", k1.getName()));
                }
                return k1;
            }
        }
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.c
    @Deprecated
    public Map f() {
        List list0 = this.g();
        if(list0 == null) {
            return null;
        }
        Map map0 = new HashMap();
        for(Object object0: list0) {
            map0.put(((v)object0).getName(), ((v)object0).B());
        }
        return map0;
    }

    @Override  // com.fasterxml.jackson.databind.c
    public List g() {
        List list0 = null;
        HashSet hashSet0 = null;
        for(Object object0: this.Q()) {
            v v0 = (v)object0;
            com.fasterxml.jackson.databind.b.a b$a0 = v0.s();
            if(b$a0 != null && b$a0.d()) {
                String s = b$a0.b();
                if(list0 == null) {
                    list0 = new ArrayList();
                    hashSet0 = new HashSet();
                    hashSet0.add(s);
                }
                else if(!hashSet0.add(s)) {
                    throw new IllegalArgumentException("Multiple back-reference properties with name " + h.j0(s));
                }
                list0.add(v0);
            }
        }
        return list0;
    }

    @Override  // com.fasterxml.jackson.databind.c
    public String h() {
        return this.d == null ? null : this.d.h(this.e);
    }

    @Override  // com.fasterxml.jackson.databind.c
    public f i() {
        return this.e.y();
    }

    @Override  // com.fasterxml.jackson.databind.c
    public Class[] j() {
        if(!this.g) {
            this.g = true;
            Class[] arr_class = this.d == null ? null : this.d.u0(this.e);
            if(arr_class == null && !this.c.a0(com.fasterxml.jackson.databind.t.v)) {
                arr_class = t.j;
            }
            this.f = arr_class;
        }
        return this.f;
    }

    @Override  // com.fasterxml.jackson.databind.c
    public j k() {
        return this.d == null ? null : this.N(this.d.p(this.e));
    }

    @Override  // com.fasterxml.jackson.databind.c
    public com.fasterxml.jackson.annotation.n.d l(com.fasterxml.jackson.annotation.n.d n$d0) {
        b b0 = this.d;
        if(b0 != null) {
            com.fasterxml.jackson.annotation.n.d n$d1 = b0.A(this.e);
            if(n$d1 != null) {
                n$d0 = n$d0 == null ? n$d1 : n$d0.C(n$d1);
            }
        }
        com.fasterxml.jackson.annotation.n.d n$d2 = this.c.B(this.e.f());
        if(n$d2 != null) {
            return n$d0 == null ? n$d2 : n$d0.C(n$d2);
        }
        return n$d0;
    }

    @Override  // com.fasterxml.jackson.databind.c
    @Deprecated
    public Method m(Class[] arr_class) {
        for(Object object0: this.e.z()) {
            l l0 = (l)object0;
            if(this.Y(l0) && l0.D() == 1) {
                Class class0 = l0.F(0);
                for(int v = 0; v < arr_class.length; ++v) {
                    if(class0.isAssignableFrom(arr_class[v])) {
                        return l0.J();
                    }
                }
            }
        }
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.c
    public Map n() {
        return this.b == null ? Collections.emptyMap() : this.b.L();
    }

    @Override  // com.fasterxml.jackson.databind.c
    public k o() {
        return this.b == null ? null : this.b.M();
    }

    @Override  // com.fasterxml.jackson.databind.c
    public k p() {
        return this.b == null ? null : this.b.N();
    }

    @Override  // com.fasterxml.jackson.databind.c
    @Deprecated
    public l q() {
        return this.b == null ? null : this.b.O();
    }

    @Override  // com.fasterxml.jackson.databind.c
    public l r(String s, Class[] arr_class) {
        return this.e.s(s, arr_class);
    }

    @Override  // com.fasterxml.jackson.databind.c
    public Class s() {
        return this.d == null ? null : this.d.O(this.e);
    }

    @Override  // com.fasterxml.jackson.databind.c
    public com.fasterxml.jackson.databind.annotation.f.a t() {
        return this.d == null ? null : this.d.P(this.e);
    }

    @Override  // com.fasterxml.jackson.databind.c
    public List u() {
        return this.Q();
    }

    @Override  // com.fasterxml.jackson.databind.c
    public com.fasterxml.jackson.annotation.u.b v(com.fasterxml.jackson.annotation.u.b u$b0) {
        b b0 = this.d;
        if(b0 != null) {
            com.fasterxml.jackson.annotation.u.b u$b1 = b0.Z(this.e);
            if(u$b1 != null) {
                return u$b0 == null ? u$b1 : u$b0.o(u$b1);
            }
        }
        return u$b0;
    }

    @Override  // com.fasterxml.jackson.databind.c
    public j w() {
        return this.d == null ? null : this.N(this.d.i0(this.e));
    }

    @Override  // com.fasterxml.jackson.databind.c
    @Deprecated
    public Constructor x(Class[] arr_class) {
        for(Object object0: this.e.x()) {
            f f0 = (f)object0;
            if(f0.D() == 1) {
                Class class0 = f0.F(0);
                for(int v = 0; v < arr_class.length; ++v) {
                    if(arr_class[v] == class0) {
                        return f0.H();
                    }
                }
            }
        }
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.c
    public com.fasterxml.jackson.databind.util.b z() {
        return this.e.w();
    }
}

