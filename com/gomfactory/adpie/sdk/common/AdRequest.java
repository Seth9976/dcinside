package com.gomfactory.adpie.sdk.common;

import android.net.Uri.Builder;
import android.net.Uri;
import android.text.TextUtils;
import com.gomfactory.adpie.sdk.AdPieSDK;
import com.gomfactory.adpie.sdk.TargetingData.Gender;
import com.gomfactory.adpie.sdk.TargetingData;
import com.gomfactory.adpie.sdk.util.AdPieLog;
import java.util.HashMap;
import org.json.JSONObject;

public class AdRequest implements Cloneable {
    public static final String TAG = "AdRequest";
    private String accessDate;
    private String appID;
    private String appPackageName;
    private String appVersionName;
    private int connectionType;
    private String countryCode;
    private String coupangAdToken;
    private int deviceHeight;
    private String deviceType;
    private int deviceWidth;
    private String doNotTracking;
    private boolean isAvailableInAppBrowser;
    private boolean isAvailableVideo;
    private String language;
    private String manufacturer;
    private String model;
    private String osType;
    private String osVersion;
    private HashMap queryMap;
    private String requestURL;
    private String sdkVersion;
    private String serviceProvider;
    private String slotID;
    private TargetingData targetingData;
    private String udid;
    private String udidType;
    private String userAgent;

