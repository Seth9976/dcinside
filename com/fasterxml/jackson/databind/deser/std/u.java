package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.core.x;
import com.fasterxml.jackson.databind.annotation.b;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.deser.B;
import com.fasterxml.jackson.databind.deser.impl.v;
import com.fasterxml.jackson.databind.deser.impl.y;
import com.fasterxml.jackson.databind.deser.k;
import com.fasterxml.jackson.databind.deser.w;
import com.fasterxml.jackson.databind.deser.z;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.jsontype.f;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.n;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.s;
import com.fasterxml.jackson.databind.t;
import com.fasterxml.jackson.databind.util.c;
import com.fasterxml.jackson.databind.util.q;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@b
public class u extends j implements com.fasterxml.jackson.databind.deser.j, w {
    static class a extends com.fasterxml.jackson.databind.deser.impl.z.a {
        private final com.fasterxml.jackson.databind.deser.std.u.b c;
        public final Map d;
        public final Object e;

        a(com.fasterxml.jackson.databind.deser.std.u.b u$b0, z z0, Class class0, Object object0) {
            super(z0, class0);
            this.d = new LinkedHashMap();
            this.c = u$b0;
            this.e = object0;
        }

        @Override  // com.fasterxml.jackson.databind.deser.impl.z$a
        public void c(Object object0, Object object1) throws IOException {
            this.c.c(object0, object1);
        }
    }

    static final class com.fasterxml.jackson.databind.deser.std.u.b {
        private final Class a;
        private Map b;
        private List c;

        public com.fasterxml.jackson.databind.deser.std.u.b(Class class0, Map map0) {
            this.c = new ArrayList();
            this.a = class0;
            this.b = map0;
        }

        public com.fasterxml.jackson.databind.deser.impl.z.a a(z z0, Object object0) {
            com.fasterxml.jackson.databind.deser.impl.z.a z$a0 = new a(this, z0, this.a, object0);
            this.c.add(z$a0);
            return z$a0;
        }

        public void b(Object object0, Object object1) {
            if(this.c.isEmpty()) {
                this.b.put(object0, object1);
                return;
            }
            ((a)this.c.get(this.c.size() - 1)).d.put(object0, object1);
        }

        public void c(Object object0, Object object1) throws IOException {
            Map map0 = this.b;
            Iterator iterator0 = this.c.iterator();
            while(iterator0.hasNext()) {
                Object object2 = iterator0.next();
                a u$a0 = (a)object2;
                if(u$a0.d(object0)) {
                    iterator0.remove();
                    map0.put(u$a0.e, object1);
                    map0.putAll(u$a0.d);
                    return;
                }
                map0 = u$a0.d;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + object0 + "] that wasn\'t previously seen as unresolved.");
        }
    }

    protected final s j;
    protected boolean k;
    protected final n l;
    protected final f m;
    protected final B n;
    protected n o;
    protected v p;
    protected final boolean q;
    protected Set r;
    protected Set s;
    protected com.fasterxml.jackson.databind.util.q.a t;
    protected boolean u;
    private static final long v = 1L;

    protected u(u u0) {
        super(u0);
        this.j = u0.j;
        this.l = u0.l;
        this.m = u0.m;
        this.n = u0.n;
        this.p = u0.p;
        this.o = u0.o;
        this.q = u0.q;
        this.r = u0.r;
        this.s = u0.s;
        this.t = u0.t;
        this.k = u0.k;
        this.u = u0.u;
    }

    protected u(u u0, s s0, n n0, f f0, com.fasterxml.jackson.databind.deser.v v0, Set set0) {
        this(u0, s0, n0, f0, v0, set0, null);
    }

    protected u(u u0, s s0, n n0, f f0, com.fasterxml.jackson.databind.deser.v v0, Set set0, Set set1) {
        super(u0, v0, u0.i);
        this.j = s0;
        this.l = n0;
        this.m = f0;
        this.n = u0.n;
        this.p = u0.p;
        this.o = u0.o;
        this.q = u0.q;
        this.r = set0;
        this.s = set1;
        this.t = q.a(set0, set1);
        this.k = this.w1(this.f, s0);
        this.u = u0.u;
    }

