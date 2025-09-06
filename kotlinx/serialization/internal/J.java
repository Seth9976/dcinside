package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.ranges.s;
import y4.l;

@b0
public final class j extends z0 {
    @l
    private byte[] a;
    private int b;

    public j(@l byte[] arr_b) {
        L.p(arr_b, "bufferWithData");
        super();
        this.a = arr_b;
        this.b = arr_b.length;
        this.b(10);
    }

    @Override  // kotlinx.serialization.internal.z0
    public Object a() {
        return this.f();
    }

    @Override  // kotlinx.serialization.internal.z0
    public void b(int v) {
        byte[] arr_b = this.a;
        if(arr_b.length < v) {
            byte[] arr_b1 = Arrays.copyOf(arr_b, s.u(v, arr_b.length * 2));
            L.o(arr_b1, "copyOf(this, newSize)");
            this.a = arr_b1;
        }
    }

    @Override  // kotlinx.serialization.internal.z0
    public int d() {
        return this.b;
    }

    public final void e(byte b) {
        z0.c(this, 0, 1, null);
        int v = this.d();
        this.b = v + 1;
        this.a[v] = b;
    }

    @l
    public byte[] f() {
        byte[] arr_b = Arrays.copyOf(this.a, this.d());
        L.o(arr_b, "copyOf(this, newSize)");
        return arr_b;
    }
}

