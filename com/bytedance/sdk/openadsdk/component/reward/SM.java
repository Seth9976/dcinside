package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.PjT.JQp.PjT;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;

public class SM implements PjT {
    private final PAGRewardedAdInteractionListener PjT;
    private final PAGRewardedAdInteractionCallback Zh;

    public SM(PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback0) {
        this.Zh = pAGRewardedAdInteractionCallback0;
        this.PjT = null;
    }

    public SM(PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener0) {
        this.PjT = pAGRewardedAdInteractionListener0;
        this.Zh = null;
    }

    @Override  // com.bytedance.sdk.openadsdk.PjT.JQp.PjT
    public void PjT() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener0 = this.PjT;
        if(pAGRewardedAdInteractionListener0 != null) {
            pAGRewardedAdInteractionListener0.onAdShowed();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.PjT.JQp.PjT
    public void PjT(boolean z, int v, String s, int v1, String s1) {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener0 = this.PjT;
        if(pAGRewardedAdInteractionListener0 != null) {
            if(z) {
                pAGRewardedAdInteractionListener0.onUserEarnedReward(new PAGRewardItem(v, s));
                return;
            }
            pAGRewardedAdInteractionListener0.onUserEarnedRewardFail(v1, s1);
            return;
        }
        PAGRewardedAdInteractionCallback pAGRewardedAdInteractionCallback0 = this.Zh;
        if(pAGRewardedAdInteractionCallback0 != null) {
            if(z) {
                pAGRewardedAdInteractionCallback0.onUserEarnedReward(new PAGRewardItem(v, s));
                return;
            }
            pAGRewardedAdInteractionCallback0.onUserEarnedRewardFail(new PAGErrorModel(v1, s1));
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.PjT.JQp.PjT
    public void Zh() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener0 = this.PjT;
        if(pAGRewardedAdInteractionListener0 != null) {
            pAGRewardedAdInteractionListener0.onAdDismissed();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGRewardedAdInteractionListener pAGRewardedAdInteractionListener0 = this.PjT;
        if(pAGRewardedAdInteractionListener0 != null) {
            pAGRewardedAdInteractionListener0.onAdClicked();
        }
    }
}

