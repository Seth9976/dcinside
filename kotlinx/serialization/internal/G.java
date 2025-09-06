package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.ranges.s;
import y4.l;

@b0
public final class g extends z0 {
    @l
    private boolean[] a;
    private int b;

    public g(@l boolean[] arr_z) {
        L.p(arr_z, "bufferWithData");
        super();
        this.a = arr_z;
        this.b = arr_z.length;
        this.b(10);
    }

    @Override  // kotlinx.serialization.internal.z0
    public Object a() {
        return this.f();
    }

    @Override  // kotlinx.serialization.internal.z0
    public void b(int v) {
        boolean[] arr_z = this.a;
        if(arr_z.length < v) {
            boolean[] arr_z1 = Arrays.copyOf(arr_z, s.u(v, arr_z.length * 2));
            L.o(arr_z1, "copyOf(this, newSize)");
            this.a = arr_z1;
        }
    }

    @Override  // kotlinx.serialization.internal.z0
    public int d() {
        return this.b;
    }

    public final void e(boolean z) {
        z0.c(this, 0, 1, null);
        int v = this.d();
        this.b = v + 1;
        this.a[v] = z;
    }

    @l
    public boolean[] f() {
        boolean[] arr_z = Arrays.copyOf(this.a, this.d());
        L.o(arr_z, "copyOf(this, newSize)");
        return arr_z;
    }
}

