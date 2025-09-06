package com.gomfactory.adpie.sdk;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.core.content.ContextCompat;
import com.coupang.ads.token.AdTokenRequester;
import com.coupang.ads.token.AdTokenResponse;
import com.coupang.ads.token.Result;
import com.gomfactory.adpie.sdk.common.AdRequest;
import com.gomfactory.adpie.sdk.common.Configuration;
import com.gomfactory.adpie.sdk.id.GAID;
import com.gomfactory.adpie.sdk.id.OnGAIDListener;
import com.gomfactory.adpie.sdk.network.NetworkServiceManager;
import com.gomfactory.adpie.sdk.pref.Preference;
import com.gomfactory.adpie.sdk.util.AdPieLog;
import com.gomfactory.adpie.sdk.util.ClickThroughUtil;
import com.gomfactory.adpie.sdk.util.DisplayUtil;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONObject;

public class AdPieSDK {
    public interface OnInitializedListener {
        void onCompleted(boolean arg1);
    }

    public static final String TAG = "AdPieSDK";
    private static Configuration configuration;
    private AdRequest mAdRequest;
    private String mAppID;
    private String mCacheDir;
    private AdRequest mCommonHeader;
    private Context mContext;
    private OnInitializedListener mInitializedListener;
    private boolean mIsInitialized;
    private String mUserAgent;
    private static AdPieSDK ourInstance;

    static {
        AdPieSDK.configuration = new Configuration();
        AdPieSDK.ourInstance = new AdPieSDK();
    }

    private AdPieSDK() {
        AdPieLog.d("AdPieSDK", "AdPieSDK instance is created.");
    }

    public void addTargetBrowser(String s) {
        ClickThroughUtil.addTargetBrowser(s);
    }

    private void checkLogging() {
        try {
            if(Preference.getBooleanValue(this.mContext, "LOG_ENABLE", false)) {
                AdPieSDK.configuration.setAdpieSdkLog(true);
                AdPieLog.setLogEnable(true);
                AdPieLog.setLogLevel(3);
            }
        }
        catch(Exception unused_ex) {
        }
    }

    public boolean checkPermission(String s) {
        try {
            if(this.mContext.checkCallingOrSelfPermission(s) == 0) {
                return true;
            }
        }
        catch(Exception exception0) {
            AdPieLog.e("AdPieSDK", exception0);
        }
        return false;
    }

    public void clearTargetBrowser() {
        ClickThroughUtil.clearTargetBrowser();
    }

    public String getAppId() {
        return this.mAppID;
    }

    public String getCacheDir() {
        return this.mCacheDir;
    }

