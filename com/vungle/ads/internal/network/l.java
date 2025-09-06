package com.vungle.ads.internal.network;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.PackageInfoFlags;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.PowerManager;
import android.security.NetworkSecurityPolicy;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.URLUtil;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.PermissionChecker;
import androidx.core.util.Consumer;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.VungleAds;
import com.vungle.ads.Y0;
import com.vungle.ads.a1;
import com.vungle.ads.b1;
import com.vungle.ads.internal.model.f.g;
import com.vungle.ads.internal.model.f.h;
import com.vungle.ads.internal.model.j;
import com.vungle.ads.internal.model.k;
import com.vungle.ads.internal.protos.Sdk.MetricBatch;
import com.vungle.ads.internal.protos.Sdk.SDKError;
import com.vungle.ads.internal.protos.Sdk.SDKErrorBatch;
import com.vungle.ads.internal.protos.Sdk.SDKMetric;
import com.vungle.ads.internal.util.o;
import com.vungle.ads.internal.util.p;
import com.vungle.ads.r;
import j..util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.D;
import kotlin.E;
import kotlin.H;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import kotlinx.serialization.i;
import kotlinx.serialization.json.f;
import kotlinx.serialization.json.s;
import kotlinx.serialization.z;
import okhttp3.HttpUrl;
import okhttp3.Interceptor.Chain;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient.Builder;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody.Companion;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.A;
import okio.Z;
import s3.e;
import y4.m;

public final class l {
    static final class a extends N implements Function1 {
        public static final a INSTANCE;

        static {
            a.INSTANCE = new a();
        }

        a() {
            super(1);
        }

        @Override  // kotlin.jvm.functions.Function1
        public Object invoke(Object object0) {
            this.invoke(((f)object0));
            return S0.a;
        }

        public final void invoke(@y4.l f f0) {
            L.p(f0, "$this$Json");
            f0.w(true);
            f0.u(true);
            f0.v(false);
        }
    }

    public static final class b {
        private b() {
        }

        public b(w w0) {
        }

        @y4.l
        public final String getBASE_URL$vungle_ads_release() {
            return l.BASE_URL;
        }

