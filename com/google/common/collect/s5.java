package com.google.common.collect;

import J1.c;
import com.google.common.base.H;
import com.google.common.base.z;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;

@c
@C1
public class s5 extends k implements Serializable {
    static class a {
    }

    final class b extends Y1 implements Set {
        final Collection a;

        b(Collection collection0) {
            this.a = collection0;
        }

        @Override  // com.google.common.collect.Y1
        protected Object K() {
            return this.M();
        }

        @Override  // com.google.common.collect.Y1
        protected Collection M() {
            return this.a;
        }

        @Override
        public boolean equals(@o3.a Object object0) {
            return D4.g(this, object0);
        }

        @Override
        public int hashCode() {
            return D4.k(this);
        }
    }

    final class com.google.common.collect.s5.c extends s5 {
        final s5 e;

        com.google.common.collect.s5.c() {
            super(new d(s50.a), null);
        }

        @Override  // com.google.common.collect.s5
        public boolean a(Comparable comparable0) {
            return !s5.this.a(comparable0);
        }

        @Override  // com.google.common.collect.s5
        public void b(h4 h40) {
            s5.this.o(h40);
        }

        @Override  // com.google.common.collect.s5
        public k4 d() {
            return s5.this;
        }

        @Override  // com.google.common.collect.s5
        public void o(h4 h40) {
            s5.this.b(h40);
        }
    }

    static final class d extends j {
        private final NavigableMap a;
        private final NavigableMap b;
        private final h4 c;

        d(NavigableMap navigableMap0) {
            this(navigableMap0, h4.a());
        }

        private d(NavigableMap navigableMap0, h4 h40) {
            this.a = navigableMap0;
            this.b = new e(navigableMap0);
            this.c = h40;
        }

        @Override  // com.google.common.collect.D3$A
        Iterator a() {
            class com.google.common.collect.s5.d.a extends com.google.common.collect.c {
                w1 c;
                final w1 d;
                final e4 e;
                final d f;

                com.google.common.collect.s5.d.a(w1 w10, e4 e40) {
                    this.d = w10;
                    this.e = e40;
                    super();
                    this.c = w10;
                }

                @Override  // com.google.common.collect.c
                @o3.a
                protected Object a() {
                    return this.d();
                }

                @o3.a
                protected Map.Entry d() {
                    h4 h41;
                    if(!d.this.c.b.k(this.c) && this.c != w1.a()) {
                        if(this.e.hasNext()) {
                            h4 h40 = (h4)this.e.next();
                            h41 = h4.k(this.c, h40.a);
                            this.c = h40.b;
                            return D3.O(h41.a, h41);
                        }
                        h41 = h4.k(this.c, w1.a());
                        this.c = w1.a();
                        return D3.O(h41.a, h41);
                    }
                    return (Map.Entry)this.b();
                }
            }

            Collection collection0;
            if(this.c.q()) {
                w1 w10 = (w1)this.c.A();
                boolean z = this.c.z() == y.c;
                collection0 = this.b.tailMap(w10, z).values();
            }
            else {
                collection0 = this.b.values();
            }
            e4 e40 = q3.S(collection0.iterator());
            w1 w11 = w1.c();
            if(this.c.i(w11) && (!e40.hasNext() || ((h4)e40.peek()).a != w1.c())) {
                return new com.google.common.collect.s5.d.a(this, w1.c(), e40);
            }
            return e40.hasNext() ? new com.google.common.collect.s5.d.a(this, ((h4)e40.next()).b, e40) : q3.t();
        }