    public AdRequest getCommonHeader() {
        int v;
        if(this.mCommonHeader == null) {
            AdRequest adRequest0 = new AdRequest();
            this.mCommonHeader = adRequest0;
            try {
                adRequest0.setDeviceType("2");
                this.mCommonHeader.setOsType("1");
                this.mCommonHeader.setSdkVersion("1.14.1");
                this.mCommonHeader.setOsVersion(Build.VERSION.RELEASE);
                this.mCommonHeader.setAvailableVideo(true);
                v = 0;
            }
            catch(Exception exception0) {
                goto label_95;
            }
            try {
                PackageInfo packageInfo0 = this.mContext.getPackageManager().getPackageInfo("com.dcinside.app.android", 0);
                this.mCommonHeader.setAppPackageName(packageInfo0.packageName);
                this.mCommonHeader.setAppVersionName(packageInfo0.versionName);
                if(this.getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.d("AdPieSDK", "packageName:" + packageInfo0.packageName);
                    AdPieLog.d("AdPieSDK", "versionName:" + packageInfo0.versionName);
                    AdPieLog.d("AdPieSDK", "versionCode:" + packageInfo0.versionCode);
                }
                goto label_24;
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            }
            catch(Exception exception1) {
                goto label_22;
            }
            try {
                if(this.getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.e("AdPieSDK", packageManager$NameNotFoundException0);
                    goto label_24;
                label_22:
                    if(this.getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.e("AdPieSDK", exception1);
                    }
                }
            }
            catch(Exception exception0) {
                goto label_95;
            }
            try {
            label_24:
                this.mCommonHeader.setUserAgent("Dalvik/2.1.0 (Linux; U; Android 13; Pixel 4a Build/TQ2A.230405.003)");
                goto label_29;
            }
            catch(Exception exception2) {
                try {
                    if(this.getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.e("AdPieSDK", exception2);
                    }
                label_29:
                    String s = Build.MANUFACTURER;
                    this.mCommonHeader.setManufacturer(s);
                    String s1 = Build.MODEL;
                    this.mCommonHeader.setModel(s1);
                    if(this.getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.d("AdPieSDK", "BRAND:" + Build.BRAND);
                        AdPieLog.d("AdPieSDK", "MANUFACTURER:" + s);
                        AdPieLog.d("AdPieSDK", "MODEL:" + s1);
                    }
                }
                catch(Exception exception0) {
                    goto label_95;
                }
            }
            try {
                TelephonyManager telephonyManager0 = (TelephonyManager)this.mContext.getSystemService("phone");
                if(this.getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.d("AdPieSDK", "operationName:" + telephonyManager0.getNetworkOperatorName());
                }
                this.mCommonHeader.setServiceProvider(telephonyManager0.getNetworkOperatorName());
                if(this.getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.d("AdPieSDK", "getNETWORKCountryIso:" + telephonyManager0.getNetworkCountryIso());
                    AdPieLog.d("AdPieSDK", "getSimCountryIso:" + telephonyManager0.getSimCountryIso());
                }
                this.mCommonHeader.setCountryCode(telephonyManager0.getNetworkCountryIso());
                goto label_49;
            }
            catch(Exception exception3) {
            }
            try {
                if(this.getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.e("AdPieSDK", exception3);
                }
            }
            catch(Exception exception0) {
                goto label_95;
            }
            try {
            label_49:
                Context context0 = this.mContext;
                if(context0 != null) {
                    String s2 = (Build.VERSION.SDK_INT < 24 ? context0.getResources().getConfiguration().locale : context0.getResources().getConfiguration().getLocales().get(0)).getLanguage();
                    if(TextUtils.isEmpty(s2)) {
                        s2 = Locale.getDefault().getLanguage();
                    }
                    this.mCommonHeader.setLanguage(s2);
                }
                goto label_59;
            }
            catch(Exception exception4) {
            }
            try {
                if(this.getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.e("AdPieSDK", exception4);
                }
            }
            catch(Exception exception0) {
                goto label_95;
            }
            try {
            label_59:
                Context context1 = this.mContext;
                if(context1 != null) {
                    int v1 = DisplayUtil.getDeviceWidth(context1);
                    int v2 = DisplayUtil.getDeviceHeight(this.mContext);
                    if(v1 > 0 && v2 > 0) {
                        this.mCommonHeader.setDeviceWidth(v1);
                        this.mCommonHeader.setDeviceHeight(v2);
                    }
                }
            }
            catch(Exception exception5) {
                try {
                    if(this.getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.e("AdPieSDK", exception5);
                    }
                }
                catch(Exception exception0) {
                    goto label_95;
                }
            }
            try {
                Class class0 = InAppBrowser.class;
                if(this.getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.d("AdPieSDK", "InAppBrowser Name : " + class0.getName());
                }
                ActivityInfo[] arr_activityInfo = this.mContext.getPackageManager().getPackageInfo("com.dcinside.app.android", 1).activities;
                if(arr_activityInfo != null && arr_activityInfo.length > 0) {
                    while(true) {
                    label_75:
                        if(v >= arr_activityInfo.length) {
                            break;
                        }
                        ActivityInfo activityInfo0 = arr_activityInfo[v];
                        if(this.getConfiguration().isAdpieSdkLog()) {
                            AdPieLog.d("AdPieSDK", "Activity Name:" + activityInfo0.name);
                        }
                        if(activityInfo0.name.contains(class0.getName())) {
                            if(this.getConfiguration().isAdpieSdkLog()) {
                                AdPieLog.d("AdPieSDK", "Available InAppBrowser!");
                            }
                            this.mCommonHeader.setAvailableInAppBrowser(true);
                        }
                        ++v;
                    }
                }
                return this.mCommonHeader;
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException1) {
            }
            catch(Exception exception6) {
                goto label_91;
            }
            try {
                if(!this.getConfiguration().isAdpieSdkLog()) {
                    return this.mCommonHeader;
                }
                AdPieLog.e("AdPieSDK", packageManager$NameNotFoundException1);
                return this.mCommonHeader;
            label_91:
                if(!this.getConfiguration().isAdpieSdkLog()) {
                    return this.mCommonHeader;
                }
                AdPieLog.e("AdPieSDK", exception6);
                return this.mCommonHeader;
            }
            catch(Exception exception0) {
            }
        label_95:
            if(!this.getConfiguration().isAdpieSdkLog()) {
                return this.mCommonHeader;
            }
            AdPieLog.e("AdPieSDK", exception0);
            if(true) {
                return this.mCommonHeader;
            }
            goto label_75;
        }
        return this.mCommonHeader;
    }

