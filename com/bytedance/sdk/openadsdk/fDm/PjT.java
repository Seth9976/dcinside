package com.bytedance.sdk.openadsdk.fDm;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import com.bytedance.sdk.openadsdk.core.JQp.Au;
import com.bytedance.sdk.openadsdk.core.JQp.JQp;
import com.bytedance.sdk.openadsdk.core.JQp.ReZ;
import com.bytedance.sdk.openadsdk.core.JQp.XX;
import com.bytedance.sdk.openadsdk.core.JQp.cr;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.xE;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.qla;

public class PjT extends DWo {
    public PjT(Context context0) {
        this(context0, null);
    }

    public PjT(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public PjT(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @Override  // com.bytedance.sdk.openadsdk.fDm.DWo
    protected void PjT(Context context0) {
        JQp jQp0 = new JQp(context0);
        jQp0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        jQp0.setOrientation(1);
        this.addView(jQp0);
        ReZ reZ0 = new ReZ(context0);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, 0);
        linearLayout$LayoutParams0.weight = 337.0f;
        reZ0.setLayoutParams(linearLayout$LayoutParams0);
        jQp0.addView(reZ0);
        ReZ reZ1 = this.JQp(context0);
        this.PjT = reZ1;
        reZ1.setId(qla.ZsT);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
        this.PjT.setLayoutParams(frameLayout$LayoutParams0);
        reZ0.addView(this.PjT);
        cr cr0 = this.cz(context0);
        this.Zh = cr0;
        cr0.setId(qla.oMU);
        FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(-1, -1);
        this.Zh.setLayoutParams(frameLayout$LayoutParams1);
        reZ0.addView(this.Zh);
        PAGLogoView pAGLogoView0 = this.Au(context0);
        FrameLayout.LayoutParams frameLayout$LayoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        frameLayout$LayoutParams2.gravity = 80;
        int v = qZS.Zh(context0, 10.0f);
        frameLayout$LayoutParams2.leftMargin = v;
        frameLayout$LayoutParams2.topMargin = v;
        frameLayout$LayoutParams2.bottomMargin = v;
        pAGLogoView0.setLayoutParams(frameLayout$LayoutParams2);
        reZ0.addView(pAGLogoView0);
        JQp jQp1 = new JQp(context0);
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-1, 0);
        linearLayout$LayoutParams1.weight = 263.0f;
        jQp1.setLayoutParams(linearLayout$LayoutParams1);
        jQp1.setOrientation(1);
        int v1 = qZS.Zh(context0, 16.0f);
        jQp1.setPadding(v1, v1, v1, v1);
        jQp0.addView(jQp1);
        XX xX0 = new XX(context0);
        xX0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        jQp1.addView(xX0);
        xE xE0 = this.XX(context0);
        this.ReZ = xE0;
        xE0.setId(qla.Vs);
        int v2 = qZS.Zh(context0, 45.0f);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(v2, v2);
        relativeLayout$LayoutParams0.rightMargin = v;
        relativeLayout$LayoutParams0.setMarginEnd(v);
        this.ReZ.setLayoutParams(relativeLayout$LayoutParams0);
        xX0.addView(this.ReZ);
        Au au0 = this.Zh(context0);
        this.cr = au0;
        au0.setId(qla.jp);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams1.addRule(1, this.ReZ.getId());
        relativeLayout$LayoutParams1.addRule(17, this.ReZ.getId());
        this.cr.setLayoutParams(relativeLayout$LayoutParams1);
        xX0.addView(this.cr);
        Au au1 = this.ReZ(context0);
        this.JQp = au1;
        au1.setId(qla.dDm);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams2.addRule(3, this.cr.getId());
        relativeLayout$LayoutParams2.addRule(1, this.ReZ.getId());
        relativeLayout$LayoutParams2.addRule(17, this.ReZ.getId());
        this.JQp.setLayoutParams(relativeLayout$LayoutParams2);
        xX0.addView(this.JQp);
        Au au2 = this.cr(context0);
        this.cz = au2;
        au2.setId(qla.Wo);
        LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(-1, qZS.Zh(context0, 32.0f));
        linearLayout$LayoutParams2.topMargin = v1;
        this.cz.setLayoutParams(linearLayout$LayoutParams2);
        jQp1.addView(this.cz);
    }
}

