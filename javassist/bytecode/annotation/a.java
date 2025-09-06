package javassist.bytecode.annotation;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javassist.E;
import javassist.bytecode.t;
import javassist.bytecode.w;
import javassist.l;
import javassist.q;

public class a {
    static class javassist.bytecode.annotation.a.a {
        int a;
        o b;

    }

    t a;
    int b;
    Map c;

    public a(int v, t t0) {
        this.a = t0;
        this.b = v;
        this.c = null;
    }

    public a(String s, t t0) {
        this(t0.x(w.n(s)), t0);
    }

    public a(t t0, l l0) throws E {
        this(t0.x(w.n(l0.X())), t0);
        if(!l0.n0()) {
            throw new RuntimeException("Only interfaces are allowed for Annotation creation.");
        }
        q[] arr_q = l0.J();
        if(arr_q.length > 0) {
            this.c = new LinkedHashMap();
        }
        for(int v = 0; v < arr_q.length; ++v) {
            q q0 = arr_q[v];
            this.b(q0.i(), a.d(t0, q0.b0()));
        }
    }

    public void a(int v, o o0) {
        javassist.bytecode.annotation.a.a a$a0 = new javassist.bytecode.annotation.a.a();
        a$a0.a = v;
        a$a0.b = o0;
        this.c(a$a0);
    }

    public void b(String s, o o0) {
        javassist.bytecode.annotation.a.a a$a0 = new javassist.bytecode.annotation.a.a();
        a$a0.a = this.a.x(s);
        a$a0.b = o0;
        if(this.c == null) {
            this.c = new LinkedHashMap();
        }
        this.c.put(s, a$a0);
    }

    private void c(javassist.bytecode.annotation.a.a a$a0) {
        String s = this.a.p0(a$a0.a);
        if(this.c == null) {
            this.c = new LinkedHashMap();
        }
        this.c.put(s, a$a0);
    }

    public static o d(t t0, l l0) throws E {
        if(l0 == l.e) {
            return new f(t0);
        }
        if(l0 == l.g) {
            return new g(t0);
        }
        if(l0 == l.f) {
            return new h(t0);
        }
        if(l0 == l.h) {
            return new r(t0);
        }
        if(l0 == l.i) {
            return new m(t0);
        }
        if(l0 == l.j) {
            return new n(t0);
        }
        if(l0 == l.k) {
            return new javassist.bytecode.annotation.l(t0);
        }
        if(l0 == l.l) {
            return new j(t0);
        }
        if(l0.X().equals("java.lang.Class")) {
            return new i(t0);
        }
        if(l0.X().equals("java.lang.String")) {
            return new s(t0);
        }
        if(l0.k0()) {
            return new e(a.d(t0, l0.x()), t0);
        }
        if(l0.n0()) {
            return new c(new a(t0, l0), t0);
        }
        o o0 = new k(t0);
        ((k)o0).i(l0.X());
        return o0;
    }

    public Set e() {
        return this.c == null ? null : this.c.keySet();
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 == null || !(object0 instanceof a) || !this.g().equals(((a)object0).g())) {
            return false;
        }
        Map map0 = ((a)object0).c;
        Map map1 = this.c;
        if(map1 == map0) {
            return true;
        }
        if(map1 == null) {
            return map0 == null;
        }
        return map0 == null ? false : map1.equals(map0);
    }

    public o f(String s) {
        return this.c == null || this.c.get(s) == null ? null : ((javassist.bytecode.annotation.a.a)this.c.get(s)).b;
    }

    public String g() {
        return w.w(this.a.p0(this.b));
    }

    public Object h(ClassLoader classLoader0, javassist.g g0) throws ClassNotFoundException, javassist.bytecode.annotation.q {
        Class class0 = o.e(classLoader0, this.g());
        try {
            return b.g(classLoader0, class0, g0, this);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new ClassNotFoundException(class0.getName(), illegalArgumentException0);
        }
        catch(IllegalAccessError illegalAccessError0) {
            throw new ClassNotFoundException(class0.getName(), illegalAccessError0);
        }
    }

    @Override
    public int hashCode() {
        int v = this.g().hashCode();
        return this.c == null ? v : v + this.c.hashCode();
    }

    public void i(d d0) throws IOException {
        String s = this.a.p0(this.b);
        Map map0 = this.c;
        if(map0 == null) {
            d0.b(s, 0);
            return;
        }
        d0.b(s, map0.size());
        for(Object object0: this.c.values()) {
            d0.u(((javassist.bytecode.annotation.a.a)object0).a);
            ((javassist.bytecode.annotation.a.a)object0).b.f(d0);
        }
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer0 = new StringBuffer("@");
        stringBuffer0.append(this.g());
        if(this.c != null) {
            stringBuffer0.append("(");
            for(Object object0: this.c.keySet()) {
                stringBuffer0.append(((String)object0));
                stringBuffer0.append("=");
                stringBuffer0.append(this.f(((String)object0)));
                stringBuffer0.append(", ");
            }
            stringBuffer0.setLength(stringBuffer0.length() - 2);
            stringBuffer0.append(")");
        }
        return stringBuffer0.toString();
    }
}

