package com.google.common.collect;

import J1.b;
import com.google.common.base.H;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

@b(emulated = true)
@C1
final class V4 {
    static class a {
    }

    static final class com.google.common.collect.V4.b extends k {
        @o3.a
        transient Set h;
        @o3.a
        transient Collection i;
        private static final long j;

        com.google.common.collect.V4.b(Map map0, @o3.a Object object0) {
            super(map0, object0);
        }

        @Override  // com.google.common.collect.V4$k
        public boolean containsValue(@o3.a Object object0) {
            return this.values().contains(object0);
        }

        @Override  // com.google.common.collect.V4$k
        public Set entrySet() {
            synchronized(this.b) {
                if(this.h == null) {
                    this.h = new c(this.o().entrySet(), this.b);
                }
                return this.h;
            }
        }

        @Override  // com.google.common.collect.V4$k
        @o3.a
        public Object get(@o3.a Object object0) {
            return this.get(object0);
        }

        @o3.a
        public Collection get(@o3.a Object object0) {
            synchronized(this.b) {
                Collection collection0 = (Collection)super.get(object0);
                return collection0 == null ? null : V4.A(collection0, this.b);
            }
        }

        @Override  // com.google.common.collect.V4$k
        public Collection values() {
            synchronized(this.b) {
                if(this.i == null) {
                    this.i = new d(this.o().values(), this.b);
                }
                return this.i;
            }
        }
    }

    static final class c extends s {
        private static final long f;

        c(Set set0, @o3.a Object object0) {
            super(set0, object0);
        }

        @Override  // com.google.common.collect.V4$f
        public boolean contains(@o3.a Object object0) {
            synchronized(this.b) {
            }
            return D3.p(this.q(), object0);
        }

        @Override  // com.google.common.collect.V4$f
        public boolean containsAll(Collection collection0) {
            synchronized(this.b) {
            }
            return d1.b(this.q(), collection0);
        }

        @Override  // com.google.common.collect.V4$s
        public boolean equals(@o3.a Object object0) {
            if(object0 == this) {
                return true;
            }
            Object object1 = this.b;
            return D4.g(this.q(), object0);
        }

        @Override  // com.google.common.collect.V4$f
        public Iterator iterator() {
            class com.google.common.collect.V4.c.a extends l5 {
                final c b;

                com.google.common.collect.V4.c.a(Iterator iterator0) {
                    super(iterator0);
                }

                @Override  // com.google.common.collect.l5
                Object a(Object object0) {
                    return this.b(((Map.Entry)object0));
                }

                Map.Entry b(Map.Entry map$Entry0) {
                    class com.google.common.collect.V4.c.a.a extends k2 {
                        final Map.Entry a;
                        final com.google.common.collect.V4.c.a b;

                        com.google.common.collect.V4.c.a.a(Map.Entry map$Entry0) {
                            this.a = map$Entry0;
                            super();
                        }

                        @Override  // com.google.common.collect.k2
                        protected Object K() {
                            return this.M();
                        }

                        @Override  // com.google.common.collect.k2
                        protected Map.Entry M() {
                            return this.a;
                        }

                        public Collection S() {
                            return V4.A(((Collection)this.a.getValue()), c.this.b);
                        }

                        @Override  // com.google.common.collect.k2
                        public Object getValue() {
                            return this.S();
                        }
                    }

                    return new com.google.common.collect.V4.c.a.a(this, map$Entry0);
                }
            }

            return new com.google.common.collect.V4.c.a(this, super.iterator());
        }

        @Override  // com.google.common.collect.V4$f
        public boolean remove(@o3.a Object object0) {
            synchronized(this.b) {
            }
            return D3.k0(this.q(), object0);
        }

        @Override  // com.google.common.collect.V4$f
        public boolean removeAll(Collection collection0) {
            synchronized(this.b) {
            }
            return q3.U(this.q().iterator(), collection0);
        }

        @Override  // com.google.common.collect.V4$f
        public boolean retainAll(Collection collection0) {
            synchronized(this.b) {
            }
            return q3.W(this.q().iterator(), collection0);
        }

        @Override  // com.google.common.collect.V4$f
        public Object[] toArray() {
            synchronized(this.b) {
            }
            return Z3.l(this.q());
        }

        @Override  // com.google.common.collect.V4$f
        public Object[] toArray(Object[] arr_object) {
            synchronized(this.b) {
            }
            return Z3.m(this.q(), arr_object);
        }
    }

    static final class d extends f {
        private static final long e;

        d(Collection collection0, @o3.a Object object0) {
            super(collection0, object0, null);
        }

        @Override  // com.google.common.collect.V4$f
        public Iterator iterator() {
            class com.google.common.collect.V4.d.a extends l5 {
                final d b;

                com.google.common.collect.V4.d.a(Iterator iterator0) {
                    super(iterator0);
                }

                @Override  // com.google.common.collect.l5
                Object a(Object object0) {
                    return this.b(((Collection)object0));
                }

                Collection b(Collection collection0) {
                    return V4.A(collection0, d.this.b);
                }
            }

            return new com.google.common.collect.V4.d.a(this, super.iterator());
        }
    }

    static final class e extends k implements x, Serializable {
        @o3.a
        private transient Set h;
        @RetainedWith
        @o3.a
        private transient x i;
        private static final long j;

        private e(x x0, @o3.a Object object0, @o3.a x x1) {
            super(x0, object0);
            this.i = x1;
        }

        e(x x0, Object object0, x x1, a v4$a0) {
            this(x0, object0, x1);
        }

        @Override  // com.google.common.collect.x
        public x Q1() {
            synchronized(this.b) {
                if(this.i == null) {
                    this.i = new e(this.q().Q1(), this.b, this);
                }
                return this.i;
            }
        }

        @Override  // com.google.common.collect.x
        @o3.a
        public Object a1(@d4 Object object0, @d4 Object object1) {
            synchronized(this.b) {
            }
            return this.q().a1(object0, object1);
        }

        @Override  // com.google.common.collect.V4$k
        Object j() {
            return this.q();
        }

        @Override  // com.google.common.collect.V4$k
        Map o() {
            return this.q();
        }

        x q() {
            return (x)super.o();
        }

        @Override  // com.google.common.collect.V4$k, com.google.common.collect.x
        public Collection values() {
            return this.values();
        }

