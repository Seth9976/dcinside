package j$.time.chrono;

import j..time.temporal.a;

abstract class z {
    static final int[] a;

    static {
        int[] arr_v = new int[a.values().length];
        z.a = arr_v;
        try {
            arr_v[a.PROLEPTIC_MONTH.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            z.a[a.YEAR_OF_ERA.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            z.a[a.YEAR.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

