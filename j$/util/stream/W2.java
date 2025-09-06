package j$.util.stream;

abstract class w2 {
    static final int[] a;

    static {
        int[] arr_v = new int[d3.values().length];
        w2.a = arr_v;
        try {
            arr_v[d3.REFERENCE.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            w2.a[d3.INT_VALUE.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            w2.a[d3.LONG_VALUE.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            w2.a[d3.DOUBLE_VALUE.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

