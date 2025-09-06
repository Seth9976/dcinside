package androidx.compose.ui.node;

import java.util.Arrays;
import kotlin.jvm.internal.L;
import y4.l;
import z3.g;

@g
final class Snake {
    @l
    private final int[] a;

    private Snake(int[] arr_v) {
        this.a = arr_v;
    }

    public static final void a(int[] arr_v, @l IntStack intStack0) {
        L.p(intStack0, "diagonals");
        if(Snake.j(arr_v)) {
            if(Snake.k(arr_v)) {
                intStack0.e(Snake.l(arr_v), Snake.m(arr_v), Snake.g(arr_v));
                return;
            }
            if(Snake.o(arr_v)) {
                intStack0.e(Snake.l(arr_v), Snake.m(arr_v) + 1, Snake.g(arr_v));
                return;
            }
            intStack0.e(Snake.l(arr_v) + 1, Snake.m(arr_v), Snake.g(arr_v));
            return;
        }
        intStack0.e(Snake.l(arr_v), Snake.m(arr_v), Snake.h(arr_v) - Snake.l(arr_v));
    }

    public static final Snake b(int[] arr_v) {
        return new Snake(arr_v);
    }

    @l
    public static int[] c(@l int[] arr_v) {
        L.p(arr_v, "data");
        return arr_v;
    }

    // 去混淆评级： 低(20)
    public static boolean d(int[] arr_v, Object object0) {
        return object0 instanceof Snake ? L.g(arr_v, ((Snake)object0).q()) : false;
    }

    public static final boolean e(int[] arr_v, int[] arr_v1) {
        return L.g(arr_v, arr_v1);
    }

    @Override
    public boolean equals(Object object0) {
        return Snake.d(this.a, object0);
    }

    @l
    public final int[] f() {
        return this.a;
    }

    public static final int g(int[] arr_v) {
        return Math.min(Snake.h(arr_v) - Snake.l(arr_v), Snake.i(arr_v) - Snake.m(arr_v));
    }

    public static final int h(int[] arr_v) {
        return arr_v[2];
    }

    @Override
    public int hashCode() {
        return Snake.n(this.a);
    }

    public static final int i(int[] arr_v) {
        return arr_v[3];
    }

    private static final boolean j(int[] arr_v) {
        return Snake.i(arr_v) - Snake.m(arr_v) != Snake.h(arr_v) - Snake.l(arr_v);
    }

    public static final boolean k(int[] arr_v) {
        return arr_v[4] != 0;
    }

    public static final int l(int[] arr_v) {
        return arr_v[0];
    }

    public static final int m(int[] arr_v) {
        return arr_v[1];
    }

    public static int n(int[] arr_v) {
        return Arrays.hashCode(arr_v);
    }

    private static final boolean o(int[] arr_v) {
        return Snake.i(arr_v) - Snake.m(arr_v) > Snake.h(arr_v) - Snake.l(arr_v);
    }

    @l
    public static String p(int[] arr_v) {
        return "Snake(" + Snake.l(arr_v) + ',' + Snake.m(arr_v) + ',' + Snake.h(arr_v) + ',' + Snake.i(arr_v) + ',' + Snake.k(arr_v) + ')';
    }

    public final int[] q() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        return Snake.p(this.a);
    }
}

