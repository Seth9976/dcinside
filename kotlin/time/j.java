package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.J;
import kotlin.W0;
import kotlin.h0;
import kotlin.jvm.internal.L;
import y4.l;

class j {
    public final class a {
        public static final int[] a;

        static {
            int[] arr_v = new int[TimeUnit.values().length];
            try {
                arr_v[TimeUnit.NANOSECONDS.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TimeUnit.MICROSECONDS.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TimeUnit.MILLISECONDS.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TimeUnit.SECONDS.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TimeUnit.MINUTES.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TimeUnit.HOURS.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[TimeUnit.DAYS.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            a.a = arr_v;
        }
    }

    @h0(version = "1.3")
    public static final double a(double f, @l h h0, @l h h1) {
        L.p(h0, "sourceUnit");
        L.p(h1, "targetUnit");
        long v = h1.c().convert(1L, h0.c());
        return v <= 0L ? f / ((double)h0.c().convert(1L, h1.c())) : f * ((double)v);
    }

    @h0(version = "1.5")
    public static final long b(long v, @l h h0, @l h h1) {
        L.p(h0, "sourceUnit");
        L.p(h1, "targetUnit");
        return h1.c().convert(v, h0.c());
    }

    @h0(version = "1.5")
    public static final long c(long v, @l h h0, @l h h1) {
        L.p(h0, "sourceUnit");
        L.p(h1, "targetUnit");
        return h1.c().convert(v, h0.c());
    }

    @W0(markerClass = {kotlin.time.l.class})
    @h0(version = "1.8")
    @l
    public static final h d(@l TimeUnit timeUnit0) {
        L.p(timeUnit0, "<this>");
        switch(a.a[timeUnit0.ordinal()]) {
            case 1: {
                return h.b;
            }
            case 2: {
                return h.c;
            }
            case 3: {
                return h.d;
            }
            case 4: {
                return h.e;
            }
            case 5: {
                return h.f;
            }
            case 6: {
                return h.g;
            }
            case 7: {
                return h.h;
            }
            default: {
                throw new J();
            }
        }
    }

    @W0(markerClass = {kotlin.time.l.class})
    @h0(version = "1.8")
    @l
    public static final TimeUnit e(@l h h0) {
        L.p(h0, "<this>");
        return h0.c();
    }
}

