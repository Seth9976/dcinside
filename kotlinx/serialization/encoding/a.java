package kotlinx.serialization.encoding;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlinx.serialization.d;
import kotlinx.serialization.f;
import kotlinx.serialization.v;
import y4.l;
import y4.m;

@f
public abstract class a implements c, e {
    @Override  // kotlinx.serialization.encoding.e
    public boolean A() {
        Object object0 = this.L();
        L.n(object0, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean)object0).booleanValue();
    }

    @Override  // kotlinx.serialization.encoding.c
    public final byte B(@l kotlinx.serialization.descriptors.f f0, int v) {
        L.p(f0, "descriptor");
        return this.H();
    }

    @Override  // kotlinx.serialization.encoding.c
    public final boolean C(@l kotlinx.serialization.descriptors.f f0, int v) {
        L.p(f0, "descriptor");
        return this.A();
    }

    @Override  // kotlinx.serialization.encoding.e
    public boolean D() {
        return true;
    }

    @Override  // kotlinx.serialization.encoding.c
    public final short E(@l kotlinx.serialization.descriptors.f f0, int v) {
        L.p(f0, "descriptor");
        return this.m();
    }

    @Override  // kotlinx.serialization.encoding.c
    public final double F(@l kotlinx.serialization.descriptors.f f0, int v) {
        L.p(f0, "descriptor");
        return this.n();
    }

    @Override  // kotlinx.serialization.encoding.e
    public Object G(@l d d0) {
        return kotlinx.serialization.encoding.e.a.b(this, d0);
    }

    @Override  // kotlinx.serialization.encoding.e
    public byte H() {
        Object object0 = this.L();
        L.n(object0, "null cannot be cast to non-null type kotlin.Byte");
        return (byte)(((Byte)object0));
    }

    @Override  // kotlinx.serialization.encoding.e
    @f
    @m
    public Object I(@l d d0) {
        return kotlinx.serialization.encoding.e.a.a(this, d0);
    }

    public Object J(@l d d0, @m Object object0) {
        L.p(d0, "deserializer");
        return this.G(d0);
    }

    public static Object K(a a0, d d0, Object object0, int v, Object object1) {
        if(object1 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableValue");
        }
        if((v & 2) != 0) {
            object0 = null;
        }
        return a0.J(d0, object0);
    }

    @l
    public Object L() {
        throw new v(m0.d(this.getClass()) + " can\'t retrieve untyped values");
    }

    @Override  // kotlinx.serialization.encoding.e
    @l
    public c b(@l kotlinx.serialization.descriptors.f f0) {
        L.p(f0, "descriptor");
        return this;
    }

    @Override  // kotlinx.serialization.encoding.c
    public void c(@l kotlinx.serialization.descriptors.f f0) {
        L.p(f0, "descriptor");
    }

    @Override  // kotlinx.serialization.encoding.c
    public final long e(@l kotlinx.serialization.descriptors.f f0, int v) {
        L.p(f0, "descriptor");
        return this.h();
    }

    @Override  // kotlinx.serialization.encoding.c
    public final int f(@l kotlinx.serialization.descriptors.f f0, int v) {
        L.p(f0, "descriptor");
        return this.u();
    }

    @Override  // kotlinx.serialization.encoding.e
    @m
    public Void g() {
        return null;
    }

    @Override  // kotlinx.serialization.encoding.e
    public long h() {
        Object object0 = this.L();
        L.n(object0, "null cannot be cast to non-null type kotlin.Long");
        return (long)(((Long)object0));
    }

    @Override  // kotlinx.serialization.encoding.c
    @l
    public final String i(@l kotlinx.serialization.descriptors.f f0, int v) {
        L.p(f0, "descriptor");
        return this.q();
    }

    @Override  // kotlinx.serialization.encoding.c
    @m
    public final Object j(@l kotlinx.serialization.descriptors.f f0, int v, @l d d0, @m Object object0) {
        L.p(f0, "descriptor");
        L.p(d0, "deserializer");
        return !d0.getDescriptor().b() && !this.D() ? this.g() : this.J(d0, object0);
    }

    @Override  // kotlinx.serialization.encoding.c
    @f
    public boolean k() {
        return false;
    }

    @Override  // kotlinx.serialization.encoding.c
    @l
    public e l(@l kotlinx.serialization.descriptors.f f0, int v) {
        L.p(f0, "descriptor");
        return this.x(f0.d(v));
    }

    @Override  // kotlinx.serialization.encoding.e
    public short m() {
        Object object0 = this.L();
        L.n(object0, "null cannot be cast to non-null type kotlin.Short");
        return (short)(((Short)object0));
    }

    @Override  // kotlinx.serialization.encoding.e
    public double n() {
        Object object0 = this.L();
        L.n(object0, "null cannot be cast to non-null type kotlin.Double");
        return (double)(((Double)object0));
    }

    @Override  // kotlinx.serialization.encoding.e
    public char o() {
        Object object0 = this.L();
        L.n(object0, "null cannot be cast to non-null type kotlin.Char");
        return ((Character)object0).charValue();
    }

    @Override  // kotlinx.serialization.encoding.c
    public Object p(@l kotlinx.serialization.descriptors.f f0, int v, @l d d0, @m Object object0) {
        L.p(f0, "descriptor");
        L.p(d0, "deserializer");
        return this.J(d0, object0);
    }

    @Override  // kotlinx.serialization.encoding.e
    @l
    public String q() {
        Object object0 = this.L();
        L.n(object0, "null cannot be cast to non-null type kotlin.String");
        return (String)object0;
    }

    @Override  // kotlinx.serialization.encoding.c
    public final char r(@l kotlinx.serialization.descriptors.f f0, int v) {
        L.p(f0, "descriptor");
        return this.o();
    }

    @Override  // kotlinx.serialization.encoding.e
    public int s(@l kotlinx.serialization.descriptors.f f0) {
        L.p(f0, "enumDescriptor");
        Object object0 = this.L();
        L.n(object0, "null cannot be cast to non-null type kotlin.Int");
        return (int)(((Integer)object0));
    }

    @Override  // kotlinx.serialization.encoding.e
    public int u() {
        Object object0 = this.L();
        L.n(object0, "null cannot be cast to non-null type kotlin.Int");
        return (int)(((Integer)object0));
    }

    @Override  // kotlinx.serialization.encoding.c
    public int v(@l kotlinx.serialization.descriptors.f f0) {
        return b.a(this, f0);
    }

    @Override  // kotlinx.serialization.encoding.e
    @l
    public e x(@l kotlinx.serialization.descriptors.f f0) {
        L.p(f0, "descriptor");
        return this;
    }

    @Override  // kotlinx.serialization.encoding.e
    public float y() {
        Object object0 = this.L();
        L.n(object0, "null cannot be cast to non-null type kotlin.Float");
        return (float)(((Float)object0));
    }

    @Override  // kotlinx.serialization.encoding.c
    public final float z(@l kotlinx.serialization.descriptors.f f0, int v) {
        L.p(f0, "descriptor");
        return this.y();
    }
}