        @Override  // com.google.common.collect.j
        Iterator b() {
            class com.google.common.collect.s5.d.b extends com.google.common.collect.c {
                w1 c;
                final w1 d;
                final e4 e;
                final d f;

                com.google.common.collect.s5.d.b(w1 w10, e4 e40) {
                    this.d = w10;
                    this.e = e40;
                    super();
                    this.c = w10;
                }

                @Override  // com.google.common.collect.c
                @o3.a
                protected Object a() {
                    return this.d();
                }

                @o3.a
                protected Map.Entry d() {
                    if(this.c == w1.c()) {
                        return (Map.Entry)this.b();
                    }
                    if(this.e.hasNext()) {
                        h4 h40 = (h4)this.e.next();
                        h4 h41 = h4.k(h40.b, this.c);
                        this.c = h40.a;
                        return d.this.c.a.k(h41.a) ? D3.O(h41.a, h41) : ((Map.Entry)this.b());
                    }
                    w1 w10 = w1.c();
                    if(d.this.c.a.k(w10)) {
                        h4 h42 = h4.k(w1.c(), this.c);
                        this.c = w1.c();
                        return D3.O(w1.c(), h42);
                    }
                    return (Map.Entry)this.b();
                }
            }

            w1 w10 = this.c.r() ? ((w1)this.c.M()) : w1.a();
            boolean z = this.c.r() && this.c.L() == y.c;
            e4 e40 = q3.S(this.b.headMap(w10, z).descendingMap().values().iterator());
            if(e40.hasNext()) {
                if(((h4)e40.peek()).b == w1.a()) {
                    return new com.google.common.collect.s5.d.b(this, ((w1)z.a(((h4)e40.next()).a, w1.a())), e40);
                }
                w1 w11 = ((h4)e40.peek()).b;
                return new com.google.common.collect.s5.d.b(this, ((w1)z.a(((w1)this.a.higherKey(w11)), w1.a())), e40);
            }
            w1 w12 = w1.c();
            if(this.c.i(w12)) {
                w1 w13 = w1.c();
                if(!this.a.containsKey(w13)) {
                    w1 w14 = w1.c();
                    return new com.google.common.collect.s5.d.b(this, ((w1)z.a(((w1)this.a.higherKey(w14)), w1.a())), e40);
                }
            }
            return q3.t();
        }

        @Override
        public Comparator comparator() {
            return c4.K();
        }

        @Override
        public boolean containsKey(@o3.a Object object0) {
            return this.d(object0) != null;
        }

        @o3.a
        public h4 d(@o3.a Object object0) {
            if(object0 instanceof w1) {
                try {
                    Map.Entry map$Entry0 = this.h(((w1)object0), true).firstEntry();
                    return map$Entry0 == null || !((w1)map$Entry0.getKey()).equals(((w1)object0)) ? null : ((h4)map$Entry0.getValue());
                }
                catch(ClassCastException unused_ex) {
                }
            }
            return null;
        }

        public NavigableMap e(w1 w10, boolean z) {
            return this.g(h4.J(w10, y.b(z)));
        }

        public NavigableMap f(w1 w10, boolean z, w1 w11, boolean z1) {
            return this.g(h4.D(w10, y.b(z), w11, y.b(z1)));
        }

        private NavigableMap g(h4 h40) {
            if(!this.c.u(h40)) {
                return d3.q0();
            }
            h4 h41 = h40.s(this.c);
            return new d(this.a, h41);
        }

        @Override  // com.google.common.collect.j
        @o3.a
        public Object get(@o3.a Object object0) {
            return this.d(object0);
        }

        public NavigableMap h(w1 w10, boolean z) {
            return this.g(h4.l(w10, y.b(z)));
        }

        @Override
        public NavigableMap headMap(Object object0, boolean z) {
            return this.e(((w1)object0), z);
        }

        @Override  // com.google.common.collect.D3$A
        public int size() {
            return q3.Y(this.a());
        }

        @Override
        public NavigableMap subMap(Object object0, boolean z, Object object1, boolean z1) {
            return this.f(((w1)object0), z, ((w1)object1), z1);
        }

        @Override
        public NavigableMap tailMap(Object object0, boolean z) {
            return this.h(((w1)object0), z);
        }
    }

    @J1.e
    static final class e extends j {
        private final NavigableMap a;
        private final h4 b;

