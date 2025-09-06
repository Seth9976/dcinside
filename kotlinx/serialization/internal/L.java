package kotlinx.serialization.internal;

import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlinx.serialization.descriptors.e.b;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.encoding.g;
import kotlinx.serialization.i;

@b0
public final class l implements i {
    @y4.l
    public static final l a;
    @y4.l
    private static final f b;

    static {
        l.a = new l();
        l.b = new D0("kotlin.Byte", b.a);
    }

    @y4.l
    public Byte a(@y4.l e e0) {
        L.p(e0, "decoder");
        return e0.H();
    }

    public void b(@y4.l g g0, byte b) {
        L.p(g0, "encoder");
        g0.f(b);
    }

    @Override  // kotlinx.serialization.d
    public Object deserialize(e e0) {
        return this.a(e0);
    }

    @Override  // kotlinx.serialization.i
    @y4.l
    public f getDescriptor() {
        return l.b;
    }

    @Override  // kotlinx.serialization.w
    public void serialize(g g0, Object object0) {
        this.b(g0, ((Number)object0).byteValue());
    }
}

