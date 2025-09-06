package com.bytedance.sdk.openadsdk.component.reward.PjT;

import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot.Builder;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.component.reward.view.Au;
import com.bytedance.sdk.openadsdk.core.Au.SM;
import com.bytedance.sdk.openadsdk.core.DWo.ReZ;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.model.gK;
import com.bytedance.sdk.openadsdk.core.xf.cr.Zh;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;

public class cz {
    private final PjT PjT;

    public cz(PjT pjT0) {
        this.PjT = pjT0;
    }

    public void PjT(float[] arr_f, Zh zh0, com.bytedance.sdk.openadsdk.component.reward.Zh.Zh zh1) {
        FrameLayout.LayoutParams frameLayout$LayoutParams0;
        Arrays.toString(arr_f);
        int v = this.PjT.Zh.joj();
        AdSlot adSlot0 = new Builder().setCodeId(String.valueOf(v)).setExpressViewAcceptedSize(arr_f[0], arr_f[1]).build();
        this.PjT.yIW.PjT(adSlot0, this.PjT.Zd.qla);
        PjT pjT0 = this.PjT;
        fDm fDm0 = pjT0.wN;
        if(fDm0 != null) {
            Au au0 = pjT0.yIW;
            if(au0 != null) {
                fDm0.PjT(au0.PjT());
            }
        }
        com.bytedance.sdk.openadsdk.component.reward.PjT.cz.1 cz$10 = new com.bytedance.sdk.openadsdk.core.Au.fDm() {
            final cz ReZ;

            @Override  // com.bytedance.sdk.openadsdk.core.Au.fDm
            public void JQp() {
                cz.this.PjT.Qf.PjT(zh1);
            }

            @Override  // com.bytedance.sdk.openadsdk.core.Au.fDm
            public void PjT() {
                cz.this.PjT.wN.cr();
            }

            @Override  // com.bytedance.sdk.openadsdk.core.Au.fDm
            public void PjT(int v) {
                switch(v) {
                    case 2: {
                        cz.this.PjT.tT.iZZ();
                        return;
                    }
                    case 3: {
                        cz.this.PjT.tT.PjT(zh0);
                        return;
                    }
                    case 4: {
                        cz.this.PjT.tT.xs();
                        return;
                    }
                    case 1: 
                    case 5: {
                        if(!cz.this.PjT.tT.Zh() && !cz.this.PjT.tT.cr()) {
                            zh0.PjT(0L, false);
                        }
                    }
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.core.Au.fDm
            public void PjT(int v, com.bytedance.sdk.component.adexpress.Zh.fDm fDm0) {
                cz.this.PjT.Zd.PjT(v, fDm0);
            }

            @Override  // com.bytedance.sdk.openadsdk.core.Au.fDm
            public void PjT(int v, String s) {
                cz.this.PjT.tT.PjT(v, s);
            }

            @Override  // com.bytedance.sdk.openadsdk.core.Au.fDm
            public void PjT(String s, JSONObject jSONObject0) {
                if(cz.this.PjT != null && cz.this.PjT.kph != null) {
                    cz.this.PjT.kph.PjT(s, jSONObject0);
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.core.Au.fDm
            public void PjT(boolean z, String s) {
                if(cz.this.PjT.xH != z) {
                    cz.this.PjT.wN.PjT(s);
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.core.Au.fDm
            public long ReZ() {
                return cz.this.PjT.tT.Au();
            }

            @Override  // com.bytedance.sdk.openadsdk.core.Au.fDm
            public void Zh() {
                if(cz.this.PjT.Zd != null && cz.this.PjT.Zd.DWo() != null) {
                    cz.this.PjT.Zd.DWo().performClick();
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.core.Au.fDm
            public void Zh(int v) {
                cz.this.PjT.MWx = v;
            }

            @Override  // com.bytedance.sdk.openadsdk.core.Au.fDm
            public int cr() {
                if(cz.this.PjT.yIW.ReZ()) {
                    return 4;
                }
                if(cz.this.PjT.yIW.cr()) {
                    return 5;
                }
                if(cz.this.PjT.tT.JQp()) {
                    return 1;
                }
                if(cz.this.PjT.tT.Zh()) {
                    return 2;
                }
                cz.this.PjT.tT.cr();
                return 3;
            }
        };
        this.PjT.yIW.PjT(cz$10);
        com.bytedance.sdk.openadsdk.component.reward.PjT.cz.2 cz$20 = new PAGExpressAdWrapperListener() {
            final cz ReZ;

            @Override  // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
                if(cz.this.PjT != null && cz.this.PjT.Zh != null && cz.this.PjT.Zh.pBJ()) {
                    zh0.c_();
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
                if(!cz.this.PjT.Zh.es()) {
                    cz.this.PjT.Jo.PjT(true);
                    cz.this.PjT.Jo.JQp();
                }
                cz.this.PjT.yIW.JQp().post(new Runnable() {
                    final com.bytedance.sdk.openadsdk.component.reward.PjT.cz.2 PjT;

                    @Override
                    public void run() {
                        com.bytedance.sdk.openadsdk.component.reward.PjT.cz.2.this.Zh.PjT(false, false, false, 90);
                    }
                });
                cz.this.PjT.Zd.xs();
            }

            @Override  // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view0, float f, float f1) {
                if(cRA.gK(cz.this.PjT.Zh)) {
                    return;
                }
                if(!cz.this.PjT.Zh.es()) {
                    if(cz.this.PjT.yIW.Au()) {
                        zh1.PjT(true);
                        cz.this.PjT.tT.ReZ(false);
                    }
                    else {
                        cz.this.PjT.tT.ReZ(true);
                    }
                    cz.this.PjT.Zd.PjT(8);
                    cz.this.PjT.Jo.PjT(true);
                    cz.this.PjT.Jo.JQp();
                    if(cz.this.PjT.yIW.Au()) {
                        cz.this.PjT.yIW.Zh().setBackgroundColor(0xFF000000);
                        FrameLayout frameLayout0 = cz.this.PjT.Zd.cz();
                        zh1.PjT(frameLayout0);
                    }
                    else if(cz.this.PjT.Zh.MWx() != null && zh1.PjT()) {
                        cz.this.PjT.Ld = true;
                    }
                }
                zh1.yIW();
                if(gK.ReZ(cz.this.PjT.Zh)) {
                    gK gK0 = cz.this.PjT.Zd.qla;
                    if(gK0 != null) {
                        gK0.ReZ();
                    }
                }
                if(zh1 instanceof com.bytedance.sdk.openadsdk.component.reward.Zh.cz) {
                    boolean z = cz.this.PjT.yIW.Au();
                    com.bytedance.sdk.openadsdk.component.reward.Zh.cz.PjT(cz.this.PjT.Zh, z, cz.this.PjT.JQp);
                    if(!cz.this.PjT.yIW.Au()) {
                        cz.this.PjT.kph.cz();
                    }
                }
                cz.this.PjT.Zd.xs();
            }
        };
        this.PjT.yIW.PjT(cz$20);
        com.bytedance.sdk.openadsdk.component.reward.PjT.cz.3 cz$30 = new SM(this.PjT.rds, this.PjT.Zh, this.PjT.JQp, wN.PjT(this.PjT.JQp)) {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.Zh.Zh
            public void PjT(View view0, float f, float f1, float f2, float f3, SparseArray sparseArray0, boolean z) {
                super.PjT(view0, f, f1, f2, f3, sparseArray0, z);
            }
        };
        cz$30.PjT(new com.bytedance.sdk.openadsdk.core.Zh.Zh.PjT() {
            final cz Zh;

            @Override  // com.bytedance.sdk.openadsdk.core.Zh.Zh$PjT
            public void PjT(View view0, int v) {
                zh0.c_();
            }
        });
        HashMap hashMap0 = new HashMap();
        if(cRA.gK(this.PjT.Zh)) {
            hashMap0.put("click_scence", 3);
        }
        else {
            hashMap0.put("click_scence", 1);
        }
        PjT pjT1 = this.PjT;
        if(pjT1.ix) {
            com.bytedance.sdk.openadsdk.activity.cz cz0 = pjT1.hN;
            if(cz0 != null) {
                int v1 = !pjT1.Nv || cz0.cRA() == null ? this.PjT.hN.SM : this.PjT.hN.cRA().PjT(this.PjT.hN);
                try {
                    JSONObject jSONObject0 = new JSONObject();
                    jSONObject0.put("ad_show_order", v1 + 1);
                    hashMap0.put("pag_json_data", jSONObject0.toString());
                }
                catch(Throwable unused_ex) {
                }
            }
        }
        cz$30.PjT(hashMap0);
        com.bytedance.sdk.openadsdk.component.reward.PjT.cz.5 cz$50 = new com.bytedance.sdk.openadsdk.core.Au.Au(this.PjT.rds, this.PjT.Zh, this.PjT.JQp, wN.PjT(this.PjT.JQp)) {
            final cz PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.Zh.PjT
            public void PjT(View view0, float f, float f1, float f2, float f3, SparseArray sparseArray0, boolean z) {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("duration", cz.this.PjT.tT.XX());
                this.PjT(hashMap0);
                super.PjT(view0, f, f1, f2, f3, sparseArray0, z);
            }
        };
        cz$50.PjT(new com.bytedance.sdk.openadsdk.core.Zh.Zh.PjT() {
            final cz Zh;

            @Override  // com.bytedance.sdk.openadsdk.core.Zh.Zh$PjT
            public void PjT(View view0, int v) {
                zh0.c_();
            }
        });
        HashMap hashMap1 = new HashMap();
        if(cRA.gK(this.PjT.Zh)) {
            hashMap1.put("click_scence", 3);
        }
        else {
            hashMap1.put("click_scence", 1);
        }
        cz$50.PjT(hashMap1);
        this.PjT.yIW.PjT(cz$30, cz$50);
        if(this.PjT.Zh.es()) {
            frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
        }
        else if(ReZ.PjT(this.PjT.Zh.ZX())) {
            frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
        }
        else {
            frameLayout$LayoutParams0 = gK.ReZ(this.PjT.Zh) ? new FrameLayout.LayoutParams(-1, -1) : new FrameLayout.LayoutParams(-2, -2);
        }
        frameLayout$LayoutParams0.gravity = 17;
        this.PjT.Zd.cz().addView(this.PjT.yIW.PjT(), frameLayout$LayoutParams0);
        if(!this.PjT.yIW.Au()) {
            zh1.PjT(false);
        }
        this.PjT.yIW.qj();
    }
}

