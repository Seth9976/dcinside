package com.bykv.vk.openvk.preload.a.b;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

public final class g extends AbstractMap implements Serializable {
    final class a extends AbstractSet {
        final g a;

        @Override
        public final void clear() {
            g.this.clear();
        }

        @Override
        public final boolean contains(Object object0) {
            return object0 instanceof Map.Entry && g.this.a(((Map.Entry)object0)) != null;
        }

        @Override
        public final Iterator iterator() {
            return new c() {
                @Override
                public final Object next() {
                    return this.a();
                }
            };
        }

        @Override
        public final boolean remove(Object object0) {
            if(!(object0 instanceof Map.Entry)) {
                return false;
            }
            d g$d0 = g.this.a(((Map.Entry)object0));
            if(g$d0 == null) {
                return false;
            }
            g.this.a(g$d0, true);
            return true;
        }

        @Override
        public final int size() {
            return g.this.a;
        }
    }

    final class b extends AbstractSet {
        final g a;

        @Override
        public final void clear() {
            g.this.clear();
        }

        @Override
        public final boolean contains(Object object0) {
            return g.this.containsKey(object0);
        }

        @Override
        public final Iterator iterator() {
            return new c() {
                @Override
                public final Object next() {
                    return this.a().f;
                }
            };
        }

        @Override
        public final boolean remove(Object object0) {
            return g.this.a(object0) != null;
        }

        @Override
        public final int size() {
            return g.this.a;
        }
    }

    abstract class c implements Iterator {
        private d a;
        private d b;
        private int c;
        private g d;

        c() {
            this.a = g0.c.d;
            this.b = null;
            this.c = g0.b;
        }

        final d a() {
            d g$d0 = this.a;
            g g0 = g.this;
            if(g$d0 == g0.c) {
                throw new NoSuchElementException();
            }
            if(g0.b != this.c) {
                throw new ConcurrentModificationException();
            }
            this.a = g$d0.d;
            this.b = g$d0;
            return g$d0;
        }

        @Override
        public final boolean hasNext() {
            return this.a != g.this.c;
        }

        @Override
        public final void remove() {
            d g$d0 = this.b;
            if(g$d0 == null) {
                throw new IllegalStateException();
            }
            g.this.a(g$d0, true);
            this.b = null;
            this.c = g.this.b;
        }
    }

    static final class d implements Map.Entry {
        d a;
        d b;
        d c;
        d d;
        d e;
        final Object f;
        Object g;
        int h;

        d() {
            this.f = null;
            this.e = this;
            this.d = this;
        }

        d(d g$d0, Object object0, d g$d1, d g$d2) {
            this.a = g$d0;
            this.f = object0;
            this.h = 1;
            this.d = g$d1;
            this.e = g$d2;
            g$d2.d = this;
            g$d1.e = this;
        }

        @Override
        public final boolean equals(Object object0) {
            if(object0 instanceof Map.Entry) {
                Object object1 = this.f;
                if(object1 == null) {
                    if(((Map.Entry)object0).getKey() == null) {
                        return this.g == null ? ((Map.Entry)object0).getValue() == null : this.g.equals(((Map.Entry)object0).getValue());
                    }
                }
                else if(object1.equals(((Map.Entry)object0).getKey())) {
                    return this.g == null ? ((Map.Entry)object0).getValue() == null : this.g.equals(((Map.Entry)object0).getValue());
                }
            }
            return false;
        }

        @Override
        public final Object getKey() {
            return this.f;
        }

        @Override
        public final Object getValue() {
            return this.g;
        }

        @Override
        public final int hashCode() {
            int v = 0;
            int v1 = this.f == null ? 0 : this.f.hashCode();
            Object object0 = this.g;
            if(object0 != null) {
                v = object0.hashCode();
            }
            return v1 ^ v;
        }

        @Override
        public final Object setValue(Object object0) {
            Object object1 = this.g;
            this.g = object0;
            return object1;
        }

        @Override
        public final String toString() {
            return this.f + "=" + this.g;
        }
    }

    int a;
    int b;
    final d c;
    private static final Comparator d = null;
    private Comparator e;
    private d f;
    private a g;
    private b h;
    private static boolean i = true;

    static {
        g.d = new Comparator() {
            @Override
            public final int compare(Object object0, Object object1) {
                return ((Comparable)object0).compareTo(((Comparable)object1));
            }
        };
    }

    public g() {
        this(g.d);
    }

    private g(Comparator comparator0) {
        this.a = 0;
        this.b = 0;
        this.c = new d();
        if(comparator0 == null) {
            comparator0 = g.d;
        }
        this.e = comparator0;
    }

