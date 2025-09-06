package j$.time.temporal;

abstract class b {
    static final int[] a;

    static {
        int[] arr_v = new int[h.values().length];
        b.a = arr_v;
        try {
            arr_v[h.WEEK_BASED_YEARS.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            b.a[h.QUARTER_YEARS.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

