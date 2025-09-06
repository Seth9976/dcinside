package j$.time.chrono;

import j..time.temporal.ChronoUnit;

abstract class e {
    static final int[] a;

    static {
        int[] arr_v = new int[ChronoUnit.values().length];
        e.a = arr_v;
        try {
            arr_v[ChronoUnit.NANOS.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.a[ChronoUnit.MICROS.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.a[ChronoUnit.MILLIS.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.a[ChronoUnit.SECONDS.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.a[ChronoUnit.MINUTES.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.a[ChronoUnit.HOURS.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.a[ChronoUnit.HALF_DAYS.ordinal()] = 7;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

