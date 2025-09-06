package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.O0;
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
public final class c1 extends z0 {
    @l
    private short[] a;
    private int b;

    private c1(short[] arr_v) {
        this.a = arr_v;
        this.b = O0.o(arr_v);
        this.b(10);
    }

    public c1(short[] arr_v, w w0) {
        this(arr_v);
    }

    @Override  // kotlinx.serialization.internal.z0
    public Object a() {
        return O0.b(this.f());
    }

    @Override  // kotlinx.serialization.internal.z0
    public void b(int v) {
        if(O0.o(this.a) < v) {
            short[] arr_v = Arrays.copyOf(this.a, s.u(v, O0.o(this.a) * 2));
            L.o(arr_v, "copyOf(this, newSize)");
            this.a = O0.d(arr_v);
        }
    }

    @Override  // kotlinx.serialization.internal.z0
    public int d() {
        return this.b;
    }

    public final void e(short v) {
        z0.c(this, 0, 1, null);
        int v1 = this.d();
        this.b = v1 + 1;
        O0.u(this.a, v1, v);
    }

    @l
    public short[] f() {
        short[] arr_v = Arrays.copyOf(this.a, this.d());
        L.o(arr_v, "copyOf(this, newSize)");
        return O0.d(arr_v);
    }
}

