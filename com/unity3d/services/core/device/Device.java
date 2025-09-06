package com.unity3d.services.core.device;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ConfigurationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.SystemClock;
import android.os.ext.SdkExtensions;
import android.provider.Settings.Global;
import android.provider.Settings.Secure;
import android.provider.Settings.System;
import android.telephony.TelephonyManager;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.preferences.AndroidPreferences;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import j..util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public class Device {
    public static enum MemoryInfoType {
        TOTAL_MEMORY,
        FREE_MEMORY;

        private static MemoryInfoType[] $values() [...] // Inlined contents
    }

    private static ConcurrentHashMap _reportedWarning;
    private static SDKMetricsSender sdkMetricsSender;

    static {
        Device._reportedWarning = new ConcurrentHashMap();
        Device.sdkMetricsSender = (SDKMetricsSender)Utilities.getService(SDKMetricsSender.class);
    }

    public static String getAdvertisingTrackingId() {
        return AdvertisingId.getAdvertisingTrackingId();
    }

    public static int getApiLevel() [...] // 潜在的解密器

    public static String getApkDigest() throws Exception {
        String s1;
        FileInputStream fileInputStream1;
        long v1;
        String s = ClientProperties.getApplicationContext().getPackageCodePath();
        long v = System.nanoTime();
        FileInputStream fileInputStream0 = null;
        try {
            File file0 = new File(s);
            v1 = file0.length();
            fileInputStream1 = new FileInputStream(file0);
        }
        catch(Throwable throwable0) {
            goto label_13;
        }
        try {
            s1 = Utilities.Sha256(fileInputStream1);
            goto label_16;
        }
        catch(Throwable throwable0) {
            fileInputStream0 = fileInputStream1;
        }
    label_13:
        if(fileInputStream0 != null) {
            try {
                fileInputStream0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        throw throwable0;
        try {
        label_16:
            fileInputStream1.close();
        }
        catch(IOException unused_ex) {
        }
        if(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - v) > 5000L) {
            Device.sdkMetricsSender.sendMetric(new Metric("native_device_info_apk_digest_timeout", ((long)(v1 / 0x100000L))));
        }
        Device.sdkMetricsSender.sendMetric(new Metric("native_device_info_apk_size", ((long)(v1 / 0x100000L))));
        return s1;
    }

    public static String getAuid() {
        return AndroidPreferences.getString("supersonic_shared_preferen", "auid");
    }

    public static float getBatteryLevel() {
        if(ClientProperties.getApplicationContext() != null) {
            Intent intent0 = ClientProperties.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            return intent0 == null ? -1.0f : ((float)intent0.getIntExtra("level", -1)) / ((float)intent0.getIntExtra("scale", -1));
        }
        return -1.0f;
    }

    public static int getBatteryStatus() {
        if(ClientProperties.getApplicationContext() != null) {
            Intent intent0 = ClientProperties.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            return intent0 == null ? -1 : intent0.getIntExtra("status", -1);
        }
        return -1;
    }

    public static String getBoard() {
        return Build.BOARD;
    }

    public static String getBootloader() {
        return Build.BOOTLOADER;
    }

    public static String getBrand() {
        return Build.BRAND;
    }

    public static String getBuildId() {
        return Build.ID;
    }

    public static String getBuildVersionIncremental() {
        return Build.VERSION.INCREMENTAL;
    }

    public static long getCPUCount() [...] // 潜在的解密器

    public static String getCertificateFingerprint() {
        PackageManager packageManager0 = ClientProperties.getApplicationContext().getPackageManager();
        try {
            Signature[] arr_signature = packageManager0.getPackageInfo("com.dcinside.app.android", 0x40).signatures;
            if(arr_signature != null && arr_signature.length >= 1) {
                X509Certificate x509Certificate0 = (X509Certificate)CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(arr_signature[0].toByteArray()));
                return Utilities.toHexString(MessageDigest.getInstance("SHA-1").digest(x509Certificate0.getEncoded()));
            }
        }
        catch(Exception exception0) {
            DeviceLog.exception("Exception when signing certificate fingerprint", exception0);
        }
        return null;
    }

    public static String getConnectionType() {
        if(Device.isUsingWifi()) {
            return "wifi";
        }
        return Device.isActiveNetworkConnected() ? "cellular" : "none";
    }

    public static String getDevice() {
        return Build.DEVICE;
    }

    public static float getDisplayMetricDensity() {
        return ClientProperties.getApplicationContext() == null ? -1.0f : ClientProperties.getApplicationContext().getResources().getDisplayMetrics().density;
    }

    public static long getElapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    public static int getExtensionVersion() {
        return Build.VERSION.SDK_INT < 30 ? -1 : SdkExtensions.getExtensionVersion(30);
    }

    public static String getFingerprint() [...] // 潜在的解密器

    public static long getFreeMemory() {
        return Device.getMemoryInfo(MemoryInfoType.FREE_MEMORY);
    }

    public static long getFreeSpace(File file0) {
        return file0 == null || !file0.exists() ? -1L : ((long)Math.round(file0.getFreeSpace() / 0x400L));
    }

    public static String getGLVersion() {
        if(ClientProperties.getApplicationContext() != null) {
            ActivityManager activityManager0 = (ActivityManager)ClientProperties.getApplicationContext().getSystemService("activity");
            if(activityManager0 != null) {
                ConfigurationInfo configurationInfo0 = activityManager0.getDeviceConfigurationInfo();
                return configurationInfo0 == null ? null : configurationInfo0.getGlEsVersion();
            }
        }
        return null;
    }

    public static String getHardware() {
        return Build.HARDWARE;
    }

    public static String getHost() {
        return Build.HOST;
    }

    public static String getIdfi() {
        String s = AndroidPreferences.getString("unityads-installinfo", "unityads-idfi");
        if(s == null) {
            s = "5c95087b-2f29-4394-9b90-880f88c486f3";
            AndroidPreferences.setString("unityads-installinfo", "unityads-idfi", "5c95087b-2f29-4394-9b90-880f88c486f3");
        }
        return s;
    }

    public static String getManufacturer() {
        return Build.MANUFACTURER;
    }

    private static long getMemoryInfo(MemoryInfoType device$MemoryInfoType0) {
        long v2;
        IOException iOException1;
        RandomAccessFile randomAccessFile0;
        String s;
        int v = 1;
        switch(device$MemoryInfoType0) {
            case 1: 
            case 2: {
                break;
            }
            default: {
                v = -1;
            }
        }
        try {
            s = null;
            randomAccessFile0 = null;
            randomAccessFile0 = new RandomAccessFile("/proc/meminfo", "r");
        }
        catch(IOException iOException0) {
            iOException1 = iOException0;
            goto label_23;
        }
        catch(Throwable throwable0) {
            goto label_30;
        }
        try {
            try {
                for(int v1 = 0; v1 < v; ++v1) {
                    s = randomAccessFile0.readLine();
                }
                v2 = Device.getMemoryValueFromString(s);
                goto label_36;
            }
            catch(IOException iOException1) {
            }
        label_23:
            DeviceLog.exception(("Error while reading memory info: " + device$MemoryInfoType0), iOException1);
            if(randomAccessFile0 != null) {
                goto label_25;
            }
            return -1L;
        }
        catch(Throwable throwable0) {
            s = randomAccessFile0;
            goto label_30;
        }
        try {
        label_25:
            randomAccessFile0.close();
            return -1L;
        }
        catch(IOException iOException2) {
            DeviceLog.exception("Error closing RandomAccessFile", iOException2);
        }
        return -1L;
    label_30:
        if(s != null) {
            try {
                ((RandomAccessFile)s).close();
            }
            catch(IOException iOException3) {
                DeviceLog.exception("Error closing RandomAccessFile", iOException3);
            }
        }
        throw throwable0;
        try {
        label_36:
            randomAccessFile0.close();
        }
        catch(IOException iOException4) {
            DeviceLog.exception("Error closing RandomAccessFile", iOException4);
        }
        return v2;
    }

    private static long getMemoryValueFromString(String s) {
        if(s != null) {
            Matcher matcher0 = Pattern.compile("(\\d+)").matcher(s);
            String s1;
            for(s1 = ""; matcher0.find(); s1 = matcher0.group(1)) {
            }
            return Long.parseLong(s1);
        }
        return -1L;
    }

    public static String getModel() {
        return Build.MODEL;
    }

    public static String getNetworkCountryISO() [...] // 潜在的解密器

    public static boolean getNetworkMetered() {
        if(ClientProperties.getApplicationContext() != null) {
            ConnectivityManager connectivityManager0 = (ConnectivityManager)ClientProperties.getApplicationContext().getSystemService("connectivity");
            return connectivityManager0 == null ? false : connectivityManager0.isActiveNetworkMetered();
        }
        return false;
    }

    public static String getNetworkOperator() [...] // 潜在的解密器

    public static String getNetworkOperatorName() [...] // 潜在的解密器

    public static int getNetworkType() {
        if(ClientProperties.getApplicationContext() != null) {
            TelephonyManager telephonyManager0 = (TelephonyManager)ClientProperties.getApplicationContext().getSystemService("phone");
            try {
                return telephonyManager0.getNetworkType();
            }
            catch(SecurityException unused_ex) {
                if(!Device._reportedWarning.containsKey("getNetworkType")) {
                    DeviceLog.warning("Unity Ads was not able to get current network type due to missing permission");
                    Device._reportedWarning.put("getNetworkType", Boolean.TRUE);
                }
            }
        }
        return -1;
    }

    @TargetApi(21)
    private static ArrayList getNewAbiList() {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.addAll(Arrays.asList(Build.SUPPORTED_ABIS));
        return arrayList0;
    }

    private static ArrayList getOldAbiList() {
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add("arm64-v8a");
        arrayList0.add("arm64-v8a");
        return arrayList0;
    }

    public static String getOpenAdvertisingTrackingId() {
        return OpenAdvertisingId.getOpenAdvertisingTrackingId();
    }

    public static String getOsVersion() {
        return Build.VERSION.RELEASE;
    }

    public static JSONObject getPackageInfo(PackageManager packageManager0) throws PackageManager.NameNotFoundException, JSONException {
        PackageInfo packageInfo0 = packageManager0.getPackageInfo("", 0);
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("installer", packageManager0.getInstallerPackageName(""));
        jSONObject0.put("firstInstallTime", packageInfo0.firstInstallTime);
        jSONObject0.put("lastUpdateTime", packageInfo0.lastUpdateTime);
        jSONObject0.put("versionCode", packageInfo0.versionCode);
        jSONObject0.put("versionName", packageInfo0.versionName);
        jSONObject0.put("packageName", packageInfo0.packageName);
        return jSONObject0;
    }

    public static Map getProcessInfo() {
        IOException iOException1;
        RandomAccessFile randomAccessFile1;
        Map map0 = new HashMap();
        RandomAccessFile randomAccessFile0 = null;
        try {
            randomAccessFile1 = null;
            randomAccessFile1 = new RandomAccessFile("/proc/self/stat", "r");
        }
        catch(IOException iOException0) {
            iOException1 = iOException0;
            goto label_13;
        }
        catch(Throwable throwable0) {
            goto label_19;
        }
        try {
            ((HashMap)map0).put("stat", randomAccessFile1.readLine());
            goto label_25;
        }
        catch(IOException iOException1) {
            try {
            label_13:
                DeviceLog.exception("Error while reading processor info: ", iOException1);
                if(randomAccessFile1 != null) {
                    goto label_15;
                }
                return map0;
            }
            catch(Throwable throwable0) {
                goto label_18;
            }
            try {
            label_15:
                randomAccessFile1.close();
            }
            catch(IOException iOException2) {
                DeviceLog.exception("Error closing RandomAccessFile", iOException2);
            }
            return map0;
        }
        catch(Throwable throwable0) {
        label_18:
            randomAccessFile0 = randomAccessFile1;
        }
    label_19:
        if(randomAccessFile0 != null) {
            try {
                randomAccessFile0.close();
            }
            catch(IOException iOException3) {
                DeviceLog.exception("Error closing RandomAccessFile", iOException3);
            }
        }
        throw throwable0;
        try {
        label_25:
            randomAccessFile1.close();
        }
        catch(IOException iOException2) {
            DeviceLog.exception("Error closing RandomAccessFile", iOException2);
        }
        return map0;
    }

    public static String getProduct() {
        return Build.PRODUCT;
    }

    public static int getRingerMode() {
        if(ClientProperties.getApplicationContext() != null) {
            AudioManager audioManager0 = (AudioManager)ClientProperties.getApplicationContext().getSystemService("audio");
            return audioManager0 == null ? -2 : audioManager0.getRingerMode();
        }
        return -1;
    }

    public static int getScreenBrightness() {
        return ClientProperties.getApplicationContext() == null ? -1 : Settings.System.getInt(ClientProperties.getApplicationContext().getContentResolver(), "screen_brightness", -1);
    }

    public static int getScreenDensity() {
        return ClientProperties.getApplicationContext() == null ? -1 : ClientProperties.getApplicationContext().getResources().getDisplayMetrics().densityDpi;
    }

    public static int getScreenHeight() {
        return ClientProperties.getApplicationContext() == null ? -1 : ClientProperties.getApplicationContext().getResources().getDisplayMetrics().heightPixels;
    }

    public static int getScreenLayout() {
        return ClientProperties.getApplicationContext() == null ? -1 : ClientProperties.getApplicationContext().getResources().getConfiguration().screenLayout;
    }

    public static int getScreenWidth() {
        return ClientProperties.getApplicationContext() == null ? -1 : ClientProperties.getApplicationContext().getResources().getDisplayMetrics().widthPixels;
    }

    public static List getSensorList() {
        return ClientProperties.getApplicationContext() == null ? null : ((SensorManager)ClientProperties.getApplicationContext().getSystemService("sensor")).getSensorList(-1);
    }

    public static int getStreamMaxVolume(int v) {
        if(ClientProperties.getApplicationContext() != null) {
            AudioManager audioManager0 = (AudioManager)ClientProperties.getApplicationContext().getSystemService("audio");
            return audioManager0 == null ? -2 : audioManager0.getStreamMaxVolume(v);
        }
        return -1;
    }

    public static int getStreamVolume(int v) {
        if(ClientProperties.getApplicationContext() != null) {
            AudioManager audioManager0 = (AudioManager)ClientProperties.getApplicationContext().getSystemService("audio");
            return audioManager0 == null ? -2 : audioManager0.getStreamVolume(v);
        }
        return -1;
    }

    // 去混淆评级： 低(20)
    public static ArrayList getSupportedAbis() {
        return Device.getNewAbiList();
    }

    public static String getSystemProperty(String s, String s1) {
        return s1 == null ? System.getProperty(s) : System.getProperty(s, s1);
    }

    public static long getTotalMemory() {
        return Device.getMemoryInfo(MemoryInfoType.TOTAL_MEMORY);
    }

    public static long getTotalSpace(File file0) {
        return file0 == null || !file0.exists() ? -1L : ((long)Math.round(file0.getTotalSpace() / 0x400L));
    }

    // 去混淆评级： 低(20)
    public static String getUniqueEventId() [...] // 潜在的解密器

    public static long getUptime() {
        return SystemClock.uptimeMillis();
    }

    public static boolean hasAV1Decoder() {
        return Device.selectAllDecodeCodecs("video/av01").size() > 0;
    }

    public static boolean hasX264Decoder() {
        return Device.selectAllDecodeCodecs("video/avc").size() > 0;
    }

    public static boolean hasX265Decoder() {
        return Device.selectAllDecodeCodecs("video/hevc").size() > 0;
    }

    public static boolean isActiveNetworkConnected() {
        if(ClientProperties.getApplicationContext() != null) {
            ConnectivityManager connectivityManager0 = (ConnectivityManager)ClientProperties.getApplicationContext().getSystemService("connectivity");
            if(connectivityManager0 != null) {
                NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
                return networkInfo0 != null && networkInfo0.isConnected();
            }
        }
        return false;
    }

    // 去混淆评级： 低(20)
    public static Boolean isAdbEnabled() {
        return Device.newAdbStatus();
    }

    // 去混淆评级： 低(20)
    private static boolean isHardwareAccelerated(MediaCodecInfo mediaCodecInfo0, String s) {
        return Device.isHardwareAcceleratedV29(mediaCodecInfo0);
    }

    @TargetApi(29)
    private static boolean isHardwareAcceleratedV29(MediaCodecInfo mediaCodecInfo0) {
        return mediaCodecInfo0.isHardwareAccelerated();
    }

    public static boolean isLimitAdTrackingEnabled() {
        return AdvertisingId.getLimitedAdTracking();
    }

    public static boolean isLimitOpenAdTrackingEnabled() {
        return OpenAdvertisingId.getLimitedOpenAdTracking();
    }

    public static boolean isRooted() {
        try {
            return Device.searchPathForBinary("su");
        }
        catch(Exception exception0) {
            DeviceLog.exception("Rooted check failed", exception0);
            return false;
        }
    }

    // 去混淆评级： 中等(120)
    private static boolean isSoftwareOnly(MediaCodecInfo mediaCodecInfo0, String s) {
        return Device.isSoftwareOnlyV29(mediaCodecInfo0);
    }

    @TargetApi(29)
    private static boolean isSoftwareOnlyV29(MediaCodecInfo mediaCodecInfo0) {
        return mediaCodecInfo0.isSoftwareOnly();
    }

    public static boolean isUSBConnected() {
        if(ClientProperties.getApplicationContext() != null) {
            Intent intent0 = ClientProperties.getApplicationContext().registerReceiver(null, new IntentFilter("android.hardware.usb.action.USB_STATE"));
            return intent0 == null ? false : intent0.getBooleanExtra("connected", false);
        }
        return false;
    }

    public static boolean isUsingWifi() {
        if(ClientProperties.getApplicationContext() != null) {
            ConnectivityManager connectivityManager0 = (ConnectivityManager)ClientProperties.getApplicationContext().getSystemService("connectivity");
            if(connectivityManager0 == null) {
                return false;
            }
            TelephonyManager telephonyManager0 = (TelephonyManager)ClientProperties.getApplicationContext().getSystemService("phone");
            NetworkInfo networkInfo0 = connectivityManager0.getActiveNetworkInfo();
            return networkInfo0 != null && connectivityManager0.getBackgroundDataSetting() && connectivityManager0.getActiveNetworkInfo().isConnected() && telephonyManager0 != null && networkInfo0.getType() == 1 && networkInfo0.isConnected();
        }
        return false;
    }

    public static boolean isWiredHeadsetOn() {
        return ClientProperties.getApplicationContext() == null ? false : ((AudioManager)ClientProperties.getApplicationContext().getSystemService("audio")).isWiredHeadsetOn();
    }

    @TargetApi(17)
    private static Boolean newAdbStatus() {
        try {
            return Boolean.valueOf(1 == Settings.Global.getInt(ClientProperties.getApplicationContext().getContentResolver(), "adb_enabled", 0));
        }
        catch(Exception exception0) {
            DeviceLog.exception("Problems fetching adb enabled status", exception0);
            return null;
        }
    }

    private static Boolean oldAdbStatus() {
        try {
            return Boolean.valueOf(1 == Settings.Secure.getInt(ClientProperties.getApplicationContext().getContentResolver(), "adb_enabled", 0));
        }
        catch(Exception exception0) {
            DeviceLog.exception("Problems fetching adb enabled status", exception0);
            return null;
        }
    }

    private static boolean searchPathForBinary(String s) {
        for(int v = 0; v < 9; ++v) {
            File file0 = new File(new String[]{"/product/bin", "/apex/com.android.runtime/bin", "/apex/com.android.art/bin", "/system_ext/bin", "/system/bin", "/system/xbin", "/odm/bin", "/vendor/bin", "/vendor/xbin"}[v]);
            if(file0.exists() && file0.isDirectory()) {
                File[] arr_file = file0.listFiles();
                if(arr_file != null) {
                    int v1 = arr_file.length;
                    for(int v2 = 0; v2 < v1; ++v2) {
                        if(arr_file[v2].getName().equals(s)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static List selectAllDecodeCodecs(String s) {
        List list0 = new ArrayList();
        int v = MediaCodecList.getCodecCount();
        for(int v1 = 0; v1 < v; ++v1) {
            MediaCodecInfo mediaCodecInfo0 = MediaCodecList.getCodecInfoAt(v1);
            if(!mediaCodecInfo0.isEncoder()) {
                String[] arr_s = mediaCodecInfo0.getSupportedTypes();
                for(int v2 = 0; v2 < arr_s.length; ++v2) {
                    if(arr_s[v2].equalsIgnoreCase(s) && Device.isHardwareAccelerated(mediaCodecInfo0, s)) {
                        list0.add(mediaCodecInfo0);
                    }
                }
            }
        }
        return list0;
    }
}

