package com.google.gson.internal;

import j..util.Objects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

public final class h extends AbstractMap implements Serializable {
    class a implements Comparator {
        a() {
            super();
        }

        public int b(Comparable comparable0, Comparable comparable1) {
            return comparable0.compareTo(comparable1);
        }

        @Override
        public int compare(Object object0, Object object1) {
            return this.b(((Comparable)object0), ((Comparable)object1));
        }
    }

    class b extends AbstractSet {
        final h a;

        @Override
        public void clear() {
            h.this.clear();
        }

        @Override
        public boolean contains(Object object0) {
            return object0 instanceof Map.Entry && h.this.c(((Map.Entry)object0)) != null;
        }

        @Override
        public Iterator iterator() {
            class com.google.gson.internal.h.b.a extends d {
                final b e;

                com.google.gson.internal.h.b.a() {
                    super();
                }

                public Map.Entry b() {
                    return this.a();
                }

                @Override
                public Object next() {
                    return this.b();
                }
            }

            return new com.google.gson.internal.h.b.a(this);
        }

        @Override
        public boolean remove(Object object0) {
            if(!(object0 instanceof Map.Entry)) {
                return false;
            }
            e h$e0 = h.this.c(((Map.Entry)object0));
            if(h$e0 == null) {
                return false;
            }
            h.this.g(h$e0, true);
            return true;
        }

        @Override
        public int size() {
            return h.this.d;
        }
    }

    final class c extends AbstractSet {
        final h a;

        @Override
        public void clear() {
            h.this.clear();
        }

        @Override
        public boolean contains(Object object0) {
            return h.this.containsKey(object0);
        }

        @Override
        public Iterator iterator() {
            class com.google.gson.internal.h.c.a extends d {
                final c e;

                com.google.gson.internal.h.c.a() {
                    super();
                }

                @Override
                public Object next() {
                    return this.a().f;
                }
            }

            return new com.google.gson.internal.h.c.a(this);
        }

        @Override
        public boolean remove(Object object0) {
            return h.this.h(object0) != null;
        }

        @Override
        public int size() {
            return h.this.d;
        }
    }

    abstract class d implements Iterator {
        e a;
        e b;
        int c;
        final h d;

        d() {
            this.a = h0.f.d;
            this.b = null;
            this.c = h0.e;
        }

        final e a() {
            e h$e0 = this.a;
            h h0 = h.this;
            if(h$e0 == h0.f) {
                throw new NoSuchElementException();
            }
            if(h0.e != this.c) {
                throw new ConcurrentModificationException();
            }
            this.a = h$e0.d;
            this.b = h$e0;
            return h$e0;
        }

        @Override
        public final boolean hasNext() {
            return this.a != h.this.f;
        }

        @Override
        public final void remove() {
            e h$e0 = this.b;
            if(h$e0 == null) {
                throw new IllegalStateException();
            }
            h.this.g(h$e0, true);
            this.b = null;
            this.c = h.this.e;
        }
    }

    static final class e implements Map.Entry {
        e a;
        e b;
        e c;
        e d;
        e e;
        final Object f;
        final boolean g;
        Object h;
        int i;

        e(boolean z) {
            this.f = null;
            this.g = z;
            this.e = this;
            this.d = this;
        }

        e(boolean z, e h$e0, Object object0, e h$e1, e h$e2) {
            this.a = h$e0;
            this.f = object0;
            this.g = z;
            this.i = 1;
            this.d = h$e1;
            this.e = h$e2;
            h$e2.d = this;
            h$e1.e = this;
        }

        public e a() {
            e h$e0 = this.b;
            e h$e1 = this;
            while(h$e0 != null) {
                h$e1 = h$e0;
                h$e0 = h$e0.b;
            }
            return h$e1;
        }

        public e b() {
            e h$e0 = this.c;
            e h$e1 = this;
            while(h$e0 != null) {
                h$e1 = h$e0;
                h$e0 = h$e0.c;
            }
            return h$e1;
        }

        @Override
        public boolean equals(Object object0) {
            if(object0 instanceof Map.Entry) {
                Object object1 = this.f;
                if(object1 == null) {
                    if(((Map.Entry)object0).getKey() == null) {
                        return this.h == null ? ((Map.Entry)object0).getValue() == null : this.h.equals(((Map.Entry)object0).getValue());
                    }
                }
                else if(object1.equals(((Map.Entry)object0).getKey())) {
                    return this.h == null ? ((Map.Entry)object0).getValue() == null : this.h.equals(((Map.Entry)object0).getValue());
                }
            }
            return false;
        }

        @Override
        public Object getKey() {
            return this.f;
        }

