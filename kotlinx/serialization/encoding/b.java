package kotlinx.serialization.encoding;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlinx.serialization.f;
import kotlinx.serialization.internal.n0;
import kotlinx.serialization.v;
import kotlinx.serialization.w;
import y4.l;
import y4.m;

@f
public abstract class b implements d, g {
    @Override  // kotlinx.serialization.encoding.g
    @f
    public void A(@l w w0, @m Object object0) {
        a.c(this, w0, object0);
    }

    @Override  // kotlinx.serialization.encoding.g
    public void B(long v) {
        this.J(v);
    }

    @Override  // kotlinx.serialization.encoding.g
    public void C() {
        throw new v("\'null\' is not supported by default");
    }

    @Override  // kotlinx.serialization.encoding.d
    public final void D(@l kotlinx.serialization.descriptors.f f0, int v, float f1) {
        L.p(f0, "descriptor");
        if(this.I(f0, v)) {
            this.m(f1);
        }
    }

    @Override  // kotlinx.serialization.encoding.g
    public void E(char c) {
        this.J(Character.valueOf(c));
    }

    @Override  // kotlinx.serialization.encoding.g
    @f
    public void F() {
    }

    @Override  // kotlinx.serialization.encoding.d
    public void G(@l kotlinx.serialization.descriptors.f f0, int v, @l w w0, Object object0) {
        L.p(f0, "descriptor");
        L.p(w0, "serializer");
        if(this.I(f0, v)) {
            this.e(w0, object0);
        }
    }

    @Override  // kotlinx.serialization.encoding.d
    public final void H(@l kotlinx.serialization.descriptors.f f0, int v, double f1) {
        L.p(f0, "descriptor");
        if(this.I(f0, v)) {
            this.x(f1);
        }
    }

    public boolean I(@l kotlinx.serialization.descriptors.f f0, int v) {
        L.p(f0, "descriptor");
        return true;
    }

    public void J(@l Object object0) {
        L.p(object0, "value");
        throw new v("Non-serializable " + m0.d(object0.getClass()) + " is not supported by " + m0.d(this.getClass()) + " encoder");
    }

    @Override  // kotlinx.serialization.encoding.g
    @l
    public d b(@l kotlinx.serialization.descriptors.f f0) {
        L.p(f0, "descriptor");
        return this;
    }

    @Override  // kotlinx.serialization.encoding.d
    public void c(@l kotlinx.serialization.descriptors.f f0) {
        L.p(f0, "descriptor");
    }

    @Override  // kotlinx.serialization.encoding.g
    public void e(@l w w0, Object object0) {
        a.d(this, w0, object0);
    }

    @Override  // kotlinx.serialization.encoding.g
    public void f(byte b) {
        this.J(b);
    }

    @Override  // kotlinx.serialization.encoding.g
    public void g(@l kotlinx.serialization.descriptors.f f0, int v) {
        L.p(f0, "enumDescriptor");
        this.J(v);
    }

    @Override  // kotlinx.serialization.encoding.g
    @l
    public g h(@l kotlinx.serialization.descriptors.f f0) {
        L.p(f0, "descriptor");
        return this;
    }

    @Override  // kotlinx.serialization.encoding.d
    public final void i(@l kotlinx.serialization.descriptors.f f0, int v, char c) {
        L.p(f0, "descriptor");
        if(this.I(f0, v)) {
            this.E(c);
        }
    }

    @Override  // kotlinx.serialization.encoding.d
    public final void j(@l kotlinx.serialization.descriptors.f f0, int v, byte b) {
        L.p(f0, "descriptor");
        if(this.I(f0, v)) {
            this.f(b);
        }
    }

    @Override  // kotlinx.serialization.encoding.g
    public void k(short v) {
        this.J(v);
    }

    @Override  // kotlinx.serialization.encoding.g
    public void l(boolean z) {
        this.J(Boolean.valueOf(z));
    }

    @Override  // kotlinx.serialization.encoding.g
    public void m(float f) {
        this.J(f);
    }

    @Override  // kotlinx.serialization.encoding.d
    public final void n(@l kotlinx.serialization.descriptors.f f0, int v, int v1) {
        L.p(f0, "descriptor");
        if(this.I(f0, v)) {
            this.s(v1);
        }
    }

    @Override  // kotlinx.serialization.encoding.d
    public final void o(@l kotlinx.serialization.descriptors.f f0, int v, boolean z) {
        L.p(f0, "descriptor");
        if(this.I(f0, v)) {
            this.l(z);
        }
    }

    @Override  // kotlinx.serialization.encoding.d
    public final void p(@l kotlinx.serialization.descriptors.f f0, int v, @l String s) {
        L.p(f0, "descriptor");
        L.p(s, "value");
        if(this.I(f0, v)) {
            this.v(s);
        }
    }

    @Override  // kotlinx.serialization.encoding.d
    @f
    public boolean q(@l kotlinx.serialization.descriptors.f f0, int v) {
        return kotlinx.serialization.encoding.d.a.a(this, f0, v);
    }

    @Override  // kotlinx.serialization.encoding.g
    public void s(int v) {
        this.J(v);
    }

    @Override  // kotlinx.serialization.encoding.d
    public final void t(@l kotlinx.serialization.descriptors.f f0, int v, short v1) {
        L.p(f0, "descriptor");
        if(this.I(f0, v)) {
            this.k(v1);
        }
    }

    @Override  // kotlinx.serialization.encoding.d
    public final void u(@l kotlinx.serialization.descriptors.f f0, int v, long v1) {
        L.p(f0, "descriptor");
        if(this.I(f0, v)) {
            this.B(v1);
        }
    }

    @Override  // kotlinx.serialization.encoding.g
    public void v(@l String s) {
        L.p(s, "value");
        this.J(s);
    }

    @Override  // kotlinx.serialization.encoding.d
    @l
    public final g w(@l kotlinx.serialization.descriptors.f f0, int v) {
        L.p(f0, "descriptor");
        return this.I(f0, v) ? this.h(f0.d(v)) : n0.a;
    }

    @Override  // kotlinx.serialization.encoding.g
    public void x(double f) {
        this.J(f);
    }

    @Override  // kotlinx.serialization.encoding.d
    public void y(@l kotlinx.serialization.descriptors.f f0, int v, @l w w0, @m Object object0) {
        L.p(f0, "descriptor");
        L.p(w0, "serializer");
        if(this.I(f0, v)) {
            this.A(w0, object0);
        }
    }

    @Override  // kotlinx.serialization.encoding.g
    @l
    public d z(@l kotlinx.serialization.descriptors.f f0, int v) {
        return a.a(this, f0, v);
    }
}

