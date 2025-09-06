package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.ranges.s;
import y4.l;

@b0
public final class p extends z0 {
    @l
    private char[] a;
    private int b;

    public p(@l char[] arr_c) {
        L.p(arr_c, "bufferWithData");
        super();
        this.a = arr_c;
        this.b = arr_c.length;
        this.b(10);
    }

    @Override  // kotlinx.serialization.internal.z0
    public Object a() {
        return this.f();
    }

    @Override  // kotlinx.serialization.internal.z0
    public void b(int v) {
        char[] arr_c = this.a;
        if(arr_c.length < v) {
            char[] arr_c1 = Arrays.copyOf(arr_c, s.u(v, arr_c.length * 2));
            L.o(arr_c1, "copyOf(this, newSize)");
            this.a = arr_c1;
        }
    }

    @Override  // kotlinx.serialization.internal.z0
    public int d() {
        return this.b;
    }

    public final void e(char c) {
        z0.c(this, 0, 1, null);
        int v = this.d();
        this.b = v + 1;
        this.a[v] = c;
    }

    @l
    public char[] f() {
        char[] arr_c = Arrays.copyOf(this.a, this.d());
        L.o(arr_c, "copyOf(this, newSize)");
        return arr_c;
    }
}

