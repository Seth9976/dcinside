package kotlinx.serialization.json.internal;

import kotlin.N0;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlin.z0;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.descriptors.j;
import kotlinx.serialization.descriptors.k.c;
import kotlinx.serialization.encoding.g;
import kotlinx.serialization.f;
import kotlinx.serialization.internal.m0;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.h;
import kotlinx.serialization.json.n;
import kotlinx.serialization.json.o;
import kotlinx.serialization.json.q;
import kotlinx.serialization.json.t;
import y4.l;
import y4.m;

@f
abstract class d extends m0 implements q {
    @l
    private final b b;
    @l
    private final Function1 c;
    @l
    @z3.f
    protected final h d;
    @m
    private String e;

    private d(b b0, Function1 function10) {
        this.b = b0;
        this.c = function10;
        this.d = b0.h();
    }

    public d(b b0, Function1 function10, w w0) {
        this(b0, function10);
    }

    @Override  // kotlinx.serialization.internal.Q0, kotlinx.serialization.encoding.g
    public void C() {
        String s = (String)this.Z();
        if(s == null) {
            this.c.invoke(kotlinx.serialization.json.w.c);
            return;
        }
        this.r0(s);
    }

    @Override  // kotlinx.serialization.internal.Q0, kotlinx.serialization.encoding.g
    public void F() {
    }

    @Override  // kotlinx.serialization.internal.Q0
    public void J(Object object0, boolean z) {
        this.i0(((String)object0), z);
    }

    @Override  // kotlinx.serialization.internal.Q0
    public void K(Object object0, byte b) {
        this.j0(((String)object0), b);
    }

    @Override  // kotlinx.serialization.internal.Q0
    public void L(Object object0, char c) {
        this.k0(((String)object0), c);
    }

    @Override  // kotlinx.serialization.internal.Q0
    public void M(Object object0, double f) {
        this.l0(((String)object0), f);
    }

    @Override  // kotlinx.serialization.internal.Q0
    public void N(Object object0, kotlinx.serialization.descriptors.f f0, int v) {
        this.m0(((String)object0), f0, v);
    }

    @Override  // kotlinx.serialization.internal.Q0
    public void O(Object object0, float f) {
        this.n0(((String)object0), f);
    }

    @Override  // kotlinx.serialization.internal.Q0
    public g P(Object object0, kotlinx.serialization.descriptors.f f0) {
        return this.o0(((String)object0), f0);
    }

    @Override  // kotlinx.serialization.internal.Q0
    public void Q(Object object0, int v) {
        this.p0(((String)object0), v);
    }

    @Override  // kotlinx.serialization.internal.Q0
    public void R(Object object0, long v) {
        this.q0(((String)object0), v);
    }

    @Override  // kotlinx.serialization.internal.Q0
    public void T(Object object0) {
        this.r0(((String)object0));
    }

    @Override  // kotlinx.serialization.internal.Q0
    public void U(Object object0, short v) {
        this.s0(((String)object0), v);
    }

    @Override  // kotlinx.serialization.internal.Q0
    public void V(Object object0, String s) {
        this.t0(((String)object0), s);
    }

    @Override  // kotlinx.serialization.internal.Q0
    public void W(Object object0, Object object1) {
        this.u0(((String)object0), object1);
    }

    @Override  // kotlinx.serialization.internal.Q0
    protected void X(@l kotlinx.serialization.descriptors.f f0) {
        L.p(f0, "descriptor");
        kotlinx.serialization.json.l l0 = this.v0();
        this.c.invoke(l0);
    }

    @Override  // kotlinx.serialization.internal.Q0, kotlinx.serialization.encoding.g, kotlinx.serialization.encoding.d
    @l
    public final kotlinx.serialization.modules.f a() {
        return this.b.a();
    }

    @Override  // kotlinx.serialization.internal.Q0, kotlinx.serialization.encoding.g
    @l
    public kotlinx.serialization.encoding.d b(@l kotlinx.serialization.descriptors.f f0) {
        static final class a extends N implements Function1 {
            final d e;

            a(d d0) {
                this.e = d0;
                super(1);
            }

            public final void a(@l kotlinx.serialization.json.l l0) {
                L.p(l0, "node");
                String s = d.h0(this.e);
                this.e.w0(s, l0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((kotlinx.serialization.json.l)object0));
                return S0.a;
            }
        }

        kotlinx.serialization.encoding.d d0;
        L.p(f0, "descriptor");
        Function1 function10 = this.Z() == null ? this.c : new a(this);
        j j0 = f0.getKind();
        if((L.g(j0, kotlinx.serialization.descriptors.k.b.a) ? true : j0 instanceof kotlinx.serialization.descriptors.d)) {
            d0 = new U(this.b, function10);
        }
        else if(L.g(j0, c.a)) {
            b b0 = this.b;
            kotlinx.serialization.descriptors.f f1 = o0.a(f0.d(0), b0.a());
            j j1 = f1.getKind();
            if(j1 instanceof e || L.g(j1, kotlinx.serialization.descriptors.j.b.a)) {
                d0 = new W(this.b, function10);
            }
            else {
                if(!b0.h().b()) {
                    throw E.d(f1);
                }
                d0 = new U(this.b, function10);
            }
        }
        else {
            d0 = new S(this.b, function10);
        }
        String s = this.e;
        if(s != null) {
            L.m(s);
            ((d)d0).w0(s, n.d(f0.h()));
            this.e = null;
        }
        return d0;
    }

    @Override  // kotlinx.serialization.json.q
    @l
    public final b d() {
        return this.b;
    }

