package com.fasterxml.jackson.core.io;

import com.fasterxml.jackson.core.base.b;
import com.fasterxml.jackson.core.io.schubfach.a;

public final class n {
    private static int a = 1000000;
    private static int b = 1000000000;
    private static long c = 1000000000L;
    private static long d = 0xFFFFFFFF80000000L;
    private static long e = 0x7FFFFFFFL;
    static final String f;
    static final String g;
    private static final int[] h;
    private static final String[] i;
    private static final String[] j;

    static {
        n.f = "-2147483648";
        n.g = "-9223372036854775808";
        n.h = new int[1000];
        for(int v1 = 0; v1 < 10; ++v1) {
            for(int v2 = 0; v2 < 10; ++v2) {
                int v3 = 0;
                for(int v = 0; v3 < 10; ++v) {
                    n.h[v] = v1 + 0x30 << 16 | v2 + 0x30 << 8 | v3 + 0x30;
                    ++v3;
                }
            }
        }
        n.i = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        n.j = new String[]{"-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10"};
    }

    private static int a(int v, byte[] arr_b, int v1) {
        int v2 = n.h[v];
        arr_b[v1] = (byte)(v2 >> 16);
        arr_b[v1 + 1] = (byte)(v2 >> 8);
        arr_b[v1 + 2] = (byte)v2;
        return v1 + 3;
    }

    private static int b(int v, char[] arr_c, int v1) {
        int v2 = n.h[v];
        arr_c[v1] = (char)(v2 >> 16);
        arr_c[v1 + 1] = (char)(v2 >> 8 & 0x7F);
        arr_c[v1 + 2] = (char)(v2 & 0x7F);
        return v1 + 3;
    }

    private static int c(int v, byte[] arr_b, int v1) {
        int v2 = n.h[v];
        if(v > 9) {
            if(v > 99) {
                arr_b[v1] = (byte)(v2 >> 16);
                ++v1;
            }
            arr_b[v1] = (byte)(v2 >> 8);
            ++v1;
        }
        arr_b[v1] = (byte)v2;
        return v1 + 1;
    }

    private static int d(int v, char[] arr_c, int v1) {
        int v2 = n.h[v];
        if(v > 9) {
            if(v > 99) {
                arr_c[v1] = (char)(v2 >> 16);
                ++v1;
            }
            arr_c[v1] = (char)(v2 >> 8 & 0x7F);
            ++v1;
        }
        arr_c[v1] = (char)(v2 & 0x7F);
        return v1 + 1;
    }

    private static int e(int v, byte[] arr_b, int v1) {
        int v2 = v / 1000 / 1000;
        int v3 = n.h[v2];
        arr_b[v1] = (byte)(v3 >> 16);
        arr_b[v1 + 1] = (byte)(v3 >> 8);
        arr_b[v1 + 2] = (byte)v3;
        int v4 = n.h[v / 1000 - v2 * 1000];
        arr_b[v1 + 3] = (byte)(v4 >> 16);
        arr_b[v1 + 4] = (byte)(v4 >> 8);
        arr_b[v1 + 5] = (byte)v4;
        int v5 = n.h[v - v / 1000 * 1000];
        arr_b[v1 + 6] = (byte)(v5 >> 16);
        arr_b[v1 + 7] = (byte)(v5 >> 8);
        arr_b[v1 + 8] = (byte)v5;
        return v1 + 9;
    }

    private static int f(int v, char[] arr_c, int v1) {
        int v2 = v / 1000 / 1000;
        int v3 = n.h[v2];
        arr_c[v1] = (char)(v3 >> 16);
        arr_c[v1 + 1] = (char)(v3 >> 8 & 0x7F);
        arr_c[v1 + 2] = (char)(v3 & 0x7F);
        int v4 = n.h[v / 1000 - v2 * 1000];
        arr_c[v1 + 3] = (char)(v4 >> 16);
        arr_c[v1 + 4] = (char)(v4 >> 8 & 0x7F);
        arr_c[v1 + 5] = (char)(v4 & 0x7F);
        int v5 = n.h[v - v / 1000 * 1000];
        arr_c[v1 + 6] = (char)(v5 >> 16);
        arr_c[v1 + 7] = (char)(v5 >> 8 & 0x7F);
        arr_c[v1 + 8] = (char)(v5 & 0x7F);
        return v1 + 9;
    }

