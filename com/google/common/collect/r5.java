package com.google.common.collect;

import J1.c;
import com.google.common.base.H;
import com.google.common.base.I;
import com.google.common.base.J;
import com.google.common.base.z;
import j..util.Objects;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Set;

@c
@C1
public final class r5 implements j4 {
    class a implements j4 {
        a() {
            super();
        }

        @Override  // com.google.common.collect.j4
        public void b(h4 h40) {
            H.E(h40);
        }

        @Override  // com.google.common.collect.j4
        public h4 c() {
            throw new NoSuchElementException();
        }

        @Override  // com.google.common.collect.j4
        public void clear() {
        }

        @Override  // com.google.common.collect.j4
        public j4 d(h4 h40) {
            H.E(h40);
            return this;
        }

        @Override  // com.google.common.collect.j4
        public Map e() {
            return Collections.emptyMap();
        }

        @Override  // com.google.common.collect.j4
        @o3.a
        public Map.Entry f(Comparable comparable0) {
            return null;
        }

        @Override  // com.google.common.collect.j4
        public Map g() {
            return Collections.emptyMap();
        }

        @Override  // com.google.common.collect.j4
        public void h(j4 j40) {
            if(!j40.e().isEmpty()) {
                throw new IllegalArgumentException("Cannot putAll(nonEmptyRangeMap) into an empty subRangeMap");
            }
        }

        @Override  // com.google.common.collect.j4
        public void i(h4 h40, Object object0) {
            H.E(h40);
            throw new IllegalArgumentException("Cannot insert range " + h40 + " into an empty subRangeMap");
        }

        @Override  // com.google.common.collect.j4
        @o3.a
        public Object j(Comparable comparable0) {
            return null;
        }

        @Override  // com.google.common.collect.j4
        public void k(h4 h40, Object object0) {
            H.E(h40);
            throw new IllegalArgumentException("Cannot insert range " + h40 + " into an empty subRangeMap");
        }
    }

    final class b extends A {
        final Iterable a;
        final r5 b;

        b(Iterable iterable0) {
            this.a = iterable0;
        }

        @Override  // com.google.common.collect.D3$A
        Iterator a() {
            return this.a.iterator();
        }

        @Override
        public boolean containsKey(@o3.a Object object0) {
            return this.get(object0) != null;
        }

        @Override
        @o3.a
        public Object get(@o3.a Object object0) {
            if(object0 instanceof h4) {
                com.google.common.collect.r5.c r5$c0 = (com.google.common.collect.r5.c)r5.this.a.get(((h4)object0).a);
                return r5$c0 == null || !r5$c0.f().equals(((h4)object0)) ? null : r5$c0.getValue();
            }
            return null;
        }

        @Override  // com.google.common.collect.D3$A
        public int size() {
            return r5.this.a.size();
        }
    }

    static final class com.google.common.collect.r5.c extends g {
        private final h4 a;
        private final Object b;

        com.google.common.collect.r5.c(h4 h40, Object object0) {
            this.a = h40;
            this.b = object0;
        }

        com.google.common.collect.r5.c(w1 w10, w1 w11, Object object0) {
            this(h4.k(w10, w11), object0);
        }

        public boolean e(Comparable comparable0) {
            return this.a.i(comparable0);
        }

        public h4 f() {
            return this.a;
        }

        w1 g() {
            return this.a.a;
        }

        @Override  // com.google.common.collect.g
        public Object getKey() {
            return this.f();
        }

        @Override  // com.google.common.collect.g
        public Object getValue() {
            return this.b;
        }

        w1 h() {
            return this.a.b;
        }
    }

    class d implements j4 {
        class com.google.common.collect.r5.d.b extends AbstractMap {
            final d a;

