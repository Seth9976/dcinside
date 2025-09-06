package com.google.common.cache;

import J1.b;
import com.google.common.base.O;
import com.google.common.base.V;
import com.google.common.collect.D3;
import com.google.common.collect.D4;
import com.google.common.collect.Q2;
import com.google.common.collect.a3;
import com.google.common.collect.l;
import com.google.common.collect.q3;
import com.google.common.util.concurrent.C0;
import com.google.common.util.concurrent.O0;
import com.google.common.util.concurrent.f1;
import com.google.common.util.concurrent.h0;
import com.google.common.util.concurrent.h1;
import com.google.common.util.concurrent.t0;
import com.google.j2objc.annotations.RetainedWith;
import com.google.j2objc.annotations.Weak;
import j..util.DesugarCollections;
import j..util.concurrent.ConcurrentMap.-CC;
import j..util.concurrent.ConcurrentMap;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import o3.a;

@b(emulated = true)
class m extends AbstractMap implements ConcurrentMap, java.util.concurrent.ConcurrentMap {
    interface A {
        boolean a();

        int b();

        @a
        t c();

        void d(@a Object arg1);

        Object e() throws ExecutionException;

        A f(ReferenceQueue arg1, @a Object arg2, t arg3);

        @a
        Object get();

        boolean isActive();
    }

    final class B extends AbstractCollection {
        final m a;

        @Override
        public void clear() {
            m.this.clear();
        }

        @Override
        public boolean contains(Object object0) {
            return m.this.containsValue(object0);
        }

        @Override
        public boolean isEmpty() {
            return m.this.isEmpty();
        }

        @Override
        public Iterator iterator() {
            return new z(m.this);
        }

        @Override
        public int size() {
            return m.this.size();
        }

        @Override
        public Object[] toArray() {
            return m.V(this).toArray();
        }

        @Override
        public Object[] toArray(Object[] arr_object) {
            return m.V(this).toArray(arr_object);
        }
    }

    static final class C extends E {
        volatile long d;
        @Weak
        t e;
        @Weak
        t f;

        C(ReferenceQueue referenceQueue0, Object object0, int v, @a t t0) {
            super(referenceQueue0, object0, v, t0);
            this.d = 0x7FFFFFFFFFFFFFFFL;
            this.e = m.F();
            this.f = m.F();
        }

        @Override  // com.google.common.cache.m$E
        public void A(t t0) {
            this.e = t0;
        }

        @Override  // com.google.common.cache.m$E
        public void l(t t0) {
            this.f = t0;
        }

        @Override  // com.google.common.cache.m$E
        public void r(long v) {
            this.d = v;
        }

        @Override  // com.google.common.cache.m$E
        public t u() {
            return this.f;
        }

        @Override  // com.google.common.cache.m$E
        public t y() {
            return this.e;
        }

        @Override  // com.google.common.cache.m$E
        public long z() {
            return this.d;
        }
    }

    static final class D extends E {
        volatile long d;
        @Weak
        t e;
        @Weak
        t f;
        volatile long g;
        @Weak
        t h;
        @Weak
        t i;

        D(ReferenceQueue referenceQueue0, Object object0, int v, @a t t0) {
            super(referenceQueue0, object0, v, t0);
            this.d = 0x7FFFFFFFFFFFFFFFL;
            this.e = m.F();
            this.f = m.F();
            this.g = 0x7FFFFFFFFFFFFFFFL;
            this.h = m.F();
            this.i = m.F();
        }

        @Override  // com.google.common.cache.m$E
        public void A(t t0) {
            this.e = t0;
        }

        @Override  // com.google.common.cache.m$E
        public void B(t t0) {
            this.h = t0;
        }

        @Override  // com.google.common.cache.m$E
        public void C(t t0) {
            this.i = t0;
        }

        @Override  // com.google.common.cache.m$E
        public void l(t t0) {
            this.f = t0;
        }

        @Override  // com.google.common.cache.m$E
        public t m() {
            return this.i;
        }

        @Override  // com.google.common.cache.m$E
        public long p() {
            return this.g;
        }

        @Override  // com.google.common.cache.m$E
        public void r(long v) {
            this.d = v;
        }

        @Override  // com.google.common.cache.m$E
        public void s(long v) {
            this.g = v;
        }

        @Override  // com.google.common.cache.m$E
        public t u() {
            return this.f;
        }

        @Override  // com.google.common.cache.m$E
        public t w() {
            return this.h;
        }

        @Override  // com.google.common.cache.m$E
        public t y() {
            return this.e;
        }

        @Override  // com.google.common.cache.m$E
        public long z() {
            return this.d;
        }
    }

    static class E extends WeakReference implements t {
        final int a;
        @a
        final t b;
        volatile A c;

        E(ReferenceQueue referenceQueue0, Object object0, int v, @a t t0) {
            super(object0, referenceQueue0);
            this.c = m.W();
            this.a = v;
            this.b = t0;
        }

