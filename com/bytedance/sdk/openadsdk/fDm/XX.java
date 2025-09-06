package com.bytedance.sdk.openadsdk.fDm;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import com.bytedance.sdk.openadsdk.core.JQp.Au;
import com.bytedance.sdk.openadsdk.core.JQp.ReZ;
import com.bytedance.sdk.openadsdk.core.JQp.cr;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.xE;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.qla;

public class XX extends DWo {
    public XX(Context context0) {
        this(context0, null);
    }

    public XX(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public XX(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @Override  // com.bytedance.sdk.openadsdk.fDm.DWo
    protected void PjT(Context context0) {
        int v = qZS.Zh(context0, 10.0f);
        int v1 = qZS.Zh(context0, 5.0f);
        int v2 = qZS.Zh(context0, 16.0f);
        int v3 = qZS.Zh(context0, 15.0f);
        com.bytedance.sdk.openadsdk.core.JQp.XX xX0 = new com.bytedance.sdk.openadsdk.core.JQp.XX(context0);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
        frameLayout$LayoutParams0.gravity = 17;
        xX0.setLayoutParams(frameLayout$LayoutParams0);
        this.addView(xX0);
        ReZ reZ0 = this.JQp(context0);
        this.PjT = reZ0;
        reZ0.setId(qla.ZsT);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, -1);
        this.PjT.setLayoutParams(relativeLayout$LayoutParams0);
        xX0.addView(this.PjT);
        cr cr0 = this.cz(context0);
        this.Zh = cr0;
        cr0.setId(qla.oMU);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-1, -1);
        this.Zh.setLayoutParams(relativeLayout$LayoutParams1);
        xX0.addView(this.Zh);
        com.bytedance.sdk.openadsdk.core.JQp.XX xX1 = new com.bytedance.sdk.openadsdk.core.JQp.XX(context0);
        xX1.setId(qla.CD);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-1, qZS.Zh(context0, 60.0f));
        relativeLayout$LayoutParams2.addRule(12);
        xX1.setBackgroundColor(Color.parseColor("#26000000"));
        xX1.setLayoutParams(relativeLayout$LayoutParams2);
        xX0.addView(xX1);
        xE xE0 = this.XX(context0);
        this.ReZ = xE0;
        xE0.setId(qla.Vs);
        int v4 = qZS.Zh(context0, 50.0f);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(v4, v4);
        relativeLayout$LayoutParams3.addRule(20);
        relativeLayout$LayoutParams3.addRule(9);
        relativeLayout$LayoutParams3.addRule(15);
        relativeLayout$LayoutParams3.leftMargin = v3;
        relativeLayout$LayoutParams3.setMarginStart(v3);
        this.ReZ.setLayoutParams(relativeLayout$LayoutParams3);
        xX1.addView(this.ReZ);
        Au au0 = this.Zh(context0);
        this.cr = au0;
        au0.setId(qla.jp);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams4.addRule(15);
        relativeLayout$LayoutParams4.leftMargin = v1;
        relativeLayout$LayoutParams4.setMarginStart(v1);
        relativeLayout$LayoutParams4.addRule(1, qla.Vs);
        relativeLayout$LayoutParams4.addRule(17, qla.Vs);
        this.cr.setLayoutParams(relativeLayout$LayoutParams4);
        xX1.addView(this.cr);
        Au au1 = this.cr(context0);
        this.cz = au1;
        au1.setId(qla.Wo);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams5 = new RelativeLayout.LayoutParams(qZS.Zh(context0, 70.0f), qZS.Zh(context0, 36.0f));
        relativeLayout$LayoutParams5.addRule(21);
        relativeLayout$LayoutParams5.addRule(11);
        relativeLayout$LayoutParams5.addRule(15);
        relativeLayout$LayoutParams5.rightMargin = v3;
        relativeLayout$LayoutParams5.setMarginEnd(v3);
        this.cz.setLayoutParams(relativeLayout$LayoutParams5);
        xX1.addView(this.cz);
        PAGLogoView pAGLogoView0 = this.Au(context0);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams6.addRule(2, qla.CD);
        relativeLayout$LayoutParams6.leftMargin = v2;
        relativeLayout$LayoutParams6.bottomMargin = v;
        pAGLogoView0.setLayoutParams(relativeLayout$LayoutParams6);
        xX0.addView(pAGLogoView0);
    }

    @Override  // com.bytedance.sdk.openadsdk.fDm.DWo
    protected Au Zh(Context context0) {
        Au au0 = super.Zh(context0);
        au0.setGravity(16);
        au0.setMaxWidth(qZS.Zh(context0, 150.0f));
        au0.setTextColor(Color.parseColor("#B7B7B7"));
        au0.setTextSize(2, 15.0f);
        au0.setText("APP NAME");
        return au0;
    }

    @Override  // com.bytedance.sdk.openadsdk.fDm.DWo
    protected Au cr(Context context0) {
        Au au0 = super.cr(context0);
        au0.setBackground(com.bytedance.sdk.openadsdk.utils.DWo.PjT(context0, "tt_download_corner_bg"));
        au0.setTextSize(2, 14.0f);
        return au0;
    }
}