        @Override  // com.google.common.collect.x
        public Set values() {
            synchronized(this.b) {
                if(this.h == null) {
                    this.h = V4.u(this.q().values(), this.b);
                }
                return this.h;
            }
        }
    }

    @J1.e
    static class f extends p implements Collection {
        private static final long d;

        private f(Collection collection0, @o3.a Object object0) {
            super(collection0, object0);
        }

        f(Collection collection0, Object object0, a v4$a0) {
            this(collection0, object0);
        }

        @Override
        public boolean add(Object object0) {
            synchronized(this.b) {
            }
            return this.o().add(object0);
        }

        @Override
        public boolean addAll(Collection collection0) {
            synchronized(this.b) {
            }
            return this.o().addAll(collection0);
        }

        @Override
        public void clear() {
            synchronized(this.b) {
                this.o().clear();
            }
        }

        @Override
        public boolean contains(@o3.a Object object0) {
            synchronized(this.b) {
            }
            return this.o().contains(object0);
        }

        @Override
        public boolean containsAll(Collection collection0) {
            synchronized(this.b) {
            }
            return this.o().containsAll(collection0);
        }

        @Override
        public boolean isEmpty() {
            synchronized(this.b) {
            }
            return this.o().isEmpty();
        }

        @Override
        public Iterator iterator() {
            return this.o().iterator();
        }

        @Override  // com.google.common.collect.V4$p
        Object j() {
            return this.o();
        }

        Collection o() {
            return (Collection)super.j();
        }

        @Override
        public boolean remove(@o3.a Object object0) {
            synchronized(this.b) {
            }
            return this.o().remove(object0);
        }

        @Override
        public boolean removeAll(Collection collection0) {
            synchronized(this.b) {
            }
            return this.o().removeAll(collection0);
        }

        @Override
        public boolean retainAll(Collection collection0) {
            synchronized(this.b) {
            }
            return this.o().retainAll(collection0);
        }

        @Override
        public int size() {
            synchronized(this.b) {
            }
            return this.o().size();
        }

        @Override
        public Object[] toArray() {
            synchronized(this.b) {
            }
            return this.o().toArray();
        }

        @Override
        public Object[] toArray(Object[] arr_object) {
            synchronized(this.b) {
            }
            return this.o().toArray(arr_object);
        }
    }

    static final class g extends q implements Deque {
        private static final long f;

        g(Deque deque0, @o3.a Object object0) {
            super(deque0, object0);
        }

        @Override
        public void addFirst(Object object0) {
            synchronized(this.b) {
                this.u().addFirst(object0);
            }
        }

        @Override
        public void addLast(Object object0) {
            synchronized(this.b) {
                this.u().addLast(object0);
            }
        }

        @Override
        public Iterator descendingIterator() {
            synchronized(this.b) {
            }
            return this.u().descendingIterator();
        }

        @Override
        public Object getFirst() {
            synchronized(this.b) {
            }
            return this.u().getFirst();
        }

        @Override
        public Object getLast() {
            synchronized(this.b) {
            }
            return this.u().getLast();
        }

        @Override  // com.google.common.collect.V4$q
        Object j() {
            return this.u();
        }

        @Override  // com.google.common.collect.V4$q
        Collection o() {
            return this.u();
        }

        @Override
        public boolean offerFirst(Object object0) {
            synchronized(this.b) {
            }
            return this.u().offerFirst(object0);
        }

        @Override
        public boolean offerLast(Object object0) {
            synchronized(this.b) {
            }
            return this.u().offerLast(object0);
        }

        @Override
        @o3.a
        public Object peekFirst() {
            synchronized(this.b) {
            }
            return this.u().peekFirst();
        }

        @Override
        @o3.a
        public Object peekLast() {
            synchronized(this.b) {
            }
            return this.u().peekLast();
        }

        @Override
        @o3.a
        public Object pollFirst() {
            synchronized(this.b) {
            }
            return this.u().pollFirst();
        }

        @Override
        @o3.a
        public Object pollLast() {
            synchronized(this.b) {
            }
            return this.u().pollLast();
        }

        @Override
        public Object pop() {
            synchronized(this.b) {
            }
            return this.u().pop();
        }

        @Override
        public void push(Object object0) {
            synchronized(this.b) {
                this.u().push(object0);
            }
        }

        @Override  // com.google.common.collect.V4$q
        Queue q() {
            return this.u();
        }

        @Override
        public Object removeFirst() {
            synchronized(this.b) {
            }
            return this.u().removeFirst();
        }

        @Override
        public boolean removeFirstOccurrence(@o3.a Object object0) {
            synchronized(this.b) {
            }
            return this.u().removeFirstOccurrence(object0);
        }

        @Override
        public Object removeLast() {
            synchronized(this.b) {
            }
            return this.u().removeLast();
        }

        @Override
        public boolean removeLastOccurrence(@o3.a Object object0) {
            synchronized(this.b) {
            }
            return this.u().removeLastOccurrence(object0);
        }

        Deque u() {
            return (Deque)super.q();
        }
    }

    @J1.c
    static final class h extends p implements Map.Entry {
        private static final long d;

        h(Map.Entry map$Entry0, @o3.a Object object0) {
            super(map$Entry0, object0);
        }

        @Override
        public boolean equals(@o3.a Object object0) {
            synchronized(this.b) {
            }
            return this.o().equals(object0);
        }

        @Override
        public Object getKey() {
            synchronized(this.b) {
            }
            return this.o().getKey();
        }

        @Override
        public Object getValue() {
            synchronized(this.b) {
            }
            return this.o().getValue();
        }

        @Override
        public int hashCode() {
            synchronized(this.b) {
            }
            return this.o().hashCode();
        }

        @Override  // com.google.common.collect.V4$p
        Object j() {
            return this.o();
        }

        Map.Entry o() {
            return (Map.Entry)super.j();
        }

        @Override
        public Object setValue(Object object0) {
            synchronized(this.b) {
            }
            return this.o().setValue(object0);
        }
    }

    static class i extends f implements List {
        private static final long e;

        i(List list0, @o3.a Object object0) {
            super(list0, object0, null);
        }

        @Override
        public void add(int v, Object object0) {
            synchronized(this.b) {
                this.q().add(v, object0);
            }
        }

