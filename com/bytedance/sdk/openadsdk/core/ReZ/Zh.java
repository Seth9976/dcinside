package com.bytedance.sdk.openadsdk.core.ReZ;

import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.Au.gK;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.multipro.Zh.PjT;

public class Zh extends ReZ {
    public Zh(@NonNull Context context0, Owx owx0, AdSlot adSlot0) {
        super(context0, owx0, adSlot0);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.ReZ.ReZ
    protected void PjT() {
        gK gK0 = new gK(this.PjT, this.ReZ, this.cr, this.cz);
        this.Zh = gK0;
        this.addView(gK0, new ViewGroup.LayoutParams(-1, -1));
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener0 = this.JQp;
        if(pAGBannerAdWrapperListener0 != null) {
            this.setExpressInteractionListener(pAGBannerAdWrapperListener0);
        }
    }

    public PjT getVideoModel() {
        return this.Zh == null ? null : ((gK)this.Zh).getVideoModel();
    }
}

