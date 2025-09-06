package com.google.common.collect;

import J1.a;
import J1.b;
import com.google.common.base.H;
import com.google.common.base.t;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Queue;

@a
@b
@C1
@Deprecated
public abstract class t5 {
    final class e extends u5 implements e4 {
        private final Queue a;
        final t5 b;

        e(Object object0) {
            ArrayDeque arrayDeque0 = new ArrayDeque();
            this.a = arrayDeque0;
            arrayDeque0.add(object0);
        }

        @Override
        public boolean hasNext() {
            return !this.a.isEmpty();
        }

        @Override  // com.google.common.collect.e4
        public Object next() {
            Object object0 = this.a.remove();
            Iterable iterable0 = t5.this.b(object0);
            p3.a(this.a, iterable0);
            return object0;
        }

        @Override  // com.google.common.collect.e4
        public Object peek() {
            return this.a.element();
        }
    }

    final class f extends c {
        private final ArrayDeque c;
        final t5 d;

        f(Object object0) {
            ArrayDeque arrayDeque0 = new ArrayDeque();
            this.c = arrayDeque0;
            arrayDeque0.addLast(this.d(object0));
        }

        @Override  // com.google.common.collect.c
        @o3.a
        protected Object a() {
            while(!this.c.isEmpty()) {
                g t5$g0 = (g)this.c.getLast();
                if(t5$g0.b.hasNext()) {
                    Object object0 = t5$g0.b.next();
                    g t5$g1 = this.d(object0);
                    this.c.addLast(t5$g1);
                    continue;
                }
                this.c.removeLast();
                return t5$g0.a;
            }
            return this.b();
        }

        private g d(Object object0) {
            return new g(object0, t5.this.b(object0).iterator());
        }
    }

    static final class g {
        final Object a;
        final Iterator b;

        g(Object object0, Iterator iterator0) {
            this.a = H.E(object0);
            this.b = (Iterator)H.E(iterator0);
        }
    }

    final class h extends u5 {
        private final Deque a;
        final t5 b;

        h(Object object0) {
            ArrayDeque arrayDeque0 = new ArrayDeque();
            this.a = arrayDeque0;
            arrayDeque0.addLast(q3.X(H.E(object0)));
        }

        @Override
        public boolean hasNext() {
            return !this.a.isEmpty();
        }

        @Override
        public Object next() {
            Iterator iterator0 = (Iterator)this.a.getLast();
            Object object0 = iterator0.next();
            Object object1 = H.E(object0);
            if(!iterator0.hasNext()) {
                this.a.removeLast();
            }
            Iterator iterator1 = t5.this.b(object1).iterator();
            if(iterator1.hasNext()) {
                this.a.addLast(iterator1);
            }
            return object1;
        }
    }

    @Deprecated
    public final V1 a(Object object0) {
        class d extends V1 {
            final Object b;
            final t5 c;

            d(Object object0) {
                this.b = object0;
                super();
            }

            public u5 Q() {
                return new e(t5.this, this.b);
            }

            @Override
            public Iterator iterator() {
                return this.Q();
            }
        }

        H.E(object0);
        return new d(this, object0);
    }

    public abstract Iterable b(Object arg1);

    u5 c(Object object0) {
        return new f(this, object0);
    }

    @Deprecated
    public final V1 d(Object object0) {
        class com.google.common.collect.t5.c extends V1 {
            final Object b;
            final t5 c;

            com.google.common.collect.t5.c(Object object0) {
                this.b = object0;
                super();
            }

            public u5 Q() {
                return t5.this.c(this.b);
            }

            @Override
            public Iterator iterator() {
                return this.Q();
            }
        }

        H.E(object0);
        return new com.google.common.collect.t5.c(this, object0);
    }

    u5 e(Object object0) {
        return new h(this, object0);
    }

    @Deprecated
    public final V1 f(Object object0) {
        class com.google.common.collect.t5.b extends V1 {
            final Object b;
            final t5 c;

            com.google.common.collect.t5.b(Object object0) {
                this.b = object0;
                super();
            }

            public u5 Q() {
                return t5.this.e(this.b);
            }

            @Override
            public Iterator iterator() {
                return this.Q();
            }
        }

        H.E(object0);
        return new com.google.common.collect.t5.b(this, object0);
    }

    @Deprecated
    public static t5 g(t t0) {
        class com.google.common.collect.t5.a extends t5 {
            final t a;

            com.google.common.collect.t5.a(t t0) {
            }

            @Override  // com.google.common.collect.t5
            public Iterable b(Object object0) {
                return (Iterable)this.a.apply(object0);
            }
        }

        H.E(t0);
        return new com.google.common.collect.t5.a(t0);
    }
}

