package kotlinx.serialization.internal;

import P3.a;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.i;
import y4.l;

@b0
public final class h extends B0 implements i {
    @l
    public static final h c;

    static {
        h.c = new h();
    }

    private h() {
        super(a.B(m.a));
    }

    protected void A(@l d d0, @l boolean[] arr_z, int v) {
        L.p(d0, "encoder");
        L.p(arr_z, "content");
        for(int v1 = 0; v1 < v; ++v1) {
            d0.o(this.getDescriptor(), v1, arr_z[v1]);
        }
    }

    @Override  // kotlinx.serialization.internal.a
    public int e(Object object0) {
        return this.w(((boolean[])object0));
    }

    @Override  // kotlinx.serialization.internal.x
    public void h(c c0, int v, Object object0, boolean z) {
        this.y(c0, v, ((g)object0), z);
    }

    @Override  // kotlinx.serialization.internal.a
    public Object k(Object object0) {
        return this.z(((boolean[])object0));
    }

    @Override  // kotlinx.serialization.internal.B0
    public Object r() {
        return this.x();
    }

    @Override  // kotlinx.serialization.internal.B0
    public void t(c c0, int v, z0 z00, boolean z) {
        this.y(c0, v, ((g)z00), z);
    }

    @Override  // kotlinx.serialization.internal.B0
    public void v(d d0, Object object0, int v) {
        this.A(d0, ((boolean[])object0), v);
    }

    protected int w(@l boolean[] arr_z) {
        L.p(arr_z, "<this>");
        return arr_z.length;
    }

    @l
    protected boolean[] x() {
        return new boolean[0];
    }

    protected void y(@l c c0, int v, @l g g0, boolean z) {
        L.p(c0, "decoder");
        L.p(g0, "builder");
        g0.e(c0.C(this.getDescriptor(), v));
    }

    @l
    protected g z(@l boolean[] arr_z) {
        L.p(arr_z, "<this>");
        return new g(arr_z);
    }
}

