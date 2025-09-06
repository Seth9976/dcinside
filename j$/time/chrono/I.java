package j$.time.chrono;

import j..time.temporal.a;

abstract class i {
    static final int[] a;

    static {
        int[] arr_v = new int[a.values().length];
        i.a = arr_v;
        try {
            arr_v[a.INSTANT_SECONDS.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            i.a[a.OFFSET_SECONDS.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

