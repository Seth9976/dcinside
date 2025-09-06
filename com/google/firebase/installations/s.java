package com.google.firebase.installations;

import android.util.Base64;
import androidx.annotation.NonNull;
import java.nio.charset.Charset;
import java.util.UUID;

public class s {
    private static final byte a = 0;
    private static final byte b = 0;
    private static final int c = 22;

    static {
        s.a = 0x70;
        s.b = 15;
    }

    // 去混淆评级： 中等(50)
    @NonNull
    public String a() [...] // 潜在的解密器

    private static String b(byte[] arr_b) {
        return new String(Base64.encode(arr_b, 11), Charset.defaultCharset()).substring(0, 22);
    }

    private static byte[] c(UUID uUID0, byte[] arr_b) [...] // 潜在的解密器
}

