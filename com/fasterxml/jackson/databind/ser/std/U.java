package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.G;
import com.fasterxml.jackson.databind.H;
import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.annotation.b;
import com.fasterxml.jackson.databind.d;
import com.fasterxml.jackson.databind.f;
import com.fasterxml.jackson.databind.jsonFormatVisitors.g;
import com.fasterxml.jackson.databind.jsonFormatVisitors.i;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.o;
import com.fasterxml.jackson.databind.p;
import com.fasterxml.jackson.databind.r;
import com.fasterxml.jackson.databind.ser.j;
import com.fasterxml.jackson.databind.ser.k;
import com.fasterxml.jackson.databind.type.q;
import com.fasterxml.jackson.databind.util.c;
import com.fasterxml.jackson.databind.util.e;
import com.fasterxml.jackson.databind.util.h;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

@b
public class u extends j implements k {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[com.fasterxml.jackson.annotation.u.a.values().length];
            a.a = arr_v;
            try {
                arr_v[com.fasterxml.jackson.annotation.u.a.e.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.fasterxml.jackson.annotation.u.a.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.fasterxml.jackson.annotation.u.a.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.fasterxml.jackson.annotation.u.a.f.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.fasterxml.jackson.annotation.u.a.b.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.fasterxml.jackson.annotation.u.a.a.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    protected final d d;
    protected final boolean e;
    protected final m f;
    protected final m g;
    protected r h;
    protected r i;
    protected final com.fasterxml.jackson.databind.jsontype.j j;
    protected com.fasterxml.jackson.databind.ser.impl.k k;
    protected final Set l;
    protected final Set m;
    protected final Object n;
    protected final Object o;
    protected final boolean p;
    protected final com.fasterxml.jackson.databind.util.q.a q;
    protected final boolean r;
    private static final long s = 1L;
    protected static final m t;
    public static final Object u;

    static {
        u.t = q.v0();
        u.u = com.fasterxml.jackson.annotation.u.a.d;
    }

    @Deprecated
    protected u(u u0, d d0, r r0, r r1, Set set0) {
        this(u0, d0, r0, r1, set0, null);
    }

    protected u(u u0, d d0, r r0, r r1, Set set0, Set set1) {
        super(Map.class, false);
        if(set0 == null || set0.isEmpty()) {
            set0 = null;
        }
        this.l = set0;
        this.m = set1;
        this.f = u0.f;
        this.g = u0.g;
        this.e = u0.e;
        this.j = u0.j;
        this.h = r0;
        this.i = r1;
        this.k = com.fasterxml.jackson.databind.ser.impl.k.c();
        this.d = d0;
        this.n = u0.n;
        this.r = u0.r;
        this.o = u0.o;
        this.p = u0.p;
        this.q = com.fasterxml.jackson.databind.util.q.a(set0, set1);
    }

    @Deprecated
    protected u(u u0, com.fasterxml.jackson.databind.jsontype.j j0, Object object0) {
        this(u0, j0, object0, false);
    }

    protected u(u u0, com.fasterxml.jackson.databind.jsontype.j j0, Object object0, boolean z) {
        super(Map.class, false);
        this.l = u0.l;
        this.m = u0.m;
        this.f = u0.f;
        this.g = u0.g;
        this.e = u0.e;
        this.j = j0;
        this.h = u0.h;
        this.i = u0.i;
        this.k = u0.k;
        this.d = u0.d;
        this.n = u0.n;
        this.r = u0.r;
        this.o = object0;
        this.p = z;
        this.q = u0.q;
    }

    protected u(u u0, Object object0, boolean z) {
        super(Map.class, false);
        this.l = u0.l;
        this.m = u0.m;
        this.f = u0.f;
        this.g = u0.g;
        this.e = u0.e;
        this.j = u0.j;
        this.h = u0.h;
        this.i = u0.i;
        this.k = com.fasterxml.jackson.databind.ser.impl.k.c();
        this.d = u0.d;
        this.n = object0;
        this.r = z;
        this.o = u0.o;
        this.p = u0.p;
        this.q = u0.q;
    }

    @Deprecated
    protected u(Set set0, m m0, m m1, boolean z, com.fasterxml.jackson.databind.jsontype.j j0, r r0, r r1) {
        this(set0, null, m0, m1, z, j0, r0, r1);
    }

    protected u(Set set0, Set set1, m m0, m m1, boolean z, com.fasterxml.jackson.databind.jsontype.j j0, r r0, r r1) {
        super(Map.class, false);
        if(set0 == null || set0.isEmpty()) {
            set0 = null;
        }
        this.l = set0;
        this.m = set1;
        this.f = m0;
        this.g = m1;
        this.e = z;
        this.j = j0;
        this.h = r0;
        this.i = r1;
        this.k = com.fasterxml.jackson.databind.ser.impl.k.c();
        this.d = null;
        this.n = null;
        this.r = false;
        this.o = null;
        this.p = false;
        this.q = com.fasterxml.jackson.databind.util.q.a(set0, set1);
    }

    @Override  // com.fasterxml.jackson.databind.ser.j
    public j P(com.fasterxml.jackson.databind.jsontype.j j0) {
        return this.c0(j0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.j
    public r Q() {
        return this.i;
    }

    @Override  // com.fasterxml.jackson.databind.ser.j
    public m R() {
        return this.g;
    }

    @Override  // com.fasterxml.jackson.databind.ser.j
    public boolean T(Object object0) {
        return this.j0(((Map)object0));
    }

    @Deprecated
    protected void V() {
        this.W("N/A");
    }

    protected void W(String s) {
        h.B0(u.class, this, s);
    }

    protected final r X(com.fasterxml.jackson.databind.ser.impl.k k0, m m0, I i0) throws o {
        com.fasterxml.jackson.databind.ser.impl.k.d k$d0 = k0.j(m0, i0, this.d);
        com.fasterxml.jackson.databind.ser.impl.k k1 = k$d0.b;
        if(k0 != k1) {
            this.k = k1;
        }
        return k$d0.a;
    }

    protected final r Y(com.fasterxml.jackson.databind.ser.impl.k k0, Class class0, I i0) throws o {
        com.fasterxml.jackson.databind.ser.impl.k.d k$d0 = k0.k(class0, i0, this.d);
        com.fasterxml.jackson.databind.ser.impl.k k1 = k$d0.b;
        if(k0 != k1) {
            this.k = k1;
        }
        return k$d0.a;
    }

    private final r Z(I i0, Object object0) throws o {
        Class class0 = object0.getClass();
        r r0 = this.k.m(class0);
        if(r0 != null) {
            return r0;
        }
        return this.g.i() ? this.X(this.k, i0.k(this.g, class0), i0) : this.Y(this.k, class0, i0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    @Deprecated
    public p a(I i0, Type type0) {
        return this.x("object", true);
    }

    // 去混淆评级： 低(20)
    protected boolean a0(Map map0) {
        return map0 instanceof HashMap && map0.containsKey(null);
    }

    protected Map b0(Map map0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
        if(map0 instanceof SortedMap) {
            return map0;
        }
        if(this.a0(map0)) {
            Map map1 = new TreeMap();
            for(Object object0: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                Object object1 = map$Entry0.getKey();
                if(object1 == null) {
                    this.e0(k0, i0, map$Entry0.getValue());
                }
                else {
                    ((TreeMap)map1).put(object1, map$Entry0.getValue());
                }
            }
            return map1;
        }
        return new TreeMap(map0);
    }

    @Override  // com.fasterxml.jackson.databind.ser.k
    public r c(I i0, d d0) throws o {
        Object object5;
        boolean z1;
        Set set5;
        Set set4;
        boolean z;
        r r1;
        r r0;
        com.fasterxml.jackson.databind.b b0 = i0.o();
        com.fasterxml.jackson.databind.introspect.k k0 = d0 == null ? null : d0.h();
        if(M.s(k0, b0)) {
            Object object0 = b0.G(k0);
            r0 = object0 == null ? null : i0.N0(k0, object0);
            Object object1 = b0.j(k0);
            r1 = object1 == null ? null : i0.N0(k0, object1);
        }
        else {
            r0 = null;
            r1 = null;
        }
        if(r1 == null) {
            r1 = this.i;
        }
        r r2 = this.z(i0, d0, r1);
        if(r2 == null && this.e && !this.g.Y()) {
            r2 = i0.Z(this.g, d0);
        }
        if(r0 == null) {
            r0 = this.h;
        }
        r r3 = r0 == null ? i0.b0(this.f, d0) : i0.z0(r0, d0);
        Set set0 = this.l;
        Set set1 = this.m;
        if(M.s(k0, b0)) {
            G g0 = i0.r0();
            Set set2 = b0.X(g0, k0).i();
            if(M.u(set2)) {
                set0 = set0 == null ? new HashSet() : new HashSet(set0);
                for(Object object2: set2) {
                    set0.add(((String)object2));
                }
            }
            Set set3 = b0.a0(g0, k0).f();
            if(set3 != null) {
                set1 = set1 == null ? new HashSet() : new HashSet(set1);
                for(Object object3: set3) {
                    set1.add(((String)object3));
                }
            }
            z = Boolean.TRUE.equals(b0.k0(k0));
            set4 = set0;
            set5 = set1;
        }
        else {
            set4 = set0;
            set5 = set1;
            z = false;
        }
        Class class0 = Map.class;
        com.fasterxml.jackson.annotation.n.d n$d0 = this.C(i0, d0, class0);
        if(n$d0 == null) {
            z1 = z;
        }
        else {
            Boolean boolean0 = n$d0.h(com.fasterxml.jackson.annotation.n.a.j);
            z1 = boolean0 == null ? z : boolean0.booleanValue();
        }
        r r4 = this.y0(d0, r3, r2, set4, set5, z1);
        if(k0 != null) {
            Object object4 = b0.z(k0);
            if(object4 != null) {
                r4 = ((u)r4).x0(object4);
            }
        }
        com.fasterxml.jackson.annotation.u.b u$b0 = this.D(i0, d0, class0);
        if(u$b0 != null) {
            com.fasterxml.jackson.annotation.u.a u$a0 = u$b0.g();
            if(u$a0 != com.fasterxml.jackson.annotation.u.a.g) {
                switch(u$a0) {
                    case 1: {
                        object5 = e.b(this.g);
                        return object5 == null || !object5.getClass().isArray() ? ((u)r4).w0(object5, true) : ((u)r4).w0(c.b(object5), true);
                    }
                    case 2: {
                        return this.g.s() ? ((u)r4).w0(u.u, true) : ((u)r4).w0(null, true);
                    }
                    case 3: {
                        return ((u)r4).w0(u.u, true);
                    }
                    case 4: {
                        object5 = i0.B0(null, u$b0.f());
                        return object5 == null ? ((u)r4).w0(object5, true) : ((u)r4).w0(object5, i0.C0(object5));
                    }
                    case 5: {
                        return ((u)r4).w0(null, true);
                    }
                    default: {
                        return ((u)r4).w0(null, false);
                    }
                }
            }
        }
        return r4;
    }

    public u c0(com.fasterxml.jackson.databind.jsontype.j j0) {
        if(this.j == j0) {
            return this;
        }
        this.W("_withValueTypeSerializer");
        return new u(this, j0, this.o, this.p);
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    public void e(g g0, m m0) throws o {
        i i0 = g0.f(m0);
        if(i0 != null) {
            i0.o(this.h, this.f);
            r r0 = this.i;
            if(r0 == null) {
                com.fasterxml.jackson.databind.ser.impl.k k0 = this.k;
                I i1 = g0.a();
                r0 = this.X(k0, this.g, i1);
            }
            i0.n(r0, this.g);
        }
    }

    protected void e0(com.fasterxml.jackson.core.k k0, I i0, Object object0) throws IOException {
        r r1;
        r r0 = i0.e0(this.f, this.d);
        if(object0 == null) {
            if(this.p) {
                return;
            }
            r1 = i0.t0();
        }
        else {
            r1 = this.i == null ? this.Z(i0, object0) : this.i;
            Object object1 = this.o;
            if(object1 == u.u) {
                if(r1.h(i0, object0)) {
                    return;
                }
            }
            else if(object1 != null && object1.equals(object0)) {
                return;
            }
        }
        try {
            r0.m(null, k0, i0);
            r1.m(object0, k0, i0);
        }
        catch(Exception exception0) {
            this.O(i0, exception0, object0, "");
        }
    }

    public static u f0(Set set0, m m0, boolean z, com.fasterxml.jackson.databind.jsontype.j j0, r r0, r r1, Object object0) {
        return u.g0(set0, null, m0, z, j0, r0, r1, object0);
    }

    public static u g0(Set set0, Set set1, m m0, boolean z, com.fasterxml.jackson.databind.jsontype.j j0, r r0, r r1, Object object0) {
        boolean z2;
        m m2;
        m m1;
        if(m0 == null) {
            m1 = u.t;
            m2 = m1;
        }
        else {
            m2 = m0.j(Properties.class) ? q.v0() : m0.E();
            m1 = m0.N();
        }
        boolean z1 = false;
        if(z) {
            z2 = m2.g() != Object.class;
        }
        else {
            if(m2 != null && m2.q()) {
                z1 = true;
            }
            z2 = z1;
        }
        u u0 = new u(set0, set1, m1, m2, z2, j0, r0, r1);
        return object0 == null ? u0 : u0.x0(object0);
    }

    @Override  // com.fasterxml.jackson.databind.r
    public boolean h(I i0, Object object0) {
        return this.k0(i0, ((Map)object0));
    }

    @Deprecated
    public static u h0(String[] arr_s, m m0, boolean z, com.fasterxml.jackson.databind.jsontype.j j0, r r0, r r1, Object object0) {
        return u.f0(c.a(arr_s), m0, z, j0, r0, r1, object0);
    }

    public r i0() {
        return this.h;
    }

    public boolean j0(Map map0) {
        return map0.size() == 1;
    }

    public boolean k0(I i0, Map map0) {
        if(map0.isEmpty()) {
            return true;
        }
        Object object0 = this.o;
        if(object0 == null && !this.p) {
            return false;
        }
        r r0 = this.i;
        boolean z = u.u == object0;
        if(r0 != null) {
            for(Object object1: map0.values()) {
                if(object1 == null) {
                    if(this.p) {
                        continue;
                    }
                    return false;
                }
                if(z) {
                    if(r0.h(i0, object1)) {
                        continue;
                    }
                    return false;
                }
                if(object0 == null || !object0.equals(map0)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }
        for(Object object2: map0.values()) {
            if(object2 == null) {
                if(this.p) {
                    continue;
                }
                return false;
            }
            try {
                r r1 = this.Z(i0, object2);
                if(z) {
                    goto label_29;
                }
                goto label_31;
            }
            catch(f unused_ex) {
                return false;
            }
        label_29:
            if(r1.h(i0, object2)) {
                continue;
            }
            return false;
        label_31:
            if(object0 != null && object0.equals(map0)) {
                continue;
            }
            return false;
        }
        return true;
    }

    @Override  // com.fasterxml.jackson.databind.ser.std.M
    public void m(Object object0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
        this.m0(((Map)object0), k0, i0);
    }

    public void m0(Map map0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
        k0.E4(map0);
        this.u0(map0, k0, i0);
        k0.p3();
    }

    @Override  // com.fasterxml.jackson.databind.r
    public void n(Object object0, com.fasterxml.jackson.core.k k0, I i0, com.fasterxml.jackson.databind.jsontype.j j0) throws IOException {
        this.t0(((Map)object0), k0, i0, j0);
    }

    public void n0(Map map0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
        Object object1;
        Iterator iterator0;
        r r0;
        Object object0 = null;
        if(this.j != null) {
            this.s0(map0, k0, i0, null);
            return;
        }
        try {
            r0 = this.h;
            iterator0 = map0.entrySet().iterator();
            object1 = null;
        }
        catch(Exception exception0) {
            this.O(i0, exception0, map0, String.valueOf(object0));
            return;
        }
        try {
            while(true) {
                if(!iterator0.hasNext()) {
                    return;
                }
                Object object2 = iterator0.next();
                Object object3 = ((Map.Entry)object2).getValue();
                object1 = ((Map.Entry)object2).getKey();
                if(object1 == null) {
                    i0.e0(this.f, this.d).m(null, k0, i0);
                }
                else {
                    if(this.q != null && this.q.b(object1)) {
                        continue;
                    }
                    r0.m(object1, k0, i0);
                }
                if(object3 == null) {
                    i0.X(k0);
                }
                else {
                    (this.i == null ? this.Z(i0, object3) : this.i).m(object3, k0, i0);
                }
            }
        }
        catch(Exception exception0) {
            object0 = object1;
        }
        this.O(i0, exception0, map0, String.valueOf(object0));
    }

    public void o0(Map map0, com.fasterxml.jackson.core.k k0, I i0, r r0) throws IOException {
        r r1 = this.h;
        com.fasterxml.jackson.databind.jsontype.j j0 = this.j;
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            Object object1 = map$Entry0.getKey();
            if(this.q == null || !this.q.b(object1)) {
                if(object1 == null) {
                    i0.e0(this.f, this.d).m(null, k0, i0);
                }
                else {
                    r1.m(object1, k0, i0);
                }
                Object object2 = map$Entry0.getValue();
                if(object2 == null) {
                    i0.X(k0);
                }
                else {
                    try {
                        if(j0 == null) {
                            r0.m(object2, k0, i0);
                            continue;
                        }
                        r0.n(object2, k0, i0, j0);
                        continue;
                    }
                    catch(Exception exception0) {
                    }
                    this.O(i0, exception0, map0, String.valueOf(object1));
                }
            }
        }
    }

    public void p0(I i0, com.fasterxml.jackson.core.k k0, Object object0, Map map0, com.fasterxml.jackson.databind.ser.o o0, Object object1) throws IOException {
        r r1;
        t t0 = new t(this.j, this.d);
        boolean z = u.u == object1;
        for(Object object2: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object2;
            Object object3 = map$Entry0.getKey();
            if(this.q == null || !this.q.b(object3)) {
                r r0 = object3 == null ? i0.e0(this.f, this.d) : this.h;
                Object object4 = map$Entry0.getValue();
                if(object4 == null) {
                    if(this.p) {
                        continue;
                    }
                    r1 = i0.t0();
                }
                else {
                    r1 = this.i == null ? this.Z(i0, object4) : this.i;
                    if(!z) {
                        if(object1 == null || !object1.equals(object4)) {
                            goto label_19;
                        }
                        continue;
                    }
                    else if(r1.h(i0, object4)) {
                        continue;
                    }
                }
            label_19:
                t0.u(object3, object4, r0, r1);
                try {
                    o0.b(object0, k0, i0, t0);
                }
                catch(Exception exception0) {
                    this.O(i0, exception0, map0, String.valueOf(object3));
                }
            }
        }
    }

    @Override  // com.fasterxml.jackson.databind.r
    public r q(Object object0) {
        return this.x0(object0);
    }

    public void q0(Map map0, com.fasterxml.jackson.core.k k0, I i0, com.fasterxml.jackson.databind.ser.o o0, Object object0) throws IOException {
        r r1;
        t t0 = new t(this.j, this.d);
        boolean z = u.u == object0;
        for(Object object1: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object1;
            Object object2 = map$Entry0.getKey();
            if(this.q == null || !this.q.b(object2)) {
                r r0 = object2 == null ? i0.e0(this.f, this.d) : this.h;
                Object object3 = map$Entry0.getValue();
                if(object3 == null) {
                    if(this.p) {
                        continue;
                    }
                    r1 = i0.t0();
                }
                else {
                    r1 = this.i == null ? this.Z(i0, object3) : this.i;
                    if(!z) {
                        if(object0 == null || !object0.equals(object3)) {
                            goto label_19;
                        }
                        continue;
                    }
                    else if(r1.h(i0, object3)) {
                        continue;
                    }
                }
            label_19:
                t0.u(object2, object3, r0, r1);
                try {
                    o0.b(map0, k0, i0, t0);
                }
                catch(Exception exception0) {
                    this.O(i0, exception0, map0, String.valueOf(object2));
                }
            }
        }
    }

    public void r0(Map map0, com.fasterxml.jackson.core.k k0, I i0, Object object0) throws IOException {
        r r1;
        r r0;
        if(this.j != null) {
            this.s0(map0, k0, i0, object0);
            return;
        }
        boolean z = u.u == object0;
        for(Object object1: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object1;
            Object object2 = map$Entry0.getKey();
            if(object2 == null) {
                r0 = i0.e0(this.f, this.d);
            }
            else {
                if(this.q != null && this.q.b(object2)) {
                    continue;
                }
                r0 = this.h;
            }
            Object object3 = map$Entry0.getValue();
            if(object3 == null) {
                if(this.p) {
                    continue;
                }
                r1 = i0.t0();
            }
            else {
                r1 = this.i == null ? this.Z(i0, object3) : this.i;
                if(!z) {
                    if(object0 == null || !object0.equals(object3)) {
                        goto label_24;
                    }
                    continue;
                }
                else if(r1.h(i0, object3)) {
                    continue;
                }
            }
            try {
            label_24:
                r0.m(object2, k0, i0);
                r1.m(object3, k0, i0);
            }
            catch(Exception exception0) {
                this.O(i0, exception0, map0, String.valueOf(object2));
            }
        }
    }

    public void s0(Map map0, com.fasterxml.jackson.core.k k0, I i0, Object object0) throws IOException {
        r r1;
        r r0;
        boolean z = u.u == object0;
        for(Object object1: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object1;
            Object object2 = map$Entry0.getKey();
            if(object2 == null) {
                r0 = i0.e0(this.f, this.d);
            }
            else {
                if(this.q != null && this.q.b(object2)) {
                    continue;
                }
                r0 = this.h;
            }
            Object object3 = map$Entry0.getValue();
            if(object3 == null) {
                if(this.p) {
                    continue;
                }
                r1 = i0.t0();
            }
            else {
                r1 = this.i == null ? this.Z(i0, object3) : this.i;
                if(!z) {
                    if(object0 == null || !object0.equals(object3)) {
                        goto label_21;
                    }
                    continue;
                }
                else if(r1.h(i0, object3)) {
                    continue;
                }
            }
        label_21:
            r0.m(object2, k0, i0);
            try {
                r1.n(object3, k0, i0, this.j);
            }
            catch(Exception exception0) {
                this.O(i0, exception0, map0, String.valueOf(object2));
            }
        }
    }

    public void t0(Map map0, com.fasterxml.jackson.core.k k0, I i0, com.fasterxml.jackson.databind.jsontype.j j0) throws IOException {
        k0.u1(map0);
        com.fasterxml.jackson.core.type.c c0 = j0.o(k0, j0.f(map0, com.fasterxml.jackson.core.r.k));
        this.u0(map0, k0, i0);
        j0.v(k0, c0);
    }

    public void u0(Map map0, com.fasterxml.jackson.core.k k0, I i0) throws IOException {
        if(!map0.isEmpty()) {
            if(this.r || i0.D0(H.z)) {
                map0 = this.b0(map0, k0, i0);
            }
            Object object0 = this.n;
            if(object0 != null) {
                com.fasterxml.jackson.databind.ser.o o0 = this.E(i0, object0, map0);
                if(o0 != null) {
                    this.q0(map0, k0, i0, o0, this.o);
                    return;
                }
            }
            Object object1 = this.o;
            if(object1 == null && !this.p) {
                r r0 = this.i;
                if(r0 != null) {
                    this.o0(map0, k0, i0, r0);
                    return;
                }
                this.n0(map0, k0, i0);
                return;
            }
            this.r0(map0, k0, i0, object1);
        }
    }

    @Deprecated
    public u v0(Object object0) {
        return new u(this, this.j, object0, this.p);
    }

    public u w0(Object object0, boolean z) {
        if(object0 == this.o && z == this.p) {
            return this;
        }
        this.W("withContentInclusion");
        return new u(this, this.j, object0, z);
    }

    public u x0(Object object0) {
        if(this.n == object0) {
            return this;
        }
        this.W("withFilterId");
        return new u(this, object0, this.r);
    }

    public u y0(d d0, r r0, r r1, Set set0, Set set1, boolean z) {
        this.W("withResolved");
        u u0 = new u(this, d0, r0, r1, set0, set1);
        return z == u0.r ? u0 : new u(u0, this.n, z);
    }

    public u z0(d d0, r r0, r r1, Set set0, boolean z) {
        return this.y0(d0, r0, r1, set0, null, z);
    }
}

