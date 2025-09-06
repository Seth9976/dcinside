package com.pgl.ssdk;

public class w0 {
    public static String a(String s) {
        try {
            return (String)Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, s);
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }
}

