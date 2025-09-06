package kotlinx.serialization.json;

import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.descriptors.j.b;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.encoding.g;
import kotlinx.serialization.i;
import kotlinx.serialization.json.internal.A;
import kotlinx.serialization.x;
import y4.l;

@b0
@x(forClass = w.class)
public final class kotlinx.serialization.json.x implements i {
    @l
    public static final kotlinx.serialization.json.x a;
    @l
    private static final f b;

    static {
        kotlinx.serialization.json.x.a = new kotlinx.serialization.json.x();
        kotlinx.serialization.json.x.b = kotlinx.serialization.descriptors.i.f("kotlinx.serialization.json.JsonNull", b.a, new f[0], null, 8, null);
    }

    @l
    public w a(@l e e0) {
        L.p(e0, "decoder");
        p.g(e0);
        if(e0.D()) {
            throw new A("Expected \'null\' literal");
        }
        e0.g();
        return w.c;
    }

    public void b(@l g g0, @l w w0) {
        L.p(g0, "encoder");
        L.p(w0, "value");
        p.h(g0);
        g0.C();
    }

    @Override  // kotlinx.serialization.d
    public Object deserialize(e e0) {
        return this.a(e0);
    }

    @Override  // kotlinx.serialization.i
    @l
    public f getDescriptor() {
        return kotlinx.serialization.json.x.b;
    }

    @Override  // kotlinx.serialization.w
    public void serialize(g g0, Object object0) {
        this.b(g0, ((w)object0));
    }
}

