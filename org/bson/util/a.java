package org.bson.util;

import j..util.DesugarCollections;
import j..util.concurrent.ConcurrentMap.-CC;
import j..util.concurrent.ConcurrentMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import jeb.synthetic.FIN;

abstract class a implements ConcurrentMap, java.util.concurrent.ConcurrentMap {
    static class org.bson.util.a.a {
    }

    public static abstract class b implements Collection {
        abstract Collection a();

        @Override
        public final boolean add(Object object0) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final boolean addAll(Collection collection0) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final boolean contains(Object object0) {
            return this.a().contains(object0);
        }

        @Override
        public final boolean containsAll(Collection collection0) {
            return this.a().containsAll(collection0);
        }

        @Override
        public boolean equals(Object object0) {
            return this.a().equals(object0);
        }

        @Override
        public int hashCode() {
            return this.a().hashCode();
        }

        @Override
        public final boolean isEmpty() {
            return this.a().isEmpty();
        }

        @Override
        public final Iterator iterator() {
            return new g(this.a().iterator());
        }

        @Override
        public final int size() {
            return this.a().size();
        }

        @Override
        public final Object[] toArray() {
            return this.a().toArray();
        }

        @Override
        public final Object[] toArray(Object[] arr_object) {
            return this.a().toArray(arr_object);
        }

        @Override
        public String toString() {
            return this.a().toString();
        }
    }

    class c extends b implements Set {
        final a a;

        private c() {
        }

        c(org.bson.util.a.a a$a0) {
        }

        @Override  // org.bson.util.a$b
        Collection a() {
            return a.this.a.entrySet();
        }

        @Override
        public void clear() {
            a.this.b.lock();
            try {
                Map map0 = a.this.c();
                map0.entrySet().clear();
                a.this.g(map0);
            }
            finally {
                a.this.b.unlock();
            }
        }

        @Override
        public boolean remove(Object object0) {
            boolean z;
            int v1;
            a.this.b.lock();
            try {
                if(!this.contains(object0)) {
                    return false;
                }
                Map map0 = a.this.c();
                v1 = FIN.finallyOpen$NT();
                z = map0.entrySet().remove(object0);
                FIN.finallyCodeBegin$NT(v1);
                a.this.g(map0);
            }
            finally {
                a.this.b.unlock();
            }
            FIN.finallyCodeEnd$NT(v1);
            return z;
        }

        @Override
        public boolean removeAll(Collection collection0) {
            boolean z;
            a.this.b.lock();
            try {
                Map map0 = a.this.c();
                try {
                    z = map0.entrySet().removeAll(collection0);
                }
                catch(Throwable throwable0) {
                    a.this.g(map0);
                    throw throwable0;
                }
                a.this.g(map0);
                return z;
            }
            finally {
                a.this.b.unlock();
            }
        }

        @Override
        public boolean retainAll(Collection collection0) {
            boolean z;
            a.this.b.lock();
            try {
                Map map0 = a.this.c();
                try {
                    z = map0.entrySet().retainAll(collection0);
                }
                catch(Throwable throwable0) {
                    a.this.g(map0);
                    throw throwable0;
                }
                a.this.g(map0);
                return z;
            }
            finally {
                a.this.b.unlock();
            }
        }
    }

    final class d extends i {
        final a a;

        @Override  // org.bson.util.a$i
        public Set a() {
            return DesugarCollections.unmodifiableSet(a.this.a.entrySet());
        }

        @Override  // org.bson.util.a$i
        public Set b() {
            return DesugarCollections.unmodifiableSet(a.this.a.keySet());
        }

        @Override  // org.bson.util.a$i
        public Collection c() {
            return DesugarCollections.unmodifiableCollection(a.this.a.values());
        }
    }

    class e extends b implements Set {
        final a a;

        private e() {
        }

        e(org.bson.util.a.a a$a0) {
        }

