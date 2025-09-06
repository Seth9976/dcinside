package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.cfg.c;
import com.fasterxml.jackson.databind.deser.impl.g;
import com.fasterxml.jackson.databind.deser.impl.s;
import com.fasterxml.jackson.databind.deser.impl.v;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.introspect.l;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.util.H;
import com.fasterxml.jackson.databind.util.q;
import com.fasterxml.jackson.databind.util.x;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class i extends e {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[c.values().length];
            a.a = arr_v;
            try {
                arr_v[c.d.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[c.b.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    protected final l B;
    protected final m C;
    private static final long D = 1L;

    @Deprecated
    public i(f f0, com.fasterxml.jackson.databind.c c0, com.fasterxml.jackson.databind.deser.impl.c c1, Map map0, Set set0, boolean z, boolean z1) {
        this(f0, c0, c0.H(), c1, map0, set0, z, z1);
    }

    public i(f f0, com.fasterxml.jackson.databind.c c0, m m0, com.fasterxml.jackson.databind.deser.impl.c c1, Map map0, Set set0, boolean z, Set set1, boolean z1) {
        super(f0, c0, c1, map0, set0, z, set1, z1);
        this.C = m0;
        this.B = f0.t();
        if(this.y != null) {
            throw new IllegalArgumentException("Cannot use Object Id with Builder-based deserialization (type " + c0.H() + ")");
        }
    }

    public i(f f0, com.fasterxml.jackson.databind.c c0, m m0, com.fasterxml.jackson.databind.deser.impl.c c1, Map map0, Set set0, boolean z, boolean z1) {
        this(f0, c0, m0, c1, map0, set0, z, null, z1);
    }

    protected i(i i0) {
        this(i0, i0.s);
    }

    public i(i i0, com.fasterxml.jackson.databind.deser.impl.c c0) {
        super(i0, c0);
        this.B = i0.B;
        this.C = i0.C;
    }

    public i(i i0, s s0) {
        super(i0, s0);
        this.B = i0.B;
        this.C = i0.C;
    }

    protected i(i i0, x x0) {
        super(i0, x0);
        this.B = i0.B;
        this.C = i0.C;
    }

    public i(i i0, Set set0) {
        this(i0, set0, i0.r);
    }

    public i(i i0, Set set0, Set set1) {
        super(i0, set0, set1);
        this.B = i0.B;
        this.C = i0.C;
    }

    protected i(i i0, boolean z) {
        super(i0, z);
        this.B = i0.B;
        this.C = i0.C;
    }

    protected final Object A2(n n0, h h0, Object object0, Class class0) throws IOException {
        for(r r0 = n0.Y(); r0 == r.o; r0 = n0.m4()) {
            String s = n0.T();
            n0.m4();
            y y0 = this.n.p(s);
            if(y0 == null) {
                this.b2(n0, h0, object0, s);
            }
            else if(y0.R(class0)) {
                try {
                    object0 = y0.s(n0, h0, object0);
                }
                catch(Exception exception0) {
                    this.q2(exception0, object0, s, h0);
                }
            }
            else {
                n0.I4();
            }
        }
        return object0;
    }

    protected Object B2(h h0, Object object0) throws IOException {
        l l0 = this.B;
        if(l0 == null) {
            return object0;
        }
        try {
            return l0.L().invoke(object0, null);
        }
        catch(Exception exception0) {
            return this.r2(exception0, h0);
        }
    }

    private final Object C2(n n0, h h0, r r0) throws IOException {
        Object object0 = this.h.A(h0);
        while(n0.Y() == r.o) {
            String s = n0.T();
            n0.m4();
            y y0 = this.n.p(s);
            if(y0 == null) {
                this.b2(n0, h0, object0, s);
            }
            else {
                try {
                    object0 = y0.s(n0, h0, object0);
                }
                catch(Exception exception0) {
                    this.q2(exception0, object0, s, h0);
                }
            }
            n0.m4();
        }
        return object0;
    }

    @Override  // com.fasterxml.jackson.databind.deser.e
    protected e F1() {
        return new com.fasterxml.jackson.databind.deser.impl.a(this, this.C, this.n.u(), this.B);
    }

    @Override  // com.fasterxml.jackson.databind.deser.e
    public Object M1(n n0, h h0) throws IOException {
        if(this.l) {
            if(this.w != null) {
                return this.y2(n0, h0);
            }
            return this.x == null ? this.O1(n0, h0) : this.w2(n0, h0);
        }
        Object object0 = this.h.A(h0);
        if(this.o != null) {
            this.f2(h0, object0);
        }
        if(this.t) {
            Class class0 = h0.n();
            if(class0 != null) {
                return this.A2(n0, h0, object0, class0);
            }
        }
        while(n0.Y() == r.o) {
            String s = n0.T();
            n0.m4();
            y y0 = this.n.p(s);
            if(y0 == null) {
                this.b2(n0, h0, object0, s);
            }
            else {
                try {
                    object0 = y0.s(n0, h0, object0);
                }
                catch(Exception exception0) {
                    this.q2(exception0, object0, s, h0);
                }
            }
            n0.m4();
        }
        return object0;
    }

    @Override  // com.fasterxml.jackson.databind.deser.std.D
    protected Object U(n n0, h h0) throws IOException {
        com.fasterxml.jackson.databind.n n1 = this.j;
        if(n1 == null) {
            n1 = this.i;
            if(n1 == null) {
                c c0 = this.b0(h0);
                boolean z = h0.J0(com.fasterxml.jackson.databind.i.t);
                if(z || c0 != c.a) {
                    r r0 = n0.m4();
                    r r1 = r.n;
                    if(r0 == r1) {
                        switch(c0) {
                            case 1: {
                                return this.o(h0);
                            }
                            case 2: 
                            case 3: {
                                return this.c(h0);
                            }
                            default: {
                                return h0.u0(this.l1(h0), r.m, n0, null, new Object[0]);
                            }
                        }
                    }
                    if(z) {
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
        return this.B2(h0, object2);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object g(n n0, h h0) throws IOException {
        if(n0.e4()) {
            r r0 = n0.m4();
            return this.m ? this.B2(h0, this.C2(n0, h0, r0)) : this.B2(h0, this.M1(n0, h0));
        }
        switch(n0.d0()) {
            case 3: {
                return this.U(n0, h0);
            }
            case 2: 
            case 5: {
                return this.B2(h0, this.M1(n0, h0));
            }
            case 6: {
                return this.B2(h0, this.P1(n0, h0));
            }
            case 7: {
                return this.B2(h0, this.L1(n0, h0));
            }
            case 8: {
                return this.B2(h0, this.J1(n0, h0));
            }
            case 9: 
            case 10: {
                return this.B2(h0, this.I1(n0, h0));
            }
            case 12: {
                return n0.l1();
            }
            default: {
                return h0.t0(this.l1(h0), n0);
            }
        }
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object h(n n0, h h0, Object object0) throws IOException {
        Class class0 = this.s();
        Class class1 = object0.getClass();
        return class0.isAssignableFrom(class1) ? h0.D(this.C, String.format("Deserialization of %s by passing existing Builder (%s) instance not supported", this.C, class0.getName())) : h0.D(this.C, String.format("Deserialization of %s by passing existing instance (of %s) not supported", this.C, class1.getName()));
    }

    @Override  // com.fasterxml.jackson.databind.deser.e
    public e l2(com.fasterxml.jackson.databind.deser.impl.c c0) {
        return new i(this, c0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.e
    public e m2(Set set0, Set set1) {
        return new i(this, set0, set1);
    }

    @Override  // com.fasterxml.jackson.databind.deser.e
    public e o2(boolean z) {
        return new i(this, z);
    }

    @Override  // com.fasterxml.jackson.databind.deser.e
    public e p2(s s0) {
        return new i(this, s0);
    }

    protected final Object s2(n n0, h h0, Object object0) throws IOException {
        if(this.o != null) {
            this.f2(h0, object0);
        }
        if(this.w != null) {
            if(n0.Y3(r.k)) {
                n0.m4();
            }
            H h1 = h0.O(n0);
            h1.D4();
            return this.z2(n0, h0, object0, h1);
        }
        if(this.x != null) {
            return this.x2(n0, h0, object0);
        }
        if(this.t) {
            Class class0 = h0.n();
            if(class0 != null) {
                return this.A2(n0, h0, object0, class0);
            }
        }
        r r0 = n0.Y();
        if(r0 == r.k) {
            r0 = n0.m4();
        }
        while(r0 == r.o) {
            String s = n0.T();
            n0.m4();
            y y0 = this.n.p(s);
            if(y0 == null) {
                this.b2(n0, h0, object0, s);
            }
            else {
                try {
                    object0 = y0.s(n0, h0, object0);
                }
                catch(Exception exception0) {
                    this.q2(exception0, object0, s, h0);
                }
            }
            r0 = n0.m4();
        }
        return object0;
    }

    @Override  // com.fasterxml.jackson.databind.deser.e
    protected Object t1(n n0, h h0) throws IOException {
        Object object1;
        Object object0;
        v v0 = this.k;
        com.fasterxml.jackson.databind.deser.impl.y y0 = v0.h(n0, h0, this.y);
        Class class0 = this.t ? h0.n() : null;
        r r0 = n0.Y();
        H h1 = null;
        while(r0 == r.o) {
            String s = n0.T();
            n0.m4();
            y y1 = v0.f(s);
            if(!y0.l(s) || y1 != null) {
                if(y1 == null) {
                    y y2 = this.n.p(s);
                    if(y2 != null) {
                        y0.e(y2, y2.q(n0, h0));
                    }
                    else if(q.c(s, this.q, this.r)) {
                        this.X1(n0, h0, this.s(), s);
                    }
                    else {
                        com.fasterxml.jackson.databind.deser.x x0 = this.p;
                        if(x0 == null) {
                            if(h1 == null) {
                                h1 = h0.O(n0);
                            }
                            h1.v3(s);
                            h1.T(n0);
                        }
                        else {
                            y0.c(x0, s, x0.f(n0, h0));
                        }
                    }
                }
                else if(class0 != null && !y1.R(class0)) {
                    n0.I4();
                }
                else if(y0.b(y1, y1.q(n0, h0))) {
                    n0.m4();
                    try {
                        object0 = v0.a(h0, y0);
                    }
                    catch(Exception exception0) {
                        this.q2(exception0, this.f.g(), s, h0);
                        goto label_41;
                    }
                    if(object0.getClass() != this.f.g()) {
                        return this.Y1(n0, h0, n0.J4(), object0, h1);
                    }
                    if(h1 != null) {
                        object0 = this.a2(h0, object0, h1);
                    }
                    return this.s2(n0, h0, object0);
                }
            }
        label_41:
            r0 = n0.m4();
        }
        try {
            object1 = v0.a(h0, y0);
        }
        catch(Exception exception1) {
            object1 = this.r2(exception1, h0);
        }
        if(h1 != null) {
            return object1.getClass() == this.f.g() ? this.a2(h0, object1, h1) : this.Y1(null, h0, n0.J4(), object1, h1);
        }
        return object1;
    }

    protected Object u2(n n0, h h0) throws IOException {
        return h0.D(this.C, String.format("Deserialization (of %s) with Builder, External type id, @JsonCreator not yet implemented", this.C));
    }

    protected Object v2(n n0, h h0) throws IOException {
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
                        y0.e(y2, y2.q(n0, h0));
                    }
                    else if(q.c(s, this.q, this.r)) {
                        this.X1(n0, h0, this.s(), s);
                    }
                    else {
                        h1.v3(s);
                        h1.T(n0);
                        com.fasterxml.jackson.databind.deser.x x0 = this.p;
                        if(x0 != null) {
                            y0.c(x0, s, x0.f(n0, h0));
                        }
                    }
                }
                else if(y0.b(y1, y1.q(n0, h0))) {
                    n0.m4();
                    try {
                        Object object0 = v0.a(h0, y0);
                        return object0.getClass() == this.f.g() ? this.z2(n0, h0, object0, h1) : this.Y1(n0, h0, n0.J4(), object0, h1);
                    }
                    catch(Exception exception0) {
                        this.q2(exception0, this.f.g(), s, h0);
                    }
                }
            }
        }
        h1.p3();
        try {
            Object object1 = v0.a(h0, y0);
            return this.w.b(n0, h0, object1, h1);
        }
        catch(Exception exception1) {
            return this.r2(exception1, h0);
        }
    }

    protected Object w2(n n0, h h0) throws IOException {
        return this.k == null ? this.x2(n0, h0, this.h.A(h0)) : this.u2(n0, h0);
    }

    protected Object x2(n n0, h h0, Object object0) throws IOException {
        Class class0 = this.t ? h0.n() : null;
        g g0 = this.x.j();
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
                        object0 = y0.s(n0, h0, object0);
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

    @Override  // com.fasterxml.jackson.databind.deser.e
    public Boolean y(com.fasterxml.jackson.databind.g g0) {
        return false;
    }

    protected Object y2(n n0, h h0) throws IOException {
        com.fasterxml.jackson.databind.n n1 = this.i;
        if(n1 != null) {
            Object object0 = n1.g(n0, h0);
            return this.h.C(h0, object0);
        }
        if(this.k != null) {
            return this.v2(n0, h0);
        }
        H h1 = h0.O(n0);
        h1.D4();
        Object object1 = this.h.A(h0);
        if(this.o != null) {
            this.f2(h0, object1);
        }
        Class class0 = this.t ? h0.n() : null;
        while(n0.Y() == r.o) {
            String s = n0.T();
            n0.m4();
            y y0 = this.n.p(s);
            if(y0 == null) {
                if(q.c(s, this.q, this.r)) {
                    this.X1(n0, h0, object1, s);
                }
                else {
                    h1.v3(s);
                    h1.T(n0);
                    com.fasterxml.jackson.databind.deser.x x0 = this.p;
                    if(x0 != null) {
                        try {
                            x0.g(n0, h0, object1, s);
                        }
                        catch(Exception exception1) {
                            this.q2(exception1, object1, s, h0);
                        }
                    }
                }
            }
            else if(class0 == null || y0.R(class0)) {
                try {
                    object1 = y0.s(n0, h0, object1);
                }
                catch(Exception exception0) {
                    this.q2(exception0, object1, s, h0);
                }
            }
            else {
                n0.I4();
            }
            n0.m4();
        }
        h1.p3();
        return this.w.b(n0, h0, object1, h1);
    }

    @Override  // com.fasterxml.jackson.databind.deser.e
    public com.fasterxml.jackson.databind.n z(x x0) {
        return new i(this, x0);
    }

    protected Object z2(n n0, h h0, Object object0, H h1) throws IOException {
        Class class0 = this.t ? h0.n() : null;
        for(r r0 = n0.Y(); r0 == r.o; r0 = n0.m4()) {
            String s = n0.T();
            y y0 = this.n.p(s);
            n0.m4();
            if(y0 == null) {
                if(q.c(s, this.q, this.r)) {
                    this.X1(n0, h0, object0, s);
                }
                else {
                    h1.v3(s);
                    h1.T(n0);
                    com.fasterxml.jackson.databind.deser.x x0 = this.p;
                    if(x0 != null) {
                        x0.g(n0, h0, object0, s);
                    }
                }
            }
            else if(class0 == null || y0.R(class0)) {
                try {
                    object0 = y0.s(n0, h0, object0);
                }
                catch(Exception exception0) {
                    this.q2(exception0, object0, s, h0);
                }
            }
            else {
                n0.I4();
            }
        }
        h1.p3();
        return this.w.b(n0, h0, object0, h1);
    }
}

