package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.JQp.Au;
import com.bytedance.sdk.openadsdk.core.JQp.JQp;
import com.bytedance.sdk.openadsdk.core.Zh.PjT;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.gK.Zh;
import com.bytedance.sdk.openadsdk.utils.DWo;
import com.bytedance.sdk.openadsdk.utils.qZS;

public class SM extends FrameLayout {
    private Owx Au;
    private PjT DWo;
    private TextView JQp;
    private boolean PjT;
    private TextView ReZ;
    private String SM;
    private Au XX;
    private xE Zh;
    private qla cr;
    private PAGLogoView cz;

    public SM(@NonNull Context context0) {
        super(context0);
        this.setVisibility(8);
        this.setId(com.bytedance.sdk.openadsdk.utils.qla.MN);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void PjT() {
        if(this.PjT) {
            return;
        }
        this.PjT = true;
        this.Zh();
        this.JQp.setOnClickListener(this.DWo);
        this.JQp.setOnTouchListener(this.DWo);
        String s = this.Au.Nv();
        if(!TextUtils.isEmpty(s)) {
            this.JQp.setText(s);
        }
        if(this.Zh != null && this.Au.Xe() != null && !TextUtils.isEmpty(this.Au.Xe().PjT())) {
            Zh.PjT().PjT(this.Au.Xe(), this.Zh, this.Au);
        }
        qla qla0 = this.cr;
        if(qla0 != null) {
            qZS.PjT(null, qla0, this.Au);
            if(this.Au.uQg() != null) {
                this.cr.setVisibility(0);
            }
        }
        if(this.ReZ != null) {
            if(this.Au.uQg() != null && false) {
                this.ReZ.setText("");
            }
            else if(TextUtils.isEmpty(this.Au.Ld())) {
                this.ReZ.setVisibility(8);
            }
            else {
                this.ReZ.setText(this.Au.Ld());
            }
        }
        if(this.XX != null) {
            String s1 = this.Au.Xtz();
            if(TextUtils.isEmpty(s1)) {
                this.XX.setVisibility(8);
            }
            else {
                this.XX.setText(s1);
            }
        }
        this.cz.setOnClickListener(new View.OnClickListener() {
            final SM PjT;

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                try {
                    TTWebsiteActivity.PjT(SM.this.getContext(), SM.this.Au, SM.this.SM);
                }
                catch(Throwable unused_ex) {
                }
            }
        });
    }

    public void PjT(Owx owx0, String s, PjT pjT0) {
        this.Au = owx0;
        this.SM = s;
        this.DWo = pjT0;
    }

    private void Zh() {
        Context context0 = this.getContext();
        boolean z = this.Au.jK() == 1;
        this.setBackgroundColor(0xFF000000);
        JQp jQp0 = new JQp(context0);
        jQp0.setGravity(1);
        jQp0.setOrientation(1);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = z ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(qZS.Zh(context0, 327.0f), -2);
        frameLayout$LayoutParams0.gravity = 17;
        int v = qZS.Zh(context0, 24.0f);
        frameLayout$LayoutParams0.rightMargin = v;
        frameLayout$LayoutParams0.leftMargin = v;
        this.addView(jQp0, frameLayout$LayoutParams0);
        xE xE0 = new xE(context0);
        this.Zh = xE0;
        xE0.setBackgroundColor(0);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(qZS.Zh(context0, 80.0f), qZS.Zh(context0, 80.0f));
        linearLayout$LayoutParams0.bottomMargin = qZS.Zh(context0, 12.0f);
        jQp0.addView(this.Zh, linearLayout$LayoutParams0);
        Au au0 = new Au(context0);
        this.ReZ = au0;
        TextUtils.TruncateAt textUtils$TruncateAt0 = TextUtils.TruncateAt.END;
        au0.setEllipsize(textUtils$TruncateAt0);
        this.ReZ.setGravity(17);
        this.ReZ.setMaxLines(2);
        this.ReZ.setMaxWidth(qZS.Zh(context0, 180.0f));
        this.ReZ.setTextColor(-1);
        this.ReZ.setTextSize(2, 24.0f);
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-1, -2);
        jQp0.addView(this.ReZ, linearLayout$LayoutParams1);
        Au au1 = new Au(context0);
        this.XX = au1;
        au1.setEllipsize(textUtils$TruncateAt0);
        this.XX.setGravity(17);
        this.XX.setMaxLines(2);
        this.XX.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.XX.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams linearLayout$LayoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout$LayoutParams2.topMargin = qZS.Zh(context0, 8.0f);
        jQp0.addView(this.XX, linearLayout$LayoutParams2);
        this.cr = new qla(context0, true);
        LinearLayout.LayoutParams linearLayout$LayoutParams3 = new LinearLayout.LayoutParams(-2, qZS.Zh(context0, 16.0f));
        linearLayout$LayoutParams3.topMargin = qZS.Zh(context0, 12.0f);
        this.cr.setVisibility(8);
        jQp0.addView(this.cr, linearLayout$LayoutParams3);
        Au au2 = new Au(context0);
        this.JQp = au2;
        au2.setId(0x1F00000B);
        this.JQp.setGravity(17);
        this.JQp.setText(Lrd.PjT(context0, "tt_video_download_apk"));
        this.JQp.setTextColor(-1);
        this.JQp.setTextSize(2, 16.0f);
        this.JQp.setBackground(DWo.PjT(context0, "tt_reward_full_video_backup_btn_bg"));
        LinearLayout.LayoutParams linearLayout$LayoutParams4 = new LinearLayout.LayoutParams(-1, qZS.Zh(context0, 44.0f));
        linearLayout$LayoutParams4.topMargin = qZS.Zh(context0, 54.0f);
        jQp0.addView(this.JQp, linearLayout$LayoutParams4);
        this.cz = PAGLogoView.createPAGLogoViewByMaterial(context0, this.Au);
        FrameLayout.LayoutParams frameLayout$LayoutParams1 = new FrameLayout.LayoutParams(-2, qZS.Zh(context0, 14.0f));
        frameLayout$LayoutParams1.gravity = 0x800053;
        frameLayout$LayoutParams1.leftMargin = qZS.Zh(context0, 18.0f);
        frameLayout$LayoutParams1.bottomMargin = z ? qZS.Zh(context0, 61.0f) : qZS.Zh(context0, 24.0f);
        this.addView(this.cz, frameLayout$LayoutParams1);
    }

    public void setClickListener(PjT pjT0) {
        this.DWo = pjT0;
        TextView textView0 = this.JQp;
        if(textView0 != null) {
            textView0.setOnClickListener(pjT0);
            this.JQp.setOnTouchListener(this.DWo);
        }
    }

    @Override  // android.view.View
    public void setVisibility(int v) {
        super.setVisibility(v);
        if(v == 0) {
            this.PjT();
        }
    }
}

