package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.openadsdk.core.JQp.Au;
import com.bytedance.sdk.openadsdk.core.JQp.cr;
import com.bytedance.sdk.openadsdk.core.JQp.cz;
import com.bytedance.sdk.openadsdk.utils.DWo;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.qla;

public class SM extends RelativeLayout {
    public SM(Context context0) {
        super(context0);
        this.PjT();
    }

    private void PjT() {
        this.setId(qla.zYH);
        this.setBackgroundColor(-1);
        Context context0 = this.getContext();
        this.setLayoutParams(new ViewGroup.LayoutParams(-1, qZS.Zh(context0, 44.0f)));
        cr cr0 = new cr(context0);
        cr0.setId(qla.wKV);
        cr0.setClickable(true);
        cr0.setFocusable(true);
        cr0.setPadding(qZS.Zh(context0, 12.0f), qZS.Zh(context0, 14.0f), qZS.Zh(context0, 12.0f), qZS.Zh(context0, 14.0f));
        cr0.setImageResource(Lrd.cr(context0, "tt_ad_xmark"));
        this.addView(cr0, new RelativeLayout.LayoutParams(qZS.Zh(context0, 40.0f), qZS.Zh(context0, 44.0f)));
        cr cr1 = new cr(context0);
        cr1.setId(qla.Xtz);
        cr1.setPadding(qZS.Zh(context0, 8.0f), qZS.Zh(context0, 10.0f), qZS.Zh(context0, 8.0f), qZS.Zh(context0, 10.0f));
        cr1.setImageResource(Lrd.cr(context0, "tt_ad_feedback"));
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(qZS.Zh(context0, 40.0f), qZS.Zh(context0, 44.0f));
        relativeLayout$LayoutParams0.addRule(11);
        this.addView(cr1, relativeLayout$LayoutParams0);
        Au au0 = new Au(context0);
        au0.setId(qla.yks);
        au0.setSingleLine(true);
        au0.setEllipsize(TextUtils.TruncateAt.END);
        au0.setGravity(17);
        au0.setTextColor(Color.parseColor("#222222"));
        au0.setTextSize(2, 17.0f);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(qZS.Zh(context0, 191.0f), qZS.Zh(context0, 24.0f));
        relativeLayout$LayoutParams1.addRule(15);
        relativeLayout$LayoutParams1.addRule(0, qla.Xtz);
        relativeLayout$LayoutParams1.addRule(1, qla.wKV);
        int v = qZS.Zh(context0, 10.0f);
        relativeLayout$LayoutParams1.leftMargin = v;
        relativeLayout$LayoutParams1.rightMargin = v;
        this.addView(au0, relativeLayout$LayoutParams1);
        cz cz0 = new cz(context0, null, 0x103001F);
        cz0.setId(qla.ix);
        cz0.setProgress(1);
        cz0.setProgressDrawable(DWo.PjT(context0, "tt_privacy_progress_style"));
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-1, qZS.Zh(context0, 2.0f));
        relativeLayout$LayoutParams2.addRule(12);
        this.addView(cz0, relativeLayout$LayoutParams2);
        View view0 = new View(context0);
        view0.setBackgroundColor(Color.parseColor("#1F161823"));
        RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-1, qZS.Zh(context0, 0.5f));
        relativeLayout$LayoutParams3.addRule(12);
        this.addView(view0, relativeLayout$LayoutParams3);
    }
}

