package org.jsoup.select;

import java.util.function.Predicate;
import java.util.regex.Pattern;
import org.jsoup.helper.i;
import org.jsoup.internal.n;
import org.jsoup.nodes.f;
import org.jsoup.nodes.o;
import org.jsoup.nodes.t;
import org.jsoup.nodes.w;
import org.jsoup.nodes.y;
import org.jsoup.nodes.z;

public abstract class g {
    public static final class A extends D {
        public A() {
            super(0, 1);
        }

        @Override  // org.jsoup.select.g$q
        public String toString() {
            return ":last-of-type";
        }
    }

    public static final class B extends q {
        public B(int v, int v1) {
            super(v, v1);
        }

        @Override  // org.jsoup.select.g$q
        protected int g(o o0, o o1) {
            return o1.i1() + 1;
        }

        @Override  // org.jsoup.select.g$q
        protected String h() {
            return "nth-child";
        }
    }

    public static final class C extends q {
        public C(int v, int v1) {
            super(v, v1);
        }

        @Override  // org.jsoup.select.g$q
        protected int g(o o0, o o1) {
            return o1.p2() == null ? 0 : o1.p2().T0() - o1.i1();
        }

        @Override  // org.jsoup.select.g$q
        protected String h() {
            return "nth-last-child";
        }
    }

    public static class D extends q {
        public D(int v, int v1) {
            super(v, v1);
        }

        @Override  // org.jsoup.select.g$q
        protected int g(o o0, o o1) {
            int v = 0;
            if(o1.p2() == null) {
                return 0;
            }
            for(o o2 = o1; o2 != null; o2 = o2.k2()) {
                if(o2.R().equals(o1.R())) {
                    ++v;
                }
            }
            return v;
        }

        @Override  // org.jsoup.select.g$q
        protected String h() {
            return "nth-last-of-type";
        }
    }

    public static class E extends q {
        public E(int v, int v1) {
            super(v, v1);
        }

        @Override  // org.jsoup.select.g$q
        protected int g(o o0, o o1) {
            o o2 = o1.p2();
            if(o2 == null) {
                return 0;
            }
            int v1 = o2.p();
            int v2 = 0;
            for(int v = 0; v < v1; ++v) {
                t t0 = o2.o(v);
                if(t0.R().equals(o1.R())) {
                    ++v2;
                }
                if(t0 == o1) {
                    break;
                }
            }
            return v2;
        }

        @Override  // org.jsoup.select.g$q
        protected String h() {
            return "nth-of-type";
        }
    }

    public static final class F extends g {
        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            o o2 = o1.p2();
            return o2 != null && !(o2 instanceof f) && o1.M2().isEmpty();
        }