        @Override
        public boolean addAll(int v, Collection collection0) {
            synchronized(this.b) {
            }
            return this.q().addAll(v, collection0);
        }

        @Override
        public boolean equals(@o3.a Object object0) {
            if(object0 == this) {
                return true;
            }
            Object object1 = this.b;
            return this.q().equals(object0);
        }

        @Override
        public Object get(int v) {
            synchronized(this.b) {
            }
            return this.q().get(v);
        }

        @Override
        public int hashCode() {
            synchronized(this.b) {
            }
            return this.q().hashCode();
        }

        @Override
        public int indexOf(@o3.a Object object0) {
            synchronized(this.b) {
            }
            return this.q().indexOf(object0);
        }

        @Override  // com.google.common.collect.V4$f
        Object j() {
            return this.q();
        }

        @Override
        public int lastIndexOf(@o3.a Object object0) {
            synchronized(this.b) {
            }
            return this.q().lastIndexOf(object0);
        }

        @Override
        public ListIterator listIterator() {
            return this.q().listIterator();
        }

        @Override
        public ListIterator listIterator(int v) {
            return this.q().listIterator(v);
        }

        @Override  // com.google.common.collect.V4$f
        Collection o() {
            return this.q();
        }

        List q() {
            return (List)super.o();
        }

        @Override
        public Object remove(int v) {
            synchronized(this.b) {
            }
            return this.q().remove(v);
        }

        @Override
        public Object set(int v, Object object0) {
            synchronized(this.b) {
            }
            return this.q().set(v, object0);
        }

        @Override
        public List subList(int v, int v1) {
            synchronized(this.b) {
            }
            return V4.j(this.q().subList(v, v1), this.b);
        }
    }

    static final class j extends l implements y3 {
        private static final long j;

        j(y3 y30, @o3.a Object object0) {
            super(y30, object0);
        }

        @Override  // com.google.common.collect.V4$l, com.google.common.collect.y3
        public Collection a(@o3.a Object object0) {
            return this.a(object0);
        }

        @Override  // com.google.common.collect.y3
        public List a(@o3.a Object object0) {
            synchronized(this.b) {
            }
            return this.q().a(object0);
        }

        @Override  // com.google.common.collect.V4$l, com.google.common.collect.y3
        public Collection b(Object object0, Iterable iterable0) {
            return this.b(object0, iterable0);
        }

        @Override  // com.google.common.collect.y3
        public List b(Object object0, Iterable iterable0) {
            synchronized(this.b) {
            }
            return this.q().b(object0, iterable0);
        }

        @Override  // com.google.common.collect.V4$l, com.google.common.collect.y3
        public Collection get(Object object0) {
            return this.get(object0);
        }

        @Override  // com.google.common.collect.y3
        public List get(Object object0) {
            synchronized(this.b) {
            }
            return V4.j(this.q().get(object0), this.b);
        }

        @Override  // com.google.common.collect.V4$l
        Object j() {
            return this.q();
        }

        @Override  // com.google.common.collect.V4$l
        M3 o() {
            return this.q();
        }

        y3 q() {
            return (y3)super.o();
        }
    }

    static class k extends p implements Map {
        @o3.a
        transient Set d;
        @o3.a
        transient Collection e;
        @o3.a
        transient Set f;
        private static final long g;

        k(Map map0, @o3.a Object object0) {
            super(map0, object0);
        }

        @Override
        public void clear() {
            synchronized(this.b) {
                this.o().clear();
            }
        }

        @Override
        public boolean containsKey(@o3.a Object object0) {
            synchronized(this.b) {
            }
            return this.o().containsKey(object0);
        }

        @Override
        public boolean containsValue(@o3.a Object object0) {
            synchronized(this.b) {
            }
            return this.o().containsValue(object0);
        }

        @Override
        public Set entrySet() {
            synchronized(this.b) {
                if(this.f == null) {
                    this.f = V4.u(this.o().entrySet(), this.b);
                }
                return this.f;
            }
        }

        @Override
        public boolean equals(@o3.a Object object0) {
            if(object0 == this) {
                return true;
            }
            Object object1 = this.b;
            return this.o().equals(object0);
        }

        @Override
        @o3.a
        public Object get(@o3.a Object object0) {
            synchronized(this.b) {
            }
            return this.o().get(object0);
        }

        @Override
        public int hashCode() {
            synchronized(this.b) {
            }
            return this.o().hashCode();
        }

        @Override
        public boolean isEmpty() {
            synchronized(this.b) {
            }
            return this.o().isEmpty();
        }

        @Override  // com.google.common.collect.V4$p
        Object j() {
            return this.o();
        }

        @Override
        public Set keySet() {
            synchronized(this.b) {
                if(this.d == null) {
                    this.d = V4.u(this.o().keySet(), this.b);
                }
                return this.d;
            }
        }

        Map o() {
            return (Map)super.j();
        }

        @Override
        @o3.a
        public Object put(Object object0, Object object1) {
            synchronized(this.b) {
            }
            return this.o().put(object0, object1);
        }

        @Override
        public void putAll(Map map0) {
            synchronized(this.b) {
                this.o().putAll(map0);
            }
        }

        @Override
        @o3.a
        public Object remove(@o3.a Object object0) {
            synchronized(this.b) {
            }
            return this.o().remove(object0);
        }

        @Override
        public int size() {
            synchronized(this.b) {
            }
            return this.o().size();
        }

        @Override
        public Collection values() {
            synchronized(this.b) {
                if(this.e == null) {
                    this.e = V4.h(this.o().values(), this.b);
                }
                return this.e;
            }
        }
    }

    static class l extends p implements M3 {
        @o3.a
        transient Set d;
        @o3.a
        transient Collection e;
        @o3.a
        transient Collection f;
        @o3.a
        transient Map g;
        @o3.a
        transient S3 h;
        private static final long i;

        l(M3 m30, @o3.a Object object0) {
            super(m30, object0);
        }

        @Override  // com.google.common.collect.M3
        public S3 E() {
            synchronized(this.b) {
                if(this.h == null) {
                    this.h = V4.n(this.o().E(), this.b);
                }
                return this.h;
            }
        }

        @Override  // com.google.common.collect.M3
        public boolean G(@d4 Object object0, Iterable iterable0) {
            synchronized(this.b) {
            }
            return this.o().G(object0, iterable0);
        }

