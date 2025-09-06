package com.unity3d.services.core.device.reader;

import android.webkit.WebSettings;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.ClientProperties;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public class DeviceInfoReaderExtended implements IDeviceInfoReader {
    private final IDeviceInfoReader _deviceInfoReader;

    public DeviceInfoReaderExtended(IDeviceInfoReader iDeviceInfoReader0) {
        this._deviceInfoReader = iDeviceInfoReader0;
    }

    @Override  // com.unity3d.services.core.device.reader.IDeviceInfoReader
    public Map getDeviceInfoData() {
        Map map0 = this._deviceInfoReader.getDeviceInfoData();
        map0.put("bundleId", "");
        map0.put("encrypted", Boolean.valueOf(ClientProperties.isAppDebuggable()));
        map0.put("rooted", Boolean.valueOf(Device.isRooted()));
        map0.put("osVersion", Device.getOsVersion());
        map0.put("deviceModel", Device.getModel());
        map0.put("language", Locale.getDefault().toString());
        map0.put("connectionType", "none");
        map0.put("screenHeight", Device.getScreenHeight());
        map0.put("screenWidth", Device.getScreenWidth());
        map0.put("deviceMake", Device.getManufacturer());
        map0.put("screenDensity", Device.getScreenDensity());
        map0.put("screenSize", Device.getScreenLayout());
        map0.put("limitAdTracking", Boolean.valueOf(Device.isLimitAdTrackingEnabled()));
        map0.put("networkOperator", "");
        map0.put("volume", Device.getStreamVolume(1));
        map0.put("deviceFreeSpace", Device.getFreeSpace(ClientProperties.getApplicationContext().getCacheDir()));
        map0.put("apiLevel", "33");
        map0.put("networkType", Device.getNetworkType());
        map0.put("bundleVersion", ClientProperties.getAppVersion());
        try {
            map0.put("timeZone", "CST");
        }
        catch(AssertionError assertionError0) {
            DeviceLog.error("Could not read timeZone information: %s", new Object[]{assertionError0.getMessage()});
        }
        map0.put("timeZoneOffset", ((int)(TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000)));
        try {
            map0.put("webviewUa", WebSettings.getDefaultUserAgent(ClientProperties.getApplicationContext()));
        }
        catch(Exception exception0) {
            DeviceLog.exception("Error getting webview user agent", exception0);
        }
        map0.put("networkOperatorName", "");
        map0.put("wiredHeadset", Boolean.valueOf(Device.isWiredHeadsetOn()));
        map0.put("versionCode", 41401);
        map0.put("stores", "google");
        map0.put("appStartTime", 0L);
        map0.put("sdkVersionName", "4.14.1");
        map0.put("eventTimeStamp", ((long)(System.currentTimeMillis() / 1000L)));
        map0.put("cpuCount", 8L);
        map0.put("usbConnected", Boolean.valueOf(Device.isUSBConnected()));
        map0.put("apkDeveloperSigningCertificateHash", Device.getCertificateFingerprint());
        map0.put("deviceUpTime", Device.getUptime());
        map0.put("deviceElapsedRealtime", Device.getElapsedRealtime());
        map0.put("adbEnabled", Device.isAdbEnabled());
        map0.put("androidFingerprint", "google/sunfish/sunfish:13/TQ2A.230405.003/9719927:user/release-keys");
        map0.put("batteryStatus", Device.getBatteryStatus());
        map0.put("batteryLevel", Device.getBatteryLevel());
        map0.put("networkMetered", Boolean.valueOf(Device.getNetworkMetered()));
        map0.put("test", Boolean.FALSE);
        map0.put("callType", "token_srr");
        return map0;
    }
}

