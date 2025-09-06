package com.apm.insight.b;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.Npth;
import com.apm.insight.a;
import com.apm.insight.e;
import com.apm.insight.l.d;
import com.apm.insight.l.f;
import com.apm.insight.l.m;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.h;
import com.apm.insight.runtime.i;
import com.apm.insight.runtime.j;
import com.apm.insight.runtime.l;
import com.apm.insight.runtime.n;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {
    private int A;
    private List B;
    private Pattern C;
    private File D;
    private c a;
    private final Context b;
    private volatile boolean c;
    private long d;
    private File e;
    private boolean f;
    private JSONObject g;
    private JSONObject h;
    private String i;
    private String j;
    private String k;
    private String l;
    private JSONArray m;
    private JSONObject n;
    private int o;
    private long p;
    private JSONArray q;
    private JSONArray r;
    private JSONObject s;
    private boolean t;
    private final Object u;
    private volatile boolean v;
    private long w;
    private long x;
    private final Runnable y;
    private static volatile boolean z = true;

    static {
    }

    public b(Context context0) {
        this.d = -1L;
        this.e = null;
        this.f = true;
        this.i = "unknown";
        this.j = "unknown";
        this.k = "unknown";
        this.l = "npth_inner_default";
        this.o = 0;
        this.p = -1L;
        this.u = new Object();
        this.w = -1L;
        this.x = 0L;
        this.y = new Runnable() {
            private b a;

            @Override
            public final void run() {
                try {
                    b.this.g();
                }
                catch(Throwable throwable0) {
                    j.a(throwable0, "NPTH_CATCH");
                }
            }
        };
        this.A = 0;
        this.B = null;
        this.C = null;
        this.D = null;
        this.b = context0;
    }

    private static String a(float f) {
        if(f <= 0.0f) {
            return "0%";
        }
        if(f <= 0.1f) {
            return "0% - 10%";
        }
        if(f <= 0.3f) {
            return "10% - 30%";
        }
        if(f <= 0.6f) {
            return "30% - 60%";
        }
        return f <= 0.9f ? "60% - 90%" : "90% - 100%";
    }

    private static String a(float f, float f1) {
        if(f1 > 0.0f) {
            return b.a(f / f1);
        }
        return f > 0.0f ? "100%" : "0%";
    }

    private JSONObject a(String s, JSONArray jSONArray0) {
        JSONObject jSONObject0 = new JSONObject();
        JSONArray jSONArray1 = a.b(jSONArray0);
        if(jSONArray1.length() != jSONArray0.length()) {
            ++this.o;
        }
        try {
            jSONObject0.put("thread_name", s);
            jSONObject0.put("thread_stack", jSONArray1);
            return jSONObject0;
        }
        catch(JSONException unused_ex) {
            return null;
        }
    }

    // This method was un-flattened
    private void a(String s, JSONObject jSONObject0) throws JSONException {
        String s4;
        int v2;
        String[] arr_s3;
        String s10;
        HashMap hashMap5;
        String s8;
        boolean z1;
        int v3;
        SystemClock.uptimeMillis();
        String[] arr_s = s.split("\n");
        int v = 0;
        HashMap hashMap0 = new HashMap();
        HashMap hashMap1 = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        String s1 = "unknown";
        String s2 = "unknown";
        int v1 = 0;
        boolean z = false;
        while(v < arr_s.length) {
            String s3 = arr_s[v];
            if(TextUtils.isEmpty(s3)) {
                ++v;
            }
            else {
                switch(v1) {
                    case 0: {
                        v2 = 0;
                        s4 = s1;
                        String s5 = s3.trim();
                        if(s5.startsWith("tag:")) {
                            s1 = s5.replace("tag:", "").trim();
                            v3 = 1;
                            goto label_181;
                        }
                        else {
                            s1 = s4;
                            break;
                        }
                        goto label_26;
                    }
                    case 1: {
                    label_26:
                        v2 = 1;
                        s3 = s3.trim();
                        String s6 = s3.toLowerCase();
                        if(s6.startsWith("shortmsg")) {
                            z1 = false;
                        }
                        else if(s6.startsWith("reason:")) {
                            z1 = true;
                        }
                        else {
                            goto label_51;
                        }
                        if(s6.contains("input dispatch")) {
                            s2 = "Input dispatching timed out";
                        }
                        else if(s6.contains("broadcast of intent")) {
                            s2 = "Broadcast of Intent";
                        }
                        else if(s6.contains("executing service")) {
                            if("null".equalsIgnoreCase(s1)) {
                                s1 = s3.substring(s3.indexOf("service ") + 8).trim();
                            }
                            s2 = "executing service";
                        }
                        else {
                            s2 = s6.contains("service.startforeground") ? "not call Service.startForeground" : "unknown";
                        }
                        if(z1) {
                            v3 = 2;
                            goto label_181;
                        label_51:
                            s4 = s1;
                            if(s6.contains("appfreeze")) {
                                s2 = "AppFreeze";
                                v3 = 10;
                                s1 = s4;
                                goto label_181;
                            }
                            s1 = s4;
                            break;
                        }
                        goto label_60;
                    }
                    case 2: {
                        v2 = 2;
                    label_60:
                        String s7 = s3.trim();
                        if(s7.startsWith("Load:")) {
                            String[] arr_s1 = s7.replace("Load:", "").trim().split("/");
                            if(3 == arr_s1.length) {
                                for(int v4 = 0; v4 < arr_s1.length; ++v4) {
                                    new float[]{-1.0f, -1.0f, -1.0f}[v4] = (float)Float.valueOf(arr_s1[v4]);
                                }
                            }
                            v3 = 3;
                            goto label_181;
                        }
                        break;
                    }
                    case 3: {
                        String[] arr_s2 = s3.split("\\s");
                        v2 = 3;
                        if(arr_s2.length >= 2) {
                            if("CPU".equalsIgnoreCase(arr_s2[0]) && "usage".equalsIgnoreCase(arr_s2[1])) {
                                if(s3.contains("ago")) {
                                    z = true;
                                }
                                v3 = !hashMap0.isEmpty() || !hashMap1.isEmpty() || !hashMap2.isEmpty() || !hashMap4.isEmpty() || !hashMap3.isEmpty() ? 4 : 3;
                                goto label_181;
                            }
                            else if(!hashMap0.isEmpty() && !hashMap1.isEmpty() && !hashMap2.isEmpty() && !hashMap4.isEmpty() && !hashMap3.isEmpty()) {
                                v3 = 4;
                                goto label_181;
                            }
                            else {
                                if(hashMap0.isEmpty() && arr_s2[1].equalsIgnoreCase("TOTAL:")) {
                                    s8 = "";
                                    hashMap5 = hashMap0;
                                }
                                else if(s3.contains("com.dcinside.app.android")) {
                                    s8 = "";
                                    for(int v5 = 0; v5 < arr_s2.length; ++v5) {
                                        if(arr_s2[v5].contains("com.dcinside.app.android")) {
                                            String s9 = arr_s2[v5];
                                            s8 = s9.substring(s9.indexOf(0x2F) + 1, arr_s2[v5].length() - 1) + '_';
                                        }
                                    }
                                    hashMap5 = hashMap2;
                                }
                                else if(hashMap1.isEmpty() && s3.contains("system_server:")) {
                                    s8 = "";
                                    hashMap5 = hashMap1;
                                }
                                else if(hashMap4.isEmpty() && s3.contains("kswapd")) {
                                    s8 = "";
                                    hashMap5 = hashMap4;
                                }
                                else if(!hashMap3.isEmpty() || !s3.contains("dex2oat")) {
                                    s8 = "";
                                    hashMap5 = null;
                                }
                                else {
                                    s8 = "";
                                    hashMap5 = hashMap3;
                                }
                                if(hashMap5 != null) {
                                    int v6 = 0;
                                    while(!arr_s2[v6].contains("%")) {
                                        ++v6;
                                        if(v6 >= arr_s2.length) {
                                            break;
                                        }
                                    }
                                    try {
                                        float f = (float)Float.valueOf(arr_s2[v6].replace("%", ""));
                                        if(hashMap5 != hashMap0) {
                                            f /= (float)d.d();
                                        }
                                        hashMap5.put(s8 + "total", f);
                                    }
                                    catch(Throwable unused_ex) {
                                        hashMap5.put(s8 + "total", -1.0f);
                                    }
                                    int v7 = v6 + 3;
                                    int v8 = 0;
                                    while(v7 < arr_s2.length) {
                                        int v9 = 0;
                                        switch(v8) {
                                            case 0: {
                                                if("user".equalsIgnoreCase(arr_s2[v7])) {
                                                    s10 = "user";
                                                    v8 = 1;
                                                    goto label_162;
                                                }
                                            label_143:
                                                if("kernel".equalsIgnoreCase(arr_s2[v7])) {
                                                    s10 = "kernel";
                                                    v8 = 2;
                                                    goto label_162;
                                                }
                                            label_147:
                                                if("iowait".equalsIgnoreCase(arr_s2[v7])) {
                                                    s10 = "iowait";
                                                    v8 = 3;
                                                    goto label_162;
                                                }
                                            label_151:
                                                if("irq".equalsIgnoreCase(arr_s2[v7])) {
                                                    s10 = "irq";
                                                    v8 = 4;
                                                    goto label_162;
                                                }
                                            label_155:
                                                if("softirq".equalsIgnoreCase(arr_s2[v7])) {
                                                    s10 = "softirq";
                                                    v8 = 5;
                                                    goto label_162;
                                                }
                                                break;
                                            }
                                            case 1: {
                                                v9 = 1;
                                                goto label_143;
                                            }
                                            case 2: {
                                                v9 = 2;
                                                goto label_147;
                                            }
                                            case 3: {
                                                v9 = 3;
                                                goto label_151;
                                            }
                                            case 4: {
                                                v9 = 4;
                                                goto label_155;
                                            }
                                            default: {
                                                v9 = v8;
                                                if(v8 != 5) {
                                                    goto label_171;
                                                }
                                            }
                                        }
                                        if("softirq".equalsIgnoreCase(arr_s2[v7])) {
                                            s10 = "softirq";
                                            v8 = 6;
                                            try {
                                            label_162:
                                                arr_s3 = arr_s2;
                                                float f1 = (float)Float.valueOf(arr_s2[v7 - 1].replace("%", ""));
                                                arr_s3 = arr_s2;
                                                if(hashMap5 != hashMap0) {
                                                    f1 /= (float)d.d();
                                                }
                                                hashMap5.put(s8 + s10, f1);
                                            }
                                            catch(Throwable unused_ex) {
                                                hashMap5.put(s8 + s10, -1.0f);
                                            }
                                        }
                                        else {
                                        label_171:
                                            v8 = v9;
                                            arr_s3 = arr_s2;
                                        }
                                        if(v8 >= 6) {
                                            break;
                                        }
                                        v7 += 3;
                                        arr_s2 = arr_s3;
                                    }
                                }
                            }
                        }
                        break;
                    }
                    default: {
                        v2 = v1;
                        s4 = s1;
                        s1 = s4;
                        break;
                    }
                }
                v3 = v2;
            label_181:
                if(v3 >= 4) {
                    break;
                }
                ++v;
                v1 = v3;
            }
        }
        jSONObject0.put("anr_tag", s1);
        jSONObject0.put("anr_has_ago", String.valueOf(z));
        jSONObject0.put("anr_reason", s2);
        b.a(hashMap2, jSONObject0, "app");
        b.a(hashMap0, jSONObject0, "total");
        if(hashMap1.isEmpty()) {
            jSONObject0.put("npth_anr_systemserver_total", "not found");
        }
        else {
            jSONObject0.put("npth_anr_systemserver_total", b.b(((float)com.apm.insight.l.c.1.a(hashMap1))));
        }
        if(hashMap4.isEmpty()) {
            jSONObject0.put("npth_anr_kswapd_total", "not found");
        }
        else {
            jSONObject0.put("npth_anr_kswapd_total", b.b(((float)com.apm.insight.l.c.1.a(hashMap4))));
        }
        if(hashMap3.isEmpty()) {
            jSONObject0.put("npth_anr_dex2oat_total", "not found");
            return;
        }
        jSONObject0.put("npth_anr_dex2oat_total", b.b(((float)com.apm.insight.l.c.1.a(hashMap3))));
    }

    private static void a(HashMap hashMap0, JSONObject jSONObject0, String s) throws JSONException {
        if(hashMap0.isEmpty()) {
            jSONObject0.put("npth_anr_" + s + "_total", "not found");
            return;
        }
        float f = 0.0f;
        float f1 = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        for(Object object0: hashMap0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            String s1 = (String)map$Entry0.getKey();
            if(s1.endsWith("user")) {
                f += (float)(((Float)map$Entry0.getValue()));
            }
            else if(s1.endsWith("kernel")) {
                f1 += (float)(((Float)map$Entry0.getValue()));
            }
            else if(s1.endsWith("iowait")) {
                f2 += (float)(((Float)map$Entry0.getValue()));
            }
            else if(s1.endsWith("irq")) {
                f3 += (float)(((Float)map$Entry0.getValue()));
            }
            else if(s1.endsWith("softirq")) {
                f4 += (float)(((Float)map$Entry0.getValue()));
            }
        }
        float f5 = f + f1 + f2 + f3 + f4;
        jSONObject0.put("npth_anr_" + s + "_total", b.b(f5));
        jSONObject0.put("npth_anr_" + s + "_kernel_user_ratio", b.a(f1, f5));
        jSONObject0.put("npth_anr_" + s + "_iowait_user_ratio", b.a(f2, f5));
    }

    private void a(JSONArray jSONArray0) {
        int[] arr_v1;
        int[] arr_v;
        if(jSONArray0 == null) {
            return;
        }
        this.g = null;
        this.n = null;
        this.o = 0;
        JSONArray jSONArray1 = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        this.i = "unknown";
        this.j = "unknown";
        this.k = "unknown";
        int v = 0;
        int v1 = 0;
        int v2 = 0;
        JSONArray jSONArray4 = jSONArray3;
        CharSequence charSequence0 = null;
        int v3 = 0;
        int v4 = 0;
        while(v3 < jSONArray0.length()) {
            String s = jSONArray0.optString(v3);
            if(TextUtils.isEmpty(s)) {
                if(jSONArray4.length() > 0 && !TextUtils.isEmpty(charSequence0)) {
                    if(this.g != null || !"main".equals(charSequence0)) {
                        jSONArray1.put(this.a(((String)charSequence0), jSONArray4));
                    }
                    else {
                        this.g = this.c(jSONArray4);
                    }
                    try {
                        if(!"main".equals(charSequence0)) {
                            charSequence0 = ((String)charSequence0).substring(0, ((String)charSequence0).indexOf(40)).trim();
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    if(!this.a(((String)charSequence0))) {
                        try {
                            arr_v = this.b(jSONArray4);
                            goto label_34;
                        }
                        catch(IllegalArgumentException illegalArgumentException0) {
                            j.a(illegalArgumentException0, "NPTH_CATCH");
                        }
                        catch(Throwable unused_ex) {
                        }
                        arr_v = null;
                    label_34:
                        if(arr_v != null) {
                            int v5 = arr_v[0];
                            if(v5 > v) {
                                v = v5;
                                this.i = charSequence0;
                            }
                            int v6 = arr_v[1];
                            if(v6 > v1) {
                                v1 = v6;
                                this.j = charSequence0;
                            }
                            int v7 = arr_v[2];
                            if(v7 > v2) {
                                v2 = v7;
                                this.k = charSequence0;
                            }
                        }
                    }
                }
                if(jSONArray4.length() > 0) {
                    jSONArray4 = new JSONArray();
                }
                charSequence0 = null;
            }
            else {
                switch(v4) {
                    case 0: {
                        if(s.startsWith("DALVIK THREADS") || s.startsWith("suspend") || s.startsWith("\"")) {
                            v4 = 1;
                        }
                        jSONArray2.put(s);
                        break;
                    }
                    case 1: {
                        if(s.contains(" prio=")) {
                            if(jSONArray4.length() > 0 && !TextUtils.isEmpty(charSequence0)) {
                                if(this.g != null || !"main".equals(charSequence0)) {
                                    jSONArray1.put(this.a(((String)charSequence0), jSONArray4));
                                }
                                else {
                                    this.g = this.c(jSONArray4);
                                }
                                try {
                                    if(!"main".equals(charSequence0)) {
                                        charSequence0 = ((String)charSequence0).substring(0, ((String)charSequence0).indexOf(40)).trim();
                                    }
                                }
                                catch(Throwable unused_ex) {
                                }
                                if(!this.a(((String)charSequence0))) {
                                    try {
                                        arr_v1 = this.b(jSONArray4);
                                        goto label_71;
                                    }
                                    catch(IllegalArgumentException illegalArgumentException1) {
                                        j.a(illegalArgumentException1, "NPTH_CATCH");
                                    }
                                    catch(Throwable unused_ex) {
                                    }
                                    arr_v1 = null;
                                label_71:
                                    if(arr_v1 != null) {
                                        int v8 = arr_v1[0];
                                        if(v8 > v) {
                                            v = v8;
                                            this.i = charSequence0;
                                        }
                                        int v9 = arr_v1[1];
                                        if(v9 > v1) {
                                            v1 = v9;
                                            this.j = charSequence0;
                                        }
                                        int v10 = arr_v1[2];
                                        if(v10 > v2) {
                                            v2 = v10;
                                            this.k = charSequence0;
                                        }
                                    }
                                }
                            }
                            String s1 = s.substring(1, s.indexOf(34, 1));
                            charSequence0 = "main".equals(s1) ? s1 : s1 + "  (" + s.substring(s.indexOf(34, 2) + 1) + " )";
                            if(jSONArray4.length() > 0) {
                                jSONArray4 = new JSONArray();
                            }
                            jSONArray4.put(s);
                        }
                        else if(TextUtils.isEmpty(charSequence0)) {
                            jSONArray2.put(s);
                        }
                        else {
                            jSONArray4.put(s);
                        }
                    }
                }
            }
            ++v3;
        }
        if(jSONArray1.length() > 0) {
            try {
                this.m = jSONArray2;
                JSONObject jSONObject0 = new JSONObject();
                this.n = jSONObject0;
                jSONObject0.put("thread_all_count", jSONArray1.length());
                this.n.put("thread_stacks", jSONArray1);
            }
            catch(JSONException jSONException0) {
                jSONException0.printStackTrace();
            }
        }
    }

    private boolean a(long v) {
        if(this.v) {
            this.v = false;
            this.b(v);
        }
        return false;
    }

    private boolean a(String s) {
        if(this.B == null) {
            JSONArray jSONArray0 = com.apm.insight.runtime.a.b();
            if(jSONArray0 != null) {
                this.B = new LinkedList();
                this.l = jSONArray0.optString(0);
                for(int v = 1; v < jSONArray0.length(); ++v) {
                    try {
                        this.B.add(Pattern.compile(jSONArray0.optString(v)));
                    }
                    catch(Throwable unused_ex) {
                    }
                }
            }
            if(this.B == null) {
                LinkedList linkedList0 = new LinkedList();
                this.B = linkedList0;
                linkedList0.add(Pattern.compile("^main$"));
                this.B.add(Pattern.compile("^default_npth_thread$"));
                this.B.add(Pattern.compile("^RenderThread$"));
                this.B.add(Pattern.compile("^Jit thread pool worker thread.*$"));
            }
        }
        for(Object object0: this.B) {
            if(((Pattern)object0).matcher(s).matches()) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public final void a() {
        if(this.c) {
            return;
        }
        this.a = new c(this);
        this.d = 0L;
        this.c = true;
    }

    private static String b(float f) {
        return b.a(f / 100.0f);
    }

    private void b(long v) {
        File file0;
        File file1;
        if(this.x == this.w) {
            try {
                this.d = this.p;
                file1 = new File(new File(com.apm.insight.l.j.f(this.b), "anr_59bce317a51642f6U_2626caffe2a897b9G"), "trace" + com.apm.insight.l.a.d(this.b).replace(':', '_') + ".txt");
                file1.getParentFile().mkdirs();
                f.a(file1, com.apm.insight.l.b.a().format(new Date(System.currentTimeMillis())) + "\n", false);
                n.a("anr_trace", "anr_59bce317a51642f6U_2626caffe2a897b9G");
                NativeImpl.i(file1.getAbsolutePath());
            }
            catch(Throwable throwable2) {
                goto label_45;
            }
            try {
                JSONArray jSONArray1 = f.a(file1.getAbsolutePath());
                this.m = jSONArray1;
                this.a(jSONArray1);
                goto label_41;
            }
            catch(IOException unused_ex) {
                goto label_41;
            }
            catch(Throwable throwable3) {
            }
            try {
                j.a(throwable3, "NPTH_CATCH");
            label_41:
                if(this.g == null) {
                    this.g = com.apm.insight.b.d.a();
                }
                goto label_46;
            }
            catch(Throwable throwable2) {
            }
        label_45:
            j.a(throwable2, "NPTH_CATCH");
        }
        else {
            try {
                this.p = System.currentTimeMillis();
                this.r = com.apm.insight.b.f.b().b();
                this.q = com.apm.insight.b.j.a(v);
                this.h = com.apm.insight.b.f.b().a(v).a();
                JSONObject jSONObject0 = new JSONObject();
                this.s = jSONObject0;
                com.apm.insight.l.a.a(this.b, jSONObject0);
                this.t = this.h();
                this.f = !Npth.hasCrash();
            }
            catch(Throwable unused_ex) {
            }
            try {
                this.d = this.p;
                file0 = new File(new File(com.apm.insight.l.j.f(this.b), "anr_59bce317a51642f6U_2626caffe2a897b9G"), "trace_" + com.apm.insight.l.a.d(this.b).replace(':', '_') + ".txt");
                file0.getParentFile().mkdirs();
                f.a(file0, com.apm.insight.l.b.a().format(new Date(System.currentTimeMillis())) + "\n", false);
                n.a("anr_trace", "anr_59bce317a51642f6U_2626caffe2a897b9G");
                NativeImpl.i(file0.getAbsolutePath());
            }
            catch(Throwable throwable0) {
                goto label_26;
            }
            try {
                JSONArray jSONArray0 = f.a(file0.getAbsolutePath());
                this.m = jSONArray0;
                this.a(jSONArray0);
                goto label_22;
            }
            catch(IOException unused_ex) {
                goto label_22;
            }
            catch(Throwable throwable1) {
            }
            try {
                j.a(throwable1, "NPTH_CATCH");
            label_22:
                if(this.g == null) {
                    this.g = com.apm.insight.b.d.a();
                }
                goto label_27;
            }
            catch(Throwable throwable0) {
            }
        label_26:
            j.a(throwable0, "NPTH_CATCH");
        label_27:
            a.d();
        }
    label_46:
        long v1 = this.w;
        this.x = v1;
        this.w = -1L;
        if(v1 == -1L) {
            this.x = -2L;
        }
    }

    private static void b(String s, JSONArray jSONArray0) {
        for(Object object0: l.a().e()) {
            ICrashCallback iCrashCallback0 = (ICrashCallback)object0;
            try {
                if(iCrashCallback0 instanceof com.apm.insight.b) {
                    ((com.apm.insight.b)iCrashCallback0).a(CrashType.ANR, s, null, jSONArray0);
                    continue;
                }
                iCrashCallback0.onCrash(CrashType.ANR, s, null);
                continue;
            }
            catch(Throwable throwable0) {
            }
            j.a(throwable0, "NPTH_CATCH");
        }
    }

    @Nullable
    private int[] b(@NonNull JSONArray jSONArray0) throws IllegalArgumentException {
        for(int v = 0; v < jSONArray0.length(); ++v) {
            String s = jSONArray0.optString(v);
            int v1 = s == null || s.isEmpty() ? -1 : s.indexOf("utm=");
            if(v1 > 0) {
                if(this.C == null) {
                    this.C = Pattern.compile("[^0-9]+");
                }
                String[] arr_s = this.C.split(s.substring(v1));
                if(arr_s == null || arr_s.length < 2) {
                    break;
                }
                try {
                    int v2 = (int)Integer.decode(arr_s[1]);
                    int v3 = (int)Integer.decode(arr_s[2]);
                    return new int[]{v2, v3, v2 + v3};
                }
                catch(Throwable unused_ex) {
                    throw new IllegalArgumentException("Err stack line: " + s);
                }
            }
        }
        return null;
    }

    public final void b() {
        if(!this.c) {
            return;
        }
        this.c = false;
        c c0 = this.a;
        if(c0 != null) {
            c0.b();
        }
        this.a = null;
    }

    private JSONObject c(@NonNull JSONArray jSONArray0) {
        JSONObject jSONObject0 = new JSONObject();
        JSONArray jSONArray1 = a.b(jSONArray0);
        if(jSONArray1.length() != jSONArray0.length()) {
            ++this.o;
        }
        try {
            jSONObject0.put("thread_number", 1);
            StringBuilder stringBuilder0 = new StringBuilder();
            for(int v = 0; v < jSONArray1.length(); ++v) {
                stringBuilder0.append(jSONArray1.getString(v));
                stringBuilder0.append('\n');
            }
            jSONObject0.put("mainStackFromTrace", stringBuilder0.toString());
            return jSONObject0;
        }
        catch(JSONException unused_ex) {
            return null;
        }
    }

    public final void c() {
        c c0 = this.a;
        if(c0 != null) {
            c0.a();
        }
    }

    public final void d() {
        synchronized(this.u) {
        }
        this.y.run();
    }

    public final void e() {
        try {
            f.a(this.i(), String.valueOf(this.A + 1), false);
        }
        catch(Throwable throwable0) {
            j.a(throwable0, "NPTH_CATCH");
        }
        this.w = SystemClock.uptimeMillis();
        this.v = true;
    }

    public final void f() {
        File file0 = this.i();
        try {
            int v = (int)Integer.decode(f.a(file0.getAbsolutePath(), "\n"));
            this.A = v;
            if(v >= 2) {
                NativeImpl.a(false);
                return;
            }
            NativeImpl.a(true);
        }
        catch(IOException unused_ex) {
            NativeImpl.a(true);
        }
        catch(Throwable unused_ex) {
            f.a(file0);
        }
    }

    final boolean g() {
        String s9;
        JSONObject jSONObject7;
        JSONObject jSONObject6;
        com.apm.insight.entity.a a1;
        boolean z2;
        JSONObject jSONObject4;
        long v2;
        String s8;
        String s7;
        JSONArray jSONArray5;
        JSONObject jSONObject3;
        JSONObject jSONObject2;
        JSONArray jSONArray4;
        String s6;
        String s5;
        JSONArray jSONArray3;
        boolean z1;
        boolean z = i.a().b();
        long v = SystemClock.uptimeMillis();
        this.a(v);
        String s = com.apm.insight.b.d.a(this.b);
        long v1 = System.currentTimeMillis();
        String s1 = "normal";
        TextUtils.isEmpty(s);
        if(TextUtils.isEmpty(s)) {
            s7 = "unknown";
            s5 = "unknown";
            jSONArray5 = null;
            jSONArray3 = null;
            jSONObject3 = null;
            z2 = false;
            jSONObject2 = null;
            z1 = false;
            s8 = "normal";
            s6 = "unknown";
            jSONArray4 = null;
            v2 = v1;
            jSONObject4 = null;
        }
        else {
            if(this.g == null || System.currentTimeMillis() - this.d > 20000L) {
                if(this.v) {
                    this.v = false;
                    s1 = "trace_after";
                }
                this.b(v);
            }
            else {
                s1 = "trace_last";
            }
            String s2 = this.i;
            String s3 = this.j;
            String s4 = this.k;
            JSONArray jSONArray0 = this.r;
            JSONArray jSONArray1 = this.q;
            JSONObject jSONObject0 = this.h;
            JSONObject jSONObject1 = this.g;
            z1 = this.t;
            JSONArray jSONArray2 = this.m;
            this.g = null;
            this.m = null;
            this.q = null;
            this.h = null;
            this.r = null;
            this.i = "unknown";
            this.j = "unknown";
            this.k = "unknown";
            this.o = 0;
            jSONArray3 = jSONArray1;
            s5 = s4;
            s6 = s2;
            jSONArray4 = jSONArray2;
            jSONObject2 = jSONObject0;
            jSONObject3 = this.s;
            jSONArray5 = jSONArray0;
            s7 = s3;
            s8 = s1;
            v2 = this.p;
            jSONObject4 = jSONObject1;
            z2 = true;
        }
        if(TextUtils.isEmpty(s)) {
            if(this.g != null && System.currentTimeMillis() - this.d > 20000L) {
                this.g = null;
                this.m = null;
                this.q = null;
                this.h = null;
                this.r = null;
                this.i = "unknown";
                this.j = "unknown";
                this.k = "unknown";
                this.o = 0;
                this.e = null;
                return false;
            }
            if(this.g != null && System.currentTimeMillis() - this.d > 2000L) {
                f.a(this.i());
            }
            return false;
        }
        if(jSONObject4 == null) {
            try {
                if(jSONArray3 == null) {
                    jSONArray5 = com.apm.insight.b.f.b().b();
                    jSONArray3 = com.apm.insight.b.j.a(v);
                    jSONObject2 = com.apm.insight.b.f.b().a(v).a();
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject3 = jSONObject5;
                    com.apm.insight.l.a.a(this.b, jSONObject5);
                    jSONObject3 = jSONObject5;
                }
                jSONObject4 = com.apm.insight.b.d.a();
            }
            catch(Throwable unused_ex) {
                jSONObject4 = null;
            }
        }
        if(jSONObject4 != null && jSONObject4.length() > 0) {
            try {
                jSONObject4.put("pid", Process.myPid());
                jSONObject4.put("package", "com.dcinside.app.android");
                jSONObject4.put("is_remote_process", 0);
                jSONObject4.put("is_new_stack", 10);
                com.apm.insight.entity.a a0 = new com.apm.insight.entity.a(new JSONObject());
                a0.a("data", jSONObject4.toString());
                a0.a("is_anr", 1);
                a0.a("anrType", s8);
                a0.a("history_message", jSONArray5);
                a0.a("current_message", jSONObject2);
                a0.a("pending_messages", jSONArray3);
                a0.a("anr_time", System.currentTimeMillis());
                a0.a("crash_time", v2);
                com.apm.insight.c.a.b();
                a0.c(jSONObject3);
                a0.a("anr_info", s);
                if(jSONArray4 != null) {
                    a0.a("dump_trace", jSONArray4);
                }
                a0.a("all_thread_stacks", (this.n == null || this.n.length() == 0 ? m.b(null) : this.n));
                a1 = com.apm.insight.runtime.a.f.a().a(CrashType.ANR, a0);
                a1.a("is_background", Boolean.valueOf(z1));
                a1.a("logcat", h.a("71515ed7bfdf66aU"));
                a1.a("has_dump", "true");
                a1.a("crash_uuid", e.a(v2, CrashType.ANR, false, false));
                jSONObject6 = a1.c().optJSONObject("filters");
                com.apm.insight.entity.d.b(a1.c());
                if(jSONObject6 == null) {
                    goto label_115;
                }
                else {
                    goto label_118;
                }
                goto label_119;
            }
            catch(Throwable throwable0) {
                j.a(throwable0, "NPTH_CATCH");
                return z2;
            }
            try {
            label_115:
                jSONObject7 = new JSONObject();
            }
            catch(Throwable unused_ex) {
                goto label_172;
            }
            try {
                a1.a("filters", jSONObject7);
                goto label_119;
            label_118:
                jSONObject7 = jSONObject6;
            label_119:
                jSONObject7.put("anrType", s8);
                jSONObject7.put("max_utm_thread", s6);
                jSONObject7.put("max_stm_thread", s7);
                jSONObject7.put("max_utm_stm_thread", s5);
                jSONObject7.put("max_utm_thread_version", this.l);
                if(v2 < 30000L) {
                    s9 = "0 - 30s";
                }
                else if(v2 < 60000L) {
                    s9 = "30s - 1min";
                }
                else if(v2 < 120000L) {
                    s9 = "1min - 2min";
                }
                else if(v2 < 300000L) {
                    s9 = "2min - 5min";
                }
                else if(v2 < 600000L) {
                    s9 = "5min - 10min";
                }
                else if(v2 < 1800000L) {
                    s9 = "10min - 30min";
                }
                else {
                    s9 = v2 >= 3600000L ? "1h - " : "30min - 1h";
                }
                jSONObject7.put("crash_length", s9);
                jSONObject7.put("disable_looper_monitor", "false");
                jSONObject7.put("npth_force_apm_crash", "false");
                jSONObject7.put("sdk_version", "2.0.0.3");
                jSONObject7.put("has_logcat", String.valueOf(a1.a()));
                jSONObject7.put("memory_leak", "false");
                jSONObject7.put("fd_leak", "false");
                jSONObject7.put("threads_leak", "false");
                jSONObject7.put("is_64_devices", "true");
                jSONObject7.put("is_64_runtime", "false");
                jSONObject7.put("is_x86_devices", "false");
                jSONObject7.put("has_meminfo_file", "false");
                jSONObject7.put("is_root", "false");
                jSONObject7.put("anr_normal_trace", String.valueOf(!this.v));
                jSONObject7.put("anr_no_run", String.valueOf(z));
                jSONObject7.put("crash_after_crash", "false");
                jSONObject7.put("from_file", "false");
                jSONObject7.put("has_dump", "true");
                jSONObject7.put("from_kill", "false");
                jSONObject7.put("last_resume_activity", "null");
                int v3 = this.o;
                if(v3 > 0) {
                    jSONObject7.put("may_have_stack_overflow", String.valueOf(v3));
                }
            }
            catch(Throwable unused_ex) {
                goto label_171;
            }
            try {
                this.a(s, jSONObject7);
                goto label_173;
            }
            catch(Throwable throwable1) {
                try {
                    j.a(throwable1, "NPTH_CATCH");
                    goto label_173;
                label_171:
                    jSONObject6 = jSONObject7;
                }
                catch(Throwable unused_ex) {
                    goto label_171;
                }
            }
        label_172:
            jSONObject7 = jSONObject6;
            try {
            label_173:
                com.apm.insight.a.a.a();
                new String("71515ed7bfdf66aU_b1bf896203c25dadG");
            }
            catch(Throwable throwable0) {
                j.a(throwable0, "NPTH_CATCH");
                return z2;
            }
            try {
                if(a.e().length() > 0x400L) {
                    a1.a("has_system_traces", "true");
                }
            }
            catch(Throwable unused_ex) {
            }
            try {
                JSONArray jSONArray6 = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.e("71515ed7bfdf66aU"), com.apm.insight.l.j.f("71515ed7bfdf66aU"));
                jSONObject7.put("leak_threads_count", "0");
                if(jSONArray6.length() > 0) {
                    f.a(com.apm.insight.l.j.g("71515ed7bfdf66aU"), jSONArray6);
                }
            }
            catch(Throwable unused_ex) {
            }
            try {
                String s10 = jSONObject4.optString("mainStackFromTrace");
                JSONArray jSONArray7 = com.apm.insight.entity.b.a(s10);
                com.apm.insight.entity.b.a(a1.c(), jSONArray7, new com.apm.insight.entity.b.a() {
                    private b b;

                    @Override  // com.apm.insight.entity.b$a
                    public final void a(JSONObject jSONObject0) {
                        com.apm.insight.k.d.a().a(jSONObject0, v2, b.this.f);
                    }
                });
                b.b(s10, jSONArray7);
                return z2;
            }
            catch(Throwable throwable0) {
            }
            j.a(throwable0, "NPTH_CATCH");
        }
        return z2;
    }

    private boolean h() {
        boolean z = com.apm.insight.l.a.a(this.b);
        return z || com.apm.insight.runtime.a.b.d().e() > 2000L ? !z : false;
    }

    private File i() {
        if(this.D == null) {
            this.D = new File(this.b.getFilesDir(), "has_anr_signal_" + com.apm.insight.l.a.d(this.b).replaceAll(":", "_"));
        }
        return this.D;
    }
}

