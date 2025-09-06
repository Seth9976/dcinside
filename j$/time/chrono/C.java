package j$.time.chrono;

import j..time.temporal.ChronoUnit;

abstract class c {
    static final int[] a;

    static {
        int[] arr_v = new int[ChronoUnit.values().length];
        c.a = arr_v;
        try {
            arr_v[ChronoUnit.DAYS.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.a[ChronoUnit.WEEKS.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.a[ChronoUnit.MONTHS.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.a[ChronoUnit.YEARS.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.a[ChronoUnit.DECADES.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.a[ChronoUnit.CENTURIES.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.a[ChronoUnit.MILLENNIA.ordinal()] = 7;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            c.a[ChronoUnit.ERAS.ordinal()] = 8;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

