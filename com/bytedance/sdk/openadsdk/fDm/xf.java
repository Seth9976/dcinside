package com.bytedance.sdk.openadsdk.fDm;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout.LayoutParams;
import com.bytedance.sdk.openadsdk.core.JQp.Au;
import com.bytedance.sdk.openadsdk.core.JQp.XX;
import com.bytedance.sdk.openadsdk.core.JQp.cr;
import com.bytedance.sdk.openadsdk.core.widget.PjT;
import com.bytedance.sdk.openadsdk.utils.DWo;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.qla;

public class xf extends XX {
    public xf(Context context0) {
        this(context0, null);
    }

    public xf(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public xf(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.PjT(context0);
    }

    private void PjT(Context context0) {
        this.setId(qla.fU);
        this.setVisibility(8);
        this.setBackgroundColor(Color.parseColor("#7f000000"));
        cr cr0 = new cr(this.getContext());
        cr0.setId(qla.uvo);
        cr0.setScaleType(ImageView.ScaleType.CENTER_CROP);
        cr0.setImageTintMode(PorterDuff.Mode.SRC_OVER);
        cr0.setImageTintList(ColorStateList.valueOf(Color.parseColor("#7f000000")));
        cr0.setBackgroundColor(Color.parseColor("#7f000000"));
        cr0.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.addView(cr0);
        XX xX0 = new XX(context0);
        xX0.setId(qla.Lx);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams0.addRule(13);
        xX0.setLayoutParams(relativeLayout$LayoutParams0);
        this.addView(xX0);
        int v = qZS.Zh(context0, 44.0f);
        PjT pjT0 = new PjT(context0);
        pjT0.setId(qla.kph);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(v, v);
        relativeLayout$LayoutParams1.addRule(14);
        pjT0.setLayoutParams(relativeLayout$LayoutParams1);
        pjT0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        xX0.addView(pjT0);
        Au au0 = new Au(context0);
        au0.setId(qla.IJ);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(v, v);
        relativeLayout$LayoutParams2.addRule(8, qla.kph);
        relativeLayout$LayoutParams2.addRule(19, qla.kph);
        relativeLayout$LayoutParams2.addRule(5, qla.kph);
        relativeLayout$LayoutParams2.addRule(7, qla.kph);
        relativeLayout$LayoutParams2.addRule(18, qla.kph);
        relativeLayout$LayoutParams2.addRule(6, qla.kph);
        relativeLayout$LayoutParams2.addRule(14);
        au0.setLayoutParams(relativeLayout$LayoutParams2);
        au0.setBackground(DWo.PjT(context0, "tt_circle_solid_mian"));
        au0.setGravity(17);
        au0.setTextColor(-1);
        au0.setTextSize(2, 19.0f);
        au0.setTypeface(Typeface.defaultFromStyle(1));
        au0.setVisibility(8);
        xX0.addView(au0);
        Au au1 = new Au(context0);
        au1.setId(qla.OMu);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams3.addRule(3, qla.kph);
        relativeLayout$LayoutParams3.addRule(14);
        relativeLayout$LayoutParams3.topMargin = qZS.Zh(context0, 6.0f);
        au1.setLayoutParams(relativeLayout$LayoutParams3);
        TextUtils.TruncateAt textUtils$TruncateAt0 = TextUtils.TruncateAt.END;
        au1.setEllipsize(textUtils$TruncateAt0);
        au1.setMaxLines(1);
        au1.setTextColor(-1);
        au1.setTextSize(2, 12.0f);
        xX0.addView(au1);
        Au au2 = new Au(context0);
        au2.setId(qla.VY);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(qZS.Zh(context0, 100.0f), qZS.Zh(context0, 28.0f));
        relativeLayout$LayoutParams4.addRule(14);
        relativeLayout$LayoutParams4.addRule(3, qla.OMu);
        relativeLayout$LayoutParams4.topMargin = qZS.Zh(context0, 20.0f);
        au2.setLayoutParams(relativeLayout$LayoutParams4);
        au2.setMinWidth(qZS.Zh(context0, 72.0f));
        au2.setMaxLines(1);
        au2.setEllipsize(textUtils$TruncateAt0);
        au2.setTextColor(-1);
        au2.setTextSize(2, 14.0f);
        au2.setBackground(DWo.PjT(context0, "tt_ad_cover_btn_begin_bg"));
        au2.setGravity(17);
        int v1 = qZS.Zh(context0, 10.0f);
        int v2 = qZS.Zh(context0, 2.0f);
        au2.setPadding(v1, v2, v1, v2);
        au2.setVisibility(8);
        xX0.addView(au2);
    }
}

