package com.apm.insight.h;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import androidx.annotation.Nullable;
import com.apm.insight.a;
import com.apm.insight.l.f;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexPathList;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class c {
    static {
        new ArrayList();
    }

    @Nullable
    public static String a(Context context0, String s, File file0) {
        ApplicationInfo applicationInfo0 = context0.getApplicationInfo();
        String s1 = c.a(applicationInfo0.sourceDir, s, file0);
        if(s1 == null) {
            return null;
        }
        String[] arr_s = applicationInfo0.splitSourceDirs;
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            s1 = c.a(arr_s[v1], s, file0);
            if(s1 == null) {
                return null;
            }
        }
        ClassLoader classLoader0;
        for(classLoader0 = c.class.getClassLoader(); !(classLoader0 instanceof BaseDexClassLoader) && classLoader0.getParent() != null; classLoader0 = classLoader0.getParent()) {
        }
        if(classLoader0 instanceof BaseDexClassLoader) {
            BaseDexClassLoader.class.getDeclaredField("pathList").setAccessible(true);
            DexPathList dexPathList0 = classLoader0.pathList;
            Field field0 = dexPathList0.getClass().getDeclaredField("nativeLibraryDirectories");
            field0.setAccessible(true);
            String[] arr_s1 = (String[])field0.get(dexPathList0);
            for(int v = 0; v < arr_s1.length; ++v) {
                File file1 = new File(arr_s1[v], System.mapLibraryName(s));
                if(file1.exists()) {
                    f.a(file1, file0);
                    a.a(file0.getAbsolutePath());
                    return null;
                }
            }
            return "not_found";
        }
        return s1;
    }

    private static String a(String s, String s1, File file0) {
        FileOutputStream fileOutputStream0;
        InputStream inputStream0;
        String s3;
        ZipEntry zipEntry0;
        Closeable closeable1;
        ZipFile zipFile0;
        Closeable closeable0 = null;
        try {
            zipFile0 = new ZipFile(new File(s), 1);
        }
        catch(Throwable throwable0) {
            closeable1 = null;
            zipFile0 = null;
            goto label_41;
        }
        try {
            zipEntry0 = zipFile0.getEntry("lib/arm64-v8a/" + System.mapLibraryName(s1));
            if(zipEntry0 == null) {
                String s2 = "lib/arm64/" + System.mapLibraryName(s1);
                ZipEntry zipEntry1 = zipFile0.getEntry(s2);
                if(zipEntry1 != null) {
                    zipEntry0 = zipEntry1;
                    goto label_18;
                }
                s3 = "Library entry not found:" + s2;
                goto label_15;
            }
            goto label_18;
        }
        catch(Throwable throwable0) {
            closeable1 = null;
            goto label_41;
        }
    label_15:
        a.a(null);
        a.a(null);
        a.a(zipFile0);
        return s3;
        try {
        label_18:
            file0.createNewFile();
            inputStream0 = zipFile0.getInputStream(zipEntry0);
        }
        catch(Throwable throwable0) {
            closeable1 = null;
            goto label_41;
        }
        try {
            fileOutputStream0 = new FileOutputStream(file0);
        }
        catch(Throwable throwable1) {
            closeable1 = inputStream0;
            throwable0 = throwable1;
            goto label_41;
        }
        try {
            byte[] arr_b = new byte[0x1000];
            int v;
            while((v = inputStream0.read(arr_b)) > 0) {
                fileOutputStream0.write(arr_b, 0, v);
            }
            a.a(file0.getAbsolutePath());
            goto label_52;
        }
        catch(Throwable throwable2) {
            closeable0 = fileOutputStream0;
            closeable1 = inputStream0;
            throwable0 = throwable2;
        }
        try {
        label_41:
            s3 = throwable0.getMessage();
        }
        catch(Throwable throwable3) {
            a.a(closeable0);
            a.a(closeable1);
            a.a(zipFile0);
            throw throwable3;
        }
        a.a(closeable0);
        a.a(closeable1);
        a.a(zipFile0);
        return s3;
    label_52:
        a.a(fileOutputStream0);
        a.a(inputStream0);
        a.a(zipFile0);
        return null;
    }
}