    public u(m m0, B b0, s s0, n n0, f f0) {
        super(m0, null, null);
        this.j = s0;
        this.l = n0;
        this.m = f0;
        this.n = b0;
        this.q = b0.k();
        this.o = null;
        this.p = null;
        this.k = this.w1(m0, s0);
        this.t = null;
        this.u = m0.E().j(Object.class);
    }

    protected final void A1(com.fasterxml.jackson.core.n n0, h h0, Map map0) throws IOException {
        Object object1;
        String s;
        n n1 = this.l;
        f f0 = this.m;
        if(n0.e4()) {
            s = n0.h4();
        }
        else {
            r r0 = n0.Y();
            if(r0 == r.l) {
                return;
            }
            r r1 = r.o;
            if(r0 != r1) {
                h0.i1(this, r1, null, new Object[0]);
            }
            s = n0.T();
        }
        while(s != null) {
            r r2 = n0.m4();
            if(this.t == null || !this.t.b(s)) {
                try {
                    if(r2 != r.v) {
                        Object object0 = map0.get(s);
                        if(object0 == null) {
                            object1 = f0 == null ? n1.g(n0, h0) : n1.i(n0, h0, f0);
                        }
                        else if(f0 == null) {
                            object1 = n1.h(n0, h0, object0);
                        }
                        else {
                            object1 = n1.j(n0, h0, f0, object0);
                        }
                        if(object1 != object0) {
                            map0.put(s, object1);
                        }
                    }
                    else if(!this.h) {
                        map0.put(s, this.g.c(h0));
                    }
                    goto label_34;
                }
                catch(Exception exception0) {
                }
                this.t1(h0, exception0, map0, s);
            }
            else {
                n0.I4();
            }
        label_34:
            s = n0.h4();
        }
    }

    protected void B1(h h0, Map map0, Object object0, Object object1, Object object2) {
        if(this.u && h0.I0(x.c)) {
            if(object1 instanceof List) {
                ((List)object1).add(object2);
                map0.put(object0, object1);
                return;
            }
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(object1);
            arrayList0.add(object2);
            map0.put(object0, arrayList0);
        }
    }

    public Map C1(com.fasterxml.jackson.core.n n0, h h0) throws IOException {
        if(this.p != null) {
            return this.v1(n0, h0);
        }
        n n1 = this.o;
        if(n1 != null) {
            Object object0 = n1.g(n0, h0);
            return (Map)this.n.C(h0, object0);
        }
        if(!this.q) {
            return (Map)h0.p0(this.E1(), this.e(), n0, "no default constructor found", new Object[0]);
        }
        switch(n0.d0()) {
            case 3: {
                return (Map)this.U(n0, h0);
            }
            case 1: 
            case 2: 
            case 5: {
                Map map0 = (Map)this.n.A(h0);
                return this.k ? this.y1(n0, h0, map0) : this.x1(n0, h0, map0);
            }
            case 6: {
                return (Map)this.X(n0, h0);
            }
            default: {
                return (Map)h0.t0(this.l1(h0), n0);
            }
        }
    }

    public Map D1(com.fasterxml.jackson.core.n n0, h h0, Map map0) throws IOException {
        n0.C4(map0);
        r r0 = n0.Y();
        if(r0 != r.k && r0 != r.o) {
            return (Map)h0.v0(this.E1(), n0);
        }
        if(this.k) {
            this.A1(n0, h0, map0);
            return map0;
        }
        this.z1(n0, h0, map0);
        return map0;
    }

    public final Class E1() {
        return this.f.g();
    }

    private void F1(h h0, com.fasterxml.jackson.databind.deser.std.u.b u$b0, Object object0, z z0) throws o {
        if(u$b0 == null) {
            h0.a1(this, "Unresolved forward reference but no identity info: " + z0, new Object[0]);
        }
        z0.G().a(u$b0.a(z0, object0));
    }

    public void G1(Set set0) {
        if(set0 == null || set0.isEmpty()) {
            set0 = null;
        }
        this.r = set0;
        this.t = q.a(set0, this.s);
    }

