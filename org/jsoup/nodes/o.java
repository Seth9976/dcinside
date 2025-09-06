package org.jsoup.nodes;

import j..util.Collection.-EL;
import j..util.Objects;
import j..util.stream.Collectors;
import j..util.stream.Stream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.jsoup.helper.b;
import org.jsoup.helper.i;
import org.jsoup.parser.f;
import org.jsoup.parser.q;
import org.jsoup.select.e;
import org.jsoup.select.g.J;
import org.jsoup.select.g.K;
import org.jsoup.select.g.N;
import org.jsoup.select.g.h;
import org.jsoup.select.g.j;
import org.jsoup.select.g.k;
import org.jsoup.select.g.m;
import org.jsoup.select.g.r;
import org.jsoup.select.g.s;
import org.jsoup.select.g.u;
import org.jsoup.select.g;
import org.jsoup.select.l;
import org.jsoup.select.n;

public class o extends t {
    static final class a extends b {
        private final o a;

        a(o o0, int v) {
            super(v);
            this.a = o0;
        }

        @Override  // org.jsoup.helper.b
        public void a() {
            this.a.Q();
        }
    }

    static class org.jsoup.nodes.o.b implements l {
        private final StringBuilder a;

        public org.jsoup.nodes.o.b(StringBuilder stringBuilder0) {
            this.a = stringBuilder0;
        }

        @Override  // org.jsoup.select.l
        public void a(t t0, int v) {
            if(t0 instanceof o) {
                t t1 = t0.M();
                if(((o)t0).c2() && (t1 instanceof y || t1 instanceof o && !((o)t1).e.k()) && !y.C0(this.a)) {
                    this.a.append(' ');
                }
            }
        }

        @Override  // org.jsoup.select.l
        public void b(t t0, int v) {
            if(t0 instanceof y) {
                o.H0(this.a, ((y)t0));
                return;
            }
            if(t0 instanceof o && this.a.length() > 0 && (((o)t0).c2() || ((o)t0).L("br")) && !y.C0(this.a)) {
                this.a.append(' ');
            }
        }
    }

    private q e;
    private WeakReference f;
    List g;
    org.jsoup.nodes.b h;
    private static final List i;
    private static final Pattern j;
    private static final String k;

    static {
        o.i = Collections.emptyList();
        o.j = Pattern.compile("\\s+");
        o.k = '/' + "baseUri";
    }

    public o(String s) {
        this(q.I(s, "http://www.w3.org/1999/xhtml", f.d), "", null);
    }

    public o(String s, String s1) {
        this(q.I(s, s1, f.d), null);
    }

    public o(q q0, String s) {
        this(q0, s, null);
    }

    public o(q q0, String s, org.jsoup.nodes.b b0) {
        i.o(q0);
        this.g = t.c;
        this.h = b0;
        this.e = q0;
        if(s != null) {
            this.k0(s);
        }
    }

    public o A0(String s) {
        return (o)super.e(s);
    }

    public e A1(String s, String s1) {
        try {
            return this.B1(s, Pattern.compile(s1));
        }
        catch(PatternSyntaxException patternSyntaxException0) {
            throw new IllegalArgumentException("Pattern syntax error: " + s1, patternSyntaxException0);
        }
    }

    public o A2(String s) {
        return (o)super.e0(s);
    }

    @Override  // org.jsoup.nodes.t
    public t B(Consumer consumer0) {
        return this.s1(consumer0);
    }

    public o B0(t t0) {
        return (o)super.f(t0);
    }

    public e B1(String s, Pattern pattern0) {
        return org.jsoup.select.b.a(new h(s, pattern0), this);
    }

    public o B2(String s) {
        i.o(s);
        Set set0 = this.V0();
        set0.remove(s);
        this.W0(set0);
        return this;
    }

    public o C0(String s) {
        i.o(s);
        this.c(((t[])v.b(this).m(s, this, "").toArray(new t[0])));
        return this;
    }

    public e C1(String s, String s1) {
        return org.jsoup.select.b.a(new org.jsoup.select.g.i(s, s1), this);
    }

    public o C2() {
        return (o)super.j0();
    }