        e(NavigableMap navigableMap0) {
            this.a = navigableMap0;
            this.b = h4.a();
        }

        private e(NavigableMap navigableMap0, h4 h40) {
            this.a = navigableMap0;
            this.b = h40;
        }

        @Override  // com.google.common.collect.D3$A
        Iterator a() {
            class com.google.common.collect.s5.e.a extends com.google.common.collect.c {
                final Iterator c;
                final e d;

                com.google.common.collect.s5.e.a(Iterator iterator0) {
                    this.c = iterator0;
                    super();
                }

                @Override  // com.google.common.collect.c
                @o3.a
                protected Object a() {
                    return this.d();
                }

                @o3.a
                protected Map.Entry d() {
                    if(!this.c.hasNext()) {
                        return (Map.Entry)this.b();
                    }
                    Object object0 = this.c.next();
                    return e.this.b.b.k(((h4)object0).b) ? ((Map.Entry)this.b()) : D3.O(((h4)object0).b, ((h4)object0));
                }
            }

            if(!this.b.q()) {
                return new com.google.common.collect.s5.e.a(this, this.a.values().iterator());
            }
            w1 w10 = (w1)this.b.A();
            Map.Entry map$Entry0 = this.a.lowerEntry(w10);
            if(map$Entry0 == null) {
                return new com.google.common.collect.s5.e.a(this, this.a.values().iterator());
            }
            w1 w11 = ((h4)map$Entry0.getValue()).b;
            if(this.b.a.k(w11)) {
                w1 w12 = (w1)map$Entry0.getKey();
                return new com.google.common.collect.s5.e.a(this, this.a.tailMap(w12, true).values().iterator());
            }
            w1 w13 = (w1)this.b.A();
            return new com.google.common.collect.s5.e.a(this, this.a.tailMap(w13, true).values().iterator());
        }

        @Override  // com.google.common.collect.j
        Iterator b() {
            class com.google.common.collect.s5.e.b extends com.google.common.collect.c {
                final e4 c;
                final e d;

                com.google.common.collect.s5.e.b(e4 e40) {
                    this.c = e40;
                    super();
                }

                @Override  // com.google.common.collect.c
                @o3.a
                protected Object a() {
                    return this.d();
                }

                @o3.a
                protected Map.Entry d() {
                    if(!this.c.hasNext()) {
                        return (Map.Entry)this.b();
                    }
                    h4 h40 = (h4)this.c.next();
                    return e.this.b.a.k(h40.b) ? D3.O(h40.b, h40) : ((Map.Entry)this.b());
                }
            }

            Collection collection0;
            if(this.b.r()) {
                w1 w10 = (w1)this.b.M();
                collection0 = this.a.headMap(w10, false).descendingMap().values();
            }
            else {
                collection0 = this.a.descendingMap().values();
            }
            e4 e40 = q3.S(collection0.iterator());
            if(e40.hasNext()) {
                w1 w11 = ((h4)e40.peek()).b;
                if(this.b.b.k(w11)) {
                    e40.next();
                }
            }
            return new com.google.common.collect.s5.e.b(this, e40);
        }

        @Override
        public Comparator comparator() {
            return c4.K();
        }

        @Override
        public boolean containsKey(@o3.a Object object0) {
            return this.d(object0) != null;
        }

        @o3.a
        public h4 d(@o3.a Object object0) {
            if(object0 instanceof w1) {
                try {
                    if(this.b.i(((w1)object0))) {
                        Map.Entry map$Entry0 = this.a.lowerEntry(((w1)object0));
                        return map$Entry0 == null || !((h4)map$Entry0.getValue()).b.equals(((w1)object0)) ? null : ((h4)map$Entry0.getValue());
                    }
                    return null;
                }
                catch(ClassCastException unused_ex) {
                }
                return null;
            }
            return null;
        }

        public NavigableMap e(w1 w10, boolean z) {
            return this.g(h4.J(w10, y.b(z)));
        }

