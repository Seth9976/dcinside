package com.google.crypto.tink.shaded.protobuf;

import j..util.DesugarCollections;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class w1 extends AbstractMap {
    class b implements Iterator {
        private int a;
        private Iterator b;
        final w1 c;

        private b() {
            this.a = w10.b.size();
        }

        b(a w1$a0) {
        }

        private Iterator a() {
            if(this.b == null) {
                this.b = w1.this.f.entrySet().iterator();
            }
            return this.b;
        }

        public Map.Entry b() {
            if(this.a().hasNext()) {
                return this.a().next();
            }
            int v = this.a - 1;
            this.a = v;
            return (Map.Entry)w1.this.b.get(v);
        }

        // 去混淆评级： 低(30)
        @Override
        public boolean hasNext() {
            return this.a > 0 && this.a <= w1.this.b.size() || this.a().hasNext();
        }

        @Override
        public Object next() {
            return this.b();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class c extends g {
        final w1 b;

        private c() {
            super(null);
        }

        c(a w1$a0) {
        }

        @Override  // com.google.crypto.tink.shaded.protobuf.w1$g
        public Iterator iterator() {
            return new b(w1.this, null);
        }
    }

    static class d {
        class com.google.crypto.tink.shaded.protobuf.w1.d.a implements Iterator {
            com.google.crypto.tink.shaded.protobuf.w1.d.a() {
                super();
            }

            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        class com.google.crypto.tink.shaded.protobuf.w1.d.b implements Iterable {
            com.google.crypto.tink.shaded.protobuf.w1.d.b() {
                super();
            }

            @Override
            public Iterator iterator() {
                return d.a;
            }
        }

        private static final Iterator a;
        private static final Iterable b;

        static {
            d.a = new com.google.crypto.tink.shaded.protobuf.w1.d.a();
            d.b = new com.google.crypto.tink.shaded.protobuf.w1.d.b();
        }

        static Iterable b() {
            return d.b;
        }
    }

    class e implements Comparable, Map.Entry {
        private final Comparable a;
        private Object b;
        final w1 c;

        e(Comparable comparable0, Object object0) {
            this.a = comparable0;
            this.b = object0;
        }

        e(Map.Entry map$Entry0) {
            this(((Comparable)map$Entry0.getKey()), map$Entry0.getValue());
        }

        public int a(e w1$e0) {
            return this.c().compareTo(w1$e0.c());
        }

        private boolean b(Object object0, Object object1) {
            return object0 == null ? object1 == null : object0.equals(object1);
        }

        public Comparable c() {
            return this.a;
        }

        @Override
        public int compareTo(Object object0) {
            return this.a(((e)object0));
        }

        @Override
        public boolean equals(Object object0) {
            if(object0 == this) {
                return true;
            }
            if(!(object0 instanceof Map.Entry)) {
                return false;
            }
            Object object1 = ((Map.Entry)object0).getKey();
            return this.b(this.a, object1) && this.b(this.b, ((Map.Entry)object0).getValue());
        }

        @Override
        public Object getKey() {
            return this.c();
        }

        @Override
        public Object getValue() {
            return this.b;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.a == null ? 0 : this.a.hashCode();
            Object object0 = this.b;
            if(object0 != null) {
                v = object0.hashCode();
            }
            return v1 ^ v;
        }

        @Override
        public Object setValue(Object object0) {
            w1.this.g();
            Object object1 = this.b;
            this.b = object0;
            return object1;
        }

        @Override
        public String toString() {
            return this.a + "=" + this.b;
        }
    }

    class f implements Iterator {
        private int a;
        private boolean b;
        private Iterator c;
        final w1 d;

        private f() {
            this.a = -1;
        }

        f(a w1$a0) {
        }

        private Iterator a() {
            if(this.c == null) {
                this.c = w1.this.c.entrySet().iterator();
            }
            return this.c;
        }

        public Map.Entry b() {
            this.b = true;
            int v = this.a + 1;
            this.a = v;
            return v < w1.this.b.size() ? ((Map.Entry)w1.this.b.get(this.a)) : this.a().next();
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean hasNext() {
            return this.a + 1 < w1.this.b.size() || !w1.this.c.isEmpty() && this.a().hasNext();
        }

        @Override
        public Object next() {
            return this.b();
        }

        @Override
        public void remove() {
            if(!this.b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.b = false;
            w1.this.g();
            if(this.a < w1.this.b.size()) {
                int v = this.a;
                this.a = v - 1;
                w1.this.x(v);
                return;
            }
            this.a().remove();
        }
    }

    class g extends AbstractSet {
        final w1 a;

        private g() {
        }

        g(a w1$a0) {
        }

        public boolean a(Map.Entry map$Entry0) {
            if(!this.contains(map$Entry0)) {
                Comparable comparable0 = (Comparable)map$Entry0.getKey();
                Object object0 = map$Entry0.getValue();
                w1.this.w(comparable0, object0);
                return true;
            }
            return false;
        }

        @Override
        public boolean add(Object object0) {
            return this.a(((Map.Entry)object0));
        }

        @Override
        public void clear() {
            w1.this.clear();
        }

        @Override
        public boolean contains(Object object0) {
            Object object1 = ((Map.Entry)object0).getKey();
            Object object2 = w1.this.get(object1);
            Object object3 = ((Map.Entry)object0).getValue();
            return object2 == object3 || object2 != null && object2.equals(object3);
        }

        @Override
        public Iterator iterator() {
            return new f(w1.this, null);
        }

        @Override
        public boolean remove(Object object0) {
            if(this.contains(((Map.Entry)object0))) {
                Object object1 = ((Map.Entry)object0).getKey();
                w1.this.remove(object1);
                return true;
            }
            return false;
        }

        @Override
        public int size() {
            return w1.this.size();
        }
    }

    private final int a;
    private List b;
    private Map c;
    private boolean d;
    private volatile g e;
    private Map f;
    private volatile c g;

    private w1(int v) {
        this.a = v;
        this.b = Collections.emptyList();
        this.c = Collections.emptyMap();
        this.f = Collections.emptyMap();
    }

    w1(int v, a w1$a0) {
        this(v);
    }

    @Override
    public void clear() {
        this.g();
        if(!this.b.isEmpty()) {
            this.b.clear();
        }
        if(!this.c.isEmpty()) {
            this.c.clear();
        }
    }

    @Override
    public boolean containsKey(Object object0) {
        return this.f(((Comparable)object0)) >= 0 || this.c.containsKey(((Comparable)object0));
    }

    @Override
    public Set entrySet() {
        if(this.e == null) {
            this.e = new g(this, null);
        }
        return this.e;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof w1)) {
            return super.equals(object0);
        }
        int v = this.size();
        if(v != ((w1)object0).size()) {
            return false;
        }
        int v1 = this.l();
        if(v1 != ((w1)object0).l()) {
            return this.entrySet().equals(((w1)object0).entrySet());
        }
        for(int v2 = 0; v2 < v1; ++v2) {
            if(!this.j(v2).equals(((w1)object0).j(v2))) {
                return false;
            }
        }
        return v1 == v ? true : this.c.equals(((w1)object0).c);
    }

    private int f(Comparable comparable0) {
        int v = this.b.size();
        int v1 = v - 1;
        if(v1 >= 0) {
            int v2 = comparable0.compareTo(((e)this.b.get(v1)).c());
            if(v2 > 0) {
                return -(v + 1);
            }
            if(v2 == 0) {
                return v1;
            }
        }
        int v3 = 0;
        while(v3 <= v1) {
            int v4 = (v3 + v1) / 2;
            int v5 = comparable0.compareTo(((e)this.b.get(v4)).c());
            if(v5 < 0) {
                v1 = v4 - 1;
                continue;
            }
            if(v5 > 0) {
                v3 = v4 + 1;
                continue;
            }
            return v4;
        }
        return -(v3 + 1);
    }

    private void g() {
        if(this.d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public Object get(Object object0) {
        int v = this.f(((Comparable)object0));
        return v < 0 ? this.c.get(((Comparable)object0)) : ((e)this.b.get(v)).getValue();
    }

    Set h() {
        if(this.g == null) {
            this.g = new c(this, null);
        }
        return this.g;
    }

    @Override
    public int hashCode() {
        int v = this.l();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += ((e)this.b.get(v1)).hashCode();
        }
        return this.m() <= 0 ? v2 : v2 + this.c.hashCode();
    }

    private void i() {
        this.g();
        if(this.b.isEmpty() && !(this.b instanceof ArrayList)) {
            this.b = new ArrayList(this.a);
        }
    }

    public Map.Entry j(int v) {
        return (Map.Entry)this.b.get(v);
    }

    public int l() {
        return this.b.size();
    }

    public int m() {
        return this.c.size();
    }

    public Iterable o() {
        return this.c.isEmpty() ? d.b() : this.c.entrySet();
    }

    @Override
    public Object put(Object object0, Object object1) {
        return this.w(((Comparable)object0), object1);
    }

    Iterable q() {
        return this.f.isEmpty() ? d.b() : this.f.entrySet();
    }

    private SortedMap r() {
        this.g();
        if(this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap0 = new TreeMap();
            this.c = treeMap0;
            this.f = treeMap0.descendingMap();
        }
        return (SortedMap)this.c;
    }

    @Override
    public Object remove(Object object0) {
        this.g();
        int v = this.f(((Comparable)object0));
        if(v >= 0) {
            return this.x(v);
        }
        return this.c.isEmpty() ? null : this.c.remove(((Comparable)object0));
    }

    public boolean s() {
        return this.d;
    }

    @Override
    public int size() {
        return this.b.size() + this.c.size();
    }

    public void t() {
        if(!this.d) {
            this.c = this.c.isEmpty() ? Collections.emptyMap() : DesugarCollections.unmodifiableMap(this.c);
            this.f = this.f.isEmpty() ? Collections.emptyMap() : DesugarCollections.unmodifiableMap(this.f);
            this.d = true;
        }
    }

    static w1 u(int v) {
        class a extends w1 {
            a(int v) {
                super(v, null);
            }

            @Override  // com.google.crypto.tink.shaded.protobuf.w1
            public Object put(Object object0, Object object1) {
                return super.w(((Comparable)object0), object1);
            }

            @Override  // com.google.crypto.tink.shaded.protobuf.w1
            public void t() {
                if(!this.s()) {
                    for(int v = 0; v < this.l(); ++v) {
                        Map.Entry map$Entry0 = this.j(v);
                        if(((com.google.crypto.tink.shaded.protobuf.f0.c)map$Entry0.getKey()).isRepeated()) {
                            map$Entry0.setValue(DesugarCollections.unmodifiableList(((List)map$Entry0.getValue())));
                        }
                    }
                    for(Object object0: this.o()) {
                        Map.Entry map$Entry1 = (Map.Entry)object0;
                        if(((com.google.crypto.tink.shaded.protobuf.f0.c)map$Entry1.getKey()).isRepeated()) {
                            map$Entry1.setValue(DesugarCollections.unmodifiableList(((List)map$Entry1.getValue())));
                        }
                    }
                }
                super.t();
            }
        }

        return new a(v);
    }

    static w1 v(int v) {
        return new w1(v);
    }

    public Object w(Comparable comparable0, Object object0) {
        this.g();
        int v = this.f(comparable0);
        if(v >= 0) {
            return ((e)this.b.get(v)).setValue(object0);
        }
        this.i();
        if(-(v + 1) >= this.a) {
            return this.r().put(comparable0, object0);
        }
        int v1 = this.a;
        if(this.b.size() == v1) {
            e w1$e0 = (e)this.b.remove(v1 - 1);
            this.r().put(w1$e0.c(), w1$e0.getValue());
        }
        this.b.add(-(v + 1), new e(this, comparable0, object0));
        return null;
    }

    private Object x(int v) {
        this.g();
        Object object0 = ((e)this.b.remove(v)).getValue();
        if(!this.c.isEmpty()) {
            Iterator iterator0 = this.r().entrySet().iterator();
            List list0 = this.b;
            Object object1 = iterator0.next();
            list0.add(new e(this, ((Map.Entry)object1)));
            iterator0.remove();
        }
        return object0;
    }
}

