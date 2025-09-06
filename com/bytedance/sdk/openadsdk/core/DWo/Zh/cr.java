package com.bytedance.sdk.openadsdk.core.DWo.Zh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.Zh.ReZ;
import com.bytedance.sdk.openadsdk.core.model.Zh;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;

public class cr extends ReZ {
    public cr(Context context0) {
        super(context0);
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.ReZ
    public View PjT() {
        return this.ReZ();
    }

    public FrameLayout ReZ() {
        FrameLayout frameLayout0 = new FrameLayout(this.Zh);
        Zh zh0 = new Zh();
        zh0.PjT(true);
        PAGLogoView pAGLogoView0 = new PAGLogoView(this.Zh);
        pAGLogoView0.initData(zh0);
        frameLayout0.addView(pAGLogoView0);
        return frameLayout0;
    }

    @Override  // com.bytedance.adsdk.ugeno.Zh.ReZ
    public void Zh() {
        super.Zh();
    }
}

