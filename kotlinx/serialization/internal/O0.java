package kotlinx.serialization.internal;

import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.encoding.g;
import kotlinx.serialization.i;
import y4.l;
import y4.m;

@b0
public final class o0 implements i {
    @l
    private final i a;
    @l
    private final f b;

    public o0(@l i i0) {
        L.p(i0, "serializer");
        super();
        this.a = i0;
        this.b = new G0(i0.getDescriptor());
    }

    @Override  // kotlinx.serialization.d
    @m
    public Object deserialize(@l e e0) {
        L.p(e0, "decoder");
        return e0.D() ? e0.G(this.a) : e0.g();
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(@m Object object0) {
        return this == object0 ? true : object0 != null && L.g(m0.d(o0.class), m0.d(object0.getClass())) && L.g(this.a, ((o0)object0).a);
    }

    @Override  // kotlinx.serialization.i
    @l
    public f getDescriptor() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override  // kotlinx.serialization.w
    public void serialize(@l g g0, @m Object object0) {
        L.p(g0, "encoder");
        if(object0 != null) {
            g0.F();
            g0.e(this.a, object0);
            return;
        }
        g0.C();
    }
}