    private d a(Object object0, boolean z) {
        d g$d3;
        int v;
        Comparator comparator0 = this.e;
        d g$d0 = this.f;
        if(g$d0 == null) {
            v = 0;
        }
        else {
            Comparable comparable0 = comparator0 == g.d ? ((Comparable)object0) : null;
            while(true) {
                v = comparable0 == null ? comparator0.compare(object0, g$d0.f) : comparable0.compareTo(g$d0.f);
                if(v == 0) {
                    return g$d0;
                }
                d g$d1 = v >= 0 ? g$d0.c : g$d0.b;
                if(g$d1 == null) {
                    break;
                }
                g$d0 = g$d1;
            }
        }
        if(!z) {
            return null;
        }
        d g$d2 = this.c;
        if(g$d0 == null) {
            if(comparator0 == g.d && !(object0 instanceof Comparable)) {
                throw new ClassCastException(object0.getClass().getName() + " is not Comparable");
            }
            g$d3 = new d(null, object0, g$d2, g$d2.e);
            this.f = g$d3;
        }
        else {
            g$d3 = new d(g$d0, object0, g$d2, g$d2.e);
            if(v < 0) {
                g$d0.b = g$d3;
            }
            else {
                g$d0.c = g$d3;
            }
            this.b(g$d0, true);
        }
        ++this.a;
        ++this.b;
        return g$d3;
    }

    private void a(d g$d0) {
        d g$d1 = g$d0.b;
        d g$d2 = g$d0.c;
        d g$d3 = g$d2.b;
        d g$d4 = g$d2.c;
        g$d0.c = g$d3;
        if(g$d3 != null) {
            g$d3.a = g$d0;
        }
        this.a(g$d0, g$d2);
        g$d2.b = g$d0;
        g$d0.a = g$d2;
        int v = 0;
        int v1 = Math.max((g$d1 == null ? 0 : g$d1.h), (g$d3 == null ? 0 : g$d3.h));
        g$d0.h = v1 + 1;
        if(g$d4 != null) {
            v = g$d4.h;
        }
        g$d2.h = Math.max(v1 + 1, v) + 1;
    }

    private void a(d g$d0, d g$d1) {
        d g$d2 = g$d0.a;
        g$d0.a = null;
        if(g$d1 != null) {
            g$d1.a = g$d2;
        }
        if(g$d2 != null) {
            if(g$d2.b == g$d0) {
                g$d2.b = g$d1;
                return;
            }
            if(!g.i && g$d2.c != g$d0) {
                throw new AssertionError();
            }
            g$d2.c = g$d1;
            return;
        }
        this.f = g$d1;
    }

    final d a(Object object0) {
        d g$d0 = this.b(object0);
        if(g$d0 != null) {
            this.a(g$d0, true);
        }
        return g$d0;
    }

    final d a(Map.Entry map$Entry0) {
        d g$d0 = this.b(map$Entry0.getKey());
        if(g$d0 != null) {
            Object object0 = g$d0.g;
            Object object1 = map$Entry0.getValue();
            return object0 != object1 && (object0 == null || !object0.equals(object1)) ? null : g$d0;
        }
        return null;
    }

    final void a(d g$d0, boolean z) {
        int v1;
        if(z) {
            g$d0.e.d = g$d0.d;
            g$d0.d.e = g$d0.e;
        }
        d g$d1 = g$d0.b;
        d g$d2 = g$d0.c;
        d g$d3 = g$d0.a;
        int v = 0;
        if(g$d1 != null && g$d2 != null) {
            if(g$d1.h > g$d2.h) {
                for(d g$d4 = g$d1.c; true; g$d4 = g$d1.c) {
                    g$d2 = g$d1;
                    g$d1 = g$d4;
                    if(g$d1 == null) {
                        break;
                    }
                }
            }
            else {
                d g$d5;
                while((g$d5 = g$d2.b) != null) {
                    g$d2 = g$d5;
                }
            }
            this.a(g$d2, false);
            d g$d6 = g$d0.b;
            if(g$d6 == null) {
                v1 = 0;
            }
            else {
                v1 = g$d6.h;
                g$d2.b = g$d6;
                g$d6.a = g$d2;
                g$d0.b = null;
            }
            d g$d7 = g$d0.c;
            if(g$d7 != null) {
                v = g$d7.h;
                g$d2.c = g$d7;
                g$d7.a = g$d2;
                g$d0.c = null;
            }
            g$d2.h = Math.max(v1, v) + 1;
            this.a(g$d0, g$d2);
            return;
        }
        if(g$d1 != null) {
            this.a(g$d0, g$d1);
            g$d0.b = null;
        }
        else if(g$d2 == null) {
            this.a(g$d0, null);
        }
        else {
            this.a(g$d0, g$d2);
            g$d0.c = null;
        }
        this.b(g$d3, false);
        --this.a;
        ++this.b;
    }

