package kotlinx.serialization.internal;

import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlinx.serialization.descriptors.e.a;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.encoding.g;
import y4.l;

@b0
public final class i implements kotlinx.serialization.i {
    @l
    public static final i a;
    @l
    private static final f b;

    static {
        i.a = new i();
        i.b = new D0("kotlin.Boolean", a.a);
    }

    @l
    public Boolean a(@l e e0) {
        L.p(e0, "decoder");
        return Boolean.valueOf(e0.A());
    }

    public void b(@l g g0, boolean z) {
        L.p(g0, "encoder");
        g0.l(z);
    }

    @Override  // kotlinx.serialization.d
    public Object deserialize(e e0) {
        return this.a(e0);
    }

    @Override  // kotlinx.serialization.i
    @l
    public f getDescriptor() {
        return i.b;
    }

    @Override  // kotlinx.serialization.w
    public void serialize(g g0, Object object0) {
        this.b(g0, ((Boolean)object0).booleanValue());
    }
}

