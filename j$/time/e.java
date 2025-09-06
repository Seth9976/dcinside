package j$.time;

import j..time.temporal.ChronoUnit;
import j..time.temporal.a;

abstract class e {
    static final int[] a;
    static final int[] b;

    static {
        int[] arr_v = new int[ChronoUnit.values().length];
        e.b = arr_v;
        try {
            arr_v[ChronoUnit.NANOS.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.b[ChronoUnit.MICROS.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.b[ChronoUnit.MILLIS.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.b[ChronoUnit.SECONDS.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.b[ChronoUnit.MINUTES.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.b[ChronoUnit.HOURS.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.b[ChronoUnit.HALF_DAYS.ordinal()] = 7;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.b[ChronoUnit.DAYS.ordinal()] = 8;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        int[] arr_v1 = new int[a.values().length];
        e.a = arr_v1;
        try {
            arr_v1[a.NANO_OF_SECOND.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.a[a.MICRO_OF_SECOND.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.a[a.MILLI_OF_SECOND.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            e.a[a.INSTANT_SECONDS.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

