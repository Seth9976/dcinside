package com.fsn.cauly.blackdragoncore.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class e {
    public static String a(File file0) {
        FileInputStream fileInputStream0 = null;
        try {
            fileInputStream0 = new FileInputStream(file0);
            byte[] arr_b = new byte[((int)file0.length())];
            fileInputStream0.read(arr_b);
            fileInputStream0.close();
            return new String(arr_b, "UTF-8");
        }
        catch(Throwable throwable0) {
            throwable0.printStackTrace();
            if(fileInputStream0 != null) {
                try {
                    fileInputStream0.close();
                    return null;
                }
                catch(IOException iOException0) {
                    iOException0.printStackTrace();
                }
            }
            return null;
        }
    }

    public static String a(String s) {
        int v = s.lastIndexOf(0x2F);
        return v == -1 ? "" : s.substring(0, v);
    }

    public static boolean b(String s) {
        return s == null ? false : new File(s).exists();
    }

    public static String c(String s) {
        return e.a(new File(s));
    }

    public static boolean d(String s) {
        try {
            File file0 = new File(s);
            if(!file0.exists()) {
                file0.mkdirs();
            }
            return true;
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }
}

