package com.unity3d.services.core.configuration;

import android.text.TextUtils;
import com.unity3d.services.ads.configuration.AdsModuleConfiguration;
import com.unity3d.services.analytics.core.configuration.AnalyticsModuleConfiguration;
import com.unity3d.services.banners.configuration.BannersModuleConfiguration;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.mapper.WebRequestToHttpRequestKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.store.core.configuration.StoreModuleConfiguration;
import java.io.File;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

public class Configuration {
    private String _configUrl;
    private ConfigurationRequestFactory _configurationRequestFactory;
    private int _connectedEventThresholdInMs;
    private boolean _delayWebViewUpdate;
    private ExperimentsReader _experimentReader;
    private String _filteredJsonString;
    private int _loadTimeout;
    private int _maxRetries;
    private int _maximumConnectedEvents;
    private double _metricSampleRate;
    private Boolean _metricsEnabled;
    private String _metricsUrl;
    private final Class[] _moduleConfigurationList;
    private Map _moduleConfigurations;
    private long _networkErrorTimeout;
    private int _privacyRequestWaitTimeout;
    private JSONObject _rawJsonData;
    private int _resetWebAppTimeout;
    private long _retryDelay;
    private double _retryScalingFactor;
    private String _sTkn;
    private String _scarBiddingUrl;
    private String _sdkVersion;
    private int _showTimeout;
    private String _src;
    private String _stateId;
    private int _tokenTimeout;
    private String _unifiedAuctionToken;
    private Class[] _webAppApiClassList;
    private long _webViewAppCreateTimeout;
    private int _webViewBridgeTimeout;
    private String _webViewData;
    private String _webViewHash;
    private String _webViewUrl;
    private String _webViewVersion;

    public Configuration() {
        this._moduleConfigurationList = new Class[]{CoreModuleConfiguration.class, AdsModuleConfiguration.class, AnalyticsModuleConfiguration.class, BannersModuleConfiguration.class, StoreModuleConfiguration.class};
        this._experimentReader = new ExperimentsReader();
        this.setOptionalFields(new JSONObject(), false);
    }

    public Configuration(String s) {
        this(s, new Experiments());
    }

    public Configuration(String s, ExperimentsReader experimentsReader0) {
        this(s, experimentsReader0.getCurrentlyActiveExperiments());
        this._experimentReader = experimentsReader0;
    }

    public Configuration(String s, IExperiments iExperiments0) {
        this._configUrl = s;
        this._configurationRequestFactory = new ConfigurationRequestFactory(this);
        this._experimentReader.updateLocalExperiments(iExperiments0);
    }

    public Configuration(JSONObject jSONObject0) throws MalformedURLException, JSONException {
        this._moduleConfigurationList = new Class[]{CoreModuleConfiguration.class, AdsModuleConfiguration.class, AnalyticsModuleConfiguration.class, BannersModuleConfiguration.class, StoreModuleConfiguration.class};
        this._experimentReader = new ExperimentsReader();
        this.handleConfigurationData(jSONObject0, false);
    }

    public Boolean areMetricsEnabledForCurrentSession() {
        return this._metricsEnabled;
    }

    private void createWebAppApiClassList() {
        ArrayList arrayList0 = new ArrayList();
        Class[] arr_class = this.getModuleConfigurationList();
        for(int v = 0; v < arr_class.length; ++v) {
            IModuleConfiguration iModuleConfiguration0 = this.getModuleConfiguration(arr_class[v]);
            if(iModuleConfiguration0 != null && iModuleConfiguration0.getWebAppApiClassList() != null) {
                arrayList0.addAll(Arrays.asList(iModuleConfiguration0.getWebAppApiClassList()));
            }
        }
        this._webAppApiClassList = (Class[])arrayList0.toArray(new Class[arrayList0.size()]);
    }

    public void deleteFromDisk() {
        File file0 = new File("");
        if(file0.exists()) {
            file0.delete();
        }
    }

    public String getConfigUrl() {
        return this._configUrl;
    }

    public int getConnectedEventThreshold() {
        return this._connectedEventThresholdInMs;
    }

    public boolean getDelayWebViewUpdate() {
        return this._delayWebViewUpdate;
    }

