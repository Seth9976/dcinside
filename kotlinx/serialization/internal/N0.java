package kotlinx.serialization.internal;

import kotlin.jvm.internal.L;
import kotlinx.serialization.encoding.b;
import kotlinx.serialization.modules.f;
import kotlinx.serialization.modules.h;
import y4.l;

public final class n0 extends b {
    @l
    public static final n0 a;
    @l
    private static final f b;

    static {
        n0.a = new n0();
        n0.b = h.a();
    }

    @Override  // kotlinx.serialization.encoding.b
    public void B(long v) {
    }

    @Override  // kotlinx.serialization.encoding.b
    public void C() {
    }

    @Override  // kotlinx.serialization.encoding.b
    public void E(char c) {
    }

    @Override  // kotlinx.serialization.encoding.b
    public void J(@l Object object0) {
        L.p(object0, "value");
    }

    @Override  // kotlinx.serialization.encoding.g, kotlinx.serialization.encoding.d
    @l
    public f a() {
        return n0.b;
    }

    @Override  // kotlinx.serialization.encoding.b
    public void f(byte b) {
    }

    @Override  // kotlinx.serialization.encoding.b
    public void g(@l kotlinx.serialization.descriptors.f f0, int v) {
        L.p(f0, "enumDescriptor");
    }

    @Override  // kotlinx.serialization.encoding.b
    public void k(short v) {
    }

    @Override  // kotlinx.serialization.encoding.b
    public void l(boolean z) {
    }

    @Override  // kotlinx.serialization.encoding.b
    public void m(float f) {
    }

    @Override  // kotlinx.serialization.encoding.b
    public void s(int v) {
    }

    @Override  // kotlinx.serialization.encoding.b
    public void v(@l String s) {
        L.p(s, "value");
    }

    @Override  // kotlinx.serialization.encoding.b
    public void x(double f) {
    }
}