    public o D0(t t0) {
        i.o(t0);
        this.g0(t0);
        this.y();
        this.g.add(t0);
        t0.m0(this.g.size() - 1);
        return this;
    }

    public e D1(String s, String s1) {
        return org.jsoup.select.b.a(new j(s, s1), this);
    }

    private static String D2(o o0, String s) {
        while(o0 != null) {
            if(o0.h != null && o0.h.y(s)) {
                return o0.h.r(s);
            }
            o0 = o0.p2();
        }
        return "";
    }

    @Override  // org.jsoup.nodes.t
    protected boolean E() {
        return this.h != null;
    }

    public o E0(Collection collection0) {
        this.Y1(-1, collection0);
        return this;
    }

    public e E1(String s) {
        i.l(s);
        return org.jsoup.select.b.a(new k(s), this);
    }

    public e E2(String s) {
        return n.c(s, this);
    }

    public o F0(String s) {
        return this.G0(s, this.e.C());
    }

    public e F1(int v) {
        return org.jsoup.select.b.a(new s(v), this);
    }

    public e F2(g g0) {
        return n.d(g0, this);
    }

    public o G0(String s, String s1) {
        o o0 = new o(q.I(s, s1, v.b(this).t()), "");
        this.D0(o0);
        return o0;
    }

    public e G1(int v) {
        return org.jsoup.select.b.a(new u(v), this);
    }

    public o G2(String s) {
        return n.e(s, this);
    }

