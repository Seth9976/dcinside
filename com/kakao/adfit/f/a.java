package com.kakao.adfit.f;

import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.res.AssetManager;
import android.os.Looper;
import android.os.StatFs;
import android.util.DisplayMetrics;
import android.view.Display;
import com.kakao.adfit.common.matrix.e;
import com.kakao.adfit.i.c;
import com.kakao.adfit.i.d;
import com.kakao.adfit.i.g;
import com.kakao.adfit.i.p;
import com.kakao.adfit.i.q;
import com.kakao.adfit.m.B;
import com.kakao.adfit.m.f;
import com.kakao.adfit.m.k;
import com.kakao.adfit.m.l;
import com.kakao.adfit.m.u;
import com.kakao.adfit.m.x;
import com.kakao.adfit.m.z;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.v;

public final class a implements b {
    public static final class com.kakao.adfit.f.a.a {
        private com.kakao.adfit.f.a.a() {
        }

        public com.kakao.adfit.f.a.a(w w0) {
        }
    }

    private final Context a;
    private Future b;
    public static final com.kakao.adfit.f.a.a c;
    private static final d d;

    static {
        a.c = new com.kakao.adfit.f.a.a(null);
        a.d = d.b.a();
    }

    public a(Context context0) {
        L.p(context0, "context");
        super();
        this.a = context0;
        ExecutorService executorService0 = Executors.newSingleThreadExecutor();
        Future future0 = executorService0.submit(() -> {
            L.p(this, "this$0");
            return this.e();
        });
        L.o(future0, "executorService.submit<M…y>> { loadContextData() }");
        this.b = future0;
        executorService0.shutdown();
    }

    private final com.kakao.adfit.i.a a() {
        return new com.kakao.adfit.i.a("com.kakao.adfit.ads", "AdFit Android (" + v.q1("network") + ')', "3.17.2", "1731289024", a.d);
    }

    private final g a(Context context0) {
        Boolean boolean0;
        ActivityManager.MemoryInfo activityManager$MemoryInfo0 = k.c(context0);
        StatFs statFs0 = k.e(context0);
        Display display0 = l.a(context0);
        DisplayMetrics displayMetrics0 = new DisplayMetrics();
        display0.getMetrics(displayMetrics0);
        int v = l.a(display0);
        String s = g.B.b(v);
        Intent intent0 = k.b(context0);
        String s1 = k.a(context0);
        String s2 = k.d(context0);
        String s3 = k.g();
        String s4 = k.b();
        String s5 = k.d();
        String s6 = k.i();
        String s7 = k.h();
        try {
            Object object0 = ((Map)this.b.get()).get("emulator");
            if(!(object0 instanceof Boolean)) {
                object0 = null;
            }
            boolean0 = (Boolean)object0;
        }
        catch(Exception exception0) {
            f.b(("Error getting emulator" + '.'), exception0);
            boolean0 = null;
        }
        List list0 = k.j();
        boolean z = u.c(context0);
        int v1 = u.b(context0);
        Long long0 = activityManager$MemoryInfo0 == null ? null : k.b(activityManager$MemoryInfo0);
        Long long1 = activityManager$MemoryInfo0 == null ? null : k.a(activityManager$MemoryInfo0);
        Boolean boolean1 = activityManager$MemoryInfo0 == null ? null : Boolean.valueOf(k.c(activityManager$MemoryInfo0));
        Long long2 = statFs0 == null ? null : k.b(statFs0);
        Long long3 = statFs0 == null ? null : k.a(statFs0);
        int v2 = displayMetrics0.widthPixels;
        int v3 = displayMetrics0.heightPixels;
        float f = displayMetrics0.density;
        int v4 = displayMetrics0.densityDpi;
        Float float0 = intent0 == null ? null : k.a(intent0);
        Float float1 = intent0 == null ? null : k.c(intent0);
        Boolean boolean2 = intent0 == null ? null : Boolean.valueOf(k.d(intent0));
        long v5 = k.a();
        return new g(s1, s2, s3, s4, s5, s6, s7, boolean0, list0, long0, long1, boolean1, long2, long3, v2, v3, f, v4, s, Boolean.valueOf(z), g.B.a(v1), float0, float1, boolean2, d.b.a(v5), "Asia/Shanghai", k.e());
    }

