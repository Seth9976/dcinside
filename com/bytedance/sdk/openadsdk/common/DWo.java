package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils.TruncateAt;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.openadsdk.core.JQp.Au;
import com.bytedance.sdk.openadsdk.core.JQp.cr;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.qla;

public class DWo extends RelativeLayout {
    public DWo(Context context0) {
        super(context0);
        this.PjT();
    }

    private void PjT() {
        Context context0 = this.getContext();
        int v = qZS.Zh(context0, 12.0f);
        this.setLayoutParams(new ViewGroup.LayoutParams(-1, qZS.Zh(context0, 44.0f)));
        this.setBackgroundColor(-1);
        cr cr0 = new cr(context0);
        cr0.setId(0x1F000018);
        cr0.setClickable(true);
        cr0.setFocusable(true);
        cr0.setImageDrawable(com.bytedance.sdk.openadsdk.utils.DWo.PjT(context0, "tt_leftbackicon_selector"));
        int v1 = qZS.Zh(context0, 24.0f);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(v1, v1);
        relativeLayout$LayoutParams0.leftMargin = v;
        relativeLayout$LayoutParams0.addRule(15);
        this.addView(cr0, relativeLayout$LayoutParams0);
        cr cr1 = new cr(context0);
        cr1.setId(0x1F000014);
        cr1.setClickable(true);
        cr1.setFocusable(true);
        cr1.setImageDrawable(com.bytedance.sdk.openadsdk.utils.DWo.PjT(context0, "tt_titlebar_close_seletor"));
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(v1, v1);
        relativeLayout$LayoutParams1.leftMargin = v;
        relativeLayout$LayoutParams1.addRule(15);
        relativeLayout$LayoutParams1.addRule(1, 0x1F000018);
        this.addView(cr1, relativeLayout$LayoutParams1);
        cr cr2 = new cr(context0);
        cr2.setId(qla.fK);
        cr2.setImageDrawable(Lrd.ReZ(context0, "tt_ad_feedback_new"));
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(v1, v1);
        relativeLayout$LayoutParams2.addRule(11);
        relativeLayout$LayoutParams2.addRule(15);
        relativeLayout$LayoutParams2.rightMargin = v;
        this.addView(cr2, relativeLayout$LayoutParams2);
        Au au0 = new Au(context0);
        au0.setId(qla.na);
        au0.setSingleLine(true);
        au0.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        au0.setGravity(17);
        au0.setTextColor(0xFF000000);
        au0.setTextSize(1, 16.0f);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(qZS.Zh(context0, 240.0f), -2);
        relativeLayout$LayoutParams3.addRule(15);
        relativeLayout$LayoutParams3.addRule(1, 0x1F000014);
        relativeLayout$LayoutParams3.addRule(0, qla.fK);
        int v2 = qZS.Zh(context0, 25.0f);
        relativeLayout$LayoutParams3.rightMargin = v2;
        relativeLayout$LayoutParams3.leftMargin = v2;
        this.addView(au0, relativeLayout$LayoutParams3);
    }
}

