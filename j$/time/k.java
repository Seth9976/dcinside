package j$.time;

import j..time.temporal.a;

abstract class k {
    static final int[] a;

    static {
        int[] arr_v = new int[a.values().length];
        k.a = arr_v;
        try {
            arr_v[a.DAY_OF_MONTH.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            k.a[a.MONTH_OF_YEAR.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

