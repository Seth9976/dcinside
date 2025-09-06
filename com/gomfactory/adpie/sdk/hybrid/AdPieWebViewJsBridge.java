package com.gomfactory.adpie.sdk.hybrid;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.core.content.ContextCompat;
import com.gomfactory.adpie.sdk.AdPieSDK;
import com.gomfactory.adpie.sdk.id.GAID;
import com.gomfactory.adpie.sdk.id.OnGAIDListener;
import com.gomfactory.adpie.sdk.pref.Preference;
import com.gomfactory.adpie.sdk.util.AdPieLog;
import com.gomfactory.adpie.sdk.util.DisplayUtil;
import java.util.Locale;

public class AdPieWebViewJsBridge {
    public static final String TAG = "AdPieWebViewJsBridge";
    private String mAppPackageName;
    private String mAppVersionName;
    private Context mContext;
    private String mCountryCode;
    private int mDeviceHeight;
    private int mDeviceWidth;
    private String mGaid;
    private boolean mIsDoNotTracking;
    private String mLanguage;
    private String mManufacturer;
    private String mModel;
    private String mServiceProvider;
    private String mUdid;
    private String mUdidType;
    private static AdPieWebViewJsBridge ourInstance;

    static {
        AdPieWebViewJsBridge.ourInstance = new AdPieWebViewJsBridge();
    }

    public boolean checkPermission(String s) {
        try {
            if(this.mContext.checkCallingOrSelfPermission(s) == 0) {
                return true;
            }
        }
        catch(Exception exception0) {
            AdPieLog.e("AdPieWebViewJsBridge", exception0);
        }
        return false;
    }

    @JavascriptInterface
    public String getAppPackageName() {
        try {
            if(!TextUtils.isEmpty(this.mAppPackageName)) {
                return this.mAppPackageName;
            }
            if(AdPieSDK.getInstance().isInitialized()) {
                this.mAppPackageName = AdPieSDK.getInstance().getCommonHeader().getAppPackageName();
                return this.mAppPackageName;
            }
            Context context0 = this.mContext;
            if(context0 != null) {
                this.mAppPackageName = context0.getPackageManager().getPackageInfo("com.dcinside.app.android", 0).packageName;
            }
        }
        catch(Exception unused_ex) {
        }
        return this.mAppPackageName;
    }

    @JavascriptInterface
    public String getAppVersionName() {
        try {
            if(!TextUtils.isEmpty(this.mAppVersionName)) {
                return this.mAppVersionName;
            }
            if(AdPieSDK.getInstance().isInitialized()) {
                this.mAppVersionName = AdPieSDK.getInstance().getCommonHeader().getAppVersionName();
                return this.mAppVersionName;
            }
            Context context0 = this.mContext;
            if(context0 != null) {
                this.mAppVersionName = context0.getPackageManager().getPackageInfo("com.dcinside.app.android", 0).versionName;
            }
        }
        catch(Exception unused_ex) {
        }
        return this.mAppVersionName;
    }

