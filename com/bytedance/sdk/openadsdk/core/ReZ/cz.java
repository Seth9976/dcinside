package com.bytedance.sdk.openadsdk.core.ReZ;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.multipro.Zh.PjT;

public class cz extends cr {
    public cz(Context context0, Owx owx0, AdSlot adSlot0) {
        super(context0, owx0, adSlot0);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.ReZ.cr
    public void PjT(Context context0, Owx owx0, AdSlot adSlot0) {
        Zh zh0 = new Zh(context0, owx0, adSlot0);
        this.PjT = zh0;
        zh0.addOnAttachStateChangeListener(this.cz);
    }

    public PjT ReZ() {
        return this.PjT == null ? null : ((Zh)this.PjT).getVideoModel();
    }
}

