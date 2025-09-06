package com.bytedance.sdk.openadsdk.PjT.Zh.PjT;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.PjT.Zh.Au;
import com.bytedance.sdk.openadsdk.PjT.Zh.Zh;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.core.Au.gK;
import com.bytedance.sdk.openadsdk.core.Au.ltE;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.utils.qZS;

public class ReZ extends Au {
    protected final Context Au;
    protected ltE DWo;
    protected AdSlot SM;
    protected String qj;
    private boolean xf;

    public ReZ(@NonNull Context context0, Owx owx0, AdSlot adSlot0) {
        super(context0, owx0, 5, true);
        this.qj = "embeded_ad";
        this.xf = false;
        this.Zh.xf(1);
        this.cr.PjT(this);
        this.Au = context0;
        this.SM = adSlot0;
        this.PjT();
        this.Zh();
    }

    public void JQp() {
        ltE ltE0 = this.DWo;
        if(ltE0 != null) {
            ltE0.SM();
        }
    }

    private void PjT(float f, float f1) {
        if(this.DWo != null && com.bytedance.sdk.openadsdk.core.DWo.ReZ.PjT(this.DWo.getDynamicShowType())) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.DWo.getLayoutParams();
            if(viewGroup$LayoutParams0 == null) {
                viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(-1, -1);
            }
            else {
                viewGroup$LayoutParams0.width = -1;
                viewGroup$LayoutParams0.height = -1;
            }
            this.DWo.setLayoutParams(viewGroup$LayoutParams0);
            return;
        }
        int v = qZS.Zh(this.Au, f);
        int v1 = qZS.Zh(this.Au, f1);
        ViewGroup.LayoutParams viewGroup$LayoutParams1 = this.DWo.getLayoutParams();
        if(viewGroup$LayoutParams1 == null) {
            viewGroup$LayoutParams1 = new ViewGroup.LayoutParams(v, v1);
        }
        else {
            viewGroup$LayoutParams1.width = v;
            viewGroup$LayoutParams1.height = v1;
        }
        this.DWo.setLayoutParams(viewGroup$LayoutParams1);
    }

    protected void PjT() {
        this.DWo = new ltE(this.Au, this.Zh, this.SM, this.qj);
        this.ReZ();
    }

    public void PjT(boolean z) {
        this.xf = z;
    }

    protected void ReZ() {
        ltE ltE0 = this.DWo;
        if(ltE0 != null) {
            ltE0.setExpressInteractionListener(new PAGExpressAdWrapperListener() {
                final ReZ PjT;

                @Override  // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
                public void onAdClicked() {
                }

                @Override  // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdDismissed() {
                }

                @Override  // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdShow(View view0, int v) {
                }

                @Override  // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderFail(View view0, String s, int v) {
                }

                @Override  // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderSuccess(View view0, float f, float f1) {
                    if(ReZ.this.DWo.xs()) {
                        Zh zh0 = new Zh(ReZ.this.Au, ReZ.this.Zh, 5, ReZ.this.SM, ReZ.this.cr, ReZ.this.PjT);
                        ReZ reZ0 = ReZ.this;
                        if(reZ0 instanceof com.bytedance.sdk.openadsdk.PjT.Zh.PjT.Zh) {
                            zh0.PjT(((gK)reZ0.cr()).getVideoAdListener());
                        }
                        ReZ.this.cr.PjT(ReZ.this.DWo.getClickCreativeListener());
                        PAGMediaView pAGMediaView0 = ReZ.this.cr.SM();
                        if(pAGMediaView0 == null) {
                            pAGMediaView0 = new PAGMediaView(ReZ.this.Au);
                        }
                        ReZ.this.DWo.addView(pAGMediaView0);
                        return;
                    }
                    ReZ.this.PjT(f, f1);
                    if(ReZ.this.xf) {
                        ReZ.this.DWo.Au();
                    }
                }
            });
        }
    }

    private void Zh() {
        ltE ltE0 = this.DWo;
        if(ltE0 != null) {
            ltE0.setBackupListener(new com.bytedance.sdk.component.adexpress.Zh.ReZ() {
                final ReZ PjT;

                @Override  // com.bytedance.sdk.component.adexpress.Zh.ReZ
                public boolean PjT(ViewGroup viewGroup0, int v) {
                    PjT pjT0 = new PjT(ReZ.this.DWo.getContext());
                    pjT0.setExtraFuncationHelper(ReZ.this.cr);
                    pjT0.PjT(ReZ.this.DWo);
                    return true;
                }
            });
        }
    }

    public ltE cr() {
        return this.DWo;
    }
}

