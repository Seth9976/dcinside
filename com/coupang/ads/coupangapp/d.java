package com.coupang.ads.coupangapp;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.D;
import kotlin.E;
import kotlin.e0;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    public static final String A = "version";
    @l
    public static final String B = "request_id";
    @l
    public static final String C = "unknown";
    @l
    private final Context a;
    @l
    private final D b;
    private final String c;
    @l
    private final String d;
    @l
    private final String e;
    private final String f;
    @l
    private final String g;
    private final Uri h;
    private boolean i;
    @m
    private volatile f j;
    @l
    private final Callable k;
    @l
    public static final a l = null;
    @l
    public static final String m = "AdTokenRequester";
    @l
    public static final String n = "content://com.coupang.mobile.offsite/";
    @l
    public static final String o = "name";
    @l
    public static final String p = "appVersion";
    @l
    public static final String q = "packageName";
    @l
    public static final String r = "com.coupang.mobile";
    @l
    public static final String s = "com.coupang.mobile.domain.advertising.offsite.AdService";
    @l
    public static final String t = "com.coupang.mobile.domain.advertising.offsite.AdActivity";
    @l
    public static final String u = "coupang://offsite";
    @l
    public static final String v = "token";
    @l
    public static final String w = "created_time";
    @l
    public static final String x = "ttl";
    @l
    public static final String y = "code";
    @l
    public static final String z = "message";

    static {
        d.l = new a(null);
    }

    public d(@l Context context0) {
        static final class b extends N implements A3.a {
            public static final b e;

            static {
                b.e = new b();
            }

            b() {
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }

            @l
            public final ThreadPoolExecutor invoke() {
                ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(1, 0x7FFFFFFF, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(), (Runnable runnable0) -> new Thread(runnable0, "f-coupang-exe"));
                threadPoolExecutor0.allowCoreThreadTimeOut(true);
                return threadPoolExecutor0;
            }

            // 检测为 Lambda 实现
            private static final Thread invoke$lambda-0(Runnable runnable0) [...]
        }

        L.p(context0, "context");
        Object object0;
        String s2;
        super();
        this.a = context0;
        this.b = E.a(b.e);
        String s = "com.dcinside.app.android";
        String s1 = "unknown";
        if(e0.e("com.dcinside.app.android") != null) {
            s = "unknown";
        }
        try {
            this.c = "com.dcinside.app.android";
            s2 = e0.b(this.k().getPackageManager().getApplicationLabel(this.k().getPackageManager().getApplicationInfo(s, 0)).toString());
        }
        catch(Throwable throwable0) {
            s2 = e0.b(f0.a(throwable0));
        }
        if(e0.e(s2) != null) {
            s2 = "unknown";
        }
        try {
            this.d = s2;
            this.e = "1.3.0";
            object0 = e0.b(this.k().getPackageManager().getPackageInfo(this.c, 0).versionName);
        }
        catch(Throwable throwable1) {
            object0 = e0.b(f0.a(throwable1));
        }
        if(e0.e(object0) == null) {
            s1 = object0;
        }
        this.f = s1;
        String s3 = "APP(" + s1 + ")SDK(FULL-" + this.e + ')';
        this.g = s3;
        Uri.Builder uri$Builder0 = Uri.parse("content://com.coupang.mobile.offsite/").buildUpon();
        uri$Builder0.appendQueryParameter("name", this.d);
        uri$Builder0.appendQueryParameter("packageName", this.c);
        this.h = uri$Builder0.appendQueryParameter("appVersion", s3).build();
        this.i = true;
        this.k = () -> {
            L.p(this, "this$0");
            f f0 = this.j();
            if(f0 == null) {
                this.n();
                f0 = this.j();
            }
            if(f0 == null) {
                f0 = null;
            }
            else {
                this.j = f0;
            }
            if(f0 == null) {
                throw new Exception("get Token from Coupang App failed");
            }
            return f0;
        };
    }

    @l
    public final Object d(@m Executor executor0) {
        Object object3;
        e0 e00;
        Object object1;
        com.coupang.ads.clog.b b0 = com.coupang.ads.clog.b.a;
        b0.a("AdTokenRequester", "getAdToken called");
        long v = SystemClock.elapsedRealtime();
        f f0 = this.j;
        Object object0 = null;
        if(f0 == null) {
            e00 = null;
        }
        else {
            if(!f0.q()) {
                f0 = null;
            }
            if(f0 == null) {
                e00 = null;
            }
            else {
                b0.a("AdTokenRequester", "getAdToken called local memory token is valid ");
                FutureTask futureTask0 = new FutureTask(this.k);
                if(executor0 == null) {
                    executor0 = this.l();
                }
                executor0.execute(futureTask0);
                try {
                    object1 = e0.b(((f)futureTask0.get(200L, TimeUnit.MILLISECONDS)));
                }
                catch(Throwable throwable0) {
                    object1 = e0.b(f0.a(throwable0));
                }
                if(e0.i(object1)) {
                    object1 = null;
                }
                f f1 = (f)object1;
                if(f1 == null) {
                    f1 = null;
                }
                else {
                    com.coupang.ads.clog.b.a.a("AdTokenRequester", "getAdToken query fast use new token ");
                }
                if(f1 == null) {
                    com.coupang.ads.clog.b.a.a("AdTokenRequester", "getAdToken query time out use local memory");
                }
                else {
                    f0 = f1;
                }
                e00 = e0.a(f0);
            }
        }
        if(e00 == null) {
            try {
                Object object2 = this.k.call();
                f f2 = (f)object2;
                com.coupang.ads.clog.b.a.a("AdTokenRequester", "getAdToken query token with no valid memory token");
                object3 = e0.b(((f)object2));
            }
            catch(Throwable throwable1) {
                object3 = e0.b(f0.a(throwable1));
            }
        }
        else {
            object3 = e00.l();
        }
        com.coupang.ads.clog.b b1 = com.coupang.ads.clog.b.a;
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("getAdToken cost(");
        stringBuilder0.append(SystemClock.elapsedRealtime() - v);
        stringBuilder0.append(" token:(");
        if(!e0.i(object3)) {
            object0 = object3;
        }
        stringBuilder0.append(object0);
        stringBuilder0.append("))");
        b1.a("AdTokenRequester", stringBuilder0.toString());
        return object3;
    }

    public static Object e(d d0, Executor executor0, int v, Object object0) {
        if((v & 1) != 0) {
            executor0 = null;
        }
        return d0.d(executor0);
    }

    public final void f(@m Executor executor0, @l Function1 function10) {
        L.p(function10, "callback");
        if(L.g(Looper.myLooper(), Looper.getMainLooper())) {
            Handler handler0 = new Handler(Looper.getMainLooper());
            Executor executor1 = executor0 == null ? this.l() : executor0;
            executor1.execute(() -> {
                L.p(this, "this$0");
                L.p(handler0, "$mainHandler");
                L.p(function10, "$callback");
                handler0.post(() -> {
                    L.p(function10, "$callback");
                    function10.invoke(e0.a(d0.d(executor0)));
                });
            });
            return;
        }
        function10.invoke(e0.a(this.d(executor0)));
    }

    public static void g(d d0, Executor executor0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            executor0 = null;
        }
        d0.f(executor0, function10);
    }

    // 检测为 Lambda 实现
    private static final void h(d d0, Executor executor0, Handler handler0, Function1 function10) [...]

    // 检测为 Lambda 实现
    private static final void i(Function1 function10, Object object0) [...]

    private final f j() {
        f f0;
        com.coupang.ads.clog.b b0 = com.coupang.ads.clog.b.a;
        b0.a("AdTokenRequester", "try getToken from content provider");
        Cursor cursor0 = this.a.getContentResolver().query(this.h, null, null, null, null);
        if(cursor0 == null) {
            f0 = null;
        }
        else {
            cursor0.moveToFirst();
            String s = cursor0.getString(cursor0.getColumnIndex("token"));
            long v = cursor0.getLong(cursor0.getColumnIndex("created_time"));
            long v1 = cursor0.getLong(cursor0.getColumnIndex("ttl"));
            String s1 = cursor0.getString(cursor0.getColumnIndex("request_id"));
            int v2 = cursor0.getInt(cursor0.getColumnIndex("code"));
            String s2 = cursor0.getString(cursor0.getColumnIndex("message"));
            String s3 = cursor0.getString(cursor0.getColumnIndex("version"));
            b0.i("AdTokenRequester", "query complete " + s + ' ' + v + ' ' + v1 + ' ' + s1 + ' ' + v2 + ' ' + s2 + ' ' + s3);
            cursor0.close();
            L.o(s2, "message");
            L.o(s3, "version");
            f0 = new f(s, v, v1, s1, v2, s2, s3);
            this.i = true;
        }
        if(f0 == null) {
            b0.n("AdTokenRequester", "getToken from content provider failed will null result");
        }
        return f0;
    }

    @l
    public final Context k() {
        return this.a;
    }

    private final ThreadPoolExecutor l() {
        return (ThreadPoolExecutor)this.b.getValue();
    }

    // 检测为 Lambda 实现
    private static final f m(d d0) [...]

    private final void n() {
        com.coupang.ads.clog.b.a.a("AdTokenRequester", "try wakeupCoupangApp");
        try {
            Intent intent0 = new Intent();
            intent0.setClassName("com.coupang.mobile", "com.coupang.mobile.domain.advertising.offsite.AdActivity");
            intent0.setFlags(0x10000000);
            this.k().startActivity(intent0);
        }
        catch(Throwable throwable0) {
            f0.a(throwable0);
        }
    }
}

