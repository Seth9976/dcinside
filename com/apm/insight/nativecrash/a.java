package com.apm.insight.nativecrash;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashFilter;
import com.apm.insight.e;
import com.apm.insight.entity.Header;
import com.apm.insight.l.h;
import com.apm.insight.l.m;
import com.apm.insight.l.n;
import com.apm.insight.runtime.j;
import com.apm.insight.runtime.o;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {
    static final class com.apm.insight.nativecrash.a.a {
        private static String b(File file0) {
            BufferedReader bufferedReader0 = null;
            try {
                bufferedReader0 = new BufferedReader(new FileReader(file0));
                String s = bufferedReader0.readLine();
                if(s != null) {
                    if(s.startsWith("[FATAL:jni_android.cc") && s.contains("Please include Java exception stack in crash report ttwebview:")) {
                        StringBuilder stringBuilder0 = new StringBuilder();
                        stringBuilder0.append("Caused by: ");
                        stringBuilder0.append("Please include Java exception stack in crash report");
                        stringBuilder0.append("\n");
                        stringBuilder0.append(s.substring(s.indexOf(" ttwebview:") + 11));
                        stringBuilder0.append("\n");
                        String s1;
                        while((s1 = bufferedReader0.readLine()) != null) {
                            stringBuilder0.append(s1);
                            stringBuilder0.append("\n");
                        }
                        return stringBuilder0.toString();
                    }
                    return "";
                }
                return "";
            }
            catch(Throwable throwable0) {
                j.a(throwable0, "NPTH_CATCH");
                return "";
            }
            finally {
                com.apm.insight.a.a(bufferedReader0);
            }
        }
    }

    final class b {
        private final c a;
        private final com.apm.insight.h.b b;
        private final File c;
        private final File d;
        private a e;

        public b(File file0) {
            this.c = file0;
            this.d = com.apm.insight.l.j.a(e.g(), file0.getName());
            com.apm.insight.h.b b0 = new com.apm.insight.h.b(file0);
            this.b = b0;
            c c0 = new c(file0);
            this.a = c0;
            if(b0.d() && c0.a() == null) {
                c0.a(file0);
            }
        }

        public final long a() {
            String s;
            Map map0 = this.b.f();
            try {
                if(map0 == null) {
                    s = null;
                }
                else if(!map0.isEmpty()) {
                    s = (String)map0.get("start_time");
                }
                else {
                    s = null;
                }
                if(s != null) {
                    return Long.parseLong(s);
                }
            }
            catch(Throwable throwable0) {
                j.a(throwable0, "NPTH_CATCH");
            }
            return System.currentTimeMillis();
        }

        public final File b() {
            return this.c;
        }

        public final boolean c() {
            return this.b.d();
        }
    }

    public final class com.apm.insight.nativecrash.a.c extends com.apm.insight.nativecrash.a.e {
        private a e;

        com.apm.insight.nativecrash.a.c() {
            this.b = "Total FD Count:";
            this.a = com.apm.insight.l.j.i(a0.c.b());
            this.c = ":";
            this.d = -2;
        }
    }

    public final class d extends com.apm.insight.nativecrash.a.e {
        private a e;

        d() {
            this.b = "VmSize:";
            this.a = com.apm.insight.l.j.k(a0.c.b());
            this.c = "\\s+";
            this.d = -1;
        }
    }

    public class com.apm.insight.nativecrash.a.e {
        protected File a;
        protected String b;
        protected String c;
        protected int d;
        private a e;

        private int a(String s) {
            int v = this.d;
            if(s.startsWith(this.b)) {
                try {
                    v = Integer.parseInt(s.split(this.c)[1].trim());
                }
                catch(NumberFormatException numberFormatException0) {
                    j.a(numberFormatException0, "NPTH_CATCH");
                }
                return v >= 0 ? v : -2;
            }
            return v;
        }

        public final int a() {
            int v1;
            Throwable throwable1;
            int v;
            BufferedReader bufferedReader0;
            if(this.a.exists() && this.a.isFile()) {
                try {
                    bufferedReader0 = new BufferedReader(new FileReader(this.a));
                    v = -1;
                }
                catch(Throwable throwable0) {
                    bufferedReader0 = null;
                    throwable1 = throwable0;
                    v1 = -1;
                    goto label_16;
                }
                try {
                    do {
                        String s = bufferedReader0.readLine();
                        if(s == null) {
                            break;
                        }
                        v = this.a(s);
                    }
                    while(v == -1);
                    goto label_25;
                }
                catch(Throwable throwable1) {
                    v1 = v;
                }
                try {
                label_16:
                    j.a(throwable1, "NPTH_CATCH");
                }
                catch(Throwable throwable2) {
                    if(bufferedReader0 != null) {
                        com.apm.insight.a.a(bufferedReader0);
                    }
                    throw throwable2;
                }
                if(bufferedReader0 != null) {
                    com.apm.insight.a.a(bufferedReader0);
                }
                return v1;
            label_25:
                com.apm.insight.a.a(bufferedReader0);
                return v;
            }
            return -1;
        }
    }

    public final class f extends com.apm.insight.nativecrash.a.e {
        private a e;

        f() {
            this.b = "Total Threads Count:";
            this.a = com.apm.insight.l.j.j(a0.c.b());
            this.c = ":";
            this.d = -2;
        }
    }

    private final Context a;
    private JSONObject b;
    private b c;
    private static Boolean d;

    static {
    }

    public a(Context context0) {
        this.b = null;
        this.a = context0;
    }

    private static String a(String s) {
        StringBuilder stringBuilder0 = new StringBuilder();
        try {
            if(s.length() < 16) {
                stringBuilder0.append(s);
                return stringBuilder0.toString().toUpperCase();
            }
            stringBuilder0.append(s.charAt(6));
            stringBuilder0.append(s.charAt(7));
            stringBuilder0.append(s.charAt(4));
            stringBuilder0.append(s.charAt(5));
            stringBuilder0.append(s.charAt(2));
            stringBuilder0.append(s.charAt(3));
            stringBuilder0.append(s.charAt(0));
            stringBuilder0.append(s.charAt(1));
            stringBuilder0.append(s.charAt(10));
            stringBuilder0.append(s.charAt(11));
            stringBuilder0.append(s.charAt(8));
            stringBuilder0.append(s.charAt(9));
            stringBuilder0.append(s.charAt(14));
            stringBuilder0.append(s.charAt(15));
            stringBuilder0.append(s.charAt(12));
            stringBuilder0.append(s.charAt(13));
            if(s.length() >= 0x20) {
                stringBuilder0.append(s, 16, 0x20);
                stringBuilder0.append('0');
                return stringBuilder0.toString().toUpperCase();
            }
        }
        catch(Throwable throwable0) {
            j.a(throwable0, "NPTH_CATCH");
            return stringBuilder0.toString().toUpperCase();
        }
        return stringBuilder0.toString().toUpperCase();
    }

    private void a(com.apm.insight.entity.a a0) {
        File file0 = com.apm.insight.l.j.a(this.c.b());
        if(!file0.exists()) {
            return;
        }
        try {
            String s = com.apm.insight.l.f.a(file0.getAbsolutePath(), "\n");
            JSONArray jSONArray0 = new JSONArray();
            if(s != null) {
                String[] arr_s = s.split("\n");
                for(int v = 0; v < arr_s.length; ++v) {
                    jSONArray0.put(arr_s[v]);
                }
            }
            a0.a("native_log", jSONArray0);
            return;
        }
        catch(Throwable throwable0) {
        }
        j.a(throwable0, "NPTH_CATCH");
    }

    public final void a(File file0) {
        this.c = new b(this, file0);
    }

    public final boolean a() {
        return this.c == null ? false : this.c.c();
    }

    private void b(com.apm.insight.entity.a a0) {
        BufferedReader bufferedReader0;
        File file0 = com.apm.insight.l.j.h(this.c.b());
        if(!file0.exists()) {
            NativeImpl.a(file0.getAbsolutePath(), "512", "1");
        }
        JSONArray jSONArray0 = new JSONArray();
        String s = " " + ((String)this.c.b.f().get("pid")) + " ";
        try {
            bufferedReader0 = null;
            bufferedReader0 = new BufferedReader(new FileReader(file0));
            if(file0.length() > 0x7D000L) {
                bufferedReader0.skip(file0.length() - 0x7D000L);
            }
            String s1;
            while((s1 = bufferedReader0.readLine()) != null) {
                if((s1.length() <= 0x20 ? s1 : s1.substring(0, 0x1F)).contains(s)) {
                    jSONArray0.put(s1);
                }
            }
        }
        catch(Throwable unused_ex) {
        }
        com.apm.insight.a.a(bufferedReader0);
        a0.a("logcat", jSONArray0);
    }

    public final JSONObject b() {
        File file0 = com.apm.insight.l.j.f(this.c.b());
        if(!file0.exists()) {
            return null;
        }
        try {
            String s = com.apm.insight.l.f.a(file0.getAbsolutePath(), "\n");
            if(s != null && !s.isEmpty()) {
                return new JSONObject(s);
            }
        }
        catch(Throwable throwable0) {
            j.a(throwable0, "NPTH_CATCH");
        }
        return null;
    }

    public final void c() {
        Throwable throwable1;
        BufferedWriter bufferedWriter0;
        JSONObject jSONObject1;
        int v;
        File file1;
        File file0;
        try {
            file0 = com.apm.insight.l.j.e(this.c.b());
            file1 = new File(file0.getAbsolutePath() + ".tmp\'");
            if(file1.exists()) {
                file1.delete();
            }
            v = 0;
            if(file0.exists()) {
                while(v < 6) {
                    File file2 = new File(file0.getAbsolutePath() + '.' + v);
                    if(file2.exists()) {
                        file2.delete();
                    }
                    ++v;
                }
                return;
            }
            com.apm.insight.entity.a a0 = new com.apm.insight.entity.a();
            for(int v1 = 0; v1 < 6; ++v1) {
                File file3 = new File(file0.getAbsolutePath() + '.' + v1);
                if(file3.exists()) {
                    try {
                        String s = com.apm.insight.l.f.a(file3.getAbsolutePath(), "\n");
                        if(!TextUtils.isEmpty(s)) {
                            JSONObject jSONObject0 = new JSONObject(s);
                            if(jSONObject0.length() > 0) {
                                a0.c(jSONObject0);
                            }
                        }
                    }
                    catch(JSONException jSONException0) {
                        j.a(jSONException0, "NPTH_CATCH");
                    }
                }
            }
            jSONObject1 = a0.c();
        }
        catch(IOException iOException0) {
            j.a(iOException0, "NPTH_CATCH");
            return;
        }
        try {
            if(jSONObject1.length() != 0 && jSONObject1.opt("storage") == null) {
                com.apm.insight.entity.a.a(jSONObject1, n.a());
            }
        }
        catch(Throwable unused_ex) {
        }
        try {
            if(jSONObject1.length() != 0) {
                this.b = jSONObject1;
                file1.getParentFile().mkdirs();
                goto label_34;
            }
        }
        catch(IOException iOException0) {
            j.a(iOException0, "NPTH_CATCH");
        }
        return;
        try {
        label_34:
            bufferedWriter0 = new BufferedWriter(new FileWriter(file1));
        }
        catch(Throwable throwable0) {
            bufferedWriter0 = null;
            throwable1 = throwable0;
            goto label_43;
        }
        try {
            h.a(jSONObject1, bufferedWriter0);
            goto label_50;
        }
        catch(Throwable throwable1) {
        }
        try {
            try {
            label_43:
                jSONObject1.put("err_write", throwable1.toString());
                com.apm.insight.entity.a.a(jSONObject1, "filters", "err_write", throwable1.getLocalizedMessage());
            }
            catch(JSONException unused_ex) {
            }
            j.a(throwable1, "NPTH_CATCH");
            goto label_50;
        }
        catch(Throwable throwable2) {
            try {
                com.apm.insight.a.a(bufferedWriter0);
                throw throwable2;
            label_50:
                com.apm.insight.a.a(bufferedWriter0);
                if(file1.renameTo(file0)) {
                    while(v < 6) {
                        File file4 = new File(file0.getAbsolutePath() + '.' + v);
                        if(file4.exists()) {
                            file4.delete();
                        }
                        ++v;
                    }
                }
                return;
            }
            catch(IOException iOException0) {
            }
        }
        j.a(iOException0, "NPTH_CATCH");
    }

    public final boolean d() {
        ICrashFilter iCrashFilter0 = e.b().b();
        if(iCrashFilter0 != null) {
            try {
                if(!iCrashFilter0.onNativeCrashFilter(this.l(), "")) {
                    return false;
                }
            }
            catch(Throwable throwable0) {
                j.a(throwable0, "NPTH_CATCH");
            }
        }
        return true;
    }

    public final boolean e() {
        File file0 = com.apm.insight.l.j.f(this.c.b());
        return com.apm.insight.e.a.a().a(file0.getAbsolutePath());
    }

    public final void f() {
        com.apm.insight.d.a a0 = com.apm.insight.d.a.b(com.apm.insight.l.j.f(this.c.b()).getAbsolutePath());
        com.apm.insight.e.a.a().a(a0);
    }

    public static long g() {
        if(NativeImpl.f()) {
            return 0x7FFFFFFFFFFFFFFFL;
        }
        return Header.a() ? 0x3B6000L : 0x2BC000L;
    }

    public final JSONObject h() {
        JSONArray jSONArray1;
        HashMap hashMap0;
        String s7;
        File file1;
        long v2;
        long v1;
        long v;
        File file0;
        String s4;
        String s2;
        String s1;
        Map map0;
        boolean z;
        com.apm.insight.entity.a a0;
        try {
            a0 = new com.apm.insight.entity.a();
            Header header0 = new Header(this.a);
            JSONObject jSONObject0 = o.a().a(this.c.a());
            if(jSONObject0 != null) {
                header0.a(jSONObject0);
                header0.d();
                header0.e();
            }
            Header.b(header0);
            a0.a(header0);
            z = true;
            a0.a("is_native_crash", 1);
            a0.a("repack_time", System.currentTimeMillis());
            a0.a("crash_uuid", this.c.b().getName());
            map0 = this.c == null ? null : this.c.b.f();
            if(map0 != null) {
                String s = (String)map0.get("process_name");
                if(s != null) {
                    a0.a("process_name", s);
                }
                s1 = (String)map0.get("start_time");
                if(s1 != null) {
                    goto label_20;
                }
                goto label_24;
            }
            goto label_40;
        }
        catch(Throwable throwable0) {
            j.a(throwable0, "NPTH_CATCH");
            return null;
        }
        try {
        label_20:
            a0.a(((long)Long.decode(s1)));
            goto label_24;
        }
        catch(Throwable throwable1) {
            try {
                j.a(throwable1, "NPTH_CATCH");
            label_24:
                s2 = (String)map0.get("pid");
                if(s2 != null) {
                    goto label_26;
                }
                goto label_30;
            }
            catch(Throwable throwable0) {
                j.a(throwable0, "NPTH_CATCH");
                return null;
            }
        }
        try {
        label_26:
            a0.a("pid", Long.decode(s2));
            goto label_30;
        }
        catch(Throwable throwable2) {
            try {
                j.a(throwable2, "NPTH_CATCH");
            label_30:
                String s3 = (String)map0.get("crash_thread_name");
                if(s3 != null) {
                    a0.a("crash_thread_name", s3);
                }
                s4 = (String)map0.get("crash_time");
                if(s4 != null) {
                    goto label_35;
                }
                goto label_39;
            }
            catch(Throwable throwable0) {
                j.a(throwable0, "NPTH_CATCH");
                return null;
            }
        }
        try {
        label_35:
            a0.a("crash_time", Long.decode(s4));
            goto label_39;
        }
        catch(Throwable throwable3) {
            try {
                j.a(throwable3, "NPTH_CATCH");
            label_39:
                a0.a("data", this.l());
            label_40:
                Map map1 = this.c.a.b();
                if(!map1.isEmpty()) {
                    JSONArray jSONArray0 = new JSONArray();
                    Iterator iterator0 = map1.keySet().iterator();
                    while(true) {
                        if(!iterator0.hasNext()) {
                            a0.a("crash_lib_uuid", jSONArray0);
                            break;
                        }
                        Object object0 = iterator0.next();
                        String s5 = (String)object0;
                        String s6 = a.a(((String)map1.get(s5)));
                        try {
                            JSONObject jSONObject1 = new JSONObject();
                            jSONObject1.put("lib_name", s5);
                            jSONObject1.put("lib_uuid", s6);
                            jSONArray0.put(jSONObject1);
                        }
                        catch(JSONException jSONException0) {
                            j.a(jSONException0, "NPTH_CATCH");
                        }
                    }
                }
                file0 = com.apm.insight.l.j.e(this.c.b());
                if(!file0.exists() && this.b == null) {
                    a0.b(n.a());
                    a0.a("has_callback", "false");
                    goto label_78;
                }
            }
            catch(Throwable throwable0) {
                j.a(throwable0, "NPTH_CATCH");
                return null;
            }
        }
        try {
            a0.c((this.b == null ? new JSONObject(com.apm.insight.l.f.a(file0.getAbsolutePath(), "\n")) : this.b));
            a0.a("has_callback", "true");
            if(a0.c().opt("storage") == null) {
                a0.b(n.a());
            }
            com.apm.insight.a.a(a0, a0.d(), CrashType.NATIVE);
            goto label_71;
        }
        catch(Throwable throwable4) {
        }
        try {
            j.a(throwable4, "NPTH_CATCH");
        label_71:
            v = -1L;
            v1 = a0.c().optLong("crash_time", -1L);
            v2 = a0.c().optLong("java_end", -1L);
            if(v2 != -1L && v1 != -1L) {
                goto label_75;
            }
            goto label_76;
        }
        catch(Throwable throwable0) {
            j.a(throwable0, "NPTH_CATCH");
            return null;
        }
    label_75:
        v = v2 - v1;
        try {
        label_76:
            a0.b("total_cost", String.valueOf(v));
            a0.a("total_cost", String.valueOf(v / 1000L));
        }
        catch(Throwable unused_ex) {
        }
        try {
        label_78:
            file1 = com.apm.insight.l.j.g(this.c.b());
            s7 = "";
            if(file1.exists()) {
                s7 = m.a(file1.getAbsolutePath());
            }
            goto label_85;
        }
        catch(Throwable throwable0) {
            j.a(throwable0, "NPTH_CATCH");
            return null;
        }
        try {
            s7 = m.a(file1.getAbsolutePath());
            goto label_85;
        }
        catch(Throwable throwable5) {
            try {
                j.a(throwable5, "NPTH_CATCH");
            label_85:
                File file2 = com.apm.insight.l.j.o(this.c.b());
                if(file2.exists()) {
                    String s8 = com.apm.insight.nativecrash.a.a.b(file2);
                    s7 = s7.isEmpty() ? s8 : s7 + "\n" + s8;
                }
            }
            catch(Throwable throwable0) {
                j.a(throwable0, "NPTH_CATCH");
                return null;
            }
        }
        try {
            if(!s7.isEmpty()) {
                a0.a("java_data", s7);
            }
            goto label_94;
        }
        catch(Throwable throwable6) {
            try {
                j.a(throwable6, "NPTH_CATCH");
            label_94:
                this.b(a0);
                this.a(a0);
                com.apm.insight.entity.d.b(a0.c());
                hashMap0 = new HashMap();
                if(a.k()) {
                    hashMap0.put("is_root", "true");
                    a0.a("is_root", "true");
                }
                else {
                    hashMap0.put("is_root", "false");
                    a0.a("is_root", "false");
                }
                hashMap0.put("has_fds_file", (com.apm.insight.l.j.i(this.c.b()).exists() ? "true" : "false"));
                File file3 = com.apm.insight.l.j.h(this.c.b());
                hashMap0.put("has_logcat_file", (!file3.exists() || file3.length() <= 0x80L ? "false" : "true"));
                hashMap0.put("has_maps_file", (com.apm.insight.l.j.d(this.c.b()).exists() ? "true" : "false"));
                hashMap0.put("has_tombstone_file", (com.apm.insight.l.j.b(this.c.b()).exists() ? "true" : "false"));
                hashMap0.put("has_meminfo_file", (com.apm.insight.l.j.k(this.c.b()).exists() ? "true" : "false"));
                hashMap0.put("has_threads_file", (com.apm.insight.l.j.j(this.c.b()).exists() ? "true" : "false"));
                int v3 = new com.apm.insight.nativecrash.a.c(this).a();
                if(v3 > 0) {
                    if(v3 > 960) {
                        hashMap0.put("fd_leak", "true");
                    }
                    else {
                        hashMap0.put("fd_leak", "false");
                    }
                    a0.a("fd_count", v3);
                }
                int v4 = new f(this).a();
                if(v4 > 0) {
                    if(v4 > 350) {
                        hashMap0.put("threads_leak", "true");
                    }
                    else {
                        hashMap0.put("threads_leak", "false");
                    }
                    a0.a("threads_count", v4);
                }
                int v5 = new d(this).a();
                if(v5 > 0) {
                    if(((long)v5) > a.g()) {
                        hashMap0.put("memory_leak", "true");
                    }
                    else {
                        hashMap0.put("memory_leak", "false");
                    }
                    a0.a("memory_size", v5);
                }
                hashMap0.put("sdk_version", "2.0.0.3");
                if(a0.c().opt("java_data") == null) {
                    z = false;
                }
                hashMap0.put("has_java_stack", String.valueOf(z));
                jSONArray1 = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.l(this.c.c), com.apm.insight.l.j.m(this.c.c));
                hashMap0.put("leak_threads_count", String.valueOf(jSONArray1.length()));
                if(jSONArray1.length() > 0) {
                    goto label_139;
                }
                goto label_140;
            }
            catch(Throwable throwable0) {
                j.a(throwable0, "NPTH_CATCH");
                return null;
            }
        }
        try {
        label_139:
            com.apm.insight.l.f.a(com.apm.insight.l.j.n(this.c.c), jSONArray1);
        }
        catch(Throwable unused_ex) {
        }
        try {
        label_140:
            a0.b();
            a0.a("is_64_devices", "true");
            a0.a("is_64_runtime", "false");
            a0.a("is_x86_devices", "false");
            a0.c(hashMap0);
            JSONObject jSONObject2 = a0.c();
            com.apm.insight.l.f.a(com.apm.insight.l.j.f(this.c.b()), jSONObject2);
            return jSONObject2;
        }
        catch(Throwable throwable0) {
        }
        j.a(throwable0, "NPTH_CATCH");
        return null;
    }

    public final boolean i() {
        return com.apm.insight.l.f.a(this.c.b());
    }

    public final void j() {
        try {
            com.apm.insight.l.f.b(this.c.b().getAbsolutePath(), Environment.getExternalStorageDirectory().getAbsolutePath() + "/localDebug/" + "com.dcinside.app.android" + "/" + this.c.b().getName() + ".zip");
        }
        catch(Throwable throwable0) {
            j.a(throwable0, "NPTH_CATCH");
        }
    }

    public static boolean k() {
        Boolean boolean0 = a.d;
        if(boolean0 != null) {
            return boolean0.booleanValue();
        }
        for(int v = 0; v < 11; ++v) {
            String s = new String[]{"/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/system/xbin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/sbin/su", "/su/bin/su"}[v];
            try {
                if(new File(s).exists()) {
                    a.d = Boolean.TRUE;
                    return true;
                }
            }
            catch(Throwable throwable0) {
                j.a(throwable0, "NPTH_CATCH");
            }
        }
        a.d = Boolean.FALSE;
        return false;
    }

    @Nullable
    private String l() {
        b a$b0 = this.c;
        if(a$b0 != null) {
            String s = a$b0.a.c();
            return s != null && !s.isEmpty() ? s : this.c.b.e();
        }
        return null;
    }
}

