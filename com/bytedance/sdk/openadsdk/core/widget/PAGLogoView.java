package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bytedance.sdk.component.utils.Lrd;
import com.bytedance.sdk.openadsdk.core.JQp.Au;
import com.bytedance.sdk.openadsdk.core.JQp.SM;
import com.bytedance.sdk.openadsdk.core.JQp.cr;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.Zh;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.utils.qZS;

public class PAGLogoView extends LinearLayout {
    protected int containerHeight;
    private cr mAdLogo;
    private Au mAdText;

    public PAGLogoView(Context context0) {
        this(context0, null);
    }

    public PAGLogoView(Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public PAGLogoView(Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.initView(context0);
    }

    @RequiresApi(api = 21)
    public PAGLogoView(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.initView(context0);
    }

    public static PAGLogoView createPAGLogoViewByMaterial(Context context0, Owx owx0) {
        PAGLogoView pAGLogoView0 = new PAGLogoView(context0);
        pAGLogoView0.initData(owx0);
        return pAGLogoView0;
    }

    public void initData(Owx owx0) {
        if(owx0 == null) {
            return;
        }
        this.initData(owx0.pz());
    }

    public void initData(Zh zh0) {
        if(zh0 == null) {
            return;
        }
        if(zh0.JQp()) {
            this.mAdLogo.setImageDrawable(Lrd.ReZ(ub.PjT(), "tt_ad_logo"));
        }
        else {
            String s = zh0.PjT();
            if(TextUtils.isEmpty(s)) {
                this.mAdLogo.setVisibility(8);
            }
            else {
                if(s.contains("logo")) {
                    this.mAdLogo.setImageDrawable(Lrd.ReZ(ub.PjT(), "tt_ad_logo"));
                }
                else {
                    com.bytedance.sdk.openadsdk.SM.cr.PjT(s).ReZ(2).PjT(this.mAdLogo);
                }
                this.mAdLogo.setVisibility(0);
            }
        }
        String s1 = zh0.Zh();
        if(zh0.JQp()) {
            this.mAdText.setText(Lrd.PjT(ub.PjT(), "tt_logo_en"));
            return;
        }
        if(TextUtils.isEmpty(s1)) {
            this.mAdText.setVisibility(8);
            return;
        }
        this.mAdText.setText(s1);
        this.mAdText.setVisibility(0);
    }

    private void initView(Context context0) {
        int v = qZS.Zh(context0, 2.0f);
        this.containerHeight = qZS.Zh(this.getContext(), 12.0f);
        this.mAdLogo = new cr(context0);
        LinearLayout.LayoutParams linearLayout$LayoutParams0 = new LinearLayout.LayoutParams(qZS.Zh(context0, 14.0f), qZS.Zh(context0, 6.0f));
        linearLayout$LayoutParams0.leftMargin = v;
        this.mAdLogo.setLayoutParams(linearLayout$LayoutParams0);
        this.mAdLogo.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.mAdText = new Au(context0);
        LinearLayout.LayoutParams linearLayout$LayoutParams1 = new LinearLayout.LayoutParams(-2, this.containerHeight);
        linearLayout$LayoutParams1.leftMargin = v;
        linearLayout$LayoutParams1.rightMargin = v;
        this.mAdText.setLayoutParams(linearLayout$LayoutParams1);
        this.mAdText.setTextSize(1, 8.0f);
        this.mAdText.setGravity(17);
        this.mAdText.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.addView(this.mAdLogo);
        this.addView(this.mAdText);
        GradientDrawable gradientDrawable0 = new GradientDrawable();
        gradientDrawable0.setShape(0);
        gradientDrawable0.setColor(Color.parseColor("#26000000"));
        gradientDrawable0.setCornerRadius(((float)v));
        this.setBackground(gradientDrawable0);
        this.setGravity(16);
    }

    @Override  // android.widget.LinearLayout
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
    }

    @Override  // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        viewGroup$LayoutParams0.width = -2;
        viewGroup$LayoutParams0.height = this.containerHeight;
        super.setLayoutParams(SM.PjT(this, viewGroup$LayoutParams0));
    }
}

