package com.google.common.base;

import J1.b;

@b
@k
public final class c {
    public static final byte A = 23;
    public static final byte B = 24;
    public static final byte C = 25;
    public static final byte D = 26;
    public static final byte E = 27;
    public static final byte F = 28;
    public static final byte G = 29;
    public static final byte H = 30;
    public static final byte I = 0x1F;
    public static final byte J = 0x20;
    public static final byte K = 0x20;
    public static final byte L = 0x7F;
    public static final char M = '\u0000';
    public static final char N = '\u007F';
    private static final char O = ' ';
    public static final byte a = 0;
    public static final byte b = 1;
    public static final byte c = 2;
    public static final byte d = 3;
    public static final byte e = 4;
    public static final byte f = 5;
    public static final byte g = 6;
    public static final byte h = 7;
    public static final byte i = 8;
    public static final byte j = 9;
    public static final byte k = 10;
    public static final byte l = 10;
    public static final byte m = 11;
    public static final byte n = 12;
    public static final byte o = 13;
    public static final byte p = 14;
    public static final byte q = 15;
    public static final byte r = 16;
    public static final byte s = 17;
    public static final byte t = 17;
    public static final byte u = 18;
    public static final byte v = 19;
    public static final byte w = 19;
    public static final byte x = 20;
    public static final byte y = 21;
    public static final byte z = 22;

    public static boolean a(CharSequence charSequence0, CharSequence charSequence1) {
        int v = charSequence0.length();
        if(charSequence0 == charSequence1) {
            return true;
        }
        if(v != charSequence1.length()) {
            return false;
        }
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = charSequence0.charAt(v1);
            int v3 = charSequence1.charAt(v1);
            if(v2 != v3) {
                int v4 = (char)((((char)v2) | 0x20) - 97);
                if(v4 >= 26 || v4 != ((char)((((char)v3) | 0x20) - 97))) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int b(char c) [...] // Inlined contents

    public static boolean c(char c) {
        return c >= 97 && c <= 0x7A;
    }

    public static boolean d(char c) {
        return c >= 65 && c <= 90;
    }

    // 去混淆评级： 低(20)
    public static char e(char c) {
        return c.d(c) ? ((char)(c ^ 0x20)) : c;
    }

    public static String f(CharSequence charSequence0) {
        if(charSequence0 instanceof String) {
            return c.g(((String)charSequence0));
        }
        int v = charSequence0.length();
        char[] arr_c = new char[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_c[v1] = c.e(charSequence0.charAt(v1));
        }
        return String.valueOf(arr_c);
    }

    public static String g(String s) [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    public static char h(char c) {
        return c.c(c) ? ((char)(c ^ 0x20)) : c;
    }

    public static String i(CharSequence charSequence0) {
        if(charSequence0 instanceof String) {
            return c.j(((String)charSequence0));
        }
        int v = charSequence0.length();
        char[] arr_c = new char[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_c[v1] = c.h(charSequence0.charAt(v1));
        }
        return String.valueOf(arr_c);
    }

    public static String j(String s) {
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            if(c.c(s.charAt(v1))) {
                char[] arr_c = s.toCharArray();
                while(v1 < v) {
                    int v2 = arr_c[v1];
                    if(c.c(((char)v2))) {
                        arr_c[v1] = (char)(v2 ^ 0x20);
                    }
                    ++v1;
                }
                return String.valueOf(arr_c);
            }
        }
        return s;
    }

    public static String k(CharSequence charSequence0, int v, String s) {
        H.E(charSequence0);
        int v1 = v - s.length();
        H.m(v1 >= 0, "maxLength (%s) must be >= length of the truncation indicator (%s)", v, s.length());
        if(charSequence0.length() <= v) {
            charSequence0 = charSequence0.toString();
            if(((String)charSequence0).length() <= v) {
                return charSequence0;
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder(v);
        stringBuilder0.append(charSequence0, 0, v1);
        stringBuilder0.append(s);
        return stringBuilder0.toString();
    }
}

