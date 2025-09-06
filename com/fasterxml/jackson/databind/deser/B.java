package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.A;
import com.fasterxml.jackson.databind.B;
import com.fasterxml.jackson.databind.cfg.j;
import com.fasterxml.jackson.databind.cfg.o;
import com.fasterxml.jackson.databind.deser.impl.d;
import com.fasterxml.jackson.databind.deser.impl.e;
import com.fasterxml.jackson.databind.deser.std.G;
import com.fasterxml.jackson.databind.deser.std.K;
import com.fasterxml.jackson.databind.deser.std.L;
import com.fasterxml.jackson.databind.deser.std.O;
import com.fasterxml.jackson.databind.deser.std.Q;
import com.fasterxml.jackson.databind.deser.std.r;
import com.fasterxml.jackson.databind.deser.std.u;
import com.fasterxml.jackson.databind.deser.std.x;
import com.fasterxml.jackson.databind.deser.std.z;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.introspect.I;
import com.fasterxml.jackson.databind.introspect.M;
import com.fasterxml.jackson.databind.introspect.f;
import com.fasterxml.jackson.databind.introspect.l;
import com.fasterxml.jackson.databind.introspect.p;
import com.fasterxml.jackson.databind.introspect.t;
import com.fasterxml.jackson.databind.introspect.v;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.n;
import com.fasterxml.jackson.databind.s;
import com.fasterxml.jackson.databind.type.i;
import com.fasterxml.jackson.databind.util.E;
import com.fasterxml.jackson.databind.util.H;
import com.fasterxml.jackson.databind.util.k;
import j..util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicReference;

public abstract class b extends q implements Serializable {
    static class a {
        static final int[] a;
        static final int[] b;

