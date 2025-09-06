package com.bytedance.sdk.openadsdk.component.SM;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import com.bytedance.sdk.openadsdk.core.JQp.Au;
import com.bytedance.sdk.openadsdk.core.JQp.JQp;
import com.bytedance.sdk.openadsdk.core.JQp.XX;
import com.bytedance.sdk.openadsdk.core.JQp.cr;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.qla;
import com.bytedance.sdk.openadsdk.core.widget.xE;
import com.bytedance.sdk.openadsdk.utils.DWo;
import com.bytedance.sdk.openadsdk.utils.qZS;

public class cz extends ReZ {
    private final qla fDm;
    private final JQp xs;

    public cz(Context context0, Owx owx0) {
        super(context0);
        this.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        int[] arr_v = {Color.parseColor("#EDFCFF"), Color.parseColor("#FFF6FD")};
        this.setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, arr_v));
        JQp jQp0 = new JQp(context0);
        this.xs = jQp0;
        jQp0.setId(0x1F00003E);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams0.leftMargin = qZS.Zh(context0, 24.0f);
        relativeLayout$LayoutParams0.topMargin = qZS.Zh(context0, 56.0f);
        jQp0.setLayoutParams(relativeLayout$LayoutParams0);
        jQp0.setClickable(false);
        jQp0.setGravity(16);
        jQp0.setOrientation(0);
        xE xE0 = new xE(context0);
        this.cz = xE0;
        xE0.setId(0x1F00003F);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(qZS.Zh(context0, 24.0f), qZS.Zh(context0, 24.0f));
        this.cz.setLayoutParams(linearLayout$LayoutParams0);
        Au au0 = new Au(context0);
        this.XX = au0;
        au0.setId(0x1F000041);
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout$LayoutParams1.leftMargin = qZS.Zh(context0, 8.0f);
        this.XX.setLayoutParams(linearLayout$LayoutParams1);
        TextUtils.TruncateAt textUtils$TruncateAt0 = TextUtils.TruncateAt.END;
        this.XX.setEllipsize(textUtils$TruncateAt0);
        this.XX.setMaxLines(2);
        this.XX.setTextColor(Color.parseColor("#161823"));
        this.XX.setTextSize(12.0f);
        XX xX0 = new XX(context0);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(qZS.Zh(context0, 327.0f), -2);
        relativeLayout$LayoutParams1.addRule(13);
        relativeLayout$LayoutParams1.leftMargin = qZS.Zh(context0, 24.0f);
        relativeLayout$LayoutParams1.rightMargin = qZS.Zh(context0, 24.0f);
        xX0.setLayoutParams(relativeLayout$LayoutParams1);
        xE xE1 = new xE(context0);
        this.SM = xE1;
        xE1.setId(com.bytedance.sdk.openadsdk.utils.qla.zSs);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(qZS.Zh(context0, 80.0f), qZS.Zh(context0, 80.0f));
        relativeLayout$LayoutParams2.addRule(14);
        this.SM.setLayoutParams(relativeLayout$LayoutParams2);
        Au au1 = new Au(context0);
        this.DWo = au1;
        au1.setId(com.bytedance.sdk.openadsdk.utils.qla.Xw);
        this.DWo.setTextSize(24.0f);
        this.DWo.setTextColor(Color.parseColor("#161823"));
        this.DWo.setGravity(17);
        this.DWo.setMaxLines(1);
        this.DWo.setEllipsize(textUtils$TruncateAt0);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams3.addRule(3, com.bytedance.sdk.openadsdk.utils.qla.zSs);
        relativeLayout$LayoutParams3.topMargin = qZS.Zh(context0, 12.0f);
        relativeLayout$LayoutParams3.addRule(14);
        this.DWo.setLayoutParams(relativeLayout$LayoutParams3);
        Au au2 = new Au(context0);
        this.qj = au2;
        au2.setId(com.bytedance.sdk.openadsdk.utils.qla.Ebj);
        this.qj.setTextSize(16.0f);
        this.qj.setTextColor(Color.parseColor("#80161823"));
        this.qj.setGravity(17);
        this.qj.setMaxLines(2);
        this.qj.setEllipsize(textUtils$TruncateAt0);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams4.addRule(3, com.bytedance.sdk.openadsdk.utils.qla.Xw);
        relativeLayout$LayoutParams4.topMargin = qZS.Zh(context0, 4.0f);
        relativeLayout$LayoutParams4.addRule(14);
        this.qj.setLayoutParams(relativeLayout$LayoutParams4);
        qla qla0 = new qla(context0);
        this.fDm = qla0;
        RelativeLayout.LayoutParams relativeLayout$LayoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout$LayoutParams5.addRule(14);
        relativeLayout$LayoutParams5.topMargin = qZS.Zh(context0, 12.0f);
        qla0.setLayoutParams(relativeLayout$LayoutParams5);
        Au au3 = new Au(context0);
        this.JQp = au3;
        au3.setId(0x1F000015);
        this.JQp.setBackground(DWo.PjT(context0, "tt_reward_full_video_backup_btn_bg"));
        this.JQp.setEllipsize(textUtils$TruncateAt0);
        this.JQp.setLines(1);
        this.JQp.setGravity(17);
        this.JQp.setTextColor(-1);
        this.JQp.setTextSize(16.0f);
        this.JQp.setTag("open_ad_click_button_tag");
        RelativeLayout.LayoutParams relativeLayout$LayoutParams6 = new RelativeLayout.LayoutParams(-1, qZS.Zh(context0, 44.0f));
        relativeLayout$LayoutParams6.addRule(3, com.bytedance.sdk.openadsdk.utils.qla.Ebj);
        relativeLayout$LayoutParams6.topMargin = qZS.Zh(context0, 54.0f);
        relativeLayout$LayoutParams6.addRule(14);
        this.JQp.setLayoutParams(relativeLayout$LayoutParams6);
        PAGLogoView pAGLogoView0 = PAGLogoView.createPAGLogoViewByMaterial(context0, owx0);
        this.cr = pAGLogoView0;
        pAGLogoView0.setId(0x1F00003D);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams7 = new RelativeLayout.LayoutParams(-2, qZS.Zh(context0, 14.0f));
        relativeLayout$LayoutParams7.leftMargin = qZS.Zh(context0, 16.0f);
        relativeLayout$LayoutParams7.bottomMargin = qZS.Zh(context0, 24.0f);
        relativeLayout$LayoutParams7.addRule(12);
        this.cr.setLayoutParams(relativeLayout$LayoutParams7);
        this.addView(this.Au);
        jQp0.addView(this.cz);
        jQp0.addView(this.XX);
        this.addView(jQp0);
        xX0.addView(this.SM);
        xX0.addView(this.DWo);
        xX0.addView(this.qj);
        xX0.addView(qla0);
        xX0.addView(this.JQp);
        this.addView(xX0);
        this.addView(this.cr);
    }

    @Override  // com.bytedance.sdk.openadsdk.component.SM.ReZ
    public cr getAdIconView() {
        return null;
    }

    @Override  // com.bytedance.sdk.openadsdk.component.SM.ReZ
    public Au getAdTitleTextView() {
        return null;
    }

    @Override  // com.bytedance.sdk.openadsdk.component.SM.ReZ
    public qla getScoreBar() {
        return this.fDm;
    }

    @Override  // com.bytedance.sdk.openadsdk.component.SM.ReZ
    public View getUserInfo() {
        return this.xs;
    }
}

