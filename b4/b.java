package b4;

import j..util.StringJoiner;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public enum b {
    UNUSED(null, null),
    GENERAL(null, null),
    DATE(new Class[]{Date.class, Number.class}, new String[]{"date", "time"}),
    NUMBER(new Class[]{Number.class}, new String[]{"number", "choice"});

    public final Class[] a;
    public final String[] b;
    private static final b[] g;
    private static final b[] h;

    static {
        b.g = new b[]{b.e, b.f};
        b.h = new b[]{b.e, b.f};
    }

    private b(Class[] arr_class, String[] arr_s) {
        this.a = arr_class;
        this.b = arr_s;
    }

    private static b[] a() [...] // Inlined contents

    private static Set b(Object[] arr_object) {
        return new HashSet(Arrays.asList(arr_object));
    }

    public static b c(b b0, b b1) {
        b b2 = b.c;
        if(b0 == b2) {
            return b1;
        }
        if(b1 == b2) {
            return b0;
        }
        b b3 = b.d;
        if(b0 == b3) {
            return b1;
        }
        if(b1 == b3) {
            return b0;
        }
        Set set0 = b.b(b0.a);
        set0.retainAll(b.b(b1.a));
        b[] arr_b = b.h;
        for(int v = 0; v < arr_b.length; ++v) {
            b b4 = arr_b[v];
            if(b.b(b4.a).equals(set0)) {
                return b4;
            }
        }
        throw new RuntimeException();
    }

    public boolean d(Class class0) {
        Class[] arr_class = this.a;
        if(arr_class == null) {
            return true;
        }
        if(class0 == Void.TYPE) {
            return true;
        }
        for(int v = 0; v < arr_class.length; ++v) {
            if(arr_class[v].isAssignableFrom(class0)) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(b b0, b b1) {
        return b.c(b0, b1) == b0;
    }

    public static b f(String s) {
        String s1 = s.toLowerCase();
        b[] arr_b = b.g;
        for(int v = 0; v < arr_b.length; ++v) {
            b b0 = arr_b[v];
            String[] arr_s = b0.b;
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                if(arr_s[v1].equals(s1)) {
                    return b0;
                }
            }
        }
        throw new IllegalArgumentException("Invalid format type " + s1);
    }

    public static b g(b b0, b b1) {
        b b2 = b.c;
        if(b0 != b2 && b1 != b2) {
            b2 = b.d;
            if(b0 != b2 && b1 != b2) {
                return b0 == b.e || b1 == b.e ? b.e : b.f;
            }
        }
        return b2;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(this.name());
        if(this.a == null) {
            stringBuilder0.append(" conversion category (all types)");
            return stringBuilder0.toString();
        }
        StringJoiner stringJoiner0 = new StringJoiner(", ", " conversion category (one of: ", ")");
        Class[] arr_class = this.a;
        for(int v = 0; v < arr_class.length; ++v) {
            stringJoiner0.add(arr_class[v].getCanonicalName());
        }
        stringBuilder0.append(stringJoiner0);
        return stringBuilder0.toString();
    }
}