    private d b(Object object0) {
        if(object0 != null) {
            try {
                return this.a(object0, false);
            }
            catch(ClassCastException unused_ex) {
            }
        }
        return null;
    }

    private void b(d g$d0) {
        d g$d1 = g$d0.b;
        d g$d2 = g$d0.c;
        d g$d3 = g$d1.b;
        d g$d4 = g$d1.c;
        g$d0.b = g$d4;
        if(g$d4 != null) {
            g$d4.a = g$d0;
        }
        this.a(g$d0, g$d1);
        g$d1.c = g$d0;
        g$d0.a = g$d1;
        int v = 0;
        int v1 = Math.max((g$d2 == null ? 0 : g$d2.h), (g$d4 == null ? 0 : g$d4.h));
        g$d0.h = v1 + 1;
        if(g$d3 != null) {
            v = g$d3.h;
        }
        g$d1.h = Math.max(v1 + 1, v) + 1;
    }

    private void b(d g$d0, boolean z) {
    alab1:
        while(g$d0 != null) {
            d g$d1 = g$d0.b;
            d g$d2 = g$d0.c;
            int v = 0;
            int v1 = g$d1 == null ? 0 : g$d1.h;
            int v2 = g$d2 == null ? 0 : g$d2.h;
            int v3 = v1 - v2;
            if(v3 == -2) {
                d g$d3 = g$d2.b;
                int v4 = g$d2.c == null ? 0 : g$d2.c.h;
                if(g$d3 != null) {
                    v = g$d3.h;
                }
                int v5 = v - v4;
                if(v5 != -1 && (v5 != 0 || z)) {
                    if(!g.i && v5 != 1) {
                        throw new AssertionError();
                    }
                    this.b(g$d2);
                }
                this.a(g$d0);
                if(z) {
                    break;
                }
            }
            else {
                switch(v3) {
                    case 0: {
                        g$d0.h = v1 + 1;
                        if(z) {
                            return;
                        }
                        break;
                    }
                    case 2: {
                        d g$d4 = g$d1.b;
                        int v6 = g$d1.c == null ? 0 : g$d1.c.h;
                        if(g$d4 != null) {
                            v = g$d4.h;
                        }
                        int v7 = v - v6;
                        if(v7 != 1 && (v7 != 0 || z)) {
                            if(!g.i && v7 != -1) {
                                throw new AssertionError();
                            }
                            this.a(g$d1);
                        }
                        this.b(g$d0);
                        if(!z) {
                            break;
                        }
                        break alab1;
                    }
                    default: {
                        if(!g.i && v3 != -1 && v3 != 1) {
                            throw new AssertionError();
                        }
                        g$d0.h = Math.max(v1, v2) + 1;
                        if(!z) {
                            break alab1;
                        }
                    }
                }
            }
            g$d0 = g$d0.a;
        }
    }

    @Override
    public final void clear() {
        this.f = null;
        this.a = 0;
        ++this.b;
        this.c.e = this.c;
        this.c.d = this.c;
    }

    @Override
    public final boolean containsKey(Object object0) {
        return this.b(object0) != null;
    }

    @Override
    public final Set entrySet() {
        Set set0 = this.g;
        if(set0 != null) {
            return set0;
        }
        a g$a0 = new a(this);
        this.g = g$a0;
        return g$a0;
    }

    @Override
    public final Object get(Object object0) {
        d g$d0 = this.b(object0);
        return g$d0 == null ? null : g$d0.g;
    }

    @Override
    public final Set keySet() {
        Set set0 = this.h;
        if(set0 != null) {
            return set0;
        }
        b g$b0 = new b(this);
        this.h = g$b0;
        return g$b0;
    }

    @Override
    public final Object put(Object object0, Object object1) {
        if(object0 == null) {
            throw new NullPointerException("key == null");
        }
        d g$d0 = this.a(object0, true);
        Object object2 = g$d0.g;
        g$d0.g = object1;
        return object2;
    }

    @Override
    public final Object remove(Object object0) {
        d g$d0 = this.a(object0);
        return g$d0 == null ? null : g$d0.g;
    }

    @Override
    public final int size() {
        return this.a;
    }
}