        @Override
        public String toString() {
            return ":only-child";
        }
    }

    public static final class G extends g {
        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            o o2 = o1.p2();
            if(o2 != null && !(o2 instanceof f)) {
                o o3 = o2.p1();
                int v = 0;
                while(o3 != null) {
                    if(o3.R().equals(o1.R())) {
                        ++v;
                    }
                    if(v > 1) {
                        break;
                    }
                    o3 = o3.k2();
                }
                return v == 1;
            }
            return false;
        }

        @Override
        public String toString() {
            return ":only-of-type";
        }
    }

    public static final class H extends g {
        @Override  // org.jsoup.select.g
        protected int c() {
            return 1;
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            if(o0 instanceof f) {
                o0 = o0.p1();
            }
            return o1 == o0;
        }

        @Override
        public String toString() {
            return ":root";
        }
    }

    public static final class I extends g {
        @Override  // org.jsoup.select.g
        protected int c() {
            return -1;
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            if(o1 instanceof w) {
                return true;
            }
            for(Object object0: o1.U2()) {
                w w0 = new w(org.jsoup.parser.q.I(o1.P2(), o1.O2().C(), org.jsoup.parser.f.d), "", o1.j());
                ((y)object0).i0(w0);
                w0.D0(((y)object0));
            }
            return false;
        }

        @Override
        public String toString() {
            return ":matchText";
        }
    }

    public static final class J extends g {
        private final Pattern a;

        public J(Pattern pattern0) {
            this.a = pattern0;
        }

        @Override  // org.jsoup.select.g
        protected int c() {
            return 8;
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            String s = o1.S2();
            return this.a.matcher(s).find();
        }

        @Override
        public String toString() {
            return String.format(":matches(%s)", this.a);
        }
    }

    public static final class K extends g {
        private final Pattern a;

        public K(Pattern pattern0) {
            this.a = pattern0;
        }

        @Override  // org.jsoup.select.g
        protected int c() {
            return 7;
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            String s = o1.n2();
            return this.a.matcher(s).find();
        }

        @Override
        public String toString() {
            return String.format(":matchesOwn(%s)", this.a);
        }
    }

    public static final class L extends g {
        private final Pattern a;

        public L(Pattern pattern0) {
            this.a = pattern0;
        }

        @Override  // org.jsoup.select.g
        protected int c() {
            return 7;
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            String s = o1.Z2();
            return this.a.matcher(s).find();
        }

        @Override
        public String toString() {
            return String.format(":matchesWholeOwnText(%s)", this.a);
        }
    }

    public static final class M extends g {
        private final Pattern a;

        public M(Pattern pattern0) {
            this.a = pattern0;
        }

        @Override  // org.jsoup.select.g
        protected int c() {
            return 8;
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            String s = o1.a3();
            return this.a.matcher(s).find();
        }

        @Override
        public String toString() {
            return String.format(":matchesWholeText(%s)", this.a);
        }
    }

    public static final class N extends g {
        private final String a;

        public N(String s) {
            this.a = s;
        }

        @Override  // org.jsoup.select.g
        protected int c() {
            return 1;
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            return o1.L(this.a);
        }

        @Override
        public String toString() {
            return String.format("%s", this.a);
        }
    }

    public static final class O extends g {
        private final String a;

        public O(String s) {
            this.a = s;
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            return o1.R().endsWith(this.a);
        }

        @Override
        public String toString() {
            return String.format("%s", this.a);
        }
    }

    public static final class P extends g {
        private final String a;

        public P(String s) {
            this.a = s;
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            return o1.R().startsWith(this.a);
        }

        @Override
        public String toString() {
            return String.format("%s", this.a);
        }
    }

    public static final class a extends g {
        @Override  // org.jsoup.select.g
        protected int c() {
            return 10;
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            return true;
        }

        @Override
        public String toString() {
            return "*";
        }
    }

    public static final class b extends g {
        private final String a;

        public b(String s) {
            this.a = s;
        }

        @Override  // org.jsoup.select.g
        protected int c() {
            return 2;
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            return o1.D(this.a);
        }

        @Override
        public String toString() {
            return String.format("[%s]", this.a);
        }
    }

    public static abstract class c extends g {
        final String a;
        final String b;

        public c(String s, String s1) {
            this(s, s1, true);
        }

        public c(String s, String s1, boolean z) {
            i.l(s);
            i.l(s1);
            this.a = org.jsoup.internal.g.b(s);
            boolean z1 = s1.startsWith("\'") && s1.endsWith("\'") || s1.startsWith("\"") && s1.endsWith("\"");
            if(z1) {
                s1 = s1.substring(1, s1.length() - 1);
            }
            this.b = z ? org.jsoup.internal.g.b(s1) : org.jsoup.internal.g.c(s1, z1);
        }
    }

    public static final class d extends g {
        private final String a;

        public d(String s) {
            i.o(s);
            this.a = org.jsoup.internal.g.a(s);
        }

        @Override  // org.jsoup.select.g
        protected int c() {
            return 6;
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            for(Object object0: o1.j().j()) {
                if(org.jsoup.internal.g.a(((org.jsoup.nodes.a)object0).c()).startsWith(this.a)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
            return false;
        }

        @Override
        public String toString() {
            return String.format("[^%s]", this.a);
        }
    }

    public static final class e extends c {
        public e(String s, String s1) {
            super(s, s1);
        }

        @Override  // org.jsoup.select.g
        protected int c() {
            return 3;
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            if(o1.D(this.a)) {
                String s = o1.g(this.a).trim();
                return this.b.equalsIgnoreCase(s);
            }
            return false;
        }

        @Override
        public String toString() {
            return String.format("[%s=%s]", this.a, this.b);
        }
    }

    public static final class org.jsoup.select.g.f extends c {
        public org.jsoup.select.g.f(String s, String s1) {
            super(s, s1);
        }

        @Override  // org.jsoup.select.g
        protected int c() {
            return 6;
        }

        // 去混淆评级： 低(20)
        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            return o1.D(this.a) && org.jsoup.internal.g.a(o1.g(this.a)).contains(this.b);
        }

        @Override
        public String toString() {
            return String.format("[%s*=%s]", this.a, this.b);
        }
    }

    public static final class org.jsoup.select.g.g extends c {
        public org.jsoup.select.g.g(String s, String s1) {
            super(s, s1, false);
        }

        @Override  // org.jsoup.select.g
        protected int c() {
            return 4;
        }

        // 去混淆评级： 低(20)
        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            return o1.D(this.a) && org.jsoup.internal.g.a(o1.g(this.a)).endsWith(this.b);
        }

        @Override
        public String toString() {
            return String.format("[%s$=%s]", this.a, this.b);
        }
    }

    public static final class h extends g {
        final String a;
        final Pattern b;

        public h(String s, Pattern pattern0) {
            this.a = org.jsoup.internal.g.b(s);
            this.b = pattern0;
        }

        @Override  // org.jsoup.select.g
        protected int c() {
            return 8;
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            if(o1.D(this.a)) {
                String s = o1.g(this.a);
                return this.b.matcher(s).find();
            }
            return false;
        }

        @Override
        public String toString() {
            return String.format("[%s~=%s]", this.a, this.b.toString());
        }
    }

    public static final class org.jsoup.select.g.i extends c {
        public org.jsoup.select.g.i(String s, String s1) {
            super(s, s1);
        }

        @Override  // org.jsoup.select.g
        protected int c() {
            return 3;
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            String s = o1.g(this.a);
            return !this.b.equalsIgnoreCase(s);
        }

        @Override
        public String toString() {
            return String.format("[%s!=%s]", this.a, this.b);
        }
    }

    public static final class j extends c {
        public j(String s, String s1) {
            super(s, s1, false);
        }

        @Override  // org.jsoup.select.g
        protected int c() {
            return 4;
        }

        // 去混淆评级： 低(20)
        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            return o1.D(this.a) && org.jsoup.internal.g.a(o1.g(this.a)).startsWith(this.b);
        }

        @Override
        public String toString() {
            return String.format("[%s^=%s]", this.a, this.b);
        }
    }

    public static final class k extends g {
        private final String a;

        public k(String s) {
            this.a = s;
        }

        @Override  // org.jsoup.select.g
        protected int c() {
            return 6;
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            return o1.R1(this.a);
        }

        @Override
        public String toString() {
            return String.format(".%s", this.a);
        }
    }

    public static final class l extends g {
        private final String a;

        public l(String s) {
            this.a = org.jsoup.internal.g.a(s);
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            return org.jsoup.internal.g.a(o1.d1()).contains(this.a);
        }

        @Override
        public String toString() {
            return String.format(":containsData(%s)", this.a);
        }
    }

    public static final class m extends g {
        private final String a;

        public m(String s) {
            this.a = org.jsoup.internal.g.a(n.s(s));
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            return org.jsoup.internal.g.a(o1.n2()).contains(this.a);
        }

        @Override
        public String toString() {
            return String.format(":containsOwn(%s)", this.a);
        }
    }

    public static final class org.jsoup.select.g.n extends g {
        private final String a;

        public org.jsoup.select.g.n(String s) {
            this.a = org.jsoup.internal.g.a(n.s(s));
        }

        @Override  // org.jsoup.select.g
        protected int c() {
            return 10;
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            return org.jsoup.internal.g.a(o1.S2()).contains(this.a);
        }

        @Override
        public String toString() {
            return String.format(":contains(%s)", this.a);
        }
    }

    public static final class org.jsoup.select.g.o extends g {
        private final String a;

        public org.jsoup.select.g.o(String s) {
            this.a = s;
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            return o1.Z2().contains(this.a);
        }

        @Override
        public String toString() {
            return String.format(":containsWholeOwnText(%s)", this.a);
        }
    }

    public static final class p extends g {
        private final String a;

        public p(String s) {
            this.a = s;
        }

        @Override  // org.jsoup.select.g
        protected int c() {
            return 10;
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            return o1.a3().contains(this.a);
        }

        @Override
        public String toString() {
            return String.format(":containsWholeText(%s)", this.a);
        }
    }

    public static abstract class q extends g {
        protected final int a;
        protected final int b;

        public q(int v) {
            this(0, v);
        }

        public q(int v, int v1) {
            this.a = v;
            this.b = v1;
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            o o2 = o1.p2();
            if(o2 != null && !(o2 instanceof f)) {
                int v = this.g(o0, o1);
                return this.a == 0 ? v == this.b : (v - this.b) * this.a >= 0 && (v - this.b) % this.a == 0;
            }
            return false;
        }

        protected abstract int g(o arg1, o arg2);

        protected abstract String h();

        @Override
        public String toString() {
            if(this.a == 0) {
                return String.format(":%s(%d)", this.h(), this.b);
            }
            return this.b == 0 ? String.format(":%s(%dn)", this.h(), this.a) : String.format(":%s(%dn%+d)", this.h(), this.a, this.b);
        }
    }

    public static final class r extends g {
        private final String a;

        public r(String s) {
            this.a = s;
        }

        @Override  // org.jsoup.select.g
        protected int c() {
            return 2;
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            String s = o1.V1();
            return this.a.equals(s);
        }

        @Override
        public String toString() {
            return String.format("#%s", this.a);
        }
    }

    public static final class s extends org.jsoup.select.g.t {
        public s(int v) {
            super(v);
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            return o1.i1() == this.a;
        }

        @Override
        public String toString() {
            return String.format(":eq(%d)", this.a);
        }
    }

    public static abstract class org.jsoup.select.g.t extends g {
        final int a;

        public org.jsoup.select.g.t(int v) {
            this.a = v;
        }
    }

    public static final class u extends org.jsoup.select.g.t {
        public u(int v) {
            super(v);
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            return o1.i1() > this.a;
        }

        @Override
        public String toString() {
            return String.format(":gt(%d)", this.a);
        }
    }

    public static final class v extends org.jsoup.select.g.t {
        public v(int v) {
            super(v);
        }

        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            return o0 != o1 && o1.i1() < this.a;
        }

        @Override
        public String toString() {
            return String.format(":lt(%d)", this.a);
        }
    }

    public static final class org.jsoup.select.g.w extends g {
        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            for(t t0 = o1.A(); t0 != null; t0 = t0.M()) {
                if(t0 instanceof y) {
                    if(!((y)t0).B0()) {
                        return false;
                    }
                }
                else if(!(t0 instanceof org.jsoup.nodes.d) && !(t0 instanceof z) && !(t0 instanceof org.jsoup.nodes.g)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public String toString() {
            return ":empty";
        }
    }

    public static final class x extends g {
        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            o o2 = o1.p2();
            return o2 != null && !(o2 instanceof f) && o1 == o2.p1();
        }

        @Override
        public String toString() {
            return ":first-child";
        }
    }

    public static final class org.jsoup.select.g.y extends E {
        public org.jsoup.select.g.y() {
            super(0, 1);
        }

        @Override  // org.jsoup.select.g$q
        public String toString() {
            return ":first-of-type";
        }
    }

    public static final class org.jsoup.select.g.z extends g {
        @Override  // org.jsoup.select.g
        public boolean e(o o0, o o1) {
            o o2 = o1.p2();
            return o2 != null && !(o2 instanceof f) && o1 == o2.i2();
        }

        @Override
        public String toString() {
            return ":last-child";
        }
    }

    public Predicate b(o o0) {
        return (o o1) -> this.e(o0, o1);
    }

    protected int c() {
        return 5;
    }

    // 检测为 Lambda 实现
    private boolean d(o o0, o o1) [...]

    public abstract boolean e(o arg1, o arg2);

    protected void f() {
    }
}

