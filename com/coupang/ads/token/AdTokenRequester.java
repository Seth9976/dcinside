package com.coupang.ads.token;

import A3.a;
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

public final class AdTokenRequester {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final String CONTENT_PROVIDER = "content://com.coupang.mobile.offsite/";
    @l
    public static final String COUPANG_ACTIVITY_CLASS_NAME = "com.coupang.mobile.domain.advertising.offsite.AdActivity";
    @l
    public static final String COUPANG_PACKAGE_NAME = "com.coupang.mobile";
    @l
    public static final String CP_KEY_CODE = "code";
    @l
    public static final String CP_KEY_CREATED_TIME = "created_time";
    @l
    public static final String CP_KEY_MESSAGE = "message";
    @l
    public static final String CP_KEY_REQUEST_ID = "request_id";
    @l
    public static final String CP_KEY_TOKEN = "token";
    @l
    public static final String CP_KEY_TTL = "ttl";
    @l
    public static final String CP_KEY_VERSION = "version";
    @l
    public static final Companion Companion = null;
    @l
    public static final String QUERY_KEY_APP_VERSION = "appVersion";
    @l
    public static final String QUERY_KEY_NAME = "name";
    @l
    public static final String QUERY_KEY_PACKAGE_NAME = "packageName";
    @l
    public static final String TAG = "AdTokenRequester";
    @l
    public static final String UNKNOWN = "unknown";
    private final String appVersion;
    @l
    private final Context context;
    @l
    private final D innerExecutor$delegate;
    @l
    private final String name;
    private final String packageName;
    @l
    private final Callable queryTokenCallable;
    @m
    private volatile AdTokenResponse tokenResponse;
    private final Uri uri;

    static {
        AdTokenRequester.Companion = new Companion(null);
    }

    public AdTokenRequester(@l Context context0) {
        L.p(context0, "context");
        Object object0;
        String s2;
        super();
        this.context = context0;
        String s = "com.dcinside.app.android";
        String s1 = "unknown";
        if(e0.e("com.dcinside.app.android") != null) {
            s = "unknown";
        }
        try {
            this.packageName = "com.dcinside.app.android";
            s2 = e0.b(this.context.getPackageManager().getApplicationLabel(this.context.getPackageManager().getApplicationInfo(s, 0)).toString());
        }
        catch(Throwable throwable0) {
            s2 = e0.b(f0.a(throwable0));
        }
        if(e0.e(s2) != null) {
            s2 = "unknown";
        }
        try {
            this.name = s2;
            object0 = e0.b(this.context.getPackageManager().getPackageInfo(this.packageName, 0).versionName);
        }
        catch(Throwable throwable1) {
            object0 = e0.b(f0.a(throwable1));
        }
        if(e0.e(object0) == null) {
            s1 = object0;
        }
        this.appVersion = s1;
        Uri.Builder uri$Builder0 = Uri.parse("content://com.coupang.mobile.offsite/").buildUpon();
        uri$Builder0.appendQueryParameter("name", this.name);
        uri$Builder0.appendQueryParameter("packageName", this.packageName);
        this.uri = uri$Builder0.appendQueryParameter("appVersion", s1).build();
        this.innerExecutor$delegate = E.a(com.coupang.ads.token.AdTokenRequester.innerExecutor.2.INSTANCE);
        this.queryTokenCallable = () -> {
            L.p(this, "this$0");
            AdTokenResponse adTokenResponse0 = this.getByContentProvider();
            if(adTokenResponse0 == null) {
                this.wakeupCoupangApp();
                adTokenResponse0 = this.getByContentProvider();
            }
            if(adTokenResponse0 == null) {
                throw new Exception("get Token from Coupang App failed");
            }
            this.tokenResponse = adTokenResponse0;
            return adTokenResponse0;
        };

        final class com.coupang.ads.token.AdTokenRequester.innerExecutor.2 extends N implements a {
            public static final com.coupang.ads.token.AdTokenRequester.innerExecutor.2 INSTANCE;

            static {
                com.coupang.ads.token.AdTokenRequester.innerExecutor.2.INSTANCE = new com.coupang.ads.token.AdTokenRequester.innerExecutor.2();
            }

            com.coupang.ads.token.AdTokenRequester.innerExecutor.2() {
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }

            @l
            public final ThreadPoolExecutor invoke() {
                ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(1, 0x7FFFFFFF, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(), (Runnable runnable0) -> new Thread(runnable0, "coupang-exe"));
                threadPoolExecutor0.allowCoreThreadTimeOut(true);
                return threadPoolExecutor0;
            }

            // 检测为 Lambda 实现
            private static final Thread invoke$lambda-0(Runnable runnable0) [...]
        }

    }