    // 检测为 Lambda 实现
    private static final Map a(a a0) [...]

    private final void a(e e0) {
        c c0 = e0.b();
        L.m(c0);
        if(c0.a() == null) {
            c0.a(this.a());
            if(e0.d() == null) {
                com.kakao.adfit.i.a a0 = c0.a();
                L.m(a0);
                String s = a0.a();
                if(s != null) {
                    e0.a(s);
                }
            }
        }
        if(e0.l() == null) {
            e0.b(this.c(this.a));
        }
        if(e0.e() == null) {
            Map map0 = e0.l();
            e0.b((map0 == null ? null : ((String)map0.get("service_id"))));
        }
        if(e0.o() == null) {
            e0.a(this.d());
        }
        if(e0.c() == null) {
            e0.a(this.b());
        }
        List list0 = e0.m();
        if(list0 != null) {
            long v = Looper.getMainLooper().getThread().getId();
            for(Object object0: list0) {
                Long long0 = ((p)object0).a();
                ((p)object0).b(Boolean.valueOf(long0 != null && ((long)long0) == v));
            }
        }
    }

    @Override  // com.kakao.adfit.f.b
    public e a(e e0, Object object0) {
        L.p(e0, "event");
        c c0 = e0.b();
        if(c0 == null) {
            c0 = new c(null, null, null, 7, null);
            e0.a(c0);
        }
        if(!(object0 instanceof com.kakao.adfit.h.a)) {
            this.a(e0);
        }
        if(c0.b() == null) {
            c0.a(this.a(this.a));
        }
        if(c0.c() == null) {
            c0.a(this.c());
        }
        return e0;
    }

    private final com.kakao.adfit.i.f b() {
        List list0;
        try {
            Object object0 = ((Map)this.b.get()).get("proguardUuids");
            if(!(object0 instanceof List)) {
                object0 = null;
            }
            list0 = (List)object0;
        }
        catch(Exception exception0) {
            f.b(("Error getting proguardUuids" + '.'), exception0);
            list0 = null;
        }
        if(list0 != null && !list0.isEmpty() == 1) {
            ArrayList arrayList0 = new ArrayList(kotlin.collections.u.b0(list0, 10));
            for(Object object1: list0) {
                arrayList0.add(new com.kakao.adfit.i.e("proguard", ((String)object1)));
            }
            return new com.kakao.adfit.i.f(arrayList0);
        }
        return null;
    }

    private final List b(Context context0) {
        List list0;
        BufferedInputStream bufferedInputStream0;
        AssetManager assetManager0 = context0.getAssets();
        try {
            bufferedInputStream0 = new BufferedInputStream(assetManager0.open("kakao-adfit-matrix-debug-meta.properties"));
        }
        catch(FileNotFoundException unused_ex) {
            f.a("kakao-adfit-matrix-debug-meta.properties file was not found.");
            return null;
        }
        catch(IOException iOException0) {
            f.b("Error getting Proguard UUIDs.", iOException0);
            return null;
        }
        catch(RuntimeException runtimeException0) {
            f.b("kakao-adfit-matrix-debug-meta.properties file is malformed.", runtimeException0);
            return null;
        }
        try {
            Properties properties0 = new Properties();
            properties0.load(bufferedInputStream0);
            String s = properties0.getProperty("com.kakao.adfit.matrix.ProguardUuids");
            if(s != null) {
                L.o(s, "property");
                if(s.length() > 0) {
                    L.o(s, "property");
                    list0 = v.V4(s, new String[]{"\\|"}, false, 0, 6, null);
                    goto label_10;
                }
            }
            goto label_12;
        }
        catch(Throwable throwable0) {
            goto label_15;
        }
        try {
        label_10:
            kotlin.io.c.a(bufferedInputStream0, null);
            return list0;
        }
        catch(FileNotFoundException unused_ex) {
            f.a("kakao-adfit-matrix-debug-meta.properties file was not found.");
            return null;
        }
        catch(IOException iOException0) {
            f.b("Error getting Proguard UUIDs.", iOException0);
            return null;
        }
        catch(RuntimeException runtimeException0) {
            f.b("kakao-adfit-matrix-debug-meta.properties file is malformed.", runtimeException0);
            return null;
        }
        try {
        label_12:
            f.a("com.kakao.adfit.matrix.ProguardUuids property was not found or it is invalid.");
            goto label_17;
        }
        catch(Throwable throwable0) {
            try {
            label_15:
                kotlin.io.c.a(bufferedInputStream0, throwable0);
                throw throwable0;
            label_17:
                kotlin.io.c.a(bufferedInputStream0, null);
                return null;
            }
            catch(FileNotFoundException unused_ex) {
            }
            catch(IOException iOException0) {
                f.b("Error getting Proguard UUIDs.", iOException0);
                return null;
            }
            catch(RuntimeException runtimeException0) {
                f.b("kakao-adfit-matrix-debug-meta.properties file is malformed.", runtimeException0);
                return null;
            }
        }
        f.a("kakao-adfit-matrix-debug-meta.properties file was not found.");
        return null;
    }