        @Override  // org.bson.util.a$b
        Collection a() {
            return a.this.a.keySet();
        }

        @Override
        public void clear() {
            a.this.b.lock();
            try {
                Map map0 = a.this.c();
                map0.keySet().clear();
                a.this.g(map0);
            }
            finally {
                a.this.b.unlock();
            }
        }

        @Override
        public boolean remove(Object object0) {
            return a.this.remove(object0) != null;
        }

        @Override
        public boolean removeAll(Collection collection0) {
            boolean z;
            a.this.b.lock();
            try {
                Map map0 = a.this.c();
                try {
                    z = map0.keySet().removeAll(collection0);
                }
                catch(Throwable throwable0) {
                    a.this.g(map0);
                    throw throwable0;
                }
                a.this.g(map0);
                return z;
            }
            finally {
                a.this.b.unlock();
            }
        }

        @Override
        public boolean retainAll(Collection collection0) {
            boolean z;
            a.this.b.lock();
            try {
                Map map0 = a.this.c();
                try {
                    z = map0.keySet().retainAll(collection0);
                }
                catch(Throwable throwable0) {
                    a.this.g(map0);
                    throw throwable0;
                }
                a.this.g(map0);
                return z;
            }
            finally {
                a.this.b.unlock();
            }
        }
    }

    final class f extends i {
        private final transient e a;
        private final transient c b;
        private final transient h c;
        final a d;

        f() {
            this.a = new e(a0, null);
            this.b = new c(a0, null);
            this.c = new h(a0, null);
        }

        @Override  // org.bson.util.a$i
        public Set a() {
            return this.b;
        }

        @Override  // org.bson.util.a$i
        public Set b() {
            return this.a;
        }

        @Override  // org.bson.util.a$i
        public Collection c() {
            return this.c;
        }
    }

    static class g implements Iterator {
        private final Iterator a;

        g(Iterator iterator0) {
            this.a = iterator0;
        }

        @Override
        public boolean hasNext() {
            return this.a.hasNext();
        }

