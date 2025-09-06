package com.google.firebase.perf.util;

import java.util.concurrent.TimeUnit;

public class h {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[TimeUnit.values().length];
            a.a = arr_v;
            try {
                arr_v[TimeUnit.NANOSECONDS.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    private long a;
    private long b;
    private TimeUnit c;
    static final boolean d;

    static {
    }

    public h(long v, long v1, TimeUnit timeUnit0) {
        this.a = v;
        this.b = v1;
        this.c = timeUnit0;
    }

    public double a() {
        switch(a.a[this.c.ordinal()]) {
            case 1: {
                return ((double)this.a) / ((double)this.b) * ((double)TimeUnit.SECONDS.toNanos(1L));
            }
            case 2: {
                return ((double)this.a) / ((double)this.b) * ((double)TimeUnit.SECONDS.toMicros(1L));
            }
            case 3: {
                return ((double)this.a) / ((double)this.b) * ((double)TimeUnit.SECONDS.toMillis(1L));
            }
            default: {
                return ((double)this.a) / ((double)this.c.toSeconds(this.b));
            }
        }
    }
}

