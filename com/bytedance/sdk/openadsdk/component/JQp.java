package com.bytedance.sdk.openadsdk.component;

import com.bytedance.sdk.openadsdk.PjT.cr.Zh;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import java.util.concurrent.atomic.AtomicBoolean;

public class JQp implements Zh {
    private final PAGAppOpenAdInteractionListener PjT;
    private final AtomicBoolean Zh;

    public JQp(PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener0) {
        this.Zh = new AtomicBoolean(false);
        this.PjT = pAGAppOpenAdInteractionListener0;
    }

    @Override  // com.bytedance.sdk.openadsdk.PjT.cr.Zh
    public void PjT() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener0 = this.PjT;
        if(pAGAppOpenAdInteractionListener0 != null) {
            pAGAppOpenAdInteractionListener0.onAdShowed();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.PjT.cr.Zh
    public void ReZ() {
        if(!this.Zh.getAndSet(true)) {
            PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener0 = this.PjT;
            if(pAGAppOpenAdInteractionListener0 != null) {
                pAGAppOpenAdInteractionListener0.onAdDismissed();
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.PjT.cr.Zh
    public void Zh() {
        if(!this.Zh.getAndSet(true)) {
            PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener0 = this.PjT;
            if(pAGAppOpenAdInteractionListener0 != null) {
                pAGAppOpenAdInteractionListener0.onAdDismissed();
            }
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
        PAGAppOpenAdInteractionListener pAGAppOpenAdInteractionListener0 = this.PjT;
        if(pAGAppOpenAdInteractionListener0 != null) {
            pAGAppOpenAdInteractionListener0.onAdClicked();
        }
    }
}

