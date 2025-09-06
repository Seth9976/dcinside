package j$.time.chrono;

import j..time.temporal.a;

abstract class w {
    static final int[] a;

    static {
        int[] arr_v = new int[a.values().length];
        w.a = arr_v;
        try {
            arr_v[a.DAY_OF_MONTH.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            w.a[a.DAY_OF_YEAR.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            w.a[a.YEAR_OF_ERA.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            w.a[a.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            w.a[a.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            w.a[a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            w.a[a.ALIGNED_WEEK_OF_YEAR.ordinal()] = 7;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            w.a[a.ERA.ordinal()] = 8;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            w.a[a.YEAR.ordinal()] = 9;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

