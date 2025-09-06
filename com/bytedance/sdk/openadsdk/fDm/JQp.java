package com.bytedance.sdk.openadsdk.fDm;

import android.content.Context;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.sdk.openadsdk.core.JQp.Au;
import com.bytedance.sdk.openadsdk.core.JQp.ReZ;
import com.bytedance.sdk.openadsdk.core.JQp.cr;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.qla;

public class JQp extends DWo {
    private Au Au;
    private cr XX;

    public JQp(Context context0) {
        this(context0, null);
    }

    public JQp(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public JQp(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
    }

    @Override  // com.bytedance.sdk.openadsdk.fDm.DWo
    protected void PjT(Context context0) {
        int v = qZS.Zh(context0, 6.0f);
        this.setPadding(v, v, v, v);
        ReZ reZ0 = this.JQp(context0);
        this.PjT = reZ0;
        reZ0.setId(qla.ZsT);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
        int v1 = qZS.Zh(context0, 26.0f);
        frameLayout$LayoutParams0.topMargin = v1;
        this.PjT.setLayoutParams(frameLayout$LayoutParams0);
        this.addView(this.PjT);
        cr cr0 = new cr(context0);
        this.XX = cr0;
        cr0.setId(qla.kWj);
        this.XX.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(-1, -1);
        frameLayout$LayoutParams1.topMargin = v1;
        this.XX.setLayoutParams(frameLayout$LayoutParams1);
        this.addView(this.XX);
        PAGLogoView pAGLogoView0 = this.Au(context0);
        FrameLayout.LayoutParams frameLayout$LayoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        frameLayout$LayoutParams2.gravity = 80;
        int v2 = qZS.Zh(context0, 10.0f);
        frameLayout$LayoutParams2.leftMargin = v2;
        frameLayout$LayoutParams2.topMargin = v2;
        frameLayout$LayoutParams2.bottomMargin = v2;
        pAGLogoView0.setLayoutParams(frameLayout$LayoutParams2);
        this.addView(pAGLogoView0);
        com.bytedance.sdk.openadsdk.core.JQp.JQp jQp0 = new com.bytedance.sdk.openadsdk.core.JQp.JQp(context0);
        jQp0.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        jQp0.setOrientation(0);
        jQp0.setGravity(17);
        this.addView(jQp0);
        Au au0 = new Au(context0);
        this.Au = au0;
        au0.setId(qla.Gr);
        this.Au.setEllipsize(TextUtils.TruncateAt.END);
        this.Au.setMaxLines(1);
        this.Au.setTextColor(-1);
        this.Au.setTextSize(2, 12.0f);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(0, -2);
        linearLayout$LayoutParams0.weight = 1.0f;
        this.Au.setLayoutParams(linearLayout$LayoutParams0);
        jQp0.addView(this.Au);
    }

    public Au getTtBuDescTV() {
        return this.Au;
    }

    public cr getTtBuImg() {
        return this.XX;
    }
}

