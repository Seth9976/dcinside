package com.unity3d.services.core.webview;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class WebViewUrlBuilder {
    private final SDKMetricsSender _sdkMetricsSender;
    private final String _urlWithQueryString;

    public WebViewUrlBuilder(String s, Configuration configuration0) {
        this._sdkMetricsSender = (SDKMetricsSender)Utilities.getService(SDKMetricsSender.class);
        this._urlWithQueryString = s + ("?platform=android" + this.buildQueryParam("origin", configuration0.getWebViewUrl()) + this.buildQueryParam("version", configuration0.getWebViewVersion()) + this.buildQueryParam("isNativeCollectingMetrics", String.valueOf(configuration0.areMetricsEnabledForCurrentSession())));
    }

    private String buildQueryParam(String s, String s1) {
        if(s1 != null) {
            try {
                return "&" + s + "=" + URLEncoder.encode(s1, "UTF-8");
            }
            catch(UnsupportedEncodingException unsupportedEncodingException0) {
                DeviceLog.exception(String.format("Unsupported charset when encoding %s", s), unsupportedEncodingException0);
            }
        }
        return "";
    }

    public String getUrlWithQueryString() {
        return this._urlWithQueryString;
    }
}

