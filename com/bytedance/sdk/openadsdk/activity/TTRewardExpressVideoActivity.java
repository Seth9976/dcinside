package com.bytedance.sdk.openadsdk.activity;

import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.component.reward.PjT.PjT;
import com.bytedance.sdk.openadsdk.component.reward.PjT.ub;
import com.bytedance.sdk.openadsdk.component.reward.view.Au;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.gK;
import com.bytedance.sdk.openadsdk.cr.XX;
import com.bytedance.sdk.openadsdk.utils.fDm;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import x.b.a;

public class TTRewardExpressVideoActivity extends TTRewardVideoActivity {
    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void JQp() {
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity
    public boolean PjT(long v, boolean z) {
        Au au0 = this.Zh.yIW;
        XX xX0 = au0 == null || au0.PjT() == null ? new XX() : this.Zh.yIW.PjT().getAdShowTime();
        this.Zh.tT.PjT(this.Zh.yIW.Zh(), xX0);
        HashMap hashMap0 = new HashMap();
        Au au1 = this.Zh.yIW;
        if(au1 != null) {
            hashMap0.put("dynamic_show_type", au1.SM());
            JSONObject jSONObject0 = this.Zh.yIW.PjT(null);
            if(jSONObject0 != null) {
                Iterator iterator0 = jSONObject0.keys();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    String s = (String)object0;
                    try {
                        hashMap0.put(s, jSONObject0.get(s));
                    }
                    catch(JSONException unused_ex) {
                    }
                }
            }
        }
        this.Zh.tT.PjT(new a() {
            boolean PjT;
            final TTRewardExpressVideoActivity Zh;

            @Override  // x.b$a
            public void PjT() {
                TTRewardExpressVideoActivity.this.cr.removeMessages(300);
                TTRewardExpressVideoActivity.this.xE();
                TTRewardExpressVideoActivity.this.Owx();
                TTRewardExpressVideoActivity tTRewardExpressVideoActivity0 = TTRewardExpressVideoActivity.this;
                if(tTRewardExpressVideoActivity0.Zh.ReZ) {
                    tTRewardExpressVideoActivity0.PjT(false, 6);
                }
                else {
                    tTRewardExpressVideoActivity0.finish();
                }
                ub ub0 = TTRewardExpressVideoActivity.this.Zh.tT;
                ub0.PjT(!ub0.Yo(), !TTRewardExpressVideoActivity.this.Zh.tT.Yo());
                TTRewardExpressVideoActivity.this.Zh.tT.fDm();
            }

            @Override  // x.b$a
            public void PjT(long v, int v1) {
                if(this.PjT) {
                    return;
                }
                this.PjT = true;
                TTRewardExpressVideoActivity.this.cr.removeMessages(300);
                TTRewardExpressVideoActivity.this.xE();
                TTRewardExpressVideoActivity.this.Zh.tT.PjT(v, v);
                TTRewardExpressVideoActivity.this.Zh.yIW.Zh(true);
                if(TTRewardExpressVideoActivity.this.Zh.Zh.RD() == 36) {
                    PjT pjT0 = TTRewardExpressVideoActivity.this.Zh;
                    if(pjT0.ReZ) {
                        pjT0.Lrd.ReZ().cr();
                        fDm.Zh();
                    }
                }
                if(TTRewardExpressVideoActivity.this.Zh.Zh.RD() == 21 && !TTRewardExpressVideoActivity.this.Zh.Zh.Au()) {
                    TTRewardExpressVideoActivity.this.Zh.Zh.Zh(true);
                    TTRewardExpressVideoActivity.this.Zh.Zd.ub();
                }
                PjT pjT1 = TTRewardExpressVideoActivity.this.Zh;
                if(!pjT1.ReZ) {
                    if(!pjT1.Zh.Ik()) {
                        if(!Owx.JQp(TTRewardExpressVideoActivity.this.Zh.Zh)) {
                            TTRewardExpressVideoActivity.this.Zh.tT.PjT("skip", true);
                        }
                        TTRewardExpressVideoActivity.this.finish();
                    }
                    else if(TTRewardExpressVideoActivity.this.Zh.yIW.SM() == 1) {
                        TTRewardExpressVideoActivity.this.Zh.wN.ReZ();
                    }
                }
                else if(!pjT1.Zh.Ik()) {
                    TTRewardExpressVideoActivity.this.PjT(false, 5);
                    if(!Owx.JQp(TTRewardExpressVideoActivity.this.Zh.Zh)) {
                        TTRewardExpressVideoActivity.this.Zh.tT.PjT("skip", true);
                    }
                }
                else if(TTRewardExpressVideoActivity.this.Zh.yIW.SM() == 1) {
                    TTRewardExpressVideoActivity.this.Zh.wN.ReZ();
                }
                TTRewardExpressVideoActivity.this.xf = (int)(System.currentTimeMillis() / 1000L);
                TTRewardExpressVideoActivity.this.Owx();
            }

            @Override  // x.b$a
            public void PjT(long v, long v1) {
                int v2;
                PjT pjT0 = TTRewardExpressVideoActivity.this.Zh;
                if(!pjT0.dwk && pjT0.tT.Zh()) {
                    TTRewardExpressVideoActivity.this.Zh.tT.xE();
                }
                if(TTRewardExpressVideoActivity.this.Zh.DWo.get()) {
                    return;
                }
                TTRewardExpressVideoActivity.this.cr.removeMessages(300);
                if(v != TTRewardExpressVideoActivity.this.Zh.tT.Au()) {
                    TTRewardExpressVideoActivity.this.xE();
                }
                if(!TTRewardExpressVideoActivity.this.Zh.tT.Zh()) {
                    return;
                }
                TTRewardExpressVideoActivity.this.Zh.tT.PjT(v, v1);
                PjT pjT1 = TTRewardExpressVideoActivity.this.Zh;
                if(pjT1 == null || (pjT1.Zh == null || pjT1.Zh.Zh() < 0)) {
                    v2 = TTRewardExpressVideoActivity.this.Zh == null ? 30 : com.bytedance.sdk.openadsdk.core.ub.cr().DWo(String.valueOf(TTRewardExpressVideoActivity.this.Zh.cz));
                }
                else {
                    v2 = TTRewardExpressVideoActivity.this.Zh.Zh.Zh();
                }
                boolean z = TTRewardExpressVideoActivity.this.Zh.yIW.Au() && v2 >= 0;
                TTRewardExpressVideoActivity.this.cz = (int)(TTRewardExpressVideoActivity.this.Zh.tT.KM() - ((double)(v / 1000L)));
                if((TTRewardExpressVideoActivity.this.Zh.Owx.get() || TTRewardExpressVideoActivity.this.Zh.qj.get()) && TTRewardExpressVideoActivity.this.Zh.tT.Zh()) {
                    TTRewardExpressVideoActivity.this.Zh.tT.xE();
                }
                TTRewardExpressVideoActivity tTRewardExpressVideoActivity0 = TTRewardExpressVideoActivity.this;
                int v3 = tTRewardExpressVideoActivity0.cz;
                if(v3 >= 0) {
                    tTRewardExpressVideoActivity0.Zh.wN.PjT(String.valueOf(v3), null);
                }
                TTRewardExpressVideoActivity.this.Zh.Zd.cr(((int)(v / 1000L)));
                TTRewardExpressVideoActivity.this.Zh(v, v1);
                Au au0 = TTRewardExpressVideoActivity.this.Zh.yIW;
                if(au0 != null && au0.PjT() != null) {
                    TTRewardExpressVideoActivity.this.Zh.yIW.PjT().setTime(String.valueOf(TTRewardExpressVideoActivity.this.cz), ((int)(v / 1000L)), 0, false);
                }
                TTRewardExpressVideoActivity tTRewardExpressVideoActivity1 = TTRewardExpressVideoActivity.this;
                if(tTRewardExpressVideoActivity1.cz > 0) {
                    if(z && ((int)(v / 1000L)) >= v2 && tTRewardExpressVideoActivity1.Zh.Zh.RD() != 5 && TTRewardExpressVideoActivity.this.Zh.Zh.RD() != 33) {
                        TTRewardExpressVideoActivity.this.Zh.PjT(true);
                        TTRewardExpressVideoActivity.this.Zh.wN.PjT(String.valueOf(TTRewardExpressVideoActivity.this.cz), TTAdDislikeToast.getSkipText());
                        TTRewardExpressVideoActivity.this.Zh.wN.JQp(true);
                        return;
                    }
                    TTRewardExpressVideoActivity.this.Zh.wN.PjT(String.valueOf(TTRewardExpressVideoActivity.this.cz), null);
                }
            }

            @Override  // x.b$a
            public void Zh(long v, int v1) {
                TTRewardExpressVideoActivity.this.cr.removeMessages(300);
                gK gK0 = TTRewardExpressVideoActivity.this.Zh.Zd.qla;
                if(gK0 != null) {
                    gK0.DWo();
                }
                if(TTRewardExpressVideoActivity.this.Zh.tT.Zh()) {
                    TTRewardExpressVideoActivity.this.qla();
                    return;
                }
                TTRewardExpressVideoActivity.this.Owx();
                TTRewardExpressVideoActivity.this.Zh.tT.fDm();
                TTRewardExpressVideoActivity tTRewardExpressVideoActivity0 = TTRewardExpressVideoActivity.this;
                if(tTRewardExpressVideoActivity0.Zh.ReZ) {
                    tTRewardExpressVideoActivity0.PjT(false, 3);
                }
                else {
                    tTRewardExpressVideoActivity0.finish();
                }
                TTRewardExpressVideoActivity.this.Zh.yIW.PjT(true);
                ub ub0 = TTRewardExpressVideoActivity.this.Zh.tT;
                ub0.PjT(true ^ ub0.Yo(), 2);
            }
        });
        boolean z1 = this.Zh.tT.PjT(v, z, hashMap0, this.ReZ);
        if(z1 && !z) {
            this.qj = (int)(System.currentTimeMillis() / 1000L);
        }
        return z1;
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean ltE() {
        return true;
    }
}

