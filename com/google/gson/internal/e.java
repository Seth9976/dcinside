package com.google.gson.internal;

public final class e {
    private static final int a;

    static {
        e.a = e.a();
    }

    // 去混淆评级： 低(20)
    private static int a() {
        return e.d("0");
    }

    private static int b(String s) {
        try {
            StringBuilder stringBuilder0 = new StringBuilder();
            for(int v = 0; v < s.length(); ++v) {
                int v1 = s.charAt(v);
                if(!Character.isDigit(((char)v1))) {
                    break;
                }
                stringBuilder0.append(((char)v1));
            }
            return Integer.parseInt(stringBuilder0.toString());
        }
        catch(NumberFormatException unused_ex) {
            return -1;
        }
    }

    public static int c() {
        return 0;
    }

    static int d(String s) {
        int v = e.f(s);
        if(v == -1) {
            v = e.b(s);
        }
        return v == -1 ? 6 : v;
    }

    public static boolean e() [...] // 潜在的解密器

    private static int f(String s) {
        try {
            String[] arr_s = s.split("[._]");
            int v = Integer.parseInt(arr_s[0]);
            return v != 1 || arr_s.length <= 1 ? v : Integer.parseInt(arr_s[1]);
        }
        catch(NumberFormatException unused_ex) {
            return -1;
        }
    }
}

