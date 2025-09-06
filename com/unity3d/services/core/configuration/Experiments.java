package com.unity3d.services.core.configuration;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public class Experiments extends ExperimentsBase {
    private static final Set NEXT_SESSION_FLAGS;
    private final JSONObject _experimentData;

    static {
        Experiments.NEXT_SESSION_FLAGS = new HashSet(Collections.singletonList("tsi_prw"));
    }

    public Experiments() {
        this(null);
    }

    public Experiments(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            this._experimentData = new JSONObject();
            return;
        }
        this._experimentData = jSONObject0;
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public JSONObject getCurrentSessionExperiments() {
        if(this._experimentData == null) {
            return null;
        }
        HashMap hashMap0 = new HashMap();
        Iterator iterator0 = this._experimentData.keys();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s = (String)object0;
            if(!Experiments.NEXT_SESSION_FLAGS.contains(s)) {
                hashMap0.put(s, String.valueOf(this._experimentData.optBoolean(s)));
            }
        }
        return new JSONObject(hashMap0);
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public Map getExperimentTags() {
        Map map0 = new HashMap();
        Iterator iterator0 = this._experimentData.keys();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            map0.put(((String)object0), String.valueOf(this._experimentData.opt(((String)object0))));
        }
        return map0;
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public JSONObject getExperimentsAsJson() {
        return this._experimentData;
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public JSONObject getNextSessionExperiments() {
        if(this._experimentData == null) {
            return null;
        }
        HashMap hashMap0 = new HashMap();
        Iterator iterator0 = this._experimentData.keys();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s = (String)object0;
            if(Experiments.NEXT_SESSION_FLAGS.contains(s)) {
                hashMap0.put(s, String.valueOf(this._experimentData.optBoolean(s)));
            }
        }
        return new JSONObject(hashMap0);
    }

    // 去混淆评级： 低(20)
    @Override  // com.unity3d.services.core.configuration.IExperiments
    public String getScarBiddingManager() {
        return this._experimentData.optString("scar_bm", "dis");
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public boolean isBoldSdkNextSessionEnabled() {
        return this._experimentData.optBoolean("boldSdkNextSessionEnabled", false);
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public boolean isCaptureHDRCapabilitiesEnabled() {
        return this._experimentData.optBoolean("hdrc", false);
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public boolean isJetpackLifecycle() {
        return this._experimentData.optBoolean("gjl", false);
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public boolean isNativeLoadTimeoutDisabled() {
        return this._experimentData.optBoolean("nltd", false);
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public boolean isNativeShowTimeoutDisabled() {
        return this._experimentData.optBoolean("nstd", false);
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public boolean isOkHttpEnabled() {
        return this._experimentData.optBoolean("okhttp", false);
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public boolean isPCCheckEnabled() {
        return this._experimentData.optBoolean("pc_check", false);
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public boolean isScarBannerHbEnabled() {
        return this._experimentData.optBoolean("scar_bn", false);
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public boolean isScarInitEnabled() {
        return this._experimentData.optBoolean("scar_init", false);
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public boolean isWebAssetAdCaching() {
        return this._experimentData.optBoolean("wac", false);
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public boolean isWebGestureNotRequired() {
        return this._experimentData.optBoolean("wgr", false);
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public boolean isWebMessageEnabled() {
        return this._experimentData.optBoolean("jwm", false);
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public boolean isWebViewAsyncDownloadEnabled() {
        return this._experimentData.optBoolean("wad", false);
    }

    @Override  // com.unity3d.services.core.configuration.IExperiments
    public boolean shouldNativeTokenAwaitPrivacy() {
        return this._experimentData.optBoolean("tsi_prw", false);
    }
}

