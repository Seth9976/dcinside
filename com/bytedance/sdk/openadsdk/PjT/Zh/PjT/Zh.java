package com.bytedance.sdk.openadsdk.PjT.Zh.PjT;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.Au.gK;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.multipro.Zh.PjT;

public class Zh extends ReZ {
    public Zh(@NonNull Context context0, Owx owx0, AdSlot adSlot0) {
        super(context0, owx0, adSlot0);
    }

    @Override  // com.bytedance.sdk.openadsdk.PjT.Zh.PjT.ReZ
    protected void PjT() {
        gK gK0 = new gK(this.Au, this.Zh, this.SM, this.qj);
        this.DWo = gK0;
        this.PjT.PjT(gK0.getVideoController());
        this.ReZ();
    }

    public PjT Zh() {
        return this.DWo == null ? null : ((gK)this.DWo).getVideoModel();
    }
}

