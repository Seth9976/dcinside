package com.google.common.cache;

import J1.b;
import com.google.common.base.Q;
import java.util.concurrent.atomic.AtomicLong;

@b(emulated = true)
@i
final class q {
    class a implements Q {
        a() {
            super();
        }

        public p a() {
            return new r();
        }

        @Override  // com.google.common.base.Q
        public Object get() {
            return this.a();
        }
    }

    class com.google.common.cache.q.b implements Q {
        com.google.common.cache.q.b() {
            super();
        }

        public p a() {
            return new c(null);
        }

        @Override  // com.google.common.base.Q
        public Object get() {
            return this.a();
        }
    }

    static final class c extends AtomicLong implements p {
        private c() {
        }

        c(a q$a0) {
        }

        @Override  // com.google.common.cache.p
        public void a(long v) {
            this.getAndAdd(v);
        }

        @Override  // com.google.common.cache.p
        public void b() {
            this.getAndIncrement();
        }

        @Override  // com.google.common.cache.p
        public long sum() {
            return this.get();
        }
    }

    private static final Q a;

    static {
        a q$a0;
        try {
            new r();
            q$a0 = new a();
        }
        catch(Throwable unused_ex) {
            q$a0 = new com.google.common.cache.q.b();
        }
        q.a = q$a0;
    }

    public static p a() {
        return (p)q.a.get();
    }
}