    private static int g(byte[] arr_b, int v) {
        int v1 = 0;
        while(v1 < 11) {
            arr_b[v] = (byte)"-2147483648".charAt(v1);
            ++v1;
            ++v;
        }
        return v;
    }

    // 去混淆评级： 低(25)
    private static int h(char[] arr_c, int v) {
        "-2147483648".getChars(0, 11, arr_c, v);
        return v + 11;
    }

    private static int i(byte[] arr_b, int v) {
        int v1 = 0;
        while(v1 < 20) {
            arr_b[v] = (byte)"-9223372036854775808".charAt(v1);
            ++v1;
            ++v;
        }
        return v;
    }

    // 去混淆评级： 低(25)
    private static int j(char[] arr_c, int v) {
        "-9223372036854775808".getChars(0, 20, arr_c, v);
        return v + 20;
    }

    private static int k(int v, byte[] arr_b, int v1) {
        if(v < n.a) {
            return v >= 1000 ? n.m(arr_b, v1, v / 1000, v - v / 1000 * 1000) : n.c(v, arr_b, v1);
        }
        int v2 = v / 1000 / 1000;
        int v3 = n.c(v2, arr_b, v1);
        int v4 = n.h[v / 1000 - v2 * 1000];
        arr_b[v3] = (byte)(v4 >> 16);
        arr_b[v3 + 1] = (byte)(v4 >> 8);
        arr_b[v3 + 2] = (byte)v4;
        int v5 = n.h[v - v / 1000 * 1000];
        arr_b[v3 + 3] = (byte)(v5 >> 16);
        arr_b[v3 + 4] = (byte)(v5 >> 8);
        arr_b[v3 + 5] = (byte)v5;
        return v3 + 6;
    }

    private static int l(int v, char[] arr_c, int v1) {
        if(v < n.a) {
            return v >= 1000 ? n.n(arr_c, v1, v / 1000, v - v / 1000 * 1000) : n.d(v, arr_c, v1);
        }
        int v2 = v / 1000 / 1000;
        int v3 = n.d(v2, arr_c, v1);
        int v4 = n.h[v / 1000 - v2 * 1000];
        arr_c[v3] = (char)(v4 >> 16);
        arr_c[v3 + 1] = (char)(v4 >> 8 & 0x7F);
        arr_c[v3 + 2] = (char)(v4 & 0x7F);
        int v5 = n.h[v - v / 1000 * 1000];
        arr_c[v3 + 3] = (char)(v5 >> 16);
        arr_c[v3 + 4] = (char)(v5 >> 8 & 0x7F);
        arr_c[v3 + 5] = (char)(v5 & 0x7F);
        return v3 + 6;
    }

    private static int m(byte[] arr_b, int v, int v1, int v2) {
        int[] arr_v = n.h;
        int v3 = arr_v[v1];
        if(v1 > 9) {
            if(v1 > 99) {
                arr_b[v] = (byte)(v3 >> 16);
                ++v;
            }
            arr_b[v] = (byte)(v3 >> 8);
            ++v;
        }
        arr_b[v] = (byte)v3;
        int v4 = arr_v[v2];
        arr_b[v + 1] = (byte)(v4 >> 16);
        arr_b[v + 2] = (byte)(v4 >> 8);
        arr_b[v + 3] = (byte)v4;
        return v + 4;
    }

    private static int n(char[] arr_c, int v, int v1, int v2) {
        int[] arr_v = n.h;
        int v3 = arr_v[v1];
        if(v1 > 9) {
            if(v1 > 99) {
                arr_c[v] = (char)(v3 >> 16);
                ++v;
            }
            arr_c[v] = (char)(v3 >> 8 & 0x7F);
            ++v;
        }
        arr_c[v] = (char)(v3 & 0x7F);
        int v4 = arr_v[v2];
        arr_c[v + 1] = (char)(v4 >> 16);
        arr_c[v + 2] = (char)(v4 >> 8 & 0x7F);
        arr_c[v + 3] = (char)(v4 & 0x7F);
        return v + 4;
    }

    public static boolean o(double f) {
        return !b.a(f);
    }

    public static boolean p(float f) {
        return !m.a(f);
    }

