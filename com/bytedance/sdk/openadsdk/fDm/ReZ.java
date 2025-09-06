package com.bytedance.sdk.openadsdk.fDm;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.sdk.openadsdk.core.JQp.Au;
import com.bytedance.sdk.openadsdk.core.JQp.JQp;
import com.bytedance.sdk.openadsdk.core.JQp.cr;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.xE;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.qla;

public class ReZ extends DWo {
    public ReZ(Context context0) {
        this(context0, null);
    }

    public ReZ(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public ReZ(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @Override  // com.bytedance.sdk.openadsdk.fDm.DWo
    protected void PjT(Context context0) {
        JQp jQp0 = new JQp(context0);
        jQp0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        jQp0.setOrientation(1);
        this.addView(jQp0);
        com.bytedance.sdk.openadsdk.core.JQp.ReZ reZ0 = new com.bytedance.sdk.openadsdk.core.JQp.ReZ(context0);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(-1, 0);
        linearLayout$LayoutParams0.weight = 337.0f;
        reZ0.setLayoutParams(linearLayout$LayoutParams0);
        jQp0.addView(reZ0);
        com.bytedance.sdk.openadsdk.core.JQp.ReZ reZ1 = this.JQp(context0);
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
        jQp1.setGravity(81);
        int v1 = qZS.Zh(context0, 16.0f);
        jQp1.setPadding(v1, v1, v1, v1);
        jQp0.addView(jQp1);
        xE xE0 = this.XX(context0);
        this.ReZ = xE0;
        xE0.setId(qla.Vs);
        int v2 = qZS.Zh(context0, 45.0f);
        LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(v2, v2);
        this.ReZ.setLayoutParams(linearLayout$LayoutParams2);
        jQp1.addView(this.ReZ);
        Au au0 = this.Zh(context0);
        this.cr = au0;
        au0.setId(qla.jp);
        LinearLayout.LayoutParams linearLayout$LayoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout$LayoutParams3.topMargin = qZS.Zh(context0, 4.0f);
        this.cr.setLayoutParams(linearLayout$LayoutParams3);
        jQp1.addView(this.cr);
        Au au1 = this.ReZ(context0);
        this.JQp = au1;
        au1.setId(qla.dDm);
        LinearLayout.LayoutParams linearLayout$LayoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout$LayoutParams4.topMargin = v;
        linearLayout$LayoutParams4.bottomMargin = qZS.Zh(context0, 25.0f);
        this.JQp.setLayoutParams(linearLayout$LayoutParams4);
        jQp1.addView(this.JQp);
        Au au2 = this.cr(context0);
        this.cz = au2;
        au2.setId(qla.Wo);
        LinearLayout.LayoutParams linearLayout$LayoutParams5 = new LinearLayout.LayoutParams(-1, qZS.Zh(context0, 32.0f));
        linearLayout$LayoutParams5.topMargin = v1;
        this.cz.setLayoutParams(linearLayout$LayoutParams5);
        jQp1.addView(this.cz);
    }

    @Override  // com.bytedance.sdk.openadsdk.fDm.DWo
    protected Au Zh(Context context0) {
        Au au0 = super.Zh(context0);
        au0.setTextColor(-1);
        return au0;
    }
}

