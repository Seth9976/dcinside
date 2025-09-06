package com.unity3d.services.core.configuration;

import com.unity3d.services.core.extensions.AbortRetryException;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.mapper.WebRequestToHttpRequestKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.request.WebRequest;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class PrivacyConfigurationLoader implements IConfigurationLoader {
    private final IConfigurationLoader _configurationLoader;
    private final ConfigurationRequestFactory _configurationRequestFactory;
    private final HttpClient _httpClient;
    private final PrivacyConfigStorage _privacyConfigStorage;

    public PrivacyConfigurationLoader(IConfigurationLoader iConfigurationLoader0, ConfigurationRequestFactory configurationRequestFactory0, PrivacyConfigStorage privacyConfigStorage0, HttpClient httpClient0) {
        this._configurationLoader = iConfigurationLoader0;
        this._configurationRequestFactory = configurationRequestFactory0;
        this._privacyConfigStorage = privacyConfigStorage0;
        this._httpClient = httpClient0;
    }

    @Override  // com.unity3d.services.core.configuration.IConfigurationLoader
    public Configuration getLocalConfiguration() {
        return this._configurationLoader.getLocalConfiguration();
    }

    private void load(IPrivacyConfigurationListener iPrivacyConfigurationListener0) throws Exception {
        WebRequest webRequest0;
        try {
            webRequest0 = this._configurationRequestFactory.getWebRequest();
        }
        catch(Exception exception0) {
            iPrivacyConfigurationListener0.onError(PrivacyCallError.NETWORK_ISSUE, "Could not create web request: " + exception0);
            return;
        }
        HttpRequest httpRequest0 = WebRequestToHttpRequestKt.toHttpRequest(webRequest0);
        InitializeEventsMetricSender.getInstance().didPrivacyConfigRequestStart();
        HttpResponse httpResponse0 = this._httpClient.executeBlocking(httpRequest0);
        try {
            if(httpResponse0.getStatusCode() / 100 == 2) {
                InitializeEventsMetricSender.getInstance().didPrivacyConfigRequestEnd(true);
                iPrivacyConfigurationListener0.onSuccess(new PrivacyConfig(new JSONObject(httpResponse0.getBody().toString())));
                return;
            }
            if(httpResponse0.getStatusCode() == 423) {
                InitializeEventsMetricSender.getInstance().didPrivacyConfigRequestEnd(false);
                iPrivacyConfigurationListener0.onError(PrivacyCallError.LOCKED_423, "Game ID is disabled " + ClientProperties.getGameId());
                return;
            }
            InitializeEventsMetricSender.getInstance().didPrivacyConfigRequestEnd(false);
            iPrivacyConfigurationListener0.onError(PrivacyCallError.NETWORK_ISSUE, "Privacy request failed with code: " + httpResponse0.getStatusCode());
        }
        catch(Exception unused_ex) {
            InitializeEventsMetricSender.getInstance().didPrivacyConfigRequestEnd(false);
            iPrivacyConfigurationListener0.onError(PrivacyCallError.NETWORK_ISSUE, "Could not create web request");
        }
    }

    @Override  // com.unity3d.services.core.configuration.IConfigurationLoader
    public void loadConfiguration(IConfigurationLoaderListener iConfigurationLoaderListener0) throws Exception {
        AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
        if(this._privacyConfigStorage.getPrivacyConfig().getPrivacyStatus() == PrivacyConfigStatus.UNKNOWN) {
            this.load(new IPrivacyConfigurationListener() {
                @Override  // com.unity3d.services.core.configuration.IPrivacyConfigurationListener
                public void onError(PrivacyCallError privacyCallError0, String s) {
                    DeviceLog.warning(("Couldn\'t fetch privacy configuration: " + s));
                    PrivacyConfigurationLoader.this._privacyConfigStorage.setPrivacyConfig(new PrivacyConfig());
                    if(privacyCallError0 == PrivacyCallError.LOCKED_423) {
                        atomicBoolean0.set(true);
                    }
                }

                @Override  // com.unity3d.services.core.configuration.IPrivacyConfigurationListener
                public void onSuccess(PrivacyConfig privacyConfig0) {
                    PrivacyConfigurationLoader.this._privacyConfigStorage.setPrivacyConfig(privacyConfig0);
                }
            });
        }
        if(atomicBoolean0.get()) {
            throw new AbortRetryException("Game is disabled");
        }
        this._configurationLoader.loadConfiguration(iConfigurationLoaderListener0);
    }
}