        public final void reset$vungle_ads_release() {
            n.INSTANCE.reset();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @e(s3.a.a)
    public @interface c {
        public static final class com.vungle.ads.internal.network.l.c.a {
            static final com.vungle.ads.internal.network.l.c.a $$INSTANCE = null;
            @y4.l
            public static final String CDMA_1XRTT = "cdma_1xrtt";
            @y4.l
            public static final String CDMA_EVDO_0 = "cdma_evdo_0";
            @y4.l
            public static final String CDMA_EVDO_A = "cdma_evdo_a";
            @y4.l
            public static final String CDMA_EVDO_B = "cdma_evdo_b";
            @y4.l
            public static final String EDGE = "edge";
            @y4.l
            public static final String FIFTH_G = "5g";
            @y4.l
            public static final String GPRS = "gprs";
            @y4.l
            public static final String HRPD = "hrpd";
            @y4.l
            public static final String HSDPA = "hsdpa";
            @y4.l
            public static final String HSUPA = "hsupa";
            @y4.l
            public static final String LTE = "lte";
            @y4.l
            public static final String UNKNOWN = "unknown";
            @y4.l
            public static final String WCDMA = "wcdma";

            static {
                com.vungle.ads.internal.network.l.c.a.$$INSTANCE = new com.vungle.ads.internal.network.l.c.a();
            }
        }

        @y4.l
        public static final String CDMA_1XRTT = "cdma_1xrtt";
        @y4.l
        public static final String CDMA_EVDO_0 = "cdma_evdo_0";
        @y4.l
        public static final String CDMA_EVDO_A = "cdma_evdo_a";
        @y4.l
        public static final String CDMA_EVDO_B = "cdma_evdo_b";
        @y4.l
        public static final com.vungle.ads.internal.network.l.c.a Companion = null;
        @y4.l
        public static final String EDGE = "edge";
        @y4.l
        public static final String FIFTH_G = "5g";
        @y4.l
        public static final String GPRS = "gprs";
        @y4.l
        public static final String HRPD = "hrpd";
        @y4.l
        public static final String HSDPA = "hsdpa";
        @y4.l
        public static final String HSUPA = "hsupa";
        @y4.l
        public static final String LTE = "lte";
        @y4.l
        public static final String UNKNOWN = "unknown";
        @y4.l
        public static final String WCDMA = "wcdma";

        static {
            c.Companion = com.vungle.ads.internal.network.l.c.a.$$INSTANCE;
        }
    }

    public static final class d implements Interceptor {
        public static final class com.vungle.ads.internal.network.l.d.a {
            private com.vungle.ads.internal.network.l.d.a() {
            }

            public com.vungle.ads.internal.network.l.d.a(w w0) {
            }
        }

        @y4.l
        private static final String CONTENT_ENCODING = "Content-Encoding";
        @y4.l
        public static final com.vungle.ads.internal.network.l.d.a Companion = null;
        @y4.l
        private static final String GZIP = "gzip";

        static {
            d.Companion = new com.vungle.ads.internal.network.l.d.a(null);
        }

        private final RequestBody gzip(RequestBody requestBody0) throws IOException {
            public static final class com.vungle.ads.internal.network.l.d.b extends RequestBody {
                final okio.l $output;
                final RequestBody $requestBody;

                com.vungle.ads.internal.network.l.d.b(RequestBody requestBody0, okio.l l0) {
                    this.$requestBody = requestBody0;
                    this.$output = l0;
                    super();
                }

                @Override  // okhttp3.RequestBody
                public long contentLength() {
                    return this.$output.size();
                }

                @Override  // okhttp3.RequestBody
                @m
                public MediaType contentType() {
                    return this.$requestBody.contentType();
                }

                @Override  // okhttp3.RequestBody
                public void writeTo(@y4.l okio.m m0) throws IOException {
                    L.p(m0, "sink");
                    m0.M1(this.$output.h1());
                }
            }

            okio.l l0 = new okio.l();
            okio.m m0 = Z.d(new A(l0));
            requestBody0.writeTo(m0);
            m0.close();
            return new com.vungle.ads.internal.network.l.d.b(requestBody0, l0);
        }

        @Override  // okhttp3.Interceptor
        @y4.l
        public Response intercept(@y4.l Chain interceptor$Chain0) throws IOException {
            L.p(interceptor$Chain0, "chain");
            Request request0 = interceptor$Chain0.request();
            RequestBody requestBody0 = request0.body();
            return requestBody0 == null || request0.header("Content-Encoding") != null ? interceptor$Chain0.proceed(request0) : interceptor$Chain0.proceed(request0.newBuilder().header("Content-Encoding", "gzip").method(request0.method(), this.gzip(requestBody0)).build());
        }
    }

    @y4.l
    private static final String BASE_URL = null;
    @y4.l
    public static final b Companion = null;
    @y4.l
    private static final String TAG = "VungleApiClient";
    @m
    private com.vungle.ads.internal.model.c advertisingInfo;
    @y4.l
    private VungleApi api;
    @m
    private com.vungle.ads.internal.model.d appBody;
    @y4.l
    private final Context applicationContext;
    @m
    private j baseDeviceInfo;
    @y4.l
    private final com.vungle.ads.internal.persistence.b filePreferences;
    @y4.l
    private VungleApi gzipApi;
    @m
    private Boolean isGooglePlayServicesAvailable;
    @y4.l
    private static final kotlinx.serialization.json.b json;
    @y4.l
    private static final Set logInterceptors;
    @y4.l
    private static final Set networkInterceptors;
    @y4.l
    private final com.vungle.ads.internal.platform.d platform;
    @y4.l
    private Interceptor responseInterceptor;
    @y4.l
    private Map retryAfterDataMap;
    @y4.l
    private final D signalManager$delegate;
    @m
    private String uaString;

    static {
        l.Companion = new b(null);
        l.BASE_URL = "https://config.ads.vungle.com/";
        l.networkInterceptors = new HashSet();
        l.logInterceptors = new HashSet();
        l.json = s.b(null, a.INSTANCE, 1, null);
    }

    public l(@y4.l Context context0, @y4.l com.vungle.ads.internal.platform.d d0, @y4.l com.vungle.ads.internal.persistence.b b0) {
        public static final class com.vungle.ads.internal.network.l.e extends ProxySelector {
            @Override
            public void connectFailed(@m URI uRI0, @m SocketAddress socketAddress0, @m IOException iOException0) {
                try {
                    ProxySelector.getDefault().connectFailed(uRI0, socketAddress0, iOException0);
                }
                catch(Exception unused_ex) {
                }
            }

            @Override
            @y4.l
            public List select(@m URI uRI0) {
                try {
                    List list0 = ProxySelector.getDefault().select(uRI0);
                    L.o(list0, "{\n                      …ri)\n                    }");
                    return list0;
                }
                catch(Exception unused_ex) {
                    return u.k(Proxy.NO_PROXY);
                }
            }
        }


        public static final class com.vungle.ads.internal.network.l.j extends N implements A3.a {
            final Context $context;

            public com.vungle.ads.internal.network.l.j(Context context0) {
                this.$context = context0;
                super(0);
            }

            @Override  // A3.a
            @y4.l
            public final Object invoke() {
                return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.signals.c.class);
            }
        }

        L.p(context0, "applicationContext");
        L.p(d0, "platform");
        L.p(b0, "filePreferences");
        super();
        this.applicationContext = context0;
        this.platform = d0;
        this.filePreferences = b0;
        this.uaString = "Dalvik/2.1.0 (Linux; U; Android 13; Pixel 4a Build/TQ2A.230405.003)";
        com.vungle.ads.internal.network.l.j l$j0 = new com.vungle.ads.internal.network.l.j(context0);
        this.signalManager$delegate = E.c(H.a, l$j0);
        this.retryAfterDataMap = new ConcurrentHashMap();
        this.responseInterceptor = (Chain interceptor$Chain0) -> {
            String s;
            Response response0;
            L.p(this, "this$0");
            L.p(interceptor$Chain0, "chain");
            Request request0 = interceptor$Chain0.request();
            try {
                response0 = interceptor$Chain0.proceed(request0);
                s = response0.headers().get("Retry-After");
                if(s != null && s.length() != 0) {
                    goto label_6;
                }
                return response0;
            }
            catch(OutOfMemoryError unused_ex) {
                p.Companion.e("VungleApiClient", "OOM for " + request0.url());
                return this.defaultErrorResponse(request0);
            }
            catch(Exception exception0) {
                p.Companion.e("VungleApiClient", "Exception: " + exception0.getMessage() + " for " + request0.url());
                return this.defaultErrorResponse(request0);
            }
            try {
            label_6:
                long v = Long.parseLong(s);
                if(v > 0L) {
                    long v1 = System.currentTimeMillis();
                    if(v.N1(request0.url().encodedPath(), "ads", false, 2, null)) {
                        String s1 = this.getPlacementID(request0.body());
                        if(s1.length() > 0) {
                            this.retryAfterDataMap.put(s1, ((long)(v * 1000L + v1)));
                            return response0;
                        }
                    }
                }
                return response0;
            }
            catch(Exception unused_ex) {
                try {
                    p.Companion.d("VungleApiClient", "Retry-After value is not an valid value");
                    return response0;
                }
                catch(OutOfMemoryError unused_ex) {
                    p.Companion.e("VungleApiClient", "OOM for " + request0.url());
                    return this.defaultErrorResponse(request0);
                }
                catch(Exception exception0) {
                }
                p.Companion.e("VungleApiClient", "Exception: " + exception0.getMessage() + " for " + request0.url());
                return this.defaultErrorResponse(request0);
            }
            catch(OutOfMemoryError unused_ex) {
                p.Companion.e("VungleApiClient", "OOM for " + request0.url());
                return this.defaultErrorResponse(request0);
            }
        };
        Builder okHttpClient$Builder0 = new Builder();
        TimeUnit timeUnit0 = TimeUnit.SECONDS;
        Builder okHttpClient$Builder1 = okHttpClient$Builder0.readTimeout(60L, timeUnit0).connectTimeout(60L, timeUnit0).addInterceptor(this.responseInterceptor).proxySelector(new com.vungle.ads.internal.network.l.e());
        OkHttpClient okHttpClient0 = okHttpClient$Builder1.build();
        OkHttpClient okHttpClient1 = okHttpClient$Builder1.addInterceptor(new d()).build();
        this.api = new com.vungle.ads.internal.network.m(okHttpClient0);
        this.gzipApi = new com.vungle.ads.internal.network.m(okHttpClient1);
    }