        @Override
        public Object getValue() {
            return this.h;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.f == null ? 0 : this.f.hashCode();
            Object object0 = this.h;
            if(object0 != null) {
                v = object0.hashCode();
            }
            return v1 ^ v;
        }

        @Override
        public Object setValue(Object object0) {
            if(object0 == null && !this.g) {
                throw new NullPointerException("value == null");
            }
            Object object1 = this.h;
            this.h = object0;
            return object1;
        }

        @Override
        public String toString() {
            return this.f + "=" + this.h;
        }
    }

    private final Comparator a;
    private final boolean b;
    e c;
    int d;
    int e;
    final e f;
    private b g;
    private c h;
    private static final Comparator i;
    static final boolean j;

    static {
        h.i = new a();
    }

    public h() {
        this(h.i, true);
    }

    public h(Comparator comparator0, boolean z) {
        this.d = 0;
        this.e = 0;
        if(comparator0 == null) {
            comparator0 = h.i;
        }
        this.a = comparator0;
        this.b = z;
        this.f = new e(z);
    }

    public h(boolean z) {
        this(h.i, z);
    }

    private boolean a(Object object0, Object object1) {
        return Objects.equals(object0, object1);
    }

    e b(Object object0, boolean z) {
        e h$e3;
        int v;
        Comparator comparator0 = this.a;
        e h$e0 = this.c;
        if(h$e0 == null) {
            v = 0;
        }
        else {
            Comparable comparable0 = comparator0 == h.i ? ((Comparable)object0) : null;
            while(true) {
                v = comparable0 == null ? comparator0.compare(object0, h$e0.f) : comparable0.compareTo(h$e0.f);
                if(v == 0) {
                    return h$e0;
                }
                e h$e1 = v >= 0 ? h$e0.c : h$e0.b;
                if(h$e1 == null) {
                    break;
                }
                h$e0 = h$e1;
            }
        }
        if(!z) {
            return null;
        }
        e h$e2 = this.f;
        if(h$e0 == null) {
            if(comparator0 == h.i && !(object0 instanceof Comparable)) {
                throw new ClassCastException(object0.getClass().getName() + " is not Comparable");
            }
            h$e3 = new e(this.b, null, object0, h$e2, h$e2.e);
            this.c = h$e3;
        }
        else {
            h$e3 = new e(this.b, h$e0, object0, h$e2, h$e2.e);
            if(v < 0) {
                h$e0.b = h$e3;
            }
            else {
                h$e0.c = h$e3;
            }
            this.f(h$e0, true);
        }
        ++this.d;
        ++this.e;
        return h$e3;
    }

    e c(Map.Entry map$Entry0) {
        e h$e0 = this.d(map$Entry0.getKey());
        return h$e0 != null && this.a(h$e0.h, map$Entry0.getValue()) ? h$e0 : null;
    }

    @Override
    public void clear() {
        this.c = null;
        this.d = 0;
        ++this.e;
        this.f.e = this.f;
        this.f.d = this.f;
    }

    @Override
    public boolean containsKey(Object object0) {
        return this.d(object0) != null;
    }

    e d(Object object0) {
        if(object0 != null) {
            try {
                return this.b(object0, false);
            }
            catch(ClassCastException unused_ex) {
            }
        }
        return null;
    }

    private void e(ObjectInputStream objectInputStream0) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    @Override
    public Set entrySet() {
        b h$b0 = this.g;
        if(h$b0 == null) {
            h$b0 = new b(this);
            this.g = h$b0;
        }
        return h$b0;
    }

    private void f(e h$e0, boolean z) {
    alab1:
        while(h$e0 != null) {
            e h$e1 = h$e0.b;
            e h$e2 = h$e0.c;
            int v = 0;
            int v1 = h$e1 == null ? 0 : h$e1.i;
            int v2 = h$e2 == null ? 0 : h$e2.i;
            int v3 = v1 - v2;
            if(v3 == -2) {
                e h$e3 = h$e2.b;
                int v4 = h$e2.c == null ? 0 : h$e2.c.i;
                if(h$e3 != null) {
                    v = h$e3.i;
                }
                if(v - v4 != -1 && (v - v4 != 0 || z)) {
                    this.l(h$e2);
                }
                this.j(h$e0);
                if(z) {
                    return;
                }
            }
            else {
                switch(v3) {
                    case 0: {
                        h$e0.i = v1 + 1;
                        if(z) {
                            return;
                        }
                        break;
                    }
                    case 2: {
                        e h$e4 = h$e1.b;
                        int v5 = h$e1.c == null ? 0 : h$e1.c.i;
                        if(h$e4 != null) {
                            v = h$e4.i;
                        }
                        if(v - v5 != 1 && (v - v5 != 0 || z)) {
                            this.j(h$e1);
                        }
                        this.l(h$e0);
                        if(z) {
                            return;
                        }
                        break;
                    }
                    default: {
                        h$e0.i = Math.max(v1, v2) + 1;
                        if(!z) {
                            break alab1;
                        }
                    }
                }
            }
            h$e0 = h$e0.a;
        }
    }

