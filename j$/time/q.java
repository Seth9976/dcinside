package j$.time;

import j..time.temporal.ChronoUnit;
import j..time.temporal.a;

abstract class q {
    static final int[] a;
    static final int[] b;

    static {
        int[] arr_v = new int[ChronoUnit.values().length];
        q.b = arr_v;
        try {
            arr_v[ChronoUnit.YEARS.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            q.b[ChronoUnit.DECADES.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            q.b[ChronoUnit.CENTURIES.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            q.b[ChronoUnit.MILLENNIA.ordinal()] = 4;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            q.b[ChronoUnit.ERAS.ordinal()] = 5;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        int[] arr_v1 = new int[a.values().length];
        q.a = arr_v1;
        try {
            arr_v1[a.YEAR_OF_ERA.ordinal()] = 1;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            q.a[a.YEAR.ordinal()] = 2;
        }
        catch(NoSuchFieldError unused_ex) {
        }
        try {
            q.a[a.ERA.ordinal()] = 3;
        }
        catch(NoSuchFieldError unused_ex) {
        }
    }
}

