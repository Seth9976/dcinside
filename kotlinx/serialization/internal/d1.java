package kotlinx.serialization.internal;

import P3.a;
import kotlin.N0;
import kotlin.O0;
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
public final class d1 extends B0 implements i {
    @l
    public static final d1 c;

    static {
        d1.c = new d1();
    }

    private d1() {
        super(a.z(N0.b));
    }

    protected void A(@l d d0, @l short[] arr_v, int v) {
        L.p(d0, "encoder");
        L.p(arr_v, "content");
        for(int v1 = 0; v1 < v; ++v1) {
            d0.w(this.getDescriptor(), v1).k(O0.l(arr_v, v1));
        }
    }

    @Override  // kotlinx.serialization.internal.a
    public int e(Object object0) {
        return this.w(((O0)object0).x());
    }

    @Override  // kotlinx.serialization.internal.x
    public void h(c c0, int v, Object object0, boolean z) {
        this.y(c0, v, ((c1)object0), z);
    }

    @Override  // kotlinx.serialization.internal.a
    public Object k(Object object0) {
        return this.z(((O0)object0).x());
    }

    @Override  // kotlinx.serialization.internal.B0
    public Object r() {
        return O0.b(this.x());
    }

    @Override  // kotlinx.serialization.internal.B0
    public void t(c c0, int v, z0 z00, boolean z) {
        this.y(c0, v, ((c1)z00), z);
    }

    @Override  // kotlinx.serialization.internal.B0
    public void v(d d0, Object object0, int v) {
        this.A(d0, ((O0)object0).x(), v);
    }

    protected int w(@l short[] arr_v) {
        L.p(arr_v, "$this$collectionSize");
        return O0.o(arr_v);
    }

    @l
    protected short[] x() {
        return O0.c(0);
    }

    protected void y(@l c c0, int v, @l c1 c10, boolean z) {
        L.p(c0, "decoder");
        L.p(c10, "builder");
        c10.e(N0.h(c0.l(this.getDescriptor(), v).m()));
    }

    @l
    protected c1 z(@l short[] arr_v) {
        L.p(arr_v, "$this$toBuilder");
        return new c1(arr_v, null);
    }
}

