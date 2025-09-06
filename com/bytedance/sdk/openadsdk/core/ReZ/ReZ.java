package com.bytedance.sdk.openadsdk.core.ReZ;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.Au.ltE;
import com.bytedance.sdk.openadsdk.core.SM;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.widget.JQp;
import com.bytedance.sdk.openadsdk.utils.cr;
import com.bytedance.sdk.openadsdk.utils.qZS;

public class ReZ extends com.bytedance.sdk.openadsdk.core.JQp.ReZ {
    protected PAGBannerAdWrapperListener JQp;
    protected final Context PjT;
    protected Owx ReZ;
    protected ltE Zh;
    protected AdSlot cr;
    protected String cz;

    public ReZ(@NonNull Context context0, Owx owx0, AdSlot adSlot0) {
        super(context0);
        this.cz = "banner_ad";
        if(owx0 != null && owx0.iZZ() != 2) {
            owx0.xf(1);
        }
        this.PjT = context0;
        this.ReZ = owx0;
        this.cr = adSlot0;
        this.PjT();
        AdSlot adSlot1 = this.cr;
        if(adSlot1 != null) {
            this.PjT(adSlot1.getExpressViewAcceptedWidth(), this.cr.getExpressViewAcceptedHeight());
        }
    }

    protected void PjT() {
        ltE ltE0 = new ltE(this.PjT, this.ReZ, this.cr, this.cz);
        this.Zh = ltE0;
        this.addView(ltE0, new ViewGroup.LayoutParams(-1, -1));
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener0 = this.JQp;
        if(pAGBannerAdWrapperListener0 != null) {
            this.setExpressInteractionListener(pAGBannerAdWrapperListener0);
        }
    }

    protected void PjT(float f, float f1) {
        int v = qZS.Zh(this.PjT, f);
        int v1 = qZS.Zh(this.PjT, f1);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(v, v1);
        }
        viewGroup$LayoutParams0.width = v;
        viewGroup$LayoutParams0.height = v1;
        this.setLayoutParams(viewGroup$LayoutParams0);
    }

    public void ReZ() {
        if(this.Zh != null) {
            SM.Zh().cz(this.Zh.getClosedListenerKey());
            this.removeView(this.Zh);
            this.Zh.qj();
            this.Zh = null;
        }
        SM.Zh().tT();
    }

    public void Zh() {
        ltE ltE0 = this.Zh;
        if(ltE0 != null) {
            ltE0.SM();
        }
    }

    public ltE getCurView() {
        return this.Zh;
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if(this.Zh == null) {
            this.PjT();
        }
        cr.PjT(this, this.ReZ);
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setExpressInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener0) {
        this.JQp = pAGBannerAdWrapperListener0;
        ltE ltE0 = this.Zh;
        if(ltE0 != null) {
            ltE0.setJsbLandingPageOpenListener(new JQp() {
                final ReZ PjT;

                @Override  // com.bytedance.sdk.openadsdk.core.widget.JQp
                public void PjT() {
                    ReZ.this.JQp.onAdClicked();
                }
            });
            this.Zh.setExpressInteractionListener(new PAGExpressAdWrapperListener() {
                final ReZ PjT;

                @Override  // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
                public void onAdClicked() {
                    Owx owx0 = ReZ.this.ReZ;
                    if(owx0 != null && owx0.pBJ()) {
                        PAGBannerAdWrapperListener pAGBannerAdWrapperListener0 = ReZ.this.JQp;
                        if(pAGBannerAdWrapperListener0 != null) {
                            pAGBannerAdWrapperListener0.onAdClicked();
                        }
                    }
                }

                @Override  // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdDismissed() {
                }

                @Override  // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdShow(View view0, int v) {
                }

                @Override  // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderFail(View view0, String s, int v) {
                    ReZ reZ0 = ReZ.this;
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener0 = reZ0.JQp;
                    if(pAGBannerAdWrapperListener0 != null) {
                        pAGBannerAdWrapperListener0.onRenderFail(reZ0, s, v);
                    }
                }

                @Override  // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderSuccess(View view0, float f, float f1) {
                    ltE ltE0 = ReZ.this.Zh;
                    if(ltE0 != null) {
                        ltE0.setSoundMute(true);
                    }
                    ltE ltE1 = ReZ.this.Zh;
                    if(ltE1 != null && !com.bytedance.sdk.openadsdk.core.DWo.ReZ.PjT(ltE1.getDynamicShowType())) {
                        ReZ.this.PjT(f, f1);
                    }
                    ReZ reZ0 = ReZ.this;
                    PAGBannerAdWrapperListener pAGBannerAdWrapperListener0 = reZ0.JQp;
                    if(pAGBannerAdWrapperListener0 != null) {
                        pAGBannerAdWrapperListener0.onRenderSuccess(reZ0, f, f1);
                    }
                }
            });
        }
    }
}

