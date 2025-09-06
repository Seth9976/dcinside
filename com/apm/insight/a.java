package com.apm.insight;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.entity.Header;
import com.apm.insight.l.j;
import com.apm.insight.nativecrash.NativeImpl;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipFile;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {
    private Map a;
    private Map b;
    private Map c;
    private ICrashFilter d;

    public a() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = null;
    }

    public static int a(JSONObject jSONObject0, int v, String[] arr_s) {
        JSONObject jSONObject1 = a.b(jSONObject0, arr_s);
        if(jSONObject1 == null) {
            return v;
        }
        int v1 = jSONObject1.optInt(arr_s[arr_s.length - 1], v);
        a.a("JSONUtil", "normal get jsonInt: " + arr_s[arr_s.length - 1] + " : " + v1);
        return v1;
    }

    @NonNull
    public static File a(String s, int v, int v1) {
        File file0 = new File(j.a(e.g(), s), "logcat.txt");
        if(file0.exists() && file0.length() > 0L) {
            return file0;
        }
        file0.getParentFile().mkdirs();
        try {
            file0.createNewFile();
        }
        catch(IOException unused_ex) {
        }
        NativeImpl.a(file0.getAbsolutePath(), String.valueOf(v), String.valueOf(v1));
        return file0;
    }

    @Nullable
    public static String a(JSONObject jSONObject0, String[] arr_s) {
        JSONObject jSONObject1 = a.b(jSONObject0, arr_s);
        if(jSONObject1 == null) {
            return null;
        }
        String s = jSONObject1.optString(arr_s[1]);
        a.a("ApmConfig", "normal get configArray: " + arr_s[1] + " : " + s);
        return s;
    }

    @Nullable
    public static JSONArray a(String[] arr_s) {
        if(arr_s == null) {
            return null;
        }
        JSONArray jSONArray0 = new JSONArray();
        for(int v = 0; v < arr_s.length; ++v) {
            jSONArray0.put(arr_s[v]);
        }
        return jSONArray0;
    }

    public static void a(com.apm.insight.entity.a a0, Header header0, CrashType crashType0) {
        if(a0 != null) {
            JSONObject jSONObject0 = a0.c();
            if(jSONObject0 != null && crashType0 != null) {
                long v = jSONObject0.optLong("crash_time");
                String s = e.c().a();
                if(v > 0L && !TextUtils.isEmpty(crashType0.getName())) {
                    try {
                        String s1 = "android__" + s + "_" + v + "_" + crashType0;
                        if(header0 != null) {
                            JSONObject jSONObject1 = header0.f();
                            if(jSONObject1 != null) {
                                jSONObject1.put("unique_key", s1);
                                return;
                            }
                            return;
                        }
                        jSONObject0.put("unique_key", s1);
                        return;
                    }
                    catch(JSONException jSONException0) {
                    }
                    jSONException0.printStackTrace();
                }
            }
        }
    }

    public static void a(Closeable closeable0) {
        if(closeable0 != null) {
            try {
                closeable0.close();
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    public static void a(Object object0) {
        if(e.i().isDebugMode()) {
            Log.i("npth", String.valueOf(object0));
        }
    }

    public static void a(String s) {
        com.apm.insight.h.a.a("android.os.FileUtils", "setPermissions", new Object[]{s, 493, -1, -1});
    }

    public static void a(String s, Object object0) {
        if(e.i().isDebugMode()) {
            Log.i("npth", s + " " + object0);
        }
    }

    private static void a(String s, Object object0, Throwable throwable0) {
        if(e.i().isDebugMode()) {
            Log.e("npth", s + " " + object0, throwable0);
        }
    }

    public static void a(Throwable throwable0) {
        if(e.i().isDebugMode()) {
            Log.e("npth", "NPTH Catch Error", throwable0);
        }
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

    public static void a(JSONObject jSONObject0, JSONObject jSONObject1) {
        Iterator iterator0 = jSONObject1.keys();
        try {
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                String s = (String)object0;
                if(!jSONObject0.has(s)) {
                    jSONObject0.put(s, jSONObject1.opt(s));
                }
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    public static boolean a(JSONArray jSONArray0) {
        return jSONArray0 == null || jSONArray0.length() == 0;
    }

    public static boolean a(JSONObject jSONObject0) {
        return jSONObject0 == null || jSONObject0.length() == 0;
    }

    // 去混淆评级： 低(20)
    public static boolean a(JSONObject jSONObject0, String s) {
        return a.a(jSONObject0) || a.a(jSONObject0.optJSONArray(s));
    }

    @Nullable
    public final List a(CrashType crashType0) {
        return (List)this.a.get(crashType0);
    }

    public final Map a() {
        return this.c;
    }

    final void a(AttachUserData attachUserData0, CrashType crashType0) {
        if(crashType0 == CrashType.ALL) {
            this.c(CrashType.LAUNCH, attachUserData0);
            this.c(CrashType.JAVA, attachUserData0);
            this.c(CrashType.CUSTOM_JAVA, attachUserData0);
            this.c(CrashType.NATIVE, attachUserData0);
            this.c(CrashType.ANR, attachUserData0);
            this.c(CrashType.DART, attachUserData0);
            return;
        }
        this.c(crashType0, attachUserData0);
    }

    final void a(CrashType crashType0, AttachUserData attachUserData0) {
        if(crashType0 == CrashType.ALL) {
            this.e(CrashType.LAUNCH, attachUserData0);
            this.e(CrashType.JAVA, attachUserData0);
            this.e(CrashType.CUSTOM_JAVA, attachUserData0);
            this.e(CrashType.NATIVE, attachUserData0);
            this.e(CrashType.ANR, attachUserData0);
            this.e(CrashType.DART, attachUserData0);
            return;
        }
        this.e(crashType0, attachUserData0);
    }

    final void a(ICrashFilter iCrashFilter0) {
        this.d = iCrashFilter0;
    }

    final void a(Map map0) {
        this.c.putAll(map0);
    }

    public static JSONArray b(JSONArray jSONArray0) {
        if(jSONArray0.length() <= 0x180) {
            return jSONArray0;
        }
        JSONArray jSONArray1 = new JSONArray();
        for(int v = 0; v < 0x100; ++v) {
            jSONArray1.put(jSONArray0.opt(v));
        }
        for(int v1 = 0x100; v1 < 0x180; ++v1) {
            jSONArray1.put(jSONArray0.opt(jSONArray0.length() - (0x180 - v1)));
        }
        return jSONArray1;
    }

    @Nullable
    public static JSONObject b(JSONObject jSONObject0, String[] arr_s) {
        if(jSONObject0 == null) {
            a.a("JSONUtil", "err get JsonFromParent: null json", new RuntimeException());
            return null;
        }
        for(int v = 0; v < arr_s.length - 1; ++v) {
            jSONObject0 = jSONObject0.optJSONObject(arr_s[v]);
            if(jSONObject0 == null) {
                a.a("JSONUtil", "err get json: not found node:" + arr_s[v]);
                return null;
            }
        }
        return jSONObject0;
    }

    public static void b(Object object0) {
        if(e.i().isDebugMode()) {
            Log.d("npth", String.valueOf(object0));
        }
    }

    public static void b(Throwable throwable0) {
        if(e.i().isDebugMode()) {
            Log.w("npth", "NPTH Catch Error", throwable0);
        }
    }

    public static boolean b(String s) {
        try {
            System.loadLibrary(s);
            return true;
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }

    @Nullable
    public final ICrashFilter b() {
        return this.d;
    }

    @Nullable
    public final List b(CrashType crashType0) {
        return (List)this.b.get(crashType0);
    }

    final void b(AttachUserData attachUserData0, CrashType crashType0) {
        if(crashType0 == CrashType.ALL) {
            this.d(CrashType.LAUNCH, attachUserData0);
            this.d(CrashType.JAVA, attachUserData0);
            this.d(CrashType.CUSTOM_JAVA, attachUserData0);
            this.d(CrashType.NATIVE, attachUserData0);
            this.d(CrashType.ANR, attachUserData0);
            this.d(CrashType.DART, attachUserData0);
            return;
        }
        this.d(crashType0, attachUserData0);
    }

    final void b(CrashType crashType0, AttachUserData attachUserData0) {
        if(crashType0 == CrashType.ALL) {
            this.f(CrashType.LAUNCH, attachUserData0);
            this.f(CrashType.JAVA, attachUserData0);
            this.f(CrashType.CUSTOM_JAVA, attachUserData0);
            this.f(CrashType.NATIVE, attachUserData0);
            this.f(CrashType.ANR, attachUserData0);
            this.f(CrashType.DART, attachUserData0);
            return;
        }
        this.f(crashType0, attachUserData0);
    }

    public static void c() {
        File file0 = new File(e.g().getFilesDir(), "apminsight/crashCommand");
        if(!file0.exists()) {
            return;
        }
        File[] arr_file = file0.listFiles();
        if(arr_file == null) {
            return;
        }
        for(int v = 0; v < arr_file.length; ++v) {
            File file1 = arr_file[v];
            try {
                file1.getName().split("_")[0].equals("0");
                file1.delete();
                continue;
            }
            catch(Throwable throwable0) {
                com.apm.insight.runtime.j.a(throwable0, "NPTH_CATCH");
            }
            try {
                file1.delete();
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    private void c(CrashType crashType0, AttachUserData attachUserData0) {
        List list0;
        if(this.a.get(crashType0) == null) {
            list0 = new ArrayList();
            this.a.put(crashType0, list0);
        }
        else {
            list0 = (List)this.a.get(crashType0);
        }
        list0.add(attachUserData0);
    }

    public static void d() {
        try {
            a.a("d8b6219012cdb0e9U", e.i().getLogcatDumpCount(), e.i().getLogcatLevel());
            a.g();
            a.i();
            a.h();
            a.j();
        }
        catch(Throwable unused_ex) {
        }
    }

    private void d(CrashType crashType0, AttachUserData attachUserData0) {
        List list0;
        if(this.b.get(crashType0) == null) {
            list0 = new ArrayList();
            this.b.put(crashType0, list0);
        }
        else {
            list0 = (List)this.b.get(crashType0);
        }
        list0.add(attachUserData0);
    }

    public static File e() {
        BufferedWriter bufferedWriter0;
        BufferedReader bufferedReader0;
        Closeable closeable0;
        File file0 = new File(j.e(e.g()), "anr_trace.txt");
        if(file0.exists()) {
            return file0;
        }
        if(!com.apm.insight.runtime.a.e()) {
            return file0;
        }
        File file1 = new File("/data/anr/traces.txt");
        if(!file1.exists()) {
            return file0;
        }
        try {
            closeable0 = null;
            file0.getParentFile().mkdirs();
            bufferedReader0 = new BufferedReader(new FileReader(file1));
        }
        catch(IOException unused_ex) {
            bufferedWriter0 = null;
            a.a(closeable0);
            a.a(bufferedWriter0);
            return file0;
        }
        catch(Throwable throwable0) {
            bufferedWriter0 = null;
            a.a(closeable0);
            a.a(bufferedWriter0);
            throw throwable0;
        }
        try {
            bufferedWriter0 = null;
            bufferedWriter0 = new BufferedWriter(new FileWriter(file0));
            int v = 0;
            do {
                String s = bufferedReader0.readLine();
                if(s == null) {
                    break;
                }
                bufferedWriter0.write(s);
                bufferedWriter0.write(10);
                v += s.length();
            }
            while(v < 0x100000);
            goto label_35;
        }
        catch(IOException unused_ex) {
            closeable0 = bufferedReader0;
            a.a(closeable0);
            a.a(bufferedWriter0);
            return file0;
        }
        catch(Throwable throwable0) {
            closeable0 = bufferedReader0;
        }
        a.a(closeable0);
        a.a(bufferedWriter0);
        throw throwable0;
    label_35:
        a.a(bufferedReader0);
        a.a(bufferedWriter0);
        return file0;
    }

    private void e(CrashType crashType0, AttachUserData attachUserData0) {
        List list0 = (List)this.a.get(crashType0);
        if(list0 != null) {
            list0.remove(attachUserData0);
        }
    }

    public static int f() {
        int v = Process.myPid();
        try {
            return new File("/proc/" + v + "/fd").listFiles().length;
        }
        catch(Throwable unused_ex) {
            return -1;
        }
    }

    private void f(CrashType crashType0, AttachUserData attachUserData0) {
        List list0 = (List)this.b.get(crashType0);
        if(list0 != null) {
            list0.remove(attachUserData0);
        }
    }

    @NonNull
    private static File g() {
        File file0 = new File(j.e(e.g()), "maps.txt");
        if(file0.exists()) {
            return file0;
        }
        file0.getParentFile().mkdirs();
        try {
            file0.createNewFile();
        }
        catch(IOException unused_ex) {
        }
        NativeImpl.f(file0.getAbsolutePath());
        return file0;
    }

    @NonNull
    private static File h() {
        File file0 = new File(j.e(e.g()), "meminfo.txt");
        if(file0.exists()) {
            return file0;
        }
        file0.getParentFile().mkdirs();
        try {
            file0.createNewFile();
        }
        catch(IOException unused_ex) {
        }
        NativeImpl.d(file0.getAbsolutePath());
        return file0;
    }

    private static File i() {
        File file0 = new File(j.e(e.g()), "fds.txt");
        if(file0.exists()) {
            return file0;
        }
        file0.getParentFile().mkdirs();
        try {
            file0.createNewFile();
        }
        catch(IOException unused_ex) {
        }
        NativeImpl.e(file0.getAbsolutePath());
        return file0;
    }

    private static File j() {
        File file0 = new File(j.e(e.g()), "threads.txt");
        if(file0.exists()) {
            return file0;
        }
        file0.getParentFile().mkdirs();
        try {
            file0.createNewFile();
        }
        catch(IOException unused_ex) {
        }
        NativeImpl.g(file0.getAbsolutePath());
        return file0;
    }
}