    public Configuration getConfiguration() {
        return AdPieSDK.configuration;
    }

    public static AdPieSDK getInstance() {
        return AdPieSDK.ourInstance;
    }

    private int getNetworkClass(int v) {
        switch(v) {
            case 1: 
            case 2: 
            case 4: 
            case 7: 
            case 11: 
            case 16: {
                return 1;
            }
            case 3: 
            case 5: 
            case 6: 
            case 8: 
            case 9: 
            case 10: 
            case 12: 
            case 14: 
            case 15: 
            case 17: {
                return 2;
            }
            case 13: 
            case 18: 
            case 19: {
                return 3;
            }
            case 20: {
                return 4;
            }
            default: {
                return 0;
            }
        }
    }

    public int getNetworkConnectionType() {
        ConnectivityManager connectivityManager0;
        try {
            if(this.mContext == null) {
                return 0;
            }
            if(!this.checkPermission("android.permission.INTERNET")) {
                AdPieLog.d("AdPieSDK", "android.permission.INTERNET permission must be added in AndroidManifest.xml!");
                return 0;
            }
            if(!this.checkPermission("android.permission.ACCESS_NETWORK_STATE")) {
                AdPieLog.d("AdPieSDK", "android.permission.ACCESS_NETWORK_STATE permission must be added in AndroidManifest.xml!");
                return 0;
            }
            connectivityManager0 = (ConnectivityManager)this.mContext.getSystemService("connectivity");
            int v = Build.VERSION.SDK_INT;
            if(v > 28) {
                NetworkCapabilities networkCapabilities0 = connectivityManager0.getNetworkCapabilities(connectivityManager0.getActiveNetwork());
                if(networkCapabilities0 == null) {
                    return 0;
                }
                if(networkCapabilities0.hasTransport(1)) {
                    this.getCommonHeader().setConnectionType(2);
                    return 2;
                }
                if(!networkCapabilities0.hasTransport(0)) {
                    return 0;
                }
                goto label_18;
            }
            goto label_36;
        }
        catch(Exception exception0) {
            goto label_59;
        }
        try {
        label_18:
            if(v >= 30 && ContextCompat.checkSelfPermission(this.mContext, "android.permission.READ_PHONE_STATE") != 0) {
                this.getCommonHeader().setConnectionType(3);
                return 3;
            }
            switch(this.getNetworkClass(((TelephonyManager)this.mContext.getSystemService("phone")).getNetworkType())) {
                case 1: {
                    this.getCommonHeader().setConnectionType(4);
                    return 4;
                }
                case 2: {
                    this.getCommonHeader().setConnectionType(5);
                    return 5;
                }
                case 3: {
                    this.getCommonHeader().setConnectionType(6);
                    return 6;
                }
                case 4: {
                    this.getCommonHeader().setConnectionType(7);
                    return 7;
                }
                default: {
                    goto label_34;
                }
            }
        }
        catch(Exception exception1) {
        }
        try {
            if(this.getConfiguration().isAdpieSdkLog()) {
                AdPieLog.e("AdPieSDK", exception1);
            }
        label_34:
            this.getCommonHeader().setConnectionType(3);
            return 3;
        label_36:
            NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
            if(networkInfo0 == null || !networkInfo0.isConnected()) {
                return 0;
            }
            switch(networkInfo0.getType()) {
                case 0: {
                    break;
                }
                case 1: {
                    goto label_56;
                }
                default: {
                    return 0;
                }
            }
        }
        catch(Exception exception0) {
            goto label_59;
        }
        try {
            switch(this.getNetworkClass(((TelephonyManager)this.mContext.getSystemService("phone")).getNetworkType())) {
                case 1: {
                    this.getCommonHeader().setConnectionType(4);
                    return 4;
                }
                case 2: {
                    this.getCommonHeader().setConnectionType(5);
                    return 5;
                }
                case 3: {
                    this.getCommonHeader().setConnectionType(6);
                    return 6;
                }
                case 4: {
                    this.getCommonHeader().setConnectionType(7);
                    return 7;
                }
                default: {
                    goto label_54;
                }
            }
        }
        catch(Exception exception2) {
        }
        try {
            if(this.getConfiguration().isAdpieSdkLog()) {
                AdPieLog.e("AdPieSDK", exception2);
            }
        label_54:
            this.getCommonHeader().setConnectionType(3);
            return 3;
        label_56:
            this.getCommonHeader().setConnectionType(2);
            return 2;
        }
        catch(Exception exception0) {
        }
    label_59:
        if(this.getConfiguration().isAdpieSdkLog()) {
            AdPieLog.e("AdPieSDK", exception0);
        }
        return 0;
    }

