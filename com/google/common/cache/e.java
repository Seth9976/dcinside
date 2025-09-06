package com.google.common.cache;

import J1.c;
import com.google.common.base.B;
import com.google.common.base.H;
import com.google.common.base.M;
import com.google.common.base.P;
import com.google.common.base.z;
import com.google.common.collect.O2;
import com.google.common.collect.Q2;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

@c
@i
public final class e {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[t.values().length];
            a.a = arr_v;
            try {
                arr_v[t.c.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[t.b.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    static class b extends d {
        @Override  // com.google.common.cache.e$d
        protected void b(e e0, long v, TimeUnit timeUnit0) {
            H.e(e0.k == null, "expireAfterAccess already set");
            e0.j = v;
            e0.k = timeUnit0;
        }
    }

    static class com.google.common.cache.e.c extends f {
        @Override  // com.google.common.cache.e$f
        protected void b(e e0, int v) {
            H.u(e0.d == null, "concurrency level was already set to %s", e0.d);
            e0.d = v;
        }
    }

    static abstract class d implements m {
        @Override  // com.google.common.cache.e$m
        public void a(e e0, String s, @o3.a String s1) {
            TimeUnit timeUnit0;
            if(!P.d(s1)) {
                try {
                    switch(s1.charAt(s1.length() - 1)) {
                        case 100: {
                            timeUnit0 = TimeUnit.DAYS;
                            break;
                        }
                        case 104: {
                            timeUnit0 = TimeUnit.HOURS;
                            break;
                        }
                        case 109: {
                            timeUnit0 = TimeUnit.MINUTES;
                            break;
                        }
                        case 0x73: {
                            timeUnit0 = TimeUnit.SECONDS;
                            break;
                        }
                        default: {
                            throw new IllegalArgumentException(e.d("key %s invalid unit: was %s, must end with one of [dhms]", new Object[]{s, s1}));
                        }
                    }
                    this.b(e0, Long.parseLong(s1.substring(0, s1.length() - 1)), timeUnit0);
                    return;
                }
                catch(NumberFormatException unused_ex) {
                    throw new IllegalArgumentException(e.d("key %s value set to %s, must be integer", new Object[]{s, s1}));
                }
            }
            throw new IllegalArgumentException("value of key " + s + " omitted");
        }

        protected abstract void b(e arg1, long arg2, TimeUnit arg3);
    }

    static class com.google.common.cache.e.e extends f {
        @Override  // com.google.common.cache.e$f
        protected void b(e e0, int v) {
            H.u(e0.a == null, "initial capacity was already set to %s", e0.a);
            e0.a = v;
        }
    }

    static abstract class f implements m {
        @Override  // com.google.common.cache.e$m
        public void a(e e0, String s, String s1) {
            if(!P.d(s1)) {
                try {
                    this.b(e0, Integer.parseInt(s1));
                    return;
                }
                catch(NumberFormatException numberFormatException0) {
                    throw new IllegalArgumentException(e.d("key %s value set to %s, must be integer", new Object[]{s, s1}), numberFormatException0);
                }
            }
            throw new IllegalArgumentException("value of key " + s + " omitted");
        }

        protected abstract void b(e arg1, int arg2);
    }

    static class g implements m {
        private final t a;

        public g(t m$t0) {
            this.a = m$t0;
        }

        @Override  // com.google.common.cache.e$m
        public void a(e e0, String s, @o3.a String s1) {
            boolean z = false;
            H.u(s1 == null, "key %s does not take values", s);
            t m$t0 = e0.e;
            if(m$t0 == null) {
                z = true;
            }
            H.y(z, "%s was already set to %s", s, m$t0);
            e0.e = this.a;
        }
    }

    static abstract class h implements m {
        @Override  // com.google.common.cache.e$m
        public void a(e e0, String s, String s1) {
            if(!P.d(s1)) {
                try {
                    this.b(e0, Long.parseLong(s1));
                    return;
                }
                catch(NumberFormatException numberFormatException0) {
                    throw new IllegalArgumentException(e.d("key %s value set to %s, must be integer", new Object[]{s, s1}), numberFormatException0);
                }
            }
            throw new IllegalArgumentException("value of key " + s + " omitted");
        }

        protected abstract void b(e arg1, long arg2);
    }

    static class com.google.common.cache.e.i extends h {
        @Override  // com.google.common.cache.e$h
        protected void b(e e0, long v) {
            boolean z = false;
            H.u(e0.b == null, "maximum size was already set to %s", e0.b);
            Long long0 = e0.c;
            if(long0 == null) {
                z = true;
            }
            H.u(z, "maximum weight was already set to %s", long0);
            e0.b = v;
        }
    }

    static class j extends h {
        @Override  // com.google.common.cache.e$h
        protected void b(e e0, long v) {
            boolean z = false;
            H.u(e0.c == null, "maximum weight was already set to %s", e0.c);
            Long long0 = e0.b;
            if(long0 == null) {
                z = true;
            }
            H.u(z, "maximum size was already set to %s", long0);
            e0.c = v;
        }
    }

    static class k implements m {
        @Override  // com.google.common.cache.e$m
        public void a(e e0, String s, @o3.a String s1) {
            boolean z = false;
            H.e(s1 == null, "recordStats does not take values");
            if(e0.g == null) {
                z = true;
            }
            H.e(z, "recordStats already set");
            e0.g = Boolean.TRUE;
        }
    }

    static class l extends d {
        @Override  // com.google.common.cache.e$d
        protected void b(e e0, long v, TimeUnit timeUnit0) {
            H.e(e0.m == null, "refreshAfterWrite already set");
            e0.l = v;
            e0.m = timeUnit0;
        }
    }

    interface m {
        void a(e arg1, String arg2, @o3.a String arg3);
    }

    static class n implements m {
        private final t a;

        public n(t m$t0) {
            this.a = m$t0;
        }

        @Override  // com.google.common.cache.e$m
        public void a(e e0, String s, @o3.a String s1) {
            boolean z = false;
            H.u(s1 == null, "key %s does not take values", s);
            t m$t0 = e0.f;
            if(m$t0 == null) {
                z = true;
            }
            H.y(z, "%s was already set to %s", s, m$t0);
            e0.f = this.a;
        }
    }

    static class o extends d {
        @Override  // com.google.common.cache.e$d
        protected void b(e e0, long v, TimeUnit timeUnit0) {
            H.e(e0.i == null, "expireAfterWrite already set");
            e0.h = v;
            e0.i = timeUnit0;
        }
    }

    @J1.e
    @o3.a
    Integer a;
    @J1.e
    @o3.a
    Long b;
    @J1.e
    @o3.a
    Long c;
    @J1.e
    @o3.a
    Integer d;
    @J1.e
    @o3.a
    t e;
    @J1.e
    @o3.a
    t f;
    @J1.e
    @o3.a
    Boolean g;
    @J1.e
    long h;
    @J1.e
    @o3.a
    TimeUnit i;
    @J1.e
    long j;
    @J1.e
    @o3.a
    TimeUnit k;
    @J1.e
    long l;
    @J1.e
    @o3.a
    TimeUnit m;
    private final String n;
    private static final M o;
    private static final M p;
    private static final Q2 q;

    static {
        e.o = M.h(',').q();
        e.p = M.h('=').q();
        e.q = Q2.b().i("initialCapacity", new com.google.common.cache.e.e()).i("maximumSize", new com.google.common.cache.e.i()).i("maximumWeight", new j()).i("concurrencyLevel", new com.google.common.cache.e.c()).i("weakKeys", new g(t.c)).i("softValues", new n(t.b)).i("weakValues", new n(t.c)).i("recordStats", new k()).i("expireAfterAccess", new b()).i("expireAfterWrite", new o()).i("refreshAfterWrite", new l()).i("refreshInterval", new l()).d();
    }

    private e(String s) {
        this.n = s;
    }

    public static e b() {
        return e.e("maximumSize=0");
    }

    @o3.a
    private static Long c(long v, @o3.a TimeUnit timeUnit0) {
        return timeUnit0 == null ? null : timeUnit0.toNanos(v);
    }

    private static String d(String s, Object[] arr_object) {
        return String.format(Locale.ROOT, s, arr_object);
    }

    public static e e(String s) {
        e e0 = new e(s);
        if(!s.isEmpty()) {
            for(Object object0: e.o.n(s)) {
                O2 o20 = O2.q(e.p.n(((String)object0)));
                H.e(!o20.isEmpty(), "blank key-value pair");
                boolean z = false;
                H.u(o20.size() <= 2, "key-value pair %s with more than one equals sign", ((String)object0));
                String s1 = (String)o20.get(0);
                m e$m0 = (m)e.q.get(s1);
                if(e$m0 != null) {
                    z = true;
                }
                H.u(z, "unknown key %s", s1);
                e$m0.a(e0, s1, (o20.size() == 1 ? null : ((String)o20.get(1))));
            }
        }
        return e0;
    }

    // 去混淆评级： 低(36)
    @Override
    public boolean equals(@o3.a Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof e ? B.a(this.a, ((e)object0).a) && B.a(this.b, ((e)object0).b) && B.a(this.c, ((e)object0).c) && B.a(this.d, ((e)object0).d) && B.a(this.e, ((e)object0).e) && B.a(this.f, ((e)object0).f) && B.a(this.g, ((e)object0).g) && B.a(e.c(this.h, this.i), e.c(((e)object0).h, ((e)object0).i)) && B.a(e.c(this.j, this.k), e.c(((e)object0).j, ((e)object0).k)) && B.a(e.c(this.l, this.m), e.c(((e)object0).l, ((e)object0).m)) : false;
    }

    com.google.common.cache.d f() {
        com.google.common.cache.d d0 = com.google.common.cache.d.D();
        Integer integer0 = this.a;
        if(integer0 != null) {
            d0.x(((int)integer0));
        }
        Long long0 = this.b;
        if(long0 != null) {
            d0.B(((long)long0));
        }
        Long long1 = this.c;
        if(long1 != null) {
            d0.C(((long)long1));
        }
        Integer integer1 = this.d;
        if(integer1 != null) {
            d0.e(((int)integer1));
        }
        t m$t0 = this.e;
        if(m$t0 != null) {
            if(a.a[m$t0.ordinal()] != 1) {
                throw new AssertionError();
            }
            d0.M();
        }
        t m$t1 = this.f;
        if(m$t1 != null) {
            switch(m$t1) {
                case 1: {
                    d0.N();
                    break;
                }
                case 2: {
                    d0.J();
                    break;
                }
                default: {
                    throw new AssertionError();
                }
            }
        }
        if(this.g != null && this.g.booleanValue()) {
            d0.E();
        }
        TimeUnit timeUnit0 = this.i;
        if(timeUnit0 != null) {
            d0.g(this.h, timeUnit0);
        }
        TimeUnit timeUnit1 = this.k;
        if(timeUnit1 != null) {
            d0.f(this.j, timeUnit1);
        }
        TimeUnit timeUnit2 = this.m;
        if(timeUnit2 != null) {
            d0.F(this.l, timeUnit2);
        }
        return d0;
    }

    public String g() {
        return this.n;
    }

    @Override
    public int hashCode() {
        return B.b(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, e.c(this.h, this.i), e.c(this.j, this.k), e.c(this.l, this.m)});
    }

    @Override
    public String toString() {
        return z.c(this).s(this.g()).toString();
    }
}

