package com.google.common.collect;

import J1.b;
import J1.c;
import com.google.common.base.H;
import com.google.common.base.z;
import com.google.common.primitives.l;
import j..util.Objects;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;

@b(emulated = true)
@C1
public final class q5 extends o implements Serializable {
    static class d {
        static final int[] a;

        static {
            int[] arr_v = new int[y.values().length];
            d.a = arr_v;
            try {
                arr_v[y.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                d.a[y.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    static abstract enum e {
        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class a extends e {
            a(String s, int v) {
                super(null);
            }

            @Override  // com.google.common.collect.q5$e
            int b(f q5$f0) {
                return q5$f0.b;
            }

            @Override  // com.google.common.collect.q5$e
            long c(@o3.a f q5$f0) {
                return q5$f0 == null ? 0L : q5$f0.d;
            }
        }

        // 部分失败：枚举糖化
        // 枚举按原样呈现，而不是糖化为Java 5枚举。
        final class com.google.common.collect.q5.e.b extends e {
            com.google.common.collect.q5.e.b(String s, int v) {
                super(null);
            }

            @Override  // com.google.common.collect.q5$e
            int b(f q5$f0) {
                return 1;
            }

            @Override  // com.google.common.collect.q5$e
            long c(@o3.a f q5$f0) {
                return q5$f0 == null ? 0L : ((long)q5$f0.c);
            }
        }

        SIZE /* 警告！未生成枚举子类：com.google.common.collect.q5$e$a */,
        DISTINCT /* 警告！未生成枚举子类：com.google.common.collect.q5$e$b */;

        private e() {
        }

        e(com.google.common.collect.q5.a q5$a0) {
            this();
        }

        private static e[] a() [...] // Inlined contents

        abstract int b(f arg1);

        abstract long c(@o3.a f arg1);
    }

    static final class f {
        @o3.a
        private final Object a;
        private int b;
        private int c;
        private long d;
        private int e;
        @o3.a
        private f f;
        @o3.a
        private f g;
        @o3.a
        private f h;
        @o3.a
        private f i;

        f() {
            this.a = null;
            this.b = 1;
        }

        f(@d4 Object object0, int v) {
            H.d(v > 0);
            this.a = object0;
            this.b = v;
            this.d = (long)v;
            this.c = 1;
            this.e = 1;
            this.f = null;
            this.g = null;
        }

        private f A() {
            switch(this.r()) {
                case -2: {
                    Objects.requireNonNull(this.g);
                    if(this.g.r() > 0) {
                        this.g = this.g.I();
                    }
                    return this.H();
                }
                case 2: {
                    Objects.requireNonNull(this.f);
                    if(this.f.r() < 0) {
                        this.f = this.f.H();
                    }
                    return this.I();
                }
                default: {
                    this.C();
                    return this;
                }
            }
        }

        private void B() {
            this.D();
            this.C();
        }

        private void C() {
            this.e = Math.max(f.y(this.f), f.y(this.g)) + 1;
        }

        private void D() {
            this.c = q5.B(this.f) + 1 + q5.B(this.g);
            this.d = ((long)this.b) + f.M(this.f) + f.M(this.g);
        }

        @o3.a
        f E(Comparator comparator0, @d4 Object object0, int v, int[] arr_v) {
            int v1 = comparator0.compare(object0, this.x());
            if(v1 < 0) {
                f q5$f0 = this.f;
                if(q5$f0 == null) {
                    arr_v[0] = 0;
                    return this;
                }
                this.f = q5$f0.E(comparator0, object0, v, arr_v);
                int v2 = arr_v[0];
                if(v2 > 0) {
                    if(v >= v2) {
                        --this.c;
                        this.d -= (long)v2;
                        return v2 == 0 ? this : this.A();
                    }
                    this.d -= (long)v;
                }
                return v2 == 0 ? this : this.A();
            }
            if(v1 > 0) {
                f q5$f1 = this.g;
                if(q5$f1 == null) {
                    arr_v[0] = 0;
                    return this;
                }
                this.g = q5$f1.E(comparator0, object0, v, arr_v);
                int v3 = arr_v[0];
                if(v3 > 0) {
                    if(v >= v3) {
                        --this.c;
                        this.d -= (long)v3;
                        return this.A();
                    }
                    this.d -= (long)v;
                }
                return this.A();
            }
            int v4 = this.b;
            arr_v[0] = v4;
            if(v >= v4) {
                return this.u();
            }
            this.b = v4 - v;
            this.d -= (long)v;
            return this;
        }

        @o3.a
        private f F(f q5$f0) {
            f q5$f1 = this.g;
            if(q5$f1 == null) {
                return this.f;
            }
            this.g = q5$f1.F(q5$f0);
            --this.c;
            this.d -= (long)q5$f0.b;
            return this.A();
        }

        @o3.a
        private f G(f q5$f0) {
            f q5$f1 = this.f;
            if(q5$f1 == null) {
                return this.g;
            }
            this.f = q5$f1.G(q5$f0);
            --this.c;
            this.d -= (long)q5$f0.b;
            return this.A();
        }

        private f H() {
            H.g0(this.g != null);
            f q5$f0 = this.g;
            this.g = q5$f0.f;
            q5$f0.f = this;
            q5$f0.d = this.d;
            q5$f0.c = this.c;
            this.B();
            q5$f0.C();
            return q5$f0;
        }

        private f I() {
            H.g0(this.f != null);
            f q5$f0 = this.f;
            this.f = q5$f0.g;
            q5$f0.g = this;
            q5$f0.d = this.d;
            q5$f0.c = this.c;
            this.B();
            q5$f0.C();
            return q5$f0;
        }

        @o3.a
        f J(Comparator comparator0, @d4 Object object0, int v, int v1, int[] arr_v) {
            int v2 = comparator0.compare(object0, this.x());
            if(v2 < 0) {
                f q5$f0 = this.f;
                if(q5$f0 == null) {
                    arr_v[0] = 0;
                    return v != 0 || v1 <= 0 ? this : this.p(object0, v1);
                }
                this.f = q5$f0.J(comparator0, object0, v, v1, arr_v);
                int v3 = arr_v[0];
                if(v3 == v) {
                    if(v1 == 0 && v3 != 0) {
                        --this.c;
                    }
                    else if(v1 > 0 && v3 == 0) {
                        ++this.c;
                    }
                    this.d += (long)(v1 - v3);
                }
                return this.A();
            }
            if(v2 > 0) {
                f q5$f1 = this.g;
                if(q5$f1 == null) {
                    arr_v[0] = 0;
                    return v != 0 || v1 <= 0 ? this : this.q(object0, v1);
                }
                this.g = q5$f1.J(comparator0, object0, v, v1, arr_v);
                int v4 = arr_v[0];
                if(v4 == v) {
                    if(v1 == 0 && v4 != 0) {
                        --this.c;
                    }
                    else if(v1 > 0 && v4 == 0) {
                        ++this.c;
                    }
                    this.d += (long)(v1 - v4);
                }
                return this.A();
            }
            int v5 = this.b;
            arr_v[0] = v5;
            if(v == v5) {
                if(v1 == 0) {
                    return this.u();
                }
                this.d += (long)(v1 - v5);
                this.b = v1;
            }
            return this;
        }

        @o3.a
        f K(Comparator comparator0, @d4 Object object0, int v, int[] arr_v) {
            int v1 = comparator0.compare(object0, this.x());
            if(v1 < 0) {
                f q5$f0 = this.f;
                if(q5$f0 == null) {
                    arr_v[0] = 0;
                    return v <= 0 ? this : this.p(object0, v);
                }
                this.f = q5$f0.K(comparator0, object0, v, arr_v);
                if(v == 0 && arr_v[0] != 0) {
                    --this.c;
                }
                else if(v > 0 && arr_v[0] == 0) {
                    ++this.c;
                }
                this.d += (long)(v - arr_v[0]);
                return this.A();
            }
            if(v1 > 0) {
                f q5$f1 = this.g;
                if(q5$f1 == null) {
                    arr_v[0] = 0;
                    return v <= 0 ? this : this.q(object0, v);
                }
                this.g = q5$f1.K(comparator0, object0, v, arr_v);
                if(v == 0 && arr_v[0] != 0) {
                    --this.c;
                }
                else if(v > 0 && arr_v[0] == 0) {
                    ++this.c;
                }
                this.d += (long)(v - arr_v[0]);
                return this.A();
            }
            int v2 = this.b;
            arr_v[0] = v2;
            if(v == 0) {
                return this.u();
            }
            this.d += (long)(v - v2);
            this.b = v;
            return this;
        }

        private f L() {
            f q5$f0 = this.i;
            Objects.requireNonNull(q5$f0);
            return q5$f0;
        }

        private static long M(@o3.a f q5$f0) {
            return q5$f0 == null ? 0L : q5$f0.d;
        }

        f o(Comparator comparator0, @d4 Object object0, int v, int[] arr_v) {
            int v1 = comparator0.compare(object0, this.x());
            boolean z = true;
            if(v1 < 0) {
                f q5$f0 = this.f;
                if(q5$f0 == null) {
                    arr_v[0] = 0;
                    return this.p(object0, v);
                }
                int v2 = q5$f0.e;
                f q5$f1 = q5$f0.o(comparator0, object0, v, arr_v);
                this.f = q5$f1;
                if(arr_v[0] == 0) {
                    ++this.c;
                }
                this.d += (long)v;
                return q5$f1.e == v2 ? this : this.A();
            }
            if(v1 > 0) {
                f q5$f2 = this.g;
                if(q5$f2 == null) {
                    arr_v[0] = 0;
                    return this.q(object0, v);
                }
                int v3 = q5$f2.e;
                f q5$f3 = q5$f2.o(comparator0, object0, v, arr_v);
                this.g = q5$f3;
                if(arr_v[0] == 0) {
                    ++this.c;
                }
                this.d += (long)v;
                return q5$f3.e == v3 ? this : this.A();
            }
            int v4 = this.b;
            arr_v[0] = v4;
            if(((long)v4) + ((long)v) > 0x7FFFFFFFL) {
                z = false;
            }
            H.d(z);
            this.b += v;
            this.d += (long)v;
            return this;
        }

        private f p(@d4 Object object0, int v) {
            this.f = new f(object0, v);
            q5.G(this.z(), this.f, this);
            this.e = Math.max(2, this.e);
            ++this.c;
            this.d += (long)v;
            return this;
        }

        private f q(@d4 Object object0, int v) {
            f q5$f0 = new f(object0, v);
            this.g = q5$f0;
            q5.G(this, q5$f0, this.L());
            this.e = Math.max(2, this.e);
            ++this.c;
            this.d += (long)v;
            return this;
        }

        private int r() {
            return f.y(this.f) - f.y(this.g);
        }

        @o3.a
        private f s(Comparator comparator0, @d4 Object object0) {
            int v = comparator0.compare(object0, this.x());
            if(v < 0) {
                return this.f == null ? this : ((f)z.a(this.f.s(comparator0, object0), this));
            }
            if(v == 0) {
                return this;
            }
            return this.g == null ? null : this.g.s(comparator0, object0);
        }

        int t(Comparator comparator0, @d4 Object object0) {
            int v = comparator0.compare(object0, this.x());
            if(v < 0) {
                return this.f == null ? 0 : this.f.t(comparator0, object0);
            }
            if(v > 0) {
                return this.g == null ? 0 : this.g.t(comparator0, object0);
            }
            return this.b;
        }

        @Override
        public String toString() {
            return T3.k(this.x(), this.w()).toString();
        }

        @o3.a
        private f u() {
            int v = this.b;
            this.b = 0;
            q5.F(this.z(), this.L());
            f q5$f0 = this.f;
            if(q5$f0 == null) {
                return this.g;
            }
            f q5$f1 = this.g;
            if(q5$f1 == null) {
                return q5$f0;
            }
            if(q5$f0.e >= q5$f1.e) {
                f q5$f2 = this.z();
                q5$f2.f = this.f.F(q5$f2);
                q5$f2.g = this.g;
                q5$f2.c = this.c - 1;
                q5$f2.d = this.d - ((long)v);
                return q5$f2.A();
            }
            f q5$f3 = this.L();
            q5$f3.g = this.g.G(q5$f3);
            q5$f3.f = this.f;
            q5$f3.c = this.c - 1;
            q5$f3.d = this.d - ((long)v);
            return q5$f3.A();
        }

        @o3.a
        private f v(Comparator comparator0, @d4 Object object0) {
            int v = comparator0.compare(object0, this.x());
            if(v > 0) {
                return this.g == null ? this : ((f)z.a(this.g.v(comparator0, object0), this));
            }
            if(v == 0) {
                return this;
            }
            return this.f == null ? null : this.f.v(comparator0, object0);
        }

        int w() {
            return this.b;
        }

        @d4
        Object x() {
            return this.a;
        }

        private static int y(@o3.a f q5$f0) {
            return q5$f0 == null ? 0 : q5$f0.e;
        }

        private f z() {
            f q5$f0 = this.h;
            Objects.requireNonNull(q5$f0);
            return q5$f0;
        }
    }

    static final class g {
        @o3.a
        private Object a;

        private g() {
        }

        g(com.google.common.collect.q5.a q5$a0) {
        }

        public void a(@o3.a Object object0, @o3.a Object object1) {
            if(this.a != object0) {
                throw new ConcurrentModificationException();
            }
            this.a = object1;
        }

        void b() {
            this.a = null;
        }

        @o3.a
        public Object c() {
            return this.a;
        }
    }

    private final transient g e;
    private final transient y2 f;
    private final transient f g;
    @c
    @J1.d
    private static final long h = 1L;

    q5(g q5$g0, y2 y20, f q5$f0) {
        super(y20.b());
        this.e = q5$g0;
        this.f = y20;
        this.g = q5$f0;
    }

    q5(Comparator comparator0) {
        super(comparator0);
        this.f = y2.a(comparator0);
        f q5$f0 = new f();
        this.g = q5$f0;
        q5.F(q5$f0, q5$f0);
        this.e = new g(null);
    }

    public static q5 A(@o3.a Comparator comparator0) {
        return comparator0 == null ? new q5(c4.K()) : new q5(comparator0);
    }

    static int B(@o3.a f q5$f0) {
        return q5$f0 == null ? 0 : q5$f0.c;
    }

    @Override  // com.google.common.collect.M4
    public M4 B3(@d4 Object object0, y y0) {
        y2 y20 = y2.d(this.comparator(), object0, y0);
        y2 y21 = this.f.l(y20);
        return new q5(this.e, y21, this.g);
    }

    @o3.a
    private f C() {
        f q5$f1;
        f q5$f0 = (f)this.e.c();
        if(q5$f0 == null) {
            return null;
        }
        if(this.f.j()) {
            Object object0 = W3.a(this.f.g());
            q5$f1 = q5$f0.s(this.comparator(), object0);
            if(q5$f1 == null) {
                return null;
            }
            if(this.f.f() == y.b && this.comparator().compare(object0, q5$f1.x()) == 0) {
                q5$f1 = q5$f1.L();
                return q5$f1 == this.g || !this.f.c(q5$f1.x()) ? null : q5$f1;
            }
        }
        else {
            q5$f1 = this.g.L();
        }
        return q5$f1 == this.g || !this.f.c(q5$f1.x()) ? null : q5$f1;
    }

    @o3.a
    private f D() {
        f q5$f1;
        f q5$f0 = (f)this.e.c();
        if(q5$f0 == null) {
            return null;
        }
        if(this.f.k()) {
            Object object0 = W3.a(this.f.i());
            q5$f1 = q5$f0.v(this.comparator(), object0);
            if(q5$f1 == null) {
                return null;
            }
            if(this.f.h() == y.b && this.comparator().compare(object0, q5$f1.x()) == 0) {
                q5$f1 = q5$f1.z();
                return q5$f1 == this.g || !this.f.c(q5$f1.x()) ? null : q5$f1;
            }
        }
        else {
            q5$f1 = this.g.z();
        }
        return q5$f1 == this.g || !this.f.c(q5$f1.x()) ? null : q5$f1;
    }

    @c
    @J1.d
    private void E(ObjectInputStream objectInputStream0) throws IOException, ClassNotFoundException {
        objectInputStream0.defaultReadObject();
        Object object0 = objectInputStream0.readObject();
        Objects.requireNonNull(object0);
        A4.a(o.class, "comparator").b(this, ((Comparator)object0));
        A4.a(q5.class, "range").b(this, y2.a(((Comparator)object0)));
        A4.a(q5.class, "rootReference").b(this, new g(null));
        f q5$f0 = new f();
        A4.a(q5.class, "header").b(this, q5$f0);
        q5.F(q5$f0, q5$f0);
        A4.f(this, objectInputStream0);
    }

    private static void F(f q5$f0, f q5$f1) {
        q5$f0.i = q5$f1;
        q5$f1.h = q5$f0;
    }

    private static void G(f q5$f0, f q5$f1, f q5$f2) {
        q5.F(q5$f0, q5$f1);
        q5.F(q5$f1, q5$f2);
    }

    private com.google.common.collect.S3.a H(f q5$f0) {
        class com.google.common.collect.q5.a extends com.google.common.collect.T3.f {
            final f a;
            final q5 b;

            com.google.common.collect.q5.a(f q5$f0) {
                this.a = q5$f0;
                super();
            }

            @Override  // com.google.common.collect.S3$a
            @d4
            public Object b0() {
                return this.a.x();
            }

            @Override  // com.google.common.collect.S3$a
            public int getCount() {
                int v = this.a.w();
                if(v == 0) {
                    Object object0 = this.b0();
                    return q5.this.y3(object0);
                }
                return v;
            }
        }

        return new com.google.common.collect.q5.a(this, q5$f0);
    }

    @c
    @J1.d
    private void I(ObjectOutputStream objectOutputStream0) throws IOException {
        objectOutputStream0.defaultWriteObject();
        objectOutputStream0.writeObject(this.f().comparator());
        A4.k(this, objectOutputStream0);
    }

    @Override  // com.google.common.collect.i, com.google.common.collect.S3
    @O1.a
    public int T0(@d4 Object object0, int v) {
        c1.b(v, "occurrences");
        if(v == 0) {
            return this.y3(object0);
        }
        H.d(this.f.c(object0));
        f q5$f0 = (f)this.e.c();
        if(q5$f0 == null) {
            this.comparator().compare(object0, object0);
            f q5$f1 = new f(object0, v);
            q5.G(this.g, q5$f1, this.g);
            this.e.a(null, q5$f1);
            return 0;
        }
        int[] arr_v = new int[1];
        f q5$f2 = q5$f0.o(this.comparator(), object0, v, arr_v);
        this.e.a(q5$f0, q5$f2);
        return arr_v[0];
    }

    @Override  // com.google.common.collect.o
    public M4 Y0() {
        return super.Y0();
    }

    @Override  // com.google.common.collect.o
    public M4 Y2(@d4 Object object0, y y0, @d4 Object object1, y y1) {
        return super.Y2(object0, y0, object1, y1);
    }

    @Override  // com.google.common.collect.i, com.google.common.collect.S3
    @O1.a
    public int b3(@o3.a Object object0, int v) {
        f q5$f1;
        c1.b(v, "occurrences");
        if(v == 0) {
            return this.y3(object0);
        }
        f q5$f0 = (f)this.e.c();
        int[] arr_v = new int[1];
        try {
            if(this.f.c(object0) && q5$f0 != null) {
                q5$f1 = q5$f0.E(this.comparator(), object0, v, arr_v);
                goto label_9;
            }
        }
        catch(ClassCastException | NullPointerException unused_ex) {
        }
        return 0;
    label_9:
        this.e.a(q5$f0, q5$f1);
        return arr_v[0];
    }

    @Override  // com.google.common.collect.i
    int c() {
        return l.z(this.x(e.b));
    }

    @Override  // com.google.common.collect.i
    public void clear() {
        f q5$f1;
        if(!this.f.j() && !this.f.k()) {
            for(f q5$f0 = this.g.L(); true; q5$f0 = q5$f2) {
                q5$f1 = this.g;
                if(q5$f0 == q5$f1) {
                    break;
                }
                f q5$f2 = q5$f0.L();
                q5$f0.b = 0;
                q5$f0.f = null;
                q5$f0.g = null;
                q5$f0.h = null;
                q5$f0.i = null;
            }
            q5.F(q5$f1, q5$f1);
            this.e.b();
            return;
        }
        q3.g(this.g());
    }

    @Override  // com.google.common.collect.o
    public Comparator comparator() {
        return super.comparator();
    }

    @Override  // com.google.common.collect.i, com.google.common.collect.S3
    public boolean contains(@o3.a Object object0) {
        return super.contains(object0);
    }

    @Override  // com.google.common.collect.i
    Iterator d() {
        return T3.h(this.g());
    }

    @Override  // com.google.common.collect.i, com.google.common.collect.M4
    public Set entrySet() {
        return super.entrySet();
    }

    @Override  // com.google.common.collect.o
    public NavigableSet f() {
        return super.f();
    }

    @Override  // com.google.common.collect.o
    @o3.a
    public com.google.common.collect.S3.a firstEntry() {
        return super.firstEntry();
    }

    @Override  // com.google.common.collect.i
    Iterator g() {
        class com.google.common.collect.q5.b implements Iterator {
            @o3.a
            f a;
            @o3.a
            com.google.common.collect.S3.a b;
            final q5 c;

            com.google.common.collect.q5.b() {
                this.a = q50.C();
            }

            public com.google.common.collect.S3.a a() {
                if(!this.hasNext()) {
                    throw new NoSuchElementException();
                }
                f q5$f0 = this.a;
                Objects.requireNonNull(q5$f0);
                com.google.common.collect.S3.a s3$a0 = q5.this.H(q5$f0);
                this.b = s3$a0;
                if(this.a.L() == q5.this.g) {
                    this.a = null;
                    return s3$a0;
                }
                this.a = this.a.L();
                return s3$a0;
            }

            @Override
            public boolean hasNext() {
                if(this.a == null) {
                    return false;
                }
                if(q5.this.f.p(this.a.x())) {
                    this.a = null;
                    return false;
                }
                return true;
            }

            @Override
            public Object next() {
                return this.a();
            }

            @Override
            public void remove() {
                H.h0(this.b != null, "no calls to next() since the last call to remove()");
                Object object0 = this.b.b0();
                q5.this.j2(object0, 0);
                this.b = null;
            }
        }

        return new com.google.common.collect.q5.b(this);
    }

    @Override  // com.google.common.collect.i
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override  // com.google.common.collect.M4, com.google.common.collect.S3
    public Iterator iterator() {
        return T3.n(this);
    }

    @Override  // com.google.common.collect.o
    Iterator j() {
        class com.google.common.collect.q5.c implements Iterator {
            @o3.a
            f a;
            @o3.a
            com.google.common.collect.S3.a b;
            final q5 c;

            com.google.common.collect.q5.c() {
                this.a = q50.D();
                this.b = null;
            }

            public com.google.common.collect.S3.a a() {
                if(!this.hasNext()) {
                    throw new NoSuchElementException();
                }
                Objects.requireNonNull(this.a);
                com.google.common.collect.S3.a s3$a0 = q5.this.H(this.a);
                this.b = s3$a0;
                if(this.a.z() == q5.this.g) {
                    this.a = null;
                    return s3$a0;
                }
                this.a = this.a.z();
                return s3$a0;
            }

            @Override
            public boolean hasNext() {
                if(this.a == null) {
                    return false;
                }
                if(q5.this.f.q(this.a.x())) {
                    this.a = null;
                    return false;
                }
                return true;
            }

            @Override
            public Object next() {
                return this.a();
            }

            @Override
            public void remove() {
                H.h0(this.b != null, "no calls to next() since the last call to remove()");
                Object object0 = this.b.b0();
                q5.this.j2(object0, 0);
                this.b = null;
            }
        }

        return new com.google.common.collect.q5.c(this);
    }

    @Override  // com.google.common.collect.i, com.google.common.collect.S3
    @O1.a
    public boolean j1(@d4 Object object0, int v, int v1) {
        c1.b(v1, "newCount");
        c1.b(v, "oldCount");
        H.d(this.f.c(object0));
        f q5$f0 = (f)this.e.c();
        if(q5$f0 == null) {
            if(v == 0) {
                if(v1 > 0) {
                    this.T0(object0, v1);
                }
                return true;
            }
            return false;
        }
        int[] arr_v = new int[1];
        f q5$f1 = q5$f0.J(this.comparator(), object0, v, v1, arr_v);
        this.e.a(q5$f0, q5$f1);
        return arr_v[0] == v;
    }

    @Override  // com.google.common.collect.i, com.google.common.collect.S3
    @O1.a
    public int j2(@d4 Object object0, int v) {
        c1.b(v, "count");
        boolean z = true;
        if(!this.f.c(object0)) {
            if(v != 0) {
                z = false;
            }
            H.d(z);
            return 0;
        }
        f q5$f0 = (f)this.e.c();
        if(q5$f0 == null) {
            if(v > 0) {
                this.T0(object0, v);
            }
            return 0;
        }
        int[] arr_v = new int[1];
        f q5$f1 = q5$f0.K(this.comparator(), object0, v, arr_v);
        this.e.a(q5$f0, q5$f1);
        return arr_v[0];
    }

    @Override  // com.google.common.collect.o
    @o3.a
    public com.google.common.collect.S3.a lastEntry() {
        return super.lastEntry();
    }

    @Override  // com.google.common.collect.o
    @o3.a
    public com.google.common.collect.S3.a pollFirstEntry() {
        return super.pollFirstEntry();
    }

    @Override  // com.google.common.collect.o
    @o3.a
    public com.google.common.collect.S3.a pollLastEntry() {
        return super.pollLastEntry();
    }

    private long r(e q5$e0, @o3.a f q5$f0) {
        if(q5$f0 == null) {
            return 0L;
        }
        int v = this.comparator().compare(W3.a(this.f.i()), q5$f0.x());
        if(v > 0) {
            return this.r(q5$e0, q5$f0.g);
        }
        if(v == 0) {
            switch(this.f.h()) {
                case 1: {
                    return ((long)q5$e0.b(q5$f0)) + q5$e0.c(q5$f0.g);
                }
                case 2: {
                    return q5$e0.c(q5$f0.g);
                }
                default: {
                    throw new AssertionError();
                }
            }
        }
        return q5$e0.c(q5$f0.g) + ((long)q5$e0.b(q5$f0)) + this.r(q5$e0, q5$f0.f);
    }

    @Override  // com.google.common.collect.S3
    public int size() {
        return l.z(this.x(e.a));
    }

    @Override  // com.google.common.collect.M4
    public M4 t1(@d4 Object object0, y y0) {
        y2 y20 = y2.r(this.comparator(), object0, y0);
        y2 y21 = this.f.l(y20);
        return new q5(this.e, y21, this.g);
    }

    private long u(e q5$e0, @o3.a f q5$f0) {
        if(q5$f0 == null) {
            return 0L;
        }
        int v = this.comparator().compare(W3.a(this.f.g()), q5$f0.x());
        if(v < 0) {
            return this.u(q5$e0, q5$f0.f);
        }
        if(v == 0) {
            switch(this.f.f()) {
                case 1: {
                    return ((long)q5$e0.b(q5$f0)) + q5$e0.c(q5$f0.f);
                }
                case 2: {
                    return q5$e0.c(q5$f0.f);
                }
                default: {
                    throw new AssertionError();
                }
            }
        }
        return q5$e0.c(q5$f0.f) + ((long)q5$e0.b(q5$f0)) + this.u(q5$e0, q5$f0.g);
    }

    private long x(e q5$e0) {
        f q5$f0 = (f)this.e.c();
        long v = q5$e0.c(q5$f0);
        if(this.f.j()) {
            v -= this.u(q5$e0, q5$f0);
        }
        return this.f.k() ? v - this.r(q5$e0, q5$f0) : v;
    }

    public static q5 y() {
        return new q5(c4.K());
    }

    @Override  // com.google.common.collect.S3
    public int y3(@o3.a Object object0) {
        try {
            f q5$f0 = (f)this.e.c();
            return !this.f.c(object0) || q5$f0 == null ? 0 : q5$f0.t(this.comparator(), object0);
        }
        catch(ClassCastException | NullPointerException unused_ex) {
        }
        return 0;
    }

    public static q5 z(Iterable iterable0) {
        q5 q50 = q5.y();
        p3.a(q50, iterable0);
        return q50;
    }
}

