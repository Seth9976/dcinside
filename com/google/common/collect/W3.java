package com.google.common.collect;

import J1.b;
import J1.c;
import J1.d;
import com.google.common.base.H;
import j..util.DesugarCollections;
import j..util.Objects;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import o3.a;

@b(emulated = true, serializable = true)
@C1
public class w3 extends h implements y3, Serializable {
    class e implements Iterator {
        final Set a;
        @a
        g b;
        @a
        g c;
        int d;
        final w3 e;

        private e() {
            this.a = D4.y(w30.keySet().size());
            this.b = w30.f;
            this.d = w30.j;
        }

        e(com.google.common.collect.w3.a w3$a0) {
        }

        private void a() {
            if(w3.this.j != this.d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override
        public boolean hasNext() {
            this.a();
            return this.b != null;
        }

        @Override
        @d4
        public Object next() {
            this.a();
            g w3$g0 = this.b;
            if(w3$g0 == null) {
                throw new NoSuchElementException();
            }
            this.c = w3$g0;
            this.a.add(w3$g0.a);
            do {
                g w3$g1 = this.b.c;
                this.b = w3$g1;
            }
            while(w3$g1 != null && !this.a.add(w3$g1.a));
            return this.c.a;
        }

        @Override
        public void remove() {
            this.a();
            H.h0(this.c != null, "no calls to next() since the last call to remove()");
            w3.this.L(this.c.a);
            this.c = null;
            this.d = w3.this.j;
        }
    }

    static class f {
        g a;
        g b;
        int c;

        f(g w3$g0) {
            this.a = w3$g0;
            this.b = w3$g0;
            w3$g0.f = null;
            w3$g0.e = null;
            this.c = 1;
        }
    }

    static final class g extends com.google.common.collect.g {
        @d4
        final Object a;
        @d4
        Object b;
        @a
        g c;
        @a
        g d;
        @a
        g e;
        @a
        g f;

        g(@d4 Object object0, @d4 Object object1) {
            this.a = object0;
            this.b = object1;
        }

        @Override  // com.google.common.collect.g
        @d4
        public Object getKey() {
            return this.a;
        }

        @Override  // com.google.common.collect.g
        @d4
        public Object getValue() {
            return this.b;
        }

        @Override  // com.google.common.collect.g
        @d4
        public Object setValue(@d4 Object object0) {
            Object object1 = this.b;
            this.b = object0;
            return object1;
        }
    }

    class com.google.common.collect.w3.h implements ListIterator {
        int a;
        @a
        g b;
        @a
        g c;
        @a
        g d;
        int e;
        final w3 f;

        com.google.common.collect.w3.h(int v) {
            this.e = w30.j;
            int v1 = w30.size();
            H.d0(v, v1);
            if(v >= v1 / 2) {
                this.d = w30.g;
                this.a = v1;
                while(v < v1) {
                    this.d();
                    ++v;
                }
            }
            else {
                this.b = w30.f;
                while(v > 0) {
                    this.c();
                    --v;
                }
            }
            this.c = null;
        }

        public void a(Map.Entry map$Entry0) {
            throw new UnsupportedOperationException();
        }

        @Override
        public void add(Object object0) {
            this.a(((Map.Entry)object0));
        }

        private void b() {
            if(w3.this.j != this.e) {
                throw new ConcurrentModificationException();
            }
        }

        @O1.a
        public g c() {
            this.b();
            g w3$g0 = this.b;
            if(w3$g0 == null) {
                throw new NoSuchElementException();
            }
            this.c = w3$g0;
            this.d = w3$g0;
            this.b = w3$g0.c;
            ++this.a;
            return w3$g0;
        }

        @O1.a
        public g d() {
            this.b();
            g w3$g0 = this.d;
            if(w3$g0 == null) {
                throw new NoSuchElementException();
            }
            this.c = w3$g0;
            this.b = w3$g0;
            this.d = w3$g0.d;
            --this.a;
            return w3$g0;
        }

        public void e(Map.Entry map$Entry0) {
            throw new UnsupportedOperationException();
        }

        void f(@d4 Object object0) {
            H.g0(this.c != null);
            this.c.b = object0;
        }

        @Override
        public boolean hasNext() {
            this.b();
            return this.b != null;
        }

        @Override
        public boolean hasPrevious() {
            this.b();
            return this.d != null;
        }

        @Override
        @O1.a
        public Object next() {
            return this.c();
        }

        @Override
        public int nextIndex() {
            return this.a;
        }

        @Override
        @O1.a
        public Object previous() {
            return this.d();
        }

        @Override
        public int previousIndex() {
            return this.a - 1;
        }

        @Override
        public void remove() {
            this.b();
            H.h0(this.c != null, "no calls to next() since the last call to remove()");
            g w3$g0 = this.c;
            if(w3$g0 == this.b) {
                this.b = w3$g0.c;
            }
            else {
                this.d = w3$g0.d;
                --this.a;
            }
            w3.this.M(w3$g0);
            this.c = null;
            this.e = w3.this.j;
        }

        @Override
        public void set(Object object0) {
            this.e(((Map.Entry)object0));
        }
    }

    class i implements ListIterator {
        @d4
        final Object a;
        int b;
        @a
        g c;
        @a
        g d;
        @a
        g e;
        final w3 f;

        i(@d4 Object object0) {
            this.a = object0;
            f w3$f0 = (f)w30.h.get(object0);
            this.c = w3$f0 == null ? null : w3$f0.a;
        }

        public i(@d4 Object object0, int v) {
            f w3$f0 = (f)w30.h.get(object0);
            int v1 = w3$f0 == null ? 0 : w3$f0.c;
            H.d0(v, v1);
            if(v >= v1 / 2) {
                this.e = w3$f0 == null ? null : w3$f0.b;
                this.b = v1;
                while(v < v1) {
                    this.previous();
                    ++v;
                }
            }
            else {
                this.c = w3$f0 == null ? null : w3$f0.a;
                while(v > 0) {
                    this.next();
                    --v;
                }
            }
            this.a = object0;
            this.d = null;
        }

        @Override
        public void add(@d4 Object object0) {
            this.e = w3.this.y(this.a, object0, this.c);
            ++this.b;
            this.d = null;
        }

        @Override
        public boolean hasNext() {
            return this.c != null;
        }

        @Override
        public boolean hasPrevious() {
            return this.e != null;
        }

        @Override
        @O1.a
        @d4
        public Object next() {
            g w3$g0 = this.c;
            if(w3$g0 == null) {
                throw new NoSuchElementException();
            }
            this.d = w3$g0;
            this.e = w3$g0;
            this.c = w3$g0.e;
            ++this.b;
            return w3$g0.b;
        }

        @Override
        public int nextIndex() {
            return this.b;
        }

        @Override
        @O1.a
        @d4
        public Object previous() {
            g w3$g0 = this.e;
            if(w3$g0 == null) {
                throw new NoSuchElementException();
            }
            this.d = w3$g0;
            this.c = w3$g0;
            this.e = w3$g0.f;
            --this.b;
            return w3$g0.b;
        }

        @Override
        public int previousIndex() {
            return this.b - 1;
        }

        @Override
        public void remove() {
            H.h0(this.d != null, "no calls to next() since the last call to remove()");
            g w3$g0 = this.d;
            if(w3$g0 == this.c) {
                this.c = w3$g0.e;
            }
            else {
                this.e = w3$g0.f;
                --this.b;
            }
            w3.this.M(w3$g0);
            this.d = null;
        }

        @Override
        public void set(@d4 Object object0) {
            H.g0(this.d != null);
            this.d.b = object0;
        }
    }

    @a
    private transient g f;
    @a
    private transient g g;
    private transient Map h;
    private transient int i;
    private transient int j;
    @c
    @d
    private static final long k;

    w3() {
        this(12);
    }

    private w3(int v) {
        this.h = f4.d(v);
    }

    private w3(M3 m30) {
        this(m30.keySet().size());
        this.m(m30);
    }

    public static w3 A() {
        return new w3();
    }

    public static w3 B(int v) {
        return new w3(v);
    }

    public static w3 C(M3 m30) {
        return new w3(m30);
    }

    List D() {
        class com.google.common.collect.w3.b extends AbstractSequentialList {
            final w3 a;

            @Override
            public ListIterator listIterator(int v) {
                return new com.google.common.collect.w3.h(w3.this, v);
            }

            @Override
            public int size() {
                return w3.this.i;
            }
        }

        return new com.google.common.collect.w3.b(this);
    }

    @Override  // com.google.common.collect.h, com.google.common.collect.M3
    public S3 E() {
        return super.E();
    }

    List F() {
        class com.google.common.collect.w3.d extends AbstractSequentialList {
            final w3 a;

            @Override
            public ListIterator listIterator(int v) {
                class com.google.common.collect.w3.d.a extends m5 {
                    final com.google.common.collect.w3.h b;

                    com.google.common.collect.w3.d.a(ListIterator listIterator0, com.google.common.collect.w3.h w3$h0) {
                        this.b = w3$h0;
                        super(listIterator0);
                    }

                    @Override  // com.google.common.collect.l5
                    @d4
                    Object a(Object object0) {
                        return this.c(((Map.Entry)object0));
                    }

                    @d4
                    Object c(Map.Entry map$Entry0) {
                        return map$Entry0.getValue();
                    }

                    @Override  // com.google.common.collect.m5
                    public void set(@d4 Object object0) {
                        this.b.f(object0);
                    }
                }

                com.google.common.collect.w3.h w3$h0 = new com.google.common.collect.w3.h(w3.this, v);
                return new com.google.common.collect.w3.d.a(this, w3$h0, w3$h0);
            }

            @Override
            public int size() {
                return w3.this.i;
            }
        }

        return new com.google.common.collect.w3.d(this);
    }

    @Override  // com.google.common.collect.h, com.google.common.collect.M3
    @O1.a
    public boolean G(@d4 Object object0, Iterable iterable0) {
        return super.G(object0, iterable0);
    }

    public List H() {
        return (List)super.h();
    }

    private List I(@d4 Object object0) {
        return DesugarCollections.unmodifiableList(z3.s(new i(this, object0)));
    }

    @Override  // com.google.common.collect.h, com.google.common.collect.M3
    public boolean J(@a Object object0, @a Object object1) {
        return super.J(object0, object1);
    }

    @c
    @d
    private void K(ObjectInputStream objectInputStream0) throws IOException, ClassNotFoundException {
        objectInputStream0.defaultReadObject();
        this.h = h1.m0();
        int v = objectInputStream0.readInt();
        for(int v1 = 0; v1 < v; ++v1) {
            this.put(objectInputStream0.readObject(), objectInputStream0.readObject());
        }
    }

    private void L(@d4 Object object0) {
        q3.g(new i(this, object0));
    }

    private void M(g w3$g0) {
        g w3$g1 = w3$g0.d;
        if(w3$g1 == null) {
            this.f = w3$g0.c;
        }
        else {
            w3$g1.c = w3$g0.c;
        }
        g w3$g2 = w3$g0.c;
        if(w3$g2 == null) {
            this.g = w3$g1;
        }
        else {
            w3$g2.d = w3$g1;
        }
        if(w3$g0.f != null || w3$g0.e != null) {
            f w3$f1 = (f)this.h.get(w3$g0.a);
            Objects.requireNonNull(w3$f1);
            --w3$f1.c;
            g w3$g3 = w3$g0.f;
            if(w3$g3 == null) {
                g w3$g4 = w3$g0.e;
                Objects.requireNonNull(w3$g4);
                w3$f1.a = w3$g4;
            }
            else {
                w3$g3.e = w3$g0.e;
            }
            g w3$g5 = w3$g0.e;
            if(w3$g5 == null) {
                g w3$g6 = w3$g0.f;
                Objects.requireNonNull(w3$g6);
                w3$f1.b = w3$g6;
            }
            else {
                w3$g5.f = w3$g0.f;
            }
        }
        else {
            f w3$f0 = (f)this.h.remove(w3$g0.a);
            Objects.requireNonNull(w3$f0);
            w3$f0.c = 0;
            ++this.j;
        }
        --this.i;
    }

    public List N() {
        return (List)super.values();
    }

    @c
    @d
    private void O(ObjectOutputStream objectOutputStream0) throws IOException {
        objectOutputStream0.defaultWriteObject();
        objectOutputStream0.writeInt(this.size());
        for(Object object0: this.H()) {
            objectOutputStream0.writeObject(((Map.Entry)object0).getKey());
            objectOutputStream0.writeObject(((Map.Entry)object0).getValue());
        }
    }

    @Override  // com.google.common.collect.y3, com.google.common.collect.M3
    @O1.a
    public Collection a(@a Object object0) {
        return this.a(object0);
    }

    @Override  // com.google.common.collect.y3
    @O1.a
    public List a(@a Object object0) {
        List list0 = this.I(object0);
        this.L(object0);
        return list0;
    }

    @Override  // com.google.common.collect.h, com.google.common.collect.y3
    @O1.a
    public Collection b(@d4 Object object0, Iterable iterable0) {
        return this.b(object0, iterable0);
    }

    @Override  // com.google.common.collect.y3
    @O1.a
    public List b(@d4 Object object0, Iterable iterable0) {
        List list0 = this.I(object0);
        i w3$i0 = new i(this, object0);
        Iterator iterator0 = iterable0.iterator();
        while(w3$i0.hasNext() && iterator0.hasNext()) {
            w3$i0.next();
            Object object1 = iterator0.next();
            w3$i0.set(object1);
        }
        while(w3$i0.hasNext()) {
            w3$i0.next();
            w3$i0.remove();
        }
        while(iterator0.hasNext()) {
            Object object2 = iterator0.next();
            w3$i0.add(object2);
        }
        return list0;
    }

    @Override  // com.google.common.collect.h, com.google.common.collect.y3
    public Map c() {
        return super.c();
    }

    @Override  // com.google.common.collect.M3
    public void clear() {
        this.f = null;
        this.g = null;
        this.h.clear();
        this.i = 0;
        ++this.j;
    }

    @Override  // com.google.common.collect.M3
    public boolean containsKey(@a Object object0) {
        return this.h.containsKey(object0);
    }

    @Override  // com.google.common.collect.h, com.google.common.collect.M3
    public boolean containsValue(@a Object object0) {
        return this.N().contains(object0);
    }

    @Override  // com.google.common.collect.h
    Map e() {
        return new com.google.common.collect.P3.a(this);
    }

    @Override  // com.google.common.collect.h, com.google.common.collect.y3
    public boolean equals(@a Object object0) {
        return super.equals(object0);
    }

    @Override  // com.google.common.collect.h
    Collection f() {
        return this.D();
    }

    @Override  // com.google.common.collect.h
    Set g() {
        class com.google.common.collect.w3.c extends k {
            final w3 a;

            @Override
            public boolean contains(@a Object object0) {
                return w3.this.containsKey(object0);
            }

            @Override
            public Iterator iterator() {
                return new e(w3.this, null);
            }

            @Override
            public boolean remove(@a Object object0) {
                return !w3.this.a(object0).isEmpty();
            }

            @Override
            public int size() {
                return w3.this.h.size();
            }
        }

        return new com.google.common.collect.w3.c(this);
    }

    @Override  // com.google.common.collect.y3, com.google.common.collect.M3
    public Collection get(@d4 Object object0) {
        return this.get(object0);
    }

    @Override  // com.google.common.collect.y3
    public List get(@d4 Object object0) {
        class com.google.common.collect.w3.a extends AbstractSequentialList {
            final Object a;
            final w3 b;

            com.google.common.collect.w3.a(Object object0) {
                this.a = object0;
                super();
            }

            @Override
            public ListIterator listIterator(int v) {
                return new i(w3.this, this.a, v);
            }

            @Override
            public int size() {
                f w3$f0 = (f)w3.this.h.get(this.a);
                return w3$f0 == null ? 0 : w3$f0.c;
            }
        }

        return new com.google.common.collect.w3.a(this, object0);
    }

    @Override  // com.google.common.collect.h, com.google.common.collect.M3
    public Collection h() {
        return this.H();
    }

    @Override  // com.google.common.collect.h, com.google.common.collect.M3
    public int hashCode() {
        return super.hashCode();
    }

    @Override  // com.google.common.collect.h
    S3 i() {
        return new com.google.common.collect.P3.g(this);
    }

    @Override  // com.google.common.collect.h, com.google.common.collect.M3
    public boolean isEmpty() {
        return this.f == null;
    }

    @Override  // com.google.common.collect.h
    Collection j() {
        return this.F();
    }

    @Override  // com.google.common.collect.h
    Iterator k() {
        throw new AssertionError("should never be called");
    }

    @Override  // com.google.common.collect.h, com.google.common.collect.M3
    public Set keySet() {
        return super.keySet();
    }

    @Override  // com.google.common.collect.h, com.google.common.collect.M3
    @O1.a
    public boolean m(M3 m30) {
        return super.m(m30);
    }

    @Override  // com.google.common.collect.h, com.google.common.collect.M3
    @O1.a
    public boolean put(@d4 Object object0, @d4 Object object1) {
        this.y(object0, object1, null);
        return true;
    }

    @Override  // com.google.common.collect.h, com.google.common.collect.M3
    @O1.a
    public boolean remove(@a Object object0, @a Object object1) {
        return super.remove(object0, object1);
    }

    @Override  // com.google.common.collect.M3
    public int size() {
        return this.i;
    }

    @Override  // com.google.common.collect.h
    public String toString() {
        return super.toString();
    }

    @Override  // com.google.common.collect.h, com.google.common.collect.M3
    public Collection values() {
        return this.N();
    }

    @O1.a
    private g y(@d4 Object object0, @d4 Object object1, @a g w3$g0) {
        g w3$g1 = new g(object0, object1);
        if(this.f == null) {
            this.g = w3$g1;
            this.f = w3$g1;
            this.h.put(object0, new f(w3$g1));
            ++this.j;
        }
        else if(w3$g0 == null) {
            g w3$g2 = this.g;
            Objects.requireNonNull(w3$g2);
            w3$g2.c = w3$g1;
            w3$g1.d = this.g;
            this.g = w3$g1;
            f w3$f0 = (f)this.h.get(object0);
            if(w3$f0 == null) {
                this.h.put(object0, new f(w3$g1));
                ++this.j;
            }
            else {
                ++w3$f0.c;
                w3$f0.b.e = w3$g1;
                w3$g1.f = w3$f0.b;
                w3$f0.b = w3$g1;
            }
        }
        else {
            f w3$f1 = (f)this.h.get(object0);
            Objects.requireNonNull(w3$f1);
            ++w3$f1.c;
            w3$g1.d = w3$g0.d;
            w3$g1.f = w3$g0.f;
            w3$g1.c = w3$g0;
            w3$g1.e = w3$g0;
            g w3$g3 = w3$g0.f;
            if(w3$g3 == null) {
                w3$f1.a = w3$g1;
            }
            else {
                w3$g3.e = w3$g1;
            }
            g w3$g4 = w3$g0.d;
            if(w3$g4 == null) {
                this.f = w3$g1;
            }
            else {
                w3$g4.c = w3$g1;
            }
            w3$g0.d = w3$g1;
            w3$g0.f = w3$g1;
        }
        ++this.i;
        return w3$g1;
    }
}

