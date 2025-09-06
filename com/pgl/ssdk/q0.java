package com.pgl.ssdk;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipFile;

public class q0 {
    public static void a(Closeable closeable0) {
        if(closeable0 == null) {
            return;
        }
        try {
            closeable0.close();
        }
        catch(IOException unused_ex) {
        }
    }

    public static void a(String s, int v) {
        r0.a("android.os.FileUtils", s, new Object[]{v, -1, -1});
    }

    public static void a(ZipFile zipFile0) {
        if(zipFile0 == null) {
            return;
        }
        try {
            zipFile0.close();
        }
        catch(IOException unused_ex) {
        }
    }

    public static boolean a(String s) {
        return new File(s).mkdirs();
    }
}

