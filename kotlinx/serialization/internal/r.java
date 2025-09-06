package kotlinx.serialization.internal;

import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlinx.serialization.descriptors.e.c;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.encoding.g;
import kotlinx.serialization.i;
import y4.l;

@b0
public final class r implements i {
    @l
    public static final r a;
    @l
    private static final f b;

    static {
        r.a = new r();
        r.b = new D0("kotlin.Char", c.a);
    }

    @l
    public Character a(@l e e0) {
        L.p(e0, "decoder");
        return Character.valueOf(e0.o());
    }

    public void b(@l g g0, char c) {
        L.p(g0, "encoder");
        g0.E(c);
    }

    @Override  // kotlinx.serialization.d
    public Object deserialize(e e0) {
        return this.a(e0);
    }

    @Override  // kotlinx.serialization.i
    @l
    public f getDescriptor() {
        return r.b;
    }

    @Override  // kotlinx.serialization.w
    public void serialize(g g0, Object object0) {
        this.b(g0, ((Character)object0).charValue());
    }
}