        @Override  // com.google.common.collect.M3
        public boolean J(@o3.a Object object0, @o3.a Object object1) {
            synchronized(this.b) {
            }
            return this.o().J(object0, object1);
        }

        @Override  // com.google.common.collect.M3
        public Collection a(@o3.a Object object0) {
            synchronized(this.b) {
            }
            return this.o().a(object0);
        }

        @Override  // com.google.common.collect.M3
        public Collection b(@d4 Object object0, Iterable iterable0) {
            synchronized(this.b) {
            }
            return this.o().b(object0, iterable0);
        }

        @Override  // com.google.common.collect.M3
        public Map c() {
            synchronized(this.b) {
                if(this.g == null) {
                    this.g = new com.google.common.collect.V4.b(this.o().c(), this.b);
                }
                return this.g;
            }
        }

        @Override  // com.google.common.collect.M3
        public void clear() {
            synchronized(this.b) {
                this.o().clear();
            }
        }

        @Override  // com.google.common.collect.M3
        public boolean containsKey(@o3.a Object object0) {
            synchronized(this.b) {
            }
            return this.o().containsKey(object0);
        }

        @Override  // com.google.common.collect.M3
        public boolean containsValue(@o3.a Object object0) {
            synchronized(this.b) {
            }
            return this.o().containsValue(object0);
        }

        @Override  // com.google.common.collect.M3
        public boolean equals(@o3.a Object object0) {
            if(object0 == this) {
                return true;
            }
            Object object1 = this.b;
            return this.o().equals(object0);
        }

        @Override  // com.google.common.collect.M3
        public Collection get(@d4 Object object0) {
            synchronized(this.b) {
            }
            return V4.A(this.o().get(object0), this.b);
        }

        @Override  // com.google.common.collect.M3
        public Collection h() {
            synchronized(this.b) {
                if(this.f == null) {
                    this.f = V4.A(this.o().h(), this.b);
                }
                return this.f;
            }
        }

        @Override  // com.google.common.collect.M3
        public int hashCode() {
            synchronized(this.b) {
            }
            return this.o().hashCode();
        }

        @Override  // com.google.common.collect.M3
        public boolean isEmpty() {
            synchronized(this.b) {
            }
            return this.o().isEmpty();
        }

        @Override  // com.google.common.collect.V4$p
        Object j() {
            return this.o();
        }

        @Override  // com.google.common.collect.M3
        public Set keySet() {
            synchronized(this.b) {
                if(this.d == null) {
                    this.d = V4.B(this.o().keySet(), this.b);
                }
                return this.d;
            }
        }

        @Override  // com.google.common.collect.M3
        public boolean m(M3 m30) {
            synchronized(this.b) {
            }
            return this.o().m(m30);
        }

        M3 o() {
            return (M3)super.j();
        }

        @Override  // com.google.common.collect.M3
        public boolean put(@d4 Object object0, @d4 Object object1) {
            synchronized(this.b) {
            }
            return this.o().put(object0, object1);
        }

        @Override  // com.google.common.collect.M3
        public boolean remove(@o3.a Object object0, @o3.a Object object1) {
            synchronized(this.b) {
            }
            return this.o().remove(object0, object1);
        }

        @Override  // com.google.common.collect.M3
        public int size() {
            synchronized(this.b) {
            }
            return this.o().size();
        }

        @Override  // com.google.common.collect.M3
        public Collection values() {
            synchronized(this.b) {
                if(this.e == null) {
                    this.e = V4.h(this.o().values(), this.b);
                }
                return this.e;
            }
        }
    }

    static final class m extends f implements S3 {
        @o3.a
        transient Set e;
        @o3.a
        transient Set f;
        private static final long g;

        m(S3 s30, @o3.a Object object0) {
            super(s30, object0, null);
        }

        @Override  // com.google.common.collect.S3
        public int T0(@d4 Object object0, int v) {
            synchronized(this.b) {
            }
            return this.q().T0(object0, v);
        }

        @Override  // com.google.common.collect.S3
        public int b3(@o3.a Object object0, int v) {
            synchronized(this.b) {
            }
            return this.q().b3(object0, v);
        }

        @Override  // com.google.common.collect.S3
        public Set entrySet() {
            synchronized(this.b) {
                if(this.f == null) {
                    this.f = V4.B(this.q().entrySet(), this.b);
                }
                return this.f;
            }
        }

        @Override  // com.google.common.collect.S3
        public boolean equals(@o3.a Object object0) {
            if(object0 == this) {
                return true;
            }
            Object object1 = this.b;
            return this.q().equals(object0);
        }

        @Override  // com.google.common.collect.S3
        public Set f() {
            synchronized(this.b) {
                if(this.e == null) {
                    this.e = V4.B(this.q().f(), this.b);
                }
                return this.e;
            }
        }

        @Override  // com.google.common.collect.S3
        public int hashCode() {
            synchronized(this.b) {
            }
            return this.q().hashCode();
        }

        @Override  // com.google.common.collect.V4$f
        Object j() {
            return this.q();
        }

        @Override  // com.google.common.collect.S3
        public boolean j1(@d4 Object object0, int v, int v1) {
            synchronized(this.b) {
            }
            return this.q().j1(object0, v, v1);
        }

        @Override  // com.google.common.collect.S3
        public int j2(@d4 Object object0, int v) {
            synchronized(this.b) {
            }
            return this.q().j2(object0, v);
        }

        @Override  // com.google.common.collect.V4$f
        Collection o() {
            return this.q();
        }

        S3 q() {
            return (S3)super.o();
        }

        @Override  // com.google.common.collect.S3
        public int y3(@o3.a Object object0) {
            synchronized(this.b) {
            }
            return this.q().y3(object0);
        }
    }

    @J1.c
    @J1.e
    static final class n extends u implements NavigableMap {
        @o3.a
        transient NavigableSet i;
        @o3.a
        transient NavigableMap j;
        @o3.a
        transient NavigableSet k;
        private static final long l;

        n(NavigableMap navigableMap0, @o3.a Object object0) {
            super(navigableMap0, object0);
        }

        @Override
        @o3.a
        public Map.Entry ceilingEntry(Object object0) {
            synchronized(this.b) {
            }
            return V4.s(this.u().ceilingEntry(object0), this.b);
        }

