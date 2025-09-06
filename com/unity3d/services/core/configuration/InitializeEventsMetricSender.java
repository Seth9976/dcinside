package com.unity3d.services.core.configuration;

import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.request.metrics.TSIMetric;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class InitializeEventsMetricSender implements IInitializationListener, IInitializeEventsMetricSender {
    private long _configEndTime;
    private int _configRetryCount;
    private long _configStartTime;
    private boolean _initMetricSent;
    private static InitializeEventsMetricSender _instance;
    private long _privacyConfigEndTime;
    private long _privacyConfigStartTime;
    private final SDKMetricsSender _sdkMetricsSender;
    private long _startTime;
    private boolean _tokenMetricSent;
    private int _webviewRetryCount;

    private InitializeEventsMetricSender() {
        this._startTime = 0L;
        this._privacyConfigStartTime = 0L;
        this._privacyConfigEndTime = 0L;
        this._configStartTime = 0L;
        this._configEndTime = 0L;
        this._configRetryCount = 0;
        this._webviewRetryCount = 0;
        this._initMetricSent = false;
        this._tokenMetricSent = false;
        this._sdkMetricsSender = (SDKMetricsSender)Utilities.getService(SDKMetricsSender.class);
        InitializationNotificationCenter.getInstance().addListener(this);
    }

    @Override  // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public Long configRequestDuration() {
        return TimeUnit.NANOSECONDS.toMillis(this._configEndTime - this._configStartTime);
    }

    @Override  // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void didConfigRequestEnd(boolean z) {
        this._configEndTime = System.nanoTime();
        this.sendConfigResolutionRequestIfNeeded(z);
    }

    @Override  // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void didConfigRequestStart() {
        this._configStartTime = System.nanoTime();
    }

    @Override  // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void didInitStart() {
        this._startTime = System.nanoTime();
        this._configRetryCount = 0;
        this._webviewRetryCount = 0;
        this.sendMetric(TSIMetric.newInitStarted());
    }

    @Override  // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void didPrivacyConfigRequestEnd(boolean z) {
        this._privacyConfigEndTime = System.nanoTime();
        this.sendPrivacyResolutionRequestIfNeeded(z);
    }

    @Override  // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void didPrivacyConfigRequestStart() {
        this._privacyConfigStartTime = System.nanoTime();
    }

    @Override  // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public Long duration() {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this._startTime);
    }

    public Map getErrorStateTags(ErrorState errorState0) {
        Map map0 = this.getRetryTags();
        map0.put("stt", errorState0.getMetricName());
        return map0;
    }

    public static IInitializeEventsMetricSender getInstance() {
        if(InitializeEventsMetricSender._instance == null) {
            InitializeEventsMetricSender._instance = new InitializeEventsMetricSender();
        }
        return InitializeEventsMetricSender._instance;
    }

    // 去混淆评级： 低(20)
    private Metric getPrivacyRequestMetric(boolean z) {
        return z ? TSIMetric.newPrivacyRequestLatencySuccess(this.privacyConfigDuration()) : TSIMetric.newPrivacyRequestLatencyFailure(this.privacyConfigDuration());
    }

    @Override  // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public Map getRetryTags() {
        return new HashMap() {
            {
                this.put("c_retry", String.valueOf(initializeEventsMetricSender0._configRetryCount));
                this.put("wv_retry", String.valueOf(initializeEventsMetricSender0._webviewRetryCount));
            }
        };
    }

    @Override  // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public Long initializationStartTimeStamp() {
        return this._startTime;
    }

    @Override  // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void onRetryConfig() {
        ++this._configRetryCount;
    }

    @Override  // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void onRetryWebview() {
        ++this._webviewRetryCount;
    }

    @Override  // com.unity3d.services.core.configuration.IInitializationListener
    public void onSdkInitializationFailed(String s, ErrorState errorState0, int v) {
        this.sdkInitializeFailed(s, errorState0);
    }

    @Override  // com.unity3d.services.core.configuration.IInitializationListener
    public void onSdkInitialized() {
        this.sdkDidInitialize();
    }

    @Override  // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public Long privacyConfigDuration() {
        return TimeUnit.NANOSECONDS.toMillis(this._privacyConfigEndTime - this._privacyConfigStartTime);
    }

    @Override  // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void sdkDidInitialize() {
        synchronized(this) {
            if(((long)this.initializationStartTimeStamp()) == 0L) {
                DeviceLog.debug("sdkDidInitialize called before didInitStart, skipping metric");
            }
        }
    }

    @Override  // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void sdkInitializeFailed(String s, ErrorState errorState0) {
        synchronized(this) {
            if(this._startTime == 0L) {
                DeviceLog.debug("sdkInitializeFailed called before didInitStart, skipping metric");
            }
        }
    }

    @Override  // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void sdkTokenDidBecomeAvailableWithConfig(boolean z) {
        synchronized(this) {
            if(!this._tokenMetricSent) {
                this.sendTokenAvailabilityMetricWithConfig(z);
                if(z) {
                    this.sendTokenResolutionRequestMetricIfNeeded();
                }
                this._tokenMetricSent = true;
            }
        }
    }

    private void sendConfigResolutionRequestIfNeeded(boolean z) {
        if(this._configStartTime != 0L && this._configEndTime != 0L) {
            if(z) {
                this.sendMetric(TSIMetric.newConfigRequestLatencySuccess(this.configRequestDuration()));
                return;
            }
            this.sendMetric(TSIMetric.newConfigRequestLatencyFailure(this.configRequestDuration()));
            return;
        }
        DeviceLog.debug("sendConfigResolutionRequestIfNeeded called with invalid timestamps, skipping metric");
    }

    @Override  // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public void sendMetric(Metric metric0) {
        this._sdkMetricsSender.sendMetric(metric0);
    }

    private void sendPrivacyResolutionRequestIfNeeded(boolean z) {
        if(this._privacyConfigStartTime != 0L && this._privacyConfigEndTime != 0L) {
            this.sendMetric(this.getPrivacyRequestMetric(z));
            return;
        }
        DeviceLog.debug("sendPrivacyResolutionRequestIfNeeded called with invalid timestamps, skipping metric");
    }

    private void sendTokenAvailabilityMetricWithConfig(boolean z) {
        if(this._startTime == 0L) {
            DeviceLog.debug("sendTokenAvailabilityMetricWithConfig called before didInitStart, skipping metric");
            return;
        }
        Long long0 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this._startTime);
        Map map0 = this.getRetryTags();
        this.sendMetric((z ? TSIMetric.newTokenAvailabilityLatencyConfig(long0, map0) : TSIMetric.newTokenAvailabilityLatencyWebview(long0, map0)));
    }

    private void sendTokenResolutionRequestMetricIfNeeded() {
        if(this._configStartTime == 0L) {
            DeviceLog.debug("sendTokenResolutionRequestMetricIfNeeded called before didInitStart, skipping metric");
            return;
        }
        this.sendMetric(TSIMetric.newTokenResolutionRequestLatency(this.tokenDuration(), this.getRetryTags()));
    }

    @Override  // com.unity3d.services.core.configuration.IInitializeEventsMetricSender
    public Long tokenDuration() {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this._configStartTime);
    }
}

