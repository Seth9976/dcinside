package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.u.a;
import com.fasterxml.jackson.core.io.q;
import com.fasterxml.jackson.core.w;
import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.B;
import com.fasterxml.jackson.databind.G;
import com.fasterxml.jackson.databind.H;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.annotation.b;
import com.fasterxml.jackson.databind.introspect.i;
import com.fasterxml.jackson.databind.introspect.k;
import com.fasterxml.jackson.databind.introspect.l;
import com.fasterxml.jackson.databind.introspect.v;
import com.fasterxml.jackson.databind.jsonschema.c;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.r;
import com.fasterxml.jackson.databind.ser.impl.u;
import com.fasterxml.jackson.databind.t;
import com.fasterxml.jackson.databind.util.h;
import com.fasterxml.jackson.databind.util.x;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;

@b
public class d extends p implements Serializable {
    protected final q e;
    protected final B f;
    protected final m g;
    protected final m h;
    protected m i;
    protected final transient com.fasterxml.jackson.databind.util.b j;
    protected final k k;
    protected transient Method l;
    protected transient Field m;
    protected r n;
    protected r o;
    protected j p;
    protected transient com.fasterxml.jackson.databind.ser.impl.k q;
    protected final boolean r;
    protected final Object s;
    protected final Class[] t;
    protected transient HashMap u;
    private static final long v = 1L;
    public static final Object w;

    static {
        d.w = a.d;
    }

    protected d() {
        super(A.k);
        this.k = null;
        this.j = null;
        this.e = null;
        this.f = null;
        this.t = null;
        this.g = null;
        this.n = null;
        this.q = null;
        this.p = null;
        this.h = null;
        this.l = null;
        this.m = null;
        this.r = false;
        this.s = null;
        this.o = null;
    }

    @Deprecated
    public d(v v0, k k0, com.fasterxml.jackson.databind.util.b b0, m m0, r r0, j j0, m m1, boolean z, Object object0) {
        this(v0, k0, b0, m0, r0, j0, m1, z, object0, null);
    }

    public d(v v0, k k0, com.fasterxml.jackson.databind.util.b b0, m m0, r r0, j j0, m m1, boolean z, Object object0, Class[] arr_class) {
        super(v0);
        this.k = k0;
        this.j = b0;
        this.e = new q(v0.getName());
        this.f = v0.d();
        this.g = m0;
        this.n = r0;
        this.q = r0 == null ? com.fasterxml.jackson.databind.ser.impl.k.c() : null;
        this.p = j0;
        this.h = m1;
        if(k0 instanceof i) {
            this.l = null;
            this.m = (Field)k0.o();
        }
        else {
            this.l = k0 instanceof l ? ((Method)k0.o()) : null;
            this.m = null;
        }
        this.r = z;
        this.s = object0;
        this.o = null;
        this.t = arr_class;
    }

    protected d(d d0) {
        this(d0, d0.e);
    }

    protected d(d d0, q q0) {
        super(d0);
        this.e = q0;
        this.f = d0.f;
        this.k = d0.k;
        this.j = d0.j;
        this.g = d0.g;
        this.l = d0.l;
        this.m = d0.m;
        this.n = d0.n;
        this.o = d0.o;
        if(d0.u != null) {
            this.u = new HashMap(d0.u);
        }
        this.h = d0.h;
        this.q = d0.q;
        this.r = d0.r;
        this.s = d0.s;
        this.t = d0.t;
        this.p = d0.p;
        this.i = d0.i;
    }

    protected d(d d0, B b0) {
        super(d0);
        this.e = new q(b0.d());
        this.f = d0.f;
        this.j = d0.j;
        this.g = d0.g;
        this.k = d0.k;
        this.l = d0.l;
        this.m = d0.m;
        this.n = d0.n;
        this.o = d0.o;
        if(d0.u != null) {
            this.u = new HashMap(d0.u);
        }
        this.h = d0.h;
        this.q = d0.q;
        this.r = d0.r;
        this.s = d0.s;
        this.t = d0.t;
        this.p = d0.p;
        this.i = d0.i;
    }

    public void A(G g0) {
        boolean z = g0.a0(t.q);
        this.k.k(z);
    }

    public final Object B(Object object0) throws Exception {
        return this.l == null ? this.m.get(object0) : this.l.invoke(object0, null);
    }

    @Deprecated
    public Type C() {
        Method method0 = this.l;
        if(method0 != null) {
            return method0.getGenericReturnType();
        }
        return this.m == null ? null : this.m.getGenericType();
    }

    public Object D(Object object0) {
        return this.u == null ? null : this.u.get(object0);
    }

