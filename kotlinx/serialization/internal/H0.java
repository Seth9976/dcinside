package kotlinx.serialization.internal;

import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlinx.serialization.descriptors.e.g;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.i;
import y4.l;

@b0
public final class h0 implements i {
    @l
    public static final h0 a;
    @l
    private static final f b;

    static {
        h0.a = new h0();
        h0.b = new D0("kotlin.Long", g.a);
    }

    @l
    public Long a(@l e e0) {
        L.p(e0, "decoder");
        return e0.h();
    }

    public void b(@l kotlinx.serialization.encoding.g g0, long v) {
        L.p(g0, "encoder");
        g0.B(v);
    }

    @Override  // kotlinx.serialization.d
    public Object deserialize(e e0) {
        return this.a(e0);
    }

    @Override  // kotlinx.serialization.i
    @l
    public f getDescriptor() {
        return h0.b;
    }

    @Override  // kotlinx.serialization.w
    public void serialize(kotlinx.serialization.encoding.g g0, Object object0) {
        this.b(g0, ((Number)object0).longValue());
    }
}