        @Override
        public Object next() {
            return this.a.next();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    final class h extends b {
        final a a;

        private h() {
        }

        h(org.bson.util.a.a a$a0) {
        }

        @Override  // org.bson.util.a$b
        Collection a() {
            return a.this.a.values();
        }

        @Override
        public void clear() {
            a.this.b.lock();
            try {
                Map map0 = a.this.c();
                map0.values().clear();
                a.this.g(map0);
            }
            finally {
                a.this.b.unlock();
            }
        }

        @Override
        public boolean remove(Object object0) {
            boolean z;
            int v1;
            a.this.b.lock();
            try {
                if(!this.contains(object0)) {
                    return false;
                }
                Map map0 = a.this.c();
                v1 = FIN.finallyOpen$NT();
                z = map0.values().remove(object0);
                FIN.finallyCodeBegin$NT(v1);
                a.this.g(map0);
            }
            finally {
                a.this.b.unlock();
            }
            FIN.finallyCodeEnd$NT(v1);
            return z;
        }

        @Override
        public boolean removeAll(Collection collection0) {
            boolean z;
            a.this.b.lock();
            try {
                Map map0 = a.this.c();
                try {
                    z = map0.values().removeAll(collection0);
                }
                catch(Throwable throwable0) {
                    a.this.g(map0);
                    throw throwable0;
                }
                a.this.g(map0);
                return z;
            }
            finally {
                a.this.b.unlock();
            }
        }

        @Override
        public boolean retainAll(Collection collection0) {
            boolean z;
            a.this.b.lock();
            try {
                Map map0 = a.this.c();
                try {
                    z = map0.values().retainAll(collection0);
                }
                catch(Throwable throwable0) {
                    a.this.g(map0);
                    throw throwable0;
                }
                a.this.g(map0);
                return z;
            }
            finally {
                a.this.b.unlock();
            }
        }
    }

    public static abstract class i {
        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        public static abstract class org.bson.util.a.i.a extends Enum {
            // 部分失败：枚举糖化
            // 枚举按原样呈现，而不是糖化为Java 5枚举。
            final class org.bson.util.a.i.a.a extends org.bson.util.a.i.a {
                org.bson.util.a.i.a.a(String s, int v) {
                    super(s, v, null);
                }

                @Override  // org.bson.util.a$i$a
                i a(a a0) {
                    a0.getClass();
                    return new d(a0);
                }
            }

            // 部分失败：枚举糖化
            // 枚举按原样呈现，而不是糖化为Java 5枚举。
            final class org.bson.util.a.i.a.b extends org.bson.util.a.i.a {
                org.bson.util.a.i.a.b(String s, int v) {
                    super(s, v, null);
                }

                @Override  // org.bson.util.a$i$a
                i a(a a0) {
                    a0.getClass();
                    return new f(a0);
                }
            }

            public static final enum org.bson.util.a.i.a a;
            public static final enum org.bson.util.a.i.a b;
            private static final org.bson.util.a.i.a[] c;

            static {
                org.bson.util.a.i.a.a a$i$a$a0 = new org.bson.util.a.i.a.a("STABLE", 0);
                org.bson.util.a.i.a.a = a$i$a$a0;
                org.bson.util.a.i.a.b a$i$a$b0 = new org.bson.util.a.i.a.b("LIVE", 1);
                org.bson.util.a.i.a.b = a$i$a$b0;
                org.bson.util.a.i.a.c = new org.bson.util.a.i.a[]{a$i$a$a0, a$i$a$b0};
            }

            private org.bson.util.a.i.a(String s, int v) {
                super(s, v);
            }

            org.bson.util.a.i.a(String s, int v, org.bson.util.a.a a$a0) {
                this(s, v);
            }

            abstract i a(a arg1);

            public static org.bson.util.a.i.a valueOf(String s) {
                return (org.bson.util.a.i.a)Enum.valueOf(org.bson.util.a.i.a.class, s);
            }

            public static org.bson.util.a.i.a[] values() {
                return (org.bson.util.a.i.a[])org.bson.util.a.i.a.c.clone();
            }
        }

        abstract Set a();

        abstract Set b();

        abstract Collection c();
    }

    private volatile Map a;
    private final transient Lock b;
    private final i c;

    protected a(Map map0, org.bson.util.a.i.a a$i$a0) {
        this.b = new ReentrantLock();
        this.a = (Map)R3.a.e("delegate", this.d(((Map)R3.a.e("map", map0))));
        this.c = ((org.bson.util.a.i.a)R3.a.e("viewType", a$i$a0)).a(this);
    }

    protected Map c() {
        this.b.lock();
        try {
            return this.d(this.a);
        }
        finally {
            this.b.unlock();
        }
    }

    @Override
    public final void clear() {
        this.b.lock();
        try {
            this.g(this.d(Collections.emptyMap()));
        }
        finally {
            this.b.unlock();
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
    public final boolean containsKey(Object object0) {
        return this.a.containsKey(object0);
    }

    @Override
    public final boolean containsValue(Object object0) {
        return this.a.containsValue(object0);
    }

    abstract Map d(Map arg1);

    private boolean e(Object object0, Object object1) {
        return object0 == null ? object1 == null : object0.equals(object1);
    }

    @Override
    public final Set entrySet() {
        return this.c.a();
    }

    @Override
    public final boolean equals(Object object0) {
        return this.a.equals(object0);
    }

    protected final Map f() {
        return this.a;
    }

    @Override  // j$.util.concurrent.ConcurrentMap
    public void forEach(BiConsumer biConsumer0) {
        ConcurrentMap.-CC.$default$forEach(this, biConsumer0);
    }

    protected void g(Map map0) {
        this.a = map0;
    }

    @Override
    public final Object get(Object object0) {
        return this.a.get(object0);
    }

    @Override  // j$.util.concurrent.ConcurrentMap
    public Object getOrDefault(Object object0, Object object1) {
        return ConcurrentMap.-CC.$default$getOrDefault(this, object0, object1);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override
    public final Set keySet() {
        return this.c.b();
    }

    @Override  // j$.util.concurrent.ConcurrentMap
    public Object merge(Object object0, Object object1, BiFunction biFunction0) {
        return ConcurrentMap.-CC.$default$merge(this, object0, object1, biFunction0);
    }

    @Override
    public final Object put(Object object0, Object object1) {
        Object object2;
        this.b.lock();
        try {
            Map map0 = this.c();
            try {
                object2 = map0.put(object0, object1);
            }
            catch(Throwable throwable0) {
                this.g(map0);
                throw throwable0;
            }
            this.g(map0);
            return object2;
        }
        finally {
            this.b.unlock();
        }
    }

    @Override
    public final void putAll(Map map0) {
        this.b.lock();
        try {
            Map map1 = this.c();
            map1.putAll(map0);
            this.g(map1);
        }
        finally {
            this.b.unlock();
        }
    }

    @Override  // j$.util.Map
    public Object putIfAbsent(Object object0, Object object1) {
        Object object2;
        this.b.lock();
        try {
            if(this.a.containsKey(object0)) {
                object2 = this.a.get(object0);
            }
            else {
                Map map0 = this.c();
                try {
                    object2 = map0.put(object0, object1);
                }
                catch(Throwable throwable0) {
                    this.g(map0);
                    throw throwable0;
                }
                this.g(map0);
            }
            return object2;
        }
        finally {
            this.b.unlock();
        }
    }

    @Override
    public final Object remove(Object object0) {
        Object object1;
        int v1;
        this.b.lock();
        try {
            if(!this.a.containsKey(object0)) {
                return null;
            }
            Map map0 = this.c();
            v1 = FIN.finallyOpen$NT();
            object1 = map0.remove(object0);
            FIN.finallyCodeBegin$NT(v1);
            this.g(map0);
        }
        finally {
            this.b.unlock();
        }
        FIN.finallyCodeEnd$NT(v1);
        return object1;
    }

    @Override  // j$.util.Map
    public boolean remove(Object object0, Object object1) {
        this.b.lock();
        try {
            if(this.a.containsKey(object0) && this.e(object1, this.a.get(object0))) {
                Map map0 = this.c();
                map0.remove(object0);
                this.g(map0);
                return true;
            }
            return false;
        }
        finally {
            this.b.unlock();
        }
    }

    @Override  // j$.util.Map
    public Object replace(Object object0, Object object1) {
        Object object2;
        int v1;
        this.b.lock();
        try {
            if(!this.a.containsKey(object0)) {
                return null;
            }
            Map map0 = this.c();
            v1 = FIN.finallyOpen$NT();
            object2 = map0.put(object0, object1);
            FIN.finallyCodeBegin$NT(v1);
            this.g(map0);
        }
        finally {
            this.b.unlock();
        }
        FIN.finallyCodeEnd$NT(v1);
        return object2;
    }

    @Override  // j$.util.Map
    public boolean replace(Object object0, Object object1, Object object2) {
        this.b.lock();
        try {
            if(this.a.containsKey(object0) && this.e(object1, this.a.get(object0))) {
                Map map0 = this.c();
                map0.put(object0, object2);
                this.g(map0);
                return true;
            }
            return false;
        }
        finally {
            this.b.unlock();
        }
    }

    @Override  // j$.util.concurrent.ConcurrentMap
    public void replaceAll(BiFunction biFunction0) {
        ConcurrentMap.-CC.$default$replaceAll(this, biFunction0);
    }

    @Override
    public final int size() {
        return this.a.size();
    }

    @Override
    public String toString() {
        return this.a.toString();
    }

    @Override
    public final Collection values() {
        return this.c.c();
    }
}