    @VisibleForTesting
    public final void addPlaySvcAvailabilityInCookie(boolean z) {
        this.filePreferences.put("isPlaySvcAvailable", z).apply();
    }

    private final String bodyToString(RequestBody requestBody0) {
        try {
            okio.l l0 = new okio.l();
            if(requestBody0 != null) {
                requestBody0.writeTo(l0);
                return "";
            }
        }
        catch(Exception unused_ex) {
        }
        return "";
    }

    public final boolean checkIsRetryAfterActive(@y4.l String s) {
        L.p(s, "placementID");
        Long long0 = (Long)this.retryAfterDataMap.get(s);
        if((long0 == null ? 0L : ((long)long0)) > System.currentTimeMillis()) {
            return true;
        }
        this.retryAfterDataMap.remove(s);
        return false;
    }

    @m
    public final com.vungle.ads.internal.network.a config() throws IOException {
        com.vungle.ads.internal.model.d d0 = this.appBody;
        if(d0 == null) {
            return null;
        }
        com.vungle.ads.internal.model.f f0 = new com.vungle.ads.internal.model.f(this.getDeviceBody$vungle_ads_release(true), d0, l.getUserBody$default(this, false, 1, null), null, null, 24, null);
        h f$h0 = l.getExtBody$default(this, false, 1, null);
        if(f$h0 != null) {
            f0.setExt(f$h0);
        }
        com.vungle.ads.internal.util.h.INSTANCE.isValidUrl("https://config.ads.vungle.com/");
        v.N1("https://config.ads.vungle.com/", "/", false, 2, null);
        return this.api.config(n.INSTANCE.getHeaderUa(), "https://config.ads.vungle.com/config", f0);
    }

    private final Response defaultErrorResponse(Request request0) {
        okhttp3.Response.Builder response$Builder0 = new okhttp3.Response.Builder().request(request0).code(500).protocol(Protocol.HTTP_1_1).message("Server is busy");
        MediaType mediaType0 = MediaType.Companion.parse("application/json; charset=utf-8");
        return response$Builder0.body(ResponseBody.Companion.create("{\"Error\":\"Server is busy\"}", mediaType0)).build();
    }

    @m
    public final com.vungle.ads.internal.model.d getAppBody$vungle_ads_release() {
        return this.appBody;
    }

    @VisibleForTesting
    public static void getAppBody$vungle_ads_release$annotations() {
    }

    private final j getBasicDeviceBody(Context context0) {
        DisplayMetrics displayMetrics0 = new DisplayMetrics();
        Object object0 = context0.getSystemService("window");
        L.n(object0, "null cannot be cast to non-null type android.view.WindowManager");
        Display display0 = ((WindowManager)object0).getDefaultDisplay();
        if(display0 != null) {
            display0.getMetrics(displayMetrics0);
        }
        String s = Build.MANUFACTURER;
        L.o(s, "MANUFACTURER");
        String s1 = Build.MODEL;
        L.o(s1, "MODEL");
        String s2 = Build.VERSION.RELEASE;
        L.o(s2, "RELEASE");
        j j0 = new j(s, s1, s2, com.vungle.ads.internal.platform.c.Companion.getCarrierName$vungle_ads_release(context0), (L.g("Amazon", s) ? "amazon" : "android"), displayMetrics0.widthPixels, displayMetrics0.heightPixels, this.uaString, null, null, null, 0x700, null);
        try {
            String s3 = this.platform.getUserAgent();
            this.uaString = s3;
            j0.setUa(s3);
            this.initUserAgentLazy();
            this.advertisingInfo = this.advertisingInfo == null ? this.platform.getAdvertisingInfo() : this.advertisingInfo;
            return j0;
        }
        catch(Exception exception0) {
        }
        p.Companion.e("VungleApiClient", "Cannot Get UserAgent. Setting Default Device UserAgent." + exception0.getLocalizedMessage());
        return j0;
    }

