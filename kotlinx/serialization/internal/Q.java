package kotlinx.serialization.internal;

import P3.a;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.r;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.i;
import y4.l;

@b0
public final class q extends B0 implements i {
    @l
    public static final q c;

    static {
        q.c = new q();
    }

    private q() {
        super(a.D(r.a));
    }

    protected void A(@l d d0, @l char[] arr_c, int v) {
        L.p(d0, "encoder");
        L.p(arr_c, "content");
        for(int v1 = 0; v1 < v; ++v1) {
            d0.i(this.getDescriptor(), v1, arr_c[v1]);
        }
    }

    @Override  // kotlinx.serialization.internal.a
    public int e(Object object0) {
        return this.w(((char[])object0));
    }

    @Override  // kotlinx.serialization.internal.x
    public void h(c c0, int v, Object object0, boolean z) {
        this.y(c0, v, ((p)object0), z);
    }

    @Override  // kotlinx.serialization.internal.a
    public Object k(Object object0) {
        return this.z(((char[])object0));
    }

    @Override  // kotlinx.serialization.internal.B0
    public Object r() {
        return this.x();
    }

    @Override  // kotlinx.serialization.internal.B0
    public void t(c c0, int v, z0 z00, boolean z) {
        this.y(c0, v, ((p)z00), z);
    }

    @Override  // kotlinx.serialization.internal.B0
    public void v(d d0, Object object0, int v) {
        this.A(d0, ((char[])object0), v);
    }

    protected int w(@l char[] arr_c) {
        L.p(arr_c, "<this>");
        return arr_c.length;
    }

    @l
    protected char[] x() {
        return new char[0];
    }

    protected void y(@l c c0, int v, @l p p0, boolean z) {
        L.p(c0, "decoder");
        L.p(p0, "builder");
        p0.e(c0.r(this.getDescriptor(), v));
    }

    @l
    protected p z(@l char[] arr_c) {
        L.p(arr_c, "<this>");
        return new p(arr_c);
    }
}

