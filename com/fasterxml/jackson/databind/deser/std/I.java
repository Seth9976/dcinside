package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.annotation.b;
import com.fasterxml.jackson.databind.cfg.c;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.deser.B;
import com.fasterxml.jackson.databind.deser.v;
import com.fasterxml.jackson.databind.deser.z;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.jsontype.f;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.n;
import com.fasterxml.jackson.databind.o;
import j..util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@b
public class i extends j implements com.fasterxml.jackson.databind.deser.j {
    static final class a extends com.fasterxml.jackson.databind.deser.impl.z.a {
        private final com.fasterxml.jackson.databind.deser.std.i.b c;
        public final List d;

        a(com.fasterxml.jackson.databind.deser.std.i.b i$b0, z z0, Class class0) {
            super(z0, class0);
            this.d = new ArrayList();
            this.c = i$b0;
        }

        @Override  // com.fasterxml.jackson.databind.deser.impl.z$a
        public void c(Object object0, Object object1) throws IOException {
            this.c.c(object0, object1);
        }
    }

    public static class com.fasterxml.jackson.databind.deser.std.i.b {
        private final Class a;
        private final Collection b;
        private List c;

        public com.fasterxml.jackson.databind.deser.std.i.b(Class class0, Collection collection0) {
            this.c = new ArrayList();
            this.a = class0;
            this.b = collection0;
        }

        public void a(Object object0) {
            if(this.c.isEmpty()) {
                this.b.add(object0);
                return;
            }
            ((a)this.c.get(this.c.size() - 1)).d.add(object0);
        }

        public com.fasterxml.jackson.databind.deser.impl.z.a b(z z0) {
            com.fasterxml.jackson.databind.deser.impl.z.a z$a0 = new a(this, z0, this.a);
            this.c.add(z$a0);
            return z$a0;
        }

        public void c(Object object0, Object object1) throws IOException {
            Collection collection0 = this.b;
            Iterator iterator0 = this.c.iterator();
            while(iterator0.hasNext()) {
                Object object2 = iterator0.next();
                a i$a0 = (a)object2;
                if(i$a0.d(object0)) {
                    iterator0.remove();
                    collection0.add(object1);
                    collection0.addAll(i$a0.d);
                    return;
                }
                collection0 = i$a0.d;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + object0 + "] that wasn\'t previously seen as unresolved.");
        }
    }

    protected final n j;
    protected final f k;
    protected final B l;
    protected final n m;
    private static final long n = -1L;

    protected i(i i0) {
        super(i0);
        this.j = i0.j;
        this.k = i0.k;
        this.l = i0.l;
        this.m = i0.m;
    }

    public i(m m0, n n0, f f0, B b0) {
        this(m0, n0, f0, b0, null, null, null);
    }

    protected i(m m0, n n0, f f0, B b0, n n1, v v0, Boolean boolean0) {
        super(m0, v0, boolean0);
        this.j = n0;
        this.k = f0;
        this.l = b0;
        this.m = n1;
    }

    public Collection A1(com.fasterxml.jackson.core.n n0, h h0) throws IOException {
        n n1 = this.m;
        if(n1 != null) {
            Object object0 = n1.g(n0, h0);
            return (Collection)this.l.C(h0, object0);
        }
        if(n0.d4()) {
            return this.v1(n0, h0, this.z1(h0));
        }
        return n0.Y3(r.q) ? this.w1(n0, h0, n0.R2()) : this.C1(n0, h0, this.z1(h0));
    }

    // 去混淆评级： 低(20)
    public Collection B1(com.fasterxml.jackson.core.n n0, h h0, Collection collection0) throws IOException {
        return n0.d4() ? this.v1(n0, h0, collection0) : this.C1(n0, h0, collection0);
    }

    protected final Collection C1(com.fasterxml.jackson.core.n n0, h h0, Collection collection0) throws IOException {
        Object object0;
        if(this.i != Boolean.TRUE && (this.i != null || !h0.J0(com.fasterxml.jackson.databind.i.s))) {
            return (Collection)h0.t0(this.f, n0);
        }
        try {
            n n1 = this.j;
            f f0 = this.k;
            if(n0.Y3(r.v)) {
                if(this.h) {
                    return collection0;
                }
                object0 = this.g.c(h0);
            }
            else {
                object0 = f0 == null ? n1.g(n0, h0) : n1.i(n0, h0, f0);
            }
            goto label_15;
        }
        catch(Exception exception0) {
        }
        if(!h0.J0(com.fasterxml.jackson.databind.i.r)) {
            com.fasterxml.jackson.databind.util.h.x0(exception0);
        }
        throw o.C(exception0, Object.class, collection0.size());
    label_15:
        collection0.add(object0);
        return collection0;
    }

