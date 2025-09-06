package j$.com.android.tools.r8;

import j..time.format.G;
import j..util.Objects;
import j..util.function.b;
import j..util.function.e;
import j..util.function.f;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import sun.misc.Unsafe;

public abstract class a {
    public static b a(DoubleConsumer doubleConsumer0, DoubleConsumer doubleConsumer1) {
        Objects.requireNonNull(doubleConsumer1);
        return new b(doubleConsumer0, doubleConsumer1);
    }

    public static e b(IntConsumer intConsumer0, IntConsumer intConsumer1) {
        Objects.requireNonNull(intConsumer1);
        return new e(intConsumer0, intConsumer1);
    }

    public static f c(LongConsumer longConsumer0, LongConsumer longConsumer1) {
        Objects.requireNonNull(longConsumer1);
        return new f(longConsumer0, longConsumer1);
    }

    private static String d(long v, String s, Locale locale0) {
        TimeZone timeZone0 = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat(s, locale0);
        simpleDateFormat0.setTimeZone(timeZone0);
        Calendar calendar0 = Calendar.getInstance();
        calendar0.setTimeZone(timeZone0);
        calendar0.set(0x7E0, 1, ((int)v), 0, 0, 0);
        return simpleDateFormat0.format(calendar0.getTime());
    }

    private static String e(long v, String s, Locale locale0) {
        TimeZone timeZone0 = TimeZone.getTimeZone("UTC");
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat(s, locale0);
        simpleDateFormat0.setTimeZone(timeZone0);
        Calendar calendar0 = Calendar.getInstance();
        calendar0.setTimeZone(timeZone0);
        calendar0.set(0, ((int)v), 0, 0, 0, 0);
        return simpleDateFormat0.format(calendar0.getTime());
    }

    public static void f(HashMap hashMap0, DateFormatSymbols dateFormatSymbols0, Locale locale0) {
        String[] arr_s = dateFormatSymbols0.getWeekdays();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        LinkedHashMap linkedHashMap1 = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        boolean z = locale0 == Locale.SIMPLIFIED_CHINESE || locale0 == Locale.TRADITIONAL_CHINESE;
        for(long v = 1L; v <= ((long)arr_s.length); ++v) {
            String s = a.d(v, "cccc", locale0);
            linkedHashMap0.put(v, s);
            linkedHashMap1.put(v, (z ? new StringBuilder().appendCodePoint(s.codePointBefore(s.length())).toString() : s.substring(0, Character.charCount(s.codePointAt(0)))));
            linkedHashMap2.put(v, a.d(v, "ccc", locale0));
        }
        if(arr_s.length > 0) {
            hashMap0.put(G.FULL_STANDALONE, linkedHashMap0);
            hashMap0.put(G.NARROW_STANDALONE, linkedHashMap1);
            hashMap0.put(G.SHORT_STANDALONE, linkedHashMap2);
        }
    }

    public static void g(HashMap hashMap0, DateFormatSymbols dateFormatSymbols0, Locale locale0) {
        String[] arr_s = dateFormatSymbols0.getMonths();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        LinkedHashMap linkedHashMap1 = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for(long v = 1L; v <= ((long)arr_s.length); ++v) {
            String s = a.e(v, "LLLL", locale0);
            linkedHashMap0.put(v, s);
            linkedHashMap1.put(v, s.substring(0, Character.charCount(s.codePointAt(0))));
            linkedHashMap2.put(v, a.e(v, "LLL", locale0));
        }
        if(arr_s.length > 0) {
            hashMap0.put(G.FULL_STANDALONE, linkedHashMap0);
            hashMap0.put(G.NARROW_STANDALONE, linkedHashMap1);
            hashMap0.put(G.SHORT_STANDALONE, linkedHashMap2);
        }
    }

    public static int h(long v) {
        if(v != ((long)(((int)v)))) {
            throw new ArithmeticException();
        }
        return (int)v;
    }

    public static long i(long v, long v1) {
        long v2 = v + v1;
        if((((v1 ^ v) >= 0L ? 0 : 1) | ((v ^ v2) < 0L ? 0 : 1)) == 0) {
            throw new ArithmeticException();
        }
        return v2;
    }

    public static AbstractMap.SimpleImmutableEntry j(String s, String s1) {
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(s), Objects.requireNonNull(s1));
    }

    public static List k(Object[] arr_object) {
        ArrayList arrayList0 = new ArrayList(arr_object.length);
        for(int v = 0; v < arr_object.length; ++v) {
            arrayList0.add(Objects.requireNonNull(arr_object[v]));
        }
        return Collections.unmodifiableList(arrayList0);
    }

    public static boolean l(Unsafe unsafe0, Object object0, long v, Object object1) {
        do {
            if(unsafe0.compareAndSwapObject(object0, v, null, object1)) {
                return true;
            }
        }
        while(unsafe0.getObject(object0, v) == null);
        return false;
    }

    public static long m(long v, long v1) {
        long v2 = v % v1;
        if(v2 == 0L) {
            return 0L;
        }
        return ((v ^ v1) >> 0x3F | 1L) > 0L ? v2 : v2 + v1;
    }

    public static long n(long v, long v1) {
        long v2 = v / v1;
        if(v - v1 * v2 == 0L) {
            return v2;
        }
        return ((v ^ v1) >> 0x3F | 1L) >= 0L ? v2 : v2 - 1L;
    }

    public static long o(long v, long v1) {
        int v2 = Long.numberOfLeadingZeros(~v1) + (Long.numberOfLeadingZeros(v1) + (Long.numberOfLeadingZeros(~v) + Long.numberOfLeadingZeros(v)));
        if(v2 > 65) {
            return v * v1;
        }
        if(v2 >= 0x40) {
            int v3 = 0;
            int v4 = Long.compare(v, 0L);
            if(v1 != 0x8000000000000000L) {
                v3 = 1;
            }
            if(((v4 < 0 ? 0 : 1) | v3) != 0) {
                long v5 = v * v1;
                if(v4 == 0 || v5 / v == v1) {
                    return v5;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static long p(long v, long v1) {
        long v2 = v - v1;
        if((((v1 ^ v) < 0L ? 0 : 1) | ((v ^ v2) < 0L ? 0 : 1)) == 0) {
            throw new ArithmeticException();
        }
        return v2;
    }
}

