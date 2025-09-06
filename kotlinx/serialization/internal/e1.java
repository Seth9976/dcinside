package kotlinx.serialization.internal;

import P3.a;
import kotlin.N0;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.q0;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.encoding.g;
import kotlinx.serialization.i;
import y4.l;

@b0
public final class e1 implements i {
    @l
    public static final e1 a;
    @l
    private static final f b;

    static {
        e1.a = new e1();
        e1.b = T.a("kotlin.UShort", a.I(q0.a));
    }

    public short a(@l e e0) {
        L.p(e0, "decoder");
        return N0.h(e0.x(this.getDescriptor()).m());
    }

    public void b(@l g g0, short v) {
        L.p(g0, "encoder");
        g0.h(this.getDescriptor()).k(v);
    }

    @Override  // kotlinx.serialization.d
    public Object deserialize(e e0) {
        return N0.b(this.a(e0));
    }

    @Override  // kotlinx.serialization.i
    @l
    public f getDescriptor() {
        return e1.b;
    }

    @Override  // kotlinx.serialization.w
    public void serialize(g g0, Object object0) {
        this.b(g0, ((N0)object0).j0());
    }
}