    private AdRequest getRequest(boolean z) {
        if(this.mAdRequest == null) {
            this.mAdRequest = (AdRequest)this.getCommonHeader().clone();
        }
        try {
            String s = Preference.getStringValue(this.mContext, "CONFIG_URL", "");
            if(TextUtils.isEmpty(s) || z) {
                this.mAdRequest.setRequestURL("https://adp.adpies.com/adp/config", true);
            }
            else {
                this.mAdRequest.setRequestURL(s, true);
            }
        }
        catch(Exception unused_ex) {
            this.mAdRequest.setRequestURL("https://adp.adpies.com/adp/config", true);
        }
        this.mAdRequest.setAppID(this.getAppId());
        try {
            String s1 = Preference.getStringValue(this.mContext, "CONFIG_ACCESS_DATE:" + this.mAppID, "");
            this.mAdRequest.setAccessDate(s1);
        }
        catch(Exception unused_ex) {
        }
        return this.mAdRequest;
    }

    public String getUserAgent() {
        if(TextUtils.isEmpty(this.mUserAgent)) {
            try {
                if(Looper.myLooper() != Looper.getMainLooper()) {
                    return "Dalvik/2.1.0 (Linux; U; Android 13; Pixel 4a Build/TQ2A.230405.003)";
                }
                this.mUserAgent = WebSettings.getDefaultUserAgent(this.mContext);
                return this.mUserAgent;
            }
            catch(Exception exception0) {
                AdPieLog.e("AdPieSDK", exception0);
            }
        }
        return this.mUserAgent;

        class com.gomfactory.adpie.sdk.AdPieSDK.3 implements Runnable {
            @Override
            public void run() {
                WebView webView0 = new WebView(AdPieSDK.this.mContext);
                String s = webView0.getSettings().getUserAgentString();
                AdPieSDK.this.mUserAgent = s;
                webView0.destroy();
            }
        }

    }

    public String getVersion() {
        return "1.14.1";
    }

