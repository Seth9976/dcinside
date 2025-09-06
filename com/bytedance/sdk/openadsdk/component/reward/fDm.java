package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTClientBidding;
import com.bytedance.sdk.openadsdk.core.model.PjT;

class fDm implements TTClientBidding {
    private final cz PjT;

    fDm(Context context0, PjT pjT0) {
        this.PjT = new cz(context0, pjT0);
    }

    public cz PjT() {
        return this.PjT;
    }

    public void PjT(boolean z) {
        this.PjT.PjT(z);
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