            Iterator b() {
                class com.google.common.collect.r5.d.b.c extends com.google.common.collect.c {
                    final Iterator c;
                    final com.google.common.collect.r5.d.b d;

                    com.google.common.collect.r5.d.b.c(Iterator iterator0) {
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
                        while(this.c.hasNext()) {
                            Object object0 = this.c.next();
                            com.google.common.collect.r5.c r5$c0 = (com.google.common.collect.r5.c)object0;
                            if(r5$c0.g().f(d.this.a.b) >= 0) {
                                return (Map.Entry)this.b();
                            }
                            if(r5$c0.h().f(d.this.a.a) > 0) {
                                return D3.O(r5$c0.f().s(d.this.a), r5$c0.getValue());
                            }
                            if(false) {
                                break;
                            }
                        }
                        return (Map.Entry)this.b();
                    }
                }

                if(d.this.a.w()) {
                    return q3.t();
                }
                w1 w10 = (w1)z.a(((w1)r5.this.a.floorKey(d.this.a.a)), d.this.a.a);
                return new com.google.common.collect.r5.d.b.c(this, r5.this.a.tailMap(w10, true).values().iterator());
            }

            private boolean c(I i0) {
                ArrayList arrayList0 = z3.q();
                for(Object object0: this.entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object0;
                    if(i0.apply(map$Entry0)) {
                        arrayList0.add(((h4)map$Entry0.getKey()));
                    }
                }
                for(Object object1: arrayList0) {
                    r5.this.b(((h4)object1));
                }
                return !arrayList0.isEmpty();
            }

            @Override
            public void clear() {
                d.this.clear();
            }

            @Override
            public boolean containsKey(@o3.a Object object0) {
                return this.get(object0) != null;
            }

            @Override
            public Set entrySet() {
                class com.google.common.collect.r5.d.b.b extends s {
                    final com.google.common.collect.r5.d.b a;

                    @Override  // com.google.common.collect.D3$s
                    Map g() {
                        return com.google.common.collect.r5.d.b.this;
                    }

                    @Override  // com.google.common.collect.D3$s
                    public boolean isEmpty() {
                        return !this.iterator().hasNext();
                    }

                    @Override
                    public Iterator iterator() {
                        return com.google.common.collect.r5.d.b.this.b();
                    }

                    @Override  // com.google.common.collect.D3$s
                    public boolean retainAll(Collection collection0) {
                        I i0 = J.q(J.n(collection0));
                        return com.google.common.collect.r5.d.b.this.c(i0);
                    }

                    @Override  // com.google.common.collect.D3$s
                    public int size() {
                        return q3.Y(this.iterator());
                    }
                }

                return new com.google.common.collect.r5.d.b.b(this);
            }

            @Override
            @o3.a
            public Object get(@o3.a Object object0) {
                com.google.common.collect.r5.c r5$c0;
                try {
                    if(object0 instanceof h4 && d.this.a.n(((h4)object0)) && !((h4)object0).w()) {
                        if(((h4)object0).a.f(d.this.a.a) == 0) {
                            Map.Entry map$Entry0 = r5.this.a.floorEntry(((h4)object0).a);
                            r5$c0 = map$Entry0 == null ? null : ((com.google.common.collect.r5.c)map$Entry0.getValue());
                        }
                        else {
                            r5$c0 = (com.google.common.collect.r5.c)r5.this.a.get(((h4)object0).a);
                        }
                        return r5$c0 == null || !r5$c0.f().u(d.this.a) || !r5$c0.f().s(d.this.a).equals(((h4)object0)) ? null : r5$c0.getValue();
                    }
                }
                catch(ClassCastException unused_ex) {
                }
                return null;
            }

            @Override
            public Set keySet() {
                class com.google.common.collect.r5.d.b.a extends B {
                    final com.google.common.collect.r5.d.b b;

                    com.google.common.collect.r5.d.b.a(Map map0) {
                        super(map0);
                    }

                    @Override  // com.google.common.collect.D3$B
                    public boolean remove(@o3.a Object object0) {
                        return com.google.common.collect.r5.d.b.this.remove(object0) != null;
                    }

                    @Override  // com.google.common.collect.D4$k
                    public boolean retainAll(Collection collection0) {
                        I i0 = J.h(J.q(J.n(collection0)), D3.R());
                        return com.google.common.collect.r5.d.b.this.c(i0);
                    }
                }

                return new com.google.common.collect.r5.d.b.a(this, this);
            }