        public NavigableMap f(w1 w10, boolean z, w1 w11, boolean z1) {
            return this.g(h4.D(w10, y.b(z), w11, y.b(z1)));
        }

        private NavigableMap g(h4 h40) {
            if(h40.u(this.b)) {
                h4 h41 = h40.s(this.b);
                return new e(this.a, h41);
            }
            return d3.q0();
        }

        @Override  // com.google.common.collect.j
        @o3.a
        public Object get(@o3.a Object object0) {
            return this.d(object0);
        }

        public NavigableMap h(w1 w10, boolean z) {
            return this.g(h4.l(w10, y.b(z)));
        }

        @Override
        public NavigableMap headMap(Object object0, boolean z) {
            return this.e(((w1)object0), z);
        }

        // 去混淆评级： 低(30)
        @Override
        public boolean isEmpty() {
            return this.b.equals(h4.a()) ? this.a.isEmpty() : !this.a().hasNext();
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.common.collect.D3$A
        public int size() {
            return this.b.equals(h4.a()) ? this.a.size() : q3.Y(this.a());
        }

        @Override
        public NavigableMap subMap(Object object0, boolean z, Object object1, boolean z1) {
            return this.f(((w1)object0), z, ((w1)object1), z1);
        }

        @Override
        public NavigableMap tailMap(Object object0, boolean z) {
            return this.h(((w1)object0), z);
        }
    }

    final class f extends s5 {
        private final h4 e;
        final s5 f;

        f(h4 h40) {
            super(new g(h4.a(), h40, s50.a, null), null);
            this.e = h40;
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.common.collect.s5
        public boolean a(Comparable comparable0) {
            return this.e.i(comparable0) && s5.this.a(comparable0);
        }

        @Override  // com.google.common.collect.s5
        public void b(h4 h40) {
            if(h40.u(this.e)) {
                h4 h41 = h40.s(this.e);
                s5.this.b(h41);
            }
        }

        @Override  // com.google.common.collect.s5
        public void clear() {
            s5.this.b(this.e);
        }

        @Override  // com.google.common.collect.s5
        @o3.a
        public h4 h(Comparable comparable0) {
            if(!this.e.i(comparable0)) {
                return null;
            }
            h4 h40 = s5.this.h(comparable0);
            return h40 == null ? null : h40.s(this.e);
        }

        @Override  // com.google.common.collect.s5
        public boolean i(h4 h40) {
            if(!this.e.w() && this.e.n(h40)) {
                h4 h41 = s5.this.x(h40);
                return h41 != null && !h41.s(this.e).w();
            }
            return false;
        }

        @Override  // com.google.common.collect.s5
        public k4 k(h4 h40) {
            if(h40.n(this.e)) {
                return this;
            }
            return h40.u(this.e) ? new f(this, this.e.s(h40)) : Z2.G();
        }

        @Override  // com.google.common.collect.s5
        public void o(h4 h40) {
            H.y(this.e.n(h40), "Cannot add range %s to subRangeSet(%s)", h40, this.e);
            s5.this.o(h40);
        }
    }

    static final class g extends j {
        private final h4 a;
        private final h4 b;
        private final NavigableMap c;
        private final NavigableMap d;

        private g(h4 h40, h4 h41, NavigableMap navigableMap0) {
            this.a = (h4)H.E(h40);
            this.b = (h4)H.E(h41);
            this.c = (NavigableMap)H.E(navigableMap0);
            this.d = new e(navigableMap0);
        }

        g(h4 h40, h4 h41, NavigableMap navigableMap0, a s5$a0) {
            this(h40, h41, navigableMap0);
        }

