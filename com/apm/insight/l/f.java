package com.apm.insight.l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.e;
import com.apm.insight.entity.Header;
import com.apm.insight.entity.a;
import com.apm.insight.f.b;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.j;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class f {
    private final int a;
    private String b;
    private JSONObject c;
    private byte[] d;

    public f(int v) {
        this.a = v;
    }

    public f(int v, Throwable throwable0) {
        this.a = v;
        this.b = throwable0.getMessage();
    }

    public f(String s) {
        this.a = 206;
        this.b = s;
    }

    public f(JSONObject jSONObject0) {
        this.a = 0;
        this.c = jSONObject0;
    }

    public f(byte[] arr_b) {
        this.a = 204;
        this.d = arr_b;
    }

    private static a a(File file0, boolean z) {
        String s3;
        String s2;
        String s1;
        a a0 = new a();
        String s = "InvalidStack.NoStackAvailable: Catch a crash not OOM without stack.\n";
        if(file0.exists()) {
            try {
                s1 = null;
                s1 = f.a(file0.getAbsolutePath(), "\n");
            }
            catch(IOException unused_ex) {
            }
            if(TextUtils.isEmpty(s1)) {
                if(z) {
                    s = "InvalidStack.NoStackAvailable: Catch a OOM Exception without stack.\n";
                }
                s2 = null;
                s3 = null;
            }
            else {
                String[] arr_s = s1.split("\n");
                ArrayList arrayList0 = new ArrayList();
                StringBuilder stringBuilder0 = new StringBuilder();
                StringBuilder stringBuilder1 = new StringBuilder();
                boolean z1 = false;
                boolean z2 = false;
                for(int v = 0; v < arr_s.length; ++v) {
                    String s4 = arr_s[v];
                    if(!z1 && s4.startsWith("stack:")) {
                        z1 = true;
                    }
                    else if(!z2 && s4.startsWith("err:")) {
                        z2 = true;
                    }
                    else if(z2) {
                        stringBuilder1.append(s4);
                        stringBuilder1.append("\n");
                    }
                    else if(z1) {
                        stringBuilder0.append(s4);
                        stringBuilder0.append("\n");
                    }
                    else {
                        arrayList0.add(s4);
                    }
                }
                String s5 = arrayList0.size() <= 0 ? null : ((String)arrayList0.get(0));
                String s6 = arrayList0.size() < 2 ? null : ((String)arrayList0.get(1));
                String s7 = arrayList0.size() < 3 ? null : ((String)arrayList0.get(2));
                String s8 = arrayList0.size() < 4 ? null : ((String)arrayList0.get(3));
                if(z1 && stringBuilder0.length() > 0) {
                    s = stringBuilder0.toString();
                }
                else if(s7 != null) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(s7);
                    stringBuilder2.append("\nCaused by: ");
                    if(z) {
                        s = "InvalidStack.NoStackAvailable: Catch a OOM Exception without stack.\n";
                    }
                    stringBuilder2.append(s);
                    s = stringBuilder2.toString();
                }
                else if(s6 != null) {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append(s6);
                    stringBuilder3.append("\nCaused by: ");
                    if(z) {
                        s = "InvalidStack.NoStackAvailable: Catch a OOM Exception without stack.\n";
                    }
                    stringBuilder3.append(s);
                    s = stringBuilder3.toString();
                }
                else if(z) {
                    s = "InvalidStack.NoStackAvailable: Catch a OOM Exception without stack.\n";
                }
                if(z2 && stringBuilder1.length() > 0) {
                    s = s + "\nCaused by: InvalidStack.CrashWhenWriteStack: Npth error when dumpping the stack:\n" + stringBuilder1;
                }
                s3 = s5;
                s2 = s8;
            }
        }
        else {
            if(z) {
                s = "InvalidStack.NoStackAvailable: Catch a OOM Exception without stack.\n";
            }
            s2 = null;
            s3 = null;
        }
        a0.a("data", s);
        a0.a("process_name", s3);
        a0.a("crash_thread_name", s2);
        a0.a("isOOM", Boolean.valueOf(z));
        return a0;
    }

    public static b a(File file0, CrashType crashType0) {
        a a0 = f.f(file0);
        String s = file0.getName();
        String s1 = s.substring(s.lastIndexOf(0x5F) + 1);
        JSONObject jSONObject0 = a0.c().optJSONObject("header");
        if(jSONObject0.optString("unique_key", null) == null) {
            try {
                jSONObject0.put("unique_key", "android_" + e.c().a() + "_" + s1 + "_" + CrashType.LAUNCH);
            }
            catch(Throwable throwable0) {
                throwable0.printStackTrace();
            }
        }
        b b0 = new b();
        b0.a("");
        b0.a(a0.c());
        b0.a(false);
        return b0;
    }

    public static String a(File file0, String s) throws IOException {
        return f.b(file0, s);
    }

    public static String a(File file0, String s, String s1, JSONObject jSONObject0, boolean z) {
        return f.b(file0, s, s1, jSONObject0, z);
    }

    // 去混淆评级： 低(20)
    public static String a(String s, String s1) throws IOException {
        return TextUtils.isEmpty(s) ? null : f.b(new File(s), s1);
    }

    public static JSONArray a(@NonNull File file0, long v) throws IOException {
        BufferedReader bufferedReader0;
        JSONArray jSONArray0 = new JSONArray();
        try {
            bufferedReader0 = new BufferedReader(new FileReader(file0));
            if(v > 0L) {
                bufferedReader0.skip(v);
                bufferedReader0.readLine();
            }
            String s;
            while((s = bufferedReader0.readLine()) != null) {
                jSONArray0.put(s);
            }
            return jSONArray0;
        }
        finally {
            com.apm.insight.a.a(bufferedReader0);
        }
    }

    // 去混淆评级： 低(20)
    public static JSONArray a(String s) throws IOException {
        return TextUtils.isEmpty(s) ? null : f.a(new File(s), -1L);
    }

    public static void a(File file0, File file1) {
        FileOutputStream fileOutputStream0;
        FileInputStream fileInputStream0;
        Closeable closeable0;
        if(file1 == null) {
            return;
        }
        try {
            closeable0 = null;
            file1.getParentFile().mkdirs();
            fileInputStream0 = new FileInputStream(file0);
        }
        catch(Exception exception0) {
            fileOutputStream0 = null;
            goto label_21;
        }
        catch(Throwable throwable0) {
            fileOutputStream0 = null;
            com.apm.insight.a.a(closeable0);
            com.apm.insight.a.a(fileOutputStream0);
            throw throwable0;
        }
        try {
            fileOutputStream0 = null;
            fileOutputStream0 = new FileOutputStream(file1);
            byte[] arr_b = new byte[0x2000];
            while(true) {
                int v = fileInputStream0.read(arr_b);
                if(v <= 0) {
                    goto label_32;
                }
                fileOutputStream0.write(arr_b, 0, v);
            }
        }
        catch(Exception exception0) {
            closeable0 = fileInputStream0;
            try {
            label_21:
                exception0.printStackTrace();
            }
            catch(Throwable throwable0) {
                com.apm.insight.a.a(closeable0);
                com.apm.insight.a.a(fileOutputStream0);
                throw throwable0;
            }
            com.apm.insight.a.a(closeable0);
            com.apm.insight.a.a(fileOutputStream0);
            return;
        }
        catch(Throwable throwable0) {
            closeable0 = fileInputStream0;
        }
        com.apm.insight.a.a(closeable0);
        com.apm.insight.a.a(fileOutputStream0);
        throw throwable0;
    label_32:
        com.apm.insight.a.a(fileInputStream0);
        com.apm.insight.a.a(fileOutputStream0);
    }

    public static void a(@NonNull File file0, @NonNull String s, boolean z) throws IOException {
        FileOutputStream fileOutputStream0;
        if(TextUtils.isEmpty(s)) {
            return;
        }
        file0.getParentFile().mkdirs();
        try {
            fileOutputStream0 = new FileOutputStream(file0, z);
            fileOutputStream0.write(s.getBytes());
            fileOutputStream0.flush();
        }
        finally {
            com.apm.insight.a.a(fileOutputStream0);
        }
    }

    @Nullable
    public static void a(File file0, Map map0) {
        FileOutputStream fileOutputStream1;
        Properties properties0;
        FileOutputStream fileOutputStream0;
        if(map0 != null && !map0.isEmpty()) {
            try {
                fileOutputStream0 = null;
                properties0 = new Properties();
                fileOutputStream1 = new FileOutputStream(file0);
                goto label_7;
            }
            catch(IOException iOException0) {
                goto label_19;
                try {
                label_7:
                    for(Object object0: map0.entrySet()) {
                        properties0.setProperty(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
                    }
                    properties0.store(fileOutputStream1, "no");
                    goto label_27;
                }
                catch(IOException iOException0) {
                    fileOutputStream0 = fileOutputStream1;
                }
                catch(Throwable throwable0) {
                    fileOutputStream0 = fileOutputStream1;
                    com.apm.insight.a.a(fileOutputStream0);
                    throw throwable0;
                }
                try {
                label_19:
                    com.apm.insight.a.b(iOException0);
                    goto label_23;
                }
                catch(Throwable throwable0) {
                }
                com.apm.insight.a.a(fileOutputStream0);
                throw throwable0;
            }
            catch(Throwable throwable0) {
                com.apm.insight.a.a(fileOutputStream0);
                throw throwable0;
            }
        label_23:
            com.apm.insight.a.a(fileOutputStream0);
            return;
        label_27:
            com.apm.insight.a.a(fileOutputStream1);
        }
    }

    public static void a(@NonNull File file0, @NonNull JSONArray jSONArray0) throws IOException {
        BufferedWriter bufferedWriter0;
        if(jSONArray0 == null) {
            return;
        }
        file0.getParentFile().mkdirs();
        try {
            bufferedWriter0 = null;
            bufferedWriter0 = new BufferedWriter(new FileWriter(file0));
            h.a(jSONArray0, bufferedWriter0);
        }
        catch(Throwable unused_ex) {
            com.apm.insight.a.a(bufferedWriter0);
            return;
        }
        com.apm.insight.a.a(bufferedWriter0);
    }

    public static void a(@NonNull File file0, @NonNull JSONObject jSONObject0) throws IOException {
        BufferedWriter bufferedWriter0;
        if(jSONObject0 == null) {
            return;
        }
        file0.getParentFile().mkdirs();
        try {
            bufferedWriter0 = null;
            bufferedWriter0 = new BufferedWriter(new FileWriter(file0));
            h.a(jSONObject0, bufferedWriter0);
        }
        catch(Throwable unused_ex) {
            com.apm.insight.a.a(bufferedWriter0);
            return;
        }
        com.apm.insight.a.a(bufferedWriter0);
    }

    public static void a(OutputStream outputStream0, File[] arr_file) throws IOException {
        ZipOutputStream zipOutputStream0;
        try {
            zipOutputStream0 = new ZipOutputStream(outputStream0);
            zipOutputStream0.putNextEntry(new ZipEntry("/"));
            for(int v1 = 0; v1 < arr_file.length; ++v1) {
                f.a(zipOutputStream0, arr_file[v1]);
            }
        }
        finally {
            com.apm.insight.a.a(zipOutputStream0);
        }
    }

    private static void a(ZipOutputStream zipOutputStream0, File file0) throws IOException {
        if(file0 != null && file0.exists()) {
            File[] arr_file = file0.isDirectory() ? file0.listFiles() : new File[]{file0};
            if(arr_file == null) {
                return;
            }
            for(int v = 0; v < arr_file.length; ++v) {
                File file1 = arr_file[v];
                f.a(zipOutputStream0, file1, file1.getName());
            }
        }
    }

    private static void a(ZipOutputStream zipOutputStream0, File file0, String s) throws IOException {
        FileInputStream fileInputStream0;
        if(file0 != null && file0.exists()) {
            if(file0.isDirectory()) {
                File[] arr_file = file0.listFiles();
                if(arr_file == null) {
                    return;
                }
                zipOutputStream0.putNextEntry(new ZipEntry(s + "/"));
                String s1 = s.length() == 0 ? "" : s + "/";
                for(int v = 0; v < arr_file.length; ++v) {
                    f.a(zipOutputStream0, arr_file[v], s1 + arr_file[v].getName());
                }
                return;
            }
            zipOutputStream0.putNextEntry(new ZipEntry(s));
            try {
                fileInputStream0 = new FileInputStream(file0);
                byte[] arr_b = new byte[0x1000];
                while(true) {
                    int v2 = fileInputStream0.read(arr_b);
                    if(-1 == v2) {
                        break;
                    }
                    zipOutputStream0.write(arr_b, 0, v2);
                }
            }
            finally {
                com.apm.insight.a.a(fileInputStream0);
            }
        }
    }

    public static boolean a(@NonNull File file0) {
        boolean z1;
        boolean z = true;
        if(!file0.exists()) {
            return true;
        }
        if(!file0.canWrite()) {
            return false;
        }
        if(file0.isFile()) {
            return file0.delete();
        }
        if(file0.isDirectory()) {
            File[] arr_file = file0.listFiles();
            int v = 0;
            while(arr_file != null && v < arr_file.length) {
                if(arr_file[v].isFile()) {
                    if(arr_file[v].canWrite()) {
                        z1 = arr_file[v].delete();
                        goto label_18;
                    }
                    else {
                        z = false;
                        goto label_19;
                    }
                    goto label_17;
                }
                else {
                label_17:
                    z1 = f.a(arr_file[v]);
                }
            label_18:
                z &= z1;
            label_19:
                ++v;
            }
            return z & file0.delete();
        }
        return true;
    }

    public final boolean a() {
        return this.a != 0xCF;
    }

    public static b b(String s) {
        try {
            String s1 = f.a(s, "\n");
            if(s1 == null) {
                return null;
            }
            JSONObject jSONObject0 = new JSONObject(s1);
            b b0 = new b();
            b0.a(jSONObject0.optString("url"));
            b0.a(jSONObject0.optJSONObject("body"));
            b0.b(jSONObject0.optString("dump_file"));
            b0.a(jSONObject0.optBoolean("encrypt", false));
            return b0;
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    private static String b(File file0, String s) throws IOException {
        BufferedReader bufferedReader1;
        StringBuilder stringBuilder0 = new StringBuilder();
        BufferedReader bufferedReader0 = null;
        try {
            bufferedReader1 = new BufferedReader(new FileReader(file0));
        }
        catch(Throwable throwable0) {
            com.apm.insight.a.a(bufferedReader0);
            throw throwable0;
        }
        try {
            while(true) {
                String s1 = bufferedReader1.readLine();
                if(s1 == null) {
                    goto label_16;
                }
                if(stringBuilder0.length() != 0 && s != null) {
                    stringBuilder0.append(s);
                }
                stringBuilder0.append(s1);
            }
        }
        catch(Throwable throwable0) {
            bufferedReader0 = bufferedReader1;
        }
        com.apm.insight.a.a(bufferedReader0);
        throw throwable0;
    label_16:
        com.apm.insight.a.a(bufferedReader1);
        return stringBuilder0.toString();
    }

    private static String b(File file0, String s, String s1, JSONObject jSONObject0, boolean z) {
        if(!file0.exists()) {
            file0.mkdirs();
        }
        File file1 = new File(file0, s);
        JSONObject jSONObject1 = new JSONObject();
        try {
            jSONObject1.put("url", s1);
            jSONObject1.put("body", jSONObject0);
            jSONObject1.put("dump_file", "");
            jSONObject1.put("encrypt", z);
            f.a(file1, jSONObject1);
            return file1.getAbsolutePath();
        }
        catch(JSONException jSONException0) {
            jSONException0.printStackTrace();
            return file1.getAbsolutePath();
        }
        catch(IOException iOException0) {
            iOException0.printStackTrace();
            return file1.getAbsolutePath();
        }
    }

    public static void b(String s, String s1) throws Exception {
        Throwable throwable1;
        ZipOutputStream zipOutputStream0;
        File file0 = new File(s);
        try {
            new File(s1).getParentFile().mkdirs();
            zipOutputStream0 = new ZipOutputStream(new FileOutputStream(s1));
        }
        catch(Throwable throwable0) {
            zipOutputStream0 = null;
            throwable1 = throwable0;
            com.apm.insight.a.a(zipOutputStream0);
            throw throwable1;
        }
        try {
            f.a(zipOutputStream0, file0, "");
        }
        catch(Throwable throwable1) {
            com.apm.insight.a.a(zipOutputStream0);
            throw throwable1;
        }
        com.apm.insight.a.a(zipOutputStream0);
    }

    public static boolean b(File file0) {
        String[] arr_s = file0.list();
        return arr_s == null || arr_s.length == 0;
    }

    @Nullable
    public final byte[] b() {
        return this.d;
    }

    public static b c(String s) {
        try {
            JSONObject jSONObject0 = new JSONObject(f.a(s, "\n"));
            b b0 = new b();
            b0.d(jSONObject0.optString("aid"));
            b0.c(jSONObject0.optString("did"));
            b0.e(jSONObject0.optString("processName"));
            ArrayList arrayList0 = new ArrayList();
            JSONArray jSONArray0 = jSONObject0.optJSONArray("alogFiles");
            if(jSONArray0 != null) {
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    arrayList0.add(jSONArray0.getString(v));
                }
                b0.a(arrayList0);
            }
            return b0;
        }
        catch(IOException iOException0) {
        }
        catch(JSONException jSONException0) {
            jSONException0.printStackTrace();
            return null;
        }
        iOException0.printStackTrace();
        return null;
    }

    @Nullable
    public static Map c(File file0) {
        Map map0;
        FileInputStream fileInputStream1;
        Properties properties0;
        FileInputStream fileInputStream0 = null;
        try {
            properties0 = new Properties();
            fileInputStream1 = null;
            fileInputStream1 = new FileInputStream(file0);
            goto label_7;
        }
        catch(IOException iOException0) {
            goto label_16;
        }
        catch(Throwable throwable0) {
        }
        com.apm.insight.a.a(fileInputStream0);
        throw throwable0;
        try {
            try {
            label_7:
                properties0.load(fileInputStream1);
                Set set0 = properties0.stringPropertyNames();
                map0 = new HashMap();
                Iterator iterator0 = set0.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        goto label_23;
                    }
                    Object object0 = iterator0.next();
                    map0.put(((String)object0), properties0.getProperty(((String)object0)));
                }
            }
            catch(IOException iOException0) {
            }
        label_16:
            com.apm.insight.a.b(iOException0);
        }
        catch(Throwable throwable0) {
            fileInputStream0 = fileInputStream1;
            com.apm.insight.a.a(fileInputStream0);
            throw throwable0;
        }
        com.apm.insight.a.a(fileInputStream1);
        return null;
    label_23:
        com.apm.insight.a.a(fileInputStream1);
        return map0;
    }

    public static void d(File file0) {
        File file1 = new File(file0, "lock");
        try {
            file1.createNewFile();
            NativeImpl.c(file1.getAbsolutePath());
        }
        catch(Throwable throwable0) {
            j.a(throwable0, "NPTH_CATCH");
        }
    }

    public static boolean e(File file0) {
        if(!file0.isFile()) {
            file0 = new File(file0, "lock");
        }
        if(!file0.exists()) {
            return false;
        }
        try {
            int v = NativeImpl.c(file0.getAbsolutePath());
            if(v > 0) {
                NativeImpl.a(v);
                return false;
            }
            return v < 0;
        }
        catch(Throwable throwable0) {
            j.a(throwable0, "NPTH_CATCH");
            return false;
        }
    }

    private static a f(File file0) {
        a a0 = f.a(new File(file0, "logEventStack"), file0.getName().contains("oom"));
        boolean z = false;
        for(int v = 0; v < 6; ++v) {
            File file1 = com.apm.insight.l.j.a(file0, "." + v);
            if(file1.exists()) {
                try {
                    a0.c(new JSONObject(f.a(file1.getAbsolutePath(), "\n")));
                    z = true;
                }
                catch(Throwable unused_ex) {
                }
            }
        }
        a0.a("crash_type", (z ? "step" : "simple"));
        JSONObject jSONObject0 = a0.c().optJSONObject("header");
        JSONObject jSONObject1 = Header.a(a0.c().optLong("crash_time", 0L)).f();
        if(jSONObject0 == null) {
            a0.a(jSONObject1);
            return a0;
        }
        com.apm.insight.a.a(jSONObject0, jSONObject1);
        return a0;
    }
}

