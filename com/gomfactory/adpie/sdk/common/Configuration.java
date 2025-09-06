package com.gomfactory.adpie.sdk.common;

public class Configuration {
    private String adpieConfigUrl;
    private boolean adpieSdkLog;
    private boolean adpieServerLog;
    private String adpieSspUrl;

    public Configuration() {
        this.adpieConfigUrl = "https://adp.adpies.com/adp/config";
        this.adpieSspUrl = "https://ssp.adpies.com/ssp/request";
    }

    public String getAdpieConfigUrl() [...] // 潜在的解密器

    public String getAdpieSspUrl() [...] // 潜在的解密器

    public boolean isAdpieSdkLog() {
        return this.adpieSdkLog;
    }

    public boolean isAdpieServerLog() {
        return this.adpieServerLog;
    }

    public void setAdpieConfigUrl(String s) {
        this.adpieConfigUrl = s;
    }

    public void setAdpieSdkLog(boolean z) {
        this.adpieSdkLog = z;
    }

    public void setAdpieServerLog(boolean z) {
        this.adpieServerLog = z;
    }

    public void setAdpieSspUrl(String s) {
        this.adpieSspUrl = s;
    }
}

