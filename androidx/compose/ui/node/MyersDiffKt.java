package androidx.compose.ui.node;

import kotlin.jvm.internal.L;
import y4.l;

public final class MyersDiffKt {
    private static final void b(int v, int v1, IntStack intStack0, DiffCallback diffCallback0) {
        while(intStack0.b()) {
            int v2 = intStack0.d();
            int v3 = intStack0.d();
            int v4 = intStack0.d();
            while(v > v4) {
                --v;
                diffCallback0.remove(v);
            }
            while(v1 > v3) {
                --v1;
                diffCallback0.b(v, v1);
            }
            while(v2 > 0) {
                --v;
                --v1;
                diffCallback0.c(v, v1);
                --v2;
            }
        }
        while(v > 0) {
            --v;
            diffCallback0.remove(v);
        }
        while(v1 > 0) {
            --v1;
            diffCallback0.b(v, v1);
        }
    }

    private static final boolean c(int v, int v1, int v2, int v3, DiffCallback diffCallback0, int[] arr_v, int[] arr_v1, int v4, int[] arr_v2) {
        int v8;
        int v7;
        int v5 = v1 - v - (v3 - v2);
        for(int v6 = -v4; v6 <= v4; v6 += 2) {
            if(v6 == -v4 || v6 != v4 && CenteredArray.e(arr_v1, v6 + 1) < CenteredArray.e(arr_v1, v6 - 1)) {
                v7 = CenteredArray.e(arr_v1, v6 + 1);
                v8 = v7;
            }
            else {
                v7 = CenteredArray.e(arr_v1, v6 - 1);
                v8 = v7 - 1;
            }
            int v9 = v3 - (v1 - v8 - v6);
            int v10 = v4 == 0 || v8 != v7 ? v9 : v9 + 1;
            while(v8 > v && v9 > v2 && diffCallback0.a(v8 - 1, v9 - 1)) {
                --v8;
                --v9;
            }
            CenteredArray.h(arr_v1, v6, v8);
            if(v5 % 2 == 0) {
                int v11 = v5 - v6;
                if(v11 >= -v4 && v11 <= v4 && CenteredArray.e(arr_v, v11) >= v8) {
                    MyersDiffKt.f(v8, v9, v7, v10, true, arr_v2);
                    return true;
                }
            }
        }
        return false;
    }

    private static final IntStack d(int v, int v1, DiffCallback diffCallback0) {
        int v2 = (v + v1 + 1) / 2;
        IntStack intStack0 = new IntStack(v2 * 3);
        IntStack intStack1 = new IntStack(v2 * 4);
        intStack1.f(0, v, 0, v1);
        int v3 = v2 * 2 + 1;
        int[] arr_v = CenteredArray.b(new int[v3]);
        int[] arr_v1 = CenteredArray.b(new int[v3]);
        int[] arr_v2 = Snake.c(new int[5]);
        while(intStack1.b()) {
            int v4 = intStack1.d();
            int v5 = intStack1.d();
            int v6 = intStack1.d();
            int v7 = intStack1.d();
            int v8 = v7;
            int v9 = v6;
            int v10 = v5;
            int v11 = v4;
            if(MyersDiffKt.h(v7, v6, v5, v4, diffCallback0, arr_v, arr_v1, arr_v2)) {
                if(Snake.g(arr_v2) > 0) {
                    Snake.a(arr_v2, intStack0);
                }
                intStack1.f(v8, Snake.l(arr_v2), v10, Snake.m(arr_v2));
                intStack1.f(Snake.h(arr_v2), v9, Snake.i(arr_v2), v11);
            }
        }
        intStack0.h();
        intStack0.e(v, v1, 0);
        return intStack0;
    }

    public static final void e(int v, int v1, @l DiffCallback diffCallback0) {
        L.p(diffCallback0, "callback");
        MyersDiffKt.b(v, v1, MyersDiffKt.d(v, v1, diffCallback0), diffCallback0);
    }

    public static final void f(int v, int v1, int v2, int v3, boolean z, @l int[] arr_v) {
        L.p(arr_v, "data");
        arr_v[0] = v;
        arr_v[1] = v1;
        arr_v[2] = v2;
        arr_v[3] = v3;
        arr_v[4] = z;
    }

    private static final boolean g(int v, int v1, int v2, int v3, DiffCallback diffCallback0, int[] arr_v, int[] arr_v1, int v4, int[] arr_v2) {
        int v8;
        int v7;
        int v5 = v1 - v - (v3 - v2);
        boolean z = Math.abs(v5) % 2 == 1;
        for(int v6 = -v4; v6 <= v4; v6 += 2) {
            if(v6 == -v4 || v6 != v4 && CenteredArray.e(arr_v, v6 + 1) > CenteredArray.e(arr_v, v6 - 1)) {
                v7 = CenteredArray.e(arr_v, v6 + 1);
                v8 = v7;
            }
            else {
                v7 = CenteredArray.e(arr_v, v6 - 1);
                v8 = v7 + 1;
            }
            int v9 = v2 + (v8 - v) - v6;
            int v10 = v4 == 0 || v8 != v7 ? v9 : v9 - 1;
            while(v8 < v1 && v9 < v3 && diffCallback0.a(v8, v9)) {
                ++v8;
                ++v9;
            }
            CenteredArray.h(arr_v, v6, v8);
            if(z) {
                int v11 = v5 - v6;
                if(v11 >= 1 - v4 && v11 <= v4 - 1 && CenteredArray.e(arr_v1, v11) <= v8) {
                    MyersDiffKt.f(v7, v10, v8, v9, false, arr_v2);
                    return true;
                }
            }
        }
        return false;
    }

    private static final boolean h(int v, int v1, int v2, int v3, DiffCallback diffCallback0, int[] arr_v, int[] arr_v1, int[] arr_v2) {
        int v4 = v1 - v;
        int v5 = v3 - v2;
        if(v4 >= 1 && v5 >= 1) {
            CenteredArray.h(arr_v, 1, v);
            CenteredArray.h(arr_v1, 1, v1);
            for(int v6 = 0; v6 < (v4 + v5 + 1) / 2; ++v6) {
                if(MyersDiffKt.g(v, v1, v2, v3, diffCallback0, arr_v, arr_v1, v6, arr_v2)) {
                    return true;
                }
                if(MyersDiffKt.c(v, v1, v2, v3, diffCallback0, arr_v, arr_v1, v6, arr_v2)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static final void i(int[] arr_v, int v, int v1) {
        int v2 = arr_v[v];
        arr_v[v] = arr_v[v1];
        arr_v[v1] = v2;
    }
}

