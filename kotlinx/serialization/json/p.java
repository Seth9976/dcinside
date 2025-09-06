package kotlinx.serialization.json;

import A3.a;
import java.util.List;
import kotlin.D;
import kotlin.E;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.encoding.e;
import kotlinx.serialization.encoding.g;
import y4.l;

public final class p {
    @l
    public static final j d(@l e e0) {
        L.p(e0, "<this>");
        j j0 = e0 instanceof j ? ((j)e0) : null;
        if(j0 == null) {
            throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + m0.d(e0.getClass()));
        }
        return j0;
    }

    @l
    public static final q e(@l g g0) {
        L.p(g0, "<this>");
        q q0 = g0 instanceof q ? ((q)g0) : null;
        if(q0 == null) {
            throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + m0.d(g0.getClass()));
        }
        return q0;
    }

    private static final f f(a a0) {
        public static final class kotlinx.serialization.json.p.a implements f {
            @l
            private final D a;

            kotlinx.serialization.json.p.a(a a0) {
                this.a = E.a(a0);
            }

            private final f a() {
                return (f)this.a.getValue();
            }

            @Override  // kotlinx.serialization.descriptors.f
            public boolean b() {
                return false;
            }

            @Override  // kotlinx.serialization.descriptors.f
            public int c(@l String s) {
                L.p(s, "name");
                return this.a().c(s);
            }

            @Override  // kotlinx.serialization.descriptors.f
            @l
            public f d(int v) {
                return this.a().d(v);
            }

            @Override  // kotlinx.serialization.descriptors.f
            public int e() {
                return this.a().e();
            }

            @Override  // kotlinx.serialization.descriptors.f
            @l
            public String f(int v) {
                return this.a().f(v);
            }

            @Override  // kotlinx.serialization.descriptors.f
            @l
            public List g(int v) {
                return this.a().g(v);
            }

            @Override  // kotlinx.serialization.descriptors.f
            @l
            public List getAnnotations() {
                return kotlinx.serialization.descriptors.f.a.a(this);
            }

            @Override  // kotlinx.serialization.descriptors.f
            @l
            public kotlinx.serialization.descriptors.j getKind() {
                return this.a().getKind();
            }

            @Override  // kotlinx.serialization.descriptors.f
            @l
            public String h() {
                return this.a().h();
            }

            @Override  // kotlinx.serialization.descriptors.f
            public boolean i(int v) {
                return this.a().i(v);
            }

            @Override  // kotlinx.serialization.descriptors.f
            public boolean isInline() {
                return false;
            }
        }

        return new kotlinx.serialization.json.p.a(a0);
    }

    private static final void g(e e0) {
        p.d(e0);
    }

    private static final void h(g g0) {
        p.e(g0);
    }
}