        @Override
        @o3.a
        public Object ceilingKey(Object object0) {
            synchronized(this.b) {
            }
            return this.u().ceilingKey(object0);
        }

        @Override
        public NavigableSet descendingKeySet() {
            synchronized(this.b) {
                NavigableSet navigableSet0 = this.i;
                if(navigableSet0 == null) {
                    NavigableSet navigableSet1 = V4.r(this.u().descendingKeySet(), this.b);
                    this.i = navigableSet1;
                    return navigableSet1;
                }
                return navigableSet0;
            }
        }

        @Override
        public NavigableMap descendingMap() {
            synchronized(this.b) {
                NavigableMap navigableMap0 = this.j;
                if(navigableMap0 == null) {
                    NavigableMap navigableMap1 = V4.p(this.u().descendingMap(), this.b);
                    this.j = navigableMap1;
                    return navigableMap1;
                }
                return navigableMap0;
            }
        }

        @Override
        @o3.a
        public Map.Entry firstEntry() {
            synchronized(this.b) {
            }
            return V4.s(this.u().firstEntry(), this.b);
        }

        @Override
        @o3.a
        public Map.Entry floorEntry(Object object0) {
            synchronized(this.b) {
            }
            return V4.s(this.u().floorEntry(object0), this.b);
        }

        @Override
        @o3.a
        public Object floorKey(Object object0) {
            synchronized(this.b) {
            }
            return this.u().floorKey(object0);
        }

        @Override
        public NavigableMap headMap(Object object0, boolean z) {
            synchronized(this.b) {
            }
            return V4.p(this.u().headMap(object0, z), this.b);
        }

        @Override  // com.google.common.collect.V4$u
        public SortedMap headMap(Object object0) {
            return this.headMap(object0, false);
        }

        @Override
        @o3.a
        public Map.Entry higherEntry(Object object0) {
            synchronized(this.b) {
            }
            return V4.s(this.u().higherEntry(object0), this.b);
        }

        @Override
        @o3.a
        public Object higherKey(Object object0) {
            synchronized(this.b) {
            }
            return this.u().higherKey(object0);
        }

        @Override  // com.google.common.collect.V4$u
        Object j() {
            return this.u();
        }

        @Override  // com.google.common.collect.V4$k
        public Set keySet() {
            return this.navigableKeySet();
        }

        @Override
        @o3.a
        public Map.Entry lastEntry() {
            synchronized(this.b) {
            }
            return V4.s(this.u().lastEntry(), this.b);
        }

        @Override
        @o3.a
        public Map.Entry lowerEntry(Object object0) {
            synchronized(this.b) {
            }
            return V4.s(this.u().lowerEntry(object0), this.b);
        }

        @Override
        @o3.a
        public Object lowerKey(Object object0) {
            synchronized(this.b) {
            }
            return this.u().lowerKey(object0);
        }

        @Override
        public NavigableSet navigableKeySet() {
            synchronized(this.b) {
                NavigableSet navigableSet0 = this.k;
                if(navigableSet0 == null) {
                    NavigableSet navigableSet1 = V4.r(this.u().navigableKeySet(), this.b);
                    this.k = navigableSet1;
                    return navigableSet1;
                }
                return navigableSet0;
            }
        }

        @Override  // com.google.common.collect.V4$u
        Map o() {
            return this.u();
        }

        @Override
        @o3.a
        public Map.Entry pollFirstEntry() {
            synchronized(this.b) {
            }
            return V4.s(this.u().pollFirstEntry(), this.b);
        }

        @Override
        @o3.a
        public Map.Entry pollLastEntry() {
            synchronized(this.b) {
            }
            return V4.s(this.u().pollLastEntry(), this.b);
        }

        @Override  // com.google.common.collect.V4$u
        SortedMap q() {
            return this.u();
        }

        @Override
        public NavigableMap subMap(Object object0, boolean z, Object object1, boolean z1) {
            synchronized(this.b) {
            }
            return V4.p(this.u().subMap(object0, z, object1, z1), this.b);
        }

        @Override  // com.google.common.collect.V4$u
        public SortedMap subMap(Object object0, Object object1) {
            return this.subMap(object0, true, object1, false);
        }

        @Override
        public NavigableMap tailMap(Object object0, boolean z) {
            synchronized(this.b) {
            }
            return V4.p(this.u().tailMap(object0, z), this.b);
        }

        @Override  // com.google.common.collect.V4$u
        public SortedMap tailMap(Object object0) {
            return this.tailMap(object0, true);
        }

        NavigableMap u() {
            return (NavigableMap)super.q();
        }
    }

    @J1.c
    @J1.e
    static final class o extends v implements NavigableSet {
        @o3.a
        transient NavigableSet g;
        private static final long h;

        o(NavigableSet navigableSet0, @o3.a Object object0) {
            super(navigableSet0, object0);
        }

        @Override
        @o3.a
        public Object ceiling(Object object0) {
            synchronized(this.b) {
            }
            return this.x().ceiling(object0);
        }

        @Override
        public Iterator descendingIterator() {
            return this.x().descendingIterator();
        }

        @Override
        public NavigableSet descendingSet() {
            synchronized(this.b) {
                NavigableSet navigableSet0 = this.g;
                if(navigableSet0 == null) {
                    NavigableSet navigableSet1 = V4.r(this.x().descendingSet(), this.b);
                    this.g = navigableSet1;
                    return navigableSet1;
                }
                return navigableSet0;
            }
        }

        @Override
        @o3.a
        public Object floor(Object object0) {
            synchronized(this.b) {
            }
            return this.x().floor(object0);
        }

        @Override
        public NavigableSet headSet(Object object0, boolean z) {
            synchronized(this.b) {
            }
            return V4.r(this.x().headSet(object0, z), this.b);
        }

        @Override  // com.google.common.collect.V4$v
        public SortedSet headSet(Object object0) {
            return this.headSet(object0, false);
        }

        @Override
        @o3.a
        public Object higher(Object object0) {
            synchronized(this.b) {
            }
            return this.x().higher(object0);
        }

        @Override  // com.google.common.collect.V4$v
        Object j() {
            return this.x();
        }

        @Override
        @o3.a
        public Object lower(Object object0) {
            synchronized(this.b) {
            }
            return this.x().lower(object0);
        }

