package com.fsn.cauly.blackdragoncore.utils;

import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class o {
    public static String a = "y0k9t1p7^9^8$1$6q0f7r6z5p4s3e2g1";

    static {
    }

    public static String a(String s) {
        SecretKeySpec secretKeySpec0 = new SecretKeySpec("y0k9t1p7^9^8$1$6q0f7r6z5p4s3e2g1".getBytes(), "AES");
        Cipher cipher0 = Cipher.getInstance("AES/ECB/PKCS5PADDING");
        cipher0.init(2, secretKeySpec0);
        return new String(cipher0.doFinal(o.b(new String(Base64.decode(s, 1)))));
    }

    public static String a(String s, boolean z) {
        if(z) {
            SecretKeySpec secretKeySpec0 = new SecretKeySpec("0917)(!&076543210917)(!&07654321".getBytes(), "AES");
            Cipher cipher0 = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher0.init(2, secretKeySpec0);
            return new String(cipher0.doFinal(Base64.decode(s.getBytes(), 0)));
        }
        return o.a(s);
    }

    public static byte[] b(String s) [...] // 潜在的解密器
}

