package kotlinx.serialization.internal;

import kotlin.S0;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.encoding.g;
import kotlinx.serialization.i;
import y4.l;

@b0
public final class f1 implements i {
    private final p0 a;
    @l
    public static final f1 b;

    static {
        f1.b = new f1();
    }

    private f1() {
        this.a = new p0("kotlin.Unit", S0.a);
    }

    public void a(@l e e0) {
        L.p(e0, "decoder");
        this.a.deserialize(e0);
    }

    public void b(@l g g0, @l S0 s00) {
        L.p(g0, "encoder");
        L.p(s00, "value");
        this.a.serialize(g0, s00);
    }

    @Override  // kotlinx.serialization.d
    public Object deserialize(e e0) {
        this.a(e0);
        return S0.a;
    }

    @Override  // kotlinx.serialization.i
    @l
    public f getDescriptor() {
        return this.a.getDescriptor();
    }

    @Override  // kotlinx.serialization.w
    public void serialize(g g0, Object object0) {
        this.b(g0, ((S0)object0));
    }
}