    @l
    public final Result getAdToken(@m Executor executor0) {
        Result result0;
        Object object1;
        Object object3;
        Object object0 = null;
        CLog cLog0 = CLog.INSTANCE;
        cLog0.d("AdTokenRequester", "getAdToken called");
        long v = SystemClock.elapsedRealtime();
        AdTokenResponse adTokenResponse0 = this.tokenResponse;
        if(adTokenResponse0 == null) {
            try {
            label_27:
                Object object2 = this.queryTokenCallable.call();
                AdTokenResponse adTokenResponse1 = (AdTokenResponse)object2;
                CLog.INSTANCE.d("AdTokenRequester", "getAdToken query token with no valid memory token");
                object3 = e0.b(((AdTokenResponse)object2));
            }
            catch(Throwable throwable1) {
                object3 = e0.b(f0.a(throwable1));
            }
            result0 = AdResultKt.toLocal(object3);
        }
        else {
            if(!adTokenResponse0.isUnexpired()) {
                adTokenResponse0 = null;
            }
            if(adTokenResponse0 == null) {
                goto label_27;
            }
            else {
                cLog0.d("AdTokenRequester", "getAdToken called local memory token is valid ");
                FutureTask futureTask0 = new FutureTask(this.queryTokenCallable);
                if(executor0 == null) {
                    executor0 = this.getInnerExecutor();
                }
                executor0.execute(futureTask0);
                try {
                    object1 = e0.b(((AdTokenResponse)futureTask0.get(200L, TimeUnit.MILLISECONDS)));
                }
                catch(Throwable throwable0) {
                    object1 = e0.b(f0.a(throwable0));
                }
                if(!e0.i(object1)) {
                    object0 = object1;
                }
                if(((AdTokenResponse)object0) == null) {
                    CLog.INSTANCE.d("AdTokenRequester", "getAdToken query time out use local memory");
                }
                else {
                    CLog.INSTANCE.d("AdTokenRequester", "getAdToken query fast use new token ");
                    adTokenResponse0 = (AdTokenResponse)object0;
                }
                result0 = AdResultKt.toLocal(adTokenResponse0);
                if(result0 == null) {
                    goto label_27;
                }
            }
        }
        CLog.INSTANCE.d("AdTokenRequester", "getAdToken cost(" + (SystemClock.elapsedRealtime() - v) + ") token:(" + result0.getOrNull() + ')');
        return result0;
    }

    public static Result getAdToken$default(AdTokenRequester adTokenRequester0, Executor executor0, int v, Object object0) {
        if((v & 1) != 0) {
            executor0 = null;
        }
        return adTokenRequester0.getAdToken(executor0);
    }

    public final void getAdTokenInCallback(@m Executor executor0, @l Function1 function10) {
        L.p(function10, "callback");
        if(L.g(Looper.myLooper(), Looper.getMainLooper())) {
            Handler handler0 = new Handler(Looper.getMainLooper());
            Executor executor1 = executor0 == null ? this.getInnerExecutor() : executor0;
            executor1.execute(() -> {
                L.p(this, "this$0");
                L.p(handler0, "$mainHandler");
                L.p(function10, "$callback");
                handler0.post(() -> {
                    L.p(function10, "$callback");
                    L.p(adTokenRequester0.getAdToken(executor0), "$token");
                    function10.invoke(adTokenRequester0.getAdToken(executor0));
                });
            });
            return;
        }
        function10.invoke(this.getAdToken(executor0));
    }

    public static void getAdTokenInCallback$default(AdTokenRequester adTokenRequester0, Executor executor0, Function1 function10, int v, Object object0) {
        if((v & 1) != 0) {
            executor0 = null;
        }
        adTokenRequester0.getAdTokenInCallback(executor0, function10);
    }

    // 检测为 Lambda 实现
    private static final void getAdTokenInCallback$lambda-13(AdTokenRequester adTokenRequester0, Executor executor0, Handler handler0, Function1 function10) [...]

    // 检测为 Lambda 实现
    private static final void getAdTokenInCallback$lambda-13$lambda-12(Function1 function10, Result result0) [...]

    private final AdTokenResponse getByContentProvider() {
        AdTokenResponse adTokenResponse0;
        CLog cLog0 = CLog.INSTANCE;
        cLog0.d("AdTokenRequester", "try getToken from content provider");
        Cursor cursor0 = this.context.getContentResolver().query(this.uri, null, null, null, null);
        if(cursor0 == null) {
            adTokenResponse0 = null;
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
            cLog0.i("AdTokenRequester", "query complete " + s + ' ' + v + ' ' + v1 + ' ' + s1 + ' ' + v2 + ' ' + s2 + ' ' + s3);
            cursor0.close();
            L.o(s2, "message");
            L.o(s3, "version");
            adTokenResponse0 = new AdTokenResponse(s, v, v1, s1, v2, s2, s3);
        }
        if(adTokenResponse0 == null) {
            cLog0.w("AdTokenRequester", "getToken from content provider failed will null result");
        }
        return adTokenResponse0;
    }

    private final ThreadPoolExecutor getInnerExecutor() {
        return (ThreadPoolExecutor)this.innerExecutor$delegate.getValue();
    }

    // 检测为 Lambda 实现
    private static final AdTokenResponse queryTokenCallable$lambda-9(AdTokenRequester adTokenRequester0) [...]

    private final void wakeupCoupangApp() {
        CLog.INSTANCE.d("AdTokenRequester", "try wakeupCoupangApp");
        try {
            Intent intent0 = new Intent();
            intent0.setClassName("com.coupang.mobile", "com.coupang.mobile.domain.advertising.offsite.AdActivity");
            intent0.setFlags(0x10000000);
            this.context.startActivity(intent0);
        }
        catch(Throwable throwable0) {
            f0.a(throwable0);
        }
    }
}

