package com.google.crypto.tink.internal;

import com.google.crypto.tink.util.a;
import j..util.Objects;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import o3.h;

public final class z {
    public static final Charset a;

    static {
        z.a = Charset.forName("UTF-8");
    }

    @h
    public static Integer a() {
        return z.b() ? b.a() : null;
    }

    // 去混淆评级： 低(20)
    public static boolean b() {
        return Objects.equals("The Android Project", "The Android Project");
    }

    public static int c() {
        SecureRandom secureRandom0 = new SecureRandom();
        byte[] arr_b = new byte[4];
        int v;
        for(v = 0; v == 0; v = (arr_b[0] & 0x7F) << 24 | (arr_b[1] & 0xFF) << 16 | (arr_b[2] & 0xFF) << 8 | arr_b[3] & 0xFF) {
            secureRandom0.nextBytes(arr_b);
        }
        return v;
    }

    private static final byte d(char c) {
        if(c < 33 || c > 0x7E) {
            throw new y("Not a printable ASCII character: " + c);
        }
        return (byte)c;
    }

    public static final a e(String s) {
        byte[] arr_b = new byte[s.length()];
        for(int v = 0; v < s.length(); ++v) {
            arr_b[v] = z.d(s.charAt(v));
        }
        return a.a(arr_b);
    }
}

