package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.io.doubleparser.C;
import com.fasterxml.jackson.core.io.doubleparser.y;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class l {
    @Deprecated
    public static final String a = "2.2250738585072012e-308";
    static final long b = 1000000000L;
    static final String c;
    static final String d;

    static {
        l.c = "9223372036854775808";
        l.d = "9223372036854775807";
    }

    public static boolean a(String s, boolean z) {
        int v = (z ? "9223372036854775808" : "9223372036854775807").length();
        int v1 = s.length();
        if(v1 < v) {
            return true;
        }
        if(v1 > v) {
            return false;
        }
        for(int v2 = 0; v2 < v; ++v2) {
            int v3 = s.charAt(v2) - (z ? "9223372036854775808" : "9223372036854775807").charAt(v2);
            if(v3 != 0) {
                return v3 < 0;
            }
        }
        return true;
    }

    public static boolean b(char[] arr_c, int v, int v1, boolean z) {
        int v2 = (z ? "9223372036854775808" : "9223372036854775807").length();
        if(v1 < v2) {
            return true;
        }
        if(v1 > v2) {
            return false;
        }
        for(int v3 = 0; v3 < v2; ++v3) {
            int v4 = arr_c[v + v3] - (z ? "9223372036854775808" : "9223372036854775807").charAt(v3);
            if(v4 != 0) {
                return v4 < 0;
            }
        }
        return true;
    }

    public static double c(String s, double f) {
        return l.d(s, f, false);
    }

    public static double d(String s, double f, boolean z) {
        if(s == null) {
            return f;
        }
        String s1 = s.trim();
        if(s1.length() == 0) {
            return f;
        }
        try {
            return l.q(s1, z);
        }
        catch(NumberFormatException unused_ex) {
            return f;
        }
    }

    public static int e(String s, int v) {
        if(s == null) {
            return v;
        }
        String s1 = s.trim();
        int v1 = s1.length();
        if(v1 == 0) {
            return v;
        }
        int v2 = 0;
        int v3 = s1.charAt(0);
        if(v3 == 43) {
            s1 = s1.substring(1);
            v1 = s1.length();
        }
        else if(v3 == 45) {
            v2 = 1;
        }
        while(v2 < v1) {
            int v4 = s1.charAt(v2);
            if(v4 <= 57 && v4 >= 0x30) {
                ++v2;
            }
            else {
                try {
                    return (int)l.q(s1, true);
                }
                catch(NumberFormatException unused_ex) {
                    return v;
                }
            }
        }
        try {
            return Integer.parseInt(s1);
        }
        catch(NumberFormatException unused_ex) {
            return v;
        }
    }

    public static long f(String s, long v) {
        if(s == null) {
            return v;
        }
        String s1 = s.trim();
        int v1 = s1.length();
        if(v1 == 0) {
            return v;
        }
        int v2 = 0;
        int v3 = s1.charAt(0);
        if(v3 == 43) {
            s1 = s1.substring(1);
            v1 = s1.length();
        }
        else if(v3 == 45) {
            v2 = 1;
        }
        while(v2 < v1) {
            int v4 = s1.charAt(v2);
            if(v4 <= 57 && v4 >= 0x30) {
                ++v2;
            }
            else {
                try {
                    return (long)l.q(s1, true);
                }
                catch(NumberFormatException unused_ex) {
                    return v;
                }
            }
        }
        try {
            return Long.parseLong(s1);
        }
        catch(NumberFormatException unused_ex) {
            return v;
        }
    }

    public static BigDecimal g(String s) throws NumberFormatException {
        return a.b(s);
    }

    // 去混淆评级： 低(20)
    public static BigDecimal h(String s, boolean z) throws NumberFormatException {
        return z ? a.f(s) : a.b(s);
    }

    public static BigDecimal i(char[] arr_c) throws NumberFormatException {
        return a.c(arr_c);
    }

    public static BigDecimal j(char[] arr_c, int v, int v1) throws NumberFormatException {
        return a.d(arr_c, v, v1);
    }

    // 去混淆评级： 低(20)
    public static BigDecimal k(char[] arr_c, int v, int v1, boolean z) throws NumberFormatException {
        return z ? a.g(arr_c, v, v1) : a.d(arr_c, v, v1);
    }

    // 去混淆评级： 低(20)
    public static BigDecimal l(char[] arr_c, boolean z) throws NumberFormatException {
        return z ? a.g(arr_c, 0, arr_c.length) : a.c(arr_c);
    }

    public static BigInteger m(String s) throws NumberFormatException {
        return new BigInteger(s);
    }

    // 去混淆评级： 低(20)
    public static BigInteger n(String s, boolean z) throws NumberFormatException {
        return z ? b.a(s) : l.m(s);
    }

    // 去混淆评级： 低(20)
    public static BigInteger o(String s, int v, boolean z) throws NumberFormatException {
        return z ? b.b(s, v) : new BigInteger(s, v);
    }

    public static double p(String s) throws NumberFormatException {
        return l.q(s, false);
    }

    // 去混淆评级： 低(20)
    public static double q(String s, boolean z) throws NumberFormatException {
        return z ? y.a(s) : Double.parseDouble(s);
    }

    public static float r(String s) throws NumberFormatException {
        return l.s(s, false);
    }

    // 去混淆评级： 低(20)
    public static float s(String s, boolean z) throws NumberFormatException {
        return z ? C.a(s) : Float.parseFloat(s);
    }

    public static int t(String s) {
        int v = s.charAt(0);
        int v1 = s.length();
        int v2 = 1;
        if(v == 45) {
            if(v1 != 1 && v1 <= 10) {
                v = s.charAt(1);
                v2 = 2;
                goto label_11;
            }
            return Integer.parseInt(s);
        }
        else if(v1 > 9) {
            return Integer.parseInt(s);
        }
    label_11:
        if(v <= 57 && v >= 0x30) {
            int v3 = v - 0x30;
            if(v2 < v1) {
                int v4 = s.charAt(v2);
                if(v4 > 57 || v4 < 0x30) {
                    return Integer.parseInt(s);
                }
                v3 = v3 * 10 + (v4 - 0x30);
                if(v2 + 1 < v1) {
                    int v5 = v2 + 2;
                    int v6 = s.charAt(v2 + 1);
                    if(v6 > 57 || v6 < 0x30) {
                        return Integer.parseInt(s);
                    }
                    v3 = v3 * 10 + (v6 - 0x30);
                    if(v5 < v1) {
                        while(true) {
                            int v7 = s.charAt(v5);
                            if(v7 > 57 || v7 < 0x30) {
                                break;
                            }
                            v3 = v3 * 10 + (v7 - 0x30);
                            if(v5 + 1 >= v1) {
                                return v3;
                            }
                            ++v5;
                        }
                        return Integer.parseInt(s);
                    }
                }
            }
            return v3;
        }
        return Integer.parseInt(s);
    }

    public static int u(char[] arr_c, int v, int v1) {
        if(v1 > 0 && arr_c[v] == 43) {
            ++v;
            --v1;
        }
        int v2 = arr_c[v + v1 - 1] - 0x30;
        switch(v1) {
            case 2: {
                break;
            }
            case 3: {
                return v2 + (arr_c[v] - 0x30) * 100 + (arr_c[v + 1] - 0x30) * 10;
            }
            case 4: {
                return v2 + (arr_c[v] - 0x30) * 1000 + (arr_c[v + 1] - 0x30) * 100 + (arr_c[v + 2] - 0x30) * 10;
            }
            case 5: {
                return v2 + (arr_c[v] - 0x30) * 10000 + (arr_c[v + 1] - 0x30) * 1000 + (arr_c[v + 2] - 0x30) * 100 + (arr_c[v + 3] - 0x30) * 10;
            }
            case 6: {
                return v2 + (arr_c[v] - 0x30) * 100000 + (arr_c[v + 1] - 0x30) * 10000 + (arr_c[v + 2] - 0x30) * 1000 + (arr_c[v + 3] - 0x30) * 100 + (arr_c[v + 4] - 0x30) * 10;
            }
            case 7: {
                return v2 + (arr_c[v] - 0x30) * 1000000 + (arr_c[v + 1] - 0x30) * 100000 + (arr_c[v + 2] - 0x30) * 10000 + (arr_c[v + 3] - 0x30) * 1000 + (arr_c[v + 4] - 0x30) * 100 + (arr_c[v + 5] - 0x30) * 10;
            }
            case 8: {
                return v2 + (arr_c[v] - 0x30) * 10000000 + (arr_c[v + 1] - 0x30) * 1000000 + (arr_c[v + 2] - 0x30) * 100000 + (arr_c[v + 3] - 0x30) * 10000 + (arr_c[v + 4] - 0x30) * 1000 + (arr_c[v + 5] - 0x30) * 100 + (arr_c[v + 6] - 0x30) * 10;
            }
            case 9: {
                v2 = v2 + (arr_c[v] - 0x30) * 100000000 + (arr_c[v + 1] - 0x30) * 10000000 + (arr_c[v + 2] - 0x30) * 1000000 + (arr_c[v + 3] - 0x30) * 100000;
                v += 4;
                v2 = v2 + (arr_c[v] - 0x30) * 10000 + (arr_c[v + 1] - 0x30) * 1000 + (arr_c[v + 2] - 0x30) * 100;
                v += 3;
                break;
            }
            default: {
                return v2;
            }
        }
        return v2 + (arr_c[v] - 0x30) * 10;
    }

    public static long v(String s) {
        return s.length() > 9 ? Long.parseLong(s) : ((long)l.t(s));
    }

    public static long w(char[] arr_c, int v, int v1) {
        return ((long)l.u(arr_c, v, v1 - 9)) * 1000000000L + ((long)l.u(arr_c, v + (v1 - 9), 9));
    }

    public static long x(char[] arr_c, int v, boolean z) {
        long v1 = 0L;
        for(int v2 = 0; v2 < 19; ++v2) {
            v1 = v1 * 10L + ((long)(arr_c[v + v2] - 0x30));
        }
        return z ? -v1 : v1;
    }
}

