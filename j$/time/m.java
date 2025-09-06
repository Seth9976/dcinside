package j$.time;

import j..time.temporal.a;

abstract class m {
    static final int[] a;

    static {
        int[] arr_v = new int[a.values().length];
        m.a = arr_v;
        try {
            arr_v[a.INSTANT_SECONDS.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            m.a[a.OFFSET_SECONDS.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

