package io.realm.transformer;

import io.realm.gradle.d;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;
import org.gradle.api.Project;

public class k {
    public static String a(String s) throws UnsupportedEncodingException {
        return DatatypeConverter.printBase64Binary(s.getBytes("UTF-8"));
    }

    public static String b(byte[] arr_b) {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; v < arr_b.length; ++v) {
            stringBuilder0.append(Integer.toString((arr_b[v] & 0xFF) + 0x100, 16).substring(1));
        }
        return stringBuilder0.toString();
    }

    public static boolean c(Project project0) {
        d d0 = (d)project0.getExtensions().findByName("realm");
        return d0 != null && d0.b();
    }

    public static byte[] d(byte[] arr_b) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance("SHA-256").digest(arr_b);
    }
}

