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
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.xE;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.qla;

public class cr extends DWo {
    public cr(Context context0) {
        this(context0, null);
    }

    public cr(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public cr(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @Override  // com.bytedance.sdk.openadsdk.fDm.DWo
    protected void PjT(Context context0) {
        int v = qZS.Zh(context0, 10.0f);
        JQp jQp0 = new JQp(context0);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
        jQp0.setLayoutParams(frameLayout$LayoutParams0);
        frameLayout$LayoutParams0.gravity = 17;
        jQp0.setOrientation(1);
        jQp0.setPadding(v, v, v, v);
        this.addView(jQp0);
        ReZ reZ0 = new ReZ(context0);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, 0);
        linearLayout$LayoutParams0.weight = 3.0f;
        reZ0.setLayoutParams(linearLayout$LayoutParams0);
        jQp0.addView(reZ0);
        ReZ reZ1 = this.JQp(context0);
        this.PjT = reZ1;
        reZ1.setId(qla.ZsT);
        FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(-1, -1);
        this.PjT.setLayoutParams(frameLayout$LayoutParams1);
        reZ0.addView(this.PjT);
        com.bytedance.sdk.openadsdk.core.JQp.cr cr0 = this.cz(context0);
        this.Zh = cr0;
        cr0.setId(qla.oMU);
        FrameLayout.LayoutParams frameLayout$LayoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        this.Zh.setLayoutParams(frameLayout$LayoutParams2);
        reZ0.addView(this.Zh);
        PAGLogoView pAGLogoView0 = this.Au(context0);
        FrameLayout.LayoutParams frameLayout$LayoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        frameLayout$LayoutParams3.gravity = 80;
        frameLayout$LayoutParams3.leftMargin = v;
        frameLayout$LayoutParams3.topMargin = v;
        frameLayout$LayoutParams3.bottomMargin = v;
        pAGLogoView0.setLayoutParams(frameLayout$LayoutParams3);
        reZ0.addView(pAGLogoView0);
        XX xX0 = new XX(context0);
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-1, 0);
        linearLayout$LayoutParams1.weight = 1.0f;
        xX0.setLayoutParams(linearLayout$LayoutParams1);
        jQp0.addView(xX0);
        xE xE0 = this.XX(context0);
        this.ReZ = xE0;
        xE0.setId(qla.Vs);
        int v1 = qZS.Zh(context0, 40.0f);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(v1, v1);
        relativeLayout$LayoutParams0.addRule(15);
        this.ReZ.setLayoutParams(relativeLayout$LayoutParams0);
        xX0.addView(this.ReZ);
        Au au0 = this.Zh(context0);
        this.cr = au0;
        au0.setId(qla.jp);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams1.addRule(15);
        relativeLayout$LayoutParams1.leftMargin = v;
        relativeLayout$LayoutParams1.setMarginStart(v);
        relativeLayout$LayoutParams1.addRule(1, qla.Vs);
        relativeLayout$LayoutParams1.addRule(17, qla.Vs);
        this.cr.setLayoutParams(relativeLayout$LayoutParams1);
        xX0.addView(this.cr);
        Au au1 = this.cr(context0);
        this.cz = au1;
        au1.setId(qla.Wo);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(qZS.Zh(context0, 100.0f), qZS.Zh(context0, 32.0f));
        relativeLayout$LayoutParams2.addRule(11);
        relativeLayout$LayoutParams2.addRule(21);
        relativeLayout$LayoutParams2.addRule(15);
        this.cz.setLayoutParams(relativeLayout$LayoutParams2);
        xX0.addView(this.cz);
    }
}

