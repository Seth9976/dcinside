package com.bykv.vk.openvk.preload.a.b;

public final class d {
    private static final int a;

    static {
        int v = d.a("0");
        if(v == -1) {
            v = d.b("0");
        }
        if(v == -1) {
            v = 6;
        }
        d.a = v;
    }

    public static int a() [...] // 潜在的解密器

    private static int a(String s) {
        try {
            String[] arr_s = s.split("[._]");
            int v = Integer.parseInt(arr_s[0]);
            return v != 1 || arr_s.length <= 1 ? v : Integer.parseInt(arr_s[1]);
        }
        catch(NumberFormatException unused_ex) {
            return -1;
        }
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

    public static boolean b() [...] // 潜在的解密器
}

