package com.bytedance.sdk.openadsdk.fDm;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout.LayoutParams;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.openadsdk.core.JQp.Au;
import com.bytedance.sdk.openadsdk.core.JQp.XX;
import com.bytedance.sdk.openadsdk.core.JQp.cr;
import com.bytedance.sdk.openadsdk.utils.qZS;

public class qla extends XX {
    public qla(Context context0) {
        this(context0, null);
    }

    public qla(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public qla(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.PjT(context0);
    }

    private void PjT(Context context0) {
        this.setId(com.bytedance.sdk.openadsdk.utils.qla.Os);
        this.setBackgroundColor(Color.parseColor("#00000000"));
        this.setGravity(16);
        this.setVisibility(8);
        Au au0 = new Au(context0);
        au0.setId(com.bytedance.sdk.openadsdk.utils.qla.Tn);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams0.addRule(14);
        au0.setLayoutParams(relativeLayout$LayoutParams0);
        au0.setIncludeFontPadding(false);
        au0.setText(Lrd.PjT(context0, "tt_video_without_wifi_tips"));
        au0.setTextColor(Color.parseColor("#cacaca"));
        au0.setTextSize(2, 14.0f);
        this.addView(au0);
        XX xX0 = new XX(context0);
        xX0.setId(com.bytedance.sdk.openadsdk.utils.qla.XWz);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams1.addRule(3, com.bytedance.sdk.openadsdk.utils.qla.Tn);
        relativeLayout$LayoutParams1.addRule(13);
        xX0.setLayoutParams(relativeLayout$LayoutParams1);
        this.addView(xX0);
        cr cr0 = new cr(context0);
        cr0.setId(com.bytedance.sdk.openadsdk.utils.qla.kW);
        int v = qZS.Zh(context0, 44.0f);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(v, v);
        relativeLayout$LayoutParams2.addRule(15);
        cr0.setLayoutParams(relativeLayout$LayoutParams2);
        cr0.setImageDrawable(Lrd.ReZ(context0, "tt_new_play_video"));
        cr0.setScaleType(ImageView.ScaleType.FIT_XY);
        xX0.addView(cr0);
    }
}

