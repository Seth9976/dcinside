package com.unity3d.services.core.request.metrics;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.PrivacyConfig;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager.StorageType;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.IObserver;
import java.util.HashMap;
import java.util.Map;

public class MetricCommonTags {
    private static final String METRIC_COMMON_TAG_CONFIG_SOURCE = "src";
    private static final String METRIC_COMMON_TAG_COUNTRY_ISO = "iso";
    private static final String METRIC_COMMON_TAG_MEDIATION_ADAPTER = "m_ad_ver";
    private static final String METRIC_COMMON_TAG_MEDIATION_NAME = "m_name";
    private static final String METRIC_COMMON_TAG_MEDIATION_VERSION = "m_ver";
    private static final String METRIC_COMMON_TAG_PLATFORM = "plt";
    public static final String METRIC_COMMON_TAG_PLATFORM_ANDROID = "android";
    private static final String METRIC_COMMON_TAG_PRIVACY_MODE = "prvc";
    private static final String METRIC_COMMON_TAG_SDK_VERSION = "sdk";
    private static final String METRIC_COMMON_TAG_SYSTEM_VERSION = "system";
    private static final String METRIC_COMMON_TAG_TEST_MODE = "tm";
    private String _configSrc;
    private final String _countryISO;
    private Map _experiments;
    private String _mediationAdapter;
    private String _mediationName;
    private String _mediationVersion;
    private final String _platform;
    private String _privacyMode;
    private final IObserver _privacyObserver;
    private final String _sdkVersion;
    private final String _systemVersion;
    private final boolean _testMode;

    public MetricCommonTags() {
        com.unity3d.services.core.request.metrics.MetricCommonTags.1 metricCommonTags$10 = new IObserver() {
            public void updated(PrivacyConfig privacyConfig0) {
                MetricCommonTags.this._privacyMode = privacyConfig0.getPrivacyStatus().toString().toLowerCase();
            }

            @Override  // com.unity3d.services.core.misc.IObserver
            public void updated(Object object0) {
                this.updated(((PrivacyConfig)object0));
            }
        };
        this._privacyObserver = metricCommonTags$10;
        this._countryISO = "";
        this._platform = "android";
        this._sdkVersion = "4.14.1";
        this._systemVersion = Device.getOsVersion();
        this._privacyMode = "unknown";
        this._testMode = false;
        PrivacyConfigStorage.getInstance().registerObserver(metricCommonTags$10);
    }

    private boolean mediationIsEmpty() {
        return this._mediationName == null || this._mediationName.isEmpty();
    }

    private void refreshMediationData() {
        try {
            Storage storage0 = StorageManager.getStorage(StorageType.PUBLIC);
            if(storage0 != null && storage0.initStorage()) {
                this._mediationName = (String)storage0.get("mediation.name.value");
                this._mediationVersion = (String)storage0.get("mediation.version.value");
                this._mediationAdapter = (String)storage0.get("mediation.adapter_version.value");
            }
        }
        catch(Exception exception0) {
            DeviceLog.debug("Failed to refreshMediationData: %s", new Object[]{exception0.getLocalizedMessage()});
        }
    }

    public void shutdown() {
        PrivacyConfigStorage.getInstance().unregisterObserver(this._privacyObserver);
    }

    public Map toMap() {
        if(this.mediationIsEmpty()) {
            this.refreshMediationData();
        }
        Map map0 = new HashMap();
        String s = this._countryISO;
        if(s != null) {
            map0.put("iso", s);
        }
        String s1 = this._platform;
        if(s1 != null) {
            map0.put("plt", s1);
        }
        String s2 = this._sdkVersion;
        if(s2 != null) {
            map0.put("sdk", s2);
        }
        String s3 = this._systemVersion;
        if(s3 != null) {
            map0.put("system", s3);
        }
        String s4 = this._privacyMode;
        if(s4 != null) {
            map0.put("prvc", s4);
        }
        String s5 = this._configSrc;
        if(s5 != null) {
            map0.put("src", s5);
        }
        String s6 = this._mediationName;
        if(s6 != null) {
            map0.put("m_name", s6);
        }
        String s7 = this._mediationVersion;
        if(s7 != null) {
            map0.put("m_ver", s7);
        }
        String s8 = this._mediationAdapter;
        if(s8 != null) {
            map0.put("m_ad_ver", s8);
        }
        Map map1 = this._experiments;
        if(map1 != null) {
            map0.putAll(map1);
        }
        map0.put("tm", String.valueOf(this._testMode));
        return map0;
    }

    public void updateWithConfig(Configuration configuration0) {
        this._configSrc = "";
        if(configuration0.getExperiments() != null) {
            this._experiments = configuration0.getExperiments().getExperimentTags();
        }
    }
}

