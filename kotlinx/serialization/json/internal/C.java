package kotlinx.serialization.json.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import kotlin.y;
import kotlinx.serialization.d;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.internal.l0;
import kotlinx.serialization.json.B;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.h;
import kotlinx.serialization.json.j;
import kotlinx.serialization.json.n;
import kotlinx.serialization.json.t;
import y4.l;
import y4.m;
import z3.f;

abstract class c extends l0 implements j {
    @l
    private final b f;
    @l
    private final kotlinx.serialization.json.l g;
    @l
    @f
    protected final h h;

    private c(b b0, kotlinx.serialization.json.l l0) {
        this.f = b0;
        this.g = l0;
        this.h = this.d().h();
    }

    public c(b b0, kotlinx.serialization.json.l l0, w w0) {
        this(b0, l0);
    }

    @l
    public kotlinx.serialization.json.l A0() {
        return this.g;
    }

    private final Object B0(B b0, String s, Function1 function10) {
        try {
            Object object0 = function10.invoke(b0);
            if(object0 != null) {
                return object0;
            }
            this.C0(s);
            throw new y();
        }
        catch(IllegalArgumentException unused_ex) {
            this.C0(s);
            throw new y();
        }
    }

    private final Void C0(String s) {
        throw E.f(-1, "Failed to parse \'" + s + '\'', this.l0().toString());
    }

    @Override  // kotlinx.serialization.internal.P0, kotlinx.serialization.encoding.e
    public boolean D() {
        return !(this.l0() instanceof kotlinx.serialization.json.w);
    }

    @Override  // kotlinx.serialization.internal.P0, kotlinx.serialization.encoding.e
    public Object G(@l d d0) {
        L.p(d0, "deserializer");
        return Z.d(this, d0);
    }

    @Override  // kotlinx.serialization.internal.P0
    public boolean L(Object object0) {
        return this.m0(((String)object0));
    }

    @Override  // kotlinx.serialization.internal.P0
    public byte M(Object object0) {
        return this.n0(((String)object0));
    }

    @Override  // kotlinx.serialization.internal.P0
    public char N(Object object0) {
        return this.o0(((String)object0));
    }

    @Override  // kotlinx.serialization.internal.P0
    public double O(Object object0) {
        return this.p0(((String)object0));
    }

    @Override  // kotlinx.serialization.internal.P0
    public int P(Object object0, kotlinx.serialization.descriptors.f f0) {
        return this.q0(((String)object0), f0);
    }

    @Override  // kotlinx.serialization.internal.P0
    public float Q(Object object0) {
        return this.r0(((String)object0));
    }

    @Override  // kotlinx.serialization.internal.P0
    public e R(Object object0, kotlinx.serialization.descriptors.f f0) {
        return this.s0(((String)object0), f0);
    }

    @Override  // kotlinx.serialization.internal.P0
    public int S(Object object0) {
        return this.t0(((String)object0));
    }

    @Override  // kotlinx.serialization.internal.P0
    public long T(Object object0) {
        return this.u0(((String)object0));
    }

    @Override  // kotlinx.serialization.internal.P0
    public boolean U(Object object0) {
        return this.v0(((String)object0));
    }

    @Override  // kotlinx.serialization.internal.P0
    public Void V(Object object0) {
        return this.w0(((String)object0));
    }

    @Override  // kotlinx.serialization.internal.P0
    public short W(Object object0) {
        return this.x0(((String)object0));
    }

    @Override  // kotlinx.serialization.internal.P0
    public String X(Object object0) {
        return this.y0(((String)object0));
    }

    @Override  // kotlinx.serialization.internal.P0, kotlinx.serialization.encoding.e, kotlinx.serialization.encoding.c
    @l
    public kotlinx.serialization.modules.f a() {
        return this.d().a();
    }

