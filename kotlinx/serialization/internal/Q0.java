package kotlinx.serialization.internal;

import kotlin.S0;
import kotlin.V;
import kotlin.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.r0;
import kotlinx.serialization.descriptors.f;
import kotlinx.serialization.i;
import y4.l;

@b0
public final class q0 extends Z {
    @l
    private final f c;

    public q0(@l i i0, @l i i1) {
        static final class a extends N implements Function1 {
            final i e;
            final i f;

            a(i i0, i i1) {
                this.e = i0;
                this.f = i1;
                super(1);
            }

            public final void a(@l kotlinx.serialization.descriptors.a a0) {
                L.p(a0, "$this$buildClassSerialDescriptor");
                kotlinx.serialization.descriptors.a.b(a0, "first", this.e.getDescriptor(), null, false, 12, null);
                kotlinx.serialization.descriptors.a.b(a0, "second", this.f.getDescriptor(), null, false, 12, null);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((kotlinx.serialization.descriptors.a)object0));
                return S0.a;
            }
        }

        L.p(i0, "keySerializer");
        L.p(i1, "valueSerializer");
        super(i0, i1, null);
        a q0$a0 = new a(i0, i1);
        this.c = kotlinx.serialization.descriptors.i.c("kotlin.Pair", new f[0], q0$a0);
    }

    @Override  // kotlinx.serialization.internal.Z
    public Object a(Object object0) {
        return this.f(((V)object0));
    }

    @Override  // kotlinx.serialization.internal.Z
    public Object c(Object object0) {
        return this.g(((V)object0));
    }

    @Override  // kotlinx.serialization.internal.Z
    public Object e(Object object0, Object object1) {
        return this.h(object0, object1);
    }

    protected Object f(@l V v0) {
        L.p(v0, "<this>");
        return v0.e();
    }

    protected Object g(@l V v0) {
        L.p(v0, "<this>");
        return v0.f();
    }

    @Override  // kotlinx.serialization.i
    @l
    public f getDescriptor() {
        return this.c;
    }

    @l
    protected V h(Object object0, Object object1) {
        return r0.a(object0, object1);
    }
}