    public IExperiments getExperiments() {
        return this._experimentReader.getCurrentlyActiveExperiments();
    }

    public ExperimentsReader getExperimentsReader() {
        return this._experimentReader;
    }

    private JSONObject getFilteredConfigJson(JSONObject jSONObject0) throws JSONException {
        JSONObject jSONObject1 = new JSONObject();
        Iterator iterator0 = jSONObject0.keys();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s = (String)object0;
            Object object1 = jSONObject0.opt(s);
            if(!s.equalsIgnoreCase("tkn") && !s.equalsIgnoreCase("sid") && !s.equalsIgnoreCase("srr") && !s.equalsIgnoreCase("sTkn")) {
                jSONObject1.put(s, object1);
            }
        }
        return jSONObject1;
    }

    public String getFilteredJsonString() {
        return this._filteredJsonString;
    }

    public int getLoadTimeout() {
        return this._loadTimeout;
    }

    public int getMaxRetries() {
        return this._maxRetries;
    }

    public int getMaximumConnectedEvents() {
        return this._maximumConnectedEvents;
    }

    public double getMetricSampleRate() {
        return this._metricSampleRate;
    }

    public String getMetricsUrl() [...] // 潜在的解密器

    public IModuleConfiguration getModuleConfiguration(Class class0) {
        if(this._moduleConfigurations != null && this._moduleConfigurations.containsKey(class0)) {
            return (IModuleConfiguration)this._moduleConfigurations.get(class0);
        }
        try {
            IModuleConfiguration iModuleConfiguration0 = (IModuleConfiguration)class0.newInstance();
            if(iModuleConfiguration0 != null) {
                if(this._moduleConfigurations == null) {
                    HashMap hashMap0 = new HashMap();
                    this._moduleConfigurations = hashMap0;
                    hashMap0.put(class0.getName(), iModuleConfiguration0);
                }
                return iModuleConfiguration0;
            }
        }
        catch(Exception unused_ex) {
        }
        return null;
    }

    public Class[] getModuleConfigurationList() {
        return this._moduleConfigurationList;
    }

    public long getNetworkErrorTimeout() {
        return this._networkErrorTimeout;
    }

    public int getPrivacyRequestWaitTimeout() {
        return this._privacyRequestWaitTimeout;
    }

    public JSONObject getRawConfigData() {
        return this._rawJsonData;
    }

    public int getResetWebappTimeout() {
        return this._resetWebAppTimeout;
    }

    public long getRetryDelay() {
        return this._retryDelay;
    }

    public double getRetryScalingFactor() {
        return this._retryScalingFactor;
    }

    public String getScarBiddingUrl() [...] // 潜在的解密器

    public String getSdkVersion() [...] // 潜在的解密器

    public String getSessionToken() {
        return this._sTkn;
    }

    public int getShowTimeout() {
        return this._showTimeout;
    }

    public String getSrc() [...] // 潜在的解密器

    public String getStateId() [...] // 潜在的解密器

    public int getTokenTimeout() {
        return this._tokenTimeout;
    }

    public String getUnifiedAuctionToken() {
        return this._unifiedAuctionToken;
    }

    public Class[] getWebAppApiClassList() {
        if(this._webAppApiClassList == null) {
            this.createWebAppApiClassList();
        }
        return this._webAppApiClassList;
    }

    public long getWebViewAppCreateTimeout() {
        return this._webViewAppCreateTimeout;
    }

    public int getWebViewBridgeTimeout() {
        return this._webViewBridgeTimeout;
    }

    public String getWebViewData() {
        return this._webViewData;
    }

    public String getWebViewHash() {
        return this._webViewHash;
    }

    public String getWebViewUrl() {
        return this._webViewUrl;
    }

    public String getWebViewVersion() {
        return this._webViewVersion;
    }

    protected void handleConfigurationData(JSONObject jSONObject0, boolean z) throws MalformedURLException, JSONException {
        String s1;
        String s = null;
        try {
            s1 = null;
            if(!jSONObject0.isNull("url")) {
                s = jSONObject0.getString("url");
            }
        }
        catch(JSONException unused_ex) {
        }
        if(TextUtils.isEmpty(s)) {
            throw new MalformedURLException("WebView URL is null or empty");
        }
        try {
            this._webViewUrl = s;
            this._webViewHash = jSONObject0.isNull("hash") ? null : jSONObject0.getString("hash");
        }
        catch(JSONException unused_ex) {
            this._webViewHash = null;
        }
        this._unifiedAuctionToken = jSONObject0.isNull("tkn") ? null : jSONObject0.optString("tkn");
        this._stateId = jSONObject0.isNull("sid") ? null : jSONObject0.optString("sid");
        if(!jSONObject0.isNull("sTkn")) {
            s1 = jSONObject0.optString("sTkn");
        }
        this._sTkn = s1;
        this.setOptionalFields(jSONObject0, z);
        this._filteredJsonString = this.getFilteredConfigJson(jSONObject0).toString();
        this._rawJsonData = jSONObject0;
    }

    public void makeRequest() throws Exception {
        if(this._configUrl == null) {
            throw new MalformedURLException("Base URL is null");
        }
        HttpRequest httpRequest0 = WebRequestToHttpRequestKt.toHttpRequest(this._configurationRequestFactory.getWebRequest());
        InitializeEventsMetricSender.getInstance().didConfigRequestStart();
        String s = ((HttpClient)Utilities.getService(HttpClient.class)).executeBlocking(httpRequest0).getBody().toString();
        try {
            this.handleConfigurationData(new JSONObject(s), true);
        }
        catch(Exception exception0) {
            InitializeEventsMetricSender.getInstance().didConfigRequestEnd(false);
            throw exception0;
        }
        InitializeEventsMetricSender.getInstance().didConfigRequestEnd(true);
        this.saveToDisk();
    }

    public void saveToDisk() {
        Utilities.writeFile(new File(""), this.getFilteredJsonString());
    }

    private void setOptionalFields(JSONObject jSONObject0, boolean z) {
        this._webViewVersion = jSONObject0.optString("version", null);
        boolean z1 = false;
        this._delayWebViewUpdate = jSONObject0.optBoolean("dwu", false);
        this._resetWebAppTimeout = jSONObject0.optInt("rwt", 10000);
        this._maxRetries = jSONObject0.optInt("mr", 6);
        this._retryDelay = jSONObject0.optLong("rd", 5000L);
        this._retryScalingFactor = jSONObject0.optDouble("rcf", 2.0);
        this._connectedEventThresholdInMs = jSONObject0.optInt("cet", 10000);
        this._maximumConnectedEvents = jSONObject0.optInt("mce", 500);
        this._networkErrorTimeout = jSONObject0.optLong("net", 60000L);
        this._sdkVersion = jSONObject0.optString("sdkv", "");
        this._showTimeout = jSONObject0.optInt("sto", 10000);
        this._loadTimeout = jSONObject0.optInt("lto", 30000);
        this._webViewBridgeTimeout = jSONObject0.optInt("wto", 5000);
        this._metricsUrl = jSONObject0.optString("murl", "");
        this._metricSampleRate = jSONObject0.optDouble("msr", 100.0);
        this._webViewAppCreateTimeout = jSONObject0.optLong("wct", 60000L);
        this._tokenTimeout = jSONObject0.optInt("tto", 5000);
        this._privacyRequestWaitTimeout = jSONObject0.optInt("prwto", 3000);
        this._src = jSONObject0.optString("src", null);
        this._scarBiddingUrl = jSONObject0.optString("scurl", "https://scar.unityads.unity3d.com/v1/capture-scar-signals");
        if(this._metricSampleRate >= ((double)(new Random().nextInt(99) + 1))) {
            z1 = true;
        }
        this._metricsEnabled = Boolean.valueOf(z1);
        ExperimentObjects experimentObjects0 = jSONObject0.has("expo") ? new ExperimentObjects(jSONObject0.optJSONObject("expo")) : new Experiments(jSONObject0.optJSONObject("exp"));
        if(z) {
            this._experimentReader.updateRemoteExperiments(experimentObjects0);
            return;
        }
        this._experimentReader.updateLocalExperiments(experimentObjects0);
    }

    public void setWebViewData(String s) {
        this._webViewData = s;
    }

    public void setWebViewHash(String s) {
        this._webViewHash = s;
    }

    public void setWebViewUrl(String s) {
        this._webViewUrl = s;
    }
}

