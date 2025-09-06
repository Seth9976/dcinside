package com.unity3d.services.core.api;

import android.content.pm.PackageManager.NameNotFoundException;
import android.hardware.Sensor;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.device.DeviceError;
import com.unity3d.services.core.device.VolumeChangeMonitor;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.webview.bridge.WebViewCallback;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.io.File;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DeviceInfo {
    public static enum StorageType {
        EXTERNAL,
        INTERNAL;

        private static StorageType[] $values() [...] // Inlined contents
    }

    private static final VolumeChangeMonitor volumeChangeMonitor;

    static {
        DeviceInfo.volumeChangeMonitor = (VolumeChangeMonitor)Utilities.getService(VolumeChangeMonitor.class);
    }

    @WebViewExposed
    public static void getAdvertisingTrackingId(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Device.getAdvertisingTrackingId()});
    }

    @WebViewExposed
    public static void getApiLevel(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{33});
    }

    @WebViewExposed
    public static void getApkDigest(WebViewCallback webViewCallback0) {
        try {
            webViewCallback0.invoke(new Object[]{Device.getApkDigest()});
        }
        catch(Exception exception0) {
            webViewCallback0.error(DeviceError.COULDNT_GET_DIGEST, new Object[]{exception0.toString()});
        }
    }

    @WebViewExposed
    public static void getBatteryLevel(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Device.getBatteryLevel()});
    }

    @WebViewExposed
    public static void getBatteryStatus(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Device.getBatteryStatus()});
    }

    @WebViewExposed
    public static void getBoard(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Device.getBoard()});
    }

    @WebViewExposed
    public static void getBootloader(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Device.getBootloader()});
    }

    @WebViewExposed
    public static void getBrand(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Device.getBrand()});
    }

    @WebViewExposed
    public static void getBuildId(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Device.getBuildId()});
    }

    @WebViewExposed
    public static void getBuildVersionIncremental(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Device.getBuildVersionIncremental()});
    }

    @WebViewExposed
    public static void getCPUCount(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{8L});
    }

    @WebViewExposed
    public static void getCertificateFingerprint(WebViewCallback webViewCallback0) {
        String s = Device.getCertificateFingerprint();
        if(s != null) {
            webViewCallback0.invoke(new Object[]{s});
            return;
        }
        webViewCallback0.error(DeviceError.COULDNT_GET_FINGERPRINT, new Object[0]);
    }

    @WebViewExposed
    public static void getConnectionType(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{"none"});
    }

    @WebViewExposed
    public static void getDevice(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Device.getDevice()});
    }

    @WebViewExposed
    public static void getDeviceMaxVolume(Integer integer0, WebViewCallback webViewCallback0) {
        int v = Device.getStreamMaxVolume(((int)integer0));
        if(v > -1) {
            webViewCallback0.invoke(new Object[]{v});
            return;
        }
        switch(v) {
            case -2: {
                webViewCallback0.error(DeviceError.AUDIOMANAGER_NULL, new Object[]{-2});
                return;
            }
            case -1: {
                webViewCallback0.error(DeviceError.APPLICATION_CONTEXT_NULL, new Object[]{-1});
                return;
            }
            default: {
                DeviceLog.error(("Unhandled deviceMaxVolume error: " + v));
            }
        }
    }

    @WebViewExposed
    public static void getDeviceVolume(Integer integer0, WebViewCallback webViewCallback0) {
        int v = Device.getStreamVolume(((int)integer0));
        if(v > -1) {
            webViewCallback0.invoke(new Object[]{v});
            return;
        }
        switch(v) {
            case -2: {
                webViewCallback0.error(DeviceError.AUDIOMANAGER_NULL, new Object[]{-2});
                return;
            }
            case -1: {
                webViewCallback0.error(DeviceError.APPLICATION_CONTEXT_NULL, new Object[]{-1});
                return;
            }
            default: {
                DeviceLog.error(("Unhandled deviceVolume error: " + v));
            }
        }
    }

    @WebViewExposed
    public static void getDisplayMetricDensity(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Device.getDisplayMetricDensity()});
    }

    @WebViewExposed
    public static void getElapsedRealtime(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Device.getElapsedRealtime()});
    }

    @WebViewExposed
    public static void getExtensionVersion(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Device.getExtensionVersion()});
    }

    private static File getFileForStorageType(StorageType deviceInfo$StorageType0) {
        switch(deviceInfo$StorageType0) {
            case 1: {
                return ClientProperties.getApplicationContext().getCacheDir();
            }
            case 2: {
                return ClientProperties.getApplicationContext().getExternalCacheDir();
            }
            default: {
                DeviceLog.error(("Unhandled storagetype: " + deviceInfo$StorageType0));
                return null;
            }
        }
    }

    @WebViewExposed
    public static void getFingerprint(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{"google/sunfish/sunfish:13/TQ2A.230405.003/9719927:user/release-keys"});
    }

    @WebViewExposed
    public static void getFreeMemory(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Device.getFreeMemory()});
    }

    @WebViewExposed
    public static void getFreeSpace(String s, WebViewCallback webViewCallback0) {
        StorageType deviceInfo$StorageType0 = DeviceInfo.getStorageTypeFromString(s);
        if(deviceInfo$StorageType0 == null) {
            webViewCallback0.error(DeviceError.INVALID_STORAGETYPE, new Object[]{s});
            return;
        }
        long v = Device.getFreeSpace(DeviceInfo.getFileForStorageType(deviceInfo$StorageType0));
        if(v > -1L) {
            webViewCallback0.invoke(new Object[]{v});
            return;
        }
        webViewCallback0.error(DeviceError.COULDNT_GET_STORAGE_LOCATION, new Object[]{v});
    }

    @WebViewExposed
    public static void getGLVersion(WebViewCallback webViewCallback0) {
        String s = Device.getGLVersion();
        if(s != null) {
            webViewCallback0.invoke(new Object[]{s});
            return;
        }
        webViewCallback0.error(DeviceError.COULDNT_GET_GL_VERSION, new Object[0]);
    }

    @WebViewExposed
    public static void getHardware(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Device.getHardware()});
    }

    @WebViewExposed
    public static void getHeadset(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Boolean.valueOf(Device.isWiredHeadsetOn())});
    }

    @WebViewExposed
    public static void getHost(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Device.getHost()});
    }

    @WebViewExposed
    public static void getLimitAdTrackingFlag(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Boolean.valueOf(Device.isLimitAdTrackingEnabled())});
    }

    @WebViewExposed
    public static void getLimitOpenAdTrackingFlag(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Boolean.valueOf(Device.isLimitOpenAdTrackingEnabled())});
    }

    @WebViewExposed
    public static void getManufacturer(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Device.getManufacturer()});
    }

    @WebViewExposed
    public static void getModel(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Device.getModel()});
    }

    @WebViewExposed
    public static void getNetworkCountryISO(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{""});
    }

    @WebViewExposed
    public static void getNetworkMetered(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Boolean.valueOf(Device.getNetworkMetered())});
    }

    @WebViewExposed
    public static void getNetworkOperator(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{""});
    }

    @WebViewExposed
    public static void getNetworkOperatorName(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{""});
    }

    @WebViewExposed
    public static void getNetworkType(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Device.getNetworkType()});
    }

    @WebViewExposed
    public static void getOpenAdvertisingTrackingId(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Device.getOpenAdvertisingTrackingId()});
    }

    @WebViewExposed
    public static void getOsVersion(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Device.getOsVersion()});
    }

    @WebViewExposed
    public static void getPackageInfo(WebViewCallback webViewCallback0) {
        if(ClientProperties.getApplicationContext() != null) {
            try {
                webViewCallback0.invoke(new Object[]{Device.getPackageInfo(ClientProperties.getApplicationContext().getPackageManager())});
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
                webViewCallback0.error(DeviceError.APPLICATION_INFO_NOT_AVAILABLE, new Object[]{""});
            }
            catch(JSONException jSONException0) {
                webViewCallback0.error(DeviceError.JSON_ERROR, new Object[]{jSONException0.getMessage()});
            }
            return;
        }
        webViewCallback0.error(DeviceError.APPLICATION_CONTEXT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void getProcessInfo(WebViewCallback webViewCallback0) {
        JSONObject jSONObject0 = new JSONObject();
        Map map0 = Device.getProcessInfo();
        if(map0 != null) {
            try {
                if(map0.containsKey("stat")) {
                    jSONObject0.put("stat", map0.get("stat"));
                }
                if(map0.containsKey("uptime")) {
                    jSONObject0.put("uptime", map0.get("uptime"));
                }
                goto label_10;
            }
            catch(Exception exception0) {
            }
            DeviceLog.exception("Error while constructing process info", exception0);
        }
    label_10:
        webViewCallback0.invoke(new Object[]{jSONObject0});
    }

    @WebViewExposed
    public static void getProduct(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Device.getProduct()});
    }

    @WebViewExposed
    public static void getRingerMode(WebViewCallback webViewCallback0) {
        int v = Device.getRingerMode();
        if(v > -1) {
            webViewCallback0.invoke(new Object[]{v});
            return;
        }
        switch(v) {
            case -2: {
                webViewCallback0.error(DeviceError.AUDIOMANAGER_NULL, new Object[]{-2});
                return;
            }
            case -1: {
                webViewCallback0.error(DeviceError.APPLICATION_CONTEXT_NULL, new Object[]{-1});
                return;
            }
            default: {
                DeviceLog.error(("Unhandled ringerMode error: " + v));
            }
        }
    }

    @WebViewExposed
    public static void getScreenBrightness(WebViewCallback webViewCallback0) {
        int v = Device.getScreenBrightness();
        if(v > -1) {
            webViewCallback0.invoke(new Object[]{v});
            return;
        }
        if(v != -1) {
            DeviceLog.error(("Unhandled screenBrightness error: " + v));
            return;
        }
        webViewCallback0.error(DeviceError.APPLICATION_CONTEXT_NULL, new Object[]{-1});
    }

    @WebViewExposed
    public static void getScreenDensity(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Device.getScreenDensity()});
    }

    @WebViewExposed
    public static void getScreenHeight(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Device.getScreenHeight()});
    }

    @WebViewExposed
    public static void getScreenLayout(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Device.getScreenLayout()});
    }

    @WebViewExposed
    public static void getScreenWidth(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Device.getScreenWidth()});
    }

    @WebViewExposed
    public static void getSensorList(WebViewCallback webViewCallback0) {
        JSONArray jSONArray0 = new JSONArray();
        List list0 = Device.getSensorList();
        if(list0 != null) {
            for(Object object0: list0) {
                Sensor sensor0 = (Sensor)object0;
                JSONObject jSONObject0 = new JSONObject();
                try {
                    jSONObject0.put("name", sensor0.getName());
                    jSONObject0.put("type", sensor0.getType());
                    jSONObject0.put("vendor", sensor0.getVendor());
                    jSONObject0.put("maximumRange", ((double)sensor0.getMaximumRange()));
                    jSONObject0.put("power", ((double)sensor0.getPower()));
                    jSONObject0.put("version", sensor0.getVersion());
                    jSONObject0.put("resolution", ((double)sensor0.getResolution()));
                    jSONObject0.put("minDelay", sensor0.getMinDelay());
                }
                catch(JSONException jSONException0) {
                    webViewCallback0.error(DeviceError.JSON_ERROR, new Object[]{jSONException0.getMessage()});
                    return;
                }
                jSONArray0.put(jSONObject0);
            }
        }
        webViewCallback0.invoke(new Object[]{jSONArray0});
    }

    private static StorageType getStorageTypeFromString(String s) {
        try {
            return StorageType.valueOf(s);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            DeviceLog.exception(("Illegal argument: " + s), illegalArgumentException0);
            return null;
        }
    }

    @WebViewExposed
    public static void getSupportedAbis(WebViewCallback webViewCallback0) {
        JSONArray jSONArray0 = new JSONArray();
        for(Object object0: Device.getSupportedAbis()) {
            jSONArray0.put(((String)object0));
        }
        webViewCallback0.invoke(new Object[]{jSONArray0});
    }

    @WebViewExposed
    public static void getSystemLanguage(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Locale.getDefault().toString()});
    }

    @WebViewExposed
    public static void getSystemProperty(String s, String s1, WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Device.getSystemProperty(s, s1)});
    }

    @WebViewExposed
    public static void getTimeZone(Boolean boolean0, WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{TimeZone.getDefault().getDisplayName(boolean0.booleanValue(), 0, Locale.US)});
    }

    @WebViewExposed
    public static void getTimeZoneOffset(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{((int)(TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000))});
    }

    @WebViewExposed
    public static void getTotalMemory(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Device.getTotalMemory()});
    }

    @WebViewExposed
    public static void getTotalSpace(String s, WebViewCallback webViewCallback0) {
        StorageType deviceInfo$StorageType0 = DeviceInfo.getStorageTypeFromString(s);
        if(deviceInfo$StorageType0 == null) {
            webViewCallback0.error(DeviceError.INVALID_STORAGETYPE, new Object[]{s});
            return;
        }
        long v = Device.getTotalSpace(DeviceInfo.getFileForStorageType(deviceInfo$StorageType0));
        if(v > -1L) {
            webViewCallback0.invoke(new Object[]{v});
            return;
        }
        webViewCallback0.error(DeviceError.COULDNT_GET_STORAGE_LOCATION, new Object[]{v});
    }

    @WebViewExposed
    public static void getUniqueEventId(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{"06f29ec0-1c7e-427d-bd12-60815c742983"});
    }

    @WebViewExposed
    public static void getUptime(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Device.getUptime()});
    }

    @WebViewExposed
    public static void hasAV1HWDecoder(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Boolean.valueOf(Device.hasAV1Decoder())});
    }

    @WebViewExposed
    public static void hasX264HWDecoder(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Boolean.valueOf(Device.hasX264Decoder())});
    }

    @WebViewExposed
    public static void hasX265HWDecoder(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Boolean.valueOf(Device.hasX265Decoder())});
    }

    @WebViewExposed
    public static void isAdbEnabled(WebViewCallback webViewCallback0) {
        Boolean boolean0 = Device.isAdbEnabled();
        if(boolean0 != null) {
            webViewCallback0.invoke(new Object[]{boolean0});
            return;
        }
        webViewCallback0.error(DeviceError.COULDNT_GET_ADB_STATUS, new Object[0]);
    }

    @WebViewExposed
    public static void isRooted(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Boolean.valueOf(Device.isRooted())});
    }

    @WebViewExposed
    public static void isUSBConnected(WebViewCallback webViewCallback0) {
        webViewCallback0.invoke(new Object[]{Boolean.valueOf(Device.isUSBConnected())});
    }

    @WebViewExposed
    public static void registerVolumeChangeListener(Integer integer0, WebViewCallback webViewCallback0) {
        DeviceInfo.volumeChangeMonitor.registerVolumeChangeListener(((int)integer0));
        webViewCallback0.invoke(new Object[0]);
    }

    @WebViewExposed
    public static void unregisterVolumeChangeListener(Integer integer0, WebViewCallback webViewCallback0) {
        DeviceInfo.volumeChangeMonitor.unregisterVolumeChangeListener(((int)integer0));
        webViewCallback0.invoke(new Object[0]);
    }
}