    @Deprecated
    public Class E() {
        Method method0 = this.l;
        if(method0 != null) {
            return method0.getReturnType();
        }
        return this.m == null ? null : this.m.getType();
    }

    @Deprecated
    public Class F() {
        return this.h == null ? null : this.h.g();
    }

    public m G() {
        return this.h;
    }

    public w H() {
        return this.e;
    }

    public r I() {
        return this.n;
    }

    public j J() {
        return this.p;
    }

    public Class[] K() {
        return this.t;
    }

    public boolean L() {
        return this.o != null;
    }

    public boolean M() {
        return this.n != null;
    }

    public boolean N() {
        return false;
    }

    Object O() {
        k k0 = this.k;
        if(k0 instanceof i) {
            this.l = null;
            this.m = (Field)k0.o();
        }
        else if(k0 instanceof l) {
            this.l = (Method)k0.o();
            this.m = null;
        }
        if(this.n == null) {
            this.q = com.fasterxml.jackson.databind.ser.impl.k.c();
        }
        return this;
    }

    public Object P(Object object0) {
        HashMap hashMap0 = this.u;
        if(hashMap0 != null) {
            Object object1 = hashMap0.remove(object0);
            if(this.u.size() == 0) {
                this.u = null;
            }
            return object1;
        }
        return null;
    }

    public d Q(x x0) {
        String s = x0.d(this.e.getValue());
        return s.equals(this.e.toString()) ? this : this.w(B.a(s));
    }

    public Object R(Object object0, Object object1) {
        if(this.u == null) {
            this.u = new HashMap();
        }
        return this.u.put(object0, object1);
    }

    public void S(m m0) {
        this.i = m0;
    }

    public d T(x x0) {
        return new u(this, x0);
    }

    public boolean U() {
        return this.r;
    }

