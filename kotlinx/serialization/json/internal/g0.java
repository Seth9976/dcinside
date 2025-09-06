package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.L;
import kotlinx.serialization.encoding.b;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.encoding.g;
import kotlinx.serialization.json.h;
import kotlinx.serialization.json.o;
import kotlinx.serialization.json.q;
import kotlinx.serialization.modules.f;
import kotlinx.serialization.n;
import kotlinx.serialization.w;
import y4.l;

public final class g0 extends b implements q {
    public final class a {
        public static final int[] a;

        static {
            int[] arr_v = new int[n0.values().length];
            try {
                arr_v[n0.d.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[n0.e.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[n0.f.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            a.a = arr_v;
        }
    }

    @l
    private final m a;
    @l
    private final kotlinx.serialization.json.b b;
    @l
    private final n0 c;
    @y4.m
    private final q[] d;
    @l
    private final f e;
    @l
    private final h f;
    private boolean g;
    @y4.m
    private String h;

    public g0(@l Y y0, @l kotlinx.serialization.json.b b0, @l n0 n00, @l q[] arr_q) {
        L.p(y0, "output");
        L.p(b0, "json");
        L.p(n00, "mode");
        L.p(arr_q, "modeReuseCache");
        this(v.a(y0, b0), b0, n00, arr_q);
    }

    public g0(@l m m0, @l kotlinx.serialization.json.b b0, @l n0 n00, @y4.m q[] arr_q) {
        L.p(m0, "composer");
        L.p(b0, "json");
        L.p(n00, "mode");
        super();
        this.a = m0;
        this.b = b0;
        this.c = n00;
        this.d = arr_q;
        this.e = this.d().a();
        this.f = this.d().h();
        int v = n00.ordinal();
        if(arr_q != null && (arr_q[v] != null || null != this)) {
            arr_q[v] = this;
        }
    }

    @Override  // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.g
    public void B(long v) {
        if(this.g) {
            this.v(String.valueOf(v));
            return;
        }
        this.a.i(v);
    }

    @Override  // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.g
    public void C() {
        this.a.j("null");
    }

    @Override  // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.g
    public void E(char c) {
        this.v(String.valueOf(c));
    }

    @Override  // kotlinx.serialization.encoding.b
    public boolean I(@l kotlinx.serialization.descriptors.f f0, int v) {
        boolean z = false;
        L.p(f0, "descriptor");
        int v1 = a.a[this.c.ordinal()];
        if(v1 == 1) {
            if(!this.a.a()) {
                this.a.e(',');
            }
            this.a.c();
        }
        else {
            switch(v1) {
                case 2: {
                    if(!this.a.a()) {
                        if(v % 2 == 0) {
                            this.a.e(',');
                            this.a.c();
                            z = true;
                        }
                        else {
                            this.a.e(':');
                            this.a.o();
                        }
                        this.g = z;
                        return true;
                    }
                    this.g = true;
                    this.a.c();
                    return true;
                }
                case 3: {
                    if(v == 0) {
                        this.g = true;
                    }
                    break;
                }
                default: {
                    if(!this.a.a()) {
                        this.a.e(',');
                    }
                    this.a.c();
                    this.v(f0.f(v));
                    this.a.e(':');
                    this.a.o();
                    return true;
                }
            }
            if(v == 1) {
                this.a.e(',');
                this.a.o();
                this.g = false;
                return true;
            }
        }
        return true;
    }

    private final m K() {
        m m0 = this.a;
        return !(m0 instanceof t) ? new t(m0.a, this.g) : m0;
    }

    private final void L(kotlinx.serialization.descriptors.f f0) {
        this.a.c();
        String s = this.h;
        L.m(s);
        this.v(s);
        this.a.e(':');
        this.a.o();
        this.v(f0.h());
    }

    @Override  // kotlinx.serialization.encoding.g, kotlinx.serialization.encoding.d
    @l
    public f a() {
        return this.e;
    }

    @Override  // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.g
    @l
    public d b(@l kotlinx.serialization.descriptors.f f0) {
        L.p(f0, "descriptor");
        n0 n00 = o0.c(this.d(), f0);
        int v = n00.a;
        if(v != 0) {
            this.a.e(((char)v));
            this.a.b();
        }
        if(this.h != null) {
            this.L(f0);
            this.h = null;
        }
        if(this.c == n00) {
            return this;
        }
        q[] arr_q = this.d;
        if(arr_q != null) {
            d d0 = arr_q[n00.ordinal()];
            if(d0 != null) {
                return d0;
            }
        }
        return new g0(this.a, this.d(), n00, this.d);
    }

    @Override  // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.d
    public void c(@l kotlinx.serialization.descriptors.f f0) {
        L.p(f0, "descriptor");
        if(this.c.b != 0) {
            this.a.p();
            this.a.c();
            this.a.e(this.c.b);
        }
    }

    @Override  // kotlinx.serialization.json.q
    @l
    public kotlinx.serialization.json.b d() {
        return this.b;
    }

    @Override  // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.g
    public void e(@l w w0, Object object0) {
        L.p(w0, "serializer");
        if(w0 instanceof kotlinx.serialization.internal.b && !this.d().h().m()) {
            String s = Z.c(w0.getDescriptor(), this.d());
            L.n(object0, "null cannot be cast to non-null type kotlin.Any");
            w w1 = n.b(((kotlinx.serialization.internal.b)w0), this, object0);
            Z.g(((kotlinx.serialization.internal.b)w0), w1, s);
            Z.b(w1.getDescriptor().getKind());
            this.h = s;
            w1.serialize(this, object0);
            return;
        }
        w0.serialize(this, object0);
    }

    @Override  // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.g
    public void f(byte b) {
        if(this.g) {
            this.v(String.valueOf(b));
            return;
        }
        this.a.d(b);
    }

    @Override  // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.g
    public void g(@l kotlinx.serialization.descriptors.f f0, int v) {
        L.p(f0, "enumDescriptor");
        this.v(f0.f(v));
    }

    @Override  // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.g
    @l
    public g h(@l kotlinx.serialization.descriptors.f f0) {
        L.p(f0, "descriptor");
        return h0.b(f0) ? new g0(this.K(), this.d(), this.c, null) : super.h(f0);
    }

    @Override  // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.g
    public void k(short v) {
        if(this.g) {
            this.v(String.valueOf(v));
            return;
        }
        this.a.k(v);
    }

    @Override  // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.g
    public void l(boolean z) {
        if(this.g) {
            this.v(String.valueOf(z));
            return;
        }
        this.a.l(z);
    }

    @Override  // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.g
    public void m(float f) {
        if(this.g) {
            this.v(String.valueOf(f));
        }
        else {
            this.a.g(f);
        }
        if(!this.f.a() && (Float.isInfinite(f) || Float.isNaN(f))) {
            throw E.b(f, this.a.a.toString());
        }
    }

    @Override  // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.d
    public boolean q(@l kotlinx.serialization.descriptors.f f0, int v) {
        L.p(f0, "descriptor");
        return this.f.e();
    }

    @Override  // kotlinx.serialization.json.q
    public void r(@l kotlinx.serialization.json.l l0) {
        L.p(l0, "element");
        this.e(o.a, l0);
    }

    @Override  // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.g
    public void s(int v) {
        if(this.g) {
            this.v(String.valueOf(v));
            return;
        }
        this.a.h(v);
    }

    @Override  // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.g
    public void v(@l String s) {
        L.p(s, "value");
        this.a.m(s);
    }

    @Override  // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.g
    public void x(double f) {
        if(this.g) {
            this.v(String.valueOf(f));
        }
        else {
            this.a.f(f);
        }
        if(!this.f.a() && (Double.isInfinite(f) || Double.isNaN(f))) {
            throw E.b(f, this.a.a.toString());
        }
    }

    @Override  // kotlinx.serialization.encoding.b, kotlinx.serialization.encoding.d
    public void y(@l kotlinx.serialization.descriptors.f f0, int v, @l w w0, @y4.m Object object0) {
        L.p(f0, "descriptor");
        L.p(w0, "serializer");
        if(object0 != null || this.f.f()) {
            super.y(f0, v, w0, object0);
        }
    }
}

