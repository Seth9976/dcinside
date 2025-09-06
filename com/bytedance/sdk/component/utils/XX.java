package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class XX {
    static final class PjT implements Comparator {
        private PjT() {
        }

        PjT(com.bytedance.sdk.component.utils.XX.1 xX$10) {
        }

        private int PjT(long v, long v1) {
            int v2 = Long.compare(v, v1);
            if(v2 < 0) {
                return -1;
            }
            return v2 == 0 ? 0 : 1;
        }

        public int PjT(File file0, File file1) {
            return this.PjT(file0.lastModified(), file1.lastModified());
        }

        @Override
        public int compare(Object object0, Object object1) {
            return this.PjT(((File)object0), ((File)object1));
        }
    }

    private static void JQp(File file0) throws IOException {
        RandomAccessFile randomAccessFile0;
        long v = file0.length();
        if(v == 0L) {
            XX.cz(file0);
            return;
        }
        try {
            randomAccessFile0 = null;
            randomAccessFile0 = new RandomAccessFile(file0, "rwd");
            randomAccessFile0.seek(v - 1L);
            int v1 = randomAccessFile0.readByte();
            randomAccessFile0.seek(v - 1L);
            randomAccessFile0.write(v1);
        }
        catch(Throwable unused_ex) {
            if(randomAccessFile0 != null) {
                randomAccessFile0.close();
            }
            return;
        }
        randomAccessFile0.close();
    }

    public static File PjT(Context context0, boolean z, String s) {
        String s1 = context0.getCacheDir().getAbsolutePath();
        if(z) {
            s = XX.PjT(context0) + "-" + s;
        }
        if(s1 != null && !s1.endsWith("/")) {
            s1 = s1 + "/";
        }
        File file0 = new File(s1 + s);
        if(!file0.exists()) {
            file0.mkdirs();
        }
        return file0;
    }

    public static File PjT(Context context0, boolean z, String s, String s1) {
        String s2 = XX.Zh(context0);
        if(z) {
            s = XX.PjT(context0) + "-" + s;
        }
        if(s2 != null && !s2.endsWith("/")) {
            s2 = s2 + "/";
        }
        String s3 = s2 + s;
        File file0 = new File(s3);
        if(!file0.exists()) {
            file0.mkdirs();
        }
        return new File(s3, s1);
    }

    public static String PjT(Context context0) {
        String s = tT.PjT(context0);
        return TextUtils.isEmpty(s) || !s.contains(":") ? s : s.replace(":", "-");
    }

    public static List PjT(File file0) {
        List list0 = new LinkedList();
        File[] arr_file = file0.listFiles();
        if(arr_file != null) {
            list0 = Arrays.asList(arr_file);
            Collections.sort(list0, new PjT(null));
        }
        return list0;
    }

    public static void ReZ(File file0) {
        if(file0 != null && file0.exists()) {
            if(file0.isFile()) {
                try {
                    file0.delete();
                }
                catch(Throwable unused_ex) {
                }
                return;
            }
            File[] arr_file = file0.listFiles();
            if(arr_file != null && arr_file.length > 0) {
                for(int v = 0; v < arr_file.length; ++v) {
                    File file1 = arr_file[v];
                    if(file1.isDirectory()) {
                        XX.ReZ(file1);
                    }
                    else {
                        try {
                            file1.delete();
                        }
                        catch(Throwable unused_ex) {
                        }
                    }
                }
            }
            try {
                file0.delete();
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    private static String Zh(Context context0) {
        if(context0 == null) {
            return null;
        }
        File file0 = context0.getCacheDir();
        return file0 == null ? null : file0.getPath();
    }

    public static void Zh(File file0) throws IOException {
        if(file0.exists()) {
            long v = System.currentTimeMillis();
            if(!file0.setLastModified(v)) {
                XX.JQp(file0);
                if(file0.lastModified() < v) {
                    new Date(file0.lastModified()).toString();
                    file0.getAbsolutePath();
                }
            }
        }
    }

    public static byte[] cr(File file0) {
        byte[] arr_b;
        FileInputStream fileInputStream0;
        if(file0 != null && file0.isFile() && file0.exists() && file0.canRead() && file0.length() > 0L) {
            try {
                long v = file0.length();
                fileInputStream0 = null;
                fileInputStream0 = new FileInputStream(file0);
                arr_b = new byte[v.intValue()];
                if(((long)fileInputStream0.read(arr_b)) == v) {
                    goto label_9;
                }
            }
            catch(Throwable unused_ex) {
                if(fileInputStream0 == null) {
                    return null;
                }
            }
            goto label_11;
            try {
            label_9:
                fileInputStream0.close();
            }
            catch(Throwable unused_ex) {
            }
            return arr_b;
            try {
            label_11:
                fileInputStream0.close();
                return null;
            }
            catch(Throwable unused_ex) {
            }
        }
        return null;
    }

    private static void cz(File file0) throws IOException {
        if(!file0.delete() || !file0.createNewFile()) {
            throw new IOException("Error recreate zero-size file " + file0);
        }
    }

    final class com.bytedance.sdk.component.utils.XX.1 implements Comparator {
        @Override
        public int compare(Object object0, Object object1) {
            throw null;
        }
    }

}

