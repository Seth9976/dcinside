package com.apm.insight.nativecrash;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.apm.insight.ICommonParams;
import com.apm.insight.l.f;
import com.apm.insight.l.m;
import com.apm.insight.runtime.j;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

public final class b {
    public static final class a extends c {
        a(File file0) {
            super(file0);
            this.b = "Total FD Count:";
            this.c = ":";
            this.d = -2;
        }
    }

    public static final class com.apm.insight.nativecrash.b.b extends c {
        com.apm.insight.nativecrash.b.b(File file0) {
            super(file0);
            this.b = "VmSize:";
            this.c = "\\s+";
            this.d = -1;
        }
    }

    public static class c {
        protected File a;
        protected String b;
        protected String c;
        protected int d;

        public c(File file0) {
            this.a = file0;
        }

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

    public static final class d extends c {
        d(File file0) {
            super(file0);
        }

        @NonNull
        public final HashMap b() {
            HashMap hashMap0 = new HashMap();
            try {
                JSONArray jSONArray0 = f.a(this.a.getAbsolutePath());
                if(jSONArray0 == null) {
                    return hashMap0;
                }
                for(int v = 0; true; ++v) {
                    if(v >= jSONArray0.length()) {
                        return hashMap0;
                    }
                    String s = jSONArray0.optString(v);
                    if(!TextUtils.isEmpty(s) && s.startsWith("[tid:0") && s.endsWith("sigstack:0x0]")) {
                        int v1 = s.indexOf("[routine:0x");
                        String s1 = v1 <= 0 ? "unknown addr" : s.substring(v1 + 11, s.indexOf(93, v1 + 11));
                        List list0 = (List)hashMap0.get(s1);
                        if(list0 == null) {
                            list0 = new ArrayList();
                            hashMap0.put(s1, list0);
                        }
                        list0.add(s);
                    }
                }
            }
            catch(IOException unused_ex) {
                return hashMap0;
            }
            catch(Throwable throwable0) {
            }
            j.a(throwable0, "NPTH_CATCH");
            return hashMap0;
        }
    }

    public static final class e extends c {
        e(File file0) {
            super(file0);
        }

        @NonNull
        public final JSONArray a(HashMap hashMap0) {
            JSONArray jSONArray0 = new JSONArray();
            if(hashMap0.isEmpty()) {
                return jSONArray0;
            }
            try {
                JSONArray jSONArray1 = f.a(this.a.getAbsolutePath());
                if(jSONArray1 == null) {
                    return jSONArray0;
                }
                for(int v = 0; v < jSONArray1.length(); ++v) {
                    String s = jSONArray1.optString(v);
                    if(!TextUtils.isEmpty(s)) {
                        int v1 = s.indexOf(":");
                        if(v1 > 2) {
                            String s1 = s.substring(2, v1);
                            if(hashMap0.containsKey(s1)) {
                                List list0 = (List)hashMap0.get(s1);
                                if(list0 != null) {
                                    for(Object object0: list0) {
                                        jSONArray0.put(((String)object0) + " " + s);
                                    }
                                    hashMap0.remove(s1);
                                }
                            }
                        }
                    }
                }
                Iterator iterator1 = hashMap0.values().iterator();
                while(true) {
                    if(!iterator1.hasNext()) {
                        return jSONArray0;
                    }
                    Object object1 = iterator1.next();
                    for(Object object2: ((List)object1)) {
                        jSONArray0.put(((String)object2) + "  0x000000:unknown");
                    }
                }
            }
            catch(IOException unused_ex) {
                return jSONArray0;
            }
            catch(Throwable throwable0) {
            }
            j.a(throwable0, "NPTH_CATCH");
            return jSONArray0;
        }
    }

    public static final class com.apm.insight.nativecrash.b.f extends c {
        com.apm.insight.nativecrash.b.f(File file0) {
            super(file0);
            this.b = "Total Threads Count:";
            this.c = ":";
            this.d = -2;
        }
    }

    private Context a;
    private ICommonParams b;
    private ICommonParams c;

    public b(Context context0, ICommonParams iCommonParams0) {
        this(context0, iCommonParams0, null);
    }

