package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils.TruncateAt;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.SM.Zh;
import com.bytedance.sdk.openadsdk.SM.cr;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.wN;
import com.bytedance.sdk.openadsdk.utils.yIW;

public class XX extends com.bytedance.sdk.openadsdk.core.JQp.XX {
    private PAGLogoView JQp;
    private xE PjT;
    private Au ReZ;
    private boolean XX;
    private com.bytedance.sdk.openadsdk.core.JQp.Au Zh;
    private com.bytedance.sdk.openadsdk.core.JQp.Au cr;
    private boolean cz;

    public XX(Context context0) {
        super(context0);
        this.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        if(this.PjT()) {
            this.Zh();
        }
    }

    public void PjT(Context context0) {
        this.JQp = new PAGLogoView(context0);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(qZS.Zh(context0, 64.0f), qZS.Zh(context0, 24.0f));
        relativeLayout$LayoutParams0.bottomMargin = qZS.Zh(context0, 60.0f);
        relativeLayout$LayoutParams0.addRule(14);
        relativeLayout$LayoutParams0.addRule(12);
        this.JQp.setLayoutParams(relativeLayout$LayoutParams0);
    }

    public void PjT(Owx owx0, int v) {
        if(this.cz && owx0 != null && !this.XX) {
            this.XX = true;
            boolean z = owx0.HG();
            if(z || owx0.Xe() == null || TextUtils.isEmpty(owx0.Xe().PjT())) {
            label_6:
                this.PjT.setVisibility(8);
            }
            else {
                try {
                    cr.PjT(owx0.Xe()).ReZ(2).PjT(new Zh(owx0, owx0.Xe().PjT(), new yIW(this.PjT)));
                    goto label_7;
                }
                catch(Throwable unused_ex) {
                }
                goto label_6;
            }
        label_7:
            if(z) {
                this.Zh.setText("Loading");
            }
            else if(TextUtils.isEmpty(owx0.Xtz())) {
                this.Zh.setVisibility(8);
            }
            else {
                this.Zh.setText(owx0.Xtz());
            }
            com.bytedance.sdk.openadsdk.core.JQp.Au au0 = this.cr;
            if(au0 != null) {
                au0.setText(owx0.Nv());
            }
            PAGLogoView pAGLogoView0 = this.JQp;
            if(pAGLogoView0 != null) {
                pAGLogoView0.initData(owx0);
                this.JQp.setOnClickListener(new View.OnClickListener() {
                    final XX Zh;

                    @Override  // android.view.View$OnClickListener
                    public void onClick(View view0) {
                        Context context0 = XX.this.getContext();
                        String s = wN.PjT(owx0);
                        TTWebsiteActivity.PjT(context0, owx0, s);
                    }
                });
                ViewGroup.MarginLayoutParams viewGroup$MarginLayoutParams0 = (ViewGroup.MarginLayoutParams)this.JQp.getLayoutParams();
                if(v == 1) {
                    viewGroup$MarginLayoutParams0.width = qZS.Zh(this.getContext(), 64.0f);
                    viewGroup$MarginLayoutParams0.height = qZS.Zh(this.getContext(), 24.0f);
                    viewGroup$MarginLayoutParams0.bottomMargin = qZS.Zh(this.getContext(), 60.0f);
                }
                else {
                    viewGroup$MarginLayoutParams0.width = qZS.Zh(this.getContext(), 41.0f);
                    viewGroup$MarginLayoutParams0.height = qZS.Zh(this.getContext(), 15.0f);
                    viewGroup$MarginLayoutParams0.bottomMargin = qZS.Zh(this.getContext(), 24.0f);
                }
                this.JQp.setLayoutParams(viewGroup$MarginLayoutParams0);
            }
        }
    }

    protected boolean PjT() {
        return true;
    }

    public void Zh() {
        if(this.cz) {
            return;
        }
        this.cz = true;
        Context context0 = this.getContext();
        this.setBackgroundColor(Color.parseColor("#2E2E2E"));
        LinearLayout linearLayout0 = new LinearLayout(context0);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, -2);
        relativeLayout$LayoutParams0.addRule(13);
        linearLayout0.setLayoutParams(relativeLayout$LayoutParams0);
        linearLayout0.setGravity(17);
        linearLayout0.setOrientation(1);
        xE xE0 = new xE(context0);
        this.PjT = xE0;
        xE0.setId(0x1F000031);
        int v = qZS.Zh(context0, 64.0f);
        this.PjT.setLayoutParams(new RelativeLayout.LayoutParams(v, v));
        com.bytedance.sdk.openadsdk.core.JQp.Au au0 = new com.bytedance.sdk.openadsdk.core.JQp.Au(context0);
        this.Zh = au0;
        au0.setId(0x1F000032);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(qZS.Zh(context0, 219.0f), -2);
        relativeLayout$LayoutParams1.topMargin = qZS.Zh(context0, 16.0f);
        this.Zh.setLayoutParams(relativeLayout$LayoutParams1);
        this.Zh.setEllipsize(TextUtils.TruncateAt.END);
        this.Zh.setGravity(17);
        this.Zh.setMaxWidth(qZS.Zh(context0, 150.0f));
        this.Zh.setMaxLines(2);
        this.Zh.setTextColor(-1);
        this.Zh.setTextSize(1, 16.0f);
        Au au1 = new Au(context0);
        this.ReZ = au1;
        au1.setId(0x1F000034);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(qZS.Zh(context0, 219.0f), qZS.Zh(context0, 6.0f));
        relativeLayout$LayoutParams2.topMargin = qZS.Zh(context0, 24.0f);
        this.ReZ.setLayoutParams(relativeLayout$LayoutParams2);
        this.cr = new com.bytedance.sdk.openadsdk.core.JQp.Au(context0);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(qZS.Zh(context0, 138.0f), qZS.Zh(context0, 42.0f));
        linearLayout$LayoutParams0.topMargin = qZS.Zh(context0, 48.0f);
        this.cr.setLayoutParams(linearLayout$LayoutParams0);
        this.cr.setTextColor(-1);
        this.cr.setTextSize(16.0f);
        this.cr.setGravity(17);
        GradientDrawable gradientDrawable0 = new GradientDrawable();
        gradientDrawable0.setShape(0);
        gradientDrawable0.setStroke(2, -1);
        gradientDrawable0.setCornerRadius(((float)(linearLayout$LayoutParams0.height / 2)));
        this.cr.setBackground(gradientDrawable0);
        linearLayout0.addView(this.PjT);
        linearLayout0.addView(this.Zh);
        linearLayout0.addView(this.ReZ);
        linearLayout0.addView(this.cr);
        this.PjT(context0);
        this.addView(linearLayout0);
        this.addView(this.JQp);
    }

    @Nullable
    public com.bytedance.sdk.openadsdk.core.JQp.Au getDownloadButton() {
        return this.cr;
    }

    @Nullable
    public Au getLoadingProgressBar() {
        return this.ReZ;
    }

    public void setProgress(int v) {
        Au au0 = this.ReZ;
        if(au0 != null) {
            au0.setProgress(v);
        }
    }
}

