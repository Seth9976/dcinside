package com.fasterxml.jackson.databind.util.internal;

import j..util.concurrent.ConcurrentHashMap;
import j..util.concurrent.ConcurrentMap.-CC;
import j..util.concurrent.ConcurrentMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap.SimpleEntry;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public final class c extends AbstractMap implements ConcurrentMap, Serializable, java.util.concurrent.ConcurrentMap {
    static class a {
    }

    final class b implements Runnable {
        final i a;
        final int b;
        final c c;

        b(i c$i0, int v) {
            this.b = v;
            this.a = c$i0;
        }

        @Override
        public void run() {
            long v = c.this.e.get();
            c.this.e.lazySet(v + ((long)this.b));
            if(((o)this.a.get()).b()) {
                c.this.d.a(this.a);
                c.this.q();
            }
        }
    }

    public static final class com.fasterxml.jackson.databind.util.internal.c.c {
        int a;
        int b;
        long c;
        static final int d = 16;
        static final int e = 16;

        public com.fasterxml.jackson.databind.util.internal.c.c() {
            this.c = -1L;
            this.b = 16;
            this.a = 16;
        }

        public c a() {
            c.h(this.c >= 0L);
            return new c(this);
        }

        public com.fasterxml.jackson.databind.util.internal.c.c b(int v) {
            c.f(v > 0);
            this.a = v;
            return this;
        }

        public com.fasterxml.jackson.databind.util.internal.c.c c(int v) {
            c.f(v >= 0);
            this.b = v;
            return this;
        }

        public com.fasterxml.jackson.databind.util.internal.c.c d(long v) {
            c.f(v >= 0L);
            this.c = v;
            return this;
        }
    }

    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    static abstract class d extends Enum {
        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        static final class com.fasterxml.jackson.databind.util.internal.c.d.a extends d {
            com.fasterxml.jackson.databind.util.internal.c.d.a(String s, int v) {
                super(s, v, null);
            }

            @Override  // com.fasterxml.jackson.databind.util.internal.c$d
            boolean a(boolean z) {
                return !z;
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        static final class com.fasterxml.jackson.databind.util.internal.c.d.b extends d {
            com.fasterxml.jackson.databind.util.internal.c.d.b(String s, int v) {
                super(s, v, null);
            }

            @Override  // com.fasterxml.jackson.databind.util.internal.c$d
            boolean a(boolean z) {
                return true;
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        static final class com.fasterxml.jackson.databind.util.internal.c.d.c extends d {
            com.fasterxml.jackson.databind.util.internal.c.d.c(String s, int v) {
                super(s, v, null);
            }

            @Override  // com.fasterxml.jackson.databind.util.internal.c$d
            boolean a(boolean z) {
                return false;
            }
        }

        public static final enum d a;
        public static final enum d b;
        public static final enum d c;
        private static final d[] d;

        static {
            com.fasterxml.jackson.databind.util.internal.c.d.a c$d$a0 = new com.fasterxml.jackson.databind.util.internal.c.d.a("IDLE", 0);
            d.a = c$d$a0;
            com.fasterxml.jackson.databind.util.internal.c.d.b c$d$b0 = new com.fasterxml.jackson.databind.util.internal.c.d.b("REQUIRED", 1);
            d.b = c$d$b0;
            com.fasterxml.jackson.databind.util.internal.c.d.c c$d$c0 = new com.fasterxml.jackson.databind.util.internal.c.d.c("PROCESSING", 2);
            d.c = c$d$c0;
            d.d = new d[]{c$d$a0, c$d$b0, c$d$c0};
        }

        private d(String s, int v) {
            super(s, v);
        }

        d(String s, int v, a c$a0) {
            this(s, v);
        }

        abstract boolean a(boolean arg1);

        public static d valueOf(String s) {
            return (d)Enum.valueOf(d.class, s);
        }

        public static d[] values() {
            return (d[])d.d.clone();
        }
    }

    final class e implements Iterator {
        final Iterator a;
        i b;
        final c c;

        e() {
            this.a = c0.a.values().iterator();
        }

        public Map.Entry a() {
            Object object0 = this.a.next();
            this.b = (i)object0;
            return new p(c.this, this.b);
        }

        @Override
        public boolean hasNext() {
            return this.a.hasNext();
        }

        @Override
        public Object next() {
            return this.a();
        }

        @Override
        public void remove() {
            c.h(this.b != null);
            c.this.remove(this.b.a);
            this.b = null;
        }
    }

    final class f extends AbstractSet {
        final c a;
        final c b;

        public boolean a(Map.Entry map$Entry0) {
            throw new UnsupportedOperationException("ConcurrentLinkedHashMap does not allow add to be called on entrySet()");
        }

        @Override
        public boolean add(Object object0) {
            return this.a(((Map.Entry)object0));
        }

        @Override
        public void clear() {
            this.a.clear();
        }

        @Override
        public boolean contains(Object object0) {
            if(!(object0 instanceof Map.Entry)) {
                return false;
            }
            Object object1 = ((Map.Entry)object0).getKey();
            i c$i0 = (i)this.a.a.get(object1);
            return c$i0 != null && c$i0.g().equals(((Map.Entry)object0).getValue());
        }

        @Override
        public Iterator iterator() {
            return new e(c.this);
        }

        @Override
        public boolean remove(Object object0) {
            if(!(object0 instanceof Map.Entry)) {
                return false;
            }
            Object object1 = ((Map.Entry)object0).getKey();
            Object object2 = ((Map.Entry)object0).getValue();
            return this.a.remove(object1, object2);
        }

        @Override
        public int size() {
            return this.a.size();
        }
    }

    final class g implements Iterator {
        final Iterator a;
        Object b;
        final c c;

        g() {
            this.a = c0.a.keySet().iterator();
        }

        @Override
        public boolean hasNext() {
            return this.a.hasNext();
        }

        @Override
        public Object next() {
            Object object0 = this.a.next();
            this.b = object0;
            return object0;
        }

        @Override
        public void remove() {
            c.h(this.b != null);
            c.this.remove(this.b);
            this.b = null;
        }
    }

    final class h extends AbstractSet {
        final c a;
        final c b;

        @Override
        public void clear() {
            this.a.clear();
        }

        @Override
        public boolean contains(Object object0) {
            return c.this.containsKey(object0);
        }

        @Override
        public Iterator iterator() {
            return new g(c.this);
        }

        @Override
        public boolean remove(Object object0) {
            return this.a.remove(object0) != null;
        }

        @Override
        public int size() {
            return this.a.size();
        }

        @Override
        public Object[] toArray() {
            return this.a.a.keySet().toArray();
        }

        @Override
        public Object[] toArray(Object[] arr_object) {
            return this.a.a.keySet().toArray(arr_object);
        }
    }

    static final class i extends AtomicReference implements com.fasterxml.jackson.databind.util.internal.a {
        final Object a;
        i b;
        i c;

        i(Object object0, o c$o0) {
            super(c$o0);
            this.a = object0;
        }

        @Override  // com.fasterxml.jackson.databind.util.internal.a
        public com.fasterxml.jackson.databind.util.internal.a a() {
            return this.e();
        }

        @Override  // com.fasterxml.jackson.databind.util.internal.a
        public com.fasterxml.jackson.databind.util.internal.a b() {
            return this.f();
        }

        @Override  // com.fasterxml.jackson.databind.util.internal.a
        public void c(com.fasterxml.jackson.databind.util.internal.a a0) {
            this.i(((i)a0));
        }

        @Override  // com.fasterxml.jackson.databind.util.internal.a
        public void d(com.fasterxml.jackson.databind.util.internal.a a0) {
            this.h(((i)a0));
        }

        public i e() {
            return this.c;
        }

        public i f() {
            return this.b;
        }

        Object g() {
            return ((o)this.get()).b;
        }

        public void h(i c$i0) {
            this.c = c$i0;
        }

        public void i(i c$i0) {
            this.b = c$i0;
        }
    }

    final class j implements Runnable {
        final i a;
        final c b;

        j(i c$i0) {
            this.a = c$i0;
        }

        @Override
        public void run() {
            c.this.d.C(this.a);
            c.this.s(this.a);
        }
    }

    static final class k implements Serializable {
        final int a;
        final Map b;
        final long c;
        static final long d = 1L;

        k(c c0) {
            this.a = c0.b;
            this.b = new HashMap(c0);
            this.c = c0.f.get();
        }

        Object a() {
            c c0 = new com.fasterxml.jackson.databind.util.internal.c.c().d(this.c).a();
            c0.putAll(this.b);
            return c0;
        }
    }

    final class l implements Runnable {
        final int a;
        final i b;
        final c c;

        l(i c$i0, int v) {
            this.a = v;
            this.b = c$i0;
        }

        @Override
        public void run() {
            long v = c.this.e.get();
            c.this.e.lazySet(v + ((long)this.a));
            c.this.c(this.b);
            c.this.q();
        }
    }

    final class m implements Iterator {
        final Iterator a;
        i b;
        final c c;

        m() {
            this.a = c0.a.values().iterator();
        }

        @Override
        public boolean hasNext() {
            return this.a.hasNext();
        }

        @Override
        public Object next() {
            Object object0 = this.a.next();
            this.b = (i)object0;
            return ((i)object0).g();
        }

        @Override
        public void remove() {
            c.h(this.b != null);
            c.this.remove(this.b.a);
            this.b = null;
        }
    }

    final class n extends AbstractCollection {
        final c a;

        @Override
        public void clear() {
            c.this.clear();
        }

        @Override
        public boolean contains(Object object0) {
            return c.this.containsValue(object0);
        }

        @Override
        public Iterator iterator() {
            return new m(c.this);
        }

        @Override
        public int size() {
            return c.this.size();
        }
    }

    static final class o {
        final int a;
        final Object b;

        o(Object object0, int v) {
            this.a = v;
            this.b = object0;
        }

        boolean a(Object object0) {
            return object0 == this.b || this.b.equals(object0);
        }

        boolean b() {
            return this.a > 0;
        }
    }

    final class p extends AbstractMap.SimpleEntry {
        final c a;
        static final long b = 1L;

        p(i c$i0) {
            Object object0 = c$i0.g();
            super(c$i0.a, object0);
        }

        Object a() {
            return new AbstractMap.SimpleEntry(this);
        }

        @Override
        public Object setValue(Object object0) {
            Object object1 = this.getKey();
            c.this.put(object1, object0);
            return super.setValue(object0);
        }
    }

    final java.util.concurrent.ConcurrentMap a;
    final int b;
    final long[] c;
    final com.fasterxml.jackson.databind.util.internal.b d;
    final AtomicLong e;
    final AtomicLong f;
    final Lock g;
    final Queue h;
    final AtomicLongArray i;
    final AtomicLongArray j;
    final AtomicReferenceArray k;
    final AtomicReference l;
    transient Set m;
    transient Collection n;
    transient Set o;
    static final int p = 0;
    static final long q = 0x7FFFFFFF80000000L;
    static final int r = 0;
    static final int s = 0;
    static final int t = 4;
    static final int u = 8;
    static final int v = 16;
    static final int w = 15;
    static final int x = 16;
    static final long y = 1L;

    static {
        int v = Runtime.getRuntime().availableProcessors();
        c.p = v;
        int v1 = Math.min(4, c.e(v));
        c.r = v1;
        c.s = v1 - 1;
    }

    c(com.fasterxml.jackson.databind.util.internal.c.c c$c0) {
        int v = c$c0.a;
        this.b = v;
        this.f = new AtomicLong(Math.min(c$c0.c, 0x7FFFFFFF80000000L));
        this.a = new ConcurrentHashMap(c$c0.b, 0.75f, v);
        this.g = new ReentrantLock();
        this.e = new AtomicLong();
        this.d = new com.fasterxml.jackson.databind.util.internal.b();
        this.h = new ConcurrentLinkedQueue();
        this.l = new AtomicReference(d.a);
        this.c = new long[c.r];
        this.i = new AtomicLongArray(c.r);
        this.j = new AtomicLongArray(c.r);
        this.k = new AtomicReferenceArray(c.r * 16);
    }

    long A(int v, i c$i0) {
        long v1 = this.i.get(v);
        this.i.lazySet(v, v1 + 1L);
        this.k.lazySet(v * 16 + ((int)(15L & v1)), c$i0);
        return v1;
    }

    public void B(long v) {
        c.f(v >= 0L);
        this.g.lock();
        try {
            this.f.lazySet(Math.min(v, 0x7FFFFFFF80000000L));
            this.i();
            this.q();
        }
        finally {
            this.g.unlock();
        }
    }

    void C() {
        if(this.g.tryLock()) {
            try {
                this.l.lazySet(d.c);
                this.i();
            }
            finally {
                androidx.compose.animation.core.d.a(this.l, d.c, d.a);
                this.g.unlock();
            }
        }
    }

    // 去混淆评级： 低(20)
    boolean D(i c$i0, o c$o0) {
        return c$o0.b() ? c$i0.compareAndSet(c$o0, new o(c$o0.b, -c$o0.a)) : false;
    }

    Object E() {
        return new k(this);
    }

    void a(i c$i0) {
        this.j(2, this.A(2, c$i0));
    }

    void b(Runnable runnable0) {
        this.h.add(runnable0);
        this.l.lazySet(d.b);
        this.C();
    }

    void c(i c$i0) {
        if(this.d.g(c$i0)) {
            this.d.m(c$i0);
        }
    }

    @Override
    public void clear() {
        this.g.lock();
        try {
            i c$i0;
            while((c$i0 = (i)this.d.v()) != null) {
                this.a.remove(c$i0.a, c$i0);
                this.s(c$i0);
            }
            for(int v1 = 0; v1 < this.k.length(); ++v1) {
                this.k.lazySet(v1, null);
            }
            Runnable runnable0;
            while((runnable0 = (Runnable)this.h.poll()) != null) {
                runnable0.run();
            }
        }
        finally {
            this.g.unlock();
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
    public boolean containsKey(Object object0) {
        return this.a.containsKey(object0);
    }

    @Override
    public boolean containsValue(Object object0) {
        c.g(object0);
        for(Object object1: this.a.values()) {
            if(((i)object1).g().equals(object0)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public long d() {
        return this.f.get();
    }

    static int e(int v) {
        return 1 << 0x20 - Integer.numberOfLeadingZeros(v - 1);
    }

    @Override
    public Set entrySet() {
        Set set0 = this.o;
        if(set0 == null) {
            set0 = new f(this);
            this.o = set0;
        }
        return set0;
    }

    static void f(boolean z) {
        if(!z) {
            throw new IllegalArgumentException();
        }
    }

    @Override  // j$.util.concurrent.ConcurrentMap
    public void forEach(BiConsumer biConsumer0) {
        ConcurrentMap.-CC.$default$forEach(this, biConsumer0);
    }

    static void g(Object object0) {
        object0.getClass();
    }

    @Override
    public Object get(Object object0) {
        i c$i0 = (i)this.a.get(object0);
        if(c$i0 == null) {
            return null;
        }
        this.a(c$i0);
        return c$i0.g();
    }

    @Override  // j$.util.concurrent.ConcurrentMap
    public Object getOrDefault(Object object0, Object object1) {
        return ConcurrentMap.-CC.$default$getOrDefault(this, object0, object1);
    }

    static void h(boolean z) {
        if(!z) {
            throw new IllegalStateException();
        }
    }

    void i() {
        this.m();
        this.o();
    }

    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }

    void j(int v, long v1) {
        boolean z = v1 - this.j.get(v) < 4L;
        if(((d)this.l.get()).a(z)) {
            this.C();
        }
    }

    @Override
    public Set keySet() {
        Set set0 = this.m;
        if(set0 == null) {
            set0 = new h(this);
            this.m = set0;
        }
        return set0;
    }

    void l(int v) {
        long v1 = this.i.get(v);
        for(int v2 = 0; v2 < 8; ++v2) {
            int v3 = c.y(v, ((int)(this.c[v] & 15L)));
            i c$i0 = (i)this.k.get(v3);
            if(c$i0 == null) {
                break;
            }
            this.k.lazySet(v3, null);
            this.c(c$i0);
            ++this.c[v];
        }
        this.j.lazySet(v, v1);
    }

    void m() {
        int v = (int)Thread.currentThread().getId();
        int v1 = c.r + v;
        while(v < v1) {
            this.l(c.s & v);
            ++v;
        }
    }

    @Override  // j$.util.concurrent.ConcurrentMap
    public Object merge(Object object0, Object object1, BiFunction biFunction0) {
        return ConcurrentMap.-CC.$default$merge(this, object0, object1, biFunction0);
    }

    void o() {
        for(int v = 0; v < 16; ++v) {
            Runnable runnable0 = (Runnable)this.h.poll();
            if(runnable0 == null) {
                break;
            }
            runnable0.run();
        }
    }

    @Override
    public Object put(Object object0, Object object1) {
        return this.w(object0, object1, false);
    }

    @Override  // j$.util.Map
    public Object putIfAbsent(Object object0, Object object1) {
        return this.w(object0, object1, true);
    }

    void q() {
        while(this.r()) {
            i c$i0 = (i)this.d.v();
            if(c$i0 == null) {
                return;
            }
            this.a.remove(c$i0.a, c$i0);
            this.s(c$i0);
        }
    }

    boolean r() {
        return this.e.get() > this.f.get();
    }

    @Override
    public Object remove(Object object0) {
        i c$i0 = (i)this.a.remove(object0);
        if(c$i0 == null) {
            return null;
        }
        this.u(c$i0);
        this.b(new j(this, c$i0));
        return c$i0.g();
    }

    @Override  // j$.util.Map
    public boolean remove(Object object0, Object object1) {
        i c$i0 = (i)this.a.get(object0);
        if(c$i0 != null && object1 != null) {
            o c$o0 = (o)c$i0.get();
            while(c$o0.a(object1)) {
                if(this.D(c$i0, c$o0)) {
                    if(!this.a.remove(object0, c$i0)) {
                        break;
                    }
                    this.b(new j(this, c$i0));
                    return true;
                }
                c$o0 = (o)c$i0.get();
                if(!c$o0.b()) {
                    break;
                }
            }
        }
        return false;
    }

    @Override  // j$.util.Map
    public Object replace(Object object0, Object object1) {
        o c$o1;
        c.g(object0);
        c.g(object1);
        o c$o0 = new o(object1, 1);
        i c$i0 = (i)this.a.get(object0);
        if(c$i0 == null) {
            return null;
        }
        do {
            c$o1 = (o)c$i0.get();
            if(!c$o1.b()) {
                return null;
            }
        }
        while(!c$i0.compareAndSet(c$o1, c$o0));
        int v = 1 - c$o1.a;
        if(v == 0) {
            this.a(c$i0);
            return c$o1.b;
        }
        this.b(new l(this, c$i0, v));
        return c$o1.b;
    }

    @Override  // j$.util.Map
    public boolean replace(Object object0, Object object1, Object object2) {
        c.g(object0);
        c.g(object1);
        c.g(object2);
        o c$o0 = new o(object2, 1);
        i c$i0 = (i)this.a.get(object0);
        if(c$i0 == null) {
            return false;
        }
        while(true) {
            o c$o1 = (o)c$i0.get();
            if(!c$o1.b() || !c$o1.a(object1)) {
                break;
            }
            if(c$i0.compareAndSet(c$o1, c$o0)) {
                int v = 1 - c$o1.a;
                if(v == 0) {
                    this.a(c$i0);
                    return true;
                }
                this.b(new l(this, c$i0, v));
                return true;
            }
        }
        return false;
    }

    @Override  // j$.util.concurrent.ConcurrentMap
    public void replaceAll(BiFunction biFunction0) {
        ConcurrentMap.-CC.$default$replaceAll(this, biFunction0);
    }

    void s(i c$i0) {
        o c$o0;
        do {
            c$o0 = (o)c$i0.get();
        }
        while(!c$i0.compareAndSet(c$o0, new o(c$o0.b, 0)));
        long v = this.e.get();
        this.e.lazySet(v - ((long)Math.abs(c$o0.a)));
    }

    @Override
    public int size() {
        return this.a.size();
    }

    void u(i c$i0) {
        do {
            o c$o0 = (o)c$i0.get();
            if(!c$o0.b()) {
                return;
            }
        }
        while(!c$i0.compareAndSet(c$o0, new o(c$o0.b, -c$o0.a)));
    }

    @Override
    public Collection values() {
        Collection collection0 = this.n;
        if(collection0 == null) {
            collection0 = new n(this);
            this.n = collection0;
        }
        return collection0;
    }

    Object w(Object object0, Object object1, boolean z) {
        o c$o1;
        i c$i1;
        c.g(object0);
        c.g(object1);
        o c$o0 = new o(object1, 1);
        i c$i0 = new i(object0, c$o0);
        do {
            c$i1 = (i)this.a.putIfAbsent(c$i0.a, c$i0);
            if(c$i1 == null) {
                this.b(new b(this, c$i0, 1));
                return null;
            }
            if(z) {
                this.a(c$i1);
                return c$i1.g();
            }
        label_11:
            c$o1 = (o)c$i1.get();
        }
        while(!c$o1.b());
        if(!c$i1.compareAndSet(c$o1, c$o0)) {
            goto label_11;
        }
        int v = 1 - c$o1.a;
        if(v == 0) {
            this.a(c$i1);
            return c$o1.b;
        }
        this.b(new l(this, c$i1, v));
        return c$o1.b;
    }

    static int x() [...] // 潜在的解密器

    private static int y(int v, int v1) [...] // Inlined contents

    private void z(ObjectInputStream objectInputStream0) throws InvalidObjectException {
        throw new InvalidObjectException("Proxy required");
    }
}