    private final String getConnectionType() {
        if(PermissionChecker.a(this.applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            Object object0 = this.applicationContext.getSystemService("connectivity");
            L.n(object0, "null cannot be cast to non-null type android.net.ConnectivityManager");
            NetworkInfo networkInfo0 = ((ConnectivityManager)object0).getActiveNetworkInfo();
            if(networkInfo0 != null) {
                switch(networkInfo0.getType()) {
                    case 0: {
                        return "MOBILE";
                    }
                    case 1: 
                    case 6: {
                        return "WIFI";
                    }
                    case 7: {
                        return "BLUETOOTH";
                    }
                    case 9: {
                        return "ETHERNET";
                    }
                    default: {
                        return "UNKNOWN";
                    }
                }
            }
            return "NONE";
        }
        return null;
    }

    @y4.l
    public final String getConnectionTypeDetail(int v) {
        switch(v) {
            case 1: {
                return "gprs";
            }
            case 2: {
                return "edge";
            }
            case 4: {
                return "wcdma";
            }
            case 5: {
                return "cdma_evdo_0";
            }
            case 6: {
                return "cdma_evdo_a";
            }
            case 7: {
                return "cdma_1xrtt";
            }
            case 8: {
                return "hsdpa";
            }
            case 9: {
                return "hsupa";
            }
            case 12: {
                return "cdma_evdo_b";
            }
            case 13: {
                return "lte";
            }
            case 14: {
                return "hrpd";
            }
            case 20: {
                return "5g";
            }
            default: {
                return "unknown";
            }
        }
    }

    @m
    public final String getConnectionTypeDetail$vungle_ads_release() {
        if(PermissionChecker.a(this.applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            Object object0 = this.applicationContext.getSystemService("connectivity");
            L.n(object0, "null cannot be cast to non-null type android.net.ConnectivityManager");
            NetworkInfo networkInfo0 = ((ConnectivityManager)object0).getActiveNetworkInfo();
            return networkInfo0 == null ? "unknown" : this.getConnectionTypeDetail(networkInfo0.getSubtype());
        }
        return null;
    }

    private final j getDeviceBody() throws IllegalStateException {
        return this.getDeviceBody$vungle_ads_release(false);
    }

    @VisibleForTesting
    @y4.l
    public final j getDeviceBody$vungle_ads_release(boolean z) throws IllegalStateException {
        String s2;
        com.vungle.ads.internal.model.j.c j$c1;
        synchronized(this) {
            j j0 = this.baseDeviceInfo;
            if(j0 == null) {
                j0 = this.getBasicDeviceBody(this.applicationContext);
                this.baseDeviceInfo = j0;
            }
            j j1 = j.copy$default(j0, null, null, null, null, null, 0, 0, null, null, null, null, 0x7FF, null);
            com.vungle.ads.internal.model.j.c j$c0 = new com.vungle.ads.internal.model.j.c(false, null, null, 0.0f, null, 0, null, null, null, null, null, 0.0f, 0, false, 0, false, null, null, 0x3FFFF, null);
            com.vungle.ads.internal.model.c c0 = this.advertisingInfo == null ? this.platform.getAdvertisingInfo() : this.advertisingInfo;
            this.advertisingInfo = c0;
            String s = c0 == null ? null : c0.getAdvertisingId();
            Boolean boolean0 = this.advertisingInfo == null ? null : Boolean.valueOf(this.advertisingInfo.getLimitAdTracking());
            V2.c c1 = V2.c.INSTANCE;
            if(!c1.shouldSendAdIds()) {
                j$c1 = j$c0;
            }
            else if(s != null) {
                if(L.g("Amazon", Build.MANUFACTURER)) {
                    j$c1 = j$c0;
                    j$c1.setAmazonAdvertisingId(s);
                }
                else {
                    j$c1 = j$c0;
                    j$c1.setGaid(s);
                }
                j1.setIfa(s);
            }
            else {
                j$c1 = j$c0;
                j1.setIfa("");
            }
            if(z || !c1.shouldSendAdIds()) {
                j1.setIfa(null);
                j$c1.setGaid(null);
                j$c1.setAmazonAdvertisingId(null);
            }
            boolean z1 = false;
            j1.setLmt((L.g(boolean0, Boolean.TRUE) ? 1 : 0));
            Boolean boolean1 = this.isGooglePlayServicesAvailable();
            j$c1.setGooglePlayServicesAvailable(L.g(Boolean.TRUE, boolean1));
            if(c1.allowDeviceIDFromTCF() != V2.c.a.DISABLE_ID) {
                String s1 = this.platform.getAppSetId();
                if(s1 != null) {
                    j$c1.setAppSetId(s1);
                }
                Integer integer0 = this.platform.getAppSetIdScope();
                if(integer0 != null) {
                    j$c1.setAppSetIdScope(integer0.intValue());
                }
            }
            IntentFilter intentFilter0 = new IntentFilter("android.intent.action.BATTERY_CHANGED");
            Intent intent0 = this.applicationContext.registerReceiver(null, intentFilter0);
            if(intent0 == null) {
                s2 = "UNKNOWN";
            }
            else {
                int v1 = intent0.getIntExtra("level", -1);
                int v2 = intent0.getIntExtra("scale", -1);
                if(v1 > 0 && v2 > 0) {
                    j$c1.setBatteryLevel(((float)v1) / ((float)v2));
                }
            alab1:
                switch(intent0.getIntExtra("status", -1)) {
                    case -1: {
                        s2 = "UNKNOWN";
                        break;
                    }
                    case 2: 
                    case 5: {
                        switch(intent0.getIntExtra("plugged", -1)) {
                            case 1: {
                                s2 = "BATTERY_PLUGGED_AC";
                                break alab1;
                            }
                            case 2: {
                                s2 = "BATTERY_PLUGGED_USB";
                                break alab1;
                            }
                            case 4: {
                                s2 = "BATTERY_PLUGGED_WIRELESS";
                                break alab1;
                            }
                            default: {
                                s2 = "BATTERY_PLUGGED_OTHERS";
                                break alab1;
                            }
                        }
                    }
                    default: {
                        s2 = "NOT_CHARGING";
                    }
                }
            }
            j$c1.setBatteryState(s2);
            Object object0 = this.applicationContext.getSystemService("power");
            L.n(object0, "null cannot be cast to non-null type android.os.PowerManager");
            int v3 = Build.VERSION.SDK_INT;
            j$c1.setBatterySaverEnabled(((int)((PowerManager)object0).isPowerSaveMode()));
            String s3 = this.getConnectionType();
            if(s3 != null) {
                j$c1.setConnectionType(s3);
            }
            String s4 = this.getConnectionTypeDetail$vungle_ads_release();
            if(s4 != null) {
                j$c1.setConnectionTypeDetail(s4);
            }
            j$c1.setLocale(Locale.getDefault().toString());
            j$c1.setLanguage(Locale.getDefault().getLanguage());
            j$c1.setTimeZone("Asia/Shanghai");
            j$c1.setVolumeLevel(this.platform.getVolumeLevel());
            j$c1.setSoundEnabled(((int)this.platform.isSoundEnabled()));
            if(L.g("Amazon", Build.MANUFACTURER)) {
                z1 = this.applicationContext.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
            }
            else if(v3 >= 23) {
                Object object1 = this.applicationContext.getSystemService("uimode");
                L.n(object1, "null cannot be cast to non-null type android.app.UiModeManager");
                if(((UiModeManager)object1).getCurrentModeType() == 4) {
                    z1 = true;
                }
            }
            else if(this.applicationContext.getPackageManager().hasSystemFeature("com.google.android.tv") || !this.applicationContext.getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                z1 = true;
            }
            j$c1.setTv(z1);
            j$c1.setSideloadEnabled(this.platform.isSideLoaded());
            j$c1.setSdCardAvailable(((int)this.platform.isSdCardPresent()));
            j1.setUa(this.uaString);
            j1.setExt(j$c1);
            return j1;
        }
    }

    private final h getExtBody(boolean z) {
        String s = this.filePreferences.getString("config_extension");
        if(!z) {
            return s == null || s.length() == 0 ? null : new h(s, null, -1L);
        }
        try {
            String s1 = this.getSignalManager().generateSignals();
            return (s == null || s.length() == 0) && (s1 == null || s1.length() == 0) ? null : new h(s, s1, -1L);
        }
        catch(Exception exception0) {
            p.Companion.e("VungleApiClient", "Couldn\'t convert signals for sending. Error: " + exception0.getMessage());
            return s == null || s.length() == 0 ? null : new h(s, null, -1L);
        }
    }

    static h getExtBody$default(l l0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        return l0.getExtBody(z);
    }

    @y4.l
    public final VungleApi getGzipApi$vungle_ads_release() {
        return this.gzipApi;
    }

    @VisibleForTesting
    public static void getGzipApi$vungle_ads_release$annotations() {
    }

    private final String getPlacementID(RequestBody requestBody0) {
        try {
            String s = this.bodyToString(requestBody0);
            i i0 = z.k(l.json.a(), m0.A(com.vungle.ads.internal.model.f.class));
            L.n(i0, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            com.vungle.ads.internal.model.f.i f$i0 = ((com.vungle.ads.internal.model.f)l.json.d(i0, s)).getRequest();
            if(f$i0 != null) {
                List list0 = f$i0.getPlacements();
                if(list0 != null) {
                    String s1 = (String)list0.get(0);
                    return s1 == null ? "" : s1;
                }
            }
        }
        catch(Exception unused_ex) {
        }
        return "";
    }

    @VisibleForTesting
    @m
    public final Boolean getPlayServicesAvailabilityFromAPI() {
        Boolean boolean0 = null;
        try {
            GoogleApiAvailabilityLight googleApiAvailabilityLight0 = GoogleApiAvailabilityLight.getInstance();
            L.o(googleApiAvailabilityLight0, "getInstance()");
            boolean z = googleApiAvailabilityLight0.isGooglePlayServicesAvailable(this.applicationContext) == 0;
            boolean0 = Boolean.valueOf(z);
            this.addPlaySvcAvailabilityInCookie(z);
            return boolean0;
        }
        catch(NoClassDefFoundError unused_ex) {
            p.Companion.w("VungleApiClient", "Play services Not available");
            try {
                this.addPlaySvcAvailabilityInCookie(false);
            }
            catch(Exception unused_ex) {
                p.Companion.w("VungleApiClient", "Failure to write GPS availability to DB");
            }
            return false;
        }
        catch(Exception unused_ex) {
            p.Companion.w("VungleApiClient", "Unexpected exception from Play services lib.");
            return boolean0;
        }
    }

    @VisibleForTesting
    @m
    public final Boolean getPlayServicesAvailabilityFromCookie() {
        return this.filePreferences.getBoolean("isPlaySvcAvailable");
    }

    @y4.l
    public final Interceptor getResponseInterceptor$vungle_ads_release() {
        return this.responseInterceptor;
    }

    @VisibleForTesting
    public static void getResponseInterceptor$vungle_ads_release$annotations() {
    }

    @y4.l
    public final Map getRetryAfterDataMap$vungle_ads_release() {
        return this.retryAfterDataMap;
    }

    @VisibleForTesting
    public static void getRetryAfterDataMap$vungle_ads_release$annotations() {
    }

    public final long getRetryAfterHeaderValue(@y4.l String s) {
        L.p(s, "placementID");
        Long long0 = (Long)this.retryAfterDataMap.get(s);
        return long0 == null ? 0L : ((long)long0);
    }

    private final com.vungle.ads.internal.signals.c getSignalManager() {
        return (com.vungle.ads.internal.signals.c)this.signalManager$delegate.getValue();
    }

    private final com.vungle.ads.internal.model.f.j getUserBody(boolean z) {
        com.vungle.ads.internal.model.f.j f$j0 = new com.vungle.ads.internal.model.f.j(null, null, null, null, null, 0x1F, null);
        V2.c c0 = V2.c.INSTANCE;
        f$j0.setGdpr(new com.vungle.ads.internal.model.f.f("unknown", "no_interaction", 0L, ""));
        f$j0.setCcpa(new com.vungle.ads.internal.model.f.c("opted_in"));
        if(c0.getCoppaStatus() != V2.a.COPPA_NOTSET) {
            f$j0.setCoppa(new com.vungle.ads.internal.model.f.d(c0.getCoppaStatus().getValue()));
        }
        if(c0.shouldSendTCFString()) {
            f$j0.setIab(new g(""));
        }
        if(z) {
            f$j0.setFpd(VungleAds.firstPartyData);
        }
        return f$j0;
    }

    static com.vungle.ads.internal.model.f.j getUserBody$default(l l0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        return l0.getUserBody(z);
    }

    private final void initUserAgentLazy() {
        public static final class com.vungle.ads.internal.network.l.f implements Consumer {
            final Y0 $uaMetric;

            com.vungle.ads.internal.network.l.f(Y0 y00, l l0) {
                this.$uaMetric = y00;
                l.this = l0;
                super();
            }

            @Override  // androidx.core.util.Consumer
            public void accept(Object object0) {
                this.accept(((String)object0));
            }

            public void accept(@m String s) {
                if(s == null) {
                    p.Companion.e("VungleApiClient", "Cannot Get UserAgent. Setting Default Device UserAgent");
                    new a1().logErrorNoReturnValue$vungle_ads_release();
                    return;
                }
                this.$uaMetric.markEnd();
                r.logMetric$vungle_ads_release$default(r.INSTANCE, this.$uaMetric, null, null, 6, null);
                l.this.uaString = s;
            }
        }

        Y0 y00 = new Y0(com.vungle.ads.internal.protos.Sdk.SDKMetric.b.USER_AGENT_LOAD_DURATION_MS);
        y00.markStart();
        com.vungle.ads.internal.network.l.f l$f0 = new com.vungle.ads.internal.network.l.f(y00, this);
        this.platform.getUserAgentLazy(l$f0);
    }

    public final void initialize(@y4.l String s) {
        synchronized(this) {
            L.p(s, "appId");
            this.api.setAppId(s);
            this.gzipApi.setAppId(s);
            String s1 = "1.0";
            try {
                PackageInfo packageInfo0 = Build.VERSION.SDK_INT >= 33 ? this.applicationContext.getPackageManager().getPackageInfo("com.dcinside.app.android", PackageManager.PackageInfoFlags.of(0L)) : this.applicationContext.getPackageManager().getPackageInfo("com.dcinside.app.android", 0);
                L.o(packageInfo0, "{\n                    ap…      )\n                }");
                String s2 = packageInfo0.versionName;
                L.o(s2, "packageInfo.versionName");
                s1 = s2;
            }
            catch(Exception unused_ex) {
            }
            this.baseDeviceInfo = this.getBasicDeviceBody(this.applicationContext);
            L.o("com.dcinside.app.android", "applicationContext.packageName");
            this.appBody = new com.vungle.ads.internal.model.d("com.dcinside.app.android", s1, s);
            this.isGooglePlayServicesAvailable = this.getPlayServicesAvailabilityFromAPI();
        }
    }

    @VisibleForTesting
    @m
    public final Boolean isGooglePlayServicesAvailable() {
        if(this.isGooglePlayServicesAvailable == null) {
            this.isGooglePlayServicesAvailable = this.getPlayServicesAvailabilityFromCookie();
        }
        if(this.isGooglePlayServicesAvailable == null) {
            this.isGooglePlayServicesAvailable = this.getPlayServicesAvailabilityFromAPI();
        }
        return this.isGooglePlayServicesAvailable;
    }

    @m
    public final k pingTPAT(@y4.l String s, @m Map map0, @m String s1, @y4.l com.vungle.ads.internal.network.d d0, @m o o0) {
        Integer integer0;
        RequestBody requestBody0;
        boolean z;
        int v;
        String s2;
        L.p(s, "url");
        L.p(d0, "requestType");
        if(s.length() == 0 || HttpUrl.Companion.parse(s) == null) {
            return new k(com.vungle.ads.internal.protos.Sdk.SDKError.b.TPAT_ERROR, "Invalid URL : " + s, true);
        }
        try {
            s2 = new URL(s).getHost();
            v = Build.VERSION.SDK_INT;
        }
        catch(MalformedURLException malformedURLException0) {
            com.vungle.ads.internal.protos.Sdk.SDKError.b sdk$SDKError$b0 = com.vungle.ads.internal.protos.Sdk.SDKError.b.TPAT_ERROR;
            String s3 = malformedURLException0.getLocalizedMessage();
            if(s3 == null) {
                s3 = "MalformedURLException";
            }
            return new k(sdk$SDKError$b0, s3, true);
        }
        if(v >= 24) {
            z = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(s2);
        }
        else {
            z = v < 23 ? true : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        }
        if(!z && URLUtil.isHttpUrl(s)) {
            return new k(com.vungle.ads.internal.protos.Sdk.SDKError.b.TPAT_ERROR, "Clear Text Traffic is blocked", false, 4, null);
        }
        try {
            String s4 = this.uaString == null ? "" : this.uaString;
            String s5 = null;
            if(s1 == null) {
                requestBody0 = null;
            }
            else {
                MediaType mediaType0 = MediaType.Companion.parse("application/json");
                requestBody0 = RequestBody.Companion.create(s1, mediaType0);
            }
            com.vungle.ads.internal.network.f f0 = this.api.pingTPAT(s4, s, d0, map0, requestBody0).execute();
            if(f0 != null && f0.isSuccessful()) {
                return null;
            }
            if(f0 == null) {
                integer0 = null;
            }
            else {
                Response response0 = f0.raw();
                integer0 = response0 == null ? null : response0.code();
            }
            if(u.W1(u.O(new Integer[]{301, 302, 307, 308}), integer0)) {
                r.logMetric$vungle_ads_release$default(r.INSTANCE, com.vungle.ads.internal.protos.Sdk.SDKMetric.b.NOTIFICATION_REDIRECT, 0L, o0, s, 2, null);
                return null;
            }
            com.vungle.ads.internal.protos.Sdk.SDKError.b sdk$SDKError$b1 = com.vungle.ads.internal.protos.Sdk.SDKError.b.TPAT_ERROR;
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append("Tpat failed with error: ");
            stringBuilder0.append(integer0);
            stringBuilder0.append(", message: ");
            if(f0 != null) {
                s5 = f0.message();
            }
            stringBuilder0.append(s5);
            return new k(sdk$SDKError$b1, stringBuilder0.toString(), false, 4, null);
        }
        catch(Exception exception0) {
            return new k(com.vungle.ads.internal.protos.Sdk.SDKError.b.TPAT_ERROR, (exception0.getLocalizedMessage() == null ? "IOException" : exception0.getLocalizedMessage()), false, 4, null);
        }
    }

    public static k pingTPAT$default(l l0, String s, Map map0, String s1, com.vungle.ads.internal.network.d d0, o o0, int v, Object object0) {
        Map map1 = (v & 2) == 0 ? map0 : null;
        String s2 = (v & 4) == 0 ? s1 : null;
        if((v & 8) != 0) {
            d0 = com.vungle.ads.internal.network.d.GET;
        }
        return (v & 16) == 0 ? l0.pingTPAT(s, map1, s2, d0, o0) : l0.pingTPAT(s, map1, s2, d0, null);
    }

    public final void reportErrors(@y4.l BlockingQueue blockingQueue0, @y4.l com.vungle.ads.r.b r$b0) {
        public static final class com.vungle.ads.internal.network.l.g implements com.vungle.ads.internal.network.b {
            final com.vungle.ads.r.b $requestListener;

            com.vungle.ads.internal.network.l.g(com.vungle.ads.r.b r$b0) {
                this.$requestListener = r$b0;
                super();
            }

            @Override  // com.vungle.ads.internal.network.b
            public void onFailure(@m com.vungle.ads.internal.network.a a0, @m Throwable throwable0) {
                this.$requestListener.onFailure();
            }

            @Override  // com.vungle.ads.internal.network.b
            public void onResponse(@m com.vungle.ads.internal.network.a a0, @m com.vungle.ads.internal.network.f f0) {
                this.$requestListener.onSuccess();
            }
        }

        L.p(blockingQueue0, "errors");
        L.p(r$b0, "requestListener");
        LinkedBlockingQueue linkedBlockingQueue0 = new LinkedBlockingQueue();
        for(Object object0: blockingQueue0) {
            com.vungle.ads.internal.protos.Sdk.SDKError.a sdk$SDKError$a0 = (com.vungle.ads.internal.protos.Sdk.SDKError.a)object0;
            sdk$SDKError$a0.setSessionId(this.getSignalManager().getUuid());
            String s = sdk$SDKError$a0.getPlacementReferenceId();
            com.vungle.ads.internal.model.m m0 = com.vungle.ads.internal.k.INSTANCE.getPlacement(s);
            if(m0 != null) {
                sdk$SDKError$a0.setIsHbPlacement((m0.getHeaderBidding() ? 1L : 0L));
                sdk$SDKError$a0.setPlacementType((m0.getType() == null ? "" : m0.getType()));
            }
            String s1 = this.getConnectionType();
            if(s1 != null) {
                sdk$SDKError$a0.setConnectionType(s1);
            }
            String s2 = this.getConnectionTypeDetail$vungle_ads_release();
            if(s2 != null) {
                sdk$SDKError$a0.setConnectionTypeDetail(s2);
            }
            SDKError sdk$SDKError0 = (SDKError)sdk$SDKError$a0.build();
            p.Companion.e("VungleApiClient", "Sending Error: " + sdk$SDKError0.getReason());
            linkedBlockingQueue0.add(sdk$SDKError0);
        }
        SDKErrorBatch sdk$SDKErrorBatch0 = (SDKErrorBatch)SDKErrorBatch.newBuilder().addAllErrors(linkedBlockingQueue0).build();
        byte[] arr_b = sdk$SDKErrorBatch0.toByteArray();
        L.o(arr_b, "batch.toByteArray()");
        MediaType mediaType0 = MediaType.Companion.parse("application/x-protobuf");
        byte[] arr_b1 = sdk$SDKErrorBatch0.toByteArray();
        RequestBody requestBody0 = RequestBody.Companion.create(arr_b, mediaType0, 0, arr_b1.length);
        this.api.sendErrors(n.INSTANCE.getHeaderUa(), "https://logs.ads.vungle.com/sdk/error_logs", requestBody0).enqueue(new com.vungle.ads.internal.network.l.g(r$b0));
    }

    public final void reportMetrics(@y4.l BlockingQueue blockingQueue0, @y4.l com.vungle.ads.r.b r$b0) {
        public static final class com.vungle.ads.internal.network.l.h implements com.vungle.ads.internal.network.b {
            final com.vungle.ads.r.b $requestListener;

            com.vungle.ads.internal.network.l.h(com.vungle.ads.r.b r$b0) {
                this.$requestListener = r$b0;
                super();
            }

            @Override  // com.vungle.ads.internal.network.b
            public void onFailure(@m com.vungle.ads.internal.network.a a0, @m Throwable throwable0) {
                this.$requestListener.onFailure();
            }

            @Override  // com.vungle.ads.internal.network.b
            public void onResponse(@m com.vungle.ads.internal.network.a a0, @m com.vungle.ads.internal.network.f f0) {
                this.$requestListener.onSuccess();
            }
        }

        L.p(blockingQueue0, "metrics");
        L.p(r$b0, "requestListener");
        LinkedBlockingQueue linkedBlockingQueue0 = new LinkedBlockingQueue();
        for(Object object0: blockingQueue0) {
            com.vungle.ads.internal.protos.Sdk.SDKMetric.a sdk$SDKMetric$a0 = (com.vungle.ads.internal.protos.Sdk.SDKMetric.a)object0;
            sdk$SDKMetric$a0.setSessionId(this.getSignalManager().getUuid());
            String s = sdk$SDKMetric$a0.getPlacementReferenceId();
            com.vungle.ads.internal.model.m m0 = com.vungle.ads.internal.k.INSTANCE.getPlacement(s);
            if(m0 != null) {
                sdk$SDKMetric$a0.setIsHbPlacement((m0.getHeaderBidding() ? 1L : 0L));
                sdk$SDKMetric$a0.setPlacementType((m0.getType() == null ? "" : m0.getType()));
            }
            String s1 = this.getConnectionType();
            if(s1 != null) {
                sdk$SDKMetric$a0.setConnectionType(s1);
            }
            String s2 = this.getConnectionTypeDetail$vungle_ads_release();
            if(s2 != null) {
                sdk$SDKMetric$a0.setConnectionTypeDetail(s2);
            }
            SDKMetric sdk$SDKMetric0 = (SDKMetric)sdk$SDKMetric$a0.build();
            p.Companion.e("VungleApiClient", "Sending Metric: " + sdk$SDKMetric0.getType());
            linkedBlockingQueue0.add(sdk$SDKMetric0);
        }
        MetricBatch sdk$MetricBatch0 = (MetricBatch)MetricBatch.newBuilder().addAllMetrics(linkedBlockingQueue0).build();
        MediaType mediaType0 = MediaType.Companion.parse("application/x-protobuf");
        byte[] arr_b = sdk$MetricBatch0.toByteArray();
        L.o(arr_b, "batch.toByteArray()");
        RequestBody requestBody0 = Companion.create$default(RequestBody.Companion, mediaType0, arr_b, 0, 0, 12, null);
        this.api.sendMetrics(n.INSTANCE.getHeaderUa(), "https://logs.ads.vungle.com/sdk/metrics", requestBody0).enqueue(new com.vungle.ads.internal.network.l.h(r$b0));
    }

    @m
    public final com.vungle.ads.internal.network.a requestAd(@y4.l String s, @m b1 b10) throws IllegalStateException {
        L.p(s, "placement");
        com.vungle.ads.internal.model.f f0 = this.requestBody(true, true);
        com.vungle.ads.internal.model.f.i f$i0 = new com.vungle.ads.internal.model.f.i(u.k(s), null, null, null, null, null, 62, null);
        if(b10 != null) {
            f$i0.setAdSize(new com.vungle.ads.internal.model.f.b(b10.getWidth(), b10.getHeight()));
        }
        f0.setRequest(f$i0);
        return this.gzipApi.ads(n.INSTANCE.getHeaderUa(), "https://adx.ads.vungle.com/api/ads", f0);
    }

    @y4.l
    public final com.vungle.ads.internal.model.f requestBody(boolean z, boolean z1) throws IllegalStateException {
        j j0 = this.getDeviceBody();
        com.vungle.ads.internal.model.f.j f$j0 = this.getUserBody(z1);
        com.vungle.ads.internal.model.f f0 = new com.vungle.ads.internal.model.f(j0, this.appBody, f$j0, null, null, 24, null);
        h f$h0 = this.getExtBody(z);
        if(f$h0 != null) {
            f0.setExt(f$h0);
        }
        return f0;
    }

    public static com.vungle.ads.internal.model.f requestBody$default(l l0, boolean z, boolean z1, int v, Object object0) throws IllegalStateException {
        if((v & 1) != 0) {
            z = false;
        }
        if((v & 2) != 0) {
            z1 = false;
        }
        return l0.requestBody(z, z1);
    }

    // 检测为 Lambda 实现
    private static final Response responseInterceptor$lambda-0(l l0, Chain interceptor$Chain0) [...]

    @m
    public final com.vungle.ads.internal.network.a ri(@y4.l com.vungle.ads.internal.model.f.i f$i0) {
        L.p(f$i0, "request");
        String s = com.vungle.ads.internal.k.INSTANCE.getRiEndpoint();
        if(s != null && s.length() != 0) {
            com.vungle.ads.internal.model.d d0 = this.appBody;
            if(d0 == null) {
                return null;
            }
            com.vungle.ads.internal.model.f f0 = new com.vungle.ads.internal.model.f(this.getDeviceBody(), d0, l.getUserBody$default(this, false, 1, null), null, null, 24, null);
            f0.setRequest(f$i0);
            h f$h0 = l.getExtBody$default(this, false, 1, null);
            if(f$h0 != null) {
                f0.setExt(f$h0);
            }
            return this.api.ri(n.INSTANCE.getHeaderUa(), s, f0);
        }
        return null;
    }

    public final void sendAdMarkup(@y4.l String s, @y4.l String s1) {
        public static final class com.vungle.ads.internal.network.l.i implements com.vungle.ads.internal.network.b {
            @Override  // com.vungle.ads.internal.network.b
            public void onFailure(@m com.vungle.ads.internal.network.a a0, @m Throwable throwable0) {
            }

            @Override  // com.vungle.ads.internal.network.b
            public void onResponse(@m com.vungle.ads.internal.network.a a0, @m com.vungle.ads.internal.network.f f0) {
            }
        }

        L.p(s, "adMarkup");
        L.p(s1, "endpoint");
        VungleApi vungleApi0 = this.api;
        MediaType mediaType0 = MediaType.Companion.parse("application/json");
        vungleApi0.sendAdMarkup(s1, RequestBody.Companion.create(s, mediaType0)).enqueue(new com.vungle.ads.internal.network.l.i());
    }

    public final void setAppBody$vungle_ads_release(@m com.vungle.ads.internal.model.d d0) {
        this.appBody = d0;
    }

    public final void setGzipApi$vungle_ads_release(@y4.l VungleApi vungleApi0) {
        L.p(vungleApi0, "<set-?>");
        this.gzipApi = vungleApi0;
    }

    public final void setResponseInterceptor$vungle_ads_release(@y4.l Interceptor interceptor0) {
        L.p(interceptor0, "<set-?>");
        this.responseInterceptor = interceptor0;
    }

    public final void setRetryAfterDataMap$vungle_ads_release(@y4.l Map map0) {
        L.p(map0, "<set-?>");
        this.retryAfterDataMap = map0;
    }
}

