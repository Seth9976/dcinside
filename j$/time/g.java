package j$.time;

import j..time.temporal.ChronoUnit;

abstract class g {
    static final int[] a;

    static {
        int[] arr_v = new int[ChronoUnit.values().length];
        g.a = arr_v;
        try {
            arr_v[ChronoUnit.NANOS.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            g.a[ChronoUnit.MICROS.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            g.a[ChronoUnit.MILLIS.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            g.a[ChronoUnit.SECONDS.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            g.a[ChronoUnit.MINUTES.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            g.a[ChronoUnit.HOURS.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            g.a[ChronoUnit.HALF_DAYS.ordinal()] = 7;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

