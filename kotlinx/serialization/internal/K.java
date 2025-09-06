package kotlinx.serialization.internal;

import P3.a;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.o;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.i;
import y4.l;

@b0
public final class k extends B0 implements i {
    @l
    public static final k c;

    static {
        k.c = new k();
    }

    private k() {
        super(a.C(o.a));
    }

    protected void A(@l d d0, @l byte[] arr_b, int v) {
        L.p(d0, "encoder");
        L.p(arr_b, "content");
        for(int v1 = 0; v1 < v; ++v1) {
            d0.j(this.getDescriptor(), v1, arr_b[v1]);
        }
    }

    @Override  // kotlinx.serialization.internal.a
    public int e(Object object0) {
        return this.w(((byte[])object0));
    }

    @Override  // kotlinx.serialization.internal.x
    public void h(c c0, int v, Object object0, boolean z) {
        this.y(c0, v, ((j)object0), z);
    }

    @Override  // kotlinx.serialization.internal.a
    public Object k(Object object0) {
        return this.z(((byte[])object0));
    }

    // 去混淆评级： 低(20)
    @Override  // kotlinx.serialization.internal.B0
    public Object r() {
        return new byte[0];
    }

    @Override  // kotlinx.serialization.internal.B0
    public void t(c c0, int v, z0 z00, boolean z) {
        this.y(c0, v, ((j)z00), z);
    }

    @Override  // kotlinx.serialization.internal.B0
    public void v(d d0, Object object0, int v) {
        this.A(d0, ((byte[])object0), v);
    }

    protected int w(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        return arr_b.length;
    }

    @l
    protected byte[] x() [...] // 潜在的解密器

    protected void y(@l c c0, int v, @l j j0, boolean z) {
        L.p(c0, "decoder");
        L.p(j0, "builder");
        j0.e(c0.B(this.getDescriptor(), v));
    }

    @l
    protected j z(@l byte[] arr_b) {
        L.p(arr_b, "<this>");
        return new j(arr_b);
    }
}

