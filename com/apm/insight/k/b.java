package com.apm.insight.k;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.e;
import com.apm.insight.entity.Header;
import com.apm.insight.entity.d;
import com.apm.insight.l.j;
import com.apm.insight.l.k;
import com.apm.insight.l.n;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.f;
import com.apm.insight.runtime.h;
import com.apm.insight.runtime.m;
import com.apm.insight.runtime.o;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b {
    static final class a {
        File a;
        long b;
        long c;
        @Nullable
        CrashType d;
        String e;

        a(File file0, long v, @Nullable CrashType crashType0) {
            this.c = -1L;
            this.a = file0;
            this.b = v;
            this.d = crashType0;
            this.e = file0.getName();
        }

        a(File file0, @Nullable CrashType crashType0) {
            this.b = -1L;
            this.c = -1L;
            this.a = file0;
            this.d = crashType0;
            this.e = file0.getName();
        }
    }

    static final class com.apm.insight.k.b.b {
        String a;
        List b;
        List c;
        a d;
        a e;
        boolean f;
        int g;

        com.apm.insight.k.b.b(String s) {
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.f = false;
            this.g = 0;
            this.a = s;
        }
    }

    private Context a;
    private static volatile b b;
    private List c;
    private List d;
    private int e;
    private com.apm.insight.k.b.b f;
    private HashMap g;
    private volatile boolean h;
    private Runnable i;
    private Runnable j;

    static {
    }

    private b(Context context0) {
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = -1;
        this.h = false;
        this.i = () -> {
            if(b.this.h) {
                return;
            }
            if(k.b(b.this.a)) {
                b.this.d();
                return;
            }
            m.a().a(b.this.i, 5000L);
        };
        this.j = () -> if(!b.this.h && b.this.g != null) {
            if(!k.b(b.this.a)) {
                b.this.e();
            }
            boolean z = false;
            if(b.this.e == -1) {
                b.this.e = 0;
            }
            if(b.this.e == 1) {
                z = true;
            }
            f f0 = new f(b.this.a);
            for(Object object0: b.this.g.values()) {
                b.this.b(((com.apm.insight.k.b.b)object0), z, f0);
            }
            for(Object object1: b.this.g.values()) {
                b.this.a(((com.apm.insight.k.b.b)object1), z, f0);
            }
            for(Object object2: b.this.g.values()) {
                com.apm.insight.l.f.a(j.a(b.this.a, ((com.apm.insight.k.b.b)object2).a));
            }
            f0.a();
            com.apm.insight.runtime.b.a();
            b.this.e();
        };
        this.a = context0;
    }

    @Nullable
    private com.apm.insight.f.b a(File file0, CrashType crashType0, String s, long v, long v1) {
        JSONObject jSONObject1;
        JSONObject jSONObject0;
        com.apm.insight.f.b b1;
        com.apm.insight.f.b b0;
        boolean z = false;
        try {
            if(!file0.isFile()) {
                goto label_2;
            }
            goto label_70;
        }
        catch(Throwable throwable0) {
            com.apm.insight.l.f.a(file0);
            com.apm.insight.runtime.j.a(throwable0, "NPTH_CATCH");
            return null;
        }
    label_2:
        if(crashType0 == CrashType.LAUNCH) {
            z = true;
        }
        if(crashType0 == null) {
            try {
                return com.apm.insight.l.f.b(new File(file0, file0.getName()).getAbsolutePath());
            }
            catch(Throwable throwable0) {
                com.apm.insight.l.f.a(file0);
                com.apm.insight.runtime.j.a(throwable0, "NPTH_CATCH");
                return null;
            }
        }
        try {
            b0 = com.apm.insight.l.f.a(file0, crashType0);
        }
        catch(Throwable throwable0) {
            com.apm.insight.l.f.a(file0);
            com.apm.insight.runtime.j.a(throwable0, "NPTH_CATCH");
            return null;
        }
        try {
            jSONObject0 = b0.b();
            if(b0.b() == null) {
                com.apm.insight.l.f.a(file0);
                return b0;
            }
            if(crashType0 == CrashType.ANR) {
                return b0;
            }
            jSONObject0.put("crash_time", v);
            jSONObject0.put("app_start_time", v1);
            jSONObject1 = jSONObject0.optJSONObject("header");
            if(jSONObject1 == null) {
                jSONObject1 = Header.a(v).f();
            }
            else if(z) {
                jSONObject0.remove("header");
            }
            String s1 = jSONObject1.optString("sdk_version_name", null);
            if(s1 == null) {
                s1 = "2.0.0.3";
            }
            com.apm.insight.entity.a.a(jSONObject0, "filters", "sdk_version", s1);
            JSONArray jSONArray0 = jSONObject0.optJSONArray("logcat");
            if(jSONArray0 == null || jSONArray0.length() == 0) {
                jSONObject0.put("logcat", h.a(s));
            }
            com.apm.insight.entity.a.a(jSONObject0, "filters", "has_dump", "true");
            com.apm.insight.entity.a.a(jSONObject0, "filters", "has_logcat", String.valueOf(!com.apm.insight.a.a(jSONObject0, "logcat")));
            com.apm.insight.entity.a.a(jSONObject0, "filters", "memory_leak", String.valueOf(com.apm.insight.entity.a.a(s)));
            com.apm.insight.entity.a.a(jSONObject0, "filters", "fd_leak", String.valueOf(com.apm.insight.entity.a.b(s)));
            com.apm.insight.entity.a.a(jSONObject0, "filters", "threads_leak", String.valueOf(com.apm.insight.entity.a.c(s)));
            com.apm.insight.entity.a.a(jSONObject0, "filters", "is_64_devices", "true");
            com.apm.insight.entity.a.a(jSONObject0, "filters", "is_64_runtime", "false");
            com.apm.insight.entity.a.a(jSONObject0, "filters", "is_x86_devices", "false");
            com.apm.insight.entity.a.a(jSONObject0, "filters", "has_meminfo_file", String.valueOf(j.d(s).exists()));
            com.apm.insight.entity.a.a(jSONObject0, "filters", "is_root", "false");
            jSONObject0.put("launch_did", com.apm.insight.i.a.a(this.a));
            jSONObject0.put("crash_uuid", file0.getName());
        }
        catch(Throwable throwable0) {
            com.apm.insight.l.f.a(file0);
            com.apm.insight.runtime.j.a(throwable0, "NPTH_CATCH");
            return b0;
        }
        try {
            long v2 = Long.parseLong(com.apm.insight.runtime.b.a(v, s));
            com.apm.insight.entity.a.a(jSONObject0, "filters", "lastAliveTime", (Math.abs(v2 - v) >= 60000L ? "> 60s" : "< 60s"));
            jSONObject0.put("lastAliveTime", String.valueOf(v2));
            goto label_50;
        }
        catch(Throwable unused_ex) {
            try {
                jSONObject0.put("lastAliveTime", "unknown");
                com.apm.insight.entity.a.a(jSONObject0, "filters", "lastAliveTime", "unknown");
            label_50:
                jSONObject0.put("has_dump", "true");
                if(jSONObject0.opt("storage") == null) {
                    com.apm.insight.entity.a.a(jSONObject0, n.a());
                }
                if(Header.b(jSONObject1)) {
                    com.apm.insight.entity.a.a(jSONObject0, "filters", "unauthentic_version", "unauthentic_version");
                }
                d.b(jSONObject0);
                b0.b().put("upload_scene", "launch_scan");
                if(z) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject0.put("event_type", "start_crash");
                    jSONObject0.put("stack", jSONObject0.remove("data"));
                    jSONObject2.put("data", new JSONArray().put(jSONObject0));
                    jSONObject2.put("header", jSONObject1);
                    b0.a(jSONObject2);
                    return b0;
                }
                jSONObject0.put("isJava", 1);
                return b0;
            }
            catch(Throwable throwable0) {
            }
        }
        com.apm.insight.l.f.a(file0);
        com.apm.insight.runtime.j.a(throwable0, "NPTH_CATCH");
        return b0;
        try {
        label_70:
            com.apm.insight.l.f.a(file0);
            return null;
        }
        catch(Throwable throwable0) {
            b1 = null;
        }
        com.apm.insight.l.f.a(file0);
        com.apm.insight.runtime.j.a(throwable0, "NPTH_CATCH");
        return b1;
    }

    public static b a() {
        if(b.b == null) {
            Class class0 = b.class;
            synchronized(class0) {
                if(b.b == null) {
                    b.b = new b(e.g());
                }
            }
        }
        return b.b;
    }

    private static JSONObject a(com.apm.insight.nativecrash.a a0) {
        JSONObject jSONObject0 = a0.b();
        if(jSONObject0 == null || jSONObject0.length() == 0) {
            if(e.d()) {
                a0.j();
            }
            if(!a0.a()) {
                a0.i();
                return null;
            }
            if(!a0.d()) {
                a0.i();
                return null;
            }
            if(a0.e()) {
                a0.i();
                return null;
            }
            a0.c();
            return a0.h();
        }
        return jSONObject0;
    }

    private void a(com.apm.insight.k.b.b b$b0, boolean z, @Nullable f f0) {
        JSONObject jSONObject2;
        JSONArray jSONArray0;
        File file2;
        File file1;
        JSONObject jSONObject1;
        JSONObject jSONObject0;
        com.apm.insight.f.b b0;
        if(b$b0.b.isEmpty()) {
            return;
        }
        if(b$b0.e == null) {
            b$b0.e = b$b0.d;
        }
        Iterator iterator0 = b$b0.b.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            a b$a0 = (a)object0;
            Iterator iterator1 = iterator0;
            File file0 = b$a0.a;
            CrashType crashType0 = b$a0.d;
            try {
                b0 = this.a(b$a0.a, b$a0.d, b$b0.a, b$a0.b, b$a0.c);
                if(b0 == null) {
                    goto label_59;
                }
                else {
                    jSONObject0 = b0.b();
                    if(jSONObject0 == null) {
                        goto label_57;
                    }
                    else {
                        jSONObject1 = jSONObject0.optJSONObject("header");
                        if(jSONObject1 == null) {
                            goto label_55;
                        }
                        else if(crashType0 == null) {
                            file1 = file0;
                            if(!new File(file1, file0.getName()).exists() && file1.getName().split("_").length >= 5) {
                                goto label_24;
                            }
                            else if(com.apm.insight.k.e.b(b0.a(), jSONObject0.toString()).a()) {
                                com.apm.insight.l.f.a(file1);
                            }
                        }
                        else {
                            file1 = file0;
                        label_24:
                            file2 = com.apm.insight.entity.b.a(file1);
                            if(!file2.exists()) {
                                com.apm.insight.l.f.a(file1);
                                iterator0 = iterator1;
                                continue;
                            }
                            goto label_28;
                        }
                    }
                }
            }
            catch(Throwable throwable0) {
                com.apm.insight.runtime.j.a(throwable0, "NPTH_CATCH");
                com.apm.insight.l.f.a(b$a0.a);
            }
            iterator0 = iterator1;
            continue;
            try {
            label_28:
                jSONArray0 = new JSONArray(com.apm.insight.l.f.a(file2, "\n"));
                if(crashType0 == CrashType.LAUNCH) {
                    jSONObject2 = ((JSONArray)jSONObject0.opt("data")).optJSONObject(0);
                }
                else {
                    goto label_32;
                }
                goto label_33;
            }
            catch(Throwable unused_ex) {
                iterator0 = iterator1;
                continue;
            }
            try {
                jSONObject2 = ((JSONArray)jSONObject0.opt("data")).optJSONObject(0);
                goto label_33;
            label_32:
                jSONObject2 = jSONObject0;
            label_33:
                if((z || b$b0.e == b$a0) && !b$a0.e.contains("ignore")) {
                    if(f0 != null && !f0.a(jSONObject2.optString("crash_md5", "default"))) {
                        com.apm.insight.l.f.a(b$a0.a);
                        iterator0 = iterator1;
                        continue;
                    }
                    goto label_37;
                }
                goto label_39;
            }
            catch(Throwable throwable0) {
                com.apm.insight.runtime.j.a(throwable0, "NPTH_CATCH");
                com.apm.insight.l.f.a(b$a0.a);
                iterator0 = iterator1;
                continue;
            }
        label_37:
            CrashType crashType1 = crashType0;
            goto label_47;
            try {
            label_39:
                crashType1 = crashType0;
                com.apm.insight.entity.a.a(jSONObject2, "filters", "aid", String.valueOf(jSONObject1.opt("aid")));
                crashType1 = crashType0;
                com.apm.insight.entity.a.a(jSONObject2, "filters", "has_ignore", String.valueOf(b$a0.e.contains("ignore")));
                jSONObject1.put("aid", 2010);
                goto label_47;
            }
            catch(Throwable throwable1) {
                try {
                    com.apm.insight.runtime.j.a(throwable1, "NPTH_CATCH");
                label_47:
                    com.apm.insight.entity.a.a(jSONObject2, "filters", "start_uuid", b$b0.a);
                    com.apm.insight.entity.a.a(jSONObject2, "filters", "leak_threads_count", String.valueOf(b$b0.g));
                    com.apm.insight.entity.a.a(jSONObject2, "filters", "crash_thread_name", jSONObject2.optString("crash_thread_name", "unknown"));
                    com.apm.insight.entity.b.a(jSONObject0, jSONArray0, new com.apm.insight.entity.b.a() {
                        private b d;

                        @Override  // com.apm.insight.entity.b$a
                        public final void a(JSONObject jSONObject0) {
                            com.apm.insight.k.e.a(b0.a(), jSONObject0.toString(), new File[]{new File(file1, "logZip"), j.a(b.this.a, b$b0.a)});
                        }
                    });
                    if(!com.apm.insight.l.f.a(file1)) {
                        com.apm.insight.e.a.a().a(com.apm.insight.d.a.b(file1.getAbsolutePath()));
                    }
                    c.a(crashType1, jSONObject0);
                    iterator0 = iterator1;
                    continue;
                label_55:
                    com.apm.insight.l.f.a(file0);
                    iterator0 = iterator1;
                    continue;
                label_57:
                    com.apm.insight.l.f.a(file0);
                    iterator0 = iterator1;
                    continue;
                label_59:
                    com.apm.insight.l.f.a(file0);
                    iterator0 = iterator1;
                    continue;
                }
                catch(Throwable throwable0) {
                }
            }
            com.apm.insight.runtime.j.a(throwable0, "NPTH_CATCH");
            com.apm.insight.l.f.a(b$a0.a);
            iterator0 = iterator1;
        }
    }

    private void a(HashMap hashMap0) {
        JSONArray jSONArray0;
        File[] arr_file = j.f(this.a).listFiles();
        if(arr_file != null && arr_file.length != 0) {
            int v = 0;
            while(v < arr_file.length && v < 5) {
                File file0 = arr_file[v];
                try {
                    if(!file0.isDirectory()) {
                        goto label_20;
                    }
                    else if(file0.getName().endsWith("G")) {
                        String s = file0.getName();
                        com.apm.insight.k.b.b b$b0 = (com.apm.insight.k.b.b)hashMap0.get(s);
                        if(b$b0 == null) {
                            b$b0 = new com.apm.insight.k.b.b(s);
                            hashMap0.put(s, b$b0);
                        }
                        jSONArray0 = com.apm.insight.nativecrash.b.a(j.l(file0), j.m(file0));
                        int v1 = jSONArray0.length();
                        b$b0.g = v1;
                        if(v1 > 0) {
                            goto label_16;
                        }
                    }
                    else {
                        goto label_18;
                    }
                    goto label_25;
                }
                catch(Throwable throwable0) {
                    goto label_23;
                }
                try {
                label_16:
                    com.apm.insight.l.f.a(j.n(file0), jSONArray0);
                }
                catch(Throwable unused_ex) {
                }
                goto label_25;
                try {
                label_18:
                    com.apm.insight.l.f.a(file0);
                    goto label_25;
                label_20:
                    com.apm.insight.l.f.a(file0);
                    goto label_25;
                }
                catch(Throwable throwable0) {
                }
            label_23:
                com.apm.insight.runtime.j.a(throwable0, "NPTH_CATCH");
                com.apm.insight.l.f.a(file0);
            label_25:
                ++v;
            }
        }
    }

    // This method was un-flattened
    private void a(HashMap hashMap0, com.apm.insight.k.b.b b$b0) {
        CrashType crashType0;
        long v2;
        long v1;
        String[] arr_s;
        String s;
        File[] arr_file = j.a(this.a).listFiles();
        if(arr_file == null) {
            return;
        }
        Arrays.sort(arr_file, Collections.reverseOrder());
        int v = 0;
        while(v < arr_file.length) {
            File file0 = arr_file[v];
            try {
                if(com.apm.insight.e.a.a().a(file0.getAbsolutePath())) {
                    com.apm.insight.l.f.a(file0);
                }
                else if(!com.apm.insight.l.f.e(file0) && !com.apm.insight.g.a.a().b(file0.getName())) {
                    if(!file0.isFile()) {
                        s = file0.getName();
                        if(s.endsWith("G")) {
                            arr_s = s.split("_");
                            if(arr_s.length < 5) {
                                b$b0.b.add(new a(file0, null));
                                goto label_49;
                            }
                            v1 = Long.parseLong(arr_s[0]);
                            v2 = Long.parseLong(arr_s[4]);
                            goto label_24;
                        }
                        goto label_43;
                    }
                    goto label_45;
                }
                goto label_49;
            }
            catch(Throwable throwable0) {
                goto label_48;
            }
            try {
                v1 = Long.parseLong(arr_s[0]);
                v2 = Long.parseLong(arr_s[4]);
                goto label_24;
            }
            catch(Throwable unused_ex) {
                try {
                    b$b0.b.add(new a(file0, null));
                    com.apm.insight.runtime.j.a(new RuntimeException("err format crashTime:" + s), "NPTH_CATCH");
                    goto label_49;
                label_24:
                    String s1 = arr_s[2];
                    switch(arr_s[1]) {
                        case "anr": {
                            crashType0 = CrashType.ANR;
                            goto label_33;
                        }
                        case "java": {
                            goto label_32;
                        }
                        case "launch": {
                            crashType0 = CrashType.LAUNCH;
                            goto label_33;
                        }
                    }
                    crashType0 = null;
                    goto label_33;
                label_32:
                    crashType0 = CrashType.JAVA;
                label_33:
                    com.apm.insight.k.b.b b$b1 = (com.apm.insight.k.b.b)hashMap0.get(s1);
                    if(b$b1 == null) {
                        b$b1 = new com.apm.insight.k.b.b(s1);
                        hashMap0.put(s1, b$b1);
                    }
                    a b$a0 = new a(file0, v1, crashType0);
                    b$a0.c = v2;
                    if((b$b1.d == null || b$b1.d.b > b$a0.b) && crashType0 != null && crashType0 != CrashType.ANR && !s.contains("ignore")) {
                        b$b1.d = b$a0;
                    }
                    b$b1.b.add(b$a0);
                    goto label_49;
                label_43:
                    com.apm.insight.l.f.a(file0);
                    goto label_49;
                label_45:
                    com.apm.insight.l.f.a(file0);
                    goto label_49;
                }
                catch(Throwable throwable0) {
                }
            }
        label_48:
            com.apm.insight.runtime.j.a(throwable0, "NPTH_CATCH");
        label_49:
            ++v;
        }
    }

    private static boolean a(File file0) {
        String[] arr_s = file0.list();
        if(arr_s == null) {
            return false;
        }
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            if(!TextUtils.isEmpty(s) && s.endsWith("")) {
                return true;
            }
        }
        return false;
    }

    public final void a(boolean z) {
        if(z) {
            if(this.f == null) {
                this.f = new com.apm.insight.k.b.b("old_uuid");
                HashMap hashMap0 = new HashMap();
                this.g = hashMap0;
                this.a(hashMap0);
                this.a(this.g, this.f);
                com.apm.insight.l.f.a(j.b(this.a));
                this.b(this.g);
                this.b(this.f, true, null);
                this.a(this.f, true, null);
                this.f = null;
                if(this.g.isEmpty()) {
                    this.e();
                }
                else {
                    this.f();
                }
            }
            this.g();
            com.apm.insight.a.c();
        }
    }

    private void b(com.apm.insight.k.b.b b$b0, boolean z, @Nullable f f0) {
        boolean z2;
        Iterator iterator1;
        JSONObject jSONObject0;
        if(b$b0.c.size() <= 1 && b$b0.c.isEmpty()) {
            b$b0.e = b$b0.d;
            return;
        }
        boolean z1 = k.b(this.a);
        b$b0.e = b$b0.d;
        com.apm.insight.nativecrash.a a0 = new com.apm.insight.nativecrash.a(this.a);
        Iterator iterator0 = b$b0.c.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            a b$a0 = (a)object0;
            File file0 = b$a0.a;
            try {
                a0.a(file0);
                jSONObject0 = b.a(a0);
                if(jSONObject0 == null || jSONObject0.length() == 0) {
                    iterator1 = iterator0;
                    z2 = z1;
                    goto label_65;
                }
                else if(jSONObject0.length() == 0) {
                    goto label_67;
                }
                else {
                    if(!z) {
                        long v = jSONObject0.optLong("crash_time");
                        a b$a1 = b$b0.e;
                        if(b$a1 == null) {
                            b$b0.e = b$a0;
                            b$b0.f = true;
                            if(f0 == null || f0.a("default")) {
                                iterator1 = iterator0;
                                z2 = z1;
                                goto label_55;
                            }
                            else {
                                a0.i();
                                continue;
                            }
                        }
                        goto label_34;
                    }
                    goto label_52;
                }
                z1 = z2;
                iterator0 = iterator1;
                continue;
            }
            catch(Throwable throwable0) {
                iterator1 = iterator0;
                z2 = z1;
                goto label_73;
            }
            iterator1 = iterator0;
            z2 = z1;
            goto label_55;
            try {
            label_34:
                iterator1 = iterator0;
                if(b$b0.f) {
                    z2 = z1;
                    com.apm.insight.entity.a.a(jSONObject0, "filters", "aid", String.valueOf(jSONObject0.optJSONObject("header").opt("aid")));
                    jSONObject0.optJSONObject("header").put("aid", 2010);
                    goto label_55;
                }
                else {
                    z2 = z1;
                    if(v >= b$a1.b) {
                        com.apm.insight.entity.a.a(jSONObject0, "filters", "aid", String.valueOf(jSONObject0.optJSONObject("header").opt("aid")));
                        jSONObject0.optJSONObject("header").put("aid", 2010);
                        goto label_55;
                    }
                    else {
                        b$b0.e = b$a0;
                        if(f0 == null || f0.a("default")) {
                            b.a(file0);
                            b$b0.f = true;
                            goto label_55;
                        }
                        else {
                            a0.i();
                            z1 = z2;
                            iterator0 = iterator1;
                            continue;
                        }
                    }
                }
            label_52:
                iterator1 = iterator0;
                z2 = z1;
                if(f0 == null || f0.a("default")) {
                label_55:
                    com.apm.insight.entity.a.a(jSONObject0, "filters", "start_uuid", b$b0.a);
                    com.apm.insight.entity.a.a(jSONObject0, "filters", "crash_thread_name", jSONObject0.optString("crash_thread_name", "unknown"));
                    if(z2) {
                        com.apm.insight.k.c.a c$a0 = new com.apm.insight.k.c.a(jSONObject0, CrashType.NATIVE);
                        JSONArray jSONArray0 = o.a().b((c$a0.b() == -1L ? System.currentTimeMillis() : c$a0.b()));
                        com.apm.insight.entity.b.a(jSONObject0, com.apm.insight.entity.b.a(c$a0.c(), c$a0.a(), jSONArray0), new com.apm.insight.entity.b.a() {
                            private b c;

                            @Override  // com.apm.insight.entity.b$a
                            public final void a(JSONObject jSONObject0) {
                                com.apm.insight.k.d.a();
                                com.apm.insight.k.d.a(jSONObject0, file0, j.a(b.this.a, b$b0.a));
                            }
                        });
                        if(!a0.i()) {
                            a0.f();
                        }
                    }
                    c.a(CrashType.NATIVE, jSONObject0);
                }
                else {
                label_65:
                    a0.i();
                    z1 = z2;
                    iterator0 = iterator1;
                    continue;
                label_67:
                    iterator1 = iterator0;
                    z2 = z1;
                }
                z1 = z2;
                iterator0 = iterator1;
                continue;
            }
            catch(Throwable throwable0) {
            }
        label_73:
            com.apm.insight.runtime.j.a(throwable0, "NPTH_CATCH");
            com.apm.insight.l.f.a(file0);
            z1 = z2;
            iterator0 = iterator1;
        }
    }

    private void b(HashMap hashMap0) {
        File[] arr_file = j.d(this.a).listFiles();
        if(arr_file != null && arr_file.length != 0) {
            for(int v = 0; v < arr_file.length && v < 5; ++v) {
                File file0 = arr_file[v];
                try {
                    if(!file0.isDirectory()) {
                        com.apm.insight.l.f.a(file0);
                    }
                    else if(file0.getName().endsWith("G")) {
                        String s = file0.getName();
                        com.apm.insight.k.b.b b$b0 = (com.apm.insight.k.b.b)hashMap0.get(s);
                        if(b$b0 == null) {
                            b$b0 = new com.apm.insight.k.b.b(s);
                            hashMap0.put(s, b$b0);
                        }
                        b$b0.c.add(new a(file0, CrashType.NATIVE));
                    }
                    else {
                        com.apm.insight.l.f.a(file0);
                    }
                }
                catch(Throwable throwable0) {
                    com.apm.insight.runtime.j.a(throwable0, "NPTH_CATCH");
                    com.apm.insight.l.f.a(file0);
                }
            }
        }
    }

    public final void b() {
        try {
            if(!this.h && com.apm.insight.l.a.c(e.g())) {
                m.a().a(this.j);
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    public final boolean c() {
        return this.h;
    }

    // 检测为 Lambda 实现
    private void d() [...]

    private void e() {
        this.h = true;
        this.g = null;
        NativeImpl.j();
    }

    // 检测为 Lambda 实现
    private void f() [...]

    private void g() {
        File[] arr_file = j.i(this.a).listFiles();
        if(arr_file == null) {
            return;
        }
        for(int v = 0; v < arr_file.length && v < 5; ++v) {
            File file0 = arr_file[v];
            if(file0.getName().endsWith(".atmp")) {
                com.apm.insight.a.a.a();
                file0.getAbsolutePath();
            }
            else {
                try {
                    com.apm.insight.f.b b0 = com.apm.insight.l.f.c(file0.getAbsolutePath());
                    if(b0 == null) {
                        com.apm.insight.l.f.a(file0);
                    }
                    else {
                        if(b0.b() != null) {
                            b0.b().put("upload_scene", "launch_scan");
                        }
                        if(com.apm.insight.k.e.a("", b0.e(), b0.d(), b0.f(), b0.g())) {
                            com.apm.insight.l.f.a(file0);
                            String s = b0.c();
                            if(!TextUtils.isEmpty(s)) {
                                com.apm.insight.l.f.a(new File(s));
                            }
                        }
                    }
                    continue;
                }
                catch(Throwable throwable0) {
                }
                com.apm.insight.runtime.j.a(throwable0, "NPTH_CATCH");
            }
        }
    }

    final class com.apm.insight.k.b.1 implements Runnable {
        private b a;

        @Override
        public final void run() {
            b.this.f();
        }
    }


    final class com.apm.insight.k.b.2 implements Runnable {
        private b a;

        @Override
        public final void run() {
            b.this.d();
        }
    }

}