    @Override  // kotlinx.serialization.internal.m0
    @l
    protected String d0(@l String s, @l String s1) {
        L.p(s, "parentName");
        L.p(s1, "childName");
        return s1;
    }

    @Override  // kotlinx.serialization.internal.Q0, kotlinx.serialization.encoding.g
    public void e(@l kotlinx.serialization.w w0, Object object0) {
        L.p(w0, "serializer");
        if(this.Z() == null && kotlinx.serialization.json.internal.m0.c(o0.a(w0.getDescriptor(), this.a()))) {
            M m0 = new M(this.b, this.c);
            m0.e(w0, object0);
            m0.X(w0.getDescriptor());
            return;
        }
        if(w0 instanceof kotlinx.serialization.internal.b && !this.d().h().m()) {
            String s = Z.c(w0.getDescriptor(), this.d());
            L.n(object0, "null cannot be cast to non-null type kotlin.Any");
            kotlinx.serialization.w w1 = kotlinx.serialization.n.b(((kotlinx.serialization.internal.b)w0), this, object0);
            Z.g(((kotlinx.serialization.internal.b)w0), w1, s);
            Z.b(w1.getDescriptor().getKind());
            this.e = s;
            w1.serialize(this, object0);
            return;
        }
        w0.serialize(this, object0);
    }

    public static final String h0(d d0) {
        return (String)d0.Y();
    }

    protected void i0(@l String s, boolean z) {
        L.p(s, "tag");
        this.w0(s, n.b(Boolean.valueOf(z)));
    }

    protected void j0(@l String s, byte b) {
        L.p(s, "tag");
        this.w0(s, n.c(b));
    }

    protected void k0(@l String s, char c) {
        L.p(s, "tag");
        this.w0(s, n.d(String.valueOf(c)));
    }

    protected void l0(@l String s, double f) {
        L.p(s, "tag");
        this.w0(s, n.c(f));
        if(!this.d.a() && (Double.isInfinite(f) || Double.isNaN(f))) {
            throw E.c(f, s, this.v0().toString());
        }
    }

    protected void m0(@l String s, @l kotlinx.serialization.descriptors.f f0, int v) {
        L.p(s, "tag");
        L.p(f0, "enumDescriptor");
        this.w0(s, n.d(f0.f(v)));
    }

    protected void n0(@l String s, float f) {
        L.p(s, "tag");
        this.w0(s, n.c(f));
        if(!this.d.a() && (Float.isInfinite(f) || Float.isNaN(f))) {
            throw E.c(f, s, this.v0().toString());
        }
    }

    @k0
    @l
    protected g o0(@l String s, @l kotlinx.serialization.descriptors.f f0) {
        public static final class kotlinx.serialization.json.internal.d.b extends kotlinx.serialization.encoding.b {
            @l
            private final kotlinx.serialization.modules.f a;
            final d b;
            final String c;

            kotlinx.serialization.json.internal.d.b(d d0, String s) {
                this.b = d0;
                this.c = s;
                super();
                this.a = d0.d().a();
            }

            @Override  // kotlinx.serialization.encoding.b
            public void B(long v) {
                this.K(kotlinx.serialization.json.internal.e.a(v));
            }

            public final void K(@l String s) {
                L.p(s, "s");
                t t0 = new t(s, false);
                this.b.w0(this.c, t0);
            }

            @Override  // kotlinx.serialization.encoding.g, kotlinx.serialization.encoding.d
            @l
            public kotlinx.serialization.modules.f a() {
                return this.a;
            }

            @Override  // kotlinx.serialization.encoding.b
            public void f(byte b) {
                this.K(z0.e0(b));
            }

            @Override  // kotlinx.serialization.encoding.b
            public void k(short v) {
                this.K(N0.e0(v));
            }

            @Override  // kotlinx.serialization.encoding.b
            public void s(int v) {
                this.K(kotlinx.serialization.json.internal.f.a(v));
            }
        }

        L.p(s, "tag");
        L.p(f0, "inlineDescriptor");
        return h0.b(f0) ? new kotlinx.serialization.json.internal.d.b(this, s) : super.P(s, f0);
    }

    protected void p0(@l String s, int v) {
        L.p(s, "tag");
        this.w0(s, n.c(v));
    }

    @Override  // kotlinx.serialization.internal.Q0, kotlinx.serialization.encoding.d
    public boolean q(@l kotlinx.serialization.descriptors.f f0, int v) {
        L.p(f0, "descriptor");
        return this.d.e();
    }

    protected void q0(@l String s, long v) {
        L.p(s, "tag");
        this.w0(s, n.c(v));
    }

    @Override  // kotlinx.serialization.json.q
    public void r(@l kotlinx.serialization.json.l l0) {
        L.p(l0, "element");
        this.e(o.a, l0);
    }

    protected void r0(@l String s) {
        L.p(s, "tag");
        this.w0(s, kotlinx.serialization.json.w.c);
    }

    protected void s0(@l String s, short v) {
        L.p(s, "tag");
        this.w0(s, n.c(v));
    }

    protected void t0(@l String s, @l String s1) {
        L.p(s, "tag");
        L.p(s1, "value");
        this.w0(s, n.d(s1));
    }

    protected void u0(@l String s, @l Object object0) {
        L.p(s, "tag");
        L.p(object0, "value");
        this.w0(s, n.d(object0.toString()));
    }

    @l
    public abstract kotlinx.serialization.json.l v0();

    public abstract void w0(@l String arg1, @l kotlinx.serialization.json.l arg2);
}

