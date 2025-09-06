package j$.time.chrono;

import j..time.temporal.a;

abstract class p {
    static final int[] a;

    static {
        int[] arr_v = new int[a.values().length];
        p.a = arr_v;
        try {
            arr_v[a.DAY_OF_MONTH.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            p.a[a.DAY_OF_YEAR.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            p.a[a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            p.a[a.DAY_OF_WEEK.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            p.a[a.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            p.a[a.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            p.a[a.EPOCH_DAY.ordinal()] = 7;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            p.a[a.ALIGNED_WEEK_OF_YEAR.ordinal()] = 8;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            p.a[a.MONTH_OF_YEAR.ordinal()] = 9;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            p.a[a.PROLEPTIC_MONTH.ordinal()] = 10;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            p.a[a.YEAR_OF_ERA.ordinal()] = 11;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            p.a[a.YEAR.ordinal()] = 12;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            p.a[a.ERA.ordinal()] = 13;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

