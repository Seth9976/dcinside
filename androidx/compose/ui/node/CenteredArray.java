package androidx.compose.ui.node;

import java.util.Arrays;
import kotlin.jvm.internal.L;
import y4.l;
import z3.g;

@g
final class CenteredArray {
    @l
    private final int[] a;

    private CenteredArray(int[] arr_v) {
        this.a = arr_v;
    }

    public static final CenteredArray a(int[] arr_v) {
        return new CenteredArray(arr_v);
    }

    @l
    public static int[] b(@l int[] arr_v) {
        L.p(arr_v, "data");
        return arr_v;
    }

    // 去混淆评级： 低(20)
    public static boolean c(int[] arr_v, Object object0) {
        return object0 instanceof CenteredArray ? L.g(arr_v, ((CenteredArray)object0).j()) : false;
    }

    public static final boolean d(int[] arr_v, int[] arr_v1) {
        return L.g(arr_v, arr_v1);
    }

    public static final int e(int[] arr_v, int v) {
        return arr_v[v + CenteredArray.f(arr_v)];
    }

    @Override
    public boolean equals(Object object0) {
        return CenteredArray.c(this.a, object0);
    }

    private static final int f(int[] arr_v) {
        return arr_v.length / 2;
    }

    public static int g(int[] arr_v) {
        return Arrays.hashCode(arr_v);
    }

    public static final void h(int[] arr_v, int v, int v1) {
        arr_v[v + CenteredArray.f(arr_v)] = v1;
    }

    @Override
    public int hashCode() {
        return CenteredArray.g(this.a);
    }

    public static String i(int[] arr_v) {
        return "CenteredArray(data=" + Arrays.toString(arr_v) + ')';
    }

    public final int[] j() {
        return this.a;
    }

    @Override
    public String toString() {
        return CenteredArray.i(this.a);
    }
}