    @Deprecated
    public void H1(String[] arr_s) {
        HashSet hashSet0 = arr_s == null || arr_s.length == 0 ? null : c.a(arr_s);
        this.r = hashSet0;
        this.t = q.a(hashSet0, this.s);
    }

    public void I1(Set set0) {
        this.s = set0;
        this.t = q.a(this.r, set0);
    }

    protected u J1(s s0, f f0, n n0, com.fasterxml.jackson.databind.deser.v v0, Set set0) {
        return this.K1(s0, f0, n0, v0, set0, this.s);
    }

    protected u K1(s s0, f f0, n n0, com.fasterxml.jackson.databind.deser.v v0, Set set0, Set set1) {
        return this.j != s0 || this.l != n0 || this.m != f0 || this.g != v0 || this.r != set0 || this.s != set1 ? new u(this, s0, n0, f0, v0, set0, set1) : this;
    }

    @Override  // com.fasterxml.jackson.databind.deser.j
    public n a(h h0, d d0) throws o {
        s s0 = this.j;
        if(s0 == null) {
            s0 = h0.Z(this.f.N(), d0);
        }
        else if(s0 instanceof k) {
            s0 = ((k)s0).a(h0, d0);
        }
        n n0 = d0 == null ? this.l : this.e1(h0, d0, this.l);
        m m0 = this.f.E();
        n n1 = n0 == null ? h0.X(m0, d0) : h0.s0(n0, d0, m0);
        f f0 = this.m == null ? this.m : this.m.g(d0);
        Set set0 = this.r;
        Set set1 = this.s;
        com.fasterxml.jackson.databind.b b0 = h0.o();
        if(D.q0(b0, d0)) {
            com.fasterxml.jackson.databind.introspect.k k0 = d0.h();
            if(k0 != null) {
                g g0 = h0.g0();
                com.fasterxml.jackson.annotation.s.a s$a0 = b0.X(g0, k0);
                if(s$a0 != null) {
                    Set set2 = s$a0.h();
                    if(!set2.isEmpty()) {
                        set0 = set0 == null ? new HashSet() : new HashSet(set0);
                        for(Object object0: set2) {
                            set0.add(((String)object0));
                        }
                    }
                }
                com.fasterxml.jackson.annotation.v.a v$a0 = b0.a0(g0, k0);
                if(v$a0 != null) {
                    Set set3 = v$a0.f();
                    if(set3 != null) {
                        HashSet hashSet0 = new HashSet();
                        if(set1 == null) {
                            hashSet0 = new HashSet(set3);
                            return this.K1(s0, f0, n1, this.c1(h0, d0, n1), set0, hashSet0);
                        }
                        for(Object object1: set3) {
                            String s1 = (String)object1;
                            if(set1.contains(s1)) {
                                hashSet0.add(s1);
                            }
                        }
                        return this.K1(s0, f0, n1, this.c1(h0, d0, n1), set0, hashSet0);
                    }
                }
            }
        }
        return this.K1(s0, f0, n1, this.c1(h0, d0, n1), set0, set1);
    }