    private final com.kakao.adfit.i.k c() {
        String s2;
        String s = com.kakao.adfit.m.w.d();
        String s1 = com.kakao.adfit.m.w.a();
        try {
            Object object0 = ((Map)this.b.get()).get("kernelVersion");
            if(!(object0 instanceof String)) {
                object0 = null;
            }
            s2 = (String)object0;
        }
        catch(Exception exception0) {
            f.b(("Error getting kernelVersion" + '.'), exception0);
            s2 = null;
        }
        try {
            Object object1 = ((Map)this.b.get()).get("rooted");
            if(!(object1 instanceof Boolean)) {
                object1 = null;
            }
            return new com.kakao.adfit.i.k("Android", s, s1, s2, ((Boolean)object1));
        }
        catch(Exception exception1) {
            f.b(("Error getting rooted" + '.'), exception1);
            return new com.kakao.adfit.i.k("Android", s, s1, s2, null);
        }
    }

    private final Map c(Context context0) {
        String s3;
        String s2;
        L.o("com.dcinside.app.android", "packageName");
        PackageInfo packageInfo0 = x.a(context0, "com.dcinside.app.android", 0, 4, null);
        String s = x.a(context0);
        String s1 = "unknown";
        if(packageInfo0 == null) {
            s2 = "unknown";
        }
        else {
            s2 = x.c(packageInfo0);
            if(s2 == null) {
                s2 = "unknown";
            }
        }
        if(packageInfo0 == null) {
            s3 = "unknown";
        }
        else {
            s3 = x.b(packageInfo0);
            if(s3 == null) {
                s3 = "unknown";
            }
        }
        if(packageInfo0 != null) {
            String s4 = x.a(packageInfo0);
            if(s4 != null) {
                s1 = s4;
            }
        }
        Map map0 = new HashMap();
        map0.put("service_id", "com.dcinside.app.android");
        map0.put("service_app", s + ' ' + s2 + '_' + s3);
        map0.put("service_target_sdk_version", s1);
        return map0;
    }

    private final q d() {
        try {
            Object object0 = ((Map)this.b.get()).get("androidId");
            if(!(object0 instanceof String)) {
                object0 = null;
            }
            String s = (String)object0;
            return s == null ? null : new q(s);
        }
        catch(Exception exception0) {
            f.b(("Error getting androidId" + '.'), exception0);
            return null;
        }
    }

    private final Map e() {
        Map map0 = new HashMap();
        List list0 = this.b(this.a);
        if(list0 != null) {
            map0.put("proguardUuids", list0);
        }
        map0.put("rooted", Boolean.valueOf(z.c(this.a)));
        map0.put("androidId", B.a.c(this.a));
        map0.put("kernelVersion", "4.14.295-g84b42e6a786c-ab9578266");
        map0.put("emulator", Boolean.valueOf(k.n()));
        return map0;
    }
}

