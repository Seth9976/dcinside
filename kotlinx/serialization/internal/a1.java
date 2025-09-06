package kotlinx.serialization.internal;

import P3.a;
import kotlin.H0;
import kotlin.I0;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.t;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.f;
import kotlinx.serialization.i;
import y4.l;

@b0
@t
@f
public final class a1 extends B0 implements i {
    @l
    public static final a1 c;

    static {
        a1.c = new a1();
    }

    private a1() {
        super(a.y(H0.b));
    }

    protected void A(@l d d0, @l long[] arr_v, int v) {
        L.p(d0, "encoder");
        L.p(arr_v, "content");
        for(int v1 = 0; v1 < v; ++v1) {
            d0.w(this.getDescriptor(), v1).B(I0.l(arr_v, v1));
        }
    }

    @Override  // kotlinx.serialization.internal.a
    public int e(Object object0) {
        return this.w(((I0)object0).x());
    }

    @Override  // kotlinx.serialization.internal.x
    public void h(c c0, int v, Object object0, boolean z) {
        this.y(c0, v, ((Z0)object0), z);
    }

    @Override  // kotlinx.serialization.internal.a
    public Object k(Object object0) {
        return this.z(((I0)object0).x());
    }

    @Override  // kotlinx.serialization.internal.B0
    public Object r() {
        return I0.b(this.x());
    }

    @Override  // kotlinx.serialization.internal.B0
    public void t(c c0, int v, z0 z00, boolean z) {
        this.y(c0, v, ((Z0)z00), z);
    }

    @Override  // kotlinx.serialization.internal.B0
    public void v(d d0, Object object0, int v) {
        this.A(d0, ((I0)object0).x(), v);
    }

    protected int w(@l long[] arr_v) {
        L.p(arr_v, "$this$collectionSize");
        return I0.o(arr_v);
    }

    @l
    protected long[] x() {
        return I0.c(0);
    }

    protected void y(@l c c0, int v, @l Z0 z00, boolean z) {
        L.p(c0, "decoder");
        L.p(z00, "builder");
        z00.e(H0.h(c0.l(this.getDescriptor(), v).h()));
    }

    @l
    protected Z0 z(@l long[] arr_v) {
        L.p(arr_v, "$this$toBuilder");
        return new Z0(arr_v, null);
    }
}