        @Override  // com.google.common.cache.t
        public void A(t t0) {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.cache.t
        public void B(t t0) {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.cache.t
        public void C(t t0) {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.cache.t
        public t a() {
            return this.b;
        }

        @Override  // com.google.common.cache.t
        public Object getKey() {
            return this.get();
        }

        @Override  // com.google.common.cache.t
        public int j() {
            return this.a;
        }

        @Override  // com.google.common.cache.t
        public A k() {
            return this.c;
        }

        @Override  // com.google.common.cache.t
        public void l(t t0) {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.cache.t
        public t m() {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.cache.t
        public void n(A m$A0) {
            this.c = m$A0;
        }

        @Override  // com.google.common.cache.t
        public long p() {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.cache.t
        public void r(long v) {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.cache.t
        public void s(long v) {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.cache.t
        public t u() {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.cache.t
        public t w() {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.cache.t
        public t y() {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.cache.t
        public long z() {
            throw new UnsupportedOperationException();
        }
    }

    static class F extends WeakReference implements A {
        final t a;

        F(ReferenceQueue referenceQueue0, Object object0, t t0) {
            super(object0, referenceQueue0);
            this.a = t0;
        }

        @Override  // com.google.common.cache.m$A
        public boolean a() {
            return false;
        }

        @Override  // com.google.common.cache.m$A
        public int b() {
            return 1;
        }

        @Override  // com.google.common.cache.m$A
        public t c() {
            return this.a;
        }

        @Override  // com.google.common.cache.m$A
        public void d(Object object0) {
        }

        @Override  // com.google.common.cache.m$A
        public Object e() {
            return this.get();
        }

        @Override  // com.google.common.cache.m$A
        public A f(ReferenceQueue referenceQueue0, Object object0, t t0) {
            return new F(referenceQueue0, object0, t0);
        }

        @Override  // com.google.common.cache.m$A
        public boolean isActive() {
            return true;
        }
    }

    static final class G extends E {
        volatile long d;
        @Weak
        t e;
        @Weak
        t f;

        G(ReferenceQueue referenceQueue0, Object object0, int v, @a t t0) {
            super(referenceQueue0, object0, v, t0);
            this.d = 0x7FFFFFFFFFFFFFFFL;
            this.e = m.F();
            this.f = m.F();
        }

        @Override  // com.google.common.cache.m$E
        public void B(t t0) {
            this.e = t0;
        }

        @Override  // com.google.common.cache.m$E
        public void C(t t0) {
            this.f = t0;
        }

        @Override  // com.google.common.cache.m$E
        public t m() {
            return this.f;
        }

        @Override  // com.google.common.cache.m$E
        public long p() {
            return this.d;
        }

        @Override  // com.google.common.cache.m$E
        public void s(long v) {
            this.d = v;
        }

        @Override  // com.google.common.cache.m$E
        public t w() {
            return this.e;
        }
    }

    static final class H extends s {
        final int b;

        H(ReferenceQueue referenceQueue0, Object object0, t t0, int v) {
            super(referenceQueue0, object0, t0);
            this.b = v;
        }

        @Override  // com.google.common.cache.m$s
        public int b() {
            return this.b;
        }

        @Override  // com.google.common.cache.m$s
        public A f(ReferenceQueue referenceQueue0, Object object0, t t0) {
            return new H(referenceQueue0, object0, t0, this.b);
        }
    }

    static final class I extends x {
        final int b;

        I(Object object0, int v) {
            super(object0);
            this.b = v;
        }

        @Override  // com.google.common.cache.m$x
        public int b() {
            return this.b;
        }
    }

    static final class J extends F {
        final int b;

        J(ReferenceQueue referenceQueue0, Object object0, t t0, int v) {
            super(referenceQueue0, object0, t0);
            this.b = v;
        }

        @Override  // com.google.common.cache.m$F
        public int b() {
            return this.b;
        }

        @Override  // com.google.common.cache.m$F
        public A f(ReferenceQueue referenceQueue0, Object object0, t t0) {
            return new J(referenceQueue0, object0, t0, this.b);
        }
    }

    static final class K extends AbstractQueue {
        class com.google.common.cache.m.K.a extends d {
            @Weak
            t a;
            @Weak
            t b;

            com.google.common.cache.m.K.a() {
                this.a = this;
                this.b = this;
            }

            @Override  // com.google.common.cache.m$d
            public void B(t t0) {
                this.a = t0;
            }

            @Override  // com.google.common.cache.m$d
            public void C(t t0) {
                this.b = t0;
            }

            @Override  // com.google.common.cache.m$d
            public t m() {
                return this.b;
            }

            @Override  // com.google.common.cache.m$d
            public long p() {
                return 0x7FFFFFFFFFFFFFFFL;
            }

            @Override  // com.google.common.cache.m$d
            public void s(long v) {
            }

            @Override  // com.google.common.cache.m$d
            public t w() {
                return this.a;
            }
        }

        final t a;

        K() {
            this.a = new com.google.common.cache.m.K.a(this);
        }

        public boolean a(t t0) {
            m.d(t0.m(), t0.w());
            m.d(this.a.m(), t0);
            m.d(t0, this.a);
            return true;
        }

        @a
        public t b() {
            t t0 = this.a.w();
            return t0 == this.a ? null : t0;
        }

        @a
        public t c() {
            t t0 = this.a.w();
            if(t0 == this.a) {
                return null;
            }
            this.remove(t0);
            return t0;
        }

        @Override
        public void clear() {
            t t1;
            for(t t0 = this.a.w(); true; t0 = t2) {
                t1 = this.a;
                if(t0 == t1) {
                    break;
                }
                t t2 = t0.w();
                m.H(t0);
            }
            t1.B(t1);
            this.a.C(this.a);
        }

        @Override
        public boolean contains(Object object0) {
            return ((t)object0).w() != q.a;
        }

        @Override
        public boolean isEmpty() {
            return this.a.w() == this.a;
        }

        @Override
        public Iterator iterator() {
            class com.google.common.cache.m.K.b extends l {
                final K b;

                com.google.common.cache.m.K.b(t t0) {
                    super(t0);
                }

                @Override  // com.google.common.collect.l
                @a
                protected Object a(Object object0) {
                    return this.b(((t)object0));
                }

                @a
                protected t b(t t0) {
                    t t1 = t0.w();
                    return t1 == K.this.a ? null : t1;
                }
            }

            return new com.google.common.cache.m.K.b(this, this.b());
        }

        @Override
        public boolean offer(Object object0) {
            return this.a(((t)object0));
        }

        @Override
        @a
        public Object peek() {
            return this.b();
        }

        @Override
        @a
        public Object poll() {
            return this.c();
        }

        @Override
        @O1.a
        public boolean remove(Object object0) {
            t t0 = ((t)object0).m();
            t t1 = ((t)object0).w();
            m.d(t0, t1);
            m.H(((t)object0));
            return t1 != q.a;
        }

        @Override
        public int size() {
            t t0 = this.a.w();
            int v = 0;
            while(t0 != this.a) {
                ++v;
                t0 = t0.w();
            }
            return v;
        }
    }

    final class L implements Map.Entry {
        final Object a;
        Object b;
        final m c;

        L(Object object0, Object object1) {
            this.a = object0;
            this.b = object1;
        }

        @Override
        public boolean equals(@a Object object0) {
            if(object0 instanceof Map.Entry) {
                Object object1 = ((Map.Entry)object0).getKey();
                return this.a.equals(object1) && this.b.equals(((Map.Entry)object0).getValue());
            }
            return false;
        }

        @Override
        public Object getKey() {
            return this.a;
        }

        @Override
        public Object getValue() {
            return this.b;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode() ^ this.b.hashCode();
        }

        @Override
        public Object setValue(Object object0) {
            Object object1 = m.this.put(this.a, object0);
            this.b = object0;
            return object1;
        }

        @Override
        public String toString() {
            return this.getKey() + "=" + this.getValue();
        }
    }

    class com.google.common.cache.m.a implements A {
        com.google.common.cache.m.a() {
            super();
        }

        @Override  // com.google.common.cache.m$A
        public boolean a() {
            return false;
        }

        @Override  // com.google.common.cache.m$A
        public int b() {
            return 0;
        }

        @Override  // com.google.common.cache.m$A
        @a
        public t c() {
            return null;
        }

        @Override  // com.google.common.cache.m$A
        public void d(Object object0) {
        }

        @Override  // com.google.common.cache.m$A
        @a
        public Object e() {
            return null;
        }

        @Override  // com.google.common.cache.m$A
        public A f(ReferenceQueue referenceQueue0, @a Object object0, t t0) {
            return this;
        }

        @Override  // com.google.common.cache.m$A
        @a
        public Object get() {
            return null;
        }

        @Override  // com.google.common.cache.m$A
        public boolean isActive() {
            return false;
        }
    }

    class com.google.common.cache.m.b extends AbstractQueue {
        com.google.common.cache.m.b() {
            super();
        }

        @Override
        public Iterator iterator() {
            return a3.B().i();
        }

        @Override
        public boolean offer(Object o) {
            return true;
        }

        @Override
        @a
        public Object peek() {
            return null;
        }

        @Override
        @a
        public Object poll() {
            return null;
        }

        @Override
        public int size() {
            return 0;
        }
    }

    abstract class c extends AbstractSet {
        final m a;

        @Override
        public void clear() {
            m.this.clear();
        }

        @Override
        public boolean isEmpty() {
            return m.this.isEmpty();
        }

        @Override
        public int size() {
            return m.this.size();
        }

        @Override
        public Object[] toArray() {
            return m.V(this).toArray();
        }

        @Override
        public Object[] toArray(Object[] arr_object) {
            return m.V(this).toArray(arr_object);
        }
    }

    static abstract class d implements t {
        @Override  // com.google.common.cache.t
        public void A(t t0) {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.cache.t
        public void B(t t0) {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.cache.t
        public void C(t t0) {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.cache.t
        public t a() {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.cache.t
        public Object getKey() {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.cache.t
        public int j() {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.cache.t
        public A k() {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.cache.t
        public void l(t t0) {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.cache.t
        public t m() {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.cache.t
        public void n(A m$A0) {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.cache.t
        public long p() {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.cache.t
        public void r(long v) {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.cache.t
        public void s(long v) {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.cache.t
        public t u() {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.cache.t
        public t w() {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.cache.t
        public t y() {
            throw new UnsupportedOperationException();
        }

        @Override  // com.google.common.cache.t
        public long z() {
            throw new UnsupportedOperationException();
        }
    }

    static final class e extends AbstractQueue {
        class com.google.common.cache.m.e.a extends d {
            @Weak
            t a;
            @Weak
            t b;

            com.google.common.cache.m.e.a() {
                this.a = this;
                this.b = this;
            }

            @Override  // com.google.common.cache.m$d
            public void A(t t0) {
                this.a = t0;
            }

            @Override  // com.google.common.cache.m$d
            public void l(t t0) {
                this.b = t0;
            }

            @Override  // com.google.common.cache.m$d
            public void r(long v) {
            }

            @Override  // com.google.common.cache.m$d
            public t u() {
                return this.b;
            }

            @Override  // com.google.common.cache.m$d
            public t y() {
                return this.a;
            }

            @Override  // com.google.common.cache.m$d
            public long z() {
                return 0x7FFFFFFFFFFFFFFFL;
            }
        }

        final t a;

        e() {
            this.a = new com.google.common.cache.m.e.a(this);
        }

        public boolean a(t t0) {
            m.c(t0.u(), t0.y());
            m.c(this.a.u(), t0);
            m.c(t0, this.a);
            return true;
        }

        @a
        public t b() {
            t t0 = this.a.y();
            return t0 == this.a ? null : t0;
        }

        @a
        public t c() {
            t t0 = this.a.y();
            if(t0 == this.a) {
                return null;
            }
            this.remove(t0);
            return t0;
        }

        @Override
        public void clear() {
            t t1;
            for(t t0 = this.a.y(); true; t0 = t2) {
                t1 = this.a;
                if(t0 == t1) {
                    break;
                }
                t t2 = t0.y();
                m.G(t0);
            }
            t1.A(t1);
            this.a.l(this.a);
        }

        @Override
        public boolean contains(Object object0) {
            return ((t)object0).y() != q.a;
        }

        @Override
        public boolean isEmpty() {
            return this.a.y() == this.a;
        }

        @Override
        public Iterator iterator() {
            class com.google.common.cache.m.e.b extends l {
                final e b;

                com.google.common.cache.m.e.b(t t0) {
                    super(t0);
                }

                @Override  // com.google.common.collect.l
                @a
                protected Object a(Object object0) {
                    return this.b(((t)object0));
                }

                @a
                protected t b(t t0) {
                    t t1 = t0.y();
                    return t1 == e.this.a ? null : t1;
                }
            }

            return new com.google.common.cache.m.e.b(this, this.b());
        }

        @Override
        public boolean offer(Object object0) {
            return this.a(((t)object0));
        }

        @Override
        @a
        public Object peek() {
            return this.b();
        }

        @Override
        @a
        public Object poll() {
            return this.c();
        }

        @Override
        @O1.a
        public boolean remove(Object object0) {
            t t0 = ((t)object0).u();
            t t1 = ((t)object0).y();
            m.c(t0, t1);
            m.G(((t)object0));
            return t1 != q.a;
        }

        @Override
        public int size() {
            t t0 = this.a.y();
            int v = 0;
            while(t0 != this.a) {
                ++v;
                t0 = t0.y();
            }
            return v;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    static abstract class f extends Enum {
        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class com.google.common.cache.m.f.a extends f {
            com.google.common.cache.m.f.a(String s, int v) {
                super(s, v, null);
            }

            @Override  // com.google.common.cache.m$f
            t f(r m$r0, Object object0, int v, @a t t0) {
                return new w(object0, v, t0);
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class com.google.common.cache.m.f.b extends f {
            com.google.common.cache.m.f.b(String s, int v) {
                super(s, v, null);
            }

            @Override  // com.google.common.cache.m$f
            t c(r m$r0, t t0, t t1, Object object0) {
                t t2 = super.c(m$r0, t0, t1, object0);
                this.b(t0, t2);
                return t2;
            }

            @Override  // com.google.common.cache.m$f
            t f(r m$r0, Object object0, int v, @a t t0) {
                return new u(object0, v, t0);
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class com.google.common.cache.m.f.c extends f {
            com.google.common.cache.m.f.c(String s, int v) {
                super(s, v, null);
            }

            @Override  // com.google.common.cache.m$f
            t c(r m$r0, t t0, t t1, Object object0) {
                t t2 = super.c(m$r0, t0, t1, object0);
                this.d(t0, t2);
                return t2;
            }

            @Override  // com.google.common.cache.m$f
            t f(r m$r0, Object object0, int v, @a t t0) {
                return new y(object0, v, t0);
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class com.google.common.cache.m.f.d extends f {
            com.google.common.cache.m.f.d(String s, int v) {
                super(s, v, null);
            }

            @Override  // com.google.common.cache.m$f
            t c(r m$r0, t t0, t t1, Object object0) {
                t t2 = super.c(m$r0, t0, t1, object0);
                this.b(t0, t2);
                this.d(t0, t2);
                return t2;
            }

            @Override  // com.google.common.cache.m$f
            t f(r m$r0, Object object0, int v, @a t t0) {
                return new v(object0, v, t0);
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class com.google.common.cache.m.f.e extends f {
            com.google.common.cache.m.f.e(String s, int v) {
                super(s, v, null);
            }

            @Override  // com.google.common.cache.m$f
            t f(r m$r0, Object object0, int v, @a t t0) {
                return new E(m$r0.h, object0, v, t0);
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class com.google.common.cache.m.f.f extends f {
            com.google.common.cache.m.f.f(String s, int v) {
                super(s, v, null);
            }

            @Override  // com.google.common.cache.m$f
            t c(r m$r0, t t0, t t1, Object object0) {
                t t2 = super.c(m$r0, t0, t1, object0);
                this.b(t0, t2);
                return t2;
            }

            @Override  // com.google.common.cache.m$f
            t f(r m$r0, Object object0, int v, @a t t0) {
                return new C(m$r0.h, object0, v, t0);
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class g extends f {
            g(String s, int v) {
                super(s, v, null);
            }

            @Override  // com.google.common.cache.m$f
            t c(r m$r0, t t0, t t1, Object object0) {
                t t2 = super.c(m$r0, t0, t1, object0);
                this.d(t0, t2);
                return t2;
            }

            @Override  // com.google.common.cache.m$f
            t f(r m$r0, Object object0, int v, @a t t0) {
                return new G(m$r0.h, object0, v, t0);
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class h extends f {
            h(String s, int v) {
                super(s, v, null);
            }

            @Override  // com.google.common.cache.m$f
            t c(r m$r0, t t0, t t1, Object object0) {
                t t2 = super.c(m$r0, t0, t1, object0);
                this.b(t0, t2);
                this.d(t0, t2);
                return t2;
            }

            @Override  // com.google.common.cache.m$f
            t f(r m$r0, Object object0, int v, @a t t0) {
                return new D(m$r0.h, object0, v, t0);
            }
        }

        public static final enum f a = null;
        public static final enum f b = null;
        public static final enum f c = null;
        public static final enum f d = null;
        public static final enum f e = null;
        public static final enum f f = null;
        public static final enum f g = null;
        public static final enum f h = null;
        static final int i = 1;
        static final int j = 2;
        static final int k = 4;
        static final f[] l;
        private static final f[] m;

        static {
            com.google.common.cache.m.f.a m$f$a0 = new com.google.common.cache.m.f.a("STRONG", 0);
            f.a = m$f$a0;
            com.google.common.cache.m.f.b m$f$b0 = new com.google.common.cache.m.f.b("STRONG_ACCESS", 1);
            f.b = m$f$b0;
            com.google.common.cache.m.f.c m$f$c0 = new com.google.common.cache.m.f.c("STRONG_WRITE", 2);
            f.c = m$f$c0;
            com.google.common.cache.m.f.d m$f$d0 = new com.google.common.cache.m.f.d("STRONG_ACCESS_WRITE", 3);
            f.d = m$f$d0;
            com.google.common.cache.m.f.e m$f$e0 = new com.google.common.cache.m.f.e("WEAK", 4);
            f.e = m$f$e0;
            com.google.common.cache.m.f.f m$f$f0 = new com.google.common.cache.m.f.f("WEAK_ACCESS", 5);
            f.f = m$f$f0;
            g m$f$g0 = new g("WEAK_WRITE", 6);
            f.g = m$f$g0;
            h m$f$h0 = new h("WEAK_ACCESS_WRITE", 7);
            f.h = m$f$h0;
            f.m = new f[]{f.a, f.b, f.c, f.d, f.e, f.f, f.g, f.h};
            f.l = new f[]{m$f$a0, m$f$b0, m$f$c0, m$f$d0, m$f$e0, m$f$f0, m$f$g0, m$f$h0};
        }

        private f(String s, int v) {
            super(s, v);
        }

        f(String s, int v, com.google.common.cache.m.a m$a0) {
            this(s, v);
        }

        private static f[] a() [...] // Inlined contents

        void b(t t0, t t1) {
            t1.r(t0.z());
            m.c(t0.u(), t1);
            m.c(t1, t0.y());
            m.G(t0);
        }

        t c(r m$r0, t t0, t t1, Object object0) {
            return this.f(m$r0, object0, t0.j(), t1);
        }

        void d(t t0, t t1) {
            t1.s(t0.p());
            m.d(t0.m(), t1);
            m.d(t1, t0.w());
            m.H(t0);
        }

        // 去混淆评级： 低(20)
        static f e(com.google.common.cache.m.t m$t0, boolean z, boolean z1) {
            return f.l[z | (z1 ? 2 : 0)];
        }

        abstract t f(r arg1, Object arg2, int arg3, @a t arg4);

        public static f valueOf(String s) {
            return (f)Enum.valueOf(f.class, s);
        }

        public static f[] values() {
            return (f[])f.m.clone();
        }
    }

    final class com.google.common.cache.m.g extends i {
        public Map.Entry f() {
            return this.c();
        }

        @Override  // com.google.common.cache.m$i
        public Object next() {
            return this.f();
        }
    }

    final class com.google.common.cache.m.h extends c {
        final m b;

        @Override
        public boolean contains(Object object0) {
            if(!(object0 instanceof Map.Entry)) {
                return false;
            }
            Object object1 = ((Map.Entry)object0).getKey();
            if(object1 == null) {
                return false;
            }
            Object object2 = m.this.get(object1);
            if(object2 != null) {
                Object object3 = ((Map.Entry)object0).getValue();
                return m.this.f.d(object3, object2);
            }
            return false;
        }

        @Override
        public Iterator iterator() {
            return new com.google.common.cache.m.g(m.this);
        }

        @Override
        public boolean remove(Object object0) {
            if(!(object0 instanceof Map.Entry)) {
                return false;
            }
            Object object1 = ((Map.Entry)object0).getKey();
            if(object1 != null) {
                Object object2 = ((Map.Entry)object0).getValue();
                return m.this.remove(object1, object2);
            }
            return false;
        }
    }

    abstract class i implements Iterator {
        int a;
        int b;
        @a
        r c;
        @a
        AtomicReferenceArray d;
        @a
        t e;
        @a
        L f;
        @a
        L g;
        final m h;

        i() {
            this.a = m0.c.length - 1;
            this.b = -1;
            this.a();
        }

        final void a() {
            this.f = null;
            if(this.d()) {
                return;
            }
            if(this.e()) {
                return;
            }
        alab1:
            while(true) {
                while(true) {
                    int v = this.a;
                    if(v < 0) {
                        break alab1;
                    }
                    this.a = v - 1;
                    r m$r0 = m.this.c[v];
                    this.c = m$r0;
                    if(m$r0.b == 0) {
                        break;
                    }
                    this.d = this.c.f;
                    this.b = this.c.f.length() - 1;
                    if(!this.e()) {
                        break;
                    }
                    break alab1;
                }
            }
        }

        boolean b(t t0) {
            try {
                long v1 = m.this.p.a();
                Object object0 = t0.getKey();
                Object object1 = m.this.u(t0, v1);
                if(object1 != null) {
                    this.f = new L(m.this, object0, object1);
                    return true;
                }
                return false;
            }
            finally {
                this.c.J();
            }
        }

        L c() {
            L m$L0 = this.f;
            if(m$L0 == null) {
                throw new NoSuchElementException();
            }
            this.g = m$L0;
            this.a();
            return this.g;
        }

        boolean d() {
            t t0 = this.e;
            if(t0 != null) {
                while(true) {
                    this.e = t0.a();
                    t t1 = this.e;
                    if(t1 == null) {
                        break;
                    }
                    if(this.b(t1)) {
                        return true;
                    }
                    t0 = this.e;
                }
            }
            return false;
        }

        boolean e() {
            int v;
            while((v = this.b) >= 0) {
                this.b = v - 1;
                t t0 = (t)this.d.get(v);
                this.e = t0;
                if(t0 != null && (this.b(t0) || this.d())) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public boolean hasNext() {
            return this.f != null;
        }

        @Override
        public abstract Object next();

        @Override
        public void remove() {
            com.google.common.base.H.g0(this.g != null);
            m.this.remove(this.g.getKey());
            this.g = null;
        }
    }

    final class j extends i {
        @Override  // com.google.common.cache.m$i
        public Object next() {
            return this.c().getKey();
        }
    }

    final class k extends c {
        final m b;

        @Override
        public boolean contains(Object object0) {
            return m.this.containsKey(object0);
        }

        @Override
        public Iterator iterator() {
            return new j(m.this);
        }

        @Override
        public boolean remove(Object object0) {
            return m.this.remove(object0) != null;
        }
    }

    static final class com.google.common.cache.m.l extends p implements com.google.common.cache.l, Serializable {
        @a
        transient com.google.common.cache.l o;
        private static final long p = 1L;

        com.google.common.cache.m.l(m m0) {
            super(m0);
        }

        @Override  // com.google.common.cache.l
        public Object D(Object object0) {
            return this.o.D(object0);
        }

        @Override  // com.google.common.cache.l
        public Q2 F(Iterable iterable0) throws ExecutionException {
            return this.o.F(iterable0);
        }

        @Override  // com.google.common.cache.l
        public void I(Object object0) {
            this.o.I(object0);
        }

        private void N(ObjectInputStream objectInputStream0) throws IOException, ClassNotFoundException {
            objectInputStream0.defaultReadObject();
            this.o = this.P().b(this.l);
        }

        private Object O() {
            return this.o;
        }

        @Override  // com.google.common.cache.l
        public Object apply(Object object0) {
            return this.o.apply(object0);
        }

        @Override  // com.google.common.cache.l
        public Object get(Object object0) throws ExecutionException {
            return this.o.get(object0);
        }
    }

    static class com.google.common.cache.m.m implements A {
        volatile A a;
        final O0 b;
        final O c;
        final Thread d;

        public com.google.common.cache.m.m() {
            this(m.W());
        }

        public com.google.common.cache.m.m(A m$A0) {
            this.b = O0.F();
            this.c = O.e();
            this.a = m$A0;
            this.d = Thread.currentThread();
        }

        @Override  // com.google.common.cache.m$A
        public boolean a() {
            return true;
        }

        @Override  // com.google.common.cache.m$A
        public int b() {
            return this.a.b();
        }

        @Override  // com.google.common.cache.m$A
        public t c() {
            return null;
        }

        @Override  // com.google.common.cache.m$A
        public void d(@a Object object0) {
            if(object0 != null) {
                this.n(object0);
                return;
            }
            this.a = m.W();
        }

        @Override  // com.google.common.cache.m$A
        public Object e() throws ExecutionException {
            return h1.f(this.b);
        }

        @Override  // com.google.common.cache.m$A
        public A f(ReferenceQueue referenceQueue0, @a Object object0, t t0) {
            return this;
        }

        @Override  // com.google.common.cache.m$A
        public Object get() {
            return this.a.get();
        }

        public long h() {
            return this.c.g(TimeUnit.NANOSECONDS);
        }

        private t0 i(Throwable throwable0) {
            return h0.n(throwable0);
        }

        @Override  // com.google.common.cache.m$A
        public boolean isActive() {
            return this.a.isActive();
        }

        Thread j() {
            return this.d;
        }

        public A k() {
            return this.a;
        }

        // 检测为 Lambda 实现
        private Object l(Object object0) [...]

        public t0 m(Object object0, com.google.common.cache.g g0) {
            try {
                this.c.k();
                Object object1 = this.a.get();
                if(object1 == null) {
                    Object object2 = g0.d(object0);
                    return this.n(object2) ? this.b : h0.o(object2);
                }
                t0 t00 = g0.f(object0, object1);
                return t00 == null ? h0.o(null) : h0.B(t00, (Object object0) -> {
                    this.n(object0);
                    return object0;
                }, C0.c());
            }
            catch(Throwable throwable0) {
            }
            t0 t01 = this.o(throwable0) ? this.b : this.i(throwable0);
            if(throwable0 instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            return t01;
        }

        @O1.a
        public boolean n(@a Object object0) {
            return this.b.B(object0);
        }

        @O1.a
        public boolean o(Throwable throwable0) {
            return this.b.C(throwable0);
        }
    }

    static class n extends o implements com.google.common.cache.l {
        private static final long c = 1L;

        n(com.google.common.cache.d d0, com.google.common.cache.g g0) {
            super(new m(d0, ((com.google.common.cache.g)com.google.common.base.H.E(g0))), null);
        }

        @Override  // com.google.common.cache.l
        @O1.a
        public Object D(Object object0) {
            try {
                return this.get(object0);
            }
            catch(ExecutionException executionException0) {
                throw new f1(executionException0.getCause());
            }
        }

        @Override  // com.google.common.cache.l
        public Q2 F(Iterable iterable0) throws ExecutionException {
            return this.a.q(iterable0);
        }

        @Override  // com.google.common.cache.l
        public void I(Object object0) {
            this.a.O(object0);
        }

        private void a(ObjectInputStream objectInputStream0) throws InvalidObjectException {
            throw new InvalidObjectException("Use LoadingSerializationProxy");
        }

        @Override  // com.google.common.cache.l
        public final Object apply(Object object0) {
            return this.D(object0);
        }

        @Override  // com.google.common.cache.m$o
        Object b() {
            return new com.google.common.cache.m.l(this.a);
        }

        @Override  // com.google.common.cache.l
        public Object get(Object object0) throws ExecutionException {
            return this.a.v(object0);
        }
    }

    static class o implements com.google.common.cache.c, Serializable {
        final m a;
        private static final long b = 1L;

        o(com.google.common.cache.d d0) {
            this(new m(d0, null));
        }

        private o(m m0) {
            this.a = m0;
        }

        o(m m0, com.google.common.cache.m.a m$a0) {
            this(m0);
        }

        @Override  // com.google.common.cache.c
        public void A() {
            this.a.b();
        }

        @Override  // com.google.common.cache.c
        public Q2 B(Iterable iterable0) {
            return this.a.r(iterable0);
        }

        @Override  // com.google.common.cache.c
        public com.google.common.cache.h C() {
            com.google.common.cache.a.a a$a0 = new com.google.common.cache.a.a();
            a$a0.g(this.a.r);
            r[] arr_m$r = this.a.c;
            for(int v = 0; v < arr_m$r.length; ++v) {
                a$a0.g(arr_m$r[v].n);
            }
            return a$a0.f();
        }

        @Override  // com.google.common.cache.c
        public void H(Object object0) {
            com.google.common.base.H.E(object0);
            this.a.remove(object0);
        }

        private void a(ObjectInputStream objectInputStream0) throws InvalidObjectException {
            throw new InvalidObjectException("Use ManualSerializationProxy");
        }

        Object b() {
            return new p(this.a);
        }

        @Override  // com.google.common.cache.c
        public java.util.concurrent.ConcurrentMap c() {
            return this.a;
        }

        @Override  // com.google.common.cache.c
        public void j() {
            this.a.clear();
        }

        @Override  // com.google.common.cache.c
        public Object l(Object object0, Callable callable0) throws ExecutionException {
            class com.google.common.cache.m.o.a extends com.google.common.cache.g {
                final Callable a;

                com.google.common.cache.m.o.a(Callable callable0) {
                    this.a = callable0;
                    super();
                }

                @Override  // com.google.common.cache.g
                public Object d(Object object0) throws Exception {
                    return this.a.call();
                }
            }

            com.google.common.base.H.E(callable0);
            com.google.common.cache.m.o.a m$o$a0 = new com.google.common.cache.m.o.a(this, callable0);
            return this.a.o(object0, m$o$a0);
        }

        @Override  // com.google.common.cache.c
        public void put(Object object0, Object object1) {
            this.a.put(object0, object1);
        }

        @Override  // com.google.common.cache.c
        public void putAll(Map map0) {
            this.a.putAll(map0);
        }

        @Override  // com.google.common.cache.c
        public long size() {
            return this.a.B();
        }

        @Override  // com.google.common.cache.c
        @a
        public Object u(Object object0) {
            return this.a.t(object0);
        }

        @Override  // com.google.common.cache.c
        public void y(Iterable iterable0) {
            this.a.x(iterable0);
        }
    }

    static class p extends com.google.common.cache.j implements Serializable {
        final com.google.common.cache.m.t a;
        final com.google.common.cache.m.t b;
        final com.google.common.base.m c;
        final com.google.common.base.m d;
        final long e;
        final long f;
        final long g;
        final com.google.common.cache.B h;
        final int i;
        final com.google.common.cache.v j;
        @a
        final V k;
        final com.google.common.cache.g l;
        @a
        transient com.google.common.cache.c m;
        private static final long n = 1L;

        private p(com.google.common.cache.m.t m$t0, com.google.common.cache.m.t m$t1, com.google.common.base.m m0, com.google.common.base.m m1, long v, long v1, long v2, com.google.common.cache.B b0, int v3, com.google.common.cache.v v4, V v5, com.google.common.cache.g g0) {
            this.a = m$t0;
            this.b = m$t1;
            this.c = m0;
            this.d = m1;
            this.e = v;
            this.f = v1;
            this.g = v2;
            this.h = b0;
            this.i = v3;
            this.j = v4;
            if(v5 == V.b() || v5 == com.google.common.cache.d.x) {
                v5 = null;
            }
            this.k = v5;
            this.l = g0;
        }

        p(m m0) {
            this(m0.g, m0.h, m0.e, m0.f, m0.l, m0.k, m0.i, m0.j, m0.d, m0.o, m0.p, m0.s);
        }

        @Override  // com.google.common.cache.j
        protected Object K() {
            return this.M();
        }

        @Override  // com.google.common.cache.j
        protected com.google.common.cache.c M() {
            return this.m;
        }

        private void N(ObjectInputStream objectInputStream0) throws IOException, ClassNotFoundException {
            objectInputStream0.defaultReadObject();
            this.m = this.P().a();
        }

        private Object O() {
            return this.m;
        }

        com.google.common.cache.d P() {
            com.google.common.cache.d d0 = com.google.common.cache.d.D().H(this.a).I(this.b).z(this.c).L(this.d).e(this.i).G(this.j);
            d0.a = false;
            long v = this.e;
            if(v > 0L) {
                d0.g(v, TimeUnit.NANOSECONDS);
            }
            long v1 = this.f;
            if(v1 > 0L) {
                d0.f(v1, TimeUnit.NANOSECONDS);
            }
            com.google.common.cache.B b0 = this.h;
            if(b0 == com.google.common.cache.d.f.a) {
                long v3 = this.g;
                if(v3 != -1L) {
                    d0.B(v3);
                }
            }
            else {
                d0.O(b0);
                long v2 = this.g;
                if(v2 != -1L) {
                    d0.C(v2);
                }
            }
            V v4 = this.k;
            if(v4 != null) {
                d0.K(v4);
            }
            return d0;
        }
    }

    static enum q implements t {
        INSTANCE;

        @Override  // com.google.common.cache.t
        public void A(t t0) {
        }

        @Override  // com.google.common.cache.t
        public void B(t t0) {
        }

        @Override  // com.google.common.cache.t
        public void C(t t0) {
        }

        @Override  // com.google.common.cache.t
        @a
        public t a() {
            return null;
        }

        private static q[] b() [...] // Inlined contents

        @Override  // com.google.common.cache.t
        @a
        public Object getKey() {
            return null;
        }

        @Override  // com.google.common.cache.t
        public int j() {
            return 0;
        }

        @Override  // com.google.common.cache.t
        @a
        public A k() {
            return null;
        }

        @Override  // com.google.common.cache.t
        public void l(t t0) {
        }

        @Override  // com.google.common.cache.t
        public t m() {
            return this;
        }

        @Override  // com.google.common.cache.t
        public void n(A m$A0) {
        }

        @Override  // com.google.common.cache.t
        public long p() {
            return 0L;
        }

        @Override  // com.google.common.cache.t
        public void r(long v) {
        }

        @Override  // com.google.common.cache.t
        public void s(long v) {
        }

        @Override  // com.google.common.cache.t
        public t u() {
            return this;
        }

        @Override  // com.google.common.cache.t
        public t w() {
            return this;
        }

        @Override  // com.google.common.cache.t
        public t y() {
            return this;
        }

        @Override  // com.google.common.cache.t
        public long z() {
            return 0L;
        }
    }

    static class r extends ReentrantLock {
        @Weak
        final m a;
        volatile int b;
        @P1.a("this")
        long c;
        int d;
        int e;
        @a
        volatile AtomicReferenceArray f;
        final long g;
        @a
        final ReferenceQueue h;
        @a
        final ReferenceQueue i;
        final Queue j;
        final AtomicInteger k;
        @P1.a("this")
        final Queue l;
        @P1.a("this")
        final Queue m;
        final com.google.common.cache.a.b n;

        r(m m0, int v, long v1, com.google.common.cache.a.b a$b0) {
            this.k = new AtomicInteger();
            this.a = m0;
            this.g = v1;
            this.n = (com.google.common.cache.a.b)com.google.common.base.H.E(a$b0);
            this.B(this.I(v));
            ReferenceQueue referenceQueue0 = null;
            this.h = m0.Z() ? new ReferenceQueue() : null;
            if(m0.a0()) {
                referenceQueue0 = new ReferenceQueue();
            }
            this.i = referenceQueue0;
            Queue queue0 = m0.Y() ? new ConcurrentLinkedQueue() : m.h();
            this.j = queue0;
            Queue queue1 = m0.c0() ? new K() : m.h();
            this.l = queue1;
            Queue queue2 = m0.Y() ? new e() : m.h();
            this.m = queue2;
        }

        @P1.a("this")
        t A() {
            for(Object object0: this.m) {
                t t0 = (t)object0;
                if(t0.k().b() > 0) {
                    return t0;
                }
                if(false) {
                    break;
                }
            }
            throw new AssertionError();
        }

        void B(AtomicReferenceArray atomicReferenceArray0) {
            this.e = atomicReferenceArray0.length() * 3 / 4;
            if(!this.a.g()) {
                int v = this.e;
                if(((long)v) == this.g) {
                    this.e = v + 1;
                }
            }
            this.f = atomicReferenceArray0;
        }

        @a
        com.google.common.cache.m.m C(Object object0, int v, boolean z) {
            com.google.common.cache.m.m m$m1;
            com.google.common.cache.m.m m$m0;
            t t0;
            int v2;
            AtomicReferenceArray atomicReferenceArray0;
            this.lock();
            try {
                long v1 = this.a.p.a();
                this.L(v1);
                atomicReferenceArray0 = this.f;
                v2 = atomicReferenceArray0.length() - 1 & v;
                t0 = (t)atomicReferenceArray0.get(v2);
                t t1 = t0;
                while(true) {
                    if(t1 == null) {
                        goto label_23;
                    }
                    Object object1 = t1.getKey();
                    if(t1.j() != v || object1 == null || !this.a.e.d(object0, object1)) {
                        t1 = t1.a();
                        continue;
                    }
                    A m$A0 = t1.k();
                    if(!m$A0.a() && (!z || v1 - t1.p() >= this.a.m)) {
                        ++this.d;
                        m$m0 = new com.google.common.cache.m.m(m$A0);
                        t1.n(m$m0);
                        break;
                    }
                    goto label_20;
                }
            }
            catch(Throwable throwable0) {
                this.unlock();
                this.K();
                throw throwable0;
            }
            this.unlock();
            this.K();
            return m$m0;
        label_20:
            this.unlock();
            this.K();
            return null;
            try {
            label_23:
                ++this.d;
                m$m1 = new com.google.common.cache.m.m();
                t t2 = this.H(object0, v, t0);
                t2.n(m$m1);
                atomicReferenceArray0.set(v2, t2);
            }
            catch(Throwable throwable0) {
                this.unlock();
                this.K();
                throw throwable0;
            }
            this.unlock();
            this.K();
            return m$m1;
        }

        // 检测为 Lambda 实现
        private void D(Object object0, int v, com.google.common.cache.m.m m$m0, t0 t00) [...]

        t0 E(Object object0, int v, com.google.common.cache.m.m m$m0, com.google.common.cache.g g0) {
            t0 t00 = m$m0.m(object0, g0);
            t00.addListener(() -> try {
                this.u(object0, v, m$m0, t00);
            }
            catch(Throwable throwable0) {
                m.B.log(Level.WARNING, "Exception thrown during refresh", throwable0);
                m$m0.o(throwable0);
            }, C0.c());
            return t00;
        }

        Object F(Object object0, int v, com.google.common.cache.m.m m$m0, com.google.common.cache.g g0) throws ExecutionException {
            return this.u(object0, v, m$m0, m$m0.m(object0, g0));
        }

        Object G(Object object0, int v, com.google.common.cache.g g0) throws ExecutionException {
            Object object3;
            A m$A1;
            Object object2;
            com.google.common.cache.m.m m$m0;
            t t0;
            Object object1;
            int v3;
            AtomicReferenceArray atomicReferenceArray0;
            A m$A0;
            this.lock();
            try {
                m$A0 = null;
                long v1 = this.a.p.a();
                this.L(v1);
                int v2 = this.b - 1;
                atomicReferenceArray0 = this.f;
                v3 = v & atomicReferenceArray0.length() - 1;
                object1 = atomicReferenceArray0.get(v3);
                t0 = (t)object1;
                while(true) {
                    m$m0 = null;
                    if(t0 == null) {
                        goto label_36;
                    }
                    object2 = t0.getKey();
                    if(t0.j() == v && object2 != null && this.a.e.d(object0, object2)) {
                        break;
                    }
                    t0 = t0.a();
                }
                m$A1 = t0.k();
                if(m$A1.a()) {
                    goto label_33;
                }
                else {
                    object3 = m$A1.get();
                    if(object3 == null) {
                        this.n(object2, v, null, m$A1.b(), com.google.common.cache.u.c);
                        goto label_23;
                    }
                    else {
                        if(this.a.y(t0, v1)) {
                            this.n(object2, v, object3, m$A1.b(), com.google.common.cache.u.d);
                        label_23:
                            this.l.remove(t0);
                            this.m.remove(t0);
                            this.b = v2;
                            m$A0 = m$A1;
                            goto label_36;
                        }
                        this.P(t0, v1);
                        this.n.a(1);
                        goto label_30;
                    }
                    goto label_36;
                }
                goto label_37;
            }
            catch(Throwable throwable0) {
                this.unlock();
                this.K();
                throw throwable0;
            }
        label_30:
            this.unlock();
            this.K();
            return object3;
            try {
            label_33:
                boolean z = false;
                m$A0 = m$A1;
                goto label_37;
            label_36:
                z = true;
            label_37:
                if(z) {
                    m$m0 = new com.google.common.cache.m.m();
                    if(t0 == null) {
                        t0 = this.H(object0, v, ((t)object1));
                        t0.n(m$m0);
                        atomicReferenceArray0.set(v3, t0);
                    }
                    else {
                        t0.n(m$m0);
                    }
                }
            }
            catch(Throwable throwable0) {
                this.unlock();
                this.K();
                throw throwable0;
            }
            this.unlock();
            this.K();
            if(z) {
                try {
                    return this.F(object0, v, m$m0, g0);
                }
                finally {
                    this.n.d(1);
                }
            }
            return this.k0(t0, object0, m$A0);
        }

        @P1.a("this")
        t H(Object object0, int v, @a t t0) {
            Object object1 = com.google.common.base.H.E(object0);
            return this.a.q.f(this, object1, v, t0);
        }

        AtomicReferenceArray I(int v) {
            return new AtomicReferenceArray(v);
        }

        void J() {
            if((this.k.incrementAndGet() & 0x3F) == 0) {
                this.b();
            }
        }

        void K() {
            this.e0();
        }

        @P1.a("this")
        void L(long v) {
            this.c0(v);
        }

        @O1.a
        @a
        Object M(Object object0, int v, Object object1, boolean z) {
            int v3;
            Object object3;
            t t0;
            int v2;
            AtomicReferenceArray atomicReferenceArray0;
            long v1;
            this.lock();
            try {
                v1 = this.a.p.a();
                this.L(v1);
                if(this.b + 1 > this.e) {
                    this.p();
                }
                atomicReferenceArray0 = this.f;
                v2 = v & atomicReferenceArray0.length() - 1;
                t0 = (t)atomicReferenceArray0.get(v2);
                t t1 = t0;
                while(true) {
                    if(t1 == null) {
                        goto label_38;
                    }
                    Object object2 = t1.getKey();
                    if(t1.j() == v && object2 != null && this.a.e.d(object0, object2)) {
                        A m$A0 = t1.k();
                        object3 = m$A0.get();
                        if(object3 == null) {
                            ++this.d;
                            if(m$A0.isActive()) {
                                this.n(object0, v, null, m$A0.b(), com.google.common.cache.u.c);
                                this.g0(t1, object0, object1, v1);
                                v3 = this.b;
                            }
                            else {
                                this.g0(t1, object0, object1, v1);
                                v3 = this.b + 1;
                            }
                            this.b = v3;
                            this.o(t1);
                            goto label_49;
                        }
                        if(z) {
                            this.P(t1, v1);
                        }
                        else {
                            ++this.d;
                            this.n(object0, v, object3, m$A0.b(), com.google.common.cache.u.b);
                            this.g0(t1, object0, object1, v1);
                            this.o(t1);
                        }
                        break;
                    }
                    t1 = t1.a();
                }
            }
            catch(Throwable throwable0) {
                this.unlock();
                this.K();
                throw throwable0;
            }
            this.unlock();
            this.K();
            return object3;
            try {
            label_38:
                ++this.d;
                t t2 = this.H(object0, v, t0);
                this.g0(t2, object0, object1, v1);
                atomicReferenceArray0.set(v2, t2);
                ++this.b;
                this.o(t2);
            }
            catch(Throwable throwable0) {
                this.unlock();
                this.K();
                throw throwable0;
            }
        label_49:
            this.unlock();
            this.K();
            return null;
        }

        @O1.a
        boolean N(t t0, int v) {
            this.lock();
            try {
                AtomicReferenceArray atomicReferenceArray0 = this.f;
                int v2 = atomicReferenceArray0.length() - 1 & v;
                Object object0 = atomicReferenceArray0.get(v2);
                for(t t1 = (t)object0; t1 != null; t1 = t1.a()) {
                    if(t1 == t0) {
                        ++this.d;
                        t t2 = this.Z(((t)object0), t1, t1.getKey(), v, t1.k().get(), t1.k(), com.google.common.cache.u.c);
                        int v3 = this.b - 1;
                        atomicReferenceArray0.set(v2, t2);
                        this.b = v3;
                        return true;
                    }
                }
                return false;
            }
            finally {
                this.unlock();
                this.K();
            }
        }

        @O1.a
        boolean O(Object object0, int v, A m$A0) {
            this.lock();
            try {
                AtomicReferenceArray atomicReferenceArray0 = this.f;
                int v1 = atomicReferenceArray0.length() - 1 & v;
                Object object1 = atomicReferenceArray0.get(v1);
                t t0 = (t)object1;
                while(true) {
                    if(t0 == null) {
                        goto label_30;
                    }
                    Object object2 = t0.getKey();
                    if(t0.j() != v || object2 == null || !this.a.e.d(object0, object2)) {
                        t0 = t0.a();
                        continue;
                    }
                    if(t0.k() == m$A0) {
                        ++this.d;
                        t t1 = this.Z(((t)object1), t0, object2, v, m$A0.get(), m$A0, com.google.common.cache.u.c);
                        int v2 = this.b - 1;
                        atomicReferenceArray0.set(v1, t1);
                        this.b = v2;
                        break;
                    }
                    goto label_26;
                }
            }
            catch(Throwable throwable0) {
                this.unlock();
                if(!this.isHeldByCurrentThread()) {
                    this.K();
                }
                throw throwable0;
            }
            this.unlock();
            if(!this.isHeldByCurrentThread()) {
                this.K();
            }
            return true;
        label_26:
            this.unlock();
            if(!this.isHeldByCurrentThread()) {
                this.K();
            }
            return false;
        label_30:
            this.unlock();
            if(!this.isHeldByCurrentThread()) {
                this.K();
            }
            return false;
        }

        @P1.a("this")
        void P(t t0, long v) {
            if(this.a.L()) {
                t0.r(v);
            }
            this.m.add(t0);
        }

        void Q(t t0, long v) {
            if(this.a.L()) {
                t0.r(v);
            }
            this.j.add(t0);
        }

        @P1.a("this")
        void R(t t0, int v, long v1) {
            this.k();
            this.c += (long)v;
            if(this.a.L()) {
                t0.r(v1);
            }
            if(this.a.N()) {
                t0.s(v1);
            }
            this.m.add(t0);
            this.l.add(t0);
        }

        @O1.a
        @a
        Object S(Object object0, int v, com.google.common.cache.g g0, boolean z) {
            com.google.common.cache.m.m m$m0 = this.C(object0, v, z);
            if(m$m0 == null) {
                return null;
            }
            t0 t00 = this.E(object0, v, m$m0, g0);
            if(t00.isDone()) {
                try {
                    return h1.f(t00);
                }
                catch(Throwable unused_ex) {
                }
            }
            return null;
        }

        @a
        Object T(Object object0, int v) {
            com.google.common.cache.u u0;
            Object object3;
            t t0;
            this.lock();
            try {
                this.L(this.a.p.a());
                AtomicReferenceArray atomicReferenceArray0 = this.f;
                int v1 = atomicReferenceArray0.length() - 1 & v;
                Object object1 = atomicReferenceArray0.get(v1);
                t0 = (t)object1;
                while(true) {
                label_6:
                    if(t0 == null) {
                        goto label_30;
                    }
                    Object object2 = t0.getKey();
                    if(t0.j() == v && object2 != null && this.a.e.d(object0, object2)) {
                        A m$A0 = t0.k();
                        object3 = m$A0.get();
                        if(object3 == null) {
                            if(!m$A0.isActive()) {
                                goto label_30;
                            }
                            u0 = com.google.common.cache.u.c;
                        }
                        else {
                            u0 = com.google.common.cache.u.a;
                        }
                        ++this.d;
                        t t1 = this.Z(((t)object1), t0, object2, v, object3, m$A0, u0);
                        int v2 = this.b - 1;
                        atomicReferenceArray0.set(v1, t1);
                        this.b = v2;
                        break;
                    }
                    t0 = t0.a();
                }
            }
            catch(Throwable throwable0) {
                this.unlock();
                this.K();
                throw throwable0;
            }
            this.unlock();
            this.K();
            return object3;
            try {
                t0 = t0.a();
                goto label_6;
            }
            catch(Throwable throwable0) {
            }
            this.unlock();
            this.K();
            throw throwable0;
        label_30:
            this.unlock();
            this.K();
            return null;
        }

        boolean U(Object object0, int v, Object object1) {
            com.google.common.cache.u u0;
            t t0;
            boolean z;
            this.lock();
            try {
                this.L(this.a.p.a());
                AtomicReferenceArray atomicReferenceArray0 = this.f;
                z = true;
                int v1 = atomicReferenceArray0.length() - 1 & v;
                Object object2 = atomicReferenceArray0.get(v1);
                t0 = (t)object2;
                while(true) {
                label_7:
                    if(t0 == null) {
                        goto label_33;
                    }
                    Object object3 = t0.getKey();
                    if(t0.j() == v && object3 != null && this.a.e.d(object0, object3)) {
                        A m$A0 = t0.k();
                        Object object4 = m$A0.get();
                        if(this.a.f.d(object1, object4)) {
                            u0 = com.google.common.cache.u.a;
                        }
                        else {
                            if(object4 != null || !m$A0.isActive()) {
                                goto label_33;
                            }
                            u0 = com.google.common.cache.u.c;
                        }
                        ++this.d;
                        t t1 = this.Z(((t)object2), t0, object3, v, object4, m$A0, u0);
                        int v2 = this.b - 1;
                        atomicReferenceArray0.set(v1, t1);
                        this.b = v2;
                        if(u0 != com.google.common.cache.u.a) {
                            break;
                        }
                        goto label_24;
                    }
                    t0 = t0.a();
                }
            }
            catch(Throwable throwable0) {
                this.unlock();
                this.K();
                throw throwable0;
            }
            z = false;
        label_24:
            this.unlock();
            this.K();
            return z;
            try {
                t0 = t0.a();
                goto label_7;
            }
            catch(Throwable throwable0) {
            }
            this.unlock();
            this.K();
            throw throwable0;
        label_33:
            this.unlock();
            this.K();
            return false;
        }

        @P1.a("this")
        void V(t t0) {
            this.n(t0.getKey(), t0.j(), t0.k().get(), t0.k().b(), com.google.common.cache.u.c);
            this.l.remove(t0);
            this.m.remove(t0);
        }

        @J1.e
        @O1.a
        @P1.a("this")
        boolean W(t t0, int v, com.google.common.cache.u u0) {
            AtomicReferenceArray atomicReferenceArray0 = this.f;
            int v1 = atomicReferenceArray0.length() - 1 & v;
            Object object0 = atomicReferenceArray0.get(v1);
            for(t t1 = (t)object0; t1 != null; t1 = t1.a()) {
                if(t1 == t0) {
                    ++this.d;
                    t t2 = this.Z(((t)object0), t1, t1.getKey(), v, t1.k().get(), t1.k(), u0);
                    int v2 = this.b - 1;
                    atomicReferenceArray0.set(v1, t2);
                    this.b = v2;
                    return true;
                }
            }
            return false;
        }

        @P1.a("this")
        @a
        t X(t t0, t t1) {
            int v = this.b;
            t t2 = t1.a();
            while(t0 != t1) {
                t t3 = this.i(t0, t2);
                if(t3 == null) {
                    this.V(t0);
                    --v;
                }
                else {
                    t2 = t3;
                }
                t0 = t0.a();
            }
            this.b = v;
            return t2;
        }

        @O1.a
        boolean Y(Object object0, int v, com.google.common.cache.m.m m$m0) {
            this.lock();
            try {
                AtomicReferenceArray atomicReferenceArray0 = this.f;
                int v1 = atomicReferenceArray0.length() - 1 & v;
                t t0 = (t)atomicReferenceArray0.get(v1);
                t t1 = t0;
                while(true) {
                    if(t1 == null) {
                        goto label_23;
                    }
                    Object object1 = t1.getKey();
                    if(t1.j() != v || object1 == null || !this.a.e.d(object0, object1)) {
                        t1 = t1.a();
                        continue;
                    }
                    if(t1.k() == m$m0) {
                        if(m$m0.isActive()) {
                            t1.n(m$m0.k());
                        }
                        else {
                            atomicReferenceArray0.set(v1, this.X(t0, t1));
                        }
                        goto label_20;
                    }
                    goto label_23;
                }
            }
            catch(Throwable throwable0) {
            }
            this.unlock();
            this.K();
            throw throwable0;
        label_20:
            this.unlock();
            this.K();
            return true;
        label_23:
            this.unlock();
            this.K();
            return false;
        }

        @P1.a("this")
        @a
        t Z(t t0, t t1, @a Object object0, int v, Object object1, A m$A0, com.google.common.cache.u u0) {
            this.n(object0, v, object1, m$A0.b(), u0);
            this.l.remove(t1);
            this.m.remove(t1);
            if(m$A0.a()) {
                m$A0.d(null);
                return t0;
            }
            return this.X(t0, t1);
        }

        @a
        Object a0(Object object0, int v, Object object1) {
            this.lock();
            try {
                long v2 = this.a.p.a();
                this.L(v2);
                AtomicReferenceArray atomicReferenceArray0 = this.f;
                int v3 = v & atomicReferenceArray0.length() - 1;
                Object object2 = atomicReferenceArray0.get(v3);
                for(t t0 = (t)object2; t0 != null; t0 = t0.a()) {
                    Object object3 = t0.getKey();
                    if(t0.j() == v && object3 != null && this.a.e.d(object0, object3)) {
                        A m$A0 = t0.k();
                        Object object4 = m$A0.get();
                        if(object4 == null) {
                            if(!m$A0.isActive()) {
                                break;
                            }
                            ++this.d;
                            t t1 = this.Z(((t)object2), t0, object3, v, null, m$A0, com.google.common.cache.u.c);
                            int v4 = this.b - 1;
                            atomicReferenceArray0.set(v3, t1);
                            this.b = v4;
                            break;
                        }
                        ++this.d;
                        this.n(object0, v, object4, m$A0.b(), com.google.common.cache.u.b);
                        this.g0(t0, object0, object1, v2);
                        this.o(t0);
                        return object4;
                    }
                }
                return null;
            }
            finally {
                this.unlock();
                this.K();
            }
        }

        void b() {
            this.c0(this.a.p.a());
            this.e0();
        }

        boolean b0(Object object0, int v, Object object1, Object object2) {
            this.lock();
            try {
                long v2 = this.a.p.a();
                this.L(v2);
                AtomicReferenceArray atomicReferenceArray0 = this.f;
                int v3 = v & atomicReferenceArray0.length() - 1;
                Object object3 = atomicReferenceArray0.get(v3);
                for(t t0 = (t)object3; t0 != null; t0 = t0.a()) {
                    Object object4 = t0.getKey();
                    if(t0.j() == v && object4 != null && this.a.e.d(object0, object4)) {
                        A m$A0 = t0.k();
                        Object object5 = m$A0.get();
                        if(object5 == null) {
                            if(!m$A0.isActive()) {
                                break;
                            }
                            ++this.d;
                            t t1 = this.Z(((t)object3), t0, object4, v, null, m$A0, com.google.common.cache.u.c);
                            int v4 = this.b - 1;
                            atomicReferenceArray0.set(v3, t1);
                            this.b = v4;
                            break;
                        }
                        if(this.a.f.d(object1, object5)) {
                            ++this.d;
                            this.n(object0, v, object5, m$A0.b(), com.google.common.cache.u.b);
                            this.g0(t0, object0, object2, v2);
                            this.o(t0);
                            return true;
                        }
                        this.P(t0, v2);
                        break;
                    }
                }
                return false;
            }
            finally {
                this.unlock();
                this.K();
            }
        }

        void c() {
            if(this.b != 0) {
                this.lock();
                try {
                    this.L(this.a.p.a());
                    AtomicReferenceArray atomicReferenceArray0 = this.f;
                    for(int v1 = 0; v1 < atomicReferenceArray0.length(); ++v1) {
                        for(t t0 = (t)atomicReferenceArray0.get(v1); t0 != null; t0 = t0.a()) {
                            if(t0.k().isActive()) {
                                Object object0 = t0.getKey();
                                Object object1 = t0.k().get();
                                this.n(object0, t0.j(), object1, t0.k().b(), (object0 == null || object1 == null ? com.google.common.cache.u.c : com.google.common.cache.u.a));
                            }
                        }
                    }
                    for(int v2 = 0; v2 < atomicReferenceArray0.length(); ++v2) {
                        atomicReferenceArray0.set(v2, null);
                    }
                    this.e();
                    this.l.clear();
                    this.m.clear();
                    this.k.set(0);
                    ++this.d;
                    this.b = 0;
                }
                finally {
                    this.unlock();
                    this.K();
                }
            }
        }

        void c0(long v) {
            if(this.tryLock()) {
                try {
                    this.l();
                    this.q(v);
                    this.k.set(0);
                }
                finally {
                    this.unlock();
                }
            }
        }

        void d() {
            while(this.h.poll() != null) {
            }
        }

        void e() {
            if(this.a.Z()) {
                this.d();
            }
            if(this.a.a0()) {
                this.f();
            }
        }

        void e0() {
            if(!this.isHeldByCurrentThread()) {
                this.a.I();
            }
        }

        void f() {
            while(this.i.poll() != null) {
            }
        }

        Object f0(t t0, Object object0, int v, Object object1, long v1, com.google.common.cache.g g0) {
            if(this.a.P() && v1 - t0.p() > this.a.m && !t0.k().a()) {
                Object object2 = this.S(object0, v, g0, true);
                return object2 == null ? object1 : object2;
            }
            return object1;
        }

        boolean g(Object object0, int v) {
            try {
                boolean z = false;
                if(this.b != 0) {
                    t t0 = this.y(object0, v, this.a.p.a());
                    if(t0 == null) {
                        return false;
                    }
                    if(t0.k().get() != null) {
                        z = true;
                    }
                    return z;
                }
                return false;
            }
            finally {
                this.J();
            }
        }

        @P1.a("this")
        void g0(t t0, Object object0, Object object1, long v) {
            A m$A0 = t0.k();
            int v1 = this.a.j.a(object0, object1);
            com.google.common.base.H.h0(v1 >= 0, "Weights must be non-negative");
            t0.n(this.a.h.c(this, t0, object1, v1));
            this.R(t0, v1, v);
            m$A0.d(object1);
        }

        @J1.e
        boolean h(Object object0) {
            try {
                if(this.b != 0) {
                    long v1 = this.a.p.a();
                    AtomicReferenceArray atomicReferenceArray0 = this.f;
                    int v2 = atomicReferenceArray0.length();
                    for(int v3 = 0; v3 < v2; ++v3) {
                        for(t t0 = (t)atomicReferenceArray0.get(v3); t0 != null; t0 = t0.a()) {
                            Object object1 = this.z(t0, v1);
                            if(object1 != null && this.a.f.d(object0, object1)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            finally {
                this.J();
            }
        }

        @O1.a
        boolean h0(Object object0, int v, com.google.common.cache.m.m m$m0, Object object1) {
            t t0;
            int v4;
            AtomicReferenceArray atomicReferenceArray0;
            int v3;
            long v1;
            this.lock();
            try {
                v1 = this.a.p.a();
                this.L(v1);
                int v2 = this.b + 1;
                if(v2 > this.e) {
                    this.p();
                    v2 = this.b + 1;
                }
                v3 = v2;
                atomicReferenceArray0 = this.f;
                v4 = v & atomicReferenceArray0.length() - 1;
                t0 = (t)atomicReferenceArray0.get(v4);
                t t1 = t0;
                while(true) {
                    if(t1 == null) {
                        goto label_32;
                    }
                    Object object2 = t1.getKey();
                    if(t1.j() == v && object2 != null && this.a.e.d(object0, object2)) {
                        A m$A0 = t1.k();
                        Object object3 = m$A0.get();
                        if(m$m0 == m$A0 || object3 == null && m$A0 != m.C) {
                            ++this.d;
                            if(m$m0.isActive()) {
                                this.n(object0, v, object3, m$m0.b(), (object3 == null ? com.google.common.cache.u.c : com.google.common.cache.u.b));
                                --v3;
                            }
                            this.g0(t1, object0, object1, v1);
                            this.b = v3;
                            this.o(t1);
                            goto label_43;
                        }
                        this.n(object0, v, object1, 0, com.google.common.cache.u.b);
                        break;
                    }
                    t1 = t1.a();
                }
            }
            catch(Throwable throwable0) {
                this.unlock();
                this.K();
                throw throwable0;
            }
            this.unlock();
            this.K();
            return false;
            try {
            label_32:
                ++this.d;
                t t2 = this.H(object0, v, t0);
                this.g0(t2, object0, object1, v1);
                atomicReferenceArray0.set(v4, t2);
                this.b = v3;
                this.o(t2);
            }
            catch(Throwable throwable0) {
                this.unlock();
                this.K();
                throw throwable0;
            }
        label_43:
            this.unlock();
            this.K();
            return true;
        }

        @P1.a("this")
        @a
        t i(t t0, t t1) {
            Object object0 = t0.getKey();
            if(object0 == null) {
                return null;
            }
            A m$A0 = t0.k();
            Object object1 = m$A0.get();
            if(object1 == null && m$A0.isActive()) {
                return null;
            }
            t t2 = this.a.q.c(this, t0, t1, object0);
            t2.n(m$A0.f(this.i, object1, t2));
            return t2;
        }

        void i0() {
            if(this.tryLock()) {
                try {
                    this.l();
                }
                finally {
                    this.unlock();
                }
            }
        }

        @P1.a("this")
        void j() {
            int v = 0;
            do {
                Reference reference0 = this.h.poll();
                if(reference0 == null) {
                    break;
                }
                this.a.J(((t)reference0));
                ++v;
            }
            while(v != 16);
        }

        void j0(long v) {
            if(this.tryLock()) {
                try {
                    this.q(v);
                }
                finally {
                    this.unlock();
                }
            }
        }

        @P1.a("this")
        void k() {
            t t0;
            while((t0 = (t)this.j.poll()) != null) {
                if(this.m.contains(t0)) {
                    this.m.add(t0);
                }
            }
        }

        Object k0(t t0, Object object0, A m$A0) throws ExecutionException {
            if(!m$A0.a()) {
                throw new AssertionError();
            }
            if(m$A0 instanceof com.google.common.cache.m.m) {
                com.google.common.base.H.x0(((com.google.common.cache.m.m)m$A0).j() != Thread.currentThread(), "Recursive load of: %s", object0);
            }
            try {
                Object object1 = m$A0.e();
                if(object1 != null) {
                    this.Q(t0, this.a.p.a());
                    return object1;
                }
            }
            finally {
                this.n.d(1);
            }
            throw new com.google.common.cache.g.c("CacheLoader returned null for key " + object0 + ".");
        }

        @P1.a("this")
        void l() {
            if(this.a.Z()) {
                this.j();
            }
            if(this.a.a0()) {
                this.m();
            }
        }

        @P1.a("this")
        void m() {
            int v = 0;
            do {
                Reference reference0 = this.i.poll();
                if(reference0 == null) {
                    break;
                }
                this.a.K(((A)reference0));
                ++v;
            }
            while(v != 16);
        }

        @P1.a("this")
        void n(@a Object object0, int v, @a Object object1, int v1, com.google.common.cache.u u0) {
            this.c -= (long)v1;
            if(u0.b()) {
                this.n.b();
            }
            if(this.a.n != m.D) {
                com.google.common.cache.z z0 = com.google.common.cache.z.a(object0, object1, u0);
                this.a.n.offer(z0);
            }
        }

        @P1.a("this")
        void o(t t0) {
            if(!this.a.i()) {
                return;
            }
            this.k();
            if(((long)t0.k().b()) > this.g && !this.W(t0, t0.j(), com.google.common.cache.u.e)) {
                throw new AssertionError();
            }
            while(this.c > this.g) {
                t t1 = this.A();
                if(!this.W(t1, t1.j(), com.google.common.cache.u.e)) {
                    throw new AssertionError();
                }
                if(false) {
                    break;
                }
            }
        }

        @P1.a("this")
        void p() {
            AtomicReferenceArray atomicReferenceArray0 = this.f;
            int v = atomicReferenceArray0.length();
            if(v >= 0x40000000) {
                return;
            }
            int v1 = this.b;
            AtomicReferenceArray atomicReferenceArray1 = this.I(v << 1);
            this.e = atomicReferenceArray1.length() * 3 / 4;
            int v2 = atomicReferenceArray1.length();
            for(int v3 = 0; v3 < v; ++v3) {
                t t0 = (t)atomicReferenceArray0.get(v3);
                if(t0 != null) {
                    t t1 = t0.a();
                    int v4 = t0.j() & v2 - 1;
                    if(t1 == null) {
                        atomicReferenceArray1.set(v4, t0);
                    }
                    else {
                        t t2 = t0;
                        while(t1 != null) {
                            int v5 = t1.j() & v2 - 1;
                            if(v5 != v4) {
                                t2 = t1;
                                v4 = v5;
                            }
                            t1 = t1.a();
                        }
                        atomicReferenceArray1.set(v4, t2);
                        while(t0 != t2) {
                            int v6 = t0.j() & v2 - 1;
                            t t3 = this.i(t0, ((t)atomicReferenceArray1.get(v6)));
                            if(t3 == null) {
                                this.V(t0);
                                --v1;
                            }
                            else {
                                atomicReferenceArray1.set(v6, t3);
                            }
                            t0 = t0.a();
                        }
                    }
                }
            }
            this.f = atomicReferenceArray1;
            this.b = v1;
        }

        @P1.a("this")
        void q(long v) {
            this.k();
            while(true) {
                t t0 = (t)this.l.peek();
                if(t0 == null || !this.a.y(t0, v)) {
                    break;
                }
                if(!this.W(t0, t0.j(), com.google.common.cache.u.d)) {
                    throw new AssertionError();
                }
            }
            while(true) {
                t t1 = (t)this.m.peek();
                if(t1 == null || !this.a.y(t1, v)) {
                    break;
                }
                if(!this.W(t1, t1.j(), com.google.common.cache.u.d)) {
                    throw new AssertionError();
                }
            }
        }

        @a
        Object r(Object object0, int v) {
            try {
                if(this.b != 0) {
                    long v2 = this.a.p.a();
                    t t0 = this.y(object0, v, v2);
                    if(t0 == null) {
                        return null;
                    }
                    Object object1 = t0.k().get();
                    if(object1 != null) {
                        this.Q(t0, v2);
                        return this.f0(t0, t0.getKey(), v, object1, v2, this.a.s);
                    }
                    this.i0();
                }
                return null;
            }
            finally {
                this.J();
            }
        }

        @O1.a
        Object s(Object object0, int v, com.google.common.cache.g g0) throws ExecutionException {
            Object object4;
            com.google.common.base.H.E(object0);
            com.google.common.base.H.E(g0);
            try {
                if(this.b != 0) {
                    t t0 = this.w(object0, v);
                    if(t0 != null) {
                        long v2 = this.a.p.a();
                        Object object1 = this.z(t0, v2);
                        if(object1 != null) {
                            this.Q(t0, v2);
                            this.n.a(1);
                            return this.f0(t0, object0, v, object1, v2, g0);
                        }
                        A m$A0 = t0.k();
                        if(m$A0.a()) {
                            return this.k0(t0, object0, m$A0);
                        }
                    }
                }
                return this.G(object0, v, g0);
            }
            catch(ExecutionException executionException0) {
                Throwable throwable0 = executionException0.getCause();
                if(throwable0 instanceof Error) {
                    throw new com.google.common.util.concurrent.O(((Error)throwable0));
                }
                if(!(throwable0 instanceof RuntimeException)) {
                    throw executionException0;
                }
                throw new f1(throwable0);
            }
            finally {
                this.J();
            }
        }

        @O1.a
        Object u(Object object0, int v, com.google.common.cache.m.m m$m0, t0 t00) throws ExecutionException {
            try {
                Object object1 = null;
                object1 = h1.f(t00);
                if(object1 == null) {
                    throw new com.google.common.cache.g.c("CacheLoader returned null for key " + object0 + ".");
                }
                long v1 = m$m0.h();
                this.n.c(v1);
                this.h0(object0, v, m$m0, object1);
                return object1;
            }
            catch(Throwable throwable0) {
                if(object1 == null) {
                    long v2 = m$m0.h();
                    this.n.e(v2);
                    this.Y(object0, v, m$m0);
                }
                throw throwable0;
            }
        }

        @a
        t w(Object object0, int v) {
            for(t t0 = this.x(v); t0 != null; t0 = t0.a()) {
                if(t0.j() == v) {
                    Object object1 = t0.getKey();
                    if(object1 == null) {
                        this.i0();
                    }
                    else if(this.a.e.d(object0, object1)) {
                        return t0;
                    }
                }
            }
            return null;
        }

        t x(int v) {
            return (t)this.f.get(v & this.f.length() - 1);
        }

        @a
        t y(Object object0, int v, long v1) {
            t t0 = this.w(object0, v);
            if(t0 == null) {
                return null;
            }
            if(this.a.y(t0, v1)) {
                this.j0(v1);
                return null;
            }
            return t0;
        }

        Object z(t t0, long v) {
            if(t0.getKey() == null) {
                this.i0();
                return null;
            }
            Object object0 = t0.k().get();
            if(object0 == null) {
                this.i0();
                return null;
            }
            if(this.a.y(t0, v)) {
                this.j0(v);
                return null;
            }
            return object0;
        }
    }

    static class s extends SoftReference implements A {
        final t a;

        s(ReferenceQueue referenceQueue0, Object object0, t t0) {
            super(object0, referenceQueue0);
            this.a = t0;
        }

        @Override  // com.google.common.cache.m$A
        public boolean a() {
            return false;
        }

        @Override  // com.google.common.cache.m$A
        public int b() {
            return 1;
        }

        @Override  // com.google.common.cache.m$A
        public t c() {
            return this.a;
        }

        @Override  // com.google.common.cache.m$A
        public void d(Object object0) {
        }

        @Override  // com.google.common.cache.m$A
        public Object e() {
            return this.get();
        }

        @Override  // com.google.common.cache.m$A
        public A f(ReferenceQueue referenceQueue0, Object object0, t t0) {
            return new s(referenceQueue0, object0, t0);
        }

        @Override  // com.google.common.cache.m$A
        public boolean isActive() {
            return true;
        }
    }

    static abstract enum com.google.common.cache.m.t {
        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class com.google.common.cache.m.t.a extends com.google.common.cache.m.t {
            com.google.common.cache.m.t.a(String s, int v) {
                super(null);
            }

            @Override  // com.google.common.cache.m$t
            com.google.common.base.m b() {
                return com.google.common.base.m.c();
            }

            @Override  // com.google.common.cache.m$t
            A c(r m$r0, t t0, Object object0, int v) {
                return v == 1 ? new x(object0) : new I(object0, v);
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class com.google.common.cache.m.t.b extends com.google.common.cache.m.t {
            com.google.common.cache.m.t.b(String s, int v) {
                super(null);
            }

            @Override  // com.google.common.cache.m$t
            com.google.common.base.m b() {
                return com.google.common.base.m.g();
            }

            @Override  // com.google.common.cache.m$t
            A c(r m$r0, t t0, Object object0, int v) {
                return v == 1 ? new s(m$r0.i, object0, t0) : new H(m$r0.i, object0, t0, v);
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class com.google.common.cache.m.t.c extends com.google.common.cache.m.t {
            com.google.common.cache.m.t.c(String s, int v) {
                super(null);
            }

            @Override  // com.google.common.cache.m$t
            com.google.common.base.m b() {
                return com.google.common.base.m.g();
            }

            @Override  // com.google.common.cache.m$t
            A c(r m$r0, t t0, Object object0, int v) {
                return v == 1 ? new F(m$r0.i, object0, t0) : new J(m$r0.i, object0, t0, v);
            }
        }

        STRONG /* 警告！未生成枚举子类：com.google.common.cache.m$t$a */,
        SOFT /* 警告！未生成枚举子类：com.google.common.cache.m$t$b */,
        WEAK /* 警告！未生成枚举子类：com.google.common.cache.m$t$c */;

        private com.google.common.cache.m.t() {
        }

        com.google.common.cache.m.t(com.google.common.cache.m.a m$a0) {
            this();
        }

        private static com.google.common.cache.m.t[] a() [...] // Inlined contents

        abstract com.google.common.base.m b();

        abstract A c(r arg1, t arg2, Object arg3, int arg4);
    }

    static final class u extends w {
        volatile long e;
        @Weak
        t f;
        @Weak
        t g;

        u(Object object0, int v, @a t t0) {
            super(object0, v, t0);
            this.e = 0x7FFFFFFFFFFFFFFFL;
            this.f = m.F();
            this.g = m.F();
        }

        @Override  // com.google.common.cache.m$d
        public void A(t t0) {
            this.f = t0;
        }

        @Override  // com.google.common.cache.m$d
        public void l(t t0) {
            this.g = t0;
        }

        @Override  // com.google.common.cache.m$d
        public void r(long v) {
            this.e = v;
        }

        @Override  // com.google.common.cache.m$d
        public t u() {
            return this.g;
        }

        @Override  // com.google.common.cache.m$d
        public t y() {
            return this.f;
        }

        @Override  // com.google.common.cache.m$d
        public long z() {
            return this.e;
        }
    }

    static final class v extends w {
        volatile long e;
        @Weak
        t f;
        @Weak
        t g;
        volatile long h;
        @Weak
        t i;
        @Weak
        t j;

        v(Object object0, int v, @a t t0) {
            super(object0, v, t0);
            this.e = 0x7FFFFFFFFFFFFFFFL;
            this.f = m.F();
            this.g = m.F();
            this.h = 0x7FFFFFFFFFFFFFFFL;
            this.i = m.F();
            this.j = m.F();
        }

        @Override  // com.google.common.cache.m$d
        public void A(t t0) {
            this.f = t0;
        }

        @Override  // com.google.common.cache.m$d
        public void B(t t0) {
            this.i = t0;
        }

        @Override  // com.google.common.cache.m$d
        public void C(t t0) {
            this.j = t0;
        }

        @Override  // com.google.common.cache.m$d
        public void l(t t0) {
            this.g = t0;
        }

        @Override  // com.google.common.cache.m$d
        public t m() {
            return this.j;
        }

        @Override  // com.google.common.cache.m$d
        public long p() {
            return this.h;
        }

        @Override  // com.google.common.cache.m$d
        public void r(long v) {
            this.e = v;
        }

        @Override  // com.google.common.cache.m$d
        public void s(long v) {
            this.h = v;
        }

        @Override  // com.google.common.cache.m$d
        public t u() {
            return this.g;
        }

        @Override  // com.google.common.cache.m$d
        public t w() {
            return this.i;
        }

        @Override  // com.google.common.cache.m$d
        public t y() {
            return this.f;
        }

        @Override  // com.google.common.cache.m$d
        public long z() {
            return this.e;
        }
    }

    static class w extends d {
        final Object a;
        final int b;
        @a
        final t c;
        volatile A d;

        w(Object object0, int v, @a t t0) {
            this.d = m.W();
            this.a = object0;
            this.b = v;
            this.c = t0;
        }

        @Override  // com.google.common.cache.m$d
        public t a() {
            return this.c;
        }

        @Override  // com.google.common.cache.m$d
        public Object getKey() {
            return this.a;
        }

        @Override  // com.google.common.cache.m$d
        public int j() {
            return this.b;
        }

        @Override  // com.google.common.cache.m$d
        public A k() {
            return this.d;
        }

        @Override  // com.google.common.cache.m$d
        public void n(A m$A0) {
            this.d = m$A0;
        }
    }

    static class x implements A {
        final Object a;

        x(Object object0) {
            this.a = object0;
        }

        @Override  // com.google.common.cache.m$A
        public boolean a() {
            return false;
        }

        @Override  // com.google.common.cache.m$A
        public int b() {
            return 1;
        }

        @Override  // com.google.common.cache.m$A
        public t c() {
            return null;
        }

        @Override  // com.google.common.cache.m$A
        public void d(Object object0) {
        }

        @Override  // com.google.common.cache.m$A
        public Object e() {
            return this.get();
        }

        @Override  // com.google.common.cache.m$A
        public A f(ReferenceQueue referenceQueue0, Object object0, t t0) {
            return this;
        }

        @Override  // com.google.common.cache.m$A
        public Object get() {
            return this.a;
        }

        @Override  // com.google.common.cache.m$A
        public boolean isActive() {
            return true;
        }
    }

    static final class y extends w {
        volatile long e;
        @Weak
        t f;
        @Weak
        t g;

        y(Object object0, int v, @a t t0) {
            super(object0, v, t0);
            this.e = 0x7FFFFFFFFFFFFFFFL;
            this.f = m.F();
            this.g = m.F();
        }

        @Override  // com.google.common.cache.m$d
        public void B(t t0) {
            this.f = t0;
        }

        @Override  // com.google.common.cache.m$d
        public void C(t t0) {
            this.g = t0;
        }

        @Override  // com.google.common.cache.m$d
        public t m() {
            return this.g;
        }

        @Override  // com.google.common.cache.m$d
        public long p() {
            return this.e;
        }

        @Override  // com.google.common.cache.m$d
        public void s(long v) {
            this.e = v;
        }

        @Override  // com.google.common.cache.m$d
        public t w() {
            return this.f;
        }
    }

    final class z extends i {
        @Override  // com.google.common.cache.m$i
        public Object next() {
            return this.c().getValue();
        }
    }

    static final int A = 16;
    static final Logger B = null;
    static final A C = null;
    static final Queue D = null;
    final int a;
    final int b;
    final r[] c;
    final int d;
    final com.google.common.base.m e;
    final com.google.common.base.m f;
    final com.google.common.cache.m.t g;
    final com.google.common.cache.m.t h;
    final long i;
    final com.google.common.cache.B j;
    final long k;
    final long l;
    final long m;
    final Queue n;
    final com.google.common.cache.v o;
    final V p;
    final f q;
    final com.google.common.cache.a.b r;
    @a
    final com.google.common.cache.g s;
    @P1.b
    @RetainedWith
    @a
    Set t;
    @P1.b
    @RetainedWith
    @a
    Collection u;
    @P1.b
    @RetainedWith
    @a
    Set v;
    static final int w = 0x40000000;
    static final int x = 0x10000;
    static final int y = 3;
    static final int z = 0x3F;

    static {
        m.B = Logger.getLogger("com.google.common.cache.m");
        m.C = new com.google.common.cache.m.a();
        m.D = new com.google.common.cache.m.b();
    }

    m(com.google.common.cache.d d0, @a com.google.common.cache.g g0) {
        this.d = Math.min(d0.j(), 0x10000);
        com.google.common.cache.m.t m$t0 = d0.o();
        this.g = m$t0;
        this.h = d0.v();
        this.e = d0.n();
        this.f = d0.u();
        long v = d0.p();
        this.i = v;
        this.j = d0.w();
        this.k = d0.k();
        this.l = d0.l();
        this.m = d0.q();
        com.google.common.cache.v v1 = d0.r();
        this.o = v1;
        Queue queue0 = v1 == com.google.common.cache.d.e.a ? m.h() : new ConcurrentLinkedQueue();
        this.n = queue0;
        this.p = d0.t(this.M());
        this.q = f.e(m$t0, this.X(), this.b0());
        this.r = (com.google.common.cache.a.b)d0.s().get();
        this.s = g0;
        int v2 = Math.min(d0.m(), 0x40000000);
        if(this.i() && !this.g()) {
            v2 = (int)Math.min(v2, v);
        }
        int v3 = 0;
        int v4 = 1;
        int v5 = 1;
        int v6 = 0;
        while(v5 < this.d && (!this.i() || ((long)v5) * 20L <= this.i)) {
            ++v6;
            v5 <<= 1;
        }
        this.b = 0x20 - v6;
        this.a = v5 - 1;
        this.c = this.D(v5);
        int v7 = v2 / v5;
        if(v7 * v5 < v2) {
            ++v7;
        }
        while(v4 < v7) {
            v4 <<= 1;
        }
        if(this.i()) {
            long v8 = this.i / ((long)v5) + 1L;
            long v9 = this.i % ((long)v5);
            while(true) {
                r[] arr_m$r = this.c;
                if(v3 >= arr_m$r.length) {
                    break;
                }
                if(((long)v3) == v9) {
                    --v8;
                }
                arr_m$r[v3] = this.f(v4, v8, ((com.google.common.cache.a.b)d0.s().get()));
                ++v3;
            }
        }
        else {
            while(true) {
                r[] arr_m$r1 = this.c;
                if(v3 >= arr_m$r1.length) {
                    break;
                }
                arr_m$r1[v3] = this.f(v4, -1L, ((com.google.common.cache.a.b)d0.s().get()));
                ++v3;
            }
        }
    }

    @a
    Map A(Set set0, com.google.common.cache.g g0) throws ExecutionException {
        Map map0;
        com.google.common.base.H.E(g0);
        com.google.common.base.H.E(set0);
        O o0 = O.c();
        boolean z = true;
        boolean z1 = false;
        try {
            try {
                map0 = g0.e(set0);
                goto label_26;
            }
            catch(com.google.common.cache.g.e g$e0) {
                try {
                    throw g$e0;
                }
                catch(Throwable throwable0) {
                }
            }
            catch(InterruptedException interruptedException0) {
                Thread.currentThread().interrupt();
                throw new ExecutionException(interruptedException0);
            }
            catch(RuntimeException runtimeException0) {
                throw new f1(runtimeException0);
            }
            catch(Exception exception0) {
                throw new ExecutionException(exception0);
            }
            catch(Error error0) {
                throw new com.google.common.util.concurrent.O(error0);
            }
        }
        catch(Throwable throwable0) {
            z = false;
        }
        if(!z) {
            long v = o0.g(TimeUnit.NANOSECONDS);
            this.r.e(v);
        }
        throw throwable0;
    label_26:
        if(map0 != null) {
            o0.l();
            for(Object object0: map0.entrySet()) {
                Object object1 = ((Map.Entry)object0).getKey();
                Object object2 = ((Map.Entry)object0).getValue();
                if(object1 != null && object2 != null) {
                    this.put(object1, object2);
                }
                else {
                    z1 = true;
                }
            }
            if(!z1) {
                long v1 = o0.g(TimeUnit.NANOSECONDS);
                this.r.c(v1);
                return map0;
            }
            long v2 = o0.g(TimeUnit.NANOSECONDS);
            this.r.e(v2);
            throw new com.google.common.cache.g.c(g0 + " returned null keys or values from loadAll");
        }
        long v3 = o0.g(TimeUnit.NANOSECONDS);
        this.r.e(v3);
        throw new com.google.common.cache.g.c(g0 + " returned null map from loadAll");
    }

    long B() {
        r[] arr_m$r = this.c;
        long v = 0L;
        for(int v1 = 0; v1 < arr_m$r.length; ++v1) {
            v += (long)Math.max(0, arr_m$r[v1].b);
        }
        return v;
    }

    @J1.e
    t C(Object object0, int v, @a t t0) {
        r m$r0 = this.U(v);
        m$r0.lock();
        try {
            return m$r0.H(object0, v, t0);
        }
        finally {
            m$r0.unlock();
        }
    }

    final r[] D(int v) {
        return new r[v];
    }

    @J1.e
    A E(t t0, Object object0, int v) {
        r m$r0 = this.U(t0.j());
        Object object1 = com.google.common.base.H.E(object0);
        return this.h.c(m$r0, t0, object1, v);
    }

    static t F() {
        return q.a;
    }

    static void G(t t0) {
        t t1 = m.F();
        t0.A(t1);
        t0.l(t1);
    }

    static void H(t t0) {
        t t1 = m.F();
        t0.B(t1);
        t0.C(t1);
    }

    void I() {
        com.google.common.cache.z z0;
        while((z0 = (com.google.common.cache.z)this.n.poll()) != null) {
            try {
                this.o.a(z0);
            }
            catch(Throwable throwable0) {
                m.B.log(Level.WARNING, "Exception thrown by removal listener", throwable0);
            }
        }
    }

    void J(t t0) {
        int v = t0.j();
        this.U(v).N(t0, v);
    }

    void K(A m$A0) {
        t t0 = m$A0.c();
        int v = t0.j();
        this.U(v).O(t0.getKey(), v, m$A0);
    }

    boolean L() {
        return this.l();
    }

    // 去混淆评级： 低(20)
    boolean M() {
        return this.N() || this.L();
    }

    // 去混淆评级： 低(20)
    boolean N() {
        return this.m() || this.P();
    }

    void O(Object object0) {
        int v = this.w(com.google.common.base.H.E(object0));
        this.U(v).S(object0, v, this.s, false);
    }

    boolean P() {
        return this.m > 0L;
    }

    static int S(int v) {
        int v1 = v + (v << 15 ^ 0xFFFFCD7D);
        int v2 = v1 ^ v1 >>> 10;
        int v3 = v2 + (v2 << 3);
        int v4 = 0x4005 * (v3 ^ v3 >>> 6);
        return v4 ^ v4 >>> 16;
    }

    r U(int v) {
        return this.c[v >>> this.b & this.a];
    }

    private static ArrayList V(Collection collection0) {
        ArrayList arrayList0 = new ArrayList(collection0.size());
        q3.a(arrayList0, collection0.iterator());
        return arrayList0;
    }

    static A W() {
        return m.C;
    }

    // 去混淆评级： 低(20)
    boolean X() {
        return this.Y() || this.L();
    }

    // 去混淆评级： 低(20)
    boolean Y() {
        return this.l() || this.i();
    }

    boolean Z() {
        return this.g != com.google.common.cache.m.t.a;
    }

    boolean a0() {
        return this.h != com.google.common.cache.m.t.a;
    }

    public void b() {
        r[] arr_m$r = this.c;
        for(int v = 0; v < arr_m$r.length; ++v) {
            arr_m$r[v].b();
        }
    }

    // 去混淆评级： 低(20)
    boolean b0() {
        return this.c0() || this.N();
    }

    static void c(t t0, t t1) {
        t0.A(t1);
        t1.l(t0);
    }

    boolean c0() {
        return this.m();
    }

    @Override
    public void clear() {
        r[] arr_m$r = this.c;
        for(int v = 0; v < arr_m$r.length; ++v) {
            arr_m$r[v].c();
        }
    }

    @Override  // j$.util.concurrent.ConcurrentMap
    public Object compute(Object object0, BiFunction biFunction0) {
        return ConcurrentMap.-CC.$default$compute(this, object0, biFunction0);
    }

    @Override  // j$.util.concurrent.ConcurrentMap
    public Object computeIfAbsent(Object object0, Function function0) {
        return ConcurrentMap.-CC.$default$computeIfAbsent(this, object0, function0);
    }

    @Override  // j$.util.concurrent.ConcurrentMap
    public Object computeIfPresent(Object object0, BiFunction biFunction0) {
        return ConcurrentMap.-CC.$default$computeIfPresent(this, object0, biFunction0);
    }

    @Override
    public boolean containsKey(@a Object object0) {
        if(object0 == null) {
            return false;
        }
        int v = this.w(object0);
        return this.U(v).g(object0, v);
    }

    @Override
    public boolean containsValue(@a Object object0) {
        if(object0 == null) {
            return false;
        }
        long v = this.p.a();
        r[] arr_m$r = this.c;
        int v2 = 0;
        for(long v1 = -1L; v2 < 3; v1 = v3) {
            long v3 = 0L;
            for(int v4 = 0; v4 < arr_m$r.length; ++v4) {
                r m$r0 = arr_m$r[v4];
                AtomicReferenceArray atomicReferenceArray0 = m$r0.f;
                for(int v5 = 0; v5 < atomicReferenceArray0.length(); ++v5) {
                    for(t t0 = (t)atomicReferenceArray0.get(v5); t0 != null; t0 = t0.a()) {
                        Object object1 = m$r0.z(t0, v);
                        if(object1 != null && this.f.d(object0, object1)) {
                            return true;
                        }
                    }
                }
                v3 += (long)m$r0.d;
            }
            if(v3 == v1) {
                break;
            }
            ++v2;
        }
        return false;
    }

    static void d(t t0, t t1) {
        t0.B(t1);
        t1.C(t0);
    }

    @J1.e
    t e(t t0, t t1) {
        return this.U(t0.j()).i(t0, t1);
    }

    @Override
    @J1.c
    public Set entrySet() {
        Set set0 = this.v;
        if(set0 == null) {
            set0 = new com.google.common.cache.m.h(this);
            this.v = set0;
        }
        return set0;
    }

    r f(int v, long v1, com.google.common.cache.a.b a$b0) {
        return new r(this, v, v1, a$b0);
    }

    @Override  // j$.util.concurrent.ConcurrentMap
    public void forEach(BiConsumer biConsumer0) {
        ConcurrentMap.-CC.$default$forEach(this, biConsumer0);
    }

    boolean g() {
        return this.j != com.google.common.cache.d.f.a;
    }

    @Override
    @O1.a
    @a
    public Object get(@a Object object0) {
        if(object0 == null) {
            return null;
        }
        int v = this.w(object0);
        return this.U(v).r(object0, v);
    }

    @Override  // j$.util.concurrent.ConcurrentMap
    @a
    public Object getOrDefault(@a Object object0, @a Object object1) {
        Object object2 = this.get(object0);
        return object2 == null ? object1 : object2;
    }

    static Queue h() {
        return m.D;
    }

    boolean i() {
        return this.i >= 0L;
    }

    @Override
    public boolean isEmpty() {
        r[] arr_m$r = this.c;
        long v = 0L;
        for(int v1 = 0; v1 < arr_m$r.length; ++v1) {
            r m$r0 = arr_m$r[v1];
            if(m$r0.b != 0) {
                return false;
            }
            v += (long)m$r0.d;
        }
        if(v != 0L) {
            for(int v2 = 0; v2 < arr_m$r.length; ++v2) {
                r m$r1 = arr_m$r[v2];
                if(m$r1.b != 0) {
                    return false;
                }
                v -= (long)m$r1.d;
            }
            return v == 0L;
        }
        return true;
    }

    // 去混淆评级： 低(20)
    boolean j() {
        return this.m() || this.l();
    }

    @Override
    public Set keySet() {
        Set set0 = this.t;
        if(set0 == null) {
            set0 = new k(this);
            this.t = set0;
        }
        return set0;
    }

    boolean l() {
        return this.k > 0L;
    }

    boolean m() {
        return this.l > 0L;
    }

    @Override  // j$.util.concurrent.ConcurrentMap
    public Object merge(Object object0, Object object1, BiFunction biFunction0) {
        return ConcurrentMap.-CC.$default$merge(this, object0, object1, biFunction0);
    }

    @O1.a
    Object o(Object object0, com.google.common.cache.g g0) throws ExecutionException {
        int v = this.w(com.google.common.base.H.E(object0));
        return this.U(v).s(object0, v, g0);
    }

    @Override
    @O1.a
    @a
    public Object put(Object object0, Object object1) {
        com.google.common.base.H.E(object0);
        com.google.common.base.H.E(object1);
        int v = this.w(object0);
        return this.U(v).M(object0, v, object1, false);
    }

    @Override
    public void putAll(Map map0) {
        for(Object object0: map0.entrySet()) {
            this.put(((Map.Entry)object0).getKey(), ((Map.Entry)object0).getValue());
        }
    }

    @Override  // j$.util.Map
    @a
    public Object putIfAbsent(Object object0, Object object1) {
        com.google.common.base.H.E(object0);
        com.google.common.base.H.E(object1);
        int v = this.w(object0);
        return this.U(v).M(object0, v, object1, true);
    }

    Q2 q(Iterable iterable0) throws ExecutionException {
        LinkedHashMap linkedHashMap0 = D3.c0();
        LinkedHashSet linkedHashSet0 = D4.A();
        int v = 0;
        int v1 = 0;
        for(Object object0: iterable0) {
            Object object1 = this.get(object0);
            if(!linkedHashMap0.containsKey(object0)) {
                linkedHashMap0.put(object0, object1);
                if(object1 == null) {
                    ++v1;
                    linkedHashSet0.add(object0);
                }
                else {
                    ++v;
                }
            }
        }
        try {
            if(!linkedHashSet0.isEmpty()) {
                try {
                    Map map0 = this.A(DesugarCollections.unmodifiableSet(linkedHashSet0), this.s);
                    for(Object object2: linkedHashSet0) {
                        Object object3 = map0.get(object2);
                        if(object3 == null) {
                            throw new com.google.common.cache.g.c("loadAll failed to return a value for " + object2);
                        }
                        linkedHashMap0.put(object2, object3);
                    }
                }
                catch(com.google.common.cache.g.e unused_ex) {
                    for(Object object4: linkedHashSet0) {
                        --v1;
                        linkedHashMap0.put(object4, this.o(object4, this.s));
                    }
                }
            }
            return Q2.g(linkedHashMap0);
        }
        finally {
            this.r.a(v);
            this.r.d(v1);
        }
    }

    Q2 r(Iterable iterable0) {
        com.google.common.collect.Q2.b q2$b0 = Q2.b();
        int v = 0;
        int v1 = 0;
        for(Object object0: iterable0) {
            Object object1 = this.get(object0);
            if(object1 == null) {
                ++v1;
            }
            else {
                q2$b0.i(object0, object1);
                ++v;
            }
        }
        this.r.a(v);
        this.r.d(v1);
        return q2$b0.c();
    }

    @Override
    @O1.a
    @a
    public Object remove(@a Object object0) {
        if(object0 == null) {
            return null;
        }
        int v = this.w(object0);
        return this.U(v).T(object0, v);
    }

    @Override  // j$.util.Map
    @O1.a
    public boolean remove(@a Object object0, @a Object object1) {
        if(object0 != null && object1 != null) {
            int v = this.w(object0);
            return this.U(v).U(object0, v, object1);
        }
        return false;
    }

    @Override  // j$.util.Map
    @O1.a
    @a
    public Object replace(Object object0, Object object1) {
        com.google.common.base.H.E(object0);
        com.google.common.base.H.E(object1);
        int v = this.w(object0);
        return this.U(v).a0(object0, v, object1);
    }

    @Override  // j$.util.Map
    @O1.a
    public boolean replace(Object object0, @a Object object1, Object object2) {
        com.google.common.base.H.E(object0);
        com.google.common.base.H.E(object2);
        if(object1 == null) {
            return false;
        }
        int v = this.w(object0);
        return this.U(v).b0(object0, v, object1, object2);
    }

    @Override  // j$.util.concurrent.ConcurrentMap
    public void replaceAll(BiFunction biFunction0) {
        ConcurrentMap.-CC.$default$replaceAll(this, biFunction0);
    }

    @a
    t s(@a Object object0) {
        if(object0 == null) {
            return null;
        }
        int v = this.w(object0);
        return this.U(v).w(object0, v);
    }

    @Override
    public int size() {
        return com.google.common.primitives.l.z(this.B());
    }

    @a
    public Object t(Object object0) {
        int v = this.w(com.google.common.base.H.E(object0));
        Object object1 = this.U(v).r(object0, v);
        if(object1 == null) {
            this.r.d(1);
            return null;
        }
        this.r.a(1);
        return object1;
    }

    @a
    Object u(t t0, long v) {
        if(t0.getKey() == null) {
            return null;
        }
        Object object0 = t0.k().get();
        if(object0 == null) {
            return null;
        }
        return this.y(t0, v) ? null : object0;
    }

    Object v(Object object0) throws ExecutionException {
        return this.o(object0, this.s);
    }

    @Override
    public Collection values() {
        Collection collection0 = this.u;
        if(collection0 == null) {
            collection0 = new B(this);
            this.u = collection0;
        }
        return collection0;
    }

    int w(@a Object object0) {
        return m.S(this.e.f(object0));
    }

    void x(Iterable iterable0) {
        for(Object object0: iterable0) {
            this.remove(object0);
        }
    }

    boolean y(t t0, long v) {
        com.google.common.base.H.E(t0);
        return !this.l() || v - t0.z() < this.k ? this.m() && v - t0.p() >= this.l : true;
    }

    @J1.e
    boolean z(t t0, long v) {
        return this.U(t0.j()).z(t0, v) != null;
    }
}