    static {
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
            if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                AdPieLog.e("AdRequest", cloneNotSupportedException0);
            }
            return null;
        }
    }

    public String getAccessDate() {
        return this.accessDate;
    }

    public String getAppID() {
        return this.appID;
    }

    public String getAppPackageName() {
        return this.appPackageName;
    }

    public String getAppVersionName() {
        return this.appVersionName;
    }

    public int getConnectionType() {
        return this.connectionType;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getCoupangAdToken() {
        return this.coupangAdToken;
    }

    public int getDeviceHeight() {
        return this.deviceHeight;
    }

    public String getDeviceType() {
        return this.deviceType;
    }

    public int getDeviceWidth() {
        return this.deviceWidth;
    }

    public String getDoNotTracking() {
        return this.doNotTracking;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    public String getOsType() {
        return this.osType;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public HashMap getQueryMap() {
        return this.queryMap;
    }

    public String getRequestURL() {
        return this.requestURL;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public String getServiceProvider() {
        return this.serviceProvider;
    }

    public String getSlotID() {
        return this.slotID;
    }

    public TargetingData getTargetingData() {
        return this.targetingData;
    }

    public String getUdid() {
        return this.udid;
    }

    public String getUdidType() {
        return this.udidType;
    }

    public String getUserAgent() {
        return this.userAgent;
    }

    public boolean isAvailableInAppBrowser() {
        return this.isAvailableInAppBrowser;
    }

    public boolean isAvailableVideo() {
        return this.isAvailableVideo;
    }

    public void setAccessDate(String s) {
        this.accessDate = s;
    }

    public void setAppID(String s) {
        this.appID = s;
    }

    public void setAppPackageName(String s) {
        this.appPackageName = s;
    }

    public void setAppVersionName(String s) {
        this.appVersionName = s;
    }

    public void setAvailableInAppBrowser(boolean z) {
        this.isAvailableInAppBrowser = z;
    }

    public void setAvailableVideo(boolean z) {
        this.isAvailableVideo = z;
    }

    public void setConnectionType(int v) {
        this.connectionType = v;
    }

    public void setCountryCode(String s) {
        this.countryCode = s;
    }

    public void setCoupangAdToken(String s) {
        this.coupangAdToken = s;
    }

    public void setDeviceHeight(int v) {
        this.deviceHeight = v;
    }

    public void setDeviceType(String s) {
        this.deviceType = s;
    }

    public void setDeviceWidth(int v) {
        this.deviceWidth = v;
    }

    public void setDoNotTracking(String s) {
        this.doNotTracking = s;
    }

    public void setLanguage(String s) {
        this.language = s;
    }

    public void setManufacturer(String s) {
        this.manufacturer = s;
    }

    public void setModel(String s) {
        this.model = s;
    }

    public void setOsType(String s) {
        this.osType = s;
    }

    public void setOsVersion(String s) {
        this.osVersion = s;
    }

    public void setQueryMap(HashMap hashMap0) {
        this.queryMap = hashMap0;
    }

    public void setRequestURL(String s, boolean z) {
        if(s != null) {
            if(!s.startsWith("http") && !s.startsWith("https")) {
                if(z) {
                    this.requestURL = "https://" + s;
                    return;
                }
                this.requestURL = "http://" + s;
                return;
            }
            this.requestURL = s;
            return;
        }
        this.requestURL = null;
    }

    public void setSdkVersion(String s) {
        this.sdkVersion = s;
    }

    public void setServiceProvider(String s) {
        this.serviceProvider = s;
    }

    public void setSlotID(String s) {
        this.slotID = s;
    }

    public void setTargetingData(TargetingData targetingData0) {
        this.targetingData = targetingData0;
    }

    public void setUdid(String s) {
        this.udid = s;
    }

    public void setUdidType(String s) {
        this.udidType = s;
    }

    public void setUserAgent(String s) {
        this.userAgent = s;
    }

    @Override
    public String toString() {
        return this.toUri().toString();
    }

    public Uri toUri() {
        Uri.Builder uri$Builder0 = Uri.parse(this.getRequestURL()).buildUpon();
        if(!TextUtils.isEmpty(this.deviceType)) {
            uri$Builder0.appendQueryParameter("dtype", this.deviceType);
        }
        if(!TextUtils.isEmpty(this.osType)) {
            uri$Builder0.appendQueryParameter("ostype", this.osType);
        }
        if(!TextUtils.isEmpty(this.serviceProvider)) {
            uri$Builder0.appendQueryParameter("carrier", this.serviceProvider);
        }
        if(this.connectionType > 0) {
            uri$Builder0.appendQueryParameter("connectiontype", this.connectionType + "");
        }
        if(!TextUtils.isEmpty(this.countryCode)) {
            uri$Builder0.appendQueryParameter("cc", this.countryCode);
        }
        if(!TextUtils.isEmpty(this.language)) {
            uri$Builder0.appendQueryParameter("lo", this.language);
        }
        if(!TextUtils.isEmpty(this.manufacturer)) {
            uri$Builder0.appendQueryParameter("make", this.manufacturer);
        }
        if(!TextUtils.isEmpty(this.model)) {
            uri$Builder0.appendQueryParameter("mo", this.model);
        }
        if(!TextUtils.isEmpty(this.appID)) {
            uri$Builder0.appendQueryParameter("mid", this.appID);
        }
        if(!TextUtils.isEmpty(this.slotID)) {
            uri$Builder0.appendQueryParameter("sid", this.slotID);
        }
        if(!TextUtils.isEmpty(this.userAgent)) {
            uri$Builder0.appendQueryParameter("ua", this.userAgent);
        }
        if(!TextUtils.isEmpty(this.udid)) {
            uri$Builder0.appendQueryParameter("udid", this.udid);
        }
        if(!TextUtils.isEmpty(this.udidType)) {
            uri$Builder0.appendQueryParameter("udidtype", this.udidType);
        }
        if(!TextUtils.isEmpty(this.doNotTracking)) {
            uri$Builder0.appendQueryParameter("dnt", this.doNotTracking);
        }
        if(!TextUtils.isEmpty(this.osVersion)) {
            uri$Builder0.appendQueryParameter("osver", this.osVersion);
        }
        if(!TextUtils.isEmpty(this.sdkVersion)) {
            StringBuffer stringBuffer0 = new StringBuffer();
            String[] arr_s = TextUtils.split(this.sdkVersion, "[.]");
            for(int v = 0; v < arr_s.length; ++v) {
                switch(arr_s[v].length()) {
                    case 1: {
                        stringBuffer0.append("0" + arr_s[v]);
                        break;
                    }
                    case 2: {
                        stringBuffer0.append(arr_s[v]);
                        break;
                    }
                    default: {
                        if(v == arr_s.length - 1 && arr_s[v].indexOf("-") > 0) {
                            String s = arr_s[v];
                            if(s.substring(0, s.indexOf("-")).length() == 1) {
                                stringBuffer0.append("0" + arr_s[v]);
                            }
                            else {
                                stringBuffer0.append(arr_s[v]);
                            }
                        }
                    }
                }
            }
            uri$Builder0.appendQueryParameter("sdkver", stringBuffer0.toString());
        }
        if(!TextUtils.isEmpty(this.appPackageName)) {
            uri$Builder0.appendQueryParameter("bundle", this.appPackageName);
        }
        if(!TextUtils.isEmpty(this.appVersionName)) {
            uri$Builder0.appendQueryParameter("ver", this.appVersionName);
        }
        if(!TextUtils.isEmpty(this.accessDate)) {
            uri$Builder0.appendQueryParameter("accessdate", this.accessDate);
        }
        if(this.deviceWidth > 0 && this.deviceHeight > 0) {
            uri$Builder0.appendQueryParameter("dw", this.deviceWidth + "");
            uri$Builder0.appendQueryParameter("dh", this.deviceHeight + "");
        }
        if(this.isAvailableVideo) {
            uri$Builder0.appendQueryParameter("vs", "1");
        }
        else {
            uri$Builder0.appendQueryParameter("vs", "0");
        }
        HashMap hashMap0 = this.queryMap;
        if(hashMap0 != null) {
            try {
                for(Object object0: hashMap0.keySet()) {
                    String s1 = (String)object0;
                    String s2 = (String)this.queryMap.get(s1);
                    uri$Builder0.appendQueryParameter(s1, s2);
                    if(AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                        AdPieLog.d("AdRequest", String.format("key : %s, value : %s", s1, s2));
                    }
                }
            }
            catch(Exception exception0) {
                if(!AdPieSDK.getInstance().getConfiguration().isAdpieSdkLog()) {
                    goto label_78;
                }
                AdPieLog.e("AdRequest", exception0);
            }
        }
    label_78:
        uri$Builder0.appendQueryParameter("secure", "1");
        if(AdPieSDK.getInstance().getConfiguration().isAdpieServerLog()) {
            uri$Builder0.appendQueryParameter("debug", "1");
        }
        uri$Builder0.appendQueryParameter("format", "json");
        TargetingData targetingData0 = this.targetingData;
        if(targetingData0 != null) {
            try {
                Gender targetingData$Gender0 = targetingData0.getGender();
                if(targetingData$Gender0 != null) {
                    int v1 = com.gomfactory.adpie.sdk.common.AdRequest.1.$SwitchMap$com$gomfactory$adpie$sdk$TargetingData$Gender[targetingData$Gender0.ordinal()];
                    switch(v1) {
                        case 1: {
                            uri$Builder0.appendQueryParameter("gender", "F");
                            break;
                        }
                        case 2: {
                            uri$Builder0.appendQueryParameter("gender", "M");
                            break;
                        }
                        default: {
                            if(v1 == 3) {
                                uri$Builder0.appendQueryParameter("gender", "O");
                            }
                        }
                    }
                }
                int v2 = this.targetingData.getAge();
                if(v2 > 0) {
                    uri$Builder0.appendQueryParameter("age", v2 + "");
                }
                int v3 = this.targetingData.getYearOfBirthday();
                if(v3 > 0) {
                    uri$Builder0.appendQueryParameter("yob", v3 + "");
                    if(v2 == 0 && 2026 - v3 > 0) {
                        uri$Builder0.appendQueryParameter("age", 2026 - v3 + "");
                    }
                }
                JSONObject jSONObject0 = this.targetingData.getCustomTargeting();
                if(jSONObject0 != null) {
                    if(jSONObject0.toString().length() < 500) {
                        uri$Builder0.appendQueryParameter("ext", jSONObject0.toString());
                    }
                    else {
                        AdPieLog.d("AdRequest", "Custom data exceeds the limit of 500 characters!");
                    }
                }
                goto label_111;
            }
            catch(Exception exception1) {
            }
            AdPieLog.e("AdRequest", exception1);
        }
    label_111:
        if(this.isAvailableInAppBrowser) {
            uri$Builder0.appendQueryParameter("wv_clk_v2", "1");
        }
        else {
            uri$Builder0.appendQueryParameter("wv_clk_v2", "0");
        }
        if(!TextUtils.isEmpty(this.coupangAdToken)) {
            uri$Builder0.appendQueryParameter("cpt", this.coupangAdToken);
        }
        return uri$Builder0.build();
    }
}