            @Override
            @o3.a
            public Object remove(@o3.a Object object0) {
                Object object1 = this.get(object0);
                if(object1 != null) {
                    Objects.requireNonNull(object0);
                    r5.this.b(((h4)object0));
                    return object1;
                }
                return null;
            }

            @Override
            public Collection values() {
                class com.google.common.collect.r5.d.b.d extends Q {
                    final com.google.common.collect.r5.d.b b;

                    com.google.common.collect.r5.d.b.d(Map map0) {
                        super(map0);
                    }

                    @Override  // com.google.common.collect.D3$Q
                    public boolean removeAll(Collection collection0) {
                        I i0 = J.h(J.n(collection0), D3.Q0());
                        return com.google.common.collect.r5.d.b.this.c(i0);
                    }

                    @Override  // com.google.common.collect.D3$Q
                    public boolean retainAll(Collection collection0) {
                        I i0 = J.h(J.q(J.n(collection0)), D3.Q0());
                        return com.google.common.collect.r5.d.b.this.c(i0);
                    }
                }

                return new com.google.common.collect.r5.d.b.d(this, this);
            }
        }

        private final h4 a;
        final r5 b;

        d(h4 h40) {
            this.a = h40;
        }

        @Override  // com.google.common.collect.j4
        public void b(h4 h40) {
            if(h40.u(this.a)) {
                h4 h41 = h40.s(this.a);
                r5.this.b(h41);
            }
        }

        @Override  // com.google.common.collect.j4
        public h4 c() {
            w1 w10;
            Map.Entry map$Entry0 = r5.this.a.floorEntry(this.a.a);
            if(map$Entry0 != null && ((com.google.common.collect.r5.c)map$Entry0.getValue()).h().f(this.a.a) > 0) {
                w10 = this.a.a;
            }
            else {
                w10 = (w1)r5.this.a.ceilingKey(this.a.a);
                if(w10 == null || w10.f(this.a.b) >= 0) {
                    throw new NoSuchElementException();
                }
            }
            Map.Entry map$Entry1 = r5.this.a.lowerEntry(this.a.b);
            if(map$Entry1 == null) {
                throw new NoSuchElementException();
            }
            return ((com.google.common.collect.r5.c)map$Entry1.getValue()).h().f(this.a.b) < 0 ? h4.k(w10, ((com.google.common.collect.r5.c)map$Entry1.getValue()).h()) : h4.k(w10, this.a.b);
        }

        @Override  // com.google.common.collect.j4
        public void clear() {
            r5.this.b(this.a);
        }

        @Override  // com.google.common.collect.j4
        public j4 d(h4 h40) {
            if(!h40.u(this.a)) {
                return r5.this.q();
            }
            h4 h41 = h40.s(this.a);
            return r5.this.d(h41);
        }

