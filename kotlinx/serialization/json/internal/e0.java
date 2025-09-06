package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.L;
import kotlin.y;
import kotlinx.serialization.d;
import kotlinx.serialization.encoding.a;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.json.h;
import kotlinx.serialization.json.j;
import kotlinx.serialization.k;
import y4.l;
import y4.m;
import z3.f;

public class e0 extends a implements j {
    public static final class kotlinx.serialization.json.internal.e0.a {
        @m
        @f
        public String a;

        public kotlinx.serialization.json.internal.e0.a(@m String s) {
            this.a = s;
        }
    }

    public final class b {
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
            try {
                arr_v[n0.c.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            b.a = arr_v;
        }
    }

    @l
    private final kotlinx.serialization.json.b d;
    @l
    private final n0 e;
    @l
    @f
    public final kotlinx.serialization.json.internal.a f;
    @l
    private final kotlinx.serialization.modules.f g;
    private int h;
    @m
    private kotlinx.serialization.json.internal.e0.a i;
    @l
    private final h j;
    @m
    private final B k;

    public e0(@l kotlinx.serialization.json.b b0, @l n0 n00, @l kotlinx.serialization.json.internal.a a0, @l kotlinx.serialization.descriptors.f f0, @m kotlinx.serialization.json.internal.e0.a e0$a0) {
        L.p(b0, "json");
        L.p(n00, "mode");
        L.p(a0, "lexer");
        L.p(f0, "descriptor");
        super();
        this.d = b0;
        this.e = n00;
        this.f = a0;
        this.g = b0.a();
        this.h = -1;
        this.i = e0$a0;
        h h0 = b0.h();
        this.j = h0;
        this.k = h0.f() ? null : new B(f0);
    }

    // 去混淆评级： 低(20)
    @Override  // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public boolean A() {
        return this.j.n() ? this.f.i() : this.f.g();
    }

