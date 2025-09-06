package com.bytedance.sdk.openadsdk.component.SM;

import android.content.Context;
import android.view.View;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout.LayoutParams;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.openadsdk.core.JQp.Au;
import com.bytedance.sdk.openadsdk.core.JQp.cr;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.utils.qZS;

public class XX extends com.bytedance.sdk.openadsdk.core.JQp.XX {
    private final cr PjT;
    private final Au ReZ;
    private final cr Zh;

    public XX(@NonNull Context context0) {
        super(context0);
        this.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int v = qZS.Zh(context0, 12.0f);
        int v1 = qZS.Zh(context0, 16.0f);
        int v2 = qZS.Zh(context0, 20.0f);
        int v3 = qZS.Zh(context0, 24.0f);
        int v4 = qZS.Zh(context0, 28.0f);
        cr cr0 = new cr(context0);
        this.PjT = cr0;
        cr0.setId(0x1F000011);
        int v5 = qZS.Zh(this.getContext(), 5.0f);
        cr0.setPadding(v5, v5, v5, v5);
        ImageView.ScaleType imageView$ScaleType0 = ImageView.ScaleType.CENTER;
        cr0.setScaleType(imageView$ScaleType0);
        cr0.setBackground(com.bytedance.sdk.openadsdk.core.widget.cr.PjT());
        cr0.setImageResource(Lrd.cr(ub.PjT(), "tt_reward_full_feedback"));
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(v4, v4);
        relativeLayout$LayoutParams0.topMargin = v2;
        relativeLayout$LayoutParams0.leftMargin = v1;
        relativeLayout$LayoutParams0.setMarginStart(v1);
        cr0.setLayoutParams(relativeLayout$LayoutParams0);
        cr cr1 = new cr(context0);
        this.Zh = cr1;
        cr1.setId(0x1F000012);
        cr1.setPadding(v5, v5, v5, v5);
        cr1.setScaleType(imageView$ScaleType0);
        cr1.setBackground(com.bytedance.sdk.openadsdk.core.widget.cr.PjT());
        cr1.setImageResource(Lrd.cr(ub.PjT(), "tt_close_btn"));
        if(cr1.getDrawable() != null) {
            cr1.getDrawable().setAutoMirrored(true);
        }
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(v4, v4);
        relativeLayout$LayoutParams1.topMargin = v2;
        relativeLayout$LayoutParams1.rightMargin = v1;
        relativeLayout$LayoutParams1.setMarginEnd(v1);
        relativeLayout$LayoutParams1.addRule(11);
        relativeLayout$LayoutParams1.addRule(21);
        cr1.setLayoutParams(relativeLayout$LayoutParams1);
        cr1.setVisibility(4);
        Au au0 = new Au(context0);
        this.ReZ = au0;
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, v3);
        relativeLayout$LayoutParams2.topMargin = v2;
        relativeLayout$LayoutParams2.rightMargin = v1;
        relativeLayout$LayoutParams2.addRule(11);
        relativeLayout$LayoutParams2.setMarginEnd(v1);
        relativeLayout$LayoutParams2.addRule(21);
        au0.setLayoutParams(relativeLayout$LayoutParams2);
        au0.setBackground(com.bytedance.sdk.openadsdk.core.widget.cr.Zh());
        au0.setGravity(17);
        au0.setPadding(v, 0, v, 0);
        au0.setTextColor(-1);
        au0.setTextSize(1, 14.0f);
        au0.setVisibility(4);
        this.addView(cr0);
        this.addView(au0);
        this.addView(cr1);
    }

    public Au getTopCountDown() {
        return this.ReZ;
    }

    public View getTopDislike() {
        return this.PjT;
    }

    public cr getTopSkip() {
        return this.Zh;
    }
}

