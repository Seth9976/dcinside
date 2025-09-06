package com.unity3d.services.core.configuration;

import android.content.Context;
import com.unity3d.ads.UnityAds.UnityAdsInitializationError;
import com.unity3d.services.core.api.Broadcast;
import com.unity3d.services.core.api.Cache;
import com.unity3d.services.core.api.ClassDetection;
import com.unity3d.services.core.api.Connectivity;
import com.unity3d.services.core.api.DeviceInfo;
import com.unity3d.services.core.api.Intent;
import com.unity3d.services.core.api.Lifecycle;
import com.unity3d.services.core.api.Permissions;
import com.unity3d.services.core.api.Preferences;
import com.unity3d.services.core.api.Request;
import com.unity3d.services.core.api.Resolve;
import com.unity3d.services.core.api.Sdk;
import com.unity3d.services.core.api.SensorInfo;
import com.unity3d.services.core.api.Storage;
import com.unity3d.services.core.broadcast.BroadcastMonitor;
import com.unity3d.services.core.cache.CacheThread;
import com.unity3d.services.core.connectivity.ConnectivityMonitor;
import com.unity3d.services.core.device.AdvertisingId;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.device.OpenAdvertisingId;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.device.VolumeChange;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.WebRequestThread;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetrics;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import java.util.ArrayList;

public class CoreModuleConfiguration implements IModuleConfiguration {
    private void checkForPC(Configuration configuration0, SDKMetricsSender sDKMetricsSender0) {
        if(configuration0.getExperiments().isPCCheckEnabled()) {
            Context context0 = ClientProperties.getApplicationContext();
            if(context0 == null) {
                return;
            }
            if(context0.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                sDKMetricsSender0.sendMetric(new Metric("native_device_is_pc_success"));
                return;
            }
            sDKMetricsSender0.sendMetric(new Metric("native_device_is_pc_failure"));
        }
    }

    private void collectMetrics(Configuration configuration0) {
        ArrayList arrayList0 = new ArrayList();
        if(Device.hasX264Decoder()) {
            arrayList0.add(new Metric("native_device_decoder_x264_success"));
        }
        else {
            arrayList0.add(new Metric("native_device_decoder_x264_failure"));
        }
        if(Device.hasX265Decoder()) {
            arrayList0.add(new Metric("native_device_decoder_x265_success"));
        }
        else {
            arrayList0.add(new Metric("native_device_decoder_x265_failure"));
        }
        if(Device.hasAV1Decoder()) {
            arrayList0.add(new Metric("native_device_decoder_av1_success"));
        }
        else {
            arrayList0.add(new Metric("native_device_decoder_av1_failure"));
        }
        SDKMetricsSender sDKMetricsSender0 = (SDKMetricsSender)Utilities.getService(SDKMetricsSender.class);
        sDKMetricsSender0.sendMetrics(arrayList0);
        this.checkForPC(configuration0, sDKMetricsSender0);
    }

    @Override  // com.unity3d.services.core.configuration.IModuleConfiguration
    public Class[] getWebAppApiClassList() {
        return new Class[]{Broadcast.class, Cache.class, Connectivity.class, DeviceInfo.class, ClassDetection.class, Storage.class, Sdk.class, Request.class, Resolve.class, Intent.class, Lifecycle.class, Preferences.class, SensorInfo.class, Permissions.class};
    }

    @Override  // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean initCompleteState(Configuration configuration0) {
        SDKMetrics.setConfiguration(configuration0);
        InitializationNotificationCenter.getInstance().triggerOnSdkInitialized();
        Utilities.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                SdkProperties.notifyInitializationComplete();
            }
        });
        this.collectMetrics(configuration0);
        return true;
    }

    @Override  // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean initErrorState(Configuration configuration0, ErrorState errorState0, String s) {
        UnityAdsInitializationError unityAds$UnityAdsInitializationError0;
        SDKMetrics.setConfiguration(configuration0);
        switch(errorState0) {
            case 1: {
                unityAds$UnityAdsInitializationError0 = UnityAdsInitializationError.INTERNAL_ERROR;
                break;
            }
            case 2: {
                unityAds$UnityAdsInitializationError0 = UnityAdsInitializationError.AD_BLOCKER_DETECTED;
                break;
            }
            default: {
                unityAds$UnityAdsInitializationError0 = UnityAdsInitializationError.INTERNAL_ERROR;
                s = "Unity Ads failed to initialize due to internal error";
            }
        }
        InitializationNotificationCenter.getInstance().triggerOnSdkInitializationFailed(s, errorState0, 0);
        Utilities.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                SdkProperties.notifyInitializationFailed(unityAds$UnityAdsInitializationError0, s);
            }
        });
        return true;
    }

    @Override  // com.unity3d.services.core.configuration.IModuleConfiguration
    public boolean resetState(Configuration configuration0) {
        BroadcastMonitor.getInstance().removeAllBroadcastListeners();
        CacheThread.cancel();
        WebRequestThread.cancel();
        ConnectivityMonitor.stopAll();
        StorageManager.init(ClientProperties.getApplicationContext());
        AdvertisingId.init(ClientProperties.getApplicationContext());
        OpenAdvertisingId.init(ClientProperties.getApplicationContext());
        ((VolumeChange)Utilities.getService(VolumeChange.class)).clearAllListeners();
        return true;
    }
}

