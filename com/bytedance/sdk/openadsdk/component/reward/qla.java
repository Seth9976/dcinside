package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;
import com.bytedance.sdk.openadsdk.core.model.PjT;

class qla implements TTClientBidding {
    private final Au PjT;

    qla(Context context0, PjT pjT0, AdSlot adSlot0) {
        this.PjT = new Au(context0, pjT0, adSlot0);
    }

    public Au PjT() {
        return this.PjT;
    }

    public void Zh() {
        this.PjT.PjT();
    }

    @Override  // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double double0, String s, String s1) {
        this.PjT.loss(double0, s, s1);
    }

    @Override  // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double double0) {
        this.PjT.win(double0);
    }
}