    public void initialize(Context context0, String s) {
        synchronized(this) {
            AdPieLog.d("AdPieSDK", "AdPie SDK is starting initialization.");
            if(context0 == null) {
                AdPieLog.e("AdPieSDK", new Exception("Context cannot be null."));
                OnInitializedListener adPieSDK$OnInitializedListener0 = this.mInitializedListener;
                if(adPieSDK$OnInitializedListener0 != null) {
                    adPieSDK$OnInitializedListener0.onCompleted(false);
                }
                return;
            }
            if(TextUtils.isEmpty(s)) {
                AdPieLog.e("AdPieSDK", new Exception("Media ID cannot be null."));
                OnInitializedListener adPieSDK$OnInitializedListener1 = this.mInitializedListener;
                if(adPieSDK$OnInitializedListener1 != null) {
                    adPieSDK$OnInitializedListener1.onCompleted(false);
                }
                return;
            }
            this.mContext = context0;
            this.mAppID = s;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    AdPieSDK.this.checkLogging();
                    AdPieSDK.this.getCommonHeader();
                    com.gomfactory.adpie.sdk.AdPieSDK.1.1 adPieSDK$1$10 = new OnGAIDListener() {
                        @Override  // com.gomfactory.adpie.sdk.id.OnGAIDListener
                        public void onCompleted(String s, boolean z) {
                            AdPieLog.d("AdPieSDK", "AdPie SDK got advertising id : " + s);
                            AdPieSDK.this.getCommonHeader().setUdid(s);
                            AdPieSDK.this.getCommonHeader().setUdidType("1");
                            if(z) {
                                AdPieSDK.this.getCommonHeader().setDoNotTracking("1");
                            }
                            else {
                                AdPieSDK.this.getCommonHeader().setDoNotTracking("0");
                            }
                            AdPieSDK.this.mIsInitialized = true;
                            AdPieLog.d("AdPieSDK", "AdPie SDK initialization is completed.");
                            AdPieSDK.this.requestConfigData(false);
                            if(AdPieSDK.this.mInitializedListener != null) {
                                AdPieSDK.this.mInitializedListener.onCompleted(true);
                            }
                        }

                        @Override  // com.gomfactory.adpie.sdk.id.OnGAIDListener
                        public void onFailed() {
                            AdPieSDK.this.getCommonHeader().setUdid("");
                            AdPieSDK.this.getCommonHeader().setUdidType("0");
                            AdPieSDK.this.getCommonHeader().setDoNotTracking("0");
                            AdPieSDK.this.mIsInitialized = true;
                            AdPieLog.d("AdPieSDK", "AdPie SDK initialization is completed.");
                            AdPieSDK.this.requestConfigData(false);
                            if(AdPieSDK.this.mInitializedListener != null) {
                                AdPieSDK.this.mInitializedListener.onCompleted(true);
                            }
                        }
                    };
                    String s = AdPieSDK.this.mContext.getCacheDir().getAbsolutePath();
                    AdPieSDK.this.mCacheDir = s;
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        @Override
                        public void run() {
                            GAID.getInstance().getAdvertisingId(AdPieSDK.this.mContext, adPieSDK$1$10);
                            if(Build.VERSION.SDK_INT >= 23) {
                                try {
                                    new AdTokenRequester(AdPieSDK.this.mContext).getAdTokenInCallback(null, new Function1() {
                                        @Override  // kotlin.jvm.functions.Function1
                                        public Object invoke(Object object0) {
                                            return this.invoke(((Result)object0));
                                        }

                                        public S0 invoke(Result result0) {
                                            AdTokenResponse adTokenResponse0 = (AdTokenResponse)result0.getOrNull();
                                            String s = adTokenResponse0 == null ? null : adTokenResponse0.getToken();
                                            Throwable throwable0 = result0.exceptionOrNull();
                                            if(s != null && !s.isEmpty()) {
                                                AdPieSDK.this.getCommonHeader().setCoupangAdToken(s);
                                                Log.i("adToken", "get Coupang Ad Token success : " + s);
                                                return null;
                                            }
                                            if(throwable0 != null) {
                                                Log.e("adToken", "get Coupang Ad Token failed", throwable0);
                                                return null;
                                            }
                                            Log.e("adToken", "get Coupang Ad Token failed");
                                            return null;
                                        }
                                    });
                                }
                                catch(Exception exception0) {
                                    AdPieLog.e("AdPieSDK", exception0);
                                }
                            }
                        }
                    });
                }
            }).start();
        }
    }

    public void initialize(Context context0, String s, OnInitializedListener adPieSDK$OnInitializedListener0) {
        synchronized(this) {
            this.mInitializedListener = adPieSDK$OnInitializedListener0;
            this.initialize(context0, s);
        }
    }

    public void initialize(Context context0, String s, JSONObject jSONObject0) {
        synchronized(this) {
            if(jSONObject0 != null) {
                boolean z = jSONObject0.optBoolean("adpie_server_log", false);
                String s1 = jSONObject0.optString("adpie_config_url", "https://adp.adpies.com/adp/config");
                String s2 = jSONObject0.optString("adpie_ssp_url", "https://ssp.adpies.com/ssp/request");
                AdPieSDK.configuration.setAdpieServerLog(z);
                AdPieSDK.configuration.setAdpieConfigUrl(s1);
                AdPieSDK.configuration.setAdpieSspUrl(s2);
                this.mContext = context0;
                try {
                    Preference.putString(context0, "CONFIG_URL", s1);
                    Preference.putString(this.mContext, "SSP_URL", s2);
                }
                catch(Exception exception0) {
                    if(this.getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.e("AdPieSDK", exception0);
                    }
                }
            }
            this.initialize(context0, s);
        }
    }

    public boolean isInitialized() {
        return this.mIsInitialized;
    }

    private void requestConfigData(boolean z) {
        try {
            SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyyMMdd");
            String s = simpleDateFormat0.format(new Date(Preference.getLongValue(this.mContext, "CONFIG_UPDATE_TIME:" + this.mAppID, 0L)));
            String s1 = simpleDateFormat0.format(new Date());
            if(this.getConfiguration().isAdpieSdkLog()) {
                AdPieLog.d("AdPieSDK", "updateDate : " + s + ", currentDate : " + s1);
            }
            if(s1.equals(s)) {
                if(this.getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.d("AdPieSDK", "AdPie SDK Configuration was already updated!");
                }
                return;
            }
        }
        catch(Exception unused_ex) {
        }
        int v = this.getNetworkConnectionType();
        if(v == 0) {
            return;
        }
        this.getRequest(z).setConnectionType(v);
        if(this.getConfiguration().isAdpieSdkLog()) {
            AdPieLog.d("AdPieSDK", "AdPie SDK is preparing to send configuration." + (z ? "" : ":)"));
        }
        com.gomfactory.adpie.sdk.AdPieSDK.2 adPieSDK$20 = new Handler(Looper.getMainLooper()) {
            @Override  // android.os.Handler
            public void handleMessage(Message message0) {
                try {
                    int v = message0.what;
                    if(v == 200) {
                        JSONObject jSONObject0 = new JSONObject(((String)message0.obj));
                        if(jSONObject0.optInt("result", -1) == 0) {
                            JSONObject jSONObject1 = jSONObject0.optJSONObject("data");
                            if(jSONObject1 != null) {
                                AdPieSDK.this.updateConfig(jSONObject1);
                                String s = jSONObject1.optString("access_date");
                                Preference.putString(AdPieSDK.this.mContext, "CONFIG_ACCESS_DATE:" + AdPieSDK.this.mAppID, s);
                                return;
                            }
                        }
                        else if(!z) {
                            AdPieSDK.this.requestConfigData(true);
                            return;
                        }
                    }
                    else if(v == -1 && !z) {
                        AdPieSDK.this.requestConfigData(true);
                        return;
                    }
                    return;
                }
                catch(Exception exception0) {
                }
                if(AdPieSDK.this.getConfiguration().isAdpieSdkLog()) {
                    AdPieLog.e("AdPieSDK", exception0);
                }
            }
        };
        NetworkServiceManager.getInstance().post(this.getRequest(z).getRequestURL(), this.getRequest(z).toUri().getEncodedQuery(), adPieSDK$20);
    }

    private void updateConfig(JSONObject jSONObject0) {
        try {
            Preference.putLong(this.mContext, "CONFIG_UPDATE_TIME:" + this.mAppID, new Date().getTime());
            int v = 0;
            boolean z = jSONObject0.optInt("ssp_enable", 1) != 0;
            String s = jSONObject0.optString("ssp_req_url");
            Preference.putBoolean(this.mContext, "SSP_ENABLE:" + this.mAppID, z);
            Preference.putString(this.mContext, "SSP_URL", s);
            JSONArray jSONArray0 = jSONObject0.optJSONArray("tid");
            String s1 = this.getCommonHeader().getUdid();
            if(jSONArray0 != null && !TextUtils.isEmpty(s1)) {
                int v1 = 0;
                while(v < jSONArray0.length()) {
                    if(jSONArray0.get(v).equals(s1)) {
                        v1 = 1;
                    }
                    ++v;
                }
                v = v1;
            }
            Preference.putBoolean(this.mContext, "LOG_ENABLE", ((boolean)v));
            this.checkLogging();
            return;
        }
        catch(Exception exception0) {
        }
        if(this.getConfiguration().isAdpieSdkLog()) {
            AdPieLog.e("AdPieSDK", exception0);
        }
    }
}

