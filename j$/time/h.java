package j$.time;

import j..time.temporal.ChronoUnit;
import j..time.temporal.a;

abstract class h {
    static final int[] a;
    static final int[] b;

    static {
        int[] arr_v = new int[ChronoUnit.values().length];
        h.b = arr_v;
        try {
            arr_v[ChronoUnit.NANOS.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            h.b[ChronoUnit.MICROS.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            h.b[ChronoUnit.MILLIS.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            h.b[ChronoUnit.SECONDS.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            h.b[ChronoUnit.MINUTES.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            h.b[ChronoUnit.HOURS.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            h.b[ChronoUnit.HALF_DAYS.ordinal()] = 7;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        int[] arr_v1 = new int[a.values().length];
        h.a = arr_v1;
        try {
            arr_v1[a.NANO_OF_SECOND.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            h.a[a.NANO_OF_DAY.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            h.a[a.MICRO_OF_SECOND.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            h.a[a.MICRO_OF_DAY.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            h.a[a.MILLI_OF_SECOND.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            h.a[a.MILLI_OF_DAY.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            h.a[a.SECOND_OF_MINUTE.ordinal()] = 7;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            h.a[a.SECOND_OF_DAY.ordinal()] = 8;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            h.a[a.MINUTE_OF_HOUR.ordinal()] = 9;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            h.a[a.MINUTE_OF_DAY.ordinal()] = 10;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            h.a[a.HOUR_OF_AMPM.ordinal()] = 11;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            h.a[a.CLOCK_HOUR_OF_AMPM.ordinal()] = 12;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            h.a[a.HOUR_OF_DAY.ordinal()] = 13;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            h.a[a.CLOCK_HOUR_OF_DAY.ordinal()] = 14;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            h.a[a.AMPM_OF_DAY.ordinal()] = 15;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

