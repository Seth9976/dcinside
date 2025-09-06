package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.io.doubleparser.q;
import java.math.BigDecimal;
import java.util.Arrays;

public final class a {
    static final int a = 1000;

    private static int a(int v, long v1) {
        long v2 = ((long)v) - v1;
        if(v2 > 0x7FFFFFFFL || v2 < 0xFFFFFFFF80000000L) {
            throw new NumberFormatException("Scale out of range: " + v2 + " while adjusting scale " + v + " to exponent " + v1);
        }
        return (int)v2;
    }

    public static BigDecimal b(String s) {
        return a.c(s.toCharArray());
    }

    public static BigDecimal c(char[] arr_c) {
        return a.d(arr_c, 0, arr_c.length);
    }

    public static BigDecimal d(char[] arr_c, int v, int v1) {
        try {
            return v1 >= 500 ? a.e(arr_c, v, v1, v1 / 10) : new BigDecimal(arr_c, v, v1);
        }
        catch(ArithmeticException | NumberFormatException arithmeticException0) {
        }
        throw new NumberFormatException("Value \"" + (v1 > 1000 ? new String(Arrays.copyOfRange(arr_c, v, 1000)) + "(truncated, full length is " + arr_c.length + " chars)" : new String(arr_c, v, v1)) + "\" can not be represented as `java.math.BigDecimal`, reason: " + (arithmeticException0.getMessage() == null ? "Not a valid number representation" : arithmeticException0.getMessage()));
    }

    private static BigDecimal e(char[] arr_c, int v, int v1, int v2) {
        BigDecimal bigDecimal0;
        int v9;
        int v3 = v + v1;
        int v4 = v;
        int v5 = v4;
        int v6 = -1;
        int v7 = 0;
        int v8 = -1;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        while(v4 < v3) {
            switch(arr_c[v4]) {
                case 43: {
                    if(v6 >= 0) {
                        if(z1) {
                            throw new NumberFormatException("Multiple signs in exponent");
                        }
                        z1 = true;
                    }
                    else {
                        if(z) {
                            throw new NumberFormatException("Multiple signs in number");
                        }
                        v5 = v4 + 1;
                        z = true;
                    }
                    break;
                }
                case 45: {
                    if(v6 >= 0) {
                        if(z1) {
                            throw new NumberFormatException("Multiple signs in exponent");
                        }
                        z1 = true;
                    }
                    else {
                        if(z) {
                            throw new NumberFormatException("Multiple signs in number");
                        }
                        v5 = v4 + 1;
                        z = true;
                        z2 = true;
                    }
                    break;
                }
                case 46: {
                    if(v8 >= 0) {
                        throw new NumberFormatException("Multiple decimal points");
                    }
                    v8 = v4;
                    break;
                }
                case 69: 
                case 101: {
                    if(v6 >= 0) {
                        throw new NumberFormatException("Multiple exponent markers");
                    }
                    v6 = v4;
                    break;
                }
                default: {
                    if(v8 >= 0 && v6 == -1) {
                        ++v7;
                    }
                }
            }
            ++v4;
        }
        if(v6 >= 0) {
            v9 = Integer.parseInt(new String(arr_c, v6 + 1, v3 - v6 - 1));
            v7 = a.a(v7, ((long)v9));
            v3 = v6;
        }
        else {
            v9 = 0;
        }
        if(v8 >= 0) {
            int v10 = v3 - v8 - 1;
            bigDecimal0 = a.h(arr_c, v5, v8 - v5, v9, v2).add(a.h(arr_c, v8 + 1, v10, v9 - v10, v2));
        }
        else {
            bigDecimal0 = a.h(arr_c, v5, v3 - v5, v9, v2);
        }
        if(v7 != 0) {
            bigDecimal0 = bigDecimal0.setScale(v7);
        }
        return z2 ? bigDecimal0.negate() : bigDecimal0;
    }

    public static BigDecimal f(String s) {
        try {
            return q.a(s);
        }
        catch(NumberFormatException numberFormatException0) {
            if(s.length() > 1000) {
                s = s.substring(0, 1000) + " [truncated]";
            }
            throw new NumberFormatException("Value \"" + s + "\" can not be represented as `java.math.BigDecimal`, reason: " + numberFormatException0.getMessage());
        }
    }

    public static BigDecimal g(char[] arr_c, int v, int v1) {
        try {
            return q.f(arr_c, v, v1);
        }
        catch(NumberFormatException numberFormatException0) {
            throw new NumberFormatException("Value \"" + (v1 > 1000 ? new String(arr_c, v, 1000) + " [truncated]" : new String(arr_c, v, v1)) + "\" can not be represented as `java.math.BigDecimal`, reason: " + numberFormatException0.getMessage());
        }
    }

    private static BigDecimal h(char[] arr_c, int v, int v1, int v2, int v3) {
        if(v1 > v3) {
            return a.h(arr_c, v, v1 / 2, v2 + v1 - v1 / 2, v3).add(a.h(arr_c, v + v1 / 2, v1 - v1 / 2, v2, v3));
        }
        return v1 == 0 ? BigDecimal.ZERO : new BigDecimal(arr_c, v, v1).scaleByPowerOfTen(v2);
    }
}

