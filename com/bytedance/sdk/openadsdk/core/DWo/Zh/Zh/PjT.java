package com.bytedance.sdk.openadsdk.core.DWo.Zh.Zh;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout.LayoutParams;
import androidx.annotation.Nullable;

public class PjT extends com.bytedance.adsdk.ugeno.SM.Zh.PjT {
    private final com.bytedance.adsdk.ugeno.SM.Zh.PjT PjT;
    private final com.bytedance.adsdk.ugeno.SM.Zh.PjT Zh;

    public PjT(Context context0) {
        super(context0);
        com.bytedance.adsdk.ugeno.SM.Zh.PjT pjT0 = new com.bytedance.adsdk.ugeno.SM.Zh.PjT(context0);
        this.PjT = pjT0;
        this.addView(pjT0, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.adsdk.ugeno.SM.Zh.PjT pjT1 = new com.bytedance.adsdk.ugeno.SM.Zh.PjT(context0);
        this.Zh = pjT1;
        pjT1.setBackgroundColor(0);
        this.addView(pjT1, new FrameLayout.LayoutParams(-1, -1));
    }

    public com.bytedance.adsdk.ugeno.SM.Zh.PjT getVideoView() {
        return this.PjT;
    }

    @Override  // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener view$OnClickListener0) {
        this.Zh.setOnClickListener(view$OnClickListener0);
    }

    @Override  // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public void setOnTouchListener(View.OnTouchListener view$OnTouchListener0) {
        this.Zh.setOnTouchListener(view$OnTouchListener0);
    }
}

