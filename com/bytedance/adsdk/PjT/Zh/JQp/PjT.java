package com.bytedance.adsdk.PjT.Zh.JQp;

public class PjT {
    public static boolean PjT(char c) {
        return c == 0x20;
    }

    public static boolean ReZ(char c) {
        return c >= 0x30 && c <= 57;
    }

    // 去混淆评级： 低(20)
    public static boolean Zh(char c) {
        return c >= 65 && c <= 90 || c >= 97 && c <= 0x7A;
    }

    public static boolean cr(char c) {
        return 43 == c || 45 == c || 42 == c || 0x2F == c || 37 == c || 61 == c || 62 == c || 60 == c || 33 == c || 38 == c || 0x7C == c || 0x3F == c || 58 == c;
    }
}