    // 去混淆评级： 低(20)
    public boolean V(B b0) {
        return this.f == null ? b0.g(this.e.getValue()) && !b0.e() : this.f.equals(b0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.p
    public B a() {
        return new B(this.e.getValue());
    }

    @Override  // com.fasterxml.jackson.databind.ser.p
    public Annotation b(Class class0) {
        return this.j == null ? null : this.j.a(class0);
    }

    @Override  // com.fasterxml.jackson.databind.d
    public B d() {
        return this.f;
    }

    @Override  // com.fasterxml.jackson.databind.ser.p
    public void g(com.fasterxml.jackson.databind.jsonFormatVisitors.l l0, I i0) throws o {
        if(l0 != null) {
            if(this.c()) {
                l0.l(this);
                return;
            }
            l0.i(this);
        }
    }

    @Override  // com.fasterxml.jackson.databind.ser.p
    public Annotation getAnnotation(Class class0) {
        return this.k == null ? null : this.k.d(class0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.p
    public String getName() {
        return this.e.getValue();
    }

    @Override  // com.fasterxml.jackson.databind.d
    public m getType() {
        return this.g;
    }

    @Override  // com.fasterxml.jackson.databind.d
    public k h() {
        return this.k;
    }

    @Override  // com.fasterxml.jackson.databind.ser.p
    @Deprecated
    public void l(com.fasterxml.jackson.databind.node.u u0, I i0) throws o {
        m m0 = this.G();
        m m1 = m0 == null ? this.getType() : m0.g();
        r r0 = this.I() == null ? i0.o0(this.getType(), this) : this.I();
        this.r(u0, (r0 instanceof c ? ((c)r0).d(i0, m1, !this.c()) : com.fasterxml.jackson.databind.jsonschema.a.a()));
    }

    @Override  // com.fasterxml.jackson.databind.ser.p
    public void n(Object object0, com.fasterxml.jackson.core.k k0, I i0) throws Exception {
        Object object1 = this.l == null ? this.m.get(object0) : this.l.invoke(object0, null);
        if(object1 == null) {
            r r0 = this.o;
            if(r0 != null) {
                r0.m(null, k0, i0);
                return;
            }
            k0.y3();
            return;
        }
        r r1 = this.n;
        if(r1 == null) {
            Class class0 = object1.getClass();
            com.fasterxml.jackson.databind.ser.impl.k k1 = this.q;
            r r2 = k1.m(class0);
            r1 = r2 == null ? this.s(k1, class0, i0) : r2;
        }
        Object object2 = this.s;
        if(object2 != null) {
            if(d.w == object2) {
                if(r1.h(i0, object1)) {
                    this.q(object0, k0, i0);
                    return;
                }
            }
            else if(object2.equals(object1)) {
                this.q(object0, k0, i0);
                return;
            }
        }
        if(object1 == object0 && this.u(object0, k0, i0, r1)) {
            return;
        }
        j j0 = this.p;
        if(j0 == null) {
            r1.m(object1, k0, i0);
            return;
        }
        r1.n(object1, k0, i0, j0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.p
    public void o(Object object0, com.fasterxml.jackson.core.k k0, I i0) throws Exception {
        Object object1 = this.l == null ? this.m.get(object0) : this.l.invoke(object0, null);
        if(object1 == null) {
            if(this.s != null && i0.C0(this.s)) {
                return;
            }
            if(this.o != null) {
                k0.s3(this.e);
                this.o.m(null, k0, i0);
            }
            return;
        }
        r r0 = this.n;
        if(r0 == null) {
            Class class0 = object1.getClass();
            com.fasterxml.jackson.databind.ser.impl.k k1 = this.q;
            r r1 = k1.m(class0);
            r0 = r1 == null ? this.s(k1, class0, i0) : r1;
        }
        Object object2 = this.s;
        if(object2 != null) {
            if(d.w == object2) {
                if(r0.h(i0, object1)) {
                    return;
                }
            }
            else if(object2.equals(object1)) {
                return;
            }
        }
        if(object1 == object0 && this.u(object0, k0, i0, r0)) {
            return;
        }
        k0.s3(this.e);
        j j0 = this.p;
        if(j0 == null) {
            r0.m(object1, k0, i0);
            return;
        }
        r0.n(object1, k0, i0, j0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.p
    public void p(Object object0, com.fasterxml.jackson.core.k k0, I i0) throws Exception {
        if(!k0.q()) {
            k0.m4(this.e.getValue());
        }
    }

    @Override  // com.fasterxml.jackson.databind.ser.p
    public void q(Object object0, com.fasterxml.jackson.core.k k0, I i0) throws Exception {
        r r0 = this.o;
        if(r0 != null) {
            r0.m(null, k0, i0);
            return;
        }
        k0.y3();
    }

    protected void r(com.fasterxml.jackson.databind.node.u u0, com.fasterxml.jackson.databind.p p0) {
        u0.t3(this.getName(), p0);
    }

    protected r s(com.fasterxml.jackson.databind.ser.impl.k k0, Class class0, I i0) throws o {
        m m0 = this.i;
        com.fasterxml.jackson.databind.ser.impl.k.d k$d0 = m0 == null ? k0.g(class0, i0, this) : k0.f(i0.k(m0, class0), i0, this);
        com.fasterxml.jackson.databind.ser.impl.k k1 = k$d0.b;
        if(k0 != k1) {
            this.q = k1;
        }
        return k$d0.a;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(40);
        stringBuilder0.append("property \'");
        stringBuilder0.append(this.getName());
        stringBuilder0.append("\' (");
        if(this.l != null) {
            stringBuilder0.append("via method ");
            stringBuilder0.append(this.l.getDeclaringClass().getName());
            stringBuilder0.append("#");
            stringBuilder0.append(this.l.getName());
        }
        else if(this.m == null) {
            stringBuilder0.append("virtual");
        }
        else {
            stringBuilder0.append("field \"");
            stringBuilder0.append(this.m.getDeclaringClass().getName());
            stringBuilder0.append("#");
            stringBuilder0.append(this.m.getName());
        }
        if(this.n == null) {
            stringBuilder0.append(", no static serializer");
        }
        else {
            stringBuilder0.append(", static serializer of type " + this.n.getClass().getName());
        }
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }

    protected boolean u(Object object0, com.fasterxml.jackson.core.k k0, I i0, r r0) throws IOException {
        if(!r0.p()) {
            if(i0.D0(H.f)) {
                if(r0 instanceof com.fasterxml.jackson.databind.ser.std.d) {
                    i0.D(this.getType(), "Direct self-reference leading to cycle");
                    return false;
                }
            }
            else if(i0.D0(H.i)) {
                if(this.o != null) {
                    if(!k0.T0().l()) {
                        k0.s3(this.e);
                    }
                    this.o.m(null, k0, i0);
                }
                return true;
            }
        }
        return false;
    }

    protected d w(B b0) {
        return new d(this, b0);
    }

    public void x(r r0) {
        if(this.o != null && this.o != r0) {
            throw new IllegalStateException(String.format("Cannot override _nullSerializer: had a %s, trying to set to %s", h.j(this.o), h.j(r0)));
        }
        this.o = r0;
    }

    public void y(r r0) {
        if(this.n != null && this.n != r0) {
            throw new IllegalStateException(String.format("Cannot override _serializer: had a %s, trying to set to %s", h.j(this.n), h.j(r0)));
        }
        this.n = r0;
    }

    public void z(j j0) {
        this.p = j0;
    }
}