    public static int q(int v, byte[] arr_b, int v1) {
        if(v < 0) {
            if(v == 0x80000000) {
                return n.g(arr_b, v1);
            }
            arr_b[v1] = 45;
            v = -v;
            ++v1;
        }
        if(v < n.a) {
            if(v < 1000) {
                if(v < 10) {
                    arr_b[v1] = (byte)(v + 0x30);
                    return v1 + 1;
                }
                return n.c(v, arr_b, v1);
            }
            return n.a(v - v / 1000 * 1000, arr_b, n.c(v / 1000, arr_b, v1));
        }
        int v2 = n.b;
        if(v >= v2) {
            int v3 = v - v2;
            if(v3 >= v2) {
                arr_b[v1] = 50;
                return n.e(v3 - v2, arr_b, v1 + 1);
            }
            arr_b[v1] = 49;
            return n.e(v3, arr_b, v1 + 1);
        }
        int v4 = v / 1000 / 1000;
        return n.a(v - v / 1000 * 1000, arr_b, n.a(v / 1000 - v4 * 1000, arr_b, n.c(v4, arr_b, v1)));
    }

    public static int r(int v, char[] arr_c, int v1) {
        if(v < 0) {
            if(v == 0x80000000) {
                return n.h(arr_c, v1);
            }
            arr_c[v1] = '-';
            v = -v;
            ++v1;
        }
        if(v < n.a) {
            if(v < 1000) {
                if(v < 10) {
                    arr_c[v1] = (char)(v + 0x30);
                    return v1 + 1;
                }
                return n.d(v, arr_c, v1);
            }
            return n.b(v - v / 1000 * 1000, arr_c, n.d(v / 1000, arr_c, v1));
        }
        int v2 = n.b;
        if(v >= v2) {
            int v3 = v - v2;
            if(v3 >= v2) {
                arr_c[v1] = '2';
                return n.f(v3 - v2, arr_c, v1 + 1);
            }
            arr_c[v1] = '1';
            return n.f(v3, arr_c, v1 + 1);
        }
        int v4 = v / 1000 / 1000;
        return n.b(v - v / 1000 * 1000, arr_c, n.b(v / 1000 - v4 * 1000, arr_c, n.d(v4, arr_c, v1)));
    }

    public static int s(long v, byte[] arr_b, int v1) {
        if(v < 0L) {
            if(v > n.d) {
                return n.q(((int)v), arr_b, v1);
            }
            if(v == 0x8000000000000000L) {
                return n.i(arr_b, v1);
            }
            arr_b[v1] = 45;
            v = -v;
            ++v1;
        }
        else if(v <= n.e) {
            return n.q(((int)v), arr_b, v1);
        }
        long v2 = n.c;
        long v3 = v / v2;
        return v3 >= v2 ? n.e(((int)(v - v3 * v2)), arr_b, n.e(((int)(v3 - v2 * (v3 / v2))), arr_b, n.c(((int)(v3 / v2)), arr_b, v1))) : n.e(((int)(v - v3 * v2)), arr_b, n.k(((int)v3), arr_b, v1));
    }

    public static int t(long v, char[] arr_c, int v1) {
        if(v < 0L) {
            if(v > n.d) {
                return n.r(((int)v), arr_c, v1);
            }
            if(v == 0x8000000000000000L) {
                return n.j(arr_c, v1);
            }
            arr_c[v1] = '-';
            v = -v;
            ++v1;
        }
        else if(v <= n.e) {
            return n.r(((int)v), arr_c, v1);
        }
        long v2 = n.c;
        long v3 = v / v2;
        return v3 >= v2 ? n.f(((int)(v - v3 * v2)), arr_c, n.f(((int)(v3 - v2 * (v3 / v2))), arr_c, n.d(((int)(v3 / v2)), arr_c, v1))) : n.f(((int)(v - v3 * v2)), arr_c, n.l(((int)v3), arr_c, v1));
    }

    public static String u(double f) {
        return n.v(f, false);
    }

    // 去混淆评级： 低(20)
    public static String v(double f, boolean z) {
        return z ? a.p(f) : Double.toString(f);
    }

    public static String w(float f) {
        return n.x(f, false);
    }

    // 去混淆评级： 低(20)
    public static String x(float f, boolean z) {
        return z ? com.fasterxml.jackson.core.io.schubfach.b.o(f) : Float.toString(f);
    }

    public static String y(int v) {
        String[] arr_s = n.i;
        if(v < arr_s.length) {
            if(v >= 0) {
                return arr_s[v];
            }
            return -v - 1 >= n.j.length ? Integer.toString(v) : n.j[-v - 1];
        }
        return Integer.toString(v);
    }

    public static String z(long v) {
        return v > 0x7FFFFFFFL || v < 0xFFFFFFFF80000000L ? Long.toString(v) : n.y(((int)v));
    }
}

