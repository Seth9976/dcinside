package com.pgl.ssdk;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.pgl.ssdk.ces.out.DungeonFlag;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import org.json.JSONException;
import org.json.JSONObject;

public class t {
    private static volatile String a = null;
    private static volatile String b = null;
    private static volatile boolean c = false;
    private static String d = null;
    private static String e = null;
    private static String f = null;
    private static int g = -1;
    private static long h = 0L;
    private static long i = 0L;
    private static volatile long j = -1L;

    static {
    }

    @DungeonFlag
    private static e a(File file0) {
        List list0;
        RandomAccessFile randomAccessFile0 = null;
        try {
            randomAccessFile0 = new RandomAccessFile(file0, "r");
            o o0 = p.a(randomAccessFile0, 0L, randomAccessFile0.length());
            list0 = k.a(o0, c.a(o0));
            goto label_12;
        }
        catch(a unused_ex) {
        }
        catch(Throwable unused_ex) {
            goto label_8;
        }
        try {
            if(randomAccessFile0 != null) {
                randomAccessFile0.close();
                list0 = null;
                goto label_13;
            label_8:
                if(randomAccessFile0 != null) {
                    randomAccessFile0.close();
                }
            }
        }
        catch(IOException unused_ex) {
        }
        list0 = null;
        goto label_13;
        try {
        label_12:
            randomAccessFile0.close();
        }
        catch(IOException unused_ex) {
        }
    label_13:
        if(list0 == null || list0.isEmpty()) {
            list0 = j.a(file0);
        }
        return list0 == null || list0.isEmpty() ? null : ((e)list0.get(0));
    }

    public static String a(RandomAccessFile randomAccessFile0) {
        try {
            MessageDigest messageDigest0 = MessageDigest.getInstance("MD5");
            byte[] arr_b = new byte[0x100000];
            int v;
            while((v = randomAccessFile0.read(arr_b)) != -1) {
                messageDigest0.update(arr_b, 0, v);
            }
            String s;
            for(s = new BigInteger(1, messageDigest0.digest()).toString(16); s.length() < 0x20; s = "0" + s) {
            }
            return s;
        }
        catch(NoSuchAlgorithmException | FileNotFoundException | IOException unused_ex) {
            return "";
        }
    }

    public static String a(byte[] arr_b) {
        try {
            byte[] arr_b1 = MessageDigest.getInstance("SHA1").digest(arr_b);
            StringBuilder stringBuilder0 = new StringBuilder();
            for(int v = 0; v < arr_b1.length; ++v) {
                stringBuilder0.append(Integer.toHexString(arr_b1[v] & 0xFF | 0x100).substring(1, 3).toUpperCase());
                stringBuilder0.append(":");
            }
            return stringBuilder0.substring(0, stringBuilder0.length() - 1);
        }
        catch(NoSuchAlgorithmException unused_ex) {
            return null;
        }
    }

    public static void a() {
        SharedPreferences sharedPreferences0 = v0.a(x.b());
        if(sharedPreferences0 != null) {
            if(!TextUtils.isEmpty(t.a)) {
                sharedPreferences0.edit().putString("sa", t.a).apply();
            }
            if(!TextUtils.isEmpty(t.e)) {
                sharedPreferences0.edit().putString("md5", t.e).apply();
            }
            if(!TextUtils.isEmpty(t.d)) {
                sharedPreferences0.edit().putString("sj", t.d).apply();
            }
            if(t.h != 0L) {
                sharedPreferences0.edit().putLong("as", t.h).apply();
            }
            if(t.i != 0L) {
                sharedPreferences0.edit().putLong("ds", t.i).apply();
            }
            if(t.j != -1L) {
                sharedPreferences0.edit().putLong("mt", t.j).apply();
            }
            if(t.g != -1) {
                sharedPreferences0.edit().putInt("cpc", t.g).apply();
            }
            if(!TextUtils.isEmpty(t.f)) {
                sharedPreferences0.edit().putString("ap", t.f).apply();
            }
        }
    }

