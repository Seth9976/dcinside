package com.unity3d.services.core.request.metrics;

import com.unity3d.ads.UnityAds.UnityAdsLoadError;
import com.unity3d.ads.UnityAds.UnityAdsShowError;
import java.util.HashMap;

public class AdOperationMetric {
    private static final String AD_IS_HEADER_BIDDING = "is_header_bidding";
    private static final String AD_LOAD_FAIL = "native_load_time_failure";
    private static final String AD_LOAD_START = "native_load_started";
    private static final String AD_LOAD_SUCCESS = "native_load_time_success";
    private static final String AD_LOAD_TYPE = "type";
    private static final String AD_SHOW_FAIL = "native_show_time_failure";
    private static final String AD_SHOW_START = "native_show_started";
    private static final String AD_SHOW_SUCCESS = "native_show_time_success";
    private static final String AD_TYPE_BANNER = "banner";
    private static final String AD_TYPE_VIDEO = "video";
    public static final String INIT_STATE = "state";
    public static final String REASON = "reason";
    private static final String UNKNOWN = "unknown";

    private static HashMap getTags(AdOperationError adOperationError0, boolean z, boolean z1, Boolean boolean0) {
        String s = adOperationError0 == null ? "unknown" : adOperationError0.toString();
        return z1 ? new HashMap() {
            {
                boolean z = z;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                String s = s;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                String s1 = "banner";  // 捕获的参数
                Boolean boolean0 = boolean0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                if(z) {
                    this.put("reason", s);
                }
                this.put("type", s1);
                if(boolean0 != null) {
                    this.put("is_header_bidding", String.valueOf(boolean0));
                }
            }
        } : new HashMap() {
            {
                boolean z = z;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                String s = s;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                String s1 = "video";  // 捕获的参数
                Boolean boolean0 = boolean0;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                if(z) {
                    this.put("reason", s);
                }
                this.put("type", s1);
                if(boolean0 != null) {
                    this.put("is_header_bidding", String.valueOf(boolean0));
                }
            }
        };
    }

    private static AdOperationError mapUnityAdsLoadError(UnityAdsLoadError unityAds$UnityAdsLoadError0) {
        switch(unityAds$UnityAdsLoadError0) {
            case 1: {
                return AdOperationError.init_failed;
            }
            case 2: {
                return AdOperationError.internal;
            }
            case 3: {
                return AdOperationError.invalid;
            }
            case 4: {
                return AdOperationError.no_fill;
            }
            case 5: {
                return AdOperationError.timeout;
            }
            default: {
                return null;
            }
        }
    }

    private static AdOperationError mapUnityAdsShowError(UnityAdsShowError unityAds$UnityAdsShowError0) {
        switch(unityAds$UnityAdsShowError0) {
            case 1: {
                return AdOperationError.init_failed;
            }
            case 2: {
                return AdOperationError.not_ready;
            }
            case 3: {
                return AdOperationError.player;
            }
            case 4: {
                return AdOperationError.invalid;
            }
            case 5: {
                return AdOperationError.no_connection;
            }
            case 6: {
                return AdOperationError.already_showing;
            }
            case 7: {
                return AdOperationError.internal;
            }
            default: {
                return null;
            }
        }
    }

    public static Metric newAdLoadFailure(UnityAdsLoadError unityAds$UnityAdsLoadError0, Long long0, boolean z, boolean z1) {
        return AdOperationMetric.newAdLoadFailure(AdOperationMetric.mapUnityAdsLoadError(unityAds$UnityAdsLoadError0), long0, z, z1);
    }

    public static Metric newAdLoadFailure(AdOperationError adOperationError0, Long long0, boolean z, boolean z1) {
        return new Metric("native_load_time_failure", long0, AdOperationMetric.getTags(adOperationError0, true, z, Boolean.valueOf(z1)));
    }

    public static Metric newAdLoadStart(boolean z, boolean z1) {
        return new Metric("native_load_started", null, AdOperationMetric.getTags(null, false, z, Boolean.valueOf(z1)));
    }

    public static Metric newAdLoadSuccess(Long long0, boolean z, boolean z1) {
        return new Metric("native_load_time_success", long0, AdOperationMetric.getTags(null, false, z, Boolean.valueOf(z1)));
    }

    public static Metric newAdShowFailure(UnityAdsShowError unityAds$UnityAdsShowError0, Long long0) {
        return AdOperationMetric.newAdShowFailure(AdOperationMetric.mapUnityAdsShowError(unityAds$UnityAdsShowError0), long0);
    }

    public static Metric newAdShowFailure(AdOperationError adOperationError0, Long long0) {
        return new Metric("native_show_time_failure", long0, AdOperationMetric.getTags(adOperationError0, true, false, null));
    }

    public static Metric newAdShowStart() {
        return new Metric("native_show_started", null, AdOperationMetric.getTags(null, false, false, null));
    }

    public static Metric newAdShowSuccess(Long long0) {
        return new Metric("native_show_time_success", long0, AdOperationMetric.getTags(null, false, false, null));
    }
}

