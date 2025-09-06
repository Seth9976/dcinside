package org.jsoup.select;

import androidx.emoji2.text.flatbuffer.b;
import j..util.Map.-EL;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Map;
import org.jsoup.internal.n;
import org.jsoup.nodes.o;
import org.jsoup.nodes.u;

abstract class r extends g {
    static class a extends r {
        private final boolean c;
        static final ThreadLocal d;

        static {
            a.d = new b(() -> a.l());
        }

        public a(g g0) {
            super(g0);
            this.c = a.k(g0);
        }

        @Override  // org.jsoup.select.g
        protected int c() {
            return this.a.c() * 10;
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            if(this.c) {
                for(o o2 = o1.q1(); o2 != null; o2 = o2.k2()) {
                    if(o2 != o1 && this.a.e(o1, o2)) {
                        return true;
                    }
                }
                return false;
            }
            u u0 = (u)a.d.get();
            u0.e(o1);
            while(u0.hasNext()) {
                o o3 = (o)u0.d();
                if(o3 != o1 && this.a.e(o1, o3)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
            return false;
        }

        // 检测为 Lambda 实现
        public static u j() [...]

        private static boolean k(g g0) {
            if(g0 instanceof d) {
                for(Object object0: ((d)g0).a) {
                    if(((g)object0) instanceof org.jsoup.select.r.g || ((g)object0) instanceof c) {
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            return false;
        }

        private static u l() {
            return new u(new o("html"), o.class);
        }

        @Override
        public String toString() {
            return String.format(":has(%s)", this.a);
        }
    }

    static class org.jsoup.select.r.b extends g {
        final ArrayList a;
        int b;

        public org.jsoup.select.r.b(g g0) {
            ArrayList arrayList0 = new ArrayList();
            this.a = arrayList0;
            this.b = 2;
            arrayList0.add(g0);
            this.b += g0.c();
        }

        @Override  // org.jsoup.select.g
        protected int c() {
            return this.b;
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            if(o1 == o0) {
                return false;
            }
            for(int v = this.a.size() - 1; v >= 0; --v) {
                if(o1 == null) {
                    return false;
                }
                if(!((g)this.a.get(v)).e(o0, o1)) {
                    return false;
                }
                o1 = o1.p2();
            }
            return true;
        }

        void g(g g0) {
            this.a.add(g0);
            this.b += g0.c();
        }

        @Override
        public String toString() {
            return n.m(this.a, " > ");
        }
    }

    static class c extends r {
        public c(g g0) {
            super(g0);
        }

        @Override  // org.jsoup.select.g
        protected int c() {
            return this.a.c() + 2;
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            if(o0 == o1) {
                return false;
            }
            o o2 = o1.y2();
            return o2 != null && this.i(o0, o2);
        }

        @Override
        public String toString() {
            return String.format("%s + ", this.a);
        }
    }

    static class org.jsoup.select.r.d extends r {
        public org.jsoup.select.r.d(g g0) {
            super(g0);
        }

        @Override  // org.jsoup.select.g
        protected int c() {
            return this.a.c() + 2;
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            return this.a.e(o0, o1);
        }

        @Override
        public String toString() {
            return String.format(":is(%s)", this.a);
        }
    }

    static class e extends r {
        public e(g g0) {
            super(g0);
        }

        @Override  // org.jsoup.select.g
        protected int c() {
            return this.a.c() + 2;
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            return !this.i(o0, o1);
        }

        @Override
        public String toString() {
            return String.format(":not(%s)", this.a);
        }
    }

    static class f extends r {
        public f(g g0) {
            super(g0);
        }

        @Override  // org.jsoup.select.g
        protected int c() {
            return this.a.c() * 2;
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            if(o0 == o1) {
                return false;
            }
            do {
                o1 = o1.p2();
                if(o1 == null) {
                    break;
                }
                if(this.i(o0, o1)) {
                    return true;
                }
            }
            while(o1 != o0);
            return false;
        }

        @Override
        public String toString() {
            return String.format("%s ", this.a);
        }
    }

    static class org.jsoup.select.r.g extends r {
        public org.jsoup.select.r.g(g g0) {
            super(g0);
        }

        @Override  // org.jsoup.select.g
        protected int c() {
            return this.a.c() * 3;
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            if(o0 == o1) {
                return false;
            }
            for(o o2 = o1.q1(); o2 != null && o2 != o1; o2 = o2.k2()) {
                if(this.i(o0, o2)) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public String toString() {
            return String.format("%s ~ ", this.a);
        }
    }

    static class h extends g {
        @Override  // org.jsoup.select.g
        protected int c() {
            return 1;
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            return o0 == o1;
        }

        @Override
        public String toString() {
            return "";
        }
    }

    final g a;
    final ThreadLocal b;

    public r(g g0) {
        this.b = new b(new org.jsoup.select.o());
        this.a = g0;
    }

    @Override  // org.jsoup.select.g
    protected void f() {
        ((IdentityHashMap)this.b.get()).clear();
        super.f();
    }

    private Boolean h(o o0, o o1) {
        return Boolean.valueOf(this.a.e(o0, o1));
    }

    boolean i(o o0, o o1) {
        return ((Boolean)Map.-EL.computeIfAbsent(((Map)Map.-EL.computeIfAbsent(((Map)this.b.get()), o0, org.jsoup.internal.f.e())), o1, new p(this, o0))).booleanValue();
    }
}