    @Override  // org.jsoup.nodes.t
    public Appendable H(Appendable appendable0) {
        int v = this.g.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((t)this.g.get(v1)).T(appendable0);
        }
        return appendable0;
    }

    private static void H0(StringBuilder stringBuilder0, y y0) {
        String s = y0.A0();
        if(!o.x2(y0.a) && !(y0 instanceof c)) {
            org.jsoup.internal.n.c(stringBuilder0, s, y.C0(stringBuilder0));
            return;
        }
        stringBuilder0.append(s);
    }

    public e H1(int v) {
        return org.jsoup.select.b.a(new org.jsoup.select.g.v(v), this);
    }

    public o H2(g g0) {
        return org.jsoup.select.b.b(g0, this);
    }

    public o I0(String s) {
        i.o(s);
        this.D0(new y(s));
        return this;
    }

    public e I1(String s) {
        i.l(s);
        return org.jsoup.select.b.a(new N(org.jsoup.internal.g.b(s)), this);
    }

    public List I2(String s, Class class0) {
        return v.c(s, this, class0);
    }

    public o J0(o o0) {
        i.o(o0);
        o0.D0(this);
        return this;
    }

    public e J1(String s) {
        return org.jsoup.select.b.a(new m(s), this);
    }

    public e J2(String s) {
        return new e(v.c(s, this, o.class));
    }

    private static void K0(t t0, StringBuilder stringBuilder0) {
        if(t0 instanceof y) {
            stringBuilder0.append(((y)t0).A0());
            return;
        }
        if(t0.L("br")) {
            stringBuilder0.append("\n");
        }
    }

    public e K1(String s) {
        return org.jsoup.select.b.a(new org.jsoup.select.g.n(s), this);
    }

    public o K2() {
        org.jsoup.nodes.b b0 = null;
        q q0 = this.e;
        org.jsoup.nodes.b b1 = this.h;
        if(b1 != null) {
            b0 = b1.n();
        }
        return new o(q0, null, b0);
    }

    public o L0(String s, String s1) {
        super.h(s, s1);
        return this;
    }

    public e L1(String s) {
        try {
            return this.M1(Pattern.compile(s));
        }
        catch(PatternSyntaxException patternSyntaxException0) {
            throw new IllegalArgumentException("Pattern syntax error: " + s, patternSyntaxException0);
        }
    }

    // 去混淆评级： 低(40)
    boolean L2(org.jsoup.nodes.f.a f$a0) {
        return f$a0.q() && this.d2(f$a0) && !this.e2(f$a0) && !o.x2(this.a);
    }

    public o M0(String s, boolean z) {
        this.j().I(s, z);
        return this;
    }

    public e M1(Pattern pattern0) {
        return org.jsoup.select.b.a(new K(pattern0), this);
    }

    public e M2() {
        if(this.a == null) {
            return new e(0);
        }
        List list0 = this.p2().R0();
        e e0 = new e(list0.size() - 1);
        for(Object object0: list0) {
            o o0 = (o)object0;
            if(o0 != this) {
                e0.add(o0);
            }
        }
        return e0;
    }

    @Override  // org.jsoup.nodes.t
    public String N() {
        return this.e.l();
    }

    // 去混淆评级： 低(20)
    public org.jsoup.nodes.a N0(String s) {
        return this.E() ? this.j().k(s) : null;
    }

    public Stream N2() {
        return v.e(this, o.class);
    }

    public o O0(String s) {
        return (o)super.m(s);
    }

    public e O1(String s) {
        try {
            return this.P1(Pattern.compile(s));
        }
        catch(PatternSyntaxException patternSyntaxException0) {
            throw new IllegalArgumentException("Pattern syntax error: " + s, patternSyntaxException0);
        }
    }

    public q O2() {
        return this.e;
    }

    public o P0(t t0) {
        return (o)super.n(t0);
    }

    public e P1(Pattern pattern0) {
        return org.jsoup.select.b.a(new J(pattern0), this);
    }

    public String P2() {
        return this.e.l();
    }

    @Override  // org.jsoup.nodes.t
    void Q() {
        super.Q();
        this.f = null;
    }

    public o Q0(int v) {
        return (o)this.R0().get(v);
    }

    protected boolean Q1() {
        return this.g != t.c;
    }

    public o Q2(String s) {
        return this.R2(s, this.e.C());
    }

    @Override  // org.jsoup.nodes.t
    public String R() {
        return this.e.D();
    }

    List R0() {
        if(this.p() == 0) {
            return o.i;
        }
        WeakReference weakReference0 = this.f;
        if(weakReference0 != null) {
            List list0 = (List)weakReference0.get();
            if(list0 != null) {
                return list0;
            }
        }
        int v = this.g.size();
        ArrayList arrayList0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            t t0 = (t)this.g.get(v1);
            if(t0 instanceof o) {
                arrayList0.add(((o)t0));
            }
        }
        this.f = new WeakReference(arrayList0);
        return arrayList0;
    }

    public boolean R1(String s) {
        if(this.h == null) {
            return false;
        }
        s.length();
        return false;
    }

    public o R2(String s, String s1) {
        i.n(s, "tagName");
        i.n(s1, "namespace");
        this.e = q.I(s, s1, v.b(this).t());
        return this;
    }

    public e S0() {
        return new e(this.R0());
    }

    public boolean S1() {
        AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
        this.n1(new org.jsoup.nodes.m(atomicBoolean0));
        return atomicBoolean0.get();
    }

    public String S2() {
        StringBuilder stringBuilder0 = org.jsoup.internal.n.d();
        org.jsoup.select.j.c(new org.jsoup.nodes.o.b(stringBuilder0), this);
        return org.jsoup.internal.n.v(stringBuilder0).trim();
    }

    public int T0() {
        return this.R0().size();
    }

    public String T1() {
        StringBuilder stringBuilder0 = org.jsoup.internal.n.d();
        this.H(stringBuilder0);
        String s = org.jsoup.internal.n.v(stringBuilder0);
        return v.a(this).q() ? s.trim() : s;
    }

    public o T2(String s) {
        i.o(s);
        this.j1();
        org.jsoup.nodes.f f0 = this.W();
        if(f0 != null && f0.v3().e(this.R())) {
            this.D0(new org.jsoup.nodes.e(s));
            return this;
        }
        this.D0(new y(s));
        return this;
    }

    @Override  // org.jsoup.nodes.t
    void U(Appendable appendable0, int v, org.jsoup.nodes.f.a f$a0) throws IOException {
        if(this.L2(f$a0)) {
            if(!(appendable0 instanceof StringBuilder)) {
                this.I(appendable0, v, f$a0);
            }
            else if(((StringBuilder)appendable0).length() > 0) {
                this.I(appendable0, v, f$a0);
            }
        }
        appendable0.append('<').append(this.P2());
        org.jsoup.nodes.b b0 = this.h;
        if(b0 != null) {
            b0.B(appendable0, f$a0);
        }
        if(this.g.isEmpty() && this.e.t()) {
            if(f$a0.r() == org.jsoup.nodes.f.a.a.a && this.e.n()) {
                appendable0.append('>');
                return;
            }
            appendable0.append(" />");
            return;
        }
        appendable0.append('>');
    }

    public String U0() {
        return this.g("class").trim();
    }

    public o U1(String s) {
        this.j1();
        this.C0(s);
        return this;
    }

    public List U2() {
        return this.o1(y.class);
    }

    @Override  // org.jsoup.nodes.t
    void V(Appendable appendable0, int v, org.jsoup.nodes.f.a f$a0) throws IOException {
        if(!this.g.isEmpty() || !this.e.t()) {
            if(f$a0.q() && !this.g.isEmpty() && (this.e.k() && !o.x2(this.a) || f$a0.n() && (this.g.size() > 1 || this.g.size() == 1 && this.g.get(0) instanceof o))) {
                this.I(appendable0, v, f$a0);
            }
            appendable0.append("</").append(this.P2()).append('>');
        }
    }

    public Set V0() {
        String s = this.U0();
        Set set0 = new LinkedHashSet(Arrays.asList(o.j.split(s)));
        set0.remove("");
        return set0;
    }

    // 去混淆评级： 低(20)
    public String V1() {
        return "";
    }

    public o V2(String s) {
        i.o(s);
        Set set0 = this.V0();
        if(set0.contains(s)) {
            set0.remove(s);
        }
        else {
            set0.add(s);
        }
        this.W0(set0);
        return this;
    }

    public o W0(Set set0) {
        i.o(set0);
        if(set0.isEmpty()) {
            this.j().N("class");
            return this;
        }
        this.j().H("class", org.jsoup.internal.n.m(set0, " "));
        return this;
    }

    public o W1(String s) {
        i.o(s);
        this.L0("id", s);
        return this;
    }

    public o W2(l l0) {
        return (o)super.r0(l0);
    }

    @Override  // org.jsoup.nodes.t
    public t X() {
        return this.p2();
    }

    public o X0() {
        if(this.h != null) {
            super.t();
            if(this.h.size() == 0) {
                this.h = null;
            }
        }
        return this;
    }

    private static int X1(o o0, List list0) {
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(list0.get(v1) == o0) {
                return v1;
            }
        }
        return 0;
    }

    // 去混淆评级： 低(20)
    public String X2() {
        return this.h1("textarea", "http://www.w3.org/1999/xhtml") ? this.S2() : this.g("value");
    }

    public o Y0() {
        return (o)super.u();
    }

    public o Y1(int v, Collection collection0) {
        i.p(collection0, "Children collection to be inserted must not be null.");
        int v1 = this.p();
        if(v < 0) {
            v += v1 + 1;
        }
        i.i(v >= 0 && v <= v1, "Insert position out of bounds.");
        this.b(v, ((t[])new ArrayList(collection0).toArray(new t[0])));
        return this;
    }

    public o Y2(String s) {
        if(this.h1("textarea", "http://www.w3.org/1999/xhtml")) {
            this.T2(s);
            return this;
        }
        this.L0("value", s);
        return this;
    }

    public o Z0(String s) {
        return this.a1(org.jsoup.select.m.t(s));
    }

    public o Z1(int v, t[] arr_t) {
        i.p(arr_t, "Children collection to be inserted must not be null.");
        int v1 = this.p();
        if(v < 0) {
            v += v1 + 1;
        }
        i.i(v >= 0 && v <= v1, "Insert position out of bounds.");
        this.b(v, arr_t);
        return this;
    }

    public String Z2() {
        StringBuilder stringBuilder0 = org.jsoup.internal.n.d();
        int v = this.p();
        for(int v1 = 0; v1 < v; ++v1) {
            o.K0(((t)this.g.get(v1)), stringBuilder0);
        }
        return org.jsoup.internal.n.v(stringBuilder0);
    }

    public o a1(g g0) {
        i.o(g0);
        o o0 = this.C2();
        o o1 = this;
        do {
            if(g0.e(o0, o1)) {
                return o1;
            }
            o1 = o1.p2();
        }
        while(o1 != null);
        return null;
    }

    public boolean a2(String s) {
        return this.b2(org.jsoup.select.m.t(s));
    }

    public String a3() {
        StringBuilder stringBuilder0 = org.jsoup.internal.n.d();
        this.O().forEach((t t0) -> o.K0(t0, stringBuilder0));
        return org.jsoup.internal.n.v(stringBuilder0);
    }

    public String b1() {
        if(this.V1().length() > 0) {
            String s = "#" + org.jsoup.parser.s.p(this.V1());
            org.jsoup.nodes.f f0 = this.W();
            if(f0 == null) {
                return s;
            }
            e e0 = f0.E2(s);
            if(e0.size() == 1 && e0.get(0) == this) {
                return s;
            }
        }
        StringBuilder stringBuilder0 = org.jsoup.internal.n.d();
        for(o o0 = this; o0 != null && !(o0 instanceof org.jsoup.nodes.f); o0 = o0.p2()) {
            stringBuilder0.insert(0, o0.c1());
        }
        return org.jsoup.internal.n.v(stringBuilder0);
    }

    public boolean b2(g g0) {
        return g0.e(this.C2(), this);
    }

    public o b3(String s) {
        return (o)super.t0(s);
    }

    private String c1() {
        String s = org.jsoup.parser.s.p(this.P2()).replace("\\:", "|");
        StringBuilder stringBuilder0 = org.jsoup.internal.n.d();
        stringBuilder0.append(s);
        String s1 = (String)Collection.-EL.stream(this.V0()).map(new org.jsoup.nodes.n()).collect(org.jsoup.internal.n.p("."));
        if(!s1.isEmpty()) {
            stringBuilder0.append('.');
            stringBuilder0.append(s1);
        }
        if(this.p2() != null && !(this.p2() instanceof org.jsoup.nodes.f)) {
            stringBuilder0.insert(0, " > ");
            if(this.p2().E2(stringBuilder0.toString()).size() > 1) {
                stringBuilder0.append(String.format(":nth-child(%d)", ((int)(this.i1() + 1))));
            }
            return org.jsoup.internal.n.v(stringBuilder0);
        }
        return org.jsoup.internal.n.v(stringBuilder0);
    }

    public boolean c2() {
        return this.e.m();
    }

    @Override  // org.jsoup.nodes.t
    public Object clone() throws CloneNotSupportedException {
        return this.Y0();
    }

    public String d1() {
        StringBuilder stringBuilder0 = org.jsoup.internal.n.d();
        this.W2(new org.jsoup.nodes.k(stringBuilder0));
        return org.jsoup.internal.n.v(stringBuilder0);
    }

    // 去混淆评级： 低(40)
    private boolean d2(org.jsoup.nodes.f.a f$a0) {
        return this.e.m() || this.p2() != null && this.p2().O2().k() || f$a0.n();
    }

    @Override  // org.jsoup.nodes.t
    public t e(String s) {
        return this.A0(s);
    }

    @Override  // org.jsoup.nodes.t
    public t e0(String s) {
        return this.A2(s);
    }

    public List e1() {
        return this.o1(org.jsoup.nodes.e.class);
    }

    // 去混淆评级： 中等(60)
    private boolean e2(org.jsoup.nodes.f.a f$a0) {
        return this.e.q() ? (this.p2() == null || this.p2().c2()) && !this.J() && !f$a0.n() && !this.L("br") : false;
    }

    @Override  // org.jsoup.nodes.t
    public t f(t t0) {
        return this.B0(t0);
    }

    public Map f1() {
        return this.j().p();
    }

    private static void f2(StringBuilder stringBuilder0, t t0, int v) {
        if(t0 instanceof org.jsoup.nodes.e) {
            stringBuilder0.append(((org.jsoup.nodes.e)t0).z0());
            return;
        }
        if(t0 instanceof d) {
            stringBuilder0.append(((d)t0).A0());
            return;
        }
        if(t0 instanceof c) {
            stringBuilder0.append(((c)t0).A0());
        }
    }

    protected o g1(t t0) {
        o o0 = (o)super.v(t0);
        o0.h = this.h == null ? null : this.h.n();
        a o$a0 = new a(o0, this.g.size());
        o0.g = o$a0;
        o$a0.addAll(this.g);
        return o0;
    }

    private static org.jsoup.select.i.a g2(AtomicBoolean atomicBoolean0, t t0, int v) {
        if(t0 instanceof y && !((y)t0).B0()) {
            atomicBoolean0.set(true);
            return org.jsoup.select.i.a.e;
        }
        return org.jsoup.select.i.a.a;
    }

    @Override  // org.jsoup.nodes.t
    public t h(String s, String s1) {
        return this.L0(s, s1);
    }

    // 去混淆评级： 低(20)
    public boolean h1(String s, String s1) {
        return this.e.D().equals(s) && this.e.C().equals(s1);
    }

    // 检测为 Lambda 实现
    private static void h2(StringBuilder stringBuilder0, t t0) [...]

    public int i1() {
        return this.p2() == null ? 0 : o.X1(this, this.p2().R0());
    }

    public o i2() {
        for(t t0 = this.K(); t0 != null; t0 = t0.b0()) {
            if(t0 instanceof o) {
                return (o)t0;
            }
        }
        return null;
    }

    @Override  // org.jsoup.nodes.t
    public org.jsoup.nodes.b j() {
        if(this.h == null) {
            this.h = new org.jsoup.nodes.b();
        }
        return this.h;
    }

    @Override  // org.jsoup.nodes.t
    public t j0() {
        return this.C2();
    }

    public o j1() {
        for(Object object0: this.g) {
            ((t)object0).a = null;
        }
        this.g.clear();
        return this;
    }

    public o j2() {
        return this.p2() == null ? this : this.p2().i2();
    }

    public x k1() {
        return x.f(this, false);
    }

    public o k2() {
        t t0 = this;
        while(true) {
            t0 = t0.M();
            if(t0 == null) {
                break;
            }
            if(t0 instanceof o) {
                return (o)t0;
            }
        }
        return null;
    }

    @Override  // org.jsoup.nodes.t
    public String l() [...] // 潜在的解密器

    public e l2() {
        return this.m2(true);
    }

    @Override  // org.jsoup.nodes.t
    public t m(String s) {
        return this.O0(s);
    }

    public o m1(String s) {
        o o0 = n.e(s, this);
        return this.p2() == null ? ((o)i.c(o0, "No elements matched the query \'%s\' in the document.", new Object[]{s, this.P2()})) : ((o)i.c(o0, "No elements matched the query \'%s\' on element \'%s\'.", new Object[]{s, this.P2()}));
    }

    private e m2(boolean z) {
        e e0 = new e();
        if(this.a == null) {
            return e0;
        }
        e0.add(this);
        return z ? e0.H() : e0.Q();
    }

    @Override  // org.jsoup.nodes.t
    public t n(t t0) {
        return this.P0(t0);
    }

    @Override  // org.jsoup.nodes.t
    public t n0() {
        return this.K2();
    }

    public o n1(org.jsoup.select.i i0) {
        return (o)super.z(i0);
    }

    public String n2() {
        StringBuilder stringBuilder0 = org.jsoup.internal.n.d();
        this.o2(stringBuilder0);
        return org.jsoup.internal.n.v(stringBuilder0).trim();
    }

    private List o1(Class class0) {
        Stream stream0 = Collection.-EL.stream(this.g);
        Objects.requireNonNull(class0);
        return (List)stream0.filter(new org.jsoup.nodes.h(class0)).map(new org.jsoup.nodes.i(class0)).collect(Collectors.collectingAndThen(Collectors.toList(), new org.jsoup.nodes.j()));
    }

    private void o2(StringBuilder stringBuilder0) {
        for(int v = 0; v < this.p(); ++v) {
            t t0 = (t)this.g.get(v);
            if(t0 instanceof y) {
                o.H0(stringBuilder0, ((y)t0));
            }
            else if(t0.L("br") && !y.C0(stringBuilder0)) {
                stringBuilder0.append(" ");
            }
        }
    }

    @Override  // org.jsoup.nodes.t
    public int p() {
        return this.g.size();
    }

    public o p1() {
        for(t t0 = this.A(); t0 != null; t0 = t0.M()) {
            if(t0 instanceof o) {
                return (o)t0;
            }
        }
        return null;
    }

    public final o p2() {
        return (o)this.a;
    }

    public o q1() {
        return this.p2() == null ? this : this.p2().p1();
    }

    public e q2() {
        e e0 = new e();
        for(o o0 = this.p2(); o0 != null && !o0.L("#root"); o0 = o0.p2()) {
            e0.add(o0);
        }
        return e0;
    }

    @Override  // org.jsoup.nodes.t
    public t r0(l l0) {
        return this.W2(l0);
    }

    @Deprecated
    public o r1(Consumer consumer0) {
        this.N2().forEach(consumer0);
        return this;
    }

    public o r2(String s) {
        i.o(s);
        this.b(0, ((t[])v.b(this).m(s, this, "").toArray(new t[0])));
        return this;
    }

    public o s1(Consumer consumer0) {
        return (o)super.B(consumer0);
    }

    public o s2(t t0) {
        i.o(t0);
        this.b(0, new t[]{t0});
        return this;
    }

    @Override  // org.jsoup.nodes.t
    public t t() {
        return this.X0();
    }

    @Override  // org.jsoup.nodes.t
    public t t0(String s) {
        return this.b3(s);
    }

    public e t1() {
        return org.jsoup.select.b.a(new org.jsoup.select.g.a(), this);
    }

    public o t2(Collection collection0) {
        this.Y1(0, collection0);
        return this;
    }

    @Override  // org.jsoup.nodes.t
    public t u() {
        return this.Y0();
    }

    public o u1(String s) {
        i.l(s);
        e e0 = org.jsoup.select.b.a(new r(s), this);
        return e0.size() <= 0 ? null : ((o)e0.get(0));
    }

    public o u2(String s) {
        return this.v2(s, this.e.C());
    }

    @Override  // org.jsoup.nodes.t
    protected t v(t t0) {
        return this.g1(t0);
    }

    public e v1(String s) {
        i.l(s);
        return org.jsoup.select.b.a(new org.jsoup.select.g.b(s.trim()), this);
    }

    public o v2(String s, String s1) {
        o o0 = new o(q.I(s, s1, v.b(this).t()), "");
        this.s2(o0);
        return o0;
    }

    @Override  // org.jsoup.nodes.t
    protected void w(String s) {
        this.j().H("/baseUri", s);
    }

    public e w1(String s) {
        i.l(s);
        return org.jsoup.select.b.a(new org.jsoup.select.g.d(s.trim()), this);
    }

    public o w2(String s) {
        i.o(s);
        this.s2(new y(s));
        return this;
    }

    @Override  // org.jsoup.nodes.t
    public t x() {
        return this.j1();
    }

    public e x1(String s, String s1) {
        return org.jsoup.select.b.a(new org.jsoup.select.g.e(s, s1), this);
    }

    static boolean x2(t t0) {
        if(t0 instanceof o) {
            o o0 = (o)t0;
            int v = 0;
            while(true) {
                if(o0.e.E()) {
                    return true;
                }
                o0 = o0.p2();
                ++v;
                if(v >= 6 || o0 == null) {
                    break;
                }
            }
        }
        return false;
    }

    @Override  // org.jsoup.nodes.t
    protected List y() {
        if(this.g == t.c) {
            this.g = new a(this, 4);
        }
        return this.g;
    }

    public e y1(String s, String s1) {
        return org.jsoup.select.b.a(new org.jsoup.select.g.f(s, s1), this);
    }

    public o y2() {
        t t0 = this;
        while(true) {
            t0 = t0.b0();
            if(t0 == null) {
                break;
            }
            if(t0 instanceof o) {
                return (o)t0;
            }
        }
        return null;
    }

    @Override  // org.jsoup.nodes.t
    public t z(org.jsoup.select.i i0) {
        return this.n1(i0);
    }

    public o z0(String s) {
        i.o(s);
        Set set0 = this.V0();
        set0.add(s);
        this.W0(set0);
        return this;
    }

    public e z1(String s, String s1) {
        return org.jsoup.select.b.a(new org.jsoup.select.g.g(s, s1), this);
    }

    public e z2() {
        return this.m2(false);
    }
}