    public static void a(File file0, boolean z) {
        RandomAccessFile randomAccessFile0 = null;
        try {
            randomAccessFile0 = new RandomAccessFile(file0, "r");
            if(TextUtils.isEmpty(t.a)) {
                e e0 = t.a(file0);
                if(e0 != null) {
                    t.a = t.a(e0.a());
                    t.d = e0.b();
                    if(z) {
                        t.a();
                        goto label_9;
                    }
                }
            }
            goto label_11;
        }
        catch(FileNotFoundException unused_ex) {
            goto label_18;
        }
        catch(IOException unused_ex) {
            goto label_21;
        }
        catch(Throwable throwable0) {
            goto label_25;
        }
        try {
        label_9:
            randomAccessFile0.close();
        }
        catch(IOException unused_ex) {
        }
        return;
        try {
        label_11:
            if(TextUtils.isEmpty(t.e)) {
                t.e = t.a(randomAccessFile0);
            }
            if(t.h == 0L) {
                t.h = randomAccessFile0.length() / 0x400L;
            }
            if(t.i != 0L) {
                goto label_28;
            }
            t.i = t.b(file0);
            goto label_28;
        }
        catch(FileNotFoundException unused_ex) {
        }
        catch(IOException unused_ex) {
            goto label_21;
        }
        catch(Throwable throwable0) {
            goto label_25;
        }
        try {
        label_18:
            if(randomAccessFile0 != null) {
                randomAccessFile0.close();
                return;
            label_21:
                if(randomAccessFile0 != null) {
                    randomAccessFile0.close();
                    return;
                }
            }
        }
        catch(IOException unused_ex) {
        }
        return;
    label_25:
        if(randomAccessFile0 != null) {
            try {
                randomAccessFile0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        throw throwable0;
        try {
        label_28:
            randomAccessFile0.close();
        }
        catch(IOException unused_ex) {
        }
    }

    public static long b(File file0) {
        String s;
        int v1;
        int v;
        ZipFile zipFile0 = null;
        try {
            zipFile0 = new ZipFile(file0);
            v = 0;
            v1 = 0;
            goto label_6;
        }
        catch(ZipException unused_ex) {
            goto label_18;
        }
        catch(IOException unused_ex) {
        }
        catch(Throwable throwable0) {
            goto label_25;
        }
        goto label_21;
        while(true) {
        label_6:
            if(v1 == 0) {
                s = "classes.dex";
            }
            else {
                try {
                    s = String.format(Locale.getDefault(), "classes%d.dex", v1);
                label_10:
                    ZipEntry zipEntry0 = zipFile0.getEntry(s);
                    if(zipEntry0 == null) {
                        goto label_28;
                    }
                    v = (int)(((long)v) + zipEntry0.getSize());
                    ++v1;
                    continue;
                }
                catch(ZipException unused_ex) {
                    break;
                }
                catch(IOException unused_ex) {
                    goto label_21;
                }
                catch(Throwable throwable0) {
                    goto label_25;
                }
            }
            goto label_10;
        }
        try {
        label_18:
            if(zipFile0 != null) {
                zipFile0.close();
                return 0L;
            label_21:
                if(zipFile0 != null) {
                    zipFile0.close();
                    return 0L;
                }
            }
        }
        catch(IOException unused_ex) {
        }
        return 0L;
    label_25:
        if(zipFile0 != null) {
            try {
                zipFile0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        throw throwable0;
        try {
        label_28:
            zipFile0.close();
        }
        catch(IOException unused_ex) {
        }
        return (long)(v / 1000);
    }

    public static String b() {
        String s3;
        int v3;
        long v2;
        long v1;
        String s2;
        String s1;
        String s;
        if(TextUtils.isEmpty(t.a) || TextUtils.isEmpty(t.e) || t.g == -1) {
            SharedPreferences sharedPreferences0 = v0.a(x.b());
            long v = -1L;
            if(sharedPreferences0 == null) {
                s3 = null;
                s = null;
                s1 = null;
                s2 = null;
                v3 = 0;
                v1 = 0L;
                v2 = 0L;
            }
            else {
                v = sharedPreferences0.getLong("mt", -1L);
                s = sharedPreferences0.getString("sa", null);
                s1 = sharedPreferences0.getString("sj", null);
                s2 = sharedPreferences0.getString("md5", null);
                v1 = sharedPreferences0.getLong("as", 0L);
                v2 = sharedPreferences0.getLong("ds", 0L);
                v3 = sharedPreferences0.getInt("cpc", -1);
                s3 = sharedPreferences0.getString("ap", null);
            }
            String s4 = t.c();
            if(s4 == null) {
                return null;
            }
            File file0 = new File(s4);
            Object[] arr_object = (Object[])com.pgl.ssdk.ces.a.meta(0x9E, x.b(), s4);
            Integer integer0 = (Integer)arr_object[0];
            String s5 = (String)arr_object[1];
            long v4 = file0.lastModified();
            if(v4 != v || s == null || v3 == -1) {
                t.j = v4;
                if(s5 != null) {
                    t.f = s5;
                }
                if(integer0 != null) {
                    t.g = (int)integer0;
                }
                t.a(file0, false);
                t.a();
            }
            else {
                t.a = s;
                t.d = s1;
                t.h = v1;
                t.i = v2;
                t.e = s2;
                t.g = v3;
                t.f = s3;
            }
        }
        JSONObject jSONObject0 = new JSONObject();
        try {
            if(!TextUtils.isEmpty(t.a)) {
                jSONObject0.put("sign", t.a);
            }
            if(!TextUtils.isEmpty(t.d)) {
                jSONObject0.put("subject", t.d);
            }
            if(!TextUtils.isEmpty(t.e)) {
                jSONObject0.put("md5", t.e);
            }
            if(!TextUtils.isEmpty(t.f)) {
                jSONObject0.put("path", t.f);
            }
            long v5 = t.h;
            if(v5 != 0L) {
                jSONObject0.put("apkSize", v5);
            }
            long v6 = t.i;
            if(v6 != 0L) {
                jSONObject0.put("dexSize", v6);
            }
            int v7 = t.g;
            if(v7 != -1) {
                jSONObject0.put("code", v7);
            }
            t.f();
            jSONObject0.put("signpm", t.b);
            if(!TextUtils.isEmpty(t.b) && !TextUtils.isEmpty(t.a)) {
                if(!t.b.equals(t.a)) {
                    t.c = true;
                }
                jSONObject0.put("rebud", t.c);
            }
            return "{}";
        }
        catch(JSONException unused_ex) {
        }
        return null;
    }

    public static String c() {
        if(x.b() == null) {
            return null;
        }
        String s = x.b().getPackageCodePath();
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        File file0 = new File(s);
        return !file0.exists() || !file0.canRead() ? null : s;
    }

    public static void d() {
        if(TextUtils.isEmpty(t.a)) {
            SharedPreferences sharedPreferences0 = v0.a(x.b());
            String s = null;
            long v = -1L;
            if(sharedPreferences0 != null) {
                v = sharedPreferences0.getLong("mt", -1L);
                s = sharedPreferences0.getString("sa", null);
            }
            String s1 = t.c();
            if(TextUtils.isEmpty(s1)) {
                return;
            }
            File file0 = new File(s1);
            long v1 = file0.lastModified();
            if(v1 != v || s == null) {
                t.j = v1;
                t.a(file0, true);
                t.a();
            }
            else {
                t.a = s;
            }
        }
        t.f();
        if(!TextUtils.isEmpty(t.b) && !TextUtils.isEmpty(t.a) && !t.b.equals(t.a)) {
            t.c = true;
        }
    }

    public static String e() {
        t.d();
        return t.a;
    }

    public static String f() [...] // 潜在的解密器

    public static boolean g() {
        t.d();
        return t.c;
    }
}

