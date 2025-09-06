package j$.time.zone;

abstract class c {
    static final int[] a;

    static {
        int[] arr_v = new int[d.values().length];
        c.a = arr_v;
        try {
            arr_v[d.UTC.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.a[d.STANDARD.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

