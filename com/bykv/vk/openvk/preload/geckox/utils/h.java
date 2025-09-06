package com.bykv.vk.openvk.preload.geckox.utils;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public final class h {
    private static byte[] a;
    private static byte[] b;

    static {
        h.a = new byte[]{80, 75, 3, 4};
        h.b = new byte[]{80, 75, 5, 6};
    }

    public static void a(InputStream inputStream0, String s, String s1) throws Exception {
        FileOutputStream fileOutputStream0;
        boolean z;
        ZipInputStream zipInputStream0;
        String s2;
        Closeable closeable0 = null;
        try {
            s2 = new File(s).getCanonicalPath();
            zipInputStream0 = new ZipInputStream(inputStream0);
            z = false;
        }
        catch(Throwable throwable0) {
            CloseableUtils.close(closeable0);
            throw throwable0;
        }
        try {
            ZipEntry zipEntry0;
            while((zipEntry0 = zipInputStream0.getNextEntry()) != null) {
                String s3 = zipEntry0.getName();
                if(!s3.startsWith("__MACOSX/") && !s3.equals(".DS_Store") && !s3.contains("../")) {
                    if(!s3.startsWith(s1 + "/")) {
                        throw new RuntimeException("the zip package outermost folder is not named by channel channel:" + s1);
                    }
                    if(zipEntry0.isDirectory()) {
                        File file0 = new File(s2, s3);
                        if(!file0.getCanonicalPath().startsWith(s2)) {
                            throw new RuntimeException("directory traversal, dir:" + s3 + ", channel:" + s1);
                        }
                        file0.mkdirs();
                    }
                    else {
                        String s4 = new File(s2, s3).getCanonicalPath();
                        if(!s4.startsWith(s2)) {
                            throw new RuntimeException("directory traversal, file name:" + s3);
                        }
                        File file1 = new File(s4);
                        file1.getParentFile().mkdirs();
                        try {
                            fileOutputStream0 = new FileOutputStream(file1);
                        }
                        catch(Throwable throwable1) {
                            CloseableUtils.close(closeable0);
                            throw throwable1;
                        }
                        try {
                            b.a(zipInputStream0, fileOutputStream0);
                        }
                        catch(Throwable throwable1) {
                            closeable0 = fileOutputStream0;
                            CloseableUtils.close(closeable0);
                            throw throwable1;
                        }
                        CloseableUtils.close(fileOutputStream0);
                    }
                }
                z = true;
            }
            if(!z) {
                inputStream0.reset();
                throw h.a(inputStream0) ? new RuntimeException("unzip file: channel:" + s1) : new RuntimeException("not zip file  channel:" + s1);
            }
        }
        catch(Throwable throwable0) {
            closeable0 = zipInputStream0;
            CloseableUtils.close(closeable0);
            throw throwable0;
        }
        CloseableUtils.close(zipInputStream0);
    }

    private static boolean a(InputStream inputStream0) throws Exception {
        try {
            byte[] arr_b = new byte[4];
            boolean z = false;
            if(inputStream0.read(arr_b, 0, 4) == 4) {
                if(Arrays.equals(h.a, arr_b) || Arrays.equals(h.b, arr_b)) {
                    z = true;
                }
                return z;
            }
            return false;
        }
        finally {
            CloseableUtils.close(inputStream0);
        }
    }
}