    private void getAsyncUdid() {
        com.gomfactory.adpie.sdk.hybrid.AdPieWebViewJsBridge.1 adPieWebViewJsBridge$10 = new OnGAIDListener() {
            @Override  // com.gomfactory.adpie.sdk.id.OnGAIDListener
            public void onCompleted(String s, boolean z) {
                AdPieWebViewJsBridge.this.mUdid = s;
                AdPieWebViewJsBridge.this.mGaid = s;
                AdPieWebViewJsBridge.this.mUdidType = "1";
                AdPieWebViewJsBridge.this.mIsDoNotTracking = z;
            }

            @Override  // com.gomfactory.adpie.sdk.id.OnGAIDListener
            public void onFailed() {
                AdPieWebViewJsBridge.this.mUdid = "";
                AdPieWebViewJsBridge.this.mGaid = "";
                AdPieWebViewJsBridge.this.mUdidType = "0";
                AdPieWebViewJsBridge.this.mIsDoNotTracking = false;
            }
        };
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            @Override
            public void run() {
                GAID.getInstance().getAdvertisingId(AdPieWebViewJsBridge.this.mContext, adPieWebViewJsBridge$10);
            }
        });
    }

    // 去混淆评级： 低(20)
    @JavascriptInterface
    public int getConnectionType() {
        return AdPieSDK.getInstance().isInitialized() ? AdPieSDK.getInstance().getCommonHeader().getConnectionType() : this.getNetworkConnectionType();
    }

    @JavascriptInterface
    public String getCountryCode() {
        try {
            if(!TextUtils.isEmpty(this.mCountryCode)) {
                return this.mCountryCode;
            }
            if(AdPieSDK.getInstance().isInitialized()) {
                this.mCountryCode = AdPieSDK.getInstance().getCommonHeader().getCountryCode();
                return this.mCountryCode;
            }
            Context context0 = this.mContext;
            if(context0 != null) {
                this.mCountryCode = ((TelephonyManager)context0.getSystemService("phone")).getNetworkCountryIso();
            }
        }
        catch(Exception unused_ex) {
        }
        return this.mCountryCode;
    }

    @JavascriptInterface
    public int getDeviceHeight() {
        try {
            int v = this.mDeviceHeight;
            if(v > 0) {
                return v;
            }
            Context context0 = this.mContext;
            if(context0 != null) {
                this.mDeviceHeight = DisplayUtil.getDeviceHeight(context0);
            }
        }
        catch(Exception unused_ex) {
        }
        return this.mDeviceHeight;
    }

    @JavascriptInterface
    public int getDeviceWidth() {
        try {
            int v = this.mDeviceWidth;
            if(v > 0) {
                return v;
            }
            Context context0 = this.mContext;
            if(context0 != null) {
                this.mDeviceWidth = DisplayUtil.getDeviceWidth(context0);
            }
        }
        catch(Exception unused_ex) {
        }
        return this.mDeviceWidth;
    }

    @JavascriptInterface
    public String getGAID() {
        if(!TextUtils.isEmpty(this.mGaid)) {
            return this.mGaid;
        }
        this.getSyncUdid();
        return this.mGaid;
    }

    public static AdPieWebViewJsBridge getInstance() {
        return AdPieWebViewJsBridge.ourInstance;
    }

    @JavascriptInterface
    public String getLanguage() {
        try {
            if(!TextUtils.isEmpty(this.mLanguage)) {
                return this.mLanguage;
            }
            if(AdPieSDK.getInstance().isInitialized()) {
                this.mLanguage = AdPieSDK.getInstance().getCommonHeader().getLanguage();
                return this.mLanguage;
            }
            Context context0 = this.mContext;
            if(context0 != null) {
                String s = (Build.VERSION.SDK_INT < 24 ? context0.getResources().getConfiguration().locale : context0.getResources().getConfiguration().getLocales().get(0)).getLanguage();
                if(TextUtils.isEmpty(s)) {
                    s = Locale.getDefault().getLanguage();
                }
                this.mLanguage = s;
            }
        }
        catch(Exception unused_ex) {
        }
        return this.mLanguage;
    }

    @JavascriptInterface
    public String getManufacturer() {
        try {
            if(!TextUtils.isEmpty(this.mManufacturer)) {
                return this.mManufacturer;
            }
            if(AdPieSDK.getInstance().isInitialized()) {
                this.mManufacturer = AdPieSDK.getInstance().getCommonHeader().getManufacturer();
                return this.mManufacturer;
            }
            this.mManufacturer = Build.MANUFACTURER;
        }
        catch(Exception unused_ex) {
        }
        return this.mManufacturer;
    }

    @JavascriptInterface
    public String getModel() {
        try {
            if(!TextUtils.isEmpty(this.mModel)) {
                return this.mModel;
            }
            if(AdPieSDK.getInstance().isInitialized()) {
                this.mModel = AdPieSDK.getInstance().getCommonHeader().getModel();
                return this.mModel;
            }
            this.mModel = Build.MODEL;
        }
        catch(Exception unused_ex) {
        }
        return this.mModel;
    }

    private int getNetworkConnectionType() {
        int v = 0;
        try {
            if(this.mContext == null) {
                return 0;
            }
            if(!this.checkPermission("android.permission.INTERNET")) {
                AdPieLog.d("AdPieWebViewJsBridge", "android.permission.INTERNET permission must be added in AndroidManifest.xml!");
                return 0;
            }
            if(!this.checkPermission("android.permission.ACCESS_NETWORK_STATE")) {
                AdPieLog.d("AdPieWebViewJsBridge", "android.permission.ACCESS_NETWORK_STATE permission must be added in AndroidManifest.xml!");
                return 0;
            }
            NetworkInfo networkInfo0 = ((ConnectivityManager)this.mContext.getSystemService("connectivity")).getActiveNetworkInfo();
            if(networkInfo0 != null && networkInfo0.isConnected()) {
                switch(networkInfo0.getType()) {
                    case 0: {
                        v = 3;
                        if(Build.VERSION.SDK_INT >= 30 && ContextCompat.checkSelfPermission(this.mContext, "android.permission.READ_PHONE_STATE") != 0) {
                            return 3;
                        }
                        switch(((TelephonyManager)this.mContext.getSystemService("phone")).getNetworkType()) {
                            case 1: 
                            case 2: 
                            case 4: 
                            case 7: 
                            case 11: {
                                return 4;
                            }
                            case 13: {
                                return 6;
                            }
                            case 3: 
                            case 5: 
                            case 6: 
                            case 8: 
                            case 9: 
                            case 10: 
                            case 12: 
                            case 14: 
                            case 15: {
                                return 5;
                            }
                            default: {
                                return 3;
                            }
                        }
                    }
                    case 1: {
                        return 2;
                    }
                    default: {
                        return 0;
                    }
                }
            }
        }
        catch(Exception unused_ex) {
        }
        return v;
    }

    @JavascriptInterface
    public String getServiceProvider() {
        try {
            if(!TextUtils.isEmpty(this.mServiceProvider)) {
                return this.mServiceProvider;
            }
            if(AdPieSDK.getInstance().isInitialized()) {
                this.mServiceProvider = AdPieSDK.getInstance().getCommonHeader().getServiceProvider();
                return this.mServiceProvider;
            }
            Context context0 = this.mContext;
            if(context0 != null) {
                this.mServiceProvider = ((TelephonyManager)context0.getSystemService("phone")).getNetworkOperatorName();
            }
        }
        catch(Exception unused_ex) {
        }
        return this.mServiceProvider;
    }

    private void getSyncUdid() {
        if(AdPieSDK.getInstance().isInitialized()) {
            this.mUdid = AdPieSDK.getInstance().getCommonHeader().getUdid();
            String s = AdPieSDK.getInstance().getCommonHeader().getUdidType();
            this.mUdidType = s;
            if(!TextUtils.isEmpty(s) && this.mUdidType == "1") {
                this.mGaid = this.mUdid;
            }
        }
        else {
            String s1 = Preference.getStringValue(this.mContext, "UDID_GAID", "");
            boolean z = Preference.getBooleanValue(this.mContext, "DO_NOT_TRACKING", false);
            if(!TextUtils.isEmpty(s1)) {
                this.mUdid = s1;
                this.mGaid = s1;
                this.mUdidType = "1";
                this.mIsDoNotTracking = z;
            }
        }
    }

    @JavascriptInterface
    public String getUdid() {
        if(!TextUtils.isEmpty(this.mUdid)) {
            return this.mUdid;
        }
        this.getSyncUdid();
        return this.mUdid;
    }

    @JavascriptInterface
    public String getUdidType() {
        if(!TextUtils.isEmpty(this.mUdidType)) {
            return this.mUdidType;
        }
        this.getSyncUdid();
        return this.mUdidType;
    }

    @JavascriptInterface
    public boolean isDoNotTracking() {
        return this.mIsDoNotTracking;
    }

    public void setWebView(WebView webView0) {
        try {
            webView0.getSettings().setJavaScriptEnabled(true);
            webView0.addJavascriptInterface(this, "AdPieSDK");
            this.mContext = webView0.getContext();
            this.getSyncUdid();
            if(TextUtils.isEmpty(this.mUdid)) {
                this.getAsyncUdid();
            }
        }
        catch(Exception exception0) {
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.e("AdPieWebViewJsBridge", exception0);
            }
        }
    }
}

