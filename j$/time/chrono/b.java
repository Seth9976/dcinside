package j$.time.chrono;

import j..time.temporal.a;

abstract class B {
    static final int[] a;

    static {
        int[] arr_v = new int[a.values().length];
        B.a = arr_v;
        try {
            arr_v[a.DAY_OF_MONTH.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            B.a[a.DAY_OF_YEAR.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            B.a[a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            B.a[a.YEAR_OF_ERA.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            B.a[a.PROLEPTIC_MONTH.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            B.a[a.YEAR.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            B.a[a.ERA.ordinal()] = 7;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

