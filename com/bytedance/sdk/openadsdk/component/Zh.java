package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot.Builder;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.component.SM.XX;
import com.bytedance.sdk.openadsdk.core.Au.Au;
import com.bytedance.sdk.openadsdk.core.Au.SM;
import com.bytedance.sdk.openadsdk.core.Au.ltE;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import org.json.JSONObject;

public class Zh extends ReZ {
    private com.bytedance.sdk.openadsdk.component.SM.Zh fDm;
    private boolean qla;
    private XX xE;
    private final com.bytedance.sdk.openadsdk.component.cz.Zh xs;

    public Zh(Activity activity0, Owx owx0, FrameLayout frameLayout0, PjT pjT0, int v, boolean z, com.bytedance.sdk.openadsdk.component.Au.PjT pjT1, com.bytedance.sdk.openadsdk.component.cz.Zh zh0) {
        super(activity0, owx0, frameLayout0, pjT0, v, z, pjT1);
        this.xs = zh0;
    }

    @Override  // com.bytedance.sdk.openadsdk.component.ReZ
    public void JQp() {
        com.bytedance.sdk.openadsdk.component.SM.Zh zh0 = this.fDm;
        if(zh0 != null) {
            zh0.Au();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.component.ReZ
    public JSONObject PjT(JSONObject jSONObject0) {
        return this.fDm.PjT(jSONObject0, this.Zh);
    }

    @Override  // com.bytedance.sdk.openadsdk.component.ReZ
    public void PjT() {
        SM sM0 = com.bytedance.sdk.openadsdk.component.PjT.Zh.PjT(this.Zh, this.PjT, this.xf, this.fDm);
        sM0.PjT(new com.bytedance.sdk.openadsdk.core.Zh.Zh.PjT() {
            final Zh PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.Zh.Zh$PjT
            public void PjT(View view0, int v) {
                Zh.this.JQp.JQp();
            }
        });
        this.fDm.setClickListener(sM0);
        Au au0 = com.bytedance.sdk.openadsdk.component.PjT.Zh.Zh(this.Zh, this.PjT, this.xf, this.fDm);
        this.fDm.setClickCreativeListener(au0);
        au0.PjT(new com.bytedance.sdk.openadsdk.core.Zh.Zh.PjT() {
            final Zh PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.Zh.Zh$PjT
            public void PjT(View view0, int v) {
                Zh.this.JQp.JQp();
            }
        });
        super.cz();
        this.fDm.setBackupListener(new com.bytedance.sdk.component.adexpress.Zh.ReZ() {
            final Zh PjT;

            @Override  // com.bytedance.sdk.component.adexpress.Zh.ReZ
            public boolean PjT(ViewGroup viewGroup0, int v) {
                StringBuilder stringBuilder0 = new StringBuilder("isUseBackup() called with: view = [");
                stringBuilder0.append(viewGroup0);
                stringBuilder0.append("], errCode = [");
                stringBuilder0.append(v);
                stringBuilder0.append("]");
                try {
                    ((ltE)viewGroup0).xf();
                    new com.bytedance.sdk.openadsdk.component.SM.PjT(Zh.this.PjT).PjT(Zh.this.fDm);
                    return true;
                }
                catch(Exception exception0) {
                    Log.e("AppOpenAdExpressManager", "", exception0);
                    return false;
                }
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.component.ReZ
    public void PjT(int v, boolean z) {
        super.PjT(v, z);
    }

    @Override  // com.bytedance.sdk.openadsdk.component.ReZ
    public void PjT(ViewGroup viewGroup0) {
        Pair pair0 = com.bytedance.sdk.openadsdk.core.Au.PjT.PjT.PjT(this.PjT.getWindow(), this.XX);
        AdSlot adSlot0 = new Builder().setCodeId(String.valueOf(this.Zh.joj())).setExpressViewAcceptedSize(((float)(((Float)pair0.first))), ((float)(((Float)pair0.second)))).build();
        com.bytedance.sdk.openadsdk.component.SM.Zh zh0 = new com.bytedance.sdk.openadsdk.component.SM.Zh(this.PjT, this.Zh, adSlot0, "open_ad", this.JQp, this.xs, this.xf);
        this.fDm = zh0;
        zh0.setTopListener(this.JQp);
        this.fDm.setExpressVideoListenerProxy(this.JQp);
        this.fDm.setExpressInteractionListener(new PAGExpressAdWrapperListener() {
            final Zh PjT;

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
                Zh.this.JQp.cr();
            }

            @Override  // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view0, float f, float f1) {
                if(!Zh.this.fDm.xs()) {
                    if(Zh.this.Zh.Pv()) {
                        Zh.this.JQp.ReZ();
                        return;
                    }
                    Zh zh0 = Zh.this;
                    if(zh0.ReZ) {
                        if(zh0.PjT(zh0.fDm.getVideoFrameLayout())) {
                            Zh.this.fDm.setVideoManager(Zh.this.XX());
                            Zh.this.JQp.ReZ();
                            return;
                        }
                        Zh.this.JQp.cr();
                        return;
                    }
                    zh0.JQp.ReZ();
                    return;
                }
                Zh.this.qla = true;
                if(Zh.this.xE != null) {
                    ViewParent viewParent0 = Zh.this.xE.getParent();
                    if(Zh.this.cr == viewParent0) {
                        Zh.this.cr.removeView(Zh.this.xE);
                    }
                }
                Zh.this.super.PjT(Zh.this.cr);
                Zh.this.super.PjT();
                Zh.this.super.Zh();
            }
        });
        this.Zh.xf(1);
        com.bytedance.sdk.openadsdk.component.SM.Zh zh1 = this.fDm;
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
        this.cr.addView(zh1, frameLayout$LayoutParams0);
        XX xX0 = new XX(this.PjT);
        this.xE = xX0;
        this.cr.addView(xX0);
        this.SM = this.xE.getTopDislike();
        this.DWo = this.xE.getTopSkip();
        this.qj = this.xE.getTopCountDown();
    }

    @Override  // com.bytedance.sdk.openadsdk.component.ReZ
    public void ReZ() {
        super.ReZ();
        com.bytedance.sdk.openadsdk.component.SM.Zh zh0 = this.fDm;
        if(zh0 != null) {
            zh0.qj();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.component.ReZ
    public void Zh() {
        this.fDm.SM();
    }

    @Override  // com.bytedance.sdk.openadsdk.component.ReZ
    public int cr() {
        return this.fDm.getDynamicShowType();
    }
}

