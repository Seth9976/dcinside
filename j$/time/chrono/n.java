package j$.time.chrono;

import j..time.temporal.a;

abstract class n {
    static final int[] a;

    static {
        int[] arr_v = new int[a.values().length];
        n.a = arr_v;
        try {
            arr_v[a.DAY_OF_MONTH.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            n.a[a.DAY_OF_YEAR.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            n.a[a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            n.a[a.YEAR.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            n.a[a.YEAR_OF_ERA.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            n.a[a.ERA.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