    @Override  // kotlinx.serialization.internal.P0, kotlinx.serialization.encoding.e
    @l
    public kotlinx.serialization.encoding.c b(@l kotlinx.serialization.descriptors.f f0) {
        L.p(f0, "descriptor");
        kotlinx.serialization.json.l l0 = this.l0();
        kotlinx.serialization.descriptors.j j0 = f0.getKind();
        boolean z = L.g(j0, kotlinx.serialization.descriptors.k.b.a) ? true : j0 instanceof kotlinx.serialization.descriptors.d;
        Class class0 = kotlinx.serialization.json.c.class;
        if(z) {
            b b0 = this.d();
            if(!(l0 instanceof kotlinx.serialization.json.c)) {
                throw E.e(-1, "Expected " + m0.d(class0) + " as the serialized body of " + f0.h() + ", but had " + m0.d(l0.getClass()));
            }
            return new T(b0, ((kotlinx.serialization.json.c)l0));
        }
        boolean z1 = L.g(j0, kotlinx.serialization.descriptors.k.c.a);
        Class class1 = kotlinx.serialization.json.y.class;
        if(z1) {
            b b1 = this.d();
            kotlinx.serialization.descriptors.f f1 = o0.a(f0.d(0), b1.a());
            kotlinx.serialization.descriptors.j j1 = f1.getKind();
            if(!(j1 instanceof kotlinx.serialization.descriptors.e) && !L.g(j1, kotlinx.serialization.descriptors.j.b.a)) {
                if(!b1.h().b()) {
                    throw E.d(f1);
                }
                b b2 = this.d();
                if(!(l0 instanceof kotlinx.serialization.json.c)) {
                    throw E.e(-1, "Expected " + m0.d(class0) + " as the serialized body of " + f0.h() + ", but had " + m0.d(l0.getClass()));
                }
                return new T(b2, ((kotlinx.serialization.json.c)l0));
            }
            b b3 = this.d();
            if(!(l0 instanceof kotlinx.serialization.json.y)) {
                throw E.e(-1, "Expected " + m0.d(class1) + " as the serialized body of " + f0.h() + ", but had " + m0.d(l0.getClass()));
            }
            return new V(b3, ((kotlinx.serialization.json.y)l0));
        }
        b b4 = this.d();
        if(!(l0 instanceof kotlinx.serialization.json.y)) {
            throw E.e(-1, "Expected " + m0.d(class1) + " as the serialized body of " + f0.h() + ", but had " + m0.d(l0.getClass()));
        }
        return new Q(b4, ((kotlinx.serialization.json.y)l0), null, null, 12, null);
    }

    @Override  // kotlinx.serialization.internal.P0, kotlinx.serialization.encoding.c
    public void c(@l kotlinx.serialization.descriptors.f f0) {
        L.p(f0, "descriptor");
    }

    @Override  // kotlinx.serialization.json.j
    @l
    public b d() {
        return this.f;
    }

    @Override  // kotlinx.serialization.internal.l0
    @l
    protected String f0(@l String s, @l String s1) {
        L.p(s, "parentName");
        L.p(s1, "childName");
        return s1;
    }

    private final t j0(B b0, String s) {
        t t0 = b0 instanceof t ? ((t)b0) : null;
        if(t0 == null) {
            throw E.e(-1, "Unexpected \'null\' when " + s + " was expected");
        }
        return t0;
    }

    @l
    protected abstract kotlinx.serialization.json.l k0(@l String arg1);

    private final kotlinx.serialization.json.l l0() {
        String s = (String)this.a0();
        if(s != null) {
            kotlinx.serialization.json.l l0 = this.k0(s);
            return l0 == null ? this.A0() : l0;
        }
        return this.A0();
    }

    protected boolean m0(@l String s) {
        L.p(s, "tag");
        B b0 = this.z0(s);
        if(!this.d().h().n() && this.j0(b0, "boolean").b()) {
            throw E.f(-1, "Boolean literal for key \'" + s + "\' should be unquoted.\nUse \'isLenient = true\' in \'Json {}` builder to accept non-compliant JSON.", this.l0().toString());
        }
        try {
            Boolean boolean0 = n.g(b0);
            if(boolean0 != null) {
                return boolean0.booleanValue();
            }
        }
        catch(IllegalArgumentException unused_ex) {
        }
        this.C0("boolean");
        throw new y();
    }

    protected byte n0(@l String s) {
        Byte byte0;
        L.p(s, "tag");
        B b0 = this.z0(s);
        try {
            int v = n.m(b0);
            byte0 = 0xFFFFFF80 > v || v > 0x7F ? null : ((byte)v);
            if(byte0 == null) {
                this.C0("byte");
                throw new y();
            }
        }
        catch(IllegalArgumentException unused_ex) {
            this.C0("byte");
            throw new y();
        }
        return byte0.byteValue();
    }