    void g(e h$e0, boolean z) {
        int v1;
        if(z) {
            h$e0.e.d = h$e0.d;
            h$e0.d.e = h$e0.e;
        }
        e h$e1 = h$e0.b;
        e h$e2 = h$e0.c;
        e h$e3 = h$e0.a;
        int v = 0;
        if(h$e1 != null && h$e2 != null) {
            e h$e4 = h$e1.i <= h$e2.i ? h$e2.a() : h$e1.b();
            this.g(h$e4, false);
            e h$e5 = h$e0.b;
            if(h$e5 == null) {
                v1 = 0;
            }
            else {
                v1 = h$e5.i;
                h$e4.b = h$e5;
                h$e5.a = h$e4;
                h$e0.b = null;
            }
            e h$e6 = h$e0.c;
            if(h$e6 != null) {
                v = h$e6.i;
                h$e4.c = h$e6;
                h$e6.a = h$e4;
                h$e0.c = null;
            }
            h$e4.i = Math.max(v1, v) + 1;
            this.i(h$e0, h$e4);
            return;
        }
        if(h$e1 != null) {
            this.i(h$e0, h$e1);
            h$e0.b = null;
        }
        else if(h$e2 == null) {
            this.i(h$e0, null);
        }
        else {
            this.i(h$e0, h$e2);
            h$e0.c = null;
        }
        this.f(h$e3, false);
        --this.d;
        ++this.e;
    }

    @Override
    public Object get(Object object0) {
        e h$e0 = this.d(object0);
        return h$e0 == null ? null : h$e0.h;
    }

    e h(Object object0) {
        e h$e0 = this.d(object0);
        if(h$e0 != null) {
            this.g(h$e0, true);
        }
        return h$e0;
    }

    private void i(e h$e0, e h$e1) {
        e h$e2 = h$e0.a;
        h$e0.a = null;
        if(h$e1 != null) {
            h$e1.a = h$e2;
        }
        if(h$e2 != null) {
            if(h$e2.b == h$e0) {
                h$e2.b = h$e1;
                return;
            }
            h$e2.c = h$e1;
            return;
        }
        this.c = h$e1;
    }

    private void j(e h$e0) {
        e h$e1 = h$e0.b;
        e h$e2 = h$e0.c;
        e h$e3 = h$e2.b;
        e h$e4 = h$e2.c;
        h$e0.c = h$e3;
        if(h$e3 != null) {
            h$e3.a = h$e0;
        }
        this.i(h$e0, h$e2);
        h$e2.b = h$e0;
        h$e0.a = h$e2;
        int v = 0;
        int v1 = Math.max((h$e1 == null ? 0 : h$e1.i), (h$e3 == null ? 0 : h$e3.i));
        h$e0.i = v1 + 1;
        if(h$e4 != null) {
            v = h$e4.i;
        }
        h$e2.i = Math.max(v1 + 1, v) + 1;
    }

    @Override
    public Set keySet() {
        c h$c0 = this.h;
        if(h$c0 == null) {
            h$c0 = new c(this);
            this.h = h$c0;
        }
        return h$c0;
    }

    private void l(e h$e0) {
        e h$e1 = h$e0.b;
        e h$e2 = h$e0.c;
        e h$e3 = h$e1.b;
        e h$e4 = h$e1.c;
        h$e0.b = h$e4;
        if(h$e4 != null) {
            h$e4.a = h$e0;
        }
        this.i(h$e0, h$e1);
        h$e1.c = h$e0;
        h$e0.a = h$e1;
        int v = 0;
        int v1 = Math.max((h$e2 == null ? 0 : h$e2.i), (h$e4 == null ? 0 : h$e4.i));
        h$e0.i = v1 + 1;
        if(h$e3 != null) {
            v = h$e3.i;
        }
        h$e1.i = Math.max(v1 + 1, v) + 1;
    }

    private Object m() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    @Override
    public Object put(Object object0, Object object1) {
        if(object0 == null) {
            throw new NullPointerException("key == null");
        }
        if(object1 == null && !this.b) {
            throw new NullPointerException("value == null");
        }
        e h$e0 = this.b(object0, true);
        Object object2 = h$e0.h;
        h$e0.h = object1;
        return object2;
    }

    @Override
    public Object remove(Object object0) {
        e h$e0 = this.h(object0);
        return h$e0 == null ? null : h$e0.h;
    }

    @Override
    public int size() {
        return this.d;
    }
}

