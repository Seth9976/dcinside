package com.unity3d.services.core.configuration;

import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.mapper.WebRequestToHttpRequestKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.request.WebRequest;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.request.metrics.TSIMetric;
import org.json.JSONObject;

public class ConfigurationLoader implements IConfigurationLoader {
    private final ConfigurationRequestFactory _configurationRequestFactory;
    private final HttpClient _httpClient;
    private final Configuration _localConfiguration;
    private final SDKMetricsSender _sdkMetricsSender;

    public ConfigurationLoader(ConfigurationRequestFactory configurationRequestFactory0, SDKMetricsSender sDKMetricsSender0, HttpClient httpClient0) {
        this._localConfiguration = configurationRequestFactory0.getConfiguration();
        this._configurationRequestFactory = configurationRequestFactory0;
        this._sdkMetricsSender = sDKMetricsSender0;
        this._httpClient = httpClient0;
    }

    @Override  // com.unity3d.services.core.configuration.IConfigurationLoader
    public Configuration getLocalConfiguration() {
        return this._localConfiguration;
    }

    @Override  // com.unity3d.services.core.configuration.IConfigurationLoader
    public void loadConfiguration(IConfigurationLoaderListener iConfigurationLoaderListener0) throws Exception {
        WebRequest webRequest0;
        try {
            webRequest0 = this._configurationRequestFactory.getWebRequest();
        }
        catch(Exception exception0) {
            iConfigurationLoaderListener0.onError("Could not create web request: " + exception0);
            return;
        }
        HttpRequest httpRequest0 = WebRequestToHttpRequestKt.toHttpRequest(webRequest0);
        InitializeEventsMetricSender.getInstance().didConfigRequestStart();
        HttpResponse httpResponse0 = this._httpClient.executeBlocking(httpRequest0);
        String s = httpResponse0.getBody().toString();
        if(httpResponse0.getStatusCode() / 100 == 2) {
            try {
                JSONObject jSONObject0 = new JSONObject(s);
                this._localConfiguration.handleConfigurationData(jSONObject0, true);
            }
            catch(Exception unused_ex) {
                iConfigurationLoaderListener0.onError("Could not create web request");
                return;
            }
            this.sendConfigMetrics(this._localConfiguration.getUnifiedAuctionToken(), "");
            iConfigurationLoaderListener0.onSuccess(this._localConfiguration);
            return;
        }
        iConfigurationLoaderListener0.onError("Non 2xx HTTP status received from ads configuration request.");
    }

    private void sendConfigMetrics(String s, String s1) {
        if(s == null || s.isEmpty()) {
            Metric metric0 = TSIMetric.newMissingToken();
            this._sdkMetricsSender.sendMetric(metric0);
        }
        if(s1 == null || s1.isEmpty()) {
            Metric metric1 = TSIMetric.newMissingStateId();
            this._sdkMetricsSender.sendMetric(metric1);
        }
    }
}