        @Override  // com.google.common.collect.D3$A
        Iterator a() {
            class com.google.common.collect.s5.g.a extends com.google.common.collect.c {
                final Iterator c;
                final w1 d;
                final g e;

                com.google.common.collect.s5.g.a(Iterator iterator0, w1 w10) {
                    this.c = iterator0;
                    this.d = w10;
                    super();
                }

                @Override  // com.google.common.collect.c
                @o3.a
                protected Object a() {
                    return this.d();
                }

                @o3.a
                protected Map.Entry d() {
                    if(!this.c.hasNext()) {
                        return (Map.Entry)this.b();
                    }
                    Object object0 = this.c.next();
                    if(this.d.k(((h4)object0).a)) {
                        return (Map.Entry)this.b();
                    }
                    h4 h40 = ((h4)object0).s(g.this.b);
                    return D3.O(h40.a, h40);
                }
            }

            Iterator iterator0;
            boolean z = false;
            if(this.b.w()) {
                return q3.t();
            }
            if(this.a.b.k(this.b.a)) {
                return q3.t();
            }
            if(this.a.a.k(this.b.a)) {
                iterator0 = this.d.tailMap(this.b.a, false).values().iterator();
            }
            else {
                NavigableMap navigableMap0 = this.c;
                w1 w10 = (w1)this.a.a.i();
                if(this.a.z() == y.c) {
                    z = true;
                }
                iterator0 = navigableMap0.tailMap(w10, z).values().iterator();
            }
            w1 w11 = w1.d(this.b.b);
            return new com.google.common.collect.s5.g.a(this, iterator0, ((w1)c4.K().H(this.a.b, w11)));
        }

        @Override  // com.google.common.collect.j
        Iterator b() {
            class com.google.common.collect.s5.g.b extends com.google.common.collect.c {
                final Iterator c;
                final g d;

                com.google.common.collect.s5.g.b(Iterator iterator0) {
                    this.c = iterator0;
                    super();
                }

                @Override  // com.google.common.collect.c
                @o3.a
                protected Object a() {
                    return this.d();
                }

                @o3.a
                protected Map.Entry d() {
                    if(!this.c.hasNext()) {
                        return (Map.Entry)this.b();
                    }
                    Object object0 = this.c.next();
                    if(g.this.b.a.f(((h4)object0).b) >= 0) {
                        return (Map.Entry)this.b();
                    }
                    h4 h40 = ((h4)object0).s(g.this.b);
                    return g.this.a.i(h40.a) ? D3.O(h40.a, h40) : ((Map.Entry)this.b());
                }
            }

            if(this.b.w()) {
                return q3.t();
            }
            w1 w10 = w1.d(this.b.b);
            w1 w11 = (w1)c4.K().H(this.a.b, w10);
            w1 w12 = (w1)w11.i();
            return w11.n() == y.c ? new com.google.common.collect.s5.g.b(this, this.c.headMap(w12, true).descendingMap().values().iterator()) : new com.google.common.collect.s5.g.b(this, this.c.headMap(w12, false).descendingMap().values().iterator());
        }

        @Override
        public Comparator comparator() {
            return c4.K();
        }

        @Override
        public boolean containsKey(@o3.a Object object0) {
            return this.e(object0) != null;
        }

        @o3.a
        public h4 e(@o3.a Object object0) {
            if(object0 instanceof w1) {
                try {
                    if(this.a.i(((w1)object0)) && ((w1)object0).f(this.b.a) >= 0 && ((w1)object0).f(this.b.b) < 0) {
                        if(((w1)object0).equals(this.b.a)) {
                            h4 h40 = (h4)D3.S0(this.c.floorEntry(((w1)object0)));
                            return h40 == null || h40.b.f(this.b.a) <= 0 ? null : h40.s(this.b);
                        }
                        h4 h41 = (h4)this.c.get(((w1)object0));
                        return h41 == null ? null : h41.s(this.b);
                    }
                    return null;
                }
                catch(ClassCastException unused_ex) {
                }
            }
            return null;
        }

        public NavigableMap f(w1 w10, boolean z) {
            return this.h(h4.J(w10, y.b(z)));
        }

