package com.pgl.ssdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class u0 {
    public static class a {
        public int a;
        public String b;

        public a(int v, String[] arr_s) {
            this.a = v;
            JSONArray jSONArray0 = new JSONArray();
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                jSONArray0.put(arr_s[v1]);
            }
            this.b = jSONArray0.toString();
        }
    }

    private static List a;

    static {
        u0.a = new ArrayList();
    }

    private static a a(Context context0, String s, File file0) {
        a u0$a0;
        FileOutputStream fileOutputStream0;
        InputStream inputStream0;
        ZipEntry zipEntry0;
        Closeable closeable1;
        Closeable closeable0;
        ZipFile zipFile0;
        try {
            zipFile0 = new ZipFile(new File(context0.getApplicationInfo().sourceDir), 1);
        }
        catch(Throwable throwable0) {
            zipFile0 = null;
            closeable0 = null;
            closeable1 = null;
            goto label_45;
        }
        try {
            zipEntry0 = u0.a(zipFile0, "arm64-v8a", s);
            if(zipEntry0 == null) {
                goto label_9;
            }
            goto label_15;
        }
        catch(Throwable throwable0) {
            goto label_43;
        }
        try {
        label_9:
            zipEntry0 = u0.a(zipFile0, "arm64-v8a", s);
        }
        catch(Throwable throwable0) {
            closeable0 = null;
            closeable1 = null;
            goto label_45;
        }
        try {
        label_15:
            if(zipEntry0 != null) {
                file0.createNewFile();
                inputStream0 = zipFile0.getInputStream(zipEntry0);
                goto label_18;
            }
            u0$a0 = new a(2, new String[]{u0.a(zipFile0, s)});
            goto label_53;
        }
        catch(Throwable throwable0) {
            goto label_43;
        }
        try {
        label_18:
            fileOutputStream0 = new FileOutputStream(file0);
        }
        catch(Throwable throwable1) {
            closeable0 = inputStream0;
            throwable0 = throwable1;
            goto label_44;
        }
        try {
            byte[] arr_b = new byte[0x4000];
            int v;
            while((v = inputStream0.read(arr_b)) > 0) {
                fileOutputStream0.write(arr_b, 0, v);
            }
            q0.a(file0.getAbsolutePath(), 493);
        }
        catch(Throwable throwable2) {
            closeable0 = inputStream0;
            throwable0 = throwable2;
            closeable1 = fileOutputStream0;
            goto label_45;
        }
        q0.a(fileOutputStream0);
        q0.a(inputStream0);
        q0.a(zipFile0);
        return null;
        try {
            u0$a0 = new a(2, new String[]{u0.a(zipFile0, s)});
            goto label_53;
        }
        catch(Throwable throwable0) {
        label_43:
            closeable0 = null;
        }
    label_44:
        closeable1 = null;
    label_45:
        try {
            return new a(3, new String[]{throwable0.getMessage()});
        }
        finally {
            q0.a(closeable1);
            q0.a(closeable0);
            q0.a(zipFile0);
        }
    label_53:
        q0.a(null);
        q0.a(null);
        q0.a(zipFile0);
        return u0$a0;
    }

    private static File a(Context context0) {
        if(context0 != null && context0.getFilesDir() != null) {
            File file0 = new File(context0.getFilesDir(), "libso");
            if(!file0.exists()) {
                q0.a(file0.getAbsolutePath());
            }
            return file0;
        }
        return null;
    }

    private static File a(Context context0, String s) {
        String s1 = System.mapLibraryName(s);
        File file0 = u0.a(context0);
        return file0 == null ? null : new File(file0, s1);
    }

    private static String a(ZipFile zipFile0, String s) {
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < 5; ++v) {
            String s1 = new String[]{"armeabi-v7a", "arm64-v8a", "x86", "x86_64", "armeabi"}[v];
            if(u0.a(zipFile0, s1, s) != null) {
                arrayList0.add(s1);
            }
        }
        List list0 = Arrays.asList(Build.SUPPORTED_ABIS);
        ArrayList arrayList1 = new ArrayList();
        if(!TextUtils.isEmpty("arm64-v8a")) {
            arrayList1.add("arm64-v8a");
        }
        if(!TextUtils.isEmpty("arm64-v8a")) {
            arrayList1.add("arm64-v8a");
        }
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("supportedABIS", list0);
            jSONObject0.put("curABIs", arrayList1);
            jSONObject0.put("apkABIS", arrayList0);
            return jSONObject0.toString();
        }
        catch(JSONException unused_ex) {
            return "";
        }
    }

    private static ZipEntry a(ZipFile zipFile0, String s, String s1) {
        ZipEntry zipEntry0 = zipFile0.getEntry("lib/" + s + "/" + System.mapLibraryName(s1));
        if(zipEntry0 != null) {
            return zipEntry0;
        }
        int v = s.indexOf(45);
        StringBuilder stringBuilder0 = new StringBuilder("lib/");
        if(v <= 0) {
            v = s.length();
        }
        stringBuilder0.append(s.substring(0, v));
        stringBuilder0.append("/");
        stringBuilder0.append(System.mapLibraryName(s1));
        return zipFile0.getEntry(stringBuilder0.toString());
    }

    public static a b(Context context0, String s) {
        synchronized(u0.class) {
            if(u0.a.contains(s)) {
                return null;
            }
            try {
                System.loadLibrary(s);
                u0.a.add(s);
            }
            catch(UnsatisfiedLinkError unsatisfiedLinkError0) {
                File file0 = u0.a(context0, s);
                if(file0 == null) {
                    return new a(3, new String[]{unsatisfiedLinkError0.getMessage(), "output null"});
                }
                if(file0.exists()) {
                    file0.delete();
                }
                a u0$a1 = u0.a(context0, s, file0);
                if(u0$a1 != null) {
                    return u0$a1;
                }
                try {
                    System.load(file0.getAbsolutePath());
                    u0.a.add(s);
                }
                catch(Throwable throwable1) {
                    return new a(3, new String[]{unsatisfiedLinkError0.getMessage(), throwable1.getMessage()});
                }
            }
            catch(Throwable throwable0) {
                return new a(3, new String[]{throwable0.getMessage()});
            }
            return null;
        }
    }
}

