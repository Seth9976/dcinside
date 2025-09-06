package kotlinx.serialization.internal;

import P3.a;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.Q;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.i;
import y4.l;

@b0
public final class g0 extends B0 implements i {
    @l
    public static final g0 c;

    static {
        g0.c = new g0();
    }

    private g0() {
        super(a.H(Q.a));
    }

    protected void A(@l d d0, @l long[] arr_v, int v) {
        L.p(d0, "encoder");
        L.p(arr_v, "content");
        for(int v1 = 0; v1 < v; ++v1) {
            d0.u(this.getDescriptor(), v1, arr_v[v1]);
        }
    }

    @Override  // kotlinx.serialization.internal.a
    public int e(Object object0) {
        return this.w(((long[])object0));
    }

    @Override  // kotlinx.serialization.internal.x
    public void h(c c0, int v, Object object0, boolean z) {
        this.y(c0, v, ((f0)object0), z);
    }

    @Override  // kotlinx.serialization.internal.a
    public Object k(Object object0) {
        return this.z(((long[])object0));
    }

    @Override  // kotlinx.serialization.internal.B0
    public Object r() {
        return this.x();
    }

    @Override  // kotlinx.serialization.internal.B0
    public void t(c c0, int v, z0 z00, boolean z) {
        this.y(c0, v, ((f0)z00), z);
    }

    @Override  // kotlinx.serialization.internal.B0
    public void v(d d0, Object object0, int v) {
        this.A(d0, ((long[])object0), v);
    }

    protected int w(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        return arr_v.length;
    }

    @l
    protected long[] x() {
        return new long[0];
    }

    protected void y(@l c c0, int v, @l f0 f00, boolean z) {
        L.p(c0, "decoder");
        L.p(f00, "builder");
        f00.e(c0.e(this.getDescriptor(), v));
    }

    @l
    protected f0 z(@l long[] arr_v) {
        L.p(arr_v, "<this>");
        return new f0(arr_v);
    }
}

