package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.signals.b;
import com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import org.json.JSONException;
import org.json.JSONObject;

public class BiddingSignalsHandler implements b {
    private final boolean isBannerEnabled;
    private final IBiddingSignalsListener listener;

    public BiddingSignalsHandler(boolean z, IBiddingSignalsListener iBiddingSignalsListener0) {
        this.listener = iBiddingSignalsListener0;
        this.isBannerEnabled = z;
    }

    private String getSignalFromJson(JSONObject jSONObject0, String s) {
        return jSONObject0.optString(s);
    }

    private BiddingSignals getSignals(String s) {
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            return this.isBannerEnabled ? new BiddingSignals(this.getSignalFromJson(jSONObject0, "gmaScarBiddingRewardedSignal"), this.getSignalFromJson(jSONObject0, "gmaScarBiddingInterstitialSignal"), this.getSignalFromJson(jSONObject0, "gmaScarBiddingBannerSignal")) : new BiddingSignals(this.getSignalFromJson(jSONObject0, "gmaScarBiddingRewardedSignal"), this.getSignalFromJson(jSONObject0, "gmaScarBiddingInterstitialSignal"));
        }
        catch(JSONException unused_ex) {
            return null;
        }
    }

    @Override  // com.unity3d.scar.adapter.common.signals.b
    public void onSignalsCollected(String s) {
        BiddingSignals biddingSignals0 = this.getSignals(s);
        this.listener.onSignalsReady(biddingSignals0);
    }

    @Override  // com.unity3d.scar.adapter.common.signals.b
    public void onSignalsCollectionFailed(String s) {
        this.listener.onSignalsFailure(s);
    }
}

