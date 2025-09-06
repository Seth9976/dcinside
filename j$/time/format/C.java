package j$.time.format;

abstract class c {
    static final int[] a;

    static {
        int[] arr_v = new int[F.values().length];
        c.a = arr_v;
        try {
            arr_v[F.EXCEEDS_PAD.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.a[F.ALWAYS.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.a[F.NORMAL.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.a[F.NOT_NEGATIVE.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

