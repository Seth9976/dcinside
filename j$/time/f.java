package j$.time;

import j..time.temporal.ChronoUnit;
import j..time.temporal.a;

abstract class f {
    static final int[] a;
    static final int[] b;

    static {
        int[] arr_v = new int[ChronoUnit.values().length];
        f.b = arr_v;
        try {
            arr_v[ChronoUnit.DAYS.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            f.b[ChronoUnit.WEEKS.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            f.b[ChronoUnit.MONTHS.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            f.b[ChronoUnit.YEARS.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            f.b[ChronoUnit.DECADES.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            f.b[ChronoUnit.CENTURIES.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            f.b[ChronoUnit.MILLENNIA.ordinal()] = 7;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            f.b[ChronoUnit.ERAS.ordinal()] = 8;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        int[] arr_v1 = new int[a.values().length];
        f.a = arr_v1;
        try {
            arr_v1[a.DAY_OF_MONTH.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            f.a[a.DAY_OF_YEAR.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            f.a[a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            f.a[a.YEAR_OF_ERA.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            f.a[a.DAY_OF_WEEK.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            f.a[a.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            f.a[a.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 7;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            f.a[a.EPOCH_DAY.ordinal()] = 8;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            f.a[a.ALIGNED_WEEK_OF_YEAR.ordinal()] = 9;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            f.a[a.MONTH_OF_YEAR.ordinal()] = 10;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            f.a[a.PROLEPTIC_MONTH.ordinal()] = 11;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            f.a[a.YEAR.ordinal()] = 12;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            f.a[a.ERA.ordinal()] = 13;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