        @Override  // com.google.common.collect.j4
        public Map e() {
            return new com.google.common.collect.r5.d.b(this);
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.common.collect.j4
        public boolean equals(@o3.a Object object0) {
            return object0 instanceof j4 ? this.e().equals(((j4)object0).e()) : false;
        }

        @Override  // com.google.common.collect.j4
        @o3.a
        public Map.Entry f(Comparable comparable0) {
            if(this.a.i(comparable0)) {
                Map.Entry map$Entry0 = r5.this.f(comparable0);
                return map$Entry0 == null ? null : D3.O(((h4)map$Entry0.getKey()).s(this.a), map$Entry0.getValue());
            }
            return null;
        }

        @Override  // com.google.common.collect.j4
        public Map g() {
            class com.google.common.collect.r5.d.a extends com.google.common.collect.r5.d.b {
                final d b;

                @Override  // com.google.common.collect.r5$d$b
                Iterator b() {
                    class com.google.common.collect.r5.d.a.a extends com.google.common.collect.c {
                        final Iterator c;
                        final com.google.common.collect.r5.d.a d;

                        com.google.common.collect.r5.d.a.a(Iterator iterator0) {
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
                            if(this.c.hasNext()) {
                                Object object0 = this.c.next();
                                return ((com.google.common.collect.r5.c)object0).h().f(d.this.a.a) > 0 ? D3.O(((com.google.common.collect.r5.c)object0).f().s(d.this.a), ((com.google.common.collect.r5.c)object0).getValue()) : ((Map.Entry)this.b());
                            }
                            return (Map.Entry)this.b();
                        }
                    }

                    return d.this.a.w() ? q3.t() : new com.google.common.collect.r5.d.a.a(this, r5.this.a.headMap(d.this.a.b, false).descendingMap().values().iterator());
                }
            }

            return new com.google.common.collect.r5.d.a(this);
        }

        @Override  // com.google.common.collect.j4
        public void h(j4 j40) {
            if(j40.e().isEmpty()) {
                return;
            }
            h4 h40 = j40.c();
            H.y(this.a.n(h40), "Cannot putAll rangeMap with span %s into a subRangeMap(%s)", h40, this.a);
            r5.this.h(j40);
        }

        @Override  // com.google.common.collect.j4
        public int hashCode() {
            return this.e().hashCode();
        }

        @Override  // com.google.common.collect.j4
        public void i(h4 h40, Object object0) {
            if(!r5.this.a.isEmpty() && this.a.n(h40)) {
                Object object1 = H.E(object0);
                this.k(r5.this.o(h40, object1).s(this.a), object0);
                return;
            }
            this.k(h40, object0);
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.common.collect.j4
        @o3.a
        public Object j(Comparable comparable0) {
            return this.a.i(comparable0) ? r5.this.j(comparable0) : null;
        }

        @Override  // com.google.common.collect.j4
        public void k(h4 h40, Object object0) {
            H.y(this.a.n(h40), "Cannot put range %s into a subRangeMap(%s)", h40, this.a);
            r5.this.k(h40, object0);
        }

        @Override  // com.google.common.collect.j4
        public String toString() {
            return this.e().toString();
        }
    }

    private final NavigableMap a;
    private static final j4 b;

    static {
        r5.b = new a();
    }

    private r5() {
        this.a = D3.f0();
    }

    @Override  // com.google.common.collect.j4
    public void b(h4 h40) {
        if(h40.w()) {
            return;
        }
        Map.Entry map$Entry0 = this.a.lowerEntry(h40.a);
        if(map$Entry0 != null) {
            com.google.common.collect.r5.c r5$c0 = (com.google.common.collect.r5.c)map$Entry0.getValue();
            if(r5$c0.h().f(h40.a) > 0) {
                if(r5$c0.h().f(h40.b) > 0) {
                    Object object0 = ((com.google.common.collect.r5.c)map$Entry0.getValue()).getValue();
                    this.r(h40.b, r5$c0.h(), object0);
                }
                Object object1 = ((com.google.common.collect.r5.c)map$Entry0.getValue()).getValue();
                this.r(r5$c0.g(), h40.a, object1);
            }
        }
        Map.Entry map$Entry1 = this.a.lowerEntry(h40.b);
        if(map$Entry1 != null) {
            com.google.common.collect.r5.c r5$c1 = (com.google.common.collect.r5.c)map$Entry1.getValue();
            if(r5$c1.h().f(h40.b) > 0) {
                Object object2 = ((com.google.common.collect.r5.c)map$Entry1.getValue()).getValue();
                this.r(h40.b, r5$c1.h(), object2);
            }
        }
        this.a.subMap(h40.a, h40.b).clear();
    }

    @Override  // com.google.common.collect.j4
    public h4 c() {
        Map.Entry map$Entry0 = this.a.firstEntry();
        Map.Entry map$Entry1 = this.a.lastEntry();
        if(map$Entry0 == null || map$Entry1 == null) {
            throw new NoSuchElementException();
        }
        h4 h40 = ((com.google.common.collect.r5.c)map$Entry0.getValue()).f();
        h4 h41 = ((com.google.common.collect.r5.c)map$Entry1.getValue()).f();
        return h4.k(h40.a, h41.b);
    }

    @Override  // com.google.common.collect.j4
    public void clear() {
        this.a.clear();
    }

    @Override  // com.google.common.collect.j4
    public j4 d(h4 h40) {
        return h40.equals(h4.a()) ? this : new d(this, h40);
    }

    @Override  // com.google.common.collect.j4
    public Map e() {
        return new b(this, this.a.values());
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.common.collect.j4
    public boolean equals(@o3.a Object object0) {
        return object0 instanceof j4 ? this.e().equals(((j4)object0).e()) : false;
    }

    @Override  // com.google.common.collect.j4
    @o3.a
    public Map.Entry f(Comparable comparable0) {
        w1 w10 = w1.d(comparable0);
        Map.Entry map$Entry0 = this.a.floorEntry(w10);
        return map$Entry0 == null || !((com.google.common.collect.r5.c)map$Entry0.getValue()).e(comparable0) ? null : ((Map.Entry)map$Entry0.getValue());
    }

    @Override  // com.google.common.collect.j4
    public Map g() {
        return new b(this, this.a.descendingMap().values());
    }

    @Override  // com.google.common.collect.j4
    public void h(j4 j40) {
        for(Object object0: j40.e().entrySet()) {
            this.k(((h4)((Map.Entry)object0).getKey()), ((Map.Entry)object0).getValue());
        }
    }

    @Override  // com.google.common.collect.j4
    public int hashCode() {
        return this.e().hashCode();
    }

    @Override  // com.google.common.collect.j4
    public void i(h4 h40, Object object0) {
        if(this.a.isEmpty()) {
            this.k(h40, object0);
            return;
        }
        this.k(this.o(h40, H.E(object0)), object0);
    }

    @Override  // com.google.common.collect.j4
    @o3.a
    public Object j(Comparable comparable0) {
        Map.Entry map$Entry0 = this.f(comparable0);
        return map$Entry0 == null ? null : map$Entry0.getValue();
    }

    @Override  // com.google.common.collect.j4
    public void k(h4 h40, Object object0) {
        if(!h40.w()) {
            H.E(object0);
            this.b(h40);
            com.google.common.collect.r5.c r5$c0 = new com.google.common.collect.r5.c(h40, object0);
            this.a.put(h40.a, r5$c0);
        }
    }

    // 去混淆评级： 低(20)
    private static h4 n(h4 h40, Object object0, @o3.a Map.Entry map$Entry0) {
        return map$Entry0 == null || !((com.google.common.collect.r5.c)map$Entry0.getValue()).f().u(h40) || !((com.google.common.collect.r5.c)map$Entry0.getValue()).getValue().equals(object0) ? h40 : h40.H(((com.google.common.collect.r5.c)map$Entry0.getValue()).f());
    }

    private h4 o(h4 h40, Object object0) {
        return r5.n(r5.n(h40, object0, this.a.lowerEntry(h40.a)), object0, this.a.floorEntry(h40.b));
    }

    public static r5 p() {
        return new r5();
    }

    private j4 q() {
        return r5.b;
    }

    private void r(w1 w10, w1 w11, Object object0) {
        com.google.common.collect.r5.c r5$c0 = new com.google.common.collect.r5.c(w10, w11, object0);
        this.a.put(w10, r5$c0);
    }

    @Override  // com.google.common.collect.j4
    public String toString() {
        return this.a.values().toString();
    }
}

