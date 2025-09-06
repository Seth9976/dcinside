package com.unity3d.services.core.request.metrics;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class ScarMetric {
    private static final String ASYNC_PREFIX = "async";
    private static final String HB_SIGNALS_FETCH_FAILURE = "native_hb_signals_%s_fetch_failure";
    private static final String HB_SIGNALS_FETCH_START = "native_hb_signals_%s_fetch_start";
    private static final String HB_SIGNALS_FETCH_SUCCESS = "native_hb_signals_%s_fetch_success";
    private static final String HB_SIGNALS_UPLOAD_FAILURE = "native_hb_signals_%s_upload_failure";
    private static final String HB_SIGNALS_UPLOAD_START = "native_hb_signals_%s_upload_start";
    private static final String HB_SIGNALS_UPLOAD_SUCCESS = "native_hb_signals_%s_upload_success";
    private static final String REASON = "reason";
    private static final String SYNC_PREFIX = "sync";
    private static long _fetchStartTime;
    private static long _uploadStartTime;

    private static long getTotalFetchTime() {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - ScarMetric._fetchStartTime);
    }

    private static long getTotalUploadTime() {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - ScarMetric._uploadStartTime);
    }

    // 去混淆评级： 低(20)
    public static Metric hbSignalsFetchFailure(boolean z, String s) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("reason", s);
        return z ? new Metric("native_hb_signals_async_fetch_failure", ScarMetric.getTotalFetchTime(), hashMap0) : new Metric("native_hb_signals_sync_fetch_failure", ScarMetric.getTotalFetchTime(), hashMap0);
    }

    // 去混淆评级： 低(30)
    public static Metric hbSignalsFetchStart(boolean z) {
        ScarMetric._fetchStartTime = System.nanoTime();
        return z ? new Metric("native_hb_signals_async_fetch_start", null) : new Metric("native_hb_signals_sync_fetch_start", null);
    }

    // 去混淆评级： 中等(60)
    public static Metric hbSignalsFetchSuccess(boolean z) {
        return z ? new Metric("native_hb_signals_async_fetch_success", ScarMetric.getTotalFetchTime()) : new Metric("native_hb_signals_sync_fetch_success", ScarMetric.getTotalFetchTime());
    }

    // 去混淆评级： 低(20)
    public static Metric hbSignalsUploadFailure(boolean z, String s) {
        HashMap hashMap0 = new HashMap();
        hashMap0.put("reason", s);
        return z ? new Metric("native_hb_signals_async_upload_failure", ScarMetric.getTotalUploadTime(), hashMap0) : new Metric("native_hb_signals_sync_upload_failure", ScarMetric.getTotalUploadTime(), hashMap0);
    }

    // 去混淆评级： 低(30)
    public static Metric hbSignalsUploadStart(boolean z) {
        ScarMetric._uploadStartTime = System.nanoTime();
        return z ? new Metric("native_hb_signals_async_upload_start", null) : new Metric("native_hb_signals_sync_upload_start", null);
    }

    // 去混淆评级： 中等(60)
    public static Metric hbSignalsUploadSuccess(boolean z) {
        return z ? new Metric("native_hb_signals_async_upload_success", ScarMetric.getTotalUploadTime()) : new Metric("native_hb_signals_sync_upload_success", ScarMetric.getTotalUploadTime());
    }
}

