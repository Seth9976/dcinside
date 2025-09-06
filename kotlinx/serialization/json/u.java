package kotlinx.serialization.json;

import P3.a;
import kotlin.H0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.text.M;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.encoding.g;
import kotlinx.serialization.i;
import kotlinx.serialization.json.internal.E;
import y4.l;

final class u implements i {
    @l
    public static final u a;
    @l
    private static final f b;

    static {
        u.a = new u();
        u.b = kotlinx.serialization.descriptors.i.a("kotlinx.serialization.json.JsonLiteral", kotlinx.serialization.descriptors.e.i.a);
    }

    @l
    public t a(@l e e0) {
        L.p(e0, "decoder");
        kotlinx.serialization.json.l l0 = p.d(e0).t();
        if(!(l0 instanceof t)) {
            throw E.f(-1, "Unexpected JSON element, expected JsonLiteral, had " + m0.d(l0.getClass()), l0.toString());
        }
        return (t)l0;
    }

    public void b(@l g g0, @l t t0) {
        L.p(g0, "encoder");
        L.p(t0, "value");
        p.h(g0);
        if(t0.b()) {
            g0.v(t0.a());
            return;
        }
        Long long0 = n.t(t0);
        if(long0 != null) {
            g0.B(long0.longValue());
            return;
        }
        H0 h00 = M.o(t0.a());
        if(h00 != null) {
            g0.h(a.y(H0.b).getDescriptor()).B(h00.l0());
            return;
        }
        Double double0 = n.j(t0);
        if(double0 != null) {
            g0.x(double0.doubleValue());
            return;
        }
        Boolean boolean0 = n.g(t0);
        if(boolean0 != null) {
            g0.l(boolean0.booleanValue());
            return;
        }
        g0.v(t0.a());
    }

    @Override  // kotlinx.serialization.d
    public Object deserialize(e e0) {
        return this.a(e0);
    }

    @Override  // kotlinx.serialization.i
    @l
    public f getDescriptor() {
        return u.b;
    }

    @Override  // kotlinx.serialization.w
    public void serialize(g g0, Object object0) {
        this.b(g0, ((t)object0));
    }
}