        public NavigableMap g(w1 w10, boolean z, w1 w11, boolean z1) {
            return this.h(h4.D(w10, y.b(z), w11, y.b(z1)));
        }

        @Override  // com.google.common.collect.j
        @o3.a
        public Object get(@o3.a Object object0) {
            return this.e(object0);
        }

        private NavigableMap h(h4 h40) {
            return !h40.u(this.a) ? d3.q0() : new g(this.a.s(h40), this.b, this.c);
        }

        @Override
        public NavigableMap headMap(Object object0, boolean z) {
            return this.f(((w1)object0), z);
        }

        public NavigableMap i(w1 w10, boolean z) {
            return this.h(h4.l(w10, y.b(z)));
        }

        @Override  // com.google.common.collect.D3$A
        public int size() {
            return q3.Y(this.a());
        }

        @Override
        public NavigableMap subMap(Object object0, boolean z, Object object1, boolean z1) {
            return this.g(((w1)object0), z, ((w1)object1), z1);
        }

        @Override
        public NavigableMap tailMap(Object object0, boolean z) {
            return this.i(((w1)object0), z);
        }
    }

    @J1.e
    final NavigableMap a;
    @P1.b
    @o3.a
    private transient Set b;
    @P1.b
    @o3.a
    private transient Set c;
    @P1.b
    @o3.a
    private transient k4 d;

    private s5(NavigableMap navigableMap0) {
        this.a = navigableMap0;
    }

    s5(NavigableMap navigableMap0, a s5$a0) {
        this(navigableMap0);
    }

    @Override  // com.google.common.collect.k
    public boolean a(Comparable comparable0) {
        return super.a(comparable0);
    }

    @Override  // com.google.common.collect.k
    public void b(h4 h40) {
        H.E(h40);
        if(h40.w()) {
            return;
        }
        Map.Entry map$Entry0 = this.a.lowerEntry(h40.a);
        if(map$Entry0 != null) {
            h4 h41 = (h4)map$Entry0.getValue();
            if(h41.b.f(h40.a) >= 0) {
                if(h40.r() && h41.b.f(h40.b) >= 0) {
                    this.y(h4.k(h40.b, h41.b));
                }
                this.y(h4.k(h41.a, h40.a));
            }
        }
        Map.Entry map$Entry1 = this.a.floorEntry(h40.b);
        if(map$Entry1 != null) {
            h4 h42 = (h4)map$Entry1.getValue();
            if(h40.r() && h42.b.f(h40.b) >= 0) {
                this.y(h4.k(h40.b, h42.b));
            }
        }
        this.a.subMap(h40.a, h40.b).clear();
    }

    @Override  // com.google.common.collect.k4
    public h4 c() {
        Map.Entry map$Entry0 = this.a.firstEntry();
        Map.Entry map$Entry1 = this.a.lastEntry();
        if(map$Entry0 == null || map$Entry1 == null) {
            throw new NoSuchElementException();
        }
        return h4.k(((h4)map$Entry0.getValue()).a, ((h4)map$Entry1.getValue()).b);
    }

    @Override  // com.google.common.collect.k
    public void clear() {
        super.clear();
    }

    @Override  // com.google.common.collect.k4
    public k4 d() {
        k4 k40 = this.d;
        if(k40 == null) {
            k40 = new com.google.common.collect.s5.c(this);
            this.d = k40;
        }
        return k40;
    }

    @Override  // com.google.common.collect.k
    public boolean e(h4 h40) {
        H.E(h40);
        Map.Entry map$Entry0 = this.a.ceilingEntry(h40.a);
        if(map$Entry0 != null && ((h4)map$Entry0.getValue()).u(h40) && !((h4)map$Entry0.getValue()).s(h40).w()) {
            return true;
        }
        Map.Entry map$Entry1 = this.a.lowerEntry(h40.a);
        return map$Entry1 != null && ((h4)map$Entry1.getValue()).u(h40) && !((h4)map$Entry1.getValue()).s(h40).w();
    }

