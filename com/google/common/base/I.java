package com.google.common.base;

import J1.b;
import O1.g;
import O1.l;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Iterator;
import o3.a;

@b
@k
public abstract class i implements t {
    static final class com.google.common.base.i.b extends i implements Serializable {
        final i c;
        final i d;
        private static final long e;

        com.google.common.base.i.b(i i0, i i1) {
            this.c = i0;
            this.d = i1;
        }

        @Override  // com.google.common.base.i
        @a
        Object e(@a Object object0) {
            Object object1 = this.d.e(object0);
            return this.c.e(object1);
        }

        // 去混淆评级： 低(30)
        @Override  // com.google.common.base.i
        public boolean equals(@a Object object0) {
            return object0 instanceof com.google.common.base.i.b && this.c.equals(((com.google.common.base.i.b)object0).c) && this.d.equals(((com.google.common.base.i.b)object0).d);
        }

        @Override  // com.google.common.base.i
        @a
        Object f(@a Object object0) {
            Object object1 = this.c.f(object0);
            return this.d.f(object1);
        }

        @Override  // com.google.common.base.i
        protected Object h(Object object0) {
            throw new AssertionError();
        }

        @Override
        public int hashCode() {
            return this.c.hashCode() * 0x1F + this.d.hashCode();
        }

        @Override  // com.google.common.base.i
        protected Object i(Object object0) {
            throw new AssertionError();
        }

        @Override
        public String toString() {
            return this.c + ".andThen(" + this.d + ")";
        }
    }

    static final class c extends i implements Serializable {
        private final t c;
        private final t d;

        private c(t t0, t t1) {
            this.c = (t)H.E(t0);
            this.d = (t)H.E(t1);
        }

        c(t t0, t t1, com.google.common.base.i.a i$a0) {
            this(t0, t1);
        }

        // 去混淆评级： 低(30)
        @Override  // com.google.common.base.i
        public boolean equals(@a Object object0) {
            return object0 instanceof c && this.c.equals(((c)object0).c) && this.d.equals(((c)object0).d);
        }

        @Override  // com.google.common.base.i
        protected Object h(Object object0) {
            return this.d.apply(object0);
        }

        @Override
        public int hashCode() {
            return this.c.hashCode() * 0x1F + this.d.hashCode();
        }

        @Override  // com.google.common.base.i
        protected Object i(Object object0) {
            return this.c.apply(object0);
        }

        @Override
        public String toString() {
            return "Converter.from(" + this.c + ", " + this.d + ")";
        }
    }

    static final class d extends i implements Serializable {
        static final i c;
        private static final long d;

        static {
            d.c = new d();
        }

        @Override  // com.google.common.base.i
        i g(i i0) {
            return (i)H.F(i0, "otherConverter");
        }

        @Override  // com.google.common.base.i
        protected Object h(Object object0) {
            return object0;
        }

        @Override  // com.google.common.base.i
        protected Object i(Object object0) {
            return object0;
        }

        @Override  // com.google.common.base.i
        public i l() {
            return this;
        }

        private Object o() {
            return d.c;
        }

        public d p() [...] // Inlined contents

        @Override
        public String toString() {
            return "Converter.identity()";
        }
    }

    static final class e extends i implements Serializable {
        final i c;
        private static final long d;

        e(i i0) {
            this.c = i0;
        }

        @Override  // com.google.common.base.i
        @a
        Object e(@a Object object0) {
            return this.c.f(object0);
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.common.base.i
        public boolean equals(@a Object object0) {
            return object0 instanceof e ? this.c.equals(((e)object0).c) : false;
        }

        @Override  // com.google.common.base.i
        @a
        Object f(@a Object object0) {
            return this.c.e(object0);
        }

        @Override  // com.google.common.base.i
        protected Object h(Object object0) {
            throw new AssertionError();
        }

        @Override
        public int hashCode() {
            return ~this.c.hashCode();
        }

        @Override  // com.google.common.base.i
        protected Object i(Object object0) {
            throw new AssertionError();
        }

        @Override  // com.google.common.base.i
        public i l() {
            return this.c;
        }

        @Override
        public String toString() {
            return this.c + ".reverse()";
        }
    }

    private final boolean a;
    @P1.b
    @RetainedWith
    @a
    private transient i b;

    protected i() {
        this(true);
    }

    i(boolean z) {
        this.a = z;
    }

    public final i a(i i0) {
        return this.g(i0);
    }

    @Override  // com.google.common.base.t
    @l(replacement = "this.convert(a)")
    @Deprecated
    public final Object apply(Object object0) {
        return this.b(object0);
    }

    @a
    public final Object b(@a Object object0) {
        return this.f(object0);
    }

    public Iterable d(Iterable iterable0) {
        class com.google.common.base.i.a implements Iterable {
            final Iterable a;
            final i b;

            com.google.common.base.i.a(Iterable iterable0) {
                this.a = iterable0;
                super();
            }

            @Override
            public Iterator iterator() {
                class com.google.common.base.i.a.a implements Iterator {
                    private final Iterator a;
                    final com.google.common.base.i.a b;

                    com.google.common.base.i.a.a() {
                        this.a = i$a0.a.iterator();
                    }

                    @Override
                    public boolean hasNext() {
                        return this.a.hasNext();
                    }

                    @Override
                    public Object next() {
                        Object object0 = this.a.next();
                        return i.this.b(object0);
                    }

                    @Override
                    public void remove() {
                        this.a.remove();
                    }
                }

                return new com.google.common.base.i.a.a(this);
            }
        }

        H.F(iterable0, "fromIterable");
        return new com.google.common.base.i.a(this, iterable0);
    }

    @a
    Object e(@a Object object0) {
        if(this.a) {
            return object0 == null ? null : H.E(this.h(object0));
        }
        return this.m(object0);
    }

    @Override  // com.google.common.base.t
    public boolean equals(@a Object object0) {
        return super.equals(object0);
    }

    @a
    Object f(@a Object object0) {
        if(this.a) {
            return object0 == null ? null : H.E(this.i(object0));
        }
        return this.n(object0);
    }

    i g(i i0) {
        return new com.google.common.base.i.b(this, ((i)H.E(i0)));
    }

    @g
    protected abstract Object h(Object arg1);

    @g
    protected abstract Object i(Object arg1);

    public static i j(t t0, t t1) {
        return new c(t0, t1, null);
    }

    public static i k() {
        return (d)d.c;
    }

    @O1.b
    public i l() {
        i i0 = this.b;
        if(i0 == null) {
            i0 = new e(this);
            this.b = i0;
        }
        return i0;
    }

    @a
    private Object m(@a Object object0) {
        return this.h(object0);
    }

    @a
    private Object n(@a Object object0) {
        return this.i(object0);
    }
}

