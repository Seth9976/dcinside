package com.google.common.collect;

import J1.b;
import com.google.common.base.H;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import o3.a;

@b(emulated = true)
@C1
abstract class o extends i implements M4 {
    @z2
    final Comparator c;
    @P1.b
    @a
    private transient M4 d;

    o() {
        this(c4.K());
    }

    o(Comparator comparator0) {
        this.c = (Comparator)H.E(comparator0);
    }

    @Override  // com.google.common.collect.M4
    public M4 Y0() {
        M4 m40 = this.d;
        if(m40 == null) {
            m40 = this.h();
            this.d = m40;
        }
        return m40;
    }

    @Override  // com.google.common.collect.M4
    public M4 Y2(@d4 Object object0, y y0, @d4 Object object1, y y1) {
        H.E(y0);
        H.E(y1);
        return this.B3(object0, y0).t1(object1, y1);
    }

    @Override  // com.google.common.collect.i
    Set a() {
        return this.i();
    }

    @Override  // com.google.common.collect.M4
    public Comparator comparator() {
        return this.c;
    }

    Iterator descendingIterator() {
        return T3.n(this.Y0());
    }

    @Override  // com.google.common.collect.M4
    public NavigableSet f() {
        return (NavigableSet)super.f();
    }

    @Override  // com.google.common.collect.i, com.google.common.collect.M4
    public Set f() {
        return this.f();
    }

    @Override  // com.google.common.collect.M4
    public SortedSet f() {
        return this.f();
    }

    @Override  // com.google.common.collect.M4
    @a
    public com.google.common.collect.S3.a firstEntry() {
        Iterator iterator0 = this.g();
        return iterator0.hasNext() ? iterator0.next() : null;
    }

    M4 h() {
        class com.google.common.collect.o.a extends A1 {
            final o d;

            @Override  // com.google.common.collect.A1
            Iterator F0() {
                return o.this.j();
            }

            @Override  // com.google.common.collect.A1
            M4 G0() {
                return o.this;
            }

            @Override  // com.google.common.collect.A1
            public Iterator iterator() {
                return o.this.descendingIterator();
            }
        }

        return new com.google.common.collect.o.a(this);
    }

    NavigableSet i() {
        return new com.google.common.collect.P4.b(this);
    }

    abstract Iterator j();

    @Override  // com.google.common.collect.M4
    @a
    public com.google.common.collect.S3.a lastEntry() {
        Iterator iterator0 = this.j();
        return iterator0.hasNext() ? iterator0.next() : null;
    }

    @Override  // com.google.common.collect.M4
    @a
    public com.google.common.collect.S3.a pollFirstEntry() {
        Iterator iterator0 = this.g();
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            com.google.common.collect.S3.a s3$a0 = T3.k(((com.google.common.collect.S3.a)object0).b0(), ((com.google.common.collect.S3.a)object0).getCount());
            iterator0.remove();
            return s3$a0;
        }
        return null;
    }

    @Override  // com.google.common.collect.M4
    @a
    public com.google.common.collect.S3.a pollLastEntry() {
        Iterator iterator0 = this.j();
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            com.google.common.collect.S3.a s3$a0 = T3.k(((com.google.common.collect.S3.a)object0).b0(), ((com.google.common.collect.S3.a)object0).getCount());
            iterator0.remove();
            return s3$a0;
        }
        return null;
    }
}