    public b(Context context0, ICommonParams iCommonParams0, b b0) {
        this.a = context0;
        this.b = iCommonParams0;
        this.c = b0 == null ? null : b0.b;
    }

    public static int a(String s) {
        return new a(com.apm.insight.l.j.b(s)).a();
    }

    @NonNull
    public static JSONArray a(File file0, File file1) {
        HashMap hashMap0 = new d(file0).b();
        return new e(file1).a(hashMap0);
    }

    // 去混淆评级： 中等(50)
    public static boolean a(Map map0) {
        return map0 == null || map0.isEmpty() || !map0.containsKey("app_version") && !map0.containsKey("version_name") || !map0.containsKey("version_code") || !map0.containsKey("update_version_code");
    }

    public final Map a() {
        String s;
        Map map0 = this.b();
        if(map0 == null) {
            s = null;
        }
        else {
            Object object0 = map0.get("aid");
            s = object0 == null ? null : String.valueOf(object0);
        }
        if(s == null) {
            map0.put("aid", 4444);
        }
        return map0;
    }

    public static int b(String s) {
        return new com.apm.insight.nativecrash.b.f(com.apm.insight.l.j.c(s)).a();
    }

    @NonNull
    public final Map b() {
        Throwable throwable2;
        Map map1;
        Map map0;
        Object object0 = null;
        try {
            ICommonParams iCommonParams0 = this.c;
            map0 = iCommonParams0 == null ? new HashMap() : iCommonParams0.getCommonParams();
        }
        catch(Throwable throwable0) {
            map1 = null;
            goto label_16;
        }
        try {
            map0.putAll(this.b.getCommonParams());
            throwable2 = null;
            goto label_18;
        }
        catch(Throwable throwable1) {
            map1 = map0;
            throwable0 = throwable1;
        }
    label_16:
        throwable2 = throwable0;
        map0 = map1;
    label_18:
        if(map0 == null) {
            map0 = new HashMap(4);
            if(throwable2 != null) {
                try {
                    map0.put("err_info", m.a(throwable2));
                }
                catch(Throwable unused_ex) {
                }
            }
        }
        if(b.a(map0)) {
            try {
                PackageInfo packageInfo0 = this.a.getPackageManager().getPackageInfo("com.dcinside.app.android", 0x80);
                map0.put("version_name", packageInfo0.versionName);
                map0.put("version_code", packageInfo0.versionCode);
                if(map0.get("update_version_code") == null) {
                    Bundle bundle0 = packageInfo0.applicationInfo.metaData;
                    if(bundle0 != null) {
                        object0 = bundle0.get("UPDATE_VERSION_CODE");
                    }
                    if(object0 == null) {
                        object0 = map0.get("version_code");
                    }
                    map0.put("update_version_code", object0);
                    return map0;
                }
            }
            catch(Throwable unused_ex) {
                map0.put("version_name", com.apm.insight.l.a.e(this.a));
                map0.put("version_code", com.apm.insight.l.a.f(this.a));
                if(map0.get("update_version_code") == null) {
                    map0.put("update_version_code", map0.get("version_code"));
                    return map0;
                }
            }
        }
        else {
            try {
                String s = this.a.getPackageManager().getPackageInfo("com.dcinside.app.android", 0x80).versionName;
                if(s != null && !s.equals(((String)Class.forName("com.dcinside.app.android.BuildConfig").getDeclaredField("VERSION_NAME").get(null)))) {
                    map0.put("manifest_version", s);
                }
                return map0;
            }
            catch(Throwable unused_ex) {
            }
        }
        return map0;
    }

    public static int c(String s) {
        return new com.apm.insight.nativecrash.b.b(com.apm.insight.l.j.d(s)).a();
    }

    @NonNull
    public final ICommonParams c() {
        return this.b;
    }

    public final String d() [...] // 潜在的解密器

    public final String e() [...] // 潜在的解密器

    public final long f() {
        try {
            return this.b.getUserId();
        }
        catch(Throwable unused_ex) {
            return 0L;
        }
    }
}