        @Override  // com.google.common.collect.V4$v
        Collection o() {
            return this.x();
        }

        @Override
        @o3.a
        public Object pollFirst() {
            synchronized(this.b) {
            }
            return this.x().pollFirst();
        }

        @Override
        @o3.a
        public Object pollLast() {
            synchronized(this.b) {
            }
            return this.x().pollLast();
        }

        @Override  // com.google.common.collect.V4$v
        Set q() {
            return this.x();
        }

        @Override
        public NavigableSet subSet(Object object0, boolean z, Object object1, boolean z1) {
            synchronized(this.b) {
            }
            return V4.r(this.x().subSet(object0, z, object1, z1), this.b);
        }

        @Override  // com.google.common.collect.V4$v
        public SortedSet subSet(Object object0, Object object1) {
            return this.subSet(object0, true, object1, false);
        }

        @Override
        public NavigableSet tailSet(Object object0, boolean z) {
            synchronized(this.b) {
            }
            return V4.r(this.x().tailSet(object0, z), this.b);
        }

        @Override  // com.google.common.collect.V4$v
        public SortedSet tailSet(Object object0) {
            return this.tailSet(object0, true);
        }

        @Override  // com.google.common.collect.V4$v
        SortedSet u() {
            return this.x();
        }

        NavigableSet x() {
            return (NavigableSet)super.u();
        }
    }

    static class p implements Serializable {
        final Object a;
        final Object b;
        @J1.c
        @J1.d
        private static final long c;

        p(Object object0, @o3.a Object object1) {
            this.a = H.E(object0);
            if(object1 == null) {
                object1 = this;
            }
            this.b = object1;
        }

        Object j() {
            return this.a;
        }

        @J1.c
        @J1.d
        private void l(ObjectOutputStream objectOutputStream0) throws IOException {
            synchronized(this.b) {
                objectOutputStream0.defaultWriteObject();
            }
        }

        @Override
        public String toString() {
            synchronized(this.b) {
            }
            return this.a.toString();
        }
    }

    static class q extends f implements Queue {
        private static final long e;

        q(Queue queue0, @o3.a Object object0) {
            super(queue0, object0, null);
        }

        @Override
        public Object element() {
            synchronized(this.b) {
            }
            return this.q().element();
        }

        @Override  // com.google.common.collect.V4$f
        Object j() {
            return this.q();
        }

        @Override  // com.google.common.collect.V4$f
        Collection o() {
            return this.q();
        }

        @Override
        public boolean offer(Object object0) {
            synchronized(this.b) {
            }
            return this.q().offer(object0);
        }

        @Override
        @o3.a
        public Object peek() {
            synchronized(this.b) {
            }
            return this.q().peek();
        }

        @Override
        @o3.a
        public Object poll() {
            synchronized(this.b) {
            }
            return this.q().poll();
        }

        Queue q() {
            return (Queue)super.o();
        }

        @Override
        public Object remove() {
            synchronized(this.b) {
            }
            return this.q().remove();
        }
    }

    static final class r extends i implements RandomAccess {
        private static final long f;

        r(List list0, @o3.a Object object0) {
            super(list0, object0);
        }
    }

    static class s extends f implements Set {
        private static final long e;

        s(Set set0, @o3.a Object object0) {
            super(set0, object0, null);
        }

        @Override
        public boolean equals(@o3.a Object object0) {
            if(object0 == this) {
                return true;
            }
            Object object1 = this.b;
            return this.q().equals(object0);
        }

        @Override
        public int hashCode() {
            synchronized(this.b) {
            }
            return this.q().hashCode();
        }

        @Override  // com.google.common.collect.V4$f
        Object j() {
            return this.q();
        }

        @Override  // com.google.common.collect.V4$f
        Collection o() {
            return this.q();
        }

        Set q() {
            return (Set)super.o();
        }
    }

    static class t extends l implements C4 {
        @o3.a
        transient Set j;
        private static final long k;

        t(C4 c40, @o3.a Object object0) {
            super(c40, object0);
        }

        @Override  // com.google.common.collect.V4$l, com.google.common.collect.C4
        public Collection a(@o3.a Object object0) {
            return this.a(object0);
        }

        @Override  // com.google.common.collect.C4
        public Set a(@o3.a Object object0) {
            synchronized(this.b) {
            }
            return this.q().a(object0);
        }

        @Override  // com.google.common.collect.V4$l, com.google.common.collect.C4
        public Collection b(Object object0, Iterable iterable0) {
            return this.b(object0, iterable0);
        }

        @Override  // com.google.common.collect.C4
        public Set b(Object object0, Iterable iterable0) {
            synchronized(this.b) {
            }
            return this.q().b(object0, iterable0);
        }

        @Override  // com.google.common.collect.V4$l, com.google.common.collect.C4
        public Collection get(Object object0) {
            return this.get(object0);
        }

        @Override  // com.google.common.collect.C4
        public Set get(Object object0) {
            synchronized(this.b) {
            }
            return V4.u(this.q().get(object0), this.b);
        }

        @Override  // com.google.common.collect.V4$l, com.google.common.collect.C4
        public Collection h() {
            return this.h();
        }

        @Override  // com.google.common.collect.C4
        public Set h() {
            synchronized(this.b) {
                if(this.j == null) {
                    this.j = V4.u(this.q().h(), this.b);
                }
                return this.j;
            }
        }

        @Override  // com.google.common.collect.V4$l
        Object j() {
            return this.q();
        }

        @Override  // com.google.common.collect.V4$l
        M3 o() {
            return this.q();
        }

        C4 q() {
            return (C4)super.o();
        }
    }

    static class u extends k implements SortedMap {
        private static final long h;

        u(SortedMap sortedMap0, @o3.a Object object0) {
            super(sortedMap0, object0);
        }

        @Override
        @o3.a
        public Comparator comparator() {
            synchronized(this.b) {
            }
            return this.q().comparator();
        }

        @Override
        public Object firstKey() {
            synchronized(this.b) {
            }
            return this.q().firstKey();
        }

        @Override
        public SortedMap headMap(Object object0) {
            synchronized(this.b) {
            }
            return V4.w(this.q().headMap(object0), this.b);
        }

        @Override  // com.google.common.collect.V4$k
        Object j() {
            return this.q();
        }

