package com.bytedance.sdk.component.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import jeb.synthetic.TWR;

public class ZX {
    // 去混淆评级： 低(20)
    private static File PjT(String s) {
        return ZX.Zh(s) ? null : new File(s);
    }

    public static List PjT(File file0, File file1, String s) throws IOException {
        if(file0 != null && file1 != null) {
            List list0 = new ArrayList();
            ZipFile zipFile0 = new ZipFile(file0);
            Enumeration enumeration0 = zipFile0.entries();
            try {
                if(ZX.Zh(s)) {
                    while(true) {
                        if(!enumeration0.hasMoreElements()) {
                            break;
                        }
                        ZipEntry zipEntry0 = (ZipEntry)enumeration0.nextElement();
                        String s1 = zipEntry0.getName();
                        if(!s1.contains("../") && !ZX.PjT(file1, list0, zipFile0, zipEntry0, s1)) {
                            goto label_9;
                        }
                    }
                }
                else {
                    goto label_11;
                }
                goto label_22;
            }
            catch(Throwable throwable0) {
                goto label_17;
            }
        label_9:
            zipFile0.close();
            return list0;
            while(true) {
                try {
                label_11:
                    if(!enumeration0.hasMoreElements()) {
                        break;
                    }
                    ZipEntry zipEntry1 = (ZipEntry)enumeration0.nextElement();
                    String s2 = zipEntry1.getName();
                    if(!s2.contains("../") && s2.contains(s) && !ZX.PjT(file1, list0, zipFile0, zipEntry1, s2)) {
                        goto label_19;
                    }
                    continue;
                }
                catch(Throwable throwable0) {
                label_17:
                    TWR.safeClose$NT(zipFile0, throwable0);
                    throw throwable0;
                }
            label_19:
                zipFile0.close();
                return list0;
            }
        label_22:
            zipFile0.close();
            return list0;
        }
        return null;
    }

    public static List PjT(String s, String s1) throws IOException {
        return ZX.PjT(s, s1, null);
    }

    public static List PjT(String s, String s1, String s2) throws IOException {
        return ZX.PjT(ZX.PjT(s), ZX.PjT(s1), s2);
    }

    private static boolean PjT(File file0) {
        if(file0 != null) {
            return file0.exists() ? file0.isDirectory() : file0.mkdirs();
        }
        return false;
    }

    private static boolean PjT(File file0, List list0, ZipFile zipFile0, ZipEntry zipEntry0, String s) throws IOException {
        BufferedInputStream bufferedInputStream0;
        BufferedOutputStream bufferedOutputStream0;
        FileOutputStream fileOutputStream0;
        File file1 = new File(file0, s);
        list0.add(file1);
        if(zipEntry0.isDirectory()) {
            return ZX.PjT(file1);
        }
        if(!ZX.Zh(file1)) {
            return false;
        }
        try {
            fileOutputStream0 = new FileOutputStream(file1);
        }
        catch(Throwable throwable0) {
            bufferedOutputStream0 = null;
            fileOutputStream0 = null;
            bufferedInputStream0 = null;
            goto label_23;
        }
        try {
            bufferedInputStream0 = new BufferedInputStream(zipFile0.getInputStream(zipEntry0));
        }
        catch(Throwable throwable0) {
            bufferedOutputStream0 = null;
            bufferedInputStream0 = null;
            goto label_23;
        }
        try {
            bufferedOutputStream0 = new BufferedOutputStream(fileOutputStream0);
            goto label_25;
        }
        catch(Throwable throwable0) {
            bufferedOutputStream0 = null;
        }
    label_23:
        Throwable throwable1 = throwable0;
        goto label_31;
        try {
        label_25:
            byte[] arr_b = new byte[0x2000];
            while(true) {
                int v = bufferedInputStream0.read(arr_b);
                if(v == -1) {
                    goto label_38;
                }
                bufferedOutputStream0.write(arr_b, 0, v);
            }
        }
        catch(Throwable throwable1) {
        }
    label_31:
        if(bufferedInputStream0 != null) {
            bufferedInputStream0.close();
        }
        if(bufferedOutputStream0 != null) {
            bufferedOutputStream0.close();
        }
        if(fileOutputStream0 != null) {
            fileOutputStream0.close();
        }
        throw throwable1;
    label_38:
        bufferedInputStream0.close();
        bufferedOutputStream0.close();
        fileOutputStream0.close();
        return true;
    }

    private static boolean Zh(File file0) {
        if(file0 == null) {
            return false;
        }
        if(file0.exists()) {
            return file0.isFile();
        }
        if(!ZX.PjT(file0.getParentFile())) {
            return false;
        }
        try {
            return file0.createNewFile();
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }

    private static boolean Zh(String s) {
        if(s == null) {
            return true;
        }
        int v = s.length();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!Character.isWhitespace(s.charAt(v1))) {
                return false;
            }
        }
        return true;
    }
}

