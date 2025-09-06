package com.bytedance.sdk.openadsdk.core.DWo.Zh.PjT;

import android.content.Context;
import com.bytedance.adsdk.Zh.cz;
import com.bytedance.adsdk.ugeno.cr;

public class Zh extends cz {
    private cr PjT;

    public Zh(Context context0) {
        super(context0);
    }

    public void PjT(cr cr0) {
        this.PjT = cr0;
    }

    @Override  // com.bytedance.adsdk.Zh.cz
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        cr cr0 = this.PjT;
        if(cr0 != null) {
            cr0.XX();
        }
    }

    @Override  // com.bytedance.adsdk.Zh.cz
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cr cr0 = this.PjT;
        if(cr0 != null) {
            cr0.Au();
        }
    }
}

