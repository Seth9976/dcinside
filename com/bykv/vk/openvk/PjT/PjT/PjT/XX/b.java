package com.bykv.vk.openvk.PjT.PjT.PjT.XX;

public class b {
    private static boolean a = false;
    private static int b = 4;
    private static String c = "";

    static {
    }

    public static void a() {
        b.a = true;
        b.b(3);
    }

    public static void b(int v) {
        b.b = v;
    }

    public static void c(String s) {
        b.c = s;
    }

    public static boolean d() [...] // 潜在的解密器

    public static void e() {
        b.a = false;
        b.b(7);
    }
}

