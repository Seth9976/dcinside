package com.bykv.vk.openvk.preload.geckox.utils;

import android.os.Process;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public final class b {
    public static String a(InputStream inputStream0) {
        String s1;
        BufferedReader bufferedReader0;
        try {
            StringBuilder stringBuilder0 = new StringBuilder();
            bufferedReader0 = null;
            bufferedReader0 = new BufferedReader(new InputStreamReader(inputStream0));
            String s;
            while((s = bufferedReader0.readLine()) != null) {
                stringBuilder0.append(s);
            }
            s1 = stringBuilder0.toString();
        }
        catch(Throwable unused_ex) {
            if(bufferedReader0 != null) {
                try {
                    bufferedReader0.close();
                }
                catch(Throwable unused_ex) {
                }
            }
            if(inputStream0 != null) {
                try {
                    inputStream0.close();
                }
                catch(Throwable unused_ex) {
                }
            }
            return null;
        }
        try {
            bufferedReader0.close();
        }
        catch(Throwable unused_ex) {
        }
        if(inputStream0 != null) {
            try {
                inputStream0.close();
            }
            catch(Throwable unused_ex) {
            }
        }
        return s1;
    }

    public static void a(InputStream inputStream0, OutputStream outputStream0) throws IOException {
        BufferedInputStream bufferedInputStream0 = new BufferedInputStream(inputStream0);
        BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(outputStream0);
        byte[] arr_b = new byte[0x400];
        int v;
        while((v = bufferedInputStream0.read(arr_b)) != -1) {
            bufferedOutputStream0.write(arr_b, 0, v);
        }
        bufferedOutputStream0.flush();
    }

    public static boolean a(File file0) {
        if(file0 != null && file0.exists()) {
            GeckoLogger.d("gecko-debug-tag", new Object[]{"delete file，pid:", Process.myPid(), ", thread:", "Thread[jeb-dexdec-sb-st-3810,5,main]", ", file:" + file0.getAbsolutePath()});
            return b.d(file0);
        }
        return true;
    }

    public static List b(File file0) {
        if(file0.exists() && file0.isDirectory()) {
            File[] arr_file = file0.listFiles();
            if(arr_file != null && arr_file.length != 0) {
                List list0 = Arrays.asList(arr_file);
                HashMap hashMap0 = new HashMap();
                for(Object object0: list0) {
                    hashMap0.put(((File)object0), ((File)object0).lastModified());
                }
                Collections.sort(list0, new Comparator() {
                    @Override
                    public final int compare(Object object0, Object object1) {
                        if(((File)object0) == null && ((File)object1) == null) {
                            return 0;
                        }
                        if(((File)object0) != null) {
                            return ((File)object1) == null ? -1 : Long.compare(((long)(((Long)hashMap0.get(((File)object0))))), ((long)(((Long)hashMap0.get(((File)object1))))));
                        }
                        return 1;
                    }
                });
                return list0;
            }
        }
        return null;
    }

    public static boolean c(File file0) {
        if(file0.isDirectory()) {
            String[] arr_s = file0.list();
            for(int v = 0; v < arr_s.length; ++v) {
                if(!b.c(new File(file0, arr_s[v]))) {
                    return false;
                }
            }
        }
        return file0.delete();
    }

    private static boolean d(File file0) {
        if(file0 != null && file0.exists()) {
            if(file0.isDirectory()) {
                File[] arr_file = file0.listFiles();
                if(arr_file != null) {
                    boolean z = true;
                    for(int v = 0; v < arr_file.length; ++v) {
                        z = z && b.d(arr_file[v]);
                    }
                    return z && file0.delete();
                }
                return file0.delete();
            }
            return file0.delete();
        }
        return true;
    }
}

