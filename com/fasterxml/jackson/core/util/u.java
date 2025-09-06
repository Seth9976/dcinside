package com.fasterxml.jackson.core.util;

import androidx.compose.animation.core.d;
import j..util.Optional;
import java.io.Serializable;
import java.util.Deque;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicReference;

public interface u extends Serializable {
    public static abstract class a extends e {
        private final transient ArrayBlockingQueue e;
        private final transient int f;
        private static final long g = 1L;
        public static final int h = 100;

        protected a(int v) {
            super(v);
            if(v <= 0) {
                v = 100;
            }
            this.f = v;
            this.e = new ArrayBlockingQueue(v);
        }

        @Override  // com.fasterxml.jackson.core.util.u
        public void S3(g u$g0) {
            this.e.offer(u$g0);
        }

        public int c() {
            return this.f;
        }

        @Override  // com.fasterxml.jackson.core.util.u
        public g l0() {
            g u$g0 = (g)this.e.poll();
            return u$g0 == null ? this.b() : u$g0;
        }
    }

    public static abstract class b extends e {
        protected final transient Deque e;
        private static final long f = 1L;

        protected b(int v) {
            super(v);
            this.e = new ConcurrentLinkedDeque();
        }

        @Override  // com.fasterxml.jackson.core.util.u
        public void S3(g u$g0) {
            this.e.offerLast(u$g0);
        }

        @Override  // com.fasterxml.jackson.core.util.u
        public g l0() {
            g u$g0 = (g)this.e.pollFirst();
            return u$g0 == null ? this.b() : u$g0;
        }
    }

    public static abstract class c extends e {
        public static class com.fasterxml.jackson.core.util.u.c.a {
            final Object a;
            com.fasterxml.jackson.core.util.u.c.a b;

            com.fasterxml.jackson.core.util.u.c.a(Object object0) {
                this.a = object0;
            }
        }

        private final transient AtomicReference e;
        private static final long f = 1L;

        protected c(int v) {
            super(v);
            this.e = new AtomicReference();
        }

        @Override  // com.fasterxml.jackson.core.util.u
        public void S3(g u$g0) {
            com.fasterxml.jackson.core.util.u.c.a u$c$a0 = new com.fasterxml.jackson.core.util.u.c.a(u$g0);
            for(int v = 0; v < 3; ++v) {
                com.fasterxml.jackson.core.util.u.c.a u$c$a1 = (com.fasterxml.jackson.core.util.u.c.a)this.e.get();
                u$c$a0.b = u$c$a1;
                if(d.a(this.e, u$c$a1, u$c$a0)) {
                    return;
                }
            }
        }

        @Override  // com.fasterxml.jackson.core.util.u
        public g l0() {
            for(int v = 0; v < 3; ++v) {
                com.fasterxml.jackson.core.util.u.c.a u$c$a0 = (com.fasterxml.jackson.core.util.u.c.a)this.e.get();
                if(u$c$a0 == null) {
                    return this.b();
                }
                if(d.a(this.e, u$c$a0, u$c$a0.b)) {
                    u$c$a0.b = null;
                    return (g)u$c$a0.a;
                }
            }
            return this.b();
        }
    }

    public static abstract class com.fasterxml.jackson.core.util.u.d implements u {
        private static final long a = 1L;

        @Override  // com.fasterxml.jackson.core.util.u
        public void S3(g u$g0) {
        }

        @Override  // com.fasterxml.jackson.core.util.u
        public g b1() {
            return this.l0();
        }

        @Override  // com.fasterxml.jackson.core.util.u
        public abstract g l0();
    }

    public static abstract class e implements u {
        protected final int a;
        private static final long b = 1L;
        public static final int c = -1;
        public static final int d = 1;

        protected e(int v) {
            this.a = v;
        }

        protected Optional a(e u$e0) {
            return this.a == -1 ? Optional.of(u$e0) : Optional.empty();
        }

        public abstract g b();

        @Override  // com.fasterxml.jackson.core.util.u
        public g b1() {
            return t.a(this);
        }
    }

    public static abstract class f implements u {
        private static final long a = 1L;

        @Override  // com.fasterxml.jackson.core.util.u
        public void S3(g u$g0) {
        }

        @Override  // com.fasterxml.jackson.core.util.u
        public g b1() {
            return this.l0();
        }

        @Override  // com.fasterxml.jackson.core.util.u
        public abstract g l0();
    }

    public interface g {
        void a();

        g b(u arg1);
    }

    void S3(g arg1);

    g b1();

    g l0();
}