    @Override  // com.fasterxml.jackson.databind.deser.w
    public void b(h h0) throws o {
        if(this.n.l()) {
            m m0 = this.n.H(h0.g0());
            if(m0 == null) {
                String s = this.n.getClass().getName();
                h0.D(this.f, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for \'canCreateUsingDelegate()\', but null for \'getDelegateType()\'", this.f, s));
            }
            this.o = this.f1(h0, m0, null);
        }
        else if(this.n.j()) {
            m m1 = this.n.E(h0.g0());
            if(m1 == null) {
                String s1 = this.n.getClass().getName();
                h0.D(this.f, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for \'canCreateUsingArrayDelegate()\', but null for \'getArrayDelegateType()\'", this.f, s1));
            }
            this.o = this.f1(h0, m1, null);
        }
        if(this.n.h()) {
            boolean z = h0.z(t.y);
            this.p = v.d(h0, this.n, this.n.I(h0.g0()), z);
        }
        this.k = this.w1(this.f, this.j);
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.D, com.fasterxml.jackson.databind.deser.B$c
    public B e() {
        return this.n;
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object g(com.fasterxml.jackson.core.n n0, h h0) throws IOException, com.fasterxml.jackson.core.f {
        return this.C1(n0, h0);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object h(com.fasterxml.jackson.core.n n0, h h0, Object object0) throws IOException, com.fasterxml.jackson.core.f {
        return this.D1(n0, h0, ((Map)object0));
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.D
    public Object i(com.fasterxml.jackson.core.n n0, h h0, f f0) throws IOException {
        return f0.e(n0, h0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.j
    public m k1() {
        return this.f;
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.j
    public n r1() {
        return this.l;
    }

    @Override  // com.fasterxml.jackson.databind.n
    public boolean u() {
        return this.l == null && this.j == null && this.m == null && this.r == null && this.s == null;
    }

    public Map v1(com.fasterxml.jackson.core.n n0, h h0) throws IOException {
        Object object1;
        String s;
        v v0 = this.p;
        y y0 = v0.h(n0, h0, null);
        n n1 = this.l;
        f f0 = this.m;
        if(n0.e4()) {
            s = n0.h4();
        }
        else {
            s = n0.Y3(r.o) ? n0.T() : null;
        }
        while(s != null) {
            r r0 = n0.m4();
            if(this.t == null || !this.t.b(s)) {
                com.fasterxml.jackson.databind.deser.y y1 = v0.f(s);
                if(y1 == null) {
                    Object object0 = this.j.a(s, h0);
                    try {
                        if(r0 != r.v) {
                            object1 = f0 == null ? n1.g(n0, h0) : n1.i(n0, h0, f0);
                            goto label_30;
                        }
                        else if(!this.h) {
                            object1 = this.g.c(h0);
                            goto label_30;
                        }
                        goto label_31;
                    }
                    catch(Exception exception1) {
                    }
                    this.t1(h0, exception1, this.f.g(), s);
                    return null;
                label_30:
                    y0.d(object0, object1);
                }
                else if(y0.b(y1, y1.q(n0, h0))) {
                    n0.m4();
                    try {
                        return this.x1(n0, h0, ((Map)v0.a(h0, y0)));
                    }
                    catch(Exception exception0) {
                        return (Map)this.t1(h0, exception0, this.f.g(), s);
                    }
                }
            }
            else {
                n0.I4();
            }
        label_31:
            s = n0.h4();
        }
        try {
            return (Map)v0.a(h0, y0);
        }
        catch(Exception exception2) {
            this.t1(h0, exception2, this.f.g(), null);
            return null;
        }
    }

    @Override  // com.fasterxml.jackson.databind.n
    public com.fasterxml.jackson.databind.type.h w() {
        return com.fasterxml.jackson.databind.type.h.c;
    }

    protected final boolean w1(m m0, s s0) {
        if(s0 == null) {
            return true;
        }
        m m1 = m0.N();
        if(m1 == null) {
            return true;
        }
        Class class0 = m1.g();
        return (class0 == String.class || class0 == Object.class) && this.q1(s0);
    }

    protected final Map x1(com.fasterxml.jackson.core.n n0, h h0, Map map0) throws IOException {
        Object object3;
        String s3;
        Object object2;
        Object object1;
        String s1;
        s s0 = this.j;
        n n1 = this.l;
        f f0 = this.m;
        boolean z = n1.r() != null;
        com.fasterxml.jackson.databind.deser.std.u.b u$b0 = z ? new com.fasterxml.jackson.databind.deser.std.u.b(this.f.E().g(), map0) : null;
        if(n0.e4()) {
            s1 = n0.h4();
        }
        else {
            r r0 = n0.Y();
            r r1 = r.o;
            if(r0 != r1) {
                if(r0 == r.l) {
                    return map0;
                }
                h0.i1(this, r1, null, new Object[0]);
            }
            s1 = n0.T();
        }
        String s2 = s1;
        while(s2 != null) {
            Object object0 = s0.a(s2, h0);
            r r2 = n0.m4();
            if(this.t == null || !this.t.b(s2)) {
                try {
                    if(r2 != r.v) {
                        object1 = f0 == null ? n1.g(n0, h0) : n1.i(n0, h0, f0);
                        goto label_27;
                    }
                    else if(!this.h) {
                        object1 = this.g.c(h0);
                    label_27:
                        if(z) {
                            u$b0.b(object0, object1);
                        }
                        else {
                            object2 = map0.put(object0, object1);
                            goto label_38;
                        }
                    }
                    goto label_48;
                }
                catch(z z1) {
                    object3 = object0;
                    this.F1(h0, u$b0, object3, z1);
                    goto label_48;
                }
                catch(Exception exception0) {
                    s3 = s2;
                    goto label_47;
                }
            label_38:
                if(object2 != null) {
                    try {
                        object3 = object0;
                        s3 = s2;
                        this.B1(h0, map0, object0, object2, object1);
                        goto label_48;
                    }
                    catch(z z1) {
                        this.F1(h0, u$b0, object3, z1);
                        goto label_48;
                    }
                    catch(Exception exception0) {
                    }
                label_47:
                    this.t1(h0, exception0, map0, s3);
                }
            }
            else {
                n0.I4();
            }
        label_48:
            s2 = n0.h4();
        }
        return map0;
    }

    protected final Map y1(com.fasterxml.jackson.core.n n0, h h0, Map map0) throws IOException {
        Object object0;
        String s;
        n n1 = this.l;
        f f0 = this.m;
        boolean z = n1.r() != null;
        com.fasterxml.jackson.databind.deser.std.u.b u$b0 = z ? new com.fasterxml.jackson.databind.deser.std.u.b(this.f.E().g(), map0) : null;
        if(n0.e4()) {
            s = n0.h4();
        }
        else {
            r r0 = n0.Y();
            if(r0 == r.l) {
                return map0;
            }
            r r1 = r.o;
            if(r0 != r1) {
                h0.i1(this, r1, null, new Object[0]);
            }
            s = n0.T();
        }
        while(s != null) {
            r r2 = n0.m4();
            if(this.t == null || !this.t.b(s)) {
                try {
                    if(r2 != r.v) {
                        object0 = f0 == null ? n1.g(n0, h0) : n1.i(n0, h0, f0);
                        goto label_24;
                    }
                    else if(!this.h) {
                        object0 = this.g.c(h0);
                    label_24:
                        if(z) {
                            u$b0.b(s, object0);
                        }
                        else {
                            Object object1 = map0.put(s, object0);
                            if(object1 != null) {
                                this.B1(h0, map0, s, object1, object0);
                            }
                        }
                    }
                    goto label_37;
                }
                catch(z z1) {
                }
                catch(Exception exception0) {
                    goto label_36;
                }
                this.F1(h0, u$b0, s, z1);
                goto label_37;
            label_36:
                this.t1(h0, exception0, map0, s);
            }
            else {
                n0.I4();
            }
        label_37:
            s = n0.h4();
        }
        return map0;
    }

    protected final void z1(com.fasterxml.jackson.core.n n0, h h0, Map map0) throws IOException {
        Object object2;
        String s1;
        s s0 = this.j;
        n n1 = this.l;
        f f0 = this.m;
        if(n0.e4()) {
            s1 = n0.h4();
        }
        else {
            r r0 = n0.Y();
            if(r0 == r.l) {
                return;
            }
            r r1 = r.o;
            if(r0 != r1) {
                h0.i1(this, r1, null, new Object[0]);
            }
            s1 = n0.T();
        }
        while(s1 != null) {
            Object object0 = s0.a(s1, h0);
            r r2 = n0.m4();
            if(this.t == null || !this.t.b(s1)) {
                try {
                    if(r2 != r.v) {
                        Object object1 = map0.get(object0);
                        if(object1 == null) {
                            object2 = f0 == null ? n1.g(n0, h0) : n1.i(n0, h0, f0);
                        }
                        else if(f0 == null) {
                            object2 = n1.h(n0, h0, object1);
                        }
                        else {
                            object2 = n1.j(n0, h0, f0, object1);
                        }
                        if(object2 != object1) {
                            map0.put(object0, object2);
                        }
                    }
                    else if(!this.h) {
                        map0.put(object0, this.g.c(h0));
                    }
                    goto label_36;
                }
                catch(Exception exception0) {
                }
                this.t1(h0, exception0, map0, s1);
            }
            else {
                n0.I4();
            }
        label_36:
            s1 = n0.h4();
        }
    }
}