    protected char o0(@l String s) {
        L.p(s, "tag");
        B b0 = this.z0(s);
        try {
            return v.J8(b0.a());
        }
        catch(IllegalArgumentException unused_ex) {
            this.C0("char");
            throw new y();
        }
    }

    protected double p0(@l String s) {
        double f;
        L.p(s, "tag");
        B b0 = this.z0(s);
        try {
            f = n.i(b0);
        }
        catch(IllegalArgumentException unused_ex) {
            this.C0("double");
            throw new y();
        }
        if(!this.d().h().a() && (Double.isInfinite(f) || Double.isNaN(f))) {
            throw E.a(f, s, this.l0().toString());
        }
        return f;
    }

    protected int q0(@l String s, @l kotlinx.serialization.descriptors.f f0) {
        L.p(s, "tag");
        L.p(f0, "enumDescriptor");
        return J.g(f0, this.d(), this.z0(s).a(), null, 4, null);
    }

    protected float r0(@l String s) {
        float f;
        L.p(s, "tag");
        B b0 = this.z0(s);
        try {
            f = n.k(b0);
        }
        catch(IllegalArgumentException unused_ex) {
            this.C0("float");
            throw new y();
        }
        if(!this.d().h().a() && (Float.isInfinite(f) || Float.isNaN(f))) {
            throw E.a(f, s, this.l0().toString());
        }
        return f;
    }

    @l
    protected e s0(@l String s, @l kotlinx.serialization.descriptors.f f0) {
        L.p(s, "tag");
        L.p(f0, "inlineDescriptor");
        return h0.b(f0) ? new z(new i0(this.z0(s).a()), this.d()) : super.R(s, f0);
    }

    @Override  // kotlinx.serialization.json.j
    @l
    public kotlinx.serialization.json.l t() {
        return this.l0();
    }

    protected int t0(@l String s) {
        L.p(s, "tag");
        B b0 = this.z0(s);
        try {
            return n.m(b0);
        }
        catch(IllegalArgumentException unused_ex) {
            this.C0("int");
            throw new y();
        }
    }

    protected long u0(@l String s) {
        L.p(s, "tag");
        B b0 = this.z0(s);
        try {
            return n.s(b0);
        }
        catch(IllegalArgumentException unused_ex) {
            this.C0("long");
            throw new y();
        }
    }

    protected boolean v0(@l String s) {
        L.p(s, "tag");
        return this.k0(s) != kotlinx.serialization.json.w.c;
    }

    @m
    protected Void w0(@l String s) {
        L.p(s, "tag");
        return null;
    }

    protected short x0(@l String s) {
        Short short0;
        L.p(s, "tag");
        B b0 = this.z0(s);
        try {
            int v = n.m(b0);
            short0 = 0xFFFF8000 > v || v > 0x7FFF ? null : ((short)v);
            if(short0 == null) {
                this.C0("short");
                throw new y();
            }
        }
        catch(IllegalArgumentException unused_ex) {
            this.C0("short");
            throw new y();
        }
        return short0.shortValue();
    }

    @l
    protected String y0(@l String s) {
        L.p(s, "tag");
        B b0 = this.z0(s);
        if(!this.d().h().n() && !this.j0(b0, "string").b()) {
            throw E.f(-1, "String literal for key \'" + s + "\' should be quoted.\nUse \'isLenient = true\' in \'Json {}` builder to accept non-compliant JSON.", this.l0().toString());
        }
        if(b0 instanceof kotlinx.serialization.json.w) {
            throw E.f(-1, "Unexpected \'null\' value instead of string literal", this.l0().toString());
        }
        return b0.a();
    }

    @l
    protected final B z0(@l String s) {
        L.p(s, "tag");
        kotlinx.serialization.json.l l0 = this.k0(s);
        B b0 = l0 instanceof B ? ((B)l0) : null;
        if(b0 == null) {
            throw E.f(-1, "Expected JsonPrimitive at " + s + ", found " + l0, this.l0().toString());
        }
        return b0;
    }
}

