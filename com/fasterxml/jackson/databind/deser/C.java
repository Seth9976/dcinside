package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.deser.impl.g;
import com.fasterxml.jackson.databind.deser.impl.s;
import com.fasterxml.jackson.databind.deser.impl.v;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.i;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.util.H;
import com.fasterxml.jackson.databind.util.q;
import com.fasterxml.jackson.databind.util.x;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class c extends e implements Serializable {
    static class a {
        static final int[] a;
        static final int[] b;

        static {
            int[] arr_v = new int[com.fasterxml.jackson.databind.cfg.c.values().length];
            a.b = arr_v;
            try {
                arr_v[com.fasterxml.jackson.databind.cfg.c.d.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[com.fasterxml.jackson.databind.cfg.c.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[com.fasterxml.jackson.databind.cfg.c.b.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[r.values().length];
            a.a = arr_v1;
            try {
                arr_v1[r.q.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r.r.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r.s.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r.p.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r.t.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r.u.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r.v.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r.m.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r.o.ordinal()] = 9;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[r.l.ordinal()] = 10;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    static class b extends com.fasterxml.jackson.databind.deser.impl.z.a {
        private final h c;
        private final y d;
        private Object e;

        b(h h0, z z0, m m0, com.fasterxml.jackson.databind.deser.impl.y y0, y y1) {
            super(z0, m0);
            this.c = h0;
            this.d = y1;
        }

        @Override  // com.fasterxml.jackson.databind.deser.impl.z$a
        public void c(Object object0, Object object1) throws IOException {
            if(this.e == null) {
                Object[] arr_object = {this.d.getName(), this.d.y().getName()};
                this.c.Y0(this.d, "Cannot resolve ObjectId forward reference using property \'%s\' (of type %s): Bean not yet resolved", arr_object);
            }
            this.d.M(this.e, object1);
        }

        public void e(Object object0) {
            this.e = object0;
        }
    }

    protected transient Exception B;
    private volatile transient x C;
    private static final long D = 1L;

    protected c(e e0) {
        super(e0, e0.s);
    }

    public c(e e0, com.fasterxml.jackson.databind.deser.impl.c c0) {
        super(e0, c0);
    }

    public c(e e0, s s0) {
        super(e0, s0);
    }

    protected c(e e0, x x0) {
        super(e0, x0);
    }

    @Deprecated
    public c(e e0, Set set0) {
        super(e0, set0);
    }

    public c(e e0, Set set0, Set set1) {
        super(e0, set0, set1);
    }

    protected c(e e0, boolean z) {
        super(e0, z);
    }

    public c(f f0, com.fasterxml.jackson.databind.c c0, com.fasterxml.jackson.databind.deser.impl.c c1, Map map0, HashSet hashSet0, boolean z, Set set0, boolean z1) {
        super(f0, c0, c1, map0, hashSet0, z, set0, z1);
    }

    @Deprecated
    public c(f f0, com.fasterxml.jackson.databind.c c0, com.fasterxml.jackson.databind.deser.impl.c c1, Map map0, HashSet hashSet0, boolean z, boolean z1) {
        super(f0, c0, c1, map0, hashSet0, z, null, z1);
    }

    protected Object A2(n n0, h h0) throws IOException {
        if(this.k != null) {
            return this.y2(n0, h0);
        }
        com.fasterxml.jackson.databind.n n1 = this.i;
        if(n1 != null) {
            Object object0 = n1.g(n0, h0);
            return this.h.C(h0, object0);
        }
        return this.B2(n0, h0, this.h.A(h0));
    }

    protected Object B2(n n0, h h0, Object object0) throws IOException {
        return this.w2(n0, h0, object0, this.x.j());
    }

    protected Object C2(n n0, h h0) throws IOException {
        com.fasterxml.jackson.databind.n n1 = this.i;
        if(n1 != null) {
            Object object0 = n1.g(n0, h0);
            return this.h.C(h0, object0);
        }
        if(this.k != null) {
            return this.z2(n0, h0);
        }
        H h1 = h0.O(n0);
        h1.D4();
        Object object1 = this.h.A(h0);
        n0.C4(object1);
        if(this.o != null) {
            this.f2(h0, object1);
        }
        String s = null;
        Class class0 = this.t ? h0.n() : null;
        if(n0.Z3(5)) {
            s = n0.T();
        }
        while(s != null) {
            n0.m4();
            y y0 = this.n.p(s);
            if(y0 == null) {
                if(q.c(s, this.q, this.r)) {
                    this.X1(n0, h0, object1, s);
                }
                else if(this.p == null) {
                    h1.v3(s);
                    h1.T(n0);
                }
                else {
                    H h2 = h0.M(n0);
                    h1.v3(s);
                    h1.Y4(h2);
                    try {
                        this.p.g(h2.e5(), h0, object1, s);
                    }
                    catch(Exception exception1) {
                        this.q2(exception1, object1, s, h0);
                    }
                }
            }
            else if(class0 == null || y0.R(class0)) {
                try {
                    y0.r(n0, h0, object1);
                }
                catch(Exception exception0) {
                    this.q2(exception0, object1, s, h0);
                }
            }
            else {
                n0.I4();
            }
            s = n0.h4();
        }
        h1.p3();
        this.w.b(n0, h0, object1, h1);
        return object1;
    }

    protected Object D2(n n0, h h0, Object object0) throws IOException {
        r r0 = n0.Y();
        if(r0 == r.k) {
            r0 = n0.m4();
        }
        H h1 = h0.O(n0);
        h1.D4();
        Class class0 = this.t ? h0.n() : null;
        while(r0 == r.o) {
            String s = n0.T();
            y y0 = this.n.p(s);
            n0.m4();
            if(y0 == null) {
                if(q.c(s, this.q, this.r)) {
                    this.X1(n0, h0, object0, s);
                }
                else if(this.p == null) {
                    h1.v3(s);
                    h1.T(n0);
                }
                else {
                    H h2 = h0.M(n0);
                    h1.v3(s);
                    h1.Y4(h2);
                    try {
                        this.p.g(h2.e5(), h0, object0, s);
                    }
                    catch(Exception exception1) {
                        this.q2(exception1, object0, s, h0);
                    }
                }
            }
            else if(class0 == null || y0.R(class0)) {
                try {
                    y0.r(n0, h0, object0);
                }
                catch(Exception exception0) {
                    this.q2(exception0, object0, s, h0);
                }
            }
            else {
                n0.I4();
            }
            r0 = n0.m4();
        }
        h1.p3();
        this.w.b(n0, h0, object0, h1);
        return object0;
    }

    protected final Object E2(n n0, h h0, Object object0, Class class0) throws IOException {
        if(n0.Z3(5)) {
            String s = n0.T();
            while(true) {
                n0.m4();
                y y0 = this.n.p(s);
                if(y0 == null) {
                    this.b2(n0, h0, object0, s);
                }
                else if(y0.R(class0)) {
                    try {
                        y0.r(n0, h0, object0);
                    }
                    catch(Exception exception0) {
                        this.q2(exception0, object0, s, h0);
                    }
                }
                else {
                    n0.I4();
                }
                s = n0.h4();
                if(s == null) {
                    break;
                }
            }
        }
        return object0;
    }

    @Override  // com.fasterxml.jackson.databind.deser.e
    protected e F1() {
        return new com.fasterxml.jackson.databind.deser.impl.b(this, this.n.u());
    }

    private b F2(h h0, y y0, com.fasterxml.jackson.databind.deser.impl.y y1, z z0) throws o {
        b c$b0 = new b(h0, z0, y0.getType(), y1, y0);
        z0.G().a(c$b0);
        return c$b0;
    }

    private final Object G2(n n0, h h0, r r0) throws IOException {
        Object object0 = this.h.A(h0);
        if(n0.Z3(5)) {
            n0.C4(object0);
            String s = n0.T();
            while(true) {
                n0.m4();
                y y0 = this.n.p(s);
                if(y0 == null) {
                    this.b2(n0, h0, object0, s);
                }
                else {
                    try {
                        y0.r(n0, h0, object0);
                    }
                    catch(Exception exception0) {
                        this.q2(exception0, object0, s, h0);
                    }
                }
                s = n0.h4();
                if(s == null) {
                    break;
                }
            }
        }
        return object0;
    }

    public c H2(Set set0, Set set1) {
        return new c(this, set0, set1);
    }

    public c J2(s s0) {
        return new c(this, s0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.e
    public Object M1(n n0, h h0) throws IOException {
        if(this.y != null && this.y.e() && n0.Z3(5)) {
            String s = n0.T();
            if(this.y.d(s, n0)) {
                return this.N1(n0, h0);
            }
        }
        if(this.l) {
            if(this.w != null) {
                return this.C2(n0, h0);
            }
            return this.x == null ? this.O1(n0, h0) : this.A2(n0, h0);
        }
        Object object0 = this.h.A(h0);
        n0.C4(object0);
        if(n0.v()) {
            Object object1 = n0.t2();
            if(object1 != null) {
                this.z1(n0, h0, object0, object1);
            }
        }
        if(this.y != null && n0.Z3(2)) {
            h0.g1(this.y, object0);
        }
        if(this.o != null) {
            this.f2(h0, object0);
        }
        if(this.t) {
            Class class0 = h0.n();
            if(class0 != null) {
                return this.E2(n0, h0, object0, class0);
            }
        }
        if(n0.Z3(5)) {
            String s1 = n0.T();
            while(true) {
                n0.m4();
                y y0 = this.n.p(s1);
                if(y0 == null) {
                    this.b2(n0, h0, object0, s1);
                }
                else {
                    try {
                        y0.r(n0, h0, object0);
                    }
                    catch(Exception exception0) {
                        this.q2(exception0, object0, s1, h0);
                    }
                }
                s1 = n0.h4();
                if(s1 == null) {
                    break;
                }
            }
        }
        return object0;
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.D
    protected Object U(n n0, h h0) throws IOException {
        com.fasterxml.jackson.databind.n n1 = this.j;
        if(n1 == null) {
            n1 = this.i;
            if(n1 == null) {
                com.fasterxml.jackson.databind.cfg.c c0 = this.b0(h0);
                boolean z = h0.J0(i.t);
                if(z || c0 != com.fasterxml.jackson.databind.cfg.c.a) {
                    r r0 = n0.m4();
                    r r1 = r.n;
                    if(r0 == r1) {
                        int v = a.b[c0.ordinal()];
                        switch(v) {
                            case 1: {
                                return this.o(h0);
                            }
                            case 2: {
                                return this.c(h0);
                            }
                            default: {
                                return v == 3 ? this.c(h0) : h0.u0(this.l1(h0), r.m, n0, null, new Object[0]);
                            }
                        }
                    }
                    if(z) {
                        r r2 = r.m;
                        if(r0 == r2) {
                            m m0 = this.l1(h0);
                            return h0.u0(m0, r2, n0, "Cannot deserialize value of type %s from deeply-nested Array: only single wrapper allowed with `%s`", new Object[]{com.fasterxml.jackson.databind.util.h.Q(m0), "DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS"});
                        }
                        Object object0 = this.g(n0, h0);
                        if(n0.m4() != r1) {
                            this.m1(n0, h0);
                        }
                        return object0;
                    }
                }
                return h0.t0(this.l1(h0), n0);
            }
        }
        Object object1 = n1.g(n0, h0);
        Object object2 = this.h.z(h0, object1);
        if(this.o != null) {
            this.f2(h0, object2);
        }
        return object2;
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object g(n n0, h h0) throws IOException {
        if(n0.e4()) {
            if(this.m) {
                return this.G2(n0, h0, n0.m4());
            }
            n0.m4();
            return this.y == null ? this.M1(n0, h0) : this.Q1(n0, h0);
        }
        return this.u2(n0, h0, n0.Y());
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object h(n n0, h h0, Object object0) throws IOException {
        String s;
        n0.C4(object0);
        if(this.o != null) {
            this.f2(h0, object0);
        }
        if(this.w != null) {
            return this.D2(n0, h0, object0);
        }
        if(this.x != null) {
            return this.B2(n0, h0, object0);
        }
        if(n0.e4()) {
            s = n0.h4();
            if(s != null) {
                goto label_13;
            }
            return object0;
        }
        else if(n0.Z3(5)) {
            s = n0.T();
        label_13:
            if(this.t) {
                Class class0 = h0.n();
                if(class0 != null) {
                    return this.E2(n0, h0, object0, class0);
                }
            }
            while(true) {
                n0.m4();
                y y0 = this.n.p(s);
                if(y0 == null) {
                    this.b2(n0, h0, object0, s);
                }
                else {
                    try {
                        y0.r(n0, h0, object0);
                    }
                    catch(Exception exception0) {
                        this.q2(exception0, object0, s, h0);
                    }
                }
                s = n0.h4();
                if(s == null) {
                    break;
                }
            }
        }
        return object0;
    }

    @Override  // com.fasterxml.jackson.databind.deser.e
    public e l2(com.fasterxml.jackson.databind.deser.impl.c c0) {
        return new c(this, c0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.e
    public e m2(Set set0, Set set1) {
        return this.H2(set0, set1);
    }

    @Override  // com.fasterxml.jackson.databind.deser.e
    public e o2(boolean z) {
        return new c(this, z);
    }

    @Override  // com.fasterxml.jackson.databind.deser.e
    public e p2(s s0) {
        return this.J2(s0);
    }

    protected Exception s2() {
        if(this.B == null) {
            this.B = new NullPointerException("JSON Creator returned null");
        }
        return this.B;
    }

    @Override  // com.fasterxml.jackson.databind.deser.e
    protected Object t1(n n0, h h0) throws IOException {
        Object object2;
        Object object0;
        v v0 = this.k;
        com.fasterxml.jackson.databind.deser.impl.y y0 = v0.h(n0, h0, this.y);
        Class class0 = this.t ? h0.n() : null;
        r r0 = n0.Y();
        List list0 = null;
        H h1 = null;
        while(r0 == r.o) {
            String s = n0.T();
            n0.m4();
            y y1 = v0.f(s);
            if(!y0.l(s) || y1 != null) {
                if(y1 == null) {
                    y y2 = this.n.p(s);
                    if(y2 != null && (!this.f.Z() || y2 instanceof com.fasterxml.jackson.databind.deser.impl.o)) {
                        try {
                            y0.e(y2, this.v2(n0, h0, y2));
                        }
                        catch(z z0) {
                            b c$b0 = this.F2(h0, y2, y0, z0);
                            if(list0 == null) {
                                list0 = new ArrayList();
                            }
                            list0.add(c$b0);
                        }
                    }
                    else if(q.c(s, this.q, this.r)) {
                        this.X1(n0, h0, this.s(), s);
                    }
                    else {
                        com.fasterxml.jackson.databind.deser.x x0 = this.p;
                        if(x0 != null) {
                            try {
                                y0.c(x0, s, x0.f(n0, h0));
                            }
                            catch(Exception exception1) {
                                this.q2(exception1, this.f.g(), s, h0);
                            }
                        }
                        else if(this.s) {
                            n0.I4();
                        }
                        else {
                            if(h1 == null) {
                                h1 = h0.O(n0);
                            }
                            h1.v3(s);
                            h1.T(n0);
                        }
                    }
                }
                else if(class0 != null && !y1.R(class0)) {
                    n0.I4();
                }
                else if(y0.b(y1, this.v2(n0, h0, y1))) {
                    n0.m4();
                    try {
                        object0 = v0.a(h0, y0);
                    }
                    catch(Exception exception0) {
                        object0 = this.r2(exception0, h0);
                    }
                    Object object1 = object0;
                    if(object1 == null) {
                        return h0.o0(this.s(), null, this.s2());
                    }
                    n0.C4(object1);
                    if(object1.getClass() != this.f.g()) {
                        return this.Y1(n0, h0, n0.J4(), object1, h1);
                    }
                    if(h1 != null) {
                        object1 = this.a2(h0, object1, h1);
                    }
                    return this.h(n0, h0, object1);
                }
            }
            r0 = n0.m4();
        }
        try {
            object2 = v0.a(h0, y0);
        }
        catch(Exception exception2) {
            return this.r2(exception2, h0);
        }
        if(this.o != null) {
            this.f2(h0, object2);
        }
        if(list0 != null) {
            for(Object object3: list0) {
                ((b)object3).e(object2);
            }
        }
        if(h1 != null) {
            return object2.getClass() == this.f.g() ? this.a2(h0, object2, h1) : this.Y1(null, h0, n0.J4(), object2, h1);
        }
        return object2;
    }

    protected final Object u2(n n0, h h0, r r0) throws IOException {
        if(r0 != null) {
            switch(r0) {
                case 1: {
                    return this.P1(n0, h0);
                }
                case 2: {
                    return this.L1(n0, h0);
                }
                case 3: {
                    return this.J1(n0, h0);
                }
                case 4: {
                    return this.K1(n0, h0);
                }
                case 5: 
                case 6: {
                    return this.I1(n0, h0);
                }
                case 7: {
                    return this.x2(n0, h0);
                }
                case 8: {
                    return this.U(n0, h0);
                }
                case 9: 
                case 10: {
                    if(this.m) {
                        return this.G2(n0, h0, r0);
                    }
                    return this.y == null ? this.M1(n0, h0) : this.Q1(n0, h0);
                }
                default: {
                    return h0.t0(this.l1(h0), n0);
                }
            }
        }
        return h0.t0(this.l1(h0), n0);
    }

    protected final Object v2(n n0, h h0, y y0) throws IOException {
        try {
            return y0.q(n0, h0);
        }
        catch(Exception exception0) {
            String s = y0.getName();
            this.q2(exception0, this.f.g(), s, h0);
            return null;
        }
    }

    protected Object w2(n n0, h h0, Object object0, g g0) throws IOException {
        Class class0 = this.t ? h0.n() : null;
        for(r r0 = n0.Y(); r0 == r.o; r0 = n0.m4()) {
            String s = n0.T();
            r r1 = n0.m4();
            y y0 = this.n.p(s);
            if(y0 != null) {
                if(r1.g()) {
                    g0.i(n0, h0, s, object0);
                }
                if(class0 == null || y0.R(class0)) {
                    try {
                        y0.r(n0, h0, object0);
                    }
                    catch(Exception exception0) {
                        this.q2(exception0, object0, s, h0);
                    }
                }
                else {
                    n0.I4();
                }
            }
            else if(q.c(s, this.q, this.r)) {
                this.X1(n0, h0, object0, s);
            }
            else if(!g0.h(n0, h0, s, object0)) {
                com.fasterxml.jackson.databind.deser.x x0 = this.p;
                if(x0 == null) {
                    this.o1(n0, h0, object0, s);
                }
                else {
                    try {
                        x0.g(n0, h0, object0, s);
                    }
                    catch(Exception exception1) {
                        this.q2(exception1, object0, s, h0);
                    }
                }
            }
        }
        return g0.g(n0, h0, object0);
    }

    protected Object x2(n n0, h h0) throws IOException {
        if(n0.A4()) {
            H h1 = h0.O(n0);
            h1.p3();
            n n1 = h1.b5(n0);
            n1.m4();
            Object object0 = this.m ? this.G2(n1, h0, r.l) : this.M1(n1, h0);
            n1.close();
            return object0;
        }
        return h0.t0(this.l1(h0), n0);
    }

    protected Object y2(n n0, h h0) throws IOException {
        Object object0;
        g g0 = this.x.j();
        v v0 = this.k;
        com.fasterxml.jackson.databind.deser.impl.y y0 = v0.h(n0, h0, this.y);
        Class class0 = this.t ? h0.n() : null;
        for(r r0 = n0.Y(); r0 == r.o; r0 = n0.m4()) {
            String s = n0.T();
            r r1 = n0.m4();
            y y1 = v0.f(s);
            if(!y0.l(s) || y1 != null) {
                if(y1 == null) {
                    y y2 = this.n.p(s);
                    if(y2 != null) {
                        if(r1.g()) {
                            g0.i(n0, h0, s, null);
                        }
                        if(class0 == null || y2.R(class0)) {
                            y0.e(y2, y2.q(n0, h0));
                        }
                        else {
                            n0.I4();
                        }
                    }
                    else if(!g0.h(n0, h0, s, null)) {
                        if(q.c(s, this.q, this.r)) {
                            this.X1(n0, h0, this.s(), s);
                        }
                        else {
                            com.fasterxml.jackson.databind.deser.x x0 = this.p;
                            if(x0 == null) {
                                this.o1(n0, h0, this.a, s);
                            }
                            else {
                                y0.c(x0, s, x0.f(n0, h0));
                            }
                        }
                    }
                }
                else if(!g0.h(n0, h0, s, null) && y0.b(y1, this.v2(n0, h0, y1))) {
                    n0.m4();
                    try {
                        object0 = v0.a(h0, y0);
                    }
                    catch(Exception exception0) {
                        this.q2(exception0, this.f.g(), s, h0);
                        continue;
                    }
                    if(object0.getClass() != this.f.g()) {
                        Class class1 = object0.getClass();
                        return h0.D(this.f, String.format("Cannot create polymorphic instances with external type ids (%s -> %s)", this.f, class1));
                    }
                    return this.w2(n0, h0, object0, g0);
                }
            }
        }
        try {
            return g0.f(n0, h0, y0, v0);
        }
        catch(Exception exception1) {
            return this.r2(exception1, h0);
        }
    }

    @Override  // com.fasterxml.jackson.databind.deser.e
    public com.fasterxml.jackson.databind.n z(x x0) {
        if(this.getClass() != c.class) {
            return this;
        }
        if(this.C == x0) {
            return this;
        }
        try {
            this.C = x0;
            com.fasterxml.jackson.databind.n n0 = new c(this, x0);
            this.C = null;
            return n0;
        }
        catch(Throwable throwable0) {
            this.C = null;
            throw throwable0;
        }
    }

    protected Object z2(n n0, h h0) throws IOException {
        Object object0;
        v v0 = this.k;
        com.fasterxml.jackson.databind.deser.impl.y y0 = v0.h(n0, h0, this.y);
        H h1 = h0.O(n0);
        h1.D4();
        for(r r0 = n0.Y(); r0 == r.o; r0 = n0.m4()) {
            String s = n0.T();
            n0.m4();
            y y1 = v0.f(s);
            if(!y0.l(s) || y1 != null) {
                if(y1 == null) {
                    y y2 = this.n.p(s);
                    if(y2 != null) {
                        y0.e(y2, this.v2(n0, h0, y2));
                    }
                    else if(q.c(s, this.q, this.r)) {
                        this.X1(n0, h0, this.s(), s);
                    }
                    else if(this.p == null) {
                        h1.v3(s);
                        h1.T(n0);
                    }
                    else {
                        H h2 = h0.M(n0);
                        h1.v3(s);
                        h1.Y4(h2);
                        try {
                            y0.c(this.p, s, this.p.f(h2.e5(), h0));
                        }
                        catch(Exception exception1) {
                            this.q2(exception1, this.f.g(), s, h0);
                        }
                    }
                }
                else if(y0.b(y1, this.v2(n0, h0, y1))) {
                    r r1 = n0.m4();
                    try {
                        object0 = v0.a(h0, y0);
                    }
                    catch(Exception exception0) {
                        object0 = this.r2(exception0, h0);
                    }
                    n0.C4(object0);
                    while(r1 == r.o) {
                        h1.T(n0);
                        r1 = n0.m4();
                    }
                    r r2 = r.l;
                    if(r1 != r2) {
                        h0.i1(this, r2, "Attempted to unwrap \'%s\' value", new Object[]{this.s().getName()});
                    }
                    h1.p3();
                    return object0.getClass() == this.f.g() ? this.w.b(n0, h0, object0, h1) : h0.Y0(y1, "Cannot create polymorphic instances with unwrapped values", new Object[0]);
                }
            }
        }
        try {
            Object object1 = v0.a(h0, y0);
            return this.w.b(n0, h0, object1, h1);
        }
        catch(Exception exception2) {
            return this.r2(exception2, h0);
        }
    }
}

