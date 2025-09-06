package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.I0;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import kotlin.t;
import kotlinx.serialization.f;
import y4.l;

@b0
@t
@f
public final class Z0 extends z0 {
    @l
    private long[] a;
    private int b;

    private Z0(long[] arr_v) {
        this.a = arr_v;
        this.b = I0.o(arr_v);
        this.b(10);
    }

    public Z0(long[] arr_v, w w0) {
        this(arr_v);
    }

    @Override  // kotlinx.serialization.internal.z0
    public Object a() {
        return I0.b(this.f());
    }

    @Override  // kotlinx.serialization.internal.z0
    public void b(int v) {
        if(I0.o(this.a) < v) {
            long[] arr_v = Arrays.copyOf(this.a, s.u(v, I0.o(this.a) * 2));
            L.o(arr_v, "copyOf(this, newSize)");
            this.a = I0.d(arr_v);
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
        I0.u(this.a, v1, v);
    }

    @l
    public long[] f() {
        long[] arr_v = Arrays.copyOf(this.a, this.d());
        L.o(arr_v, "copyOf(this, newSize)");
        return I0.d(arr_v);
    }
}

