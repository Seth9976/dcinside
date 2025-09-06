package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.N;
import com.fasterxml.jackson.annotation.P;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.cfg.b;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.i;
import com.fasterxml.jackson.databind.l;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.s;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

public abstract class n extends h implements Serializable {
    public static final class a extends n {
        private static final long s = 1L;

        private a(a n$a0) {
            super(n$a0);
        }

        private a(a n$a0, b b0) {
            super(n$a0, b0);
        }

        private a(a n$a0, q q0) {
            super(n$a0, q0);
        }

        private a(a n$a0, g g0) {
            super(n$a0, g0);
        }

        private a(a n$a0, g g0, com.fasterxml.jackson.core.n n0, l l0) {
            super(n$a0, g0, n0, l0);
        }

        public a(q q0) {
            super(q0, new p());
        }

        @Override  // com.fasterxml.jackson.databind.deser.n
        public n A1(b b0) {
            return new a(this, b0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.n
        public n t1() {
            com.fasterxml.jackson.databind.util.h.B0(a.class, this, "copy");
            return new a(this);
        }

        @Override  // com.fasterxml.jackson.databind.deser.n
        public n u1(g g0) {
            return new a(this, g0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.n
        public n v1(g g0, com.fasterxml.jackson.core.n n0, l l0) {
            return new a(this, g0, n0, l0);
        }

        @Override  // com.fasterxml.jackson.databind.deser.n
        public n z1(q q0) {
            return new a(this, q0);
        }
    }

    protected transient LinkedHashMap p;
    private List q;
    private static final long r = 1L;

    protected n(n n0) {
        super(n0);
    }

    protected n(n n0, b b0) {
        super(n0, new p(b0.s3(n0.d)));
    }

    protected n(n n0, q q0) {
        super(n0, q0);
    }

    protected n(n n0, g g0) {
        super(n0, g0);
    }

    protected n(n n0, g g0, com.fasterxml.jackson.core.n n1, l l0) {
        super(n0, g0, n1, l0);
    }

    protected n(q q0, p p0) {
        super(q0, p0);
    }

    public abstract n A1(b arg1);

    @Override  // com.fasterxml.jackson.databind.h
    public final s K0(com.fasterxml.jackson.databind.introspect.b b0, Object object0) throws o {
        s s1;
        s s0 = null;
        if(object0 == null) {
            return null;
        }
        if(object0 instanceof s) {
            s1 = (s)object0;
            goto label_13;
        }
        if(!(object0 instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned key deserializer definition of type " + object0.getClass().getName() + "; expected type KeyDeserializer or Class<KeyDeserializer> instead");
        }
        if(((Class)object0) != com.fasterxml.jackson.databind.s.a.class && !com.fasterxml.jackson.databind.util.h.U(((Class)object0))) {
            if(!s.class.isAssignableFrom(((Class)object0))) {
                throw new IllegalStateException("AnnotationIntrospector returned Class " + ((Class)object0).getName() + "; expected Class<KeyDeserializer>");
            }
            com.fasterxml.jackson.databind.cfg.q q0 = this.d.M();
            if(q0 != null) {
                s0 = q0.d(this.d, b0, ((Class)object0));
            }
            s1 = s0 == null ? ((s)com.fasterxml.jackson.databind.util.h.n(((Class)object0), this.d.c())) : s0;
        label_13:
            if(s1 instanceof w) {
                ((w)s1).b(this);
            }
            return s1;
        }
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.h
    public void P() throws z {
        if(this.p == null) {
            return;
        }
        if(!this.J0(i.m)) {
            return;
        }
        Throwable throwable0 = null;
        for(Object object0: this.p.entrySet()) {
            com.fasterxml.jackson.databind.deser.impl.z z0 = (com.fasterxml.jackson.databind.deser.impl.z)((Map.Entry)object0).getValue();
            if(z0.e() && !this.y1(z0)) {
                if(throwable0 == null) {
                    throwable0 = new z(this.m0(), "Unresolved forward references for: ").J();
                }
                Object object1 = z0.c().c;
                Iterator iterator1 = z0.f();
                while(iterator1.hasNext()) {
                    Object object2 = iterator1.next();
                    ((z)throwable0).E(object1, ((com.fasterxml.jackson.databind.deser.impl.z.a)object2).a(), ((com.fasterxml.jackson.databind.deser.impl.z.a)object2).b());
                }
            }
        }
        if(throwable0 != null) {
            throw throwable0;
        }
    }

    @Override  // com.fasterxml.jackson.databind.h
    public com.fasterxml.jackson.databind.n S(com.fasterxml.jackson.databind.introspect.b b0, Object object0) throws o {
        com.fasterxml.jackson.databind.n n1;
        com.fasterxml.jackson.databind.n n0 = null;
        if(object0 == null) {
            return null;
        }
        if(object0 instanceof com.fasterxml.jackson.databind.n) {
            n1 = (com.fasterxml.jackson.databind.n)object0;
            goto label_13;
        }
        if(!(object0 instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned deserializer definition of type " + object0.getClass().getName() + "; expected type JsonDeserializer or Class<JsonDeserializer> instead");
        }
        if(((Class)object0) != com.fasterxml.jackson.databind.n.a.class && !com.fasterxml.jackson.databind.util.h.U(((Class)object0))) {
            if(!com.fasterxml.jackson.databind.n.class.isAssignableFrom(((Class)object0))) {
                throw new IllegalStateException("AnnotationIntrospector returned Class " + ((Class)object0).getName() + "; expected Class<JsonDeserializer>");
            }
            com.fasterxml.jackson.databind.cfg.q q0 = this.d.M();
            if(q0 != null) {
                n0 = q0.b(this.d, b0, ((Class)object0));
            }
            n1 = n0 == null ? ((com.fasterxml.jackson.databind.n)com.fasterxml.jackson.databind.util.h.n(((Class)object0), this.d.c())) : n0;
        label_13:
            if(n1 instanceof w) {
                ((w)n1).b(this);
            }
            return n1;
        }
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.h
    public com.fasterxml.jackson.databind.deser.impl.z b0(Object object0, N n0, P p0) {
        P p1 = null;
        if(object0 == null) {
            return null;
        }
        com.fasterxml.jackson.annotation.N.a n$a0 = n0.f(object0);
        LinkedHashMap linkedHashMap0 = this.p;
        if(linkedHashMap0 == null) {
            this.p = new LinkedHashMap();
        }
        else {
            com.fasterxml.jackson.databind.deser.impl.z z0 = (com.fasterxml.jackson.databind.deser.impl.z)linkedHashMap0.get(n$a0);
            if(z0 != null) {
                return z0;
            }
        }
        List list0 = this.q;
        if(list0 == null) {
            this.q = new ArrayList(8);
        }
        else {
            for(Object object1: list0) {
                P p2 = (P)object1;
                if(p2.d(p0)) {
                    p1 = p2;
                    break;
                }
                if(false) {
                    break;
                }
            }
        }
        if(p1 == null) {
            p1 = p0.c(this);
            this.q.add(p1);
        }
        com.fasterxml.jackson.databind.deser.impl.z z1 = this.w1(n$a0);
        z1.h(p1);
        this.p.put(n$a0, z1);
        return z1;
    }

    protected Object s1(com.fasterxml.jackson.core.n n0, m m0, com.fasterxml.jackson.databind.n n1, Object object0) throws IOException {
        String s = this.d.j(m0).d();
        r r0 = n0.Y();
        r r1 = r.k;
        if(r0 != r1) {
            this.h1(m0, r1, "Current token not START_OBJECT (needed to unwrap root name %s), but %s", new Object[]{com.fasterxml.jackson.databind.util.h.j0(s), n0.Y()});
        }
        r r2 = n0.m4();
        r r3 = r.o;
        if(r2 != r3) {
            this.h1(m0, r3, "Current token not FIELD_NAME (to contain expected root name %s), but %s", new Object[]{com.fasterxml.jackson.databind.util.h.j0(s), n0.Y()});
        }
        String s1 = n0.T();
        if(!s.equals(s1)) {
            this.d1(m0, s1, "Root name (%s) does not match expected (%s) for type %s", new Object[]{com.fasterxml.jackson.databind.util.h.j0(s1), com.fasterxml.jackson.databind.util.h.j0(s), com.fasterxml.jackson.databind.util.h.Q(m0)});
        }
        n0.m4();
        Object object1 = object0 == null ? n1.g(n0, this) : n1.h(n0, this, object0);
        r r4 = n0.m4();
        r r5 = r.l;
        if(r4 != r5) {
            this.h1(m0, r5, "Current token not END_OBJECT (to match wrapper object with root name %s), but %s", new Object[]{com.fasterxml.jackson.databind.util.h.j0(s), n0.Y()});
        }
        return object1;
    }

    public n t1() {
        throw new IllegalStateException("DefaultDeserializationContext sub-class not overriding copy()");
    }

    public abstract n u1(g arg1);

    public abstract n v1(g arg1, com.fasterxml.jackson.core.n arg2, l arg3);

    protected com.fasterxml.jackson.databind.deser.impl.z w1(com.fasterxml.jackson.annotation.N.a n$a0) {
        return new com.fasterxml.jackson.databind.deser.impl.z(n$a0);
    }

    public Object x1(com.fasterxml.jackson.core.n n0, m m0, com.fasterxml.jackson.databind.n n1, Object object0) throws IOException {
        if(this.d.g0()) {
            return this.s1(n0, m0, n1, object0);
        }
        return object0 == null ? n1.g(n0, this) : n1.h(n0, this, object0);
    }

    protected boolean y1(com.fasterxml.jackson.databind.deser.impl.z z0) {
        return false;
    }

    public abstract n z1(q arg1);
}

