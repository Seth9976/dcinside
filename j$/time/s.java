package j$.time;

import j..time.temporal.ChronoUnit;
import j..time.temporal.a;

abstract class s {
    static final int[] a;
    static final int[] b;

    static {
        int[] arr_v = new int[ChronoUnit.values().length];
        s.b = arr_v;
        try {
            arr_v[ChronoUnit.MONTHS.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            s.b[ChronoUnit.YEARS.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            s.b[ChronoUnit.DECADES.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            s.b[ChronoUnit.CENTURIES.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            s.b[ChronoUnit.MILLENNIA.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            s.b[ChronoUnit.ERAS.ordinal()] = 6;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        int[] arr_v1 = new int[a.values().length];
        s.a = arr_v1;
        try {
            arr_v1[a.MONTH_OF_YEAR.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            s.a[a.PROLEPTIC_MONTH.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            s.a[a.YEAR_OF_ERA.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            s.a[a.YEAR.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            s.a[a.ERA.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