    // 去混淆评级： 低(20)
    @Override  // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public boolean D() {
        return !(this.k == null ? false : this.k.b()) && this.f.S();
    }

    @Override  // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public Object G(@l d d0) {
        L.p(d0, "deserializer");
        try {
            if(d0 instanceof kotlinx.serialization.internal.b && !this.d.h().m()) {
                String s = Z.c(d0.getDescriptor(), this.d);
                String s1 = this.f.l(s, this.j.n());
                d d1 = s1 == null ? null : ((kotlinx.serialization.internal.b)d0).c(this, s1);
                if(d1 == null) {
                    return Z.d(this, d0);
                }
                this.i = new kotlinx.serialization.json.internal.e0.a(s);
                return d1.deserialize(this);
            }
            return d0.deserialize(this);
        }
        catch(k k0) {
        }
        throw new k(k0.a(), k0.getMessage() + " at path: " + "$", k0);
    }

    @Override  // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public byte H() {
        long v = this.f.p();
        if(v == ((long)(((byte)(((int)v)))))) {
            return (byte)(((int)v));
        }
        kotlinx.serialization.json.internal.a.y(this.f, "Failed to parse byte for input \'" + v + '\'', 0, null, 6, null);
        throw new y();
    }

    private final void M() {
        if(this.f.H() != 4) {
            return;
        }
        kotlinx.serialization.json.internal.a.y(this.f, "Unexpected leading comma", 0, null, 6, null);
        throw new y();
    }

    private final boolean N(kotlinx.serialization.descriptors.f f0, int v) {
        kotlinx.serialization.json.b b0 = this.d;
        kotlinx.serialization.descriptors.f f1 = f0.d(v);
        if(f1.b() || this.f.S()) {
            if(L.g(f1.getKind(), kotlinx.serialization.descriptors.j.b.a)) {
                String s = this.f.I(this.j.n());
                if(s != null && J.e(f1, b0, s) == -3) {
                    this.f.q();
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    private final int O() {
        boolean z = this.f.R();
        if(this.f.f()) {
            int v = this.h;
            if(v != -1 && !z) {
                kotlinx.serialization.json.internal.a.y(this.f, "Expected end of the array or comma", 0, null, 6, null);
                throw new y();
            }
            this.h = v + 1;
            return v + 1;
        }
        if(!z) {
            return -1;
        }
        kotlinx.serialization.json.internal.a.y(this.f, "Unexpected trailing comma", 0, null, 6, null);
        throw new y();
    }

    private final int P() {
        int v = this.h;
        boolean z = false;
        boolean z1 = v % 2 != 0;
        if(!z1) {
            this.f.o(':');
        }
        else if(v != -1) {
            z = this.f.R();
        }
        if(this.f.f()) {
            if(z1) {
                if(this.h == -1) {
                    kotlinx.serialization.json.internal.a a0 = this.f;
                    int v1 = a0.a;
                    if(z) {
                        kotlinx.serialization.json.internal.a.y(a0, "Unexpected trailing comma", v1, null, 4, null);
                        throw new y();
                    }
                }
                else {
                    kotlinx.serialization.json.internal.a a1 = this.f;
                    int v2 = a1.a;
                    if(!z) {
                        kotlinx.serialization.json.internal.a.y(a1, "Expected comma after the key-value pair", v2, null, 4, null);
                        throw new y();
                    }
                }
            }
            int v3 = this.h + 1;
            this.h = v3;
            return v3;
        }
        if(!z) {
            return -1;
        }
        kotlinx.serialization.json.internal.a.y(this.f, "Expected \'}\', but had \',\' instead", 0, null, 6, null);
        throw new y();
    }

    private final int Q(kotlinx.serialization.descriptors.f f0) {
        boolean z2;
        boolean z;
        for(z = this.f.R(); this.f.f(); z = z1 ? this.S(s) : z2) {
            String s = this.R();
            this.f.o(':');
            int v = J.e(f0, this.d, s);
            boolean z1 = false;
            if(v == -3) {
                z2 = false;
                z1 = true;
            }
            else {
                if(this.j.d() && this.N(f0, v)) {
                    z2 = this.f.R();
                    continue;
                }
                B b0 = this.k;
                if(b0 != null) {
                    b0.c(v);
                }
                return v;
            }
        }
        if(!z) {
            return this.k == null ? -1 : this.k.d();
        }
        kotlinx.serialization.json.internal.a.y(this.f, "Unexpected trailing comma", 0, null, 6, null);
        throw new y();
    }

    // 去混淆评级： 低(20)
    private final String R() {
        return this.j.n() ? this.f.t() : this.f.k();
    }

    private final boolean S(String s) {
        if(!this.j.h() && !this.U(this.i, s)) {
            this.f.A(s);
            return this.f.R();
        }
        this.f.N(this.j.n());
        return this.f.R();
    }

    private final void T(kotlinx.serialization.descriptors.f f0) {
        while(this.w(f0) != -1) {
        }
    }

    private final boolean U(kotlinx.serialization.json.internal.e0.a e0$a0, String s) {
        if(e0$a0 == null) {
            return false;
        }
        if(L.g(e0$a0.a, s)) {
            e0$a0.a = null;
            return true;
        }
        return false;
    }

    @Override  // kotlinx.serialization.encoding.e, kotlinx.serialization.encoding.c
    @l
    public kotlinx.serialization.modules.f a() {
        return this.g;
    }

    @Override  // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    @l
    public c b(@l kotlinx.serialization.descriptors.f f0) {
        L.p(f0, "descriptor");
        n0 n00 = o0.c(this.d, f0);
        this.f.b.d(f0);
        this.f.o(n00.a);
        this.M();
        switch(n00) {
            case 1: 
            case 2: 
            case 3: {
                return new e0(this.d, n00, this.f, f0, this.i);
            }
            default: {
                return this.e != n00 || !this.d.h().f() ? new e0(this.d, n00, this.f, f0, this.i) : this;
            }
        }
    }

    @Override  // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.c
    public void c(@l kotlinx.serialization.descriptors.f f0) {
        L.p(f0, "descriptor");
        if(this.d.h().h() && f0.e() == 0) {
            this.T(f0);
        }
        this.f.o(this.e.b);
        this.f.b.b();
    }

    @Override  // kotlinx.serialization.json.j
    @l
    public final kotlinx.serialization.json.b d() {
        return this.d;
    }

    @Override  // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    @m
    public Void g() {
        return null;
    }

    @Override  // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public long h() {
        return this.f.p();
    }

    @Override  // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public short m() {
        long v = this.f.p();
        if(v == ((long)(((short)(((int)v)))))) {
            return (short)(((int)v));
        }
        kotlinx.serialization.json.internal.a.y(this.f, "Failed to parse short for input \'" + v + '\'', 0, null, 6, null);
        throw new y();
    }

    @Override  // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public double n() {
        double f;
        kotlinx.serialization.json.internal.a a0 = this.f;
        String s = a0.s();
        try {
            f = Double.parseDouble(s);
        }
        catch(IllegalArgumentException unused_ex) {
            kotlinx.serialization.json.internal.a.y(a0, "Failed to parse type \'double\' for input \'" + s + '\'', 0, null, 6, null);
            throw new y();
        }
        if(!this.d.h().a() && (Double.isInfinite(f) || Double.isNaN(f))) {
            E.j(this.f, f);
            throw new y();
        }
        return f;
    }

    @Override  // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public char o() {
        String s = this.f.s();
        if(s.length() == 1) {
            return s.charAt(0);
        }
        kotlinx.serialization.json.internal.a.y(this.f, "Expected single char, but got \'" + s + '\'', 0, null, 6, null);
        throw new y();
    }

    @Override  // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.c
    public Object p(@l kotlinx.serialization.descriptors.f f0, int v, @l d d0, @m Object object0) {
        L.p(f0, "descriptor");
        L.p(d0, "deserializer");
        boolean z = this.e == n0.e && (v & 1) == 0;
        if(z) {
            this.f.b.e();
        }
        Object object1 = super.p(f0, v, d0, object0);
        if(z) {
            this.f.b.g(object1);
        }
        return object1;
    }

    // 去混淆评级： 低(20)
    @Override  // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    @l
    public String q() {
        return this.j.n() ? this.f.t() : this.f.q();
    }

    @Override  // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public int s(@l kotlinx.serialization.descriptors.f f0) {
        L.p(f0, "enumDescriptor");
        String s = this.q();
        return J.f(f0, this.d, s, " at path $");
    }

    @Override  // kotlinx.serialization.json.j
    @l
    public kotlinx.serialization.json.l t() {
        return new X(this.d.h(), this.f).e();
    }

    @Override  // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public int u() {
        long v = this.f.p();
        if(v == ((long)(((int)v)))) {
            return (int)v;
        }
        kotlinx.serialization.json.internal.a.y(this.f, "Failed to parse int for input \'" + v + '\'', 0, null, 6, null);
        throw new y();
    }

    @Override  // kotlinx.serialization.encoding.c
    public int w(@l kotlinx.serialization.descriptors.f f0) {
        int v;
        L.p(f0, "descriptor");
        switch(b.a[this.e.ordinal()]) {
            case 2: {
                v = this.P();
                break;
            }
            case 4: {
                v = this.Q(f0);
                break;
            }
            default: {
                v = this.O();
            }
        }
        if(this.e != n0.e) {
            this.f.b.h(v);
        }
        return v;
    }

    @Override  // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    @l
    public e x(@l kotlinx.serialization.descriptors.f f0) {
        L.p(f0, "descriptor");
        return h0.b(f0) ? new z(this.f, this.d) : super.x(f0);
    }

    @Override  // kotlinx.serialization.encoding.a, kotlinx.serialization.encoding.e
    public float y() {
        float f;
        kotlinx.serialization.json.internal.a a0 = this.f;
        String s = a0.s();
        try {
            f = Float.parseFloat(s);
        }
        catch(IllegalArgumentException unused_ex) {
            kotlinx.serialization.json.internal.a.y(a0, "Failed to parse type \'float\' for input \'" + s + '\'', 0, null, 6, null);
            throw new y();
        }
        if(!this.d.h().a() && (Float.isInfinite(f) || Float.isNaN(f))) {
            E.j(this.f, f);
            throw new y();
        }
        return f;
    }
}