        @Override
        public Object lastKey() {
            synchronized(this.b) {
            }
            return this.q().lastKey();
        }

        @Override  // com.google.common.collect.V4$k
        Map o() {
            return this.q();
        }

        SortedMap q() {
            return (SortedMap)super.o();
        }

        @Override
        public SortedMap subMap(Object object0, Object object1) {
            synchronized(this.b) {
            }
            return V4.w(this.q().subMap(object0, object1), this.b);
        }

        @Override
        public SortedMap tailMap(Object object0) {
            synchronized(this.b) {
            }
            return V4.w(this.q().tailMap(object0), this.b);
        }
    }

    static class v extends s implements SortedSet {
        private static final long f;

        v(SortedSet sortedSet0, @o3.a Object object0) {
            super(sortedSet0, object0);
        }

        @Override
        @o3.a
        public Comparator comparator() {
            synchronized(this.b) {
            }
            return this.u().comparator();
        }

        @Override
        public Object first() {
            synchronized(this.b) {
            }
            return this.u().first();
        }

        @Override
        public SortedSet headSet(Object object0) {
            synchronized(this.b) {
            }
            return V4.x(this.u().headSet(object0), this.b);
        }

        @Override  // com.google.common.collect.V4$s
        Object j() {
            return this.u();
        }

        @Override
        public Object last() {
            synchronized(this.b) {
            }
            return this.u().last();
        }

        @Override  // com.google.common.collect.V4$s
        Collection o() {
            return this.u();
        }

        @Override  // com.google.common.collect.V4$s
        Set q() {
            return this.u();
        }

        @Override
        public SortedSet subSet(Object object0, Object object1) {
            synchronized(this.b) {
            }
            return V4.x(this.u().subSet(object0, object1), this.b);
        }

        @Override
        public SortedSet tailSet(Object object0) {
            synchronized(this.b) {
            }
            return V4.x(this.u().tailSet(object0), this.b);
        }

        SortedSet u() {
            return (SortedSet)super.q();
        }
    }

    static final class w extends t implements R4 {
        private static final long l;

        w(R4 r40, @o3.a Object object0) {
            super(r40, object0);
        }

        @Override  // com.google.common.collect.V4$t, com.google.common.collect.R4
        public Collection a(@o3.a Object object0) {
            return this.a(object0);
        }

        @Override  // com.google.common.collect.V4$t, com.google.common.collect.R4
        public Set a(@o3.a Object object0) {
            return this.a(object0);
        }

        @Override  // com.google.common.collect.R4
        public SortedSet a(@o3.a Object object0) {
            synchronized(this.b) {
            }
            return this.u().a(object0);
        }

        @Override  // com.google.common.collect.V4$t, com.google.common.collect.R4
        public Collection b(Object object0, Iterable iterable0) {
            return this.b(object0, iterable0);
        }

        @Override  // com.google.common.collect.V4$t, com.google.common.collect.R4
        public Set b(Object object0, Iterable iterable0) {
            return this.b(object0, iterable0);
        }

        @Override  // com.google.common.collect.R4
        public SortedSet b(Object object0, Iterable iterable0) {
            synchronized(this.b) {
            }
            return this.u().b(object0, iterable0);
        }

        @Override  // com.google.common.collect.V4$t, com.google.common.collect.R4
        public Collection get(Object object0) {
            return this.get(object0);
        }

        @Override  // com.google.common.collect.V4$t, com.google.common.collect.R4
        public Set get(Object object0) {
            return this.get(object0);
        }

        @Override  // com.google.common.collect.R4
        public SortedSet get(Object object0) {
            synchronized(this.b) {
            }
            return V4.x(this.u().get(object0), this.b);
        }

        @Override  // com.google.common.collect.V4$t
        Object j() {
            return this.u();
        }

        @Override  // com.google.common.collect.V4$t
        M3 o() {
            return this.u();
        }

        @Override  // com.google.common.collect.V4$t
        C4 q() {
            return this.u();
        }

        @Override  // com.google.common.collect.R4
        @o3.a
        public Comparator r() {
            synchronized(this.b) {
            }
            return this.u().r();
        }

        R4 u() {
            return (R4)super.q();
        }
    }

    static final class com.google.common.collect.V4.x extends p implements W4 {
        com.google.common.collect.V4.x(W4 w40, @o3.a Object object0) {
            super(w40, object0);
        }

        @Override  // com.google.common.collect.W4
        @o3.a
        public Object Z(@o3.a Object object0, @o3.a Object object1) {
            synchronized(this.b) {
            }
            return this.o().Z(object0, object1);
        }

        @Override  // com.google.common.collect.W4
        public boolean a0(@o3.a Object object0) {
            synchronized(this.b) {
            }
            return this.o().a0(object0);
        }

        @Override  // com.google.common.collect.W4
        public Map b0() {
            class com.google.common.collect.V4.x.b implements com.google.common.base.t {
                final com.google.common.collect.V4.x a;

                public Map a(Map map0) {
                    return V4.l(map0, com.google.common.collect.V4.x.this.b);
                }

                @Override  // com.google.common.base.t
                public Object apply(Object object0) {
                    return this.a(((Map)object0));
                }
            }

            synchronized(this.b) {
            }
            return V4.l(D3.D0(this.o().b0(), new com.google.common.collect.V4.x.b(this)), this.b);
        }

        @Override  // com.google.common.collect.W4
        public Map c0(@d4 Object object0) {
            synchronized(this.b) {
            }
            return V4.l(this.o().c0(object0), this.b);
        }

        @Override  // com.google.common.collect.W4
        public void clear() {
            synchronized(this.b) {
                this.o().clear();
            }
        }

        @Override  // com.google.common.collect.W4
        public boolean containsValue(@o3.a Object object0) {
            synchronized(this.b) {
            }
            return this.o().containsValue(object0);
        }

        @Override  // com.google.common.collect.W4
        public boolean equals(@o3.a Object object0) {
            if(this == object0) {
                return true;
            }
            Object object1 = this.b;
            return this.o().equals(object0);
        }

