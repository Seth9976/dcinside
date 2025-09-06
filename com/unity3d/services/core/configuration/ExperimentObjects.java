package com.unity3d.services.core.configuration;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import org.json.JSONObject;

public class ExperimentObjects extends ExperimentsBase {
    private final Map _experimentObjects;
    private final JSONObject _experimentObjetsData;

    public ExperimentObjects(JSONObject jSONObject0) {
        this._experimentObjects = new HashMap();
        if(jSONObject0 != null) {
            this._experimentObjetsData = jSONObject0;
            Iterator iterator0 = jSONObject0.keys();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                ExperimentObject experimentObject0 = new ExperimentObject(jSONObject0.optJSONObject(((String)object0)));
                this._experimentObjects.put(((String)object0), experimentObject0);
            }
            return;
        }
        this._experimentObjetsData = new JSONObject();
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public JSONObject getCurrentSessionExperiments() {
        return this.getExperimentWithAppliedRule(ExperimentAppliedRule.IMMEDIATE);
    }

    public ExperimentObject getExperimentObject(String s) {
        return (ExperimentObject)this._experimentObjects.get(s);
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public Map getExperimentTags() {
        Map map0 = new HashMap();
        for(Object object0: this._experimentObjects.entrySet()) {
            map0.put(((String)((Map.Entry)object0).getKey()), ((ExperimentObject)((Map.Entry)object0).getValue()).getStringValue());
        }
        return map0;
    }

    private String getExperimentValue(String s, String s1) {
        ExperimentObject experimentObject0 = this.getExperimentObject(s);
        return experimentObject0 == null ? s1 : experimentObject0.getStringValue();
    }

    private boolean getExperimentValue(String s, boolean z) {
        ExperimentObject experimentObject0 = this.getExperimentObject(s);
        return experimentObject0 == null ? z : experimentObject0.getBooleanValue();
    }

    private boolean getExperimentValueOrDefault(String s) {
        return this.getExperimentValue(s, false);
    }

    private JSONObject getExperimentWithAppliedRule(ExperimentAppliedRule experimentAppliedRule0) {
        HashMap hashMap0 = new HashMap();
        for(Object object0: this._experimentObjects.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(((ExperimentObject)map$Entry0.getValue()).getAppliedRule() == experimentAppliedRule0) {
                hashMap0.put(((String)map$Entry0.getKey()), ((ExperimentObject)map$Entry0.getValue()).getStringValue());
            }
        }
        return new JSONObject(hashMap0);
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public JSONObject getExperimentsAsJson() {
        return this._experimentObjetsData;
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public JSONObject getNextSessionExperiments() {
        return this.getExperimentWithAppliedRule(ExperimentAppliedRule.NEXT);
    }

    // 去混淆评级： 低(20)
    @Override  // com.unity3d.services.core.configuration.IExperiments
    public String getScarBiddingManager() {
        return this.getExperimentValue("scar_bm", "dis");
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public boolean isBoldSdkNextSessionEnabled() {
        return this.getExperimentValueOrDefault("boldSdkNextSessionEnabled");
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public boolean isCaptureHDRCapabilitiesEnabled() {
        return this.getExperimentValueOrDefault("hdrc");
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public boolean isJetpackLifecycle() {
        return this.getExperimentValueOrDefault("gjl");
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public boolean isNativeLoadTimeoutDisabled() {
        return this.getExperimentValueOrDefault("nltd");
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public boolean isNativeShowTimeoutDisabled() {
        return this.getExperimentValueOrDefault("nstd");
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public boolean isOkHttpEnabled() {
        return this.getExperimentValueOrDefault("okhttp");
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public boolean isPCCheckEnabled() {
        return this.getExperimentValueOrDefault("pc_check");
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public boolean isScarBannerHbEnabled() {
        return this.getExperimentValueOrDefault("scar_bn");
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public boolean isScarInitEnabled() {
        return this.getExperimentValueOrDefault("scar_init");
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public boolean isWebAssetAdCaching() {
        return this.getExperimentValueOrDefault("wac");
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public boolean isWebGestureNotRequired() {
        return this.getExperimentValueOrDefault("wgr");
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public boolean isWebMessageEnabled() {
        return this.getExperimentValueOrDefault("jwm");
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public boolean isWebViewAsyncDownloadEnabled() {
        return this.getExperimentValueOrDefault("wad");
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public boolean shouldNativeTokenAwaitPrivacy() {
        return this.getExperimentValueOrDefault("tsi_prw");
    }
}