    @Override  // com.google.common.collect.k
    public boolean equals(@o3.a Object object0) {
        return super.equals(object0);
    }

    @Override  // com.google.common.collect.k
    public void f(Iterable iterable0) {
        super.f(iterable0);
    }

    @Override  // com.google.common.collect.k
    public boolean g(k4 k40) {
        return super.g(k40);
    }

    @Override  // com.google.common.collect.k
    @o3.a
    public h4 h(Comparable comparable0) {
        H.E(comparable0);
        w1 w10 = w1.d(comparable0);
        Map.Entry map$Entry0 = this.a.floorEntry(w10);
        return map$Entry0 == null || !((h4)map$Entry0.getValue()).i(comparable0) ? null : ((h4)map$Entry0.getValue());
    }

    @Override  // com.google.common.collect.k
    public boolean i(h4 h40) {
        H.E(h40);
        Map.Entry map$Entry0 = this.a.floorEntry(h40.a);
        return map$Entry0 != null && ((h4)map$Entry0.getValue()).n(h40);
    }

    @Override  // com.google.common.collect.k
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override  // com.google.common.collect.k
    public boolean j(Iterable iterable0) {
        return super.j(iterable0);
    }

    @Override  // com.google.common.collect.k4
    public k4 k(h4 h40) {
        return h40.equals(h4.a()) ? this : new f(this, h40);
    }

    @Override  // com.google.common.collect.k4
    public Set l() {
        Set set0 = this.c;
        if(set0 == null) {
            set0 = new b(this, this.a.descendingMap().values());
            this.c = set0;
        }
        return set0;
    }

    @Override  // com.google.common.collect.k4
    public Set m() {
        Set set0 = this.b;
        if(set0 == null) {
            set0 = new b(this, this.a.values());
            this.b = set0;
        }
        return set0;
    }

    @Override  // com.google.common.collect.k
    public void n(k4 k40) {
        super.n(k40);
    }

    @Override  // com.google.common.collect.k
    public void o(h4 h40) {
        H.E(h40);
        if(h40.w()) {
            return;
        }
        w1 w10 = h40.a;
        w1 w11 = h40.b;
        Map.Entry map$Entry0 = this.a.lowerEntry(w10);
        if(map$Entry0 != null) {
            h4 h41 = (h4)map$Entry0.getValue();
            if(h41.b.f(w10) >= 0) {
                if(h41.b.f(w11) >= 0) {
                    w11 = h41.b;
                }
                w10 = h41.a;
            }
        }
        Map.Entry map$Entry1 = this.a.floorEntry(w11);
        if(map$Entry1 != null) {
            h4 h42 = (h4)map$Entry1.getValue();
            if(h42.b.f(w11) >= 0) {
                w11 = h42.b;
            }
        }
        this.a.subMap(w10, w11).clear();
        this.y(h4.k(w10, w11));
    }

    @Override  // com.google.common.collect.k
    public void p(Iterable iterable0) {
        super.p(iterable0);
    }

    @Override  // com.google.common.collect.k
    public void q(k4 k40) {
        super.q(k40);
    }

    public static s5 s() {
        return new s5(new TreeMap());
    }

    public static s5 u(k4 k40) {
        s5 s50 = s5.s();
        s50.q(k40);
        return s50;
    }

    public static s5 w(Iterable iterable0) {
        s5 s50 = s5.s();
        s50.p(iterable0);
        return s50;
    }

    @o3.a
    private h4 x(h4 h40) {
        H.E(h40);
        Map.Entry map$Entry0 = this.a.floorEntry(h40.a);
        return map$Entry0 == null || !((h4)map$Entry0.getValue()).n(h40) ? null : ((h4)map$Entry0.getValue());
    }

    private void y(h4 h40) {
        if(h40.w()) {
            this.a.remove(h40.a);
            return;
        }
        this.a.put(h40.a, h40);
    }
}