        @Override  // com.google.common.collect.W4
        public Map g() {
            class com.google.common.collect.V4.x.a implements com.google.common.base.t {
                final com.google.common.collect.V4.x a;

                public Map a(Map map0) {
                    return V4.l(map0, com.google.common.collect.V4.x.this.b);
                }

                @Override  // com.google.common.base.t
                public Object apply(Object object0) {
                    return this.a(((Map)object0));
                }
            }

            synchronized(this.b) {
            }
            return V4.l(D3.D0(this.o().g(), new com.google.common.collect.V4.x.a(this)), this.b);
        }

        @Override  // com.google.common.collect.W4
        @o3.a
        public Object g0(@d4 Object object0, @d4 Object object1, @d4 Object object2) {
            synchronized(this.b) {
            }
            return this.o().g0(object0, object1, object2);
        }

        @Override  // com.google.common.collect.W4
        public int hashCode() {
            synchronized(this.b) {
            }
            return this.o().hashCode();
        }

        @Override  // com.google.common.collect.W4
        public Set i() {
            synchronized(this.b) {
            }
            return V4.u(this.o().i(), this.b);
        }

        @Override  // com.google.common.collect.W4
        public boolean i0(@o3.a Object object0, @o3.a Object object1) {
            synchronized(this.b) {
            }
            return this.o().i0(object0, object1);
        }

        @Override  // com.google.common.collect.W4
        public boolean isEmpty() {
            synchronized(this.b) {
            }
            return this.o().isEmpty();
        }

        @Override  // com.google.common.collect.V4$p
        Object j() {
            return this.o();
        }

        @Override  // com.google.common.collect.W4
        public void j0(W4 w40) {
            synchronized(this.b) {
                this.o().j0(w40);
            }
        }

        @Override  // com.google.common.collect.W4
        public Set k0() {
            synchronized(this.b) {
            }
            return V4.u(this.o().k0(), this.b);
        }

        @Override  // com.google.common.collect.W4
        public Set m0() {
            synchronized(this.b) {
            }
            return V4.u(this.o().m0(), this.b);
        }

        @Override  // com.google.common.collect.W4
        public boolean n0(@o3.a Object object0) {
            synchronized(this.b) {
            }
            return this.o().n0(object0);
        }

        W4 o() {
            return (W4)super.j();
        }

        @Override  // com.google.common.collect.W4
        public Map o0(@d4 Object object0) {
            synchronized(this.b) {
            }
            return V4.l(this.o().o0(object0), this.b);
        }

        @Override  // com.google.common.collect.W4
        @o3.a
        public Object remove(@o3.a Object object0, @o3.a Object object1) {
            synchronized(this.b) {
            }
            return this.o().remove(object0, object1);
        }

        @Override  // com.google.common.collect.W4
        public int size() {
            synchronized(this.b) {
            }
            return this.o().size();
        }

        @Override  // com.google.common.collect.W4
        public Collection values() {
            synchronized(this.b) {
            }
            return V4.h(this.o().values(), this.b);
        }
    }

    private static Collection A(Collection collection0, @o3.a Object object0) {
        if(collection0 instanceof SortedSet) {
            return V4.x(((SortedSet)collection0), object0);
        }
        if(collection0 instanceof Set) {
            return V4.u(((Set)collection0), object0);
        }
        return collection0 instanceof List ? V4.j(((List)collection0), object0) : V4.h(collection0, object0);
    }

    private static Set B(Set set0, @o3.a Object object0) {
        return set0 instanceof SortedSet ? V4.x(((SortedSet)set0), object0) : V4.u(set0, object0);
    }

    static x g(x x0, @o3.a Object object0) {
        return !(x0 instanceof e) && !(x0 instanceof I2) ? new e(x0, object0, null, null) : x0;
    }

    private static Collection h(Collection collection0, @o3.a Object object0) {
        return new f(collection0, object0, null);
    }

    static Deque i(Deque deque0, @o3.a Object object0) {
        return new g(deque0, object0);
    }

    private static List j(List list0, @o3.a Object object0) {
        return list0 instanceof RandomAccess ? new r(list0, object0) : new i(list0, object0);
    }

    static y3 k(y3 y30, @o3.a Object object0) {
        return !(y30 instanceof j) && !(y30 instanceof com.google.common.collect.v) ? new j(y30, object0) : y30;
    }

    @J1.e
    static Map l(Map map0, @o3.a Object object0) {
        return new k(map0, object0);
    }

    static M3 m(M3 m30, @o3.a Object object0) {
        return !(m30 instanceof l) && !(m30 instanceof com.google.common.collect.v) ? new l(m30, object0) : m30;
    }

    static S3 n(S3 s30, @o3.a Object object0) {
        return !(s30 instanceof m) && !(s30 instanceof W2) ? new m(s30, object0) : s30;
    }

    @J1.c
    static NavigableMap o(NavigableMap navigableMap0) {
        return V4.p(navigableMap0, null);
    }

    @J1.c
    static NavigableMap p(NavigableMap navigableMap0, @o3.a Object object0) {
        return new n(navigableMap0, object0);
    }

    @J1.c
    static NavigableSet q(NavigableSet navigableSet0) {
        return V4.r(navigableSet0, null);
    }

    @J1.c
    static NavigableSet r(NavigableSet navigableSet0, @o3.a Object object0) {
        return new o(navigableSet0, object0);
    }

    @J1.c
    @o3.a
    private static Map.Entry s(@o3.a Map.Entry map$Entry0, @o3.a Object object0) {
        return map$Entry0 == null ? null : new h(map$Entry0, object0);
    }

    static Queue t(Queue queue0, @o3.a Object object0) {
        return !(queue0 instanceof q) ? new q(queue0, object0) : queue0;
    }

    @J1.e
    static Set u(Set set0, @o3.a Object object0) {
        return new s(set0, object0);
    }

    static C4 v(C4 c40, @o3.a Object object0) {
        return !(c40 instanceof t) && !(c40 instanceof com.google.common.collect.v) ? new t(c40, object0) : c40;
    }

    static SortedMap w(SortedMap sortedMap0, @o3.a Object object0) {
        return new u(sortedMap0, object0);
    }

    private static SortedSet x(SortedSet sortedSet0, @o3.a Object object0) {
        return new v(sortedSet0, object0);
    }

    static R4 y(R4 r40, @o3.a Object object0) {
        return r40 instanceof w ? r40 : new w(r40, object0);
    }

    static W4 z(W4 w40, @o3.a Object object0) {
        return new com.google.common.collect.V4.x(w40, object0);
    }
}