        static {
            int[] arr_v = new int[com.fasterxml.jackson.databind.cfg.j.a.values().length];
            a.b = arr_v;
            try {
                arr_v[com.fasterxml.jackson.databind.cfg.j.a.a.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[com.fasterxml.jackson.databind.cfg.j.a.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[com.fasterxml.jackson.databind.cfg.j.a.d.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.b[com.fasterxml.jackson.databind.cfg.j.a.c.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[com.fasterxml.jackson.annotation.k.a.values().length];
            a.a = arr_v1;
            try {
                arr_v1[com.fasterxml.jackson.annotation.k.a.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.fasterxml.jackson.annotation.k.a.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[com.fasterxml.jackson.annotation.k.a.a.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public static class com.fasterxml.jackson.databind.deser.b.b {
        static final HashMap a;
        static final HashMap b;

        static {
            HashMap hashMap0 = new HashMap();
            hashMap0.put("java.util.Collection", ArrayList.class);
            hashMap0.put("java.util.List", ArrayList.class);
            hashMap0.put("java.util.Set", HashSet.class);
            hashMap0.put("java.util.SortedSet", TreeSet.class);
            hashMap0.put("java.util.Queue", LinkedList.class);
            hashMap0.put("java.util.AbstractList", ArrayList.class);
            hashMap0.put("java.util.AbstractSet", HashSet.class);
            hashMap0.put("java.util.Deque", LinkedList.class);
            hashMap0.put("java.util.NavigableSet", TreeSet.class);
            hashMap0.put("java.util.SequencedCollection", ArrayList.class);
            hashMap0.put("java.util.SequencedSet", LinkedHashSet.class);
            com.fasterxml.jackson.databind.deser.b.b.a = hashMap0;
            HashMap hashMap1 = new HashMap();
            hashMap1.put("java.util.Map", LinkedHashMap.class);
            hashMap1.put("java.util.AbstractMap", LinkedHashMap.class);
            hashMap1.put("java.util.concurrent.ConcurrentMap", ConcurrentHashMap.class);
            hashMap1.put("java.util.SortedMap", TreeMap.class);
            hashMap1.put("java.util.NavigableMap", TreeMap.class);
            hashMap1.put("java.util.concurrent.ConcurrentNavigableMap", ConcurrentSkipListMap.class);
            hashMap1.put("java.util.SequencedMap", LinkedHashMap.class);
            com.fasterxml.jackson.databind.deser.b.b.b = hashMap1;
        }

        public static Class a(m m0) {
            return (Class)com.fasterxml.jackson.databind.deser.b.b.a.get(m0.g().getName());
        }

        public static Class b(m m0) {
            return (Class)com.fasterxml.jackson.databind.deser.b.b.b.get(m0.g().getName());
        }
    }

    public static class c {
        public final h a;
        public final com.fasterxml.jackson.databind.c b;
        public final M c;
        public final e d;
        public final Map e;
        private List f;
        private int g;
        private List h;
        private int i;

        public c(h h0, com.fasterxml.jackson.databind.c c0, M m0, e e0, Map map0) {
            this.a = h0;
            this.b = c0;
            this.c = m0;
            this.d = e0;
            this.e = map0;
        }

        public void a(d d0) {
            if(this.h == null) {
                this.h = new LinkedList();
            }
            this.h.add(d0);
        }

        public void b(d d0) {
            if(this.f == null) {
                this.f = new LinkedList();
            }
            this.f.add(d0);
        }

        public com.fasterxml.jackson.databind.b c() {
            return this.a.o();
        }

        public boolean d() {
            return this.i > 0;
        }

        public boolean e() {
            return this.g > 0;
        }

        public boolean f() {
            return this.h != null;
        }

        public boolean g() {
            return this.f != null;
        }

        public List h() {
            return this.h;
        }

        public List i() {
            return this.f;
        }

        public void j() {
            ++this.i;
        }

        public void k() {
            ++this.g;
        }
    }

    protected final o b;
    private static final Class c;
    private static final Class d;
    private static final Class e;
    private static final Class f;
    private static final Class g;
    private static final Class h;
    protected static final B i;

    static {
        b.c = Object.class;
        b.d = String.class;
        b.e = CharSequence.class;
        b.f = Iterable.class;
        b.g = Map.Entry.class;
        b.h = Serializable.class;
        b.i = new B("@JsonUnwrapped");
    }

    protected b(o o0) {
        this.b = o0;
    }

    protected void A(h h0, c b$c0, boolean z) throws com.fasterxml.jackson.databind.o {
        com.fasterxml.jackson.databind.c c0 = b$c0.b;
        e e0 = b$c0.d;
        com.fasterxml.jackson.databind.b b0 = b$c0.c();
        M m0 = b$c0.c;
        Map map0 = b$c0.e;
        for(Object object0: c0.D()) {
            l l0 = (l)object0;
            com.fasterxml.jackson.annotation.k.a k$a0 = b0.k(h0.g0(), l0);
            int v = l0.D();
            if(k$a0 == null) {
                if(!z || v != 1 || !m0.c(l0)) {
                    continue;
                }
                b$c0.b(d.a(b0, l0, null));
            }
            else if(k$a0 == com.fasterxml.jackson.annotation.k.a.d) {
            }
            else if(v == 0) {
                e0.r(l0);
            }
            else {
                switch(k$a0) {
                    case 1: {
                        this.z(h0, c0, e0, d.a(b0, l0, null));
                        break;
                    }
                    case 2: {
                        this.B(h0, c0, e0, d.a(b0, l0, ((v[])map0.get(l0))));
                        break;
                    }
                    default: {
                        this.x(h0, c0, e0, d.a(b0, l0, ((v[])map0.get(l0))), j.e);
                    }
                }
                b$c0.k();
            }
        }
    }

    protected void B(h h0, com.fasterxml.jackson.databind.c c0, e e0, d d0) throws com.fasterxml.jackson.databind.o {
        int v = d0.g();
        y[] arr_y = new y[v];
        for(int v1 = 0; v1 < v; ++v1) {
            com.fasterxml.jackson.annotation.d.a d$a0 = d0.f(v1);
            com.fasterxml.jackson.databind.introspect.o o0 = d0.i(v1);
            B b0 = d0.h(v1);
            if(b0 == null) {
                if(h0.o().s0(o0) != null) {
                    this.c0(h0, c0, o0);
                }
                B b1 = d0.d(v1);
                this.e0(h0, c0, d0, v1, b1, d$a0);
                b0 = b1;
            }
            arr_y[v1] = this.g0(h0, c0, b0, v1, o0, d$a0);
        }
        e0.l(d0.b(), true, arr_y);
    }

    protected void C(h h0, c b$c0, List list0) throws com.fasterxml.jackson.databind.o {
        int v12;
        p p1;
        int v11;
        M m2;
        d d1;
        y[] arr_y1;
        int v10;
        int v9;
        int v3;
        M m1;
        com.fasterxml.jackson.databind.c c0 = b$c0.b;
        e e0 = b$c0.d;
        com.fasterxml.jackson.databind.b b0 = b$c0.c();
        M m0 = b$c0.c;
        int v = !h0.g0().g1().e() || c0.L() ? 0 : 1;
        LinkedList linkedList0 = null;
        for(Object object0: list0) {
            d d0 = (d)object0;
            int v1 = d0.g();
            p p0 = d0.b();
            if(v1 == 1) {
                v v2 = d0.j(0);
                if(v != 0 || this.F(c0, b0, p0, v2)) {
                    com.fasterxml.jackson.annotation.d.a d$a0 = d0.f(0);
                    B b1 = d0.h(0);
                    if(b1 == null) {
                        b1 = d0.d(0);
                        if(b1 != null || d$a0 != null) {
                            e0.l(p0, false, new y[]{this.g0(h0, c0, b1, 0, d0.i(0), d$a0)});
                        }
                    }
                    else {
                        e0.l(p0, false, new y[]{this.g0(h0, c0, b1, 0, d0.i(0), d$a0)});
                    }
                }
                else {
                    this.X(e0, p0, false, m0.c(p0));
                    if(v2 != null) {
                        ((I)v2).H0();
                    }
                }
                m1 = m0;
                v3 = v;
            }
            else {
                y[] arr_y = new y[v1];
                int v4 = 0;
                int v5 = -1;
                int v6 = 0;
                int v7 = 0;
                while(v4 < v1) {
                    com.fasterxml.jackson.databind.introspect.o o0 = p0.B(v4);
                    v v8 = d0.j(v4);
                    com.fasterxml.jackson.annotation.d.a d$a1 = b0.D(o0);
                    B b2 = v8 == null ? null : v8.a();
                    if(v8 != null && (v8.N() || c0.L())) {
                        ++v6;
                        v9 = v4;
                        v10 = v5;
                        arr_y1 = arr_y;
                        v11 = v;
                        p1 = p0;
                        m2 = m0;
                        v12 = v1;
                        d1 = d0;
                        arr_y1[v9] = this.g0(h0, c0, b2, v9, o0, d$a1);
                    }
                    else {
                        v9 = v4;
                        v10 = v5;
                        arr_y1 = arr_y;
                        d1 = d0;
                        m2 = m0;
                        v11 = v;
                        p1 = p0;
                        v12 = v1;
                        if(d$a1 != null) {
                            ++v7;
                            arr_y1[v9] = this.g0(h0, c0, b2, v9, o0, d$a1);
                        }
                        else if(b0.s0(o0) != null) {
                            this.c0(h0, c0, o0);
                        }
                        else if(v10 < 0) {
                            v5 = v9;
                            goto label_70;
                        }
                    }
                    v5 = v10;
                label_70:
                    v4 = v9 + 1;
                    v1 = v12;
                    arr_y = arr_y1;
                    p0 = p1;
                    v = v11;
                    m0 = m2;
                    d0 = d1;
                }
                m1 = m0;
                v3 = v;
                if(v6 > 0 || v7 > 0) {
                    if(v6 + v7 == v1) {
                        e0.l(p0, false, arr_y);
                        goto label_94;
                    }
                    else if(v6 != 0 || v7 + 1 != v1) {
                        B b3 = d0.d(v5);
                        if(b3 == null || b3.i()) {
                            h0.X0(c0, "Argument #%d of constructor %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator", new Object[]{v5, p0});
                        }
                    }
                    else {
                        e0.h(p0, false, arr_y, 0);
                        goto label_94;
                    }
                }
                if(!e0.o()) {
                    if(linkedList0 == null) {
                        linkedList0 = new LinkedList();
                    }
                    linkedList0.add(p0);
                }
            }
        label_94:
            v = v3;
            m0 = m1;
        }
        if(linkedList0 != null && !e0.p() && !e0.q()) {
            this.G(h0, c0, m0, b0, e0, linkedList0);
        }
    }

    protected void D(h h0, c b$c0, List list0) throws com.fasterxml.jackson.databind.o {
        p p1;
        y[] arr_y1;
        int v5;
        com.fasterxml.jackson.databind.c c0 = b$c0.b;
        e e0 = b$c0.d;
        com.fasterxml.jackson.databind.b b0 = b$c0.c();
        M m0 = b$c0.c;
        Map map0 = b$c0.e;
        for(Object object0: list0) {
            d d0 = (d)object0;
            p p0 = d0.b();
            v[] arr_v = (v[])map0.get(p0);
            if(d0.g() == 1) {
                v v0 = d0.j(0);
                if(this.F(c0, b0, p0, v0)) {
                    y[] arr_y = new y[1];
                    com.fasterxml.jackson.databind.introspect.o o0 = null;
                    int v1 = 0;
                    int v2 = 0;
                    int v3 = 0;
                    while(v3 < 1) {
                        com.fasterxml.jackson.databind.introspect.o o1 = p0.B(v3);
                        v v4 = arr_v == null ? null : arr_v[v3];
                        com.fasterxml.jackson.annotation.d.a d$a0 = b0.D(o1);
                        B b1 = v4 == null ? null : v4.a();
                        if(v4 == null || !v4.N()) {
                            v5 = v3;
                            arr_y1 = arr_y;
                            p1 = p0;
                            if(d$a0 != null) {
                                ++v2;
                                arr_y1[v5] = this.g0(h0, c0, b1, v5, o1, d$a0);
                            }
                            else if(b0.s0(o1) != null) {
                                this.c0(h0, c0, o1);
                            }
                            else if(o0 == null) {
                                o0 = o1;
                            }
                        }
                        else {
                            ++v1;
                            v5 = v3;
                            arr_y1 = arr_y;
                            p1 = p0;
                            arr_y1[v5] = this.g0(h0, c0, b1, v5, o1, d$a0);
                        }
                        v3 = v5 + 1;
                        arr_y = arr_y1;
                        p0 = p1;
                    }
                    if(v1 <= 0 && v2 <= 0) {
                    }
                    else if(v1 + v2 == 1) {
                        e0.l(p0, false, arr_y);
                    }
                    else if(v1 == 0 && v2 + 1 == 1) {
                        e0.h(p0, false, arr_y, 0);
                    }
                    else {
                        h0.X0(c0, "Argument #%d of factory method %s has no property name annotation; must have name when multiple-parameter constructor annotated as Creator", new Object[]{((int)(o0 == null ? -1 : o0.u())), p0});
                    }
                }
                else {
                    this.X(e0, p0, false, m0.c(p0));
                    if(v0 == null) {
                        continue;
                    }
                    ((I)v0).H0();
                }
            }
        }
    }

    @Deprecated
    protected void E(h h0, c b$c0, f f0, List list0) throws com.fasterxml.jackson.databind.o {
        int v = f0.D();
        com.fasterxml.jackson.databind.b b0 = h0.o();
        y[] arr_y = new y[v];
        for(int v1 = 0; v1 < v; ++v1) {
            com.fasterxml.jackson.databind.introspect.o o0 = f0.B(v1);
            com.fasterxml.jackson.annotation.d.a d$a0 = b0.D(o0);
            B b1 = b0.I(o0);
            if(b1 == null || b1.i()) {
                b1 = B.a(((String)list0.get(v1)));
            }
            arr_y[v1] = this.g0(h0, b$c0.b, b1, v1, o0, d$a0);
        }
        b$c0.d.l(f0, false, arr_y);
    }

    private boolean F(com.fasterxml.jackson.databind.c c0, com.fasterxml.jackson.databind.b b0, p p0, v v0) {
        if(v0 != null && v0.N()) {
            return true;
        }
        if(c0.p() != null) {
            return false;
        }
        if(b0.D(p0.B(0)) != null) {
            return true;
        }
        if(v0 != null) {
            String s = v0.getName();
            return s == null || s.isEmpty() || !v0.m() ? !v0.N() && c0.L() : true;
        }
        return false;
    }

    private void G(h h0, com.fasterxml.jackson.databind.c c0, M m0, com.fasterxml.jackson.databind.b b0, e e0, List list0) throws com.fasterxml.jackson.databind.o {
        B b1;
        com.fasterxml.jackson.databind.introspect.o o0;
        int v2;
        y[] arr_y1;
        p p2;
        Iterator iterator0 = list0.iterator();
        p p0 = null;
        p p1 = null;
        y[] arr_y = null;
        while(true) {
            do {
                do {
                label_4:
                    if(!iterator0.hasNext()) {
                        goto label_23;
                    }
                    Object object0 = iterator0.next();
                    p2 = (p)object0;
                }
                while(!m0.c(p2));
                int v1 = p2.D();
                arr_y1 = new y[v1];
                v2 = 0;
            label_12:
                if(v2 >= v1) {
                    goto label_19;
                }
                o0 = p2.B(v2);
                b1 = this.U(o0, b0);
            }
            while(b1 == null || b1.i());
            arr_y1[v2] = this.g0(h0, c0, b1, o0.u(), o0, null);
            ++v2;
            goto label_12;
        label_19:
            if(p1 != null) {
                break;
            }
            p1 = p2;
            arr_y = arr_y1;
            goto label_4;
        label_23:
            p0 = p1;
            break;
        }
        if(p0 != null) {
            e0.l(p0, false, arr_y);
            for(int v = 0; v < arr_y.length; ++v) {
                y y0 = arr_y[v];
                B b2 = y0.a();
                if(!((t)c0).X(b2)) {
                    ((t)c0).R(E.S(h0.g0(), y0.h(), b2));
                }
            }
        }
    }

    protected com.fasterxml.jackson.databind.deser.B H(h h0, com.fasterxml.jackson.databind.c c0) throws com.fasterxml.jackson.databind.o {
        g g0 = h0.g0();
        M m0 = g0.L(c0.y(), c0.A());
        j j0 = g0.g1();
        c b$c0 = new c(h0, c0, m0, new e(c0, g0), this.J(h0, c0));
        this.A(h0, b$c0, !j0.b());
        if(c0.H().n() && !c0.K()) {
            this.y(h0, b$c0, j0.c(c0.y()));
            if(b$c0.f() && !b$c0.d()) {
                this.C(h0, b$c0, b$c0.h());
            }
        }
        if(b$c0.g() && !b$c0.e() && !b$c0.d()) {
            this.D(h0, b$c0, b$c0.i());
        }
        return b$c0.d.n(h0);
    }

    private s I(h h0, m m0) throws com.fasterxml.jackson.databind.o {
        g g0 = h0.g0();
        Class class0 = m0.g();
        com.fasterxml.jackson.databind.c c0 = g0.o1(m0);
        s s0 = this.o0(h0, c0.A());
        if(s0 != null) {
            return s0;
        }
        n n0 = this.O(class0, g0, c0);
        if(n0 != null) {
            return G.f(g0, m0, n0);
        }
        n n1 = this.n0(h0, c0.A());
        if(n1 != null) {
            return G.f(g0, m0, n1);
        }
        k k0 = this.j0(class0, g0, c0);
        k k1 = this.h0(g0, c0.A());
        k k2 = k.p(g0, c0.A());
        k k3 = k.l(g0, c0.A());
        for(Object object0: c0.D()) {
            l l0 = (l)object0;
            if(!this.Y(h0, l0)) {
                continue;
            }
            if(l0.D() != 1 || !l0.N().isAssignableFrom(class0)) {
                throw new IllegalArgumentException("Unsuitable method (" + l0 + ") decorated with @JsonCreator (for Enum type " + class0.getName() + ")");
            }
            if(l0.F(0) != String.class) {
                continue;
            }
            if(g0.c()) {
                com.fasterxml.jackson.databind.util.h.i(l0.L(), h0.z(com.fasterxml.jackson.databind.t.q));
            }
            return G.i(k0, l0, k1, k2, k3);
        }
        return G.j(k0, k1, k2, k3);
    }

    protected Map J(h h0, com.fasterxml.jackson.databind.c c0) throws com.fasterxml.jackson.databind.o {
        Map map0 = Collections.emptyMap();
        for(Object object0: c0.u()) {
            v v0 = (v)object0;
            Iterator iterator1 = v0.w();
            while(iterator1.hasNext()) {
                Object object1 = iterator1.next();
                p p0 = ((com.fasterxml.jackson.databind.introspect.o)object1).w();
                v[] arr_v = (v[])map0.get(p0);
                int v1 = ((com.fasterxml.jackson.databind.introspect.o)object1).u();
                if(arr_v == null) {
                    if(map0.isEmpty()) {
                        map0 = new LinkedHashMap();
                    }
                    arr_v = new v[p0.D()];
                    map0.put(p0, arr_v);
                }
                else if(arr_v[v1] != null) {
                    h0.X0(c0, "Conflict: parameter #%d of %s bound to more than one property; %s vs %s", new Object[]{v1, p0, arr_v[v1], v0});
                }
                arr_v[v1] = v0;
            }
        }
        return map0;
    }

    protected n K(com.fasterxml.jackson.databind.type.a a0, g g0, com.fasterxml.jackson.databind.c c0, com.fasterxml.jackson.databind.jsontype.f f0, n n0) throws com.fasterxml.jackson.databind.o {
        for(Object object0: this.b.c()) {
            n n1 = ((com.fasterxml.jackson.databind.deser.s)object0).d(a0, g0, c0, f0, n0);
            if(n1 != null) {
                return n1;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    protected n L(m m0, g g0, com.fasterxml.jackson.databind.c c0) throws com.fasterxml.jackson.databind.o {
        for(Object object0: this.b.c()) {
            n n0 = ((com.fasterxml.jackson.databind.deser.s)object0).b(m0, g0, c0);
            if(n0 != null) {
                return n0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    protected n M(com.fasterxml.jackson.databind.type.e e0, g g0, com.fasterxml.jackson.databind.c c0, com.fasterxml.jackson.databind.jsontype.f f0, n n0) throws com.fasterxml.jackson.databind.o {
        for(Object object0: this.b.c()) {
            n n1 = ((com.fasterxml.jackson.databind.deser.s)object0).c(e0, g0, c0, f0, n0);
            if(n1 != null) {
                return n1;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    protected n N(com.fasterxml.jackson.databind.type.d d0, g g0, com.fasterxml.jackson.databind.c c0, com.fasterxml.jackson.databind.jsontype.f f0, n n0) throws com.fasterxml.jackson.databind.o {
        for(Object object0: this.b.c()) {
            n n1 = ((com.fasterxml.jackson.databind.deser.s)object0).i(d0, g0, c0, f0, n0);
            if(n1 != null) {
                return n1;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    protected n O(Class class0, g g0, com.fasterxml.jackson.databind.c c0) throws com.fasterxml.jackson.databind.o {
        for(Object object0: this.b.c()) {
            n n0 = ((com.fasterxml.jackson.databind.deser.s)object0).f(class0, g0, c0);
            if(n0 != null) {
                return n0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    protected n P(com.fasterxml.jackson.databind.type.j j0, g g0, com.fasterxml.jackson.databind.c c0, s s0, com.fasterxml.jackson.databind.jsontype.f f0, n n0) throws com.fasterxml.jackson.databind.o {
        for(Object object0: this.b.c()) {
            n n1 = ((com.fasterxml.jackson.databind.deser.s)object0).j(j0, g0, c0, s0, f0, n0);
            if(n1 != null) {
                return n1;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    protected n Q(i i0, g g0, com.fasterxml.jackson.databind.c c0, s s0, com.fasterxml.jackson.databind.jsontype.f f0, n n0) throws com.fasterxml.jackson.databind.o {
        for(Object object0: this.b.c()) {
            n n1 = ((com.fasterxml.jackson.databind.deser.s)object0).g(i0, g0, c0, s0, f0, n0);
            if(n1 != null) {
                return n1;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    protected n R(com.fasterxml.jackson.databind.type.l l0, g g0, com.fasterxml.jackson.databind.c c0, com.fasterxml.jackson.databind.jsontype.f f0, n n0) throws com.fasterxml.jackson.databind.o {
        for(Object object0: this.b.c()) {
            n n1 = ((com.fasterxml.jackson.databind.deser.s)object0).e(l0, g0, c0, f0, n0);
            if(n1 != null) {
                return n1;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    protected n S(Class class0, g g0, com.fasterxml.jackson.databind.c c0) throws com.fasterxml.jackson.databind.o {
        for(Object object0: this.b.c()) {
            n n0 = ((com.fasterxml.jackson.databind.deser.s)object0).h(class0, g0, c0);
            if(n0 != null) {
                return n0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @Deprecated
    protected l T(g g0, m m0) {
        return m0 == null ? null : g0.o1(m0).q();
    }

    private B U(com.fasterxml.jackson.databind.introspect.o o0, com.fasterxml.jackson.databind.b b0) {
        if(b0 != null) {
            B b1 = b0.I(o0);
            if(b1 != null && !b1.i()) {
                return b1;
            }
            String s = b0.C(o0);
            return s == null || s.isEmpty() ? null : B.a(s);
        }
        return null;
    }

    protected m V(g g0, Class class0) throws com.fasterxml.jackson.databind.o {
        m m0 = this.o(g0, g0.h(class0));
        return m0 != null && !m0.j(class0) ? m0 : null;
    }

    protected A W(h h0, com.fasterxml.jackson.databind.d d0, A a0) {
        com.fasterxml.jackson.annotation.M m1;
        com.fasterxml.jackson.databind.b b0 = h0.o();
        g g0 = h0.g0();
        com.fasterxml.jackson.databind.introspect.k k0 = d0.h();
        com.fasterxml.jackson.annotation.M m0 = null;
        if(k0 == null) {
            m1 = null;
        }
        else {
            if(b0 == null) {
                m1 = null;
            }
            else {
                com.fasterxml.jackson.annotation.E.a e$a0 = b0.o0(k0);
                if(e$a0 == null) {
                    m1 = null;
                }
                else {
                    m0 = e$a0.m();
                    m1 = e$a0.l();
                }
            }
            com.fasterxml.jackson.annotation.E.a e$a1 = g0.s(d0.getType().g()).h();
            if(e$a1 != null) {
                if(m0 == null) {
                    m0 = e$a1.m();
                }
                if(m1 == null) {
                    m1 = e$a1.l();
                }
            }
        }
        com.fasterxml.jackson.annotation.E.a e$a2 = g0.I();
        if(m0 == null) {
            m0 = e$a2.m();
        }
        if(m1 == null) {
            m1 = e$a2.l();
        }
        return m0 == null && m1 == null ? a0 : a0.r(m0, m1);
    }

    protected boolean X(e e0, p p0, boolean z, boolean z1) {
        Class class0 = p0.F(0);
        if(class0 != String.class && class0 != b.e) {
            if(class0 != Integer.TYPE && class0 != Integer.class) {
                if(class0 != Long.TYPE && class0 != Long.class) {
                    if(class0 != Double.TYPE && class0 != Double.class) {
                        if(class0 != Boolean.TYPE && class0 != Boolean.class) {
                            if(class0 == BigInteger.class && (z || z1)) {
                                e0.f(p0, z);
                            }
                            if(class0 == BigDecimal.class && (z || z1)) {
                                e0.e(p0, z);
                            }
                            if(z) {
                                e0.h(p0, true, null, 0);
                                return true;
                            }
                            return false;
                        }
                        if(z || z1) {
                            e0.g(p0, z);
                        }
                        return true;
                    }
                    if(z || z1) {
                        e0.i(p0, z);
                    }
                    return true;
                }
                if(z || z1) {
                    e0.k(p0, z);
                }
                return true;
            }
            if(z || z1) {
                e0.j(p0, z);
            }
            return true;
        }
        if(z || z1) {
            e0.m(p0, z);
        }
        return true;
    }

    protected boolean Y(h h0, com.fasterxml.jackson.databind.introspect.b b0) {
        com.fasterxml.jackson.databind.b b1 = h0.o();
        if(b1 != null) {
            com.fasterxml.jackson.annotation.k.a k$a0 = b1.k(h0.g0(), b0);
            return k$a0 != null && k$a0 != com.fasterxml.jackson.annotation.k.a.d;
        }
        return false;
    }

    protected com.fasterxml.jackson.databind.type.e Z(m m0, g g0) {
        Class class0 = com.fasterxml.jackson.databind.deser.b.b.a(m0);
        return class0 == null ? null : ((com.fasterxml.jackson.databind.type.e)g0.S().c0(m0, class0, true));
    }

    @Override  // com.fasterxml.jackson.databind.deser.q
    public n a(h h0, com.fasterxml.jackson.databind.type.a a0, com.fasterxml.jackson.databind.c c0) throws com.fasterxml.jackson.databind.o {
        g g0 = h0.g0();
        m m0 = a0.E();
        Object object0 = m0.S();
        com.fasterxml.jackson.databind.jsontype.f f0 = (com.fasterxml.jackson.databind.jsontype.f)m0.R();
        if(f0 == null) {
            f0 = this.l(g0, m0);
        }
        n n0 = this.K(a0, g0, c0, f0, ((n)object0));
        if(n0 == null) {
            if(((n)object0) == null) {
                if(m0.isPrimitive()) {
                    n0 = z.u1(m0.g());
                }
                else if(m0.j(String.class)) {
                    n0 = K.l;
                }
            }
            if(n0 == null) {
                n0 = new com.fasterxml.jackson.databind.deser.std.y(a0, ((n)object0), f0);
            }
        }
        if(this.b.e()) {
            for(Object object1: this.b.b()) {
                n0 = ((com.fasterxml.jackson.databind.deser.h)object1).a(g0, a0, c0, n0);
            }
        }
        return n0;
    }

    protected com.fasterxml.jackson.databind.type.j a0(m m0, g g0) {
        Class class0 = com.fasterxml.jackson.databind.deser.b.b.b(m0);
        return class0 == null ? null : ((com.fasterxml.jackson.databind.type.j)g0.S().c0(m0, class0, true));
    }

    private m b0(g g0, m m0) throws com.fasterxml.jackson.databind.o {
        Class class0 = m0.g();
        if(this.b.d()) {
            for(Object object0: this.b.a()) {
                m m1 = ((com.fasterxml.jackson.databind.a)object0).a(g0, m0);
                if(m1 != null && !m1.j(class0)) {
                    return m1;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }

    protected void c0(h h0, com.fasterxml.jackson.databind.c c0, com.fasterxml.jackson.databind.introspect.o o0) throws com.fasterxml.jackson.databind.o {
        h0.X0(c0, "Cannot define Creator parameter %d as `@JsonUnwrapped`: combination not yet supported", new Object[]{o0.u()});
    }

    @Override  // com.fasterxml.jackson.databind.deser.q
    public n d(h h0, com.fasterxml.jackson.databind.type.e e0, com.fasterxml.jackson.databind.c c0) throws com.fasterxml.jackson.databind.o {
        m m0 = e0.E();
        n n0 = (n)m0.S();
        g g0 = h0.g0();
        com.fasterxml.jackson.databind.jsontype.f f0 = (com.fasterxml.jackson.databind.jsontype.f)m0.R();
        if(f0 == null) {
            f0 = this.l(g0, m0);
        }
        n n1 = this.M(e0, g0, c0, f0, n0);
        if(n1 == null && (n0 == null && EnumSet.class.isAssignableFrom(e0.g()))) {
            n1 = new com.fasterxml.jackson.databind.deser.std.o(m0, null);
        }
        if(n1 == null) {
            if(e0.isInterface() || e0.k()) {
                com.fasterxml.jackson.databind.type.e e1 = this.Z(e0, g0);
                if(e1 == null) {
                    if(e0.R() == null) {
                        throw new IllegalArgumentException("Cannot find a deserializer for non-concrete Collection type " + e0);
                    }
                    n1 = com.fasterxml.jackson.databind.deser.a.C(c0);
                }
                else {
                    c0 = g0.r1(e1);
                    e0 = e1;
                }
            }
            if(n1 == null) {
                com.fasterxml.jackson.databind.deser.B b0 = this.m(h0, c0);
                if(!b0.k()) {
                    if(e0.j(ArrayBlockingQueue.class)) {
                        return new com.fasterxml.jackson.databind.deser.std.a(e0, n0, f0, b0);
                    }
                    n n2 = com.fasterxml.jackson.databind.deser.impl.l.h(h0, e0);
                    if(n2 != null) {
                        return n2;
                    }
                }
                L l0 = m0.j(String.class) ? new L(e0, n0, b0) : new com.fasterxml.jackson.databind.deser.std.i(e0, n0, f0, b0);
                n1 = l0;
            }
        }
        if(this.b.e()) {
            for(Object object0: this.b.b()) {
                n1 = ((com.fasterxml.jackson.databind.deser.h)object0).b(g0, e0, c0, n1);
            }
        }
        return n1;
    }

    @Override  // com.fasterxml.jackson.databind.deser.q
    public n e(h h0, com.fasterxml.jackson.databind.type.d d0, com.fasterxml.jackson.databind.c c0) throws com.fasterxml.jackson.databind.o {
        m m0 = d0.E();
        g g0 = h0.g0();
        com.fasterxml.jackson.databind.jsontype.f f0 = (com.fasterxml.jackson.databind.jsontype.f)m0.R();
        n n0 = this.N(d0, g0, c0, (f0 == null ? this.l(g0, m0) : f0), ((n)m0.S()));
        if(n0 != null && this.b.e()) {
            for(Object object0: this.b.b()) {
                n0 = ((com.fasterxml.jackson.databind.deser.h)object0).c(g0, d0, c0, n0);
            }
        }
        return n0;
    }

    protected void e0(h h0, com.fasterxml.jackson.databind.c c0, d d0, int v, B b0, com.fasterxml.jackson.annotation.d.a d$a0) throws com.fasterxml.jackson.databind.o {
        if(b0 == null && d$a0 == null) {
            h0.X0(c0, "Argument #%d of constructor %s has no property name (and is not Injectable): can not use as property-based Creator", new Object[]{v, d0});
        }
    }

    @Override  // com.fasterxml.jackson.databind.deser.q
    public n f(h h0, m m0, com.fasterxml.jackson.databind.c c0) throws com.fasterxml.jackson.databind.o {
        g g0 = h0.g0();
        Class class0 = m0.g();
        n n0 = this.O(class0, g0, c0);
        if(n0 == null) {
            if(class0 == Enum.class) {
                return com.fasterxml.jackson.databind.deser.a.C(c0);
            }
            com.fasterxml.jackson.databind.deser.B b0 = this.H(h0, c0);
            y[] arr_y = b0 == null ? null : b0.I(h0.g0());
            for(Object object0: c0.D()) {
                l l0 = (l)object0;
                if(this.Y(h0, l0)) {
                    if(l0.D() == 0) {
                        n0 = com.fasterxml.jackson.databind.deser.std.m.A1(g0, class0, l0);
                        break;
                    }
                    if(!l0.N().isAssignableFrom(class0)) {
                        h0.D(m0, String.format("Invalid `@JsonCreator` annotated Enum factory method [%s]: needs to return compatible type", l0.toString()));
                    }
                    n0 = com.fasterxml.jackson.databind.deser.std.m.z1(g0, class0, l0, b0, arr_y);
                    break;
                }
                if(false) {
                    break;
                }
            }
            if(n0 == null) {
                n0 = new com.fasterxml.jackson.databind.deser.std.m(this.j0(class0, g0, c0), g0.a0(com.fasterxml.jackson.databind.t.z), this.h0(g0, c0.A()), k.p(g0, c0.A()));
            }
        }
        if(this.b.e()) {
            for(Object object1: this.b.b()) {
                n0 = ((com.fasterxml.jackson.databind.deser.h)object1).e(g0, m0, c0, n0);
            }
        }
        return n0;
    }

    public com.fasterxml.jackson.databind.deser.B f0(g g0, com.fasterxml.jackson.databind.introspect.b b0, Object object0) throws com.fasterxml.jackson.databind.o {
        if(object0 == null) {
            return null;
        }
        if(object0 instanceof com.fasterxml.jackson.databind.deser.B) {
            return (com.fasterxml.jackson.databind.deser.B)object0;
        }
        if(!(object0 instanceof Class)) {
            throw new IllegalStateException("AnnotationIntrospector returned key deserializer definition of type " + object0.getClass().getName() + "; expected type KeyDeserializer or Class<KeyDeserializer> instead");
        }
        if(com.fasterxml.jackson.databind.util.h.U(((Class)object0))) {
            return null;
        }
        if(!com.fasterxml.jackson.databind.deser.B.class.isAssignableFrom(((Class)object0))) {
            throw new IllegalStateException("AnnotationIntrospector returned Class " + ((Class)object0).getName() + "; expected Class<ValueInstantiator>");
        }
        com.fasterxml.jackson.databind.cfg.q q0 = g0.M();
        if(q0 != null) {
            com.fasterxml.jackson.databind.deser.B b1 = q0.k(g0, b0, ((Class)object0));
            return b1 == null ? ((com.fasterxml.jackson.databind.deser.B)com.fasterxml.jackson.databind.util.h.n(((Class)object0), g0.c())) : b1;
        }
        return (com.fasterxml.jackson.databind.deser.B)com.fasterxml.jackson.databind.util.h.n(((Class)object0), g0.c());
    }

    @Override  // com.fasterxml.jackson.databind.deser.q
    public s g(h h0, m m0) throws com.fasterxml.jackson.databind.o {
        com.fasterxml.jackson.databind.c c0;
        g g0 = h0.g0();
        s s0 = null;
        if(this.b.g()) {
            c0 = g0.V(m0);
            for(Object object0: this.b.i()) {
                s0 = ((com.fasterxml.jackson.databind.deser.t)object0).a(m0, g0, c0);
                if(s0 != null) {
                    break;
                }
            }
        }
        else {
            c0 = null;
        }
        if(s0 == null) {
            if(c0 == null) {
                c0 = g0.W(m0.g());
            }
            s0 = this.o0(h0, c0.A());
            if(s0 == null) {
                s0 = m0.p() ? this.I(h0, m0) : G.k(g0, m0);
            }
        }
        if(s0 != null && this.b.e()) {
            for(Object object1: this.b.b()) {
                s0 = ((com.fasterxml.jackson.databind.deser.h)object1).f(g0, m0, s0);
            }
        }
        return s0;
    }

    protected y g0(h h0, com.fasterxml.jackson.databind.c c0, B b0, int v, com.fasterxml.jackson.databind.introspect.o o0, com.fasterxml.jackson.annotation.d.a d$a0) throws com.fasterxml.jackson.databind.o {
        B b2;
        A a0;
        g g0 = h0.g0();
        com.fasterxml.jackson.databind.b b1 = h0.o();
        if(b1 == null) {
            a0 = A.k;
            b2 = null;
        }
        else {
            A a1 = A.a(b1.F0(o0), b1.W(o0), b1.b0(o0), b1.V(o0));
            b2 = b1.v0(o0);
            a0 = a1;
        }
        m m0 = this.u0(h0, o0, o0.g());
        com.fasterxml.jackson.databind.d.b d$b0 = new com.fasterxml.jackson.databind.d.b(b0, m0, b2, o0, a0);
        com.fasterxml.jackson.databind.jsontype.f f0 = (com.fasterxml.jackson.databind.jsontype.f)m0.R();
        if(f0 == null) {
            f0 = this.l(g0, m0);
        }
        A a2 = this.W(h0, d$b0, a0);
        y y0 = com.fasterxml.jackson.databind.deser.l.Y(b0, m0, d$b0.d(), f0, c0.z(), o0, v, d$a0, a2);
        n n0 = this.n0(h0, o0);
        if(n0 == null) {
            n0 = (n)m0.S();
        }
        return n0 == null ? y0 : y0.V(h0.r0(n0, y0, m0));
    }

    @Override  // com.fasterxml.jackson.databind.deser.q
    public n h(h h0, com.fasterxml.jackson.databind.type.j j0, com.fasterxml.jackson.databind.c c0) throws com.fasterxml.jackson.databind.o {
        com.fasterxml.jackson.databind.type.j j1;
        n n2;
        com.fasterxml.jackson.databind.deser.B b0;
        com.fasterxml.jackson.databind.c c1;
        g g0 = h0.g0();
        m m0 = j0.N();
        m m1 = j0.E();
        Object object0 = m1.S();
        Object object1 = m0.S();
        com.fasterxml.jackson.databind.jsontype.f f0 = (com.fasterxml.jackson.databind.jsontype.f)m1.R();
        com.fasterxml.jackson.databind.jsontype.f f1 = f0 == null ? this.l(g0, m1) : f0;
        n n0 = this.P(j0, g0, c0, ((s)object1), f1, ((n)object0));
        if(n0 == null) {
            Class class0 = j0.g();
            Class class1 = EnumMap.class;
            Set set0 = null;
            if(class1.isAssignableFrom(class0)) {
                if(class0 == class1) {
                    c1 = c0;
                    b0 = null;
                }
                else {
                    c1 = c0;
                    b0 = this.m(h0, c1);
                }
                if(!m0.W()) {
                    throw new IllegalArgumentException("Cannot construct EnumMap; generic (key) type not available");
                }
                n0 = new com.fasterxml.jackson.databind.deser.std.n(j0, b0, null, ((n)object0), f1, null);
            }
            else {
                c1 = c0;
            }
            if(n0 != null) {
                j1 = j0;
            }
            else if(!j0.isInterface() && !j0.k()) {
                n n1 = com.fasterxml.jackson.databind.deser.impl.l.i(h0, j0);
                if(n1 != null) {
                    return n1;
                }
                n2 = null;
                j1 = j0;
                goto label_40;
            }
            else {
                j1 = this.a0(j0, g0);
                if(j1 == null) {
                    if(j0.R() == null) {
                        throw new IllegalArgumentException("Cannot find a deserializer for non-concrete Map type " + j0);
                    }
                    j1 = j0;
                    n2 = com.fasterxml.jackson.databind.deser.a.C(c0);
                label_40:
                    if(n2 == null) {
                        n2 = new u(j1, this.m(h0, c1), ((s)object1), ((n)object0), f1);
                        com.fasterxml.jackson.databind.introspect.d d0 = c1.A();
                        com.fasterxml.jackson.annotation.s.a s$a0 = g0.D(Map.class, d0);
                        ((u)n2).G1((s$a0 == null ? null : s$a0.h()));
                        com.fasterxml.jackson.annotation.v.a v$a0 = g0.H(Map.class, c1.A());
                        if(v$a0 != null) {
                            set0 = v$a0.f();
                        }
                        ((u)n2).I1(set0);
                    }
                    n0 = n2;
                }
                else {
                    c1 = g0.r1(j1);
                    n2 = null;
                    goto label_40;
                }
            }
        }
        else {
            c1 = c0;
            j1 = j0;
        }
        if(this.b.e()) {
            for(Object object2: this.b.b()) {
                n0 = ((com.fasterxml.jackson.databind.deser.h)object2).g(g0, j1, c1, n0);
            }
        }
        return n0;
    }

    protected k h0(g g0, com.fasterxml.jackson.databind.introspect.d d0) {
        com.fasterxml.jackson.databind.k k0 = com.fasterxml.jackson.databind.introspect.A.a(g0.n().u(g0, d0), g0.c());
        return k0 == null ? null : k.j(g0, d0, k0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.q
    public n i(h h0, i i0, com.fasterxml.jackson.databind.c c0) throws com.fasterxml.jackson.databind.o {
        m m0 = i0.E();
        g g0 = h0.g0();
        Object object0 = m0.S();
        Object object1 = i0.N().S();
        com.fasterxml.jackson.databind.jsontype.f f0 = (com.fasterxml.jackson.databind.jsontype.f)m0.R();
        if(f0 == null) {
            f0 = this.l(g0, m0);
        }
        n n0 = this.Q(i0, g0, c0, ((s)object1), f0, ((n)object0));
        if(n0 != null && this.b.e()) {
            for(Object object2: this.b.b()) {
                n0 = ((com.fasterxml.jackson.databind.deser.h)object2).h(g0, i0, c0, n0);
            }
        }
        return n0;
    }

    @Deprecated
    protected k i0(g g0, Class class0, com.fasterxml.jackson.databind.introspect.d d0) {
        com.fasterxml.jackson.databind.k k0 = com.fasterxml.jackson.databind.introspect.A.a(g0.n().u(g0, d0), g0.c());
        return k0 == null ? null : k.k(g0, class0, k0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.q
    public n j(h h0, com.fasterxml.jackson.databind.type.l l0, com.fasterxml.jackson.databind.c c0) throws com.fasterxml.jackson.databind.o {
        m m0 = l0.E();
        n n0 = (n)m0.S();
        g g0 = h0.g0();
        com.fasterxml.jackson.databind.jsontype.f f0 = (com.fasterxml.jackson.databind.jsontype.f)m0.R();
        if(f0 == null) {
            f0 = this.l(g0, m0);
        }
        n n1 = this.R(l0, g0, c0, f0, n0);
        if(n1 == null) {
            Class class0 = AtomicReference.class;
            if(l0.a0(class0)) {
                return l0.g() == class0 ? new com.fasterxml.jackson.databind.deser.std.e(l0, null, f0, n0) : new com.fasterxml.jackson.databind.deser.std.e(l0, this.m(h0, c0), f0, n0);
            }
        }
        if(n1 != null && this.b.e()) {
            for(Object object0: this.b.b()) {
                n1 = ((com.fasterxml.jackson.databind.deser.h)object0).i(g0, l0, c0, n1);
            }
        }
        return n1;
    }

    protected k j0(Class class0, g g0, com.fasterxml.jackson.databind.c c0) {
        com.fasterxml.jackson.databind.introspect.k k0 = c0.p();
        if(k0 != null) {
            if(g0.c()) {
                com.fasterxml.jackson.databind.util.h.i(k0.o(), g0.a0(com.fasterxml.jackson.databind.t.q));
            }
            return k.n(g0, c0.A(), k0);
        }
        return k.g(g0, c0.A());
    }

    @Override  // com.fasterxml.jackson.databind.deser.q
    public n k(g g0, m m0, com.fasterxml.jackson.databind.c c0) throws com.fasterxml.jackson.databind.o {
        Class class0 = m0.g();
        n n0 = this.S(class0, g0, c0);
        return n0 == null ? com.fasterxml.jackson.databind.deser.std.t.F1(class0) : n0;
    }

    protected n k0(h h0, com.fasterxml.jackson.databind.introspect.b b0) throws com.fasterxml.jackson.databind.o {
        com.fasterxml.jackson.databind.b b1 = h0.o();
        if(b1 != null) {
            Object object0 = b1.i(b0);
            return object0 == null ? null : h0.S(b0, object0);
        }
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.deser.q
    public com.fasterxml.jackson.databind.jsontype.f l(g g0, m m0) throws com.fasterxml.jackson.databind.o {
        com.fasterxml.jackson.databind.introspect.d d0 = g0.W(m0.g()).A();
        com.fasterxml.jackson.databind.jsontype.i i0 = g0.n().r0(g0, d0, m0);
        if(i0 == null) {
            i0 = g0.J(m0);
            if(i0 == null) {
                return null;
            }
        }
        Collection collection0 = g0.Q().e(g0, d0);
        if(i0.k() == null && m0.k()) {
            m m1 = this.o(g0, m0);
            if(m1 != null && !m1.j(m0.g())) {
                i0 = i0.j(m1.g());
            }
        }
        try {
            return i0.c(g0, m0, collection0);
        }
        catch(IllegalArgumentException | IllegalStateException illegalArgumentException0) {
            throw com.fasterxml.jackson.databind.exc.b.H(null, com.fasterxml.jackson.databind.util.h.q(illegalArgumentException0), m0).A(illegalArgumentException0);
        }
    }

    @Override  // com.fasterxml.jackson.databind.deser.q
    public com.fasterxml.jackson.databind.deser.B m(h h0, com.fasterxml.jackson.databind.c c0) throws com.fasterxml.jackson.databind.o {
        g g0 = h0.g0();
        com.fasterxml.jackson.databind.introspect.d d0 = c0.A();
        Object object0 = h0.o().t0(d0);
        com.fasterxml.jackson.databind.deser.B b0 = object0 == null ? null : this.f0(g0, d0, object0);
        if(b0 == null) {
            b0 = com.fasterxml.jackson.databind.deser.impl.k.a(g0, c0.y());
            if(b0 == null) {
                b0 = this.H(h0, c0);
            }
        }
        if(this.b.h()) {
            for(Object object1: this.b.j()) {
                C c1 = (C)object1;
                b0 = c1.a(g0, c0, b0);
                if(b0 == null) {
                    h0.X0(c0, "Broken registered ValueInstantiators (of type %s): returned null ValueInstantiator", new Object[]{c1.getClass().getName()});
                }
            }
        }
        return b0 == null ? null : b0.n(h0, c0);
    }

    public n m0(h h0, m m0, com.fasterxml.jackson.databind.c c0) throws com.fasterxml.jackson.databind.o {
        Class class0 = m0.g();
        if(class0 != b.c && class0 != b.h) {
            if(class0 != b.d && class0 != b.e) {
                Class class1 = b.f;
                if(class0 == class1) {
                    com.fasterxml.jackson.databind.type.q q0 = h0.x();
                    m[] arr_m = q0.n0(m0, class1);
                    if(arr_m != null && arr_m.length == 1) {
                        return this.d(h0, q0.H(Collection.class, arr_m[0]), c0);
                    }
                    m m1 = com.fasterxml.jackson.databind.type.q.v0();
                    return this.d(h0, q0.H(Collection.class, m1), c0);
                }
                if(class0 == b.g) {
                    m m2 = m0.z(0);
                    m m3 = m0.z(1);
                    com.fasterxml.jackson.databind.jsontype.f f0 = (com.fasterxml.jackson.databind.jsontype.f)m3.R();
                    if(f0 == null) {
                        f0 = this.l(h0.g0(), m3);
                    }
                    return new com.fasterxml.jackson.databind.deser.std.v(m0, ((s)m2.S()), ((n)m3.S()), f0);
                }
                String s = class0.getName();
                if(class0.isPrimitive() || s.startsWith("java.")) {
                    n n0 = x.a(class0, s);
                    if(n0 == null) {
                        n0 = com.fasterxml.jackson.databind.deser.std.k.a(class0, s);
                    }
                    if(n0 != null) {
                        return n0;
                    }
                }
                if(class0 == H.class) {
                    return new O();
                }
                n n1 = this.p0(h0, m0, c0);
                return n1 == null ? r.a(h0, class0, s) : n1;
            }
            return com.fasterxml.jackson.databind.deser.std.M.h;
        }
        g g0 = h0.g0();
        return this.b.d() ? new Q(this.V(g0, List.class), this.V(g0, Map.class)) : new Q(null, null);
    }

    @Override  // com.fasterxml.jackson.databind.deser.q
    public boolean n(g g0, Class class0) {
        boolean z;
        while(class0.isArray()) {
            z = true;
            class0 = class0.getComponentType();
        }
        if(Enum.class.isAssignableFrom(class0)) {
            return true;
        }
        String s = class0.getName();
        if(s.startsWith("java.")) {
            if(Collection.class.isAssignableFrom(class0)) {
                return true;
            }
            if(Map.class.isAssignableFrom(class0)) {
                return true;
            }
            if(Number.class.isAssignableFrom(class0)) {
                return x.a(class0, s) == null ? false : z;
            }
            return r.c(class0) || class0 == b.d || class0 == Boolean.class || class0 == EnumMap.class || class0 == AtomicReference.class || com.fasterxml.jackson.databind.deser.std.k.b(class0);
        }
        if(s.startsWith("com.fasterxml.")) {
            return com.fasterxml.jackson.databind.p.class.isAssignableFrom(class0) || class0 == H.class ? z : false;
        }
        return com.fasterxml.jackson.databind.ext.s.m.d(class0);
    }

    protected n n0(h h0, com.fasterxml.jackson.databind.introspect.b b0) throws com.fasterxml.jackson.databind.o {
        com.fasterxml.jackson.databind.b b1 = h0.o();
        if(b1 != null) {
            Object object0 = b1.q(b0);
            return object0 == null ? null : h0.S(b0, object0);
        }
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.deser.q
    public m o(g g0, m m0) throws com.fasterxml.jackson.databind.o {
        m m1;
        while(true) {
            m1 = this.b0(g0, m0);
            if(m1 == null) {
                return m0;
            }
            Class class0 = m0.g();
            Class class1 = m1.g();
            if(class0 == class1 || !class0.isAssignableFrom(class1)) {
                break;
            }
            m0 = m1;
        }
        throw new IllegalArgumentException("Invalid abstract type resolution from " + m0 + " to " + m1 + ": latter is not a subtype of former");
    }

    protected s o0(h h0, com.fasterxml.jackson.databind.introspect.b b0) throws com.fasterxml.jackson.databind.o {
        com.fasterxml.jackson.databind.b b1 = h0.o();
        if(b1 != null) {
            Object object0 = b1.F(b0);
            return object0 == null ? null : h0.K0(b0, object0);
        }
        return null;
    }

    @Override  // com.fasterxml.jackson.databind.deser.q
    public final q p(com.fasterxml.jackson.databind.a a0) {
        return this.w0(this.b.k(a0));
    }

    protected n p0(h h0, m m0, com.fasterxml.jackson.databind.c c0) throws com.fasterxml.jackson.databind.o {
        return com.fasterxml.jackson.databind.ext.s.m.b(m0, h0.g0(), c0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.q
    public final q q(com.fasterxml.jackson.databind.deser.s s0) {
        return this.w0(this.b.l(s0));
    }

    public com.fasterxml.jackson.databind.jsontype.f q0(g g0, m m0, com.fasterxml.jackson.databind.introspect.k k0) throws com.fasterxml.jackson.databind.o {
        com.fasterxml.jackson.databind.jsontype.i i0 = g0.n().U(g0, k0, m0);
        m m1 = m0.E();
        return i0 == null ? this.l(g0, m1) : i0.c(g0, m1, g0.Q().f(g0, k0, m1));
    }

    @Override  // com.fasterxml.jackson.databind.deser.q
    public final q r(com.fasterxml.jackson.databind.deser.t t0) {
        return this.w0(this.b.m(t0));
    }

    public com.fasterxml.jackson.databind.jsontype.f r0(g g0, m m0, com.fasterxml.jackson.databind.introspect.k k0) throws com.fasterxml.jackson.databind.o {
        com.fasterxml.jackson.databind.jsontype.i i0 = g0.n().c0(g0, k0, m0);
        if(i0 == null) {
            return this.l(g0, m0);
        }
        Collection collection0 = g0.Q().f(g0, k0, m0);
        try {
            return i0.c(g0, m0, collection0);
        }
        catch(IllegalArgumentException | IllegalStateException illegalArgumentException0) {
            throw com.fasterxml.jackson.databind.exc.b.H(null, com.fasterxml.jackson.databind.util.h.q(illegalArgumentException0), m0).A(illegalArgumentException0);
        }
    }

    @Override  // com.fasterxml.jackson.databind.deser.q
    public final q s(com.fasterxml.jackson.databind.deser.h h0) {
        return this.w0(this.b.n(h0));
    }

    public o s0() {
        return this.b;
    }

    @Deprecated
    protected m t0(h h0, com.fasterxml.jackson.databind.introspect.b b0, m m0) throws com.fasterxml.jackson.databind.o {
        com.fasterxml.jackson.databind.b b1 = h0.o();
        return b1 == null ? m0 : b1.L0(h0.g0(), b0, m0);
    }

    @Override  // com.fasterxml.jackson.databind.deser.q
    public final q u(C c0) {
        return this.w0(this.b.o(c0));
    }

    protected m u0(h h0, com.fasterxml.jackson.databind.introspect.k k0, m m0) throws com.fasterxml.jackson.databind.o {
        com.fasterxml.jackson.databind.b b0 = h0.o();
        if(b0 == null) {
            return m0;
        }
        if(m0.r() && m0.N() != null) {
            s s0 = h0.K0(k0, b0.F(k0));
            if(s0 != null) {
                m0 = ((i)m0).y0(s0);
                m0.N();
            }
        }
        if(m0.T()) {
            n n0 = h0.S(k0, b0.i(k0));
            if(n0 != null) {
                m0 = m0.h0(n0);
            }
            com.fasterxml.jackson.databind.jsontype.f f0 = this.q0(h0.g0(), m0, k0);
            if(f0 != null) {
                m0 = m0.g0(f0);
            }
        }
        com.fasterxml.jackson.databind.jsontype.f f1 = this.r0(h0.g0(), m0, k0);
        if(f1 != null) {
            m0 = m0.k0(f1);
        }
        return b0.L0(h0.g0(), k0, m0);
    }

    @Deprecated
    protected m v0(h h0, com.fasterxml.jackson.databind.c c0, m m0, com.fasterxml.jackson.databind.introspect.k k0) throws com.fasterxml.jackson.databind.o {
        return this.u0(h0, k0, m0);
    }

    @Deprecated
    protected void w(h h0, com.fasterxml.jackson.databind.c c0, e e0, d d0) throws com.fasterxml.jackson.databind.o {
        this.x(h0, c0, e0, d0, h0.g0().g1());
    }

    protected abstract q w0(o arg1);

    protected void x(h h0, com.fasterxml.jackson.databind.c c0, e e0, d d0, j j0) throws com.fasterxml.jackson.databind.o {
        B b1;
        boolean z;
        if(1 != d0.g()) {
            if(!j0.e()) {
                int v = d0.e();
                if(v >= 0 && (j0.d() || d0.h(v) == null)) {
                    this.z(h0, c0, e0, d0);
                    return;
                }
            }
            this.B(h0, c0, e0, d0);
            return;
        }
        com.fasterxml.jackson.databind.introspect.o o0 = d0.i(0);
        com.fasterxml.jackson.annotation.d.a d$a0 = d0.f(0);
        switch(j0.f()) {
            case 1: {
                b1 = null;
                z = false;
                break;
            }
            case 2: {
                B b2 = d0.h(0);
                if(b2 == null) {
                    this.e0(h0, c0, d0, 0, null, d$a0);
                }
                b1 = b2;
                z = true;
                break;
            }
            case 3: {
                h0.X0(c0, "Single-argument constructor (%s) is annotated but no \'mode\' defined; `CreatorDetector`configured with `SingleArgConstructor.REQUIRE_MODE`", new Object[]{d0.b()});
                return;
            label_14:
                v v1 = d0.j(0);
                B b0 = d0.c(0);
                z = b0 != null;
                if(z || c0.p() != null) {
                    b1 = b0;
                }
                else if(d$a0 != null) {
                    b1 = b0;
                    z = true;
                }
                else {
                    if(v1 != null) {
                        b0 = d0.h(0);
                        z = b0 != null && v1.m();
                    }
                    b1 = b0;
                }
                break;
            }
            default: {
                goto label_14;
            }
        }
        if(z) {
            e0.l(d0.b(), true, new y[]{this.g0(h0, c0, b1, 0, o0, d$a0)});
            return;
        }
        this.X(e0, d0.b(), true, true);
        v v2 = d0.j(0);
        if(v2 != null) {
            ((I)v2).H0();
        }
    }

    protected void y(h h0, c b$c0, boolean z) throws com.fasterxml.jackson.databind.o {
        com.fasterxml.jackson.databind.c c0 = b$c0.b;
        e e0 = b$c0.d;
        com.fasterxml.jackson.databind.b b0 = b$c0.c();
        M m0 = b$c0.c;
        Map map0 = b$c0.e;
        f f0 = c0.i();
        if(f0 != null && (!e0.o() || this.Y(h0, f0))) {
            e0.r(f0);
        }
        for(Object object0: c0.B()) {
            f f1 = (f)object0;
            com.fasterxml.jackson.annotation.k.a k$a0 = b0.k(h0.g0(), f1);
            if(com.fasterxml.jackson.annotation.k.a.d == k$a0) {
            }
            else if(k$a0 != null) {
                switch(k$a0) {
                    case 1: {
                        this.z(h0, c0, e0, d.a(b0, f1, null));
                        break;
                    }
                    case 2: {
                        this.B(h0, c0, e0, d.a(b0, f1, ((v[])map0.get(f1))));
                        break;
                    }
                    default: {
                        this.x(h0, c0, e0, d.a(b0, f1, ((v[])map0.get(f1))), h0.g0().g1());
                    }
                }
                b$c0.j();
            }
            else if(z && m0.c(f1)) {
                b$c0.a(d.a(b0, f1, ((v[])map0.get(f1))));
            }
        }
    }

    protected void z(h h0, com.fasterxml.jackson.databind.c c0, e e0, d d0) throws com.fasterxml.jackson.databind.o {
        int v3;
        int v = d0.g();
        y[] arr_y = new y[v];
        int v2 = -1;
        for(int v1 = 0; v1 < v; v1 = v3 + 1) {
            com.fasterxml.jackson.databind.introspect.o o0 = d0.i(v1);
            com.fasterxml.jackson.annotation.d.a d$a0 = d0.f(v1);
            if(d$a0 == null) {
                v3 = v1;
                if(v2 < 0) {
                    v2 = v3;
                }
                else {
                    h0.X0(c0, "More than one argument (#%d and #%d) left as delegating for Creator %s: only one allowed", new Object[]{v2, v3, d0});
                }
            }
            else {
                v3 = v1;
                arr_y[v3] = this.g0(h0, c0, null, v1, o0, d$a0);
            }
        }
        if(v2 < 0) {
            h0.X0(c0, "No argument left as delegating for Creator %s: exactly one required", new Object[]{d0});
        }
        if(v == 1) {
            this.X(e0, d0.b(), true, true);
            v v4 = d0.j(0);
            if(v4 != null) {
                ((I)v4).H0();
            }
            return;
        }
        e0.h(d0.b(), true, arr_y, v2);
    }
}

