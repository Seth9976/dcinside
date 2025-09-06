package kotlinx.serialization.internal;

import P3.a;
import kotlin.H0;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.Q;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.encoding.g;
import kotlinx.serialization.i;
import y4.l;

@b0
public final class b1 implements i {
    @l
    public static final b1 a;
    @l
    private static final f b;

    static {
        b1.a = new b1();
        b1.b = T.a("kotlin.ULong", a.H(Q.a));
    }

    public long a(@l e e0) {
        L.p(e0, "decoder");
        return H0.h(e0.x(this.getDescriptor()).h());
    }

    public void b(@l g g0, long v) {
        L.p(g0, "encoder");
        g0.h(this.getDescriptor()).B(v);
    }

    @Override  // kotlinx.serialization.d
    public Object deserialize(e e0) {
        return H0.b(this.a(e0));
    }

    @Override  // kotlinx.serialization.i
    @l
    public f getDescriptor() {
        return b1.b;
    }

    @Override  // kotlinx.serialization.w
    public void serialize(g g0, Object object0) {
        this.b(g0, ((H0)object0).l0());
    }
}

