package com.vungle.ads.internal.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;
import android.telephony.TelephonyManager;
import androidx.core.util.Consumer;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.tasks.Task;
import com.vungle.ads.internal.executor.i;
import com.vungle.ads.internal.util.p;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;
import y4.m;

public final class c implements d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final String getCarrierName$vungle_ads_release(@l Context context0) {
            L.p(context0, "context");
            Object object0 = context0.getSystemService("phone");
            L.n(object0, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            return ((TelephonyManager)object0).getNetworkOperatorName();
        }
    }

    @l
    public static final a Companion = null;
    @l
    private static final String TAG = "AndroidPlatform";
    @m
    private com.vungle.ads.internal.model.c advertisingInfo;
    @m
    private String appSetId;
    @m
    private Integer appSetIdScope;
    @l
    private final AudioManager audioManager;
    @l
    private final Context context;
    private final boolean isSideLoaded;
    @l
    private final PowerManager powerManager;
    @l
    private final i uaExecutor;
    @m
    private String userAgent;

    static {
        c.Companion = new a(null);
    }

    public c(@l Context context0, @l i i0) {
        L.p(context0, "context");
        L.p(i0, "uaExecutor");
        super();
        this.context = context0;
        this.uaExecutor = i0;
        this.updateAppSetID();
        Object object0 = context0.getSystemService("power");
        L.n(object0, "null cannot be cast to non-null type android.os.PowerManager");
        this.powerManager = (PowerManager)object0;
        Object object1 = context0.getSystemService("audio");
        L.n(object1, "null cannot be cast to non-null type android.media.AudioManager");
        this.audioManager = (AudioManager)object1;
    }

    @Override  // com.vungle.ads.internal.platform.d
    @l
    public com.vungle.ads.internal.model.c getAdvertisingInfo() {
        com.vungle.ads.internal.model.c c0 = this.advertisingInfo;
        if(c0 != null) {
            String s = c0.getAdvertisingId();
            if(s != null && s.length() != 0) {
                return c0;
            }
        }
        com.vungle.ads.internal.model.c c1 = v.O1(Build.MANUFACTURER, "Amazon", true) ? this.getAmazonAdvertisingInfo() : this.getGoogleAdvertisingInfo();
        this.advertisingInfo = c1;
        return c1;
    }

    private final com.vungle.ads.internal.model.c getAmazonAdvertisingInfo() {
        com.vungle.ads.internal.model.c c0 = new com.vungle.ads.internal.model.c();
        try {
            ContentResolver contentResolver0 = this.context.getContentResolver();
            c0.setLimitAdTracking(Settings.Secure.getInt(contentResolver0, "limit_ad_tracking") == 1);
            c0.setAdvertisingId(Settings.Secure.getString(contentResolver0, "advertising_id"));
        }
        catch(Settings.SettingNotFoundException settings$SettingNotFoundException0) {
            p.Companion.w("AndroidPlatform", "Error getting Amazon advertising info: Setting not found.", settings$SettingNotFoundException0);
        }
        catch(Exception exception0) {
            p.Companion.w("AndroidPlatform", "Error getting Amazon advertising info", exception0);
        }
        return c0;
    }

    @Override  // com.vungle.ads.internal.platform.d
    @m
    public String getAppSetId() {
        return this.appSetId;
    }

    @Override  // com.vungle.ads.internal.platform.d
    @m
    public Integer getAppSetIdScope() {
        return this.appSetIdScope;
    }

    @Override  // com.vungle.ads.internal.platform.d
    @l
    public String getCarrierName() {
        String s = c.Companion.getCarrierName$vungle_ads_release(this.context);
        L.o(s, "getCarrierName(context)");
        return s;
    }

    private final com.vungle.ads.internal.model.c getGoogleAdvertisingInfo() {
        com.vungle.ads.internal.model.c c0 = new com.vungle.ads.internal.model.c();
        try {
            Info advertisingIdClient$Info0 = AdvertisingIdClient.getAdvertisingIdInfo(this.context);
            L.o(advertisingIdClient$Info0, "getAdvertisingIdInfo(context)");
            c0.setAdvertisingId(advertisingIdClient$Info0.getId());
            c0.setLimitAdTracking(advertisingIdClient$Info0.isLimitAdTrackingEnabled());
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            p.Companion.e("AndroidPlatform", "Play services Not available: " + noClassDefFoundError0.getLocalizedMessage());
            c0.setAdvertisingId(Settings.Secure.getString(this.context.getContentResolver(), "advertising_id"));
        }
        catch(GooglePlayServicesNotAvailableException googlePlayServicesNotAvailableException0) {
            p.Companion.e("AndroidPlatform", "Play services Not available: " + googlePlayServicesNotAvailableException0.getLocalizedMessage());
        }
        catch(Exception exception0) {
            p.Companion.e("AndroidPlatform", "Error getting Google advertising info: " + exception0.getLocalizedMessage());
        }
        return c0;
    }

    // 去混淆评级： 低(30)
    @Override  // com.vungle.ads.internal.platform.d
    @m
    public String getUserAgent() {
        return this.userAgent == null ? "Dalvik/2.1.0 (Linux; U; Android 13; Pixel 4a Build/TQ2A.230405.003)" : this.userAgent;
    }

    @Override  // com.vungle.ads.internal.platform.d
    public void getUserAgentLazy(@l Consumer consumer0) {
        L.p(consumer0, "consumer");
        com.vungle.ads.internal.platform.a a0 = () -> {
            L.p(this, "this$0");
            L.p(consumer0, "$consumer");
            new e(this.context).getUserAgent(consumer0);
        };
        this.uaExecutor.execute(a0);
    }

    // 检测为 Lambda 实现
    private static final void getUserAgentLazy$lambda-0(c c0, Consumer consumer0) [...]

    @Override  // com.vungle.ads.internal.platform.d
    public float getVolumeLevel() {
        try {
            float f = (float)this.audioManager.getStreamMaxVolume(3);
            return ((float)this.audioManager.getStreamVolume(3)) / f;
        }
        catch(Exception unused_ex) {
            return 0.0f;
        }
    }

    @Override  // com.vungle.ads.internal.platform.d
    public boolean isBatterySaverEnabled() {
        return this.powerManager.isPowerSaveMode();
    }

    @Override  // com.vungle.ads.internal.platform.d
    public boolean isSdCardPresent() {
        try {
            return L.g(Environment.getExternalStorageState(), "mounted");
        }
        catch(Exception exception0) {
            p.Companion.e("AndroidPlatform", "Acquiring external storage state failed", exception0);
            return false;
        }
    }

    @Override  // com.vungle.ads.internal.platform.d
    public boolean isSideLoaded() {
        return this.isSideLoaded;
    }

    @Override  // com.vungle.ads.internal.platform.d
    public boolean isSilentModeEnabled() {
        try {
            switch(this.audioManager.getRingerMode()) {
                case 0: 
                case 1: {
                    break;
                }
                default: {
                    return false;
                }
            }
            return true;
        }
        catch(Exception unused_ex) {
            return false;
        }
    }

    @Override  // com.vungle.ads.internal.platform.d
    public boolean isSoundEnabled() {
        try {
            if(this.audioManager.getStreamVolume(3) <= 0) {
                return false;
            }
        }
        catch(Exception unused_ex) {
        }
        return true;
    }

    public void setUserAgent(@m String s) {
        this.userAgent = s;
    }

    private final void updateAppSetID() {
        if(this.appSetId != null && this.appSetId.length() != 0) {
            return;
        }
        try {
            AppSetIdClient appSetIdClient0 = AppSet.getClient(this.context);
            L.o(appSetIdClient0, "getClient(context)");
            Task task0 = appSetIdClient0.getAppSetIdInfo();
            L.o(task0, "client.appSetIdInfo");
            task0.addOnSuccessListener((AppSetIdInfo appSetIdInfo0) -> {
                L.p(this, "this$0");
                if(appSetIdInfo0 != null) {
                    this.appSetId = appSetIdInfo0.getId();
                    this.appSetIdScope = appSetIdInfo0.getScope();
                }
            });
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            p.Companion.e("AndroidPlatform", "Required libs to get AppSetID Not available: " + noClassDefFoundError0.getLocalizedMessage());
        }
        catch(Exception exception0) {
            p.Companion.e("AndroidPlatform", "Error getting AppSetID: " + exception0.getLocalizedMessage());
        }
    }

    // 检测为 Lambda 实现
    private static final void updateAppSetID$lambda-2(c c0, AppSetIdInfo appSetIdInfo0) [...]
}