    protected i D1(n n0, n n1, f f0, v v0, Boolean boolean0) {
        return new i(this.f, n1, f0, this.l, n0, v0, boolean0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.j
    public n a(h h0, d d0) throws o {
        return this.y1(h0, d0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.D, com.fasterxml.jackson.databind.deser.B$c
    public B e() {
        return this.l;
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object g(com.fasterxml.jackson.core.n n0, h h0) throws IOException, com.fasterxml.jackson.core.f {
        return this.A1(n0, h0);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object h(com.fasterxml.jackson.core.n n0, h h0, Object object0) throws IOException, com.fasterxml.jackson.core.f {
        return this.B1(n0, h0, ((Collection)object0));
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.D
    public Object i(com.fasterxml.jackson.core.n n0, h h0, f f0) throws IOException {
        return f0.d(n0, h0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.j
    public n r1() {
        return this.j;
    }

    @Override  // com.fasterxml.jackson.databind.n
    public boolean u() {
        return this.j == null && this.k == null && this.m == null;
    }

    protected Collection v1(com.fasterxml.jackson.core.n n0, h h0, Collection collection0) throws IOException {
        Object object0;
        n0.C4(collection0);
        n n1 = this.j;
        if(n1.r() != null) {
            return this.x1(n0, h0, collection0);
        }
        f f0 = this.k;
        r r0;
        while((r0 = n0.m4()) != r.n) {
            try {
                if(r0 == r.v) {
                    if(this.h) {
                        continue;
                    }
                    object0 = this.g.c(h0);
                }
                else {
                    object0 = f0 == null ? n1.g(n0, h0) : n1.i(n0, h0, f0);
                }
                collection0.add(object0);
                continue;
            }
            catch(Exception exception0) {
            }
            if(h0 != null && !h0.J0(com.fasterxml.jackson.databind.i.r)) {
                com.fasterxml.jackson.databind.util.h.x0(exception0);
            }
            throw o.C(exception0, collection0, collection0.size());
        }
        return collection0;
    }

    @Override  // com.fasterxml.jackson.databind.n
    public com.fasterxml.jackson.databind.type.h w() {
        return com.fasterxml.jackson.databind.type.h.b;
    }

    protected Collection w1(com.fasterxml.jackson.core.n n0, h h0, String s) throws IOException {
        Class class0 = this.s();
        if(s.isEmpty()) {
            c c0 = h0.V(this.w(), class0, com.fasterxml.jackson.databind.cfg.f.j);
            return c0 == null || c0 == c.a ? this.C1(n0, h0, this.z1(h0)) : ((Collection)this.W(n0, h0, c0, class0, "empty String (\"\")"));
        }
        if(D.h0(s)) {
            c c1 = h0.W(this.w(), class0, c.a);
            return c1 == c.a ? this.C1(n0, h0, this.z1(h0)) : ((Collection)this.W(n0, h0, c1, class0, "blank String (all whitespace)"));
        }
        return this.C1(n0, h0, this.z1(h0));
    }

    protected Collection x1(com.fasterxml.jackson.core.n n0, h h0, Collection collection0) throws IOException {
        Object object0;
        if(!n0.d4()) {
            return this.C1(n0, h0, collection0);
        }
        n0.C4(collection0);
        n n1 = this.j;
        f f0 = this.k;
        com.fasterxml.jackson.databind.deser.std.i.b i$b0 = new com.fasterxml.jackson.databind.deser.std.i.b(this.f.E().g(), collection0);
        r r0;
        while((r0 = n0.m4()) != r.n) {
            try {
                if(r0 == r.v) {
                    if(this.h) {
                        continue;
                    }
                    object0 = this.g.c(h0);
                }
                else {
                    object0 = f0 == null ? n1.g(n0, h0) : n1.i(n0, h0, f0);
                }
                i$b0.a(object0);
                continue;
            }
            catch(z z0) {
            }
            catch(Exception exception0) {
                goto label_20;
            }
            z0.G().a(i$b0.b(z0));
            continue;
        label_20:
            if(h0 != null && !h0.J0(com.fasterxml.jackson.databind.i.r)) {
                com.fasterxml.jackson.databind.util.h.x0(exception0);
            }
            throw o.C(exception0, collection0, collection0.size());
        }
        return collection0;
    }

    public i y1(h h0, d d0) throws o {
        n n0;
        B b0 = this.l;
        if(b0 == null) {
            n0 = null;
        }
        else if(b0.l()) {
            m m0 = this.l.H(h0.g0());
            if(m0 == null) {
                String s = this.l.getClass().getName();
                h0.D(this.f, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for \'canCreateUsingDelegate()\', but null for \'getDelegateType()\'", this.f, s));
            }
            n0 = this.f1(h0, m0, d0);
        }
        else if(this.l.j()) {
            m m1 = this.l.E(h0.g0());
            if(m1 == null) {
                String s1 = this.l.getClass().getName();
                h0.D(this.f, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for \'canCreateUsingArrayDelegate()\', but null for \'getArrayDelegateType()\'", this.f, s1));
            }
            n0 = this.f1(h0, m1, d0);
        }
        else {
            n0 = null;
        }
        Boolean boolean0 = this.g1(h0, d0, Collection.class, com.fasterxml.jackson.annotation.n.a.a);
        n n1 = this.e1(h0, d0, this.j);
        m m2 = this.f.E();
        n n2 = n1 == null ? h0.X(m2, d0) : h0.s0(n1, d0, m2);
        f f0 = this.k == null ? this.k : this.k.g(d0);
        v v0 = this.c1(h0, d0, n2);
        return !Objects.equals(boolean0, this.i) || v0 != this.g || n0 != this.m || n2 != this.j || f0 != this.k ? this.D1(n0, n2, f0, v0, boolean0) : this;
    }

    protected Collection z1(h h0) throws IOException {
        return (Collection)this.l.A(h0);
    }
}

