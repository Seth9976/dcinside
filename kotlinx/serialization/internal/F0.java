package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.ranges.s;
import y4.l;

@b0
public final class f0 extends z0 {
    @l
    private long[] a;
    private int b;

    public f0(@l long[] arr_v) {
        L.p(arr_v, "bufferWithData");
        super();
        this.a = arr_v;
        this.b = arr_v.length;
        this.b(10);
    }

    @Override  // kotlinx.serialization.internal.z0
    public Object a() {
        return this.f();
    }

    @Override  // kotlinx.serialization.internal.z0
    public void b(int v) {
        long[] arr_v = this.a;
        if(arr_v.length < v) {
            long[] arr_v1 = Arrays.copyOf(arr_v, s.u(v, arr_v.length * 2));
            L.o(arr_v1, "copyOf(this, newSize)");
            this.a = arr_v1;
        }
    }

    @Override  // kotlinx.serialization.internal.z0
    public int d() {
        return this.b;
    }

    public final void e(long v) {
        z0.c(this, 0, 1, null);
        int v1 = this.d();
        this.b = v1 + 1;
        this.a[v1] = v;
    }

    @l
    public long[] f() {
        long[] arr_v = Arrays.copyOf(this.a, this.d());
        L.o(arr_v, "copyOf(this, newSize)");
        return arr_v;
    }
}

