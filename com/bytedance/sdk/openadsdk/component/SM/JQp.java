package com.bytedance.sdk.openadsdk.component.SM;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout.LayoutParams;
import com.bytedance.sdk.openadsdk.core.Au.JQp.Zh;
import com.bytedance.sdk.openadsdk.core.Au.cr;
import com.bytedance.sdk.openadsdk.core.JQp.Au;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.qla;
import com.bytedance.sdk.openadsdk.utils.qZS;

public class JQp extends ReZ {
    public interface PjT {
        void PjT(View arg1, int arg2);
    }

    PjT xs;

    public JQp(Context context0, Owx owx0) {
        super(context0);
        this.PjT(context0, owx0);
    }

    private void PjT(Context context0, Owx owx0) {
        com.bytedance.sdk.openadsdk.core.Au.JQp jQp0 = new com.bytedance.sdk.openadsdk.core.Au.JQp(context0);
        cr.PjT().ReZ(jQp0);
        jQp0.PjT(owx0, new Zh() {
            final JQp PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.Au.JQp$Zh
            public View PjT() {
                XX xX0 = JQp.this.Au;
                return xX0 == null ? null : xX0.getTopDislike();
            }

            @Override  // com.bytedance.sdk.openadsdk.core.Au.JQp$Zh
            public void PjT(int v, int v1) {
            }

            @Override  // com.bytedance.sdk.openadsdk.core.Au.JQp$Zh
            public void PjT(View view0, int v) {
                PjT jQp$PjT0 = JQp.this.xs;
                if(jQp$PjT0 != null) {
                    jQp$PjT0.PjT(view0, v);
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.core.Au.JQp$Zh
            public View Zh() {
                return JQp.this;
            }

            @Override  // com.bytedance.sdk.openadsdk.core.Au.JQp$Zh
            public void e_() {
            }
        }, "open_ad");
        this.addView(jQp0, new ViewGroup.LayoutParams(-1, -1));
        jQp0.Owx();
        int v = qZS.Zh(context0, 9.0f);
        int v1 = qZS.Zh(context0, 10.0f);
        this.cr = PAGLogoView.createPAGLogoViewByMaterial(context0, owx0);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, qZS.Zh(context0, 14.0f));
        relativeLayout$LayoutParams0.leftMargin = v1;
        relativeLayout$LayoutParams0.bottomMargin = v1;
        relativeLayout$LayoutParams0.addRule(12);
        relativeLayout$LayoutParams0.addRule(9);
        this.addView(this.cr, relativeLayout$LayoutParams0);
        com.bytedance.sdk.openadsdk.core.widget.ReZ reZ0 = new com.bytedance.sdk.openadsdk.core.widget.ReZ(context0);
        this.xf = reZ0;
        reZ0.setPadding(v, 0, v, 0);
        this.xf.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(qZS.Zh(context0, 32.0f), qZS.Zh(context0, 14.0f));
        relativeLayout$LayoutParams1.addRule(12);
        relativeLayout$LayoutParams1.addRule(11);
        relativeLayout$LayoutParams1.setMargins(0, 0, v1, v1);
        this.addView(this.xf, relativeLayout$LayoutParams1);
        XX xX0 = this.Au;
        if(xX0 != null) {
            this.addView(xX0);
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.component.SM.ReZ
    public com.bytedance.sdk.openadsdk.core.JQp.cr getAdIconView() {
        return null;
    }

    @Override  // com.bytedance.sdk.openadsdk.component.SM.ReZ
    public Au getAdTitleTextView() {
        return null;
    }

    @Override  // com.bytedance.sdk.openadsdk.component.SM.ReZ
    public qla getScoreBar() {
        return null;
    }

    @Override  // com.bytedance.sdk.openadsdk.component.SM.ReZ
    public View getUserInfo() {
        return null;
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.xs = null;
    }

    public void setRenderListener(PjT jQp$PjT0) {
        this.xs = jQp$PjT0;
    }
}

