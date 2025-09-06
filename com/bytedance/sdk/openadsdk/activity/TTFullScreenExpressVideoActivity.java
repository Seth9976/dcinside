package com.bytedance.sdk.openadsdk.activity;

import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.component.reward.PjT.PjT;
import com.bytedance.sdk.openadsdk.component.reward.PjT.ub;
import com.bytedance.sdk.openadsdk.component.reward.Zh.SM;
import com.bytedance.sdk.openadsdk.component.reward.Zh.Zh;
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

public class TTFullScreenExpressVideoActivity extends TTFullScreenVideoActivity {
    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void JQp() {
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity
    public boolean PjT(long v, boolean z) {
        Au au0 = this.Zh.yIW;
        XX xX0 = au0 == null || au0.PjT() == null ? new XX() : this.Zh.yIW.PjT().getAdShowTime();
        Zh zh0 = this.ReZ;
        if(zh0 == null || !(zh0 instanceof SM)) {
            this.Zh.tT.PjT(this.Zh.yIW.Zh(), xX0);
        }
        else {
            PjT pjT0 = this.Zh;
            if(pjT0.Ld) {
                this.Zh.tT.PjT(this.Zh.yIW.Zh(), xX0);
            }
            else {
                FrameLayout frameLayout0 = ((SM)zh0).KM();
                pjT0.tT.PjT(frameLayout0, xX0);
            }
        }
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
            final TTFullScreenExpressVideoActivity Zh;

            @Override  // x.b$a
            public void PjT() {
                TTFullScreenExpressVideoActivity.this.cr.removeMessages(300);
                TTFullScreenExpressVideoActivity.this.xE();
                TTFullScreenExpressVideoActivity tTFullScreenExpressVideoActivity0 = TTFullScreenExpressVideoActivity.this;
                if(tTFullScreenExpressVideoActivity0.Zh.ReZ) {
                    tTFullScreenExpressVideoActivity0.PjT(false, 6);
                }
                else {
                    tTFullScreenExpressVideoActivity0.finish();
                }
                ub ub0 = TTFullScreenExpressVideoActivity.this.Zh.tT;
                ub0.PjT(!ub0.Yo(), !TTFullScreenExpressVideoActivity.this.Zh.tT.Yo());
                TTFullScreenExpressVideoActivity.this.Zh.tT.fDm();
            }

            @Override  // x.b$a
            public void PjT(long v, int v1) {
                if(this.PjT) {
                    return;
                }
                this.PjT = true;
                TTFullScreenExpressVideoActivity.this.cr.removeMessages(300);
                TTFullScreenExpressVideoActivity.this.xE();
                TTFullScreenExpressVideoActivity.this.Zh.tT.PjT(v, v);
                TTFullScreenExpressVideoActivity.this.Zh.yIW.Zh(true);
                if(TTFullScreenExpressVideoActivity.this.Zh.Zh.RD() == 36) {
                    PjT pjT0 = TTFullScreenExpressVideoActivity.this.Zh;
                    if(pjT0.ReZ) {
                        pjT0.Lrd.ReZ().cr();
                        fDm.Zh();
                    }
                }
                if(TTFullScreenExpressVideoActivity.this.Zh.Zh.RD() == 21 && !TTFullScreenExpressVideoActivity.this.Zh.Zh.Au()) {
                    TTFullScreenExpressVideoActivity.this.Zh.Zh.Zh(true);
                    TTFullScreenExpressVideoActivity.this.Zh.Zd.ub();
                }
                PjT pjT1 = TTFullScreenExpressVideoActivity.this.Zh;
                if(!pjT1.ReZ) {
                    if(Owx.JQp(pjT1.Zh)) {
                        TTFullScreenExpressVideoActivity.this.finish();
                        return;
                    }
                    Au au0 = TTFullScreenExpressVideoActivity.this.Zh.yIW;
                    if(au0 != null && au0.PjT() != null) {
                        TTFullScreenExpressVideoActivity.this.Zh.yIW.PjT().setTime("0", 0, 0, false);
                        if(TTFullScreenExpressVideoActivity.this.Zh.yIW.Au()) {
                            TTFullScreenExpressVideoActivity.this.Zh.wN.PjT("0", "X");
                            TTFullScreenExpressVideoActivity.this.Zh.wN.JQp(true);
                            TTFullScreenExpressVideoActivity.this.Zh.wN.ReZ();
                        }
                    }
                }
                else if(!pjT1.Zh.Ik()) {
                    TTFullScreenExpressVideoActivity.this.PjT(false, 5);
                    if(!Owx.JQp(TTFullScreenExpressVideoActivity.this.Zh.Zh)) {
                        TTFullScreenExpressVideoActivity.this.Zh.tT.PjT("skip", true);
                    }
                }
                else if(TTFullScreenExpressVideoActivity.this.Zh.yIW.SM() == 1) {
                    TTFullScreenExpressVideoActivity.this.Zh.wN.ReZ();
                }
            }

            @Override  // x.b$a
            public void PjT(long v, long v1) {
                PjT pjT0 = TTFullScreenExpressVideoActivity.this.Zh;
                if(!pjT0.dwk && pjT0.tT.Zh()) {
                    TTFullScreenExpressVideoActivity.this.Zh.tT.xE();
                }
                if(TTFullScreenExpressVideoActivity.this.Zh.DWo.get()) {
                    return;
                }
                TTFullScreenExpressVideoActivity.this.cr.removeMessages(300);
                if(v != TTFullScreenExpressVideoActivity.this.Zh.tT.Au()) {
                    TTFullScreenExpressVideoActivity.this.xE();
                }
                if(!TTFullScreenExpressVideoActivity.this.Zh.tT.Zh()) {
                    return;
                }
                TTFullScreenExpressVideoActivity.this.Zh.tT.PjT(v, v1);
                TTFullScreenExpressVideoActivity.this.cz = (int)(TTFullScreenExpressVideoActivity.this.Zh.tT.KM() - ((double)(v / 1000L)));
                if((TTFullScreenExpressVideoActivity.this.Zh.Owx.get() || TTFullScreenExpressVideoActivity.this.Zh.qj.get()) && TTFullScreenExpressVideoActivity.this.Zh.tT.Zh()) {
                    TTFullScreenExpressVideoActivity.this.Zh.tT.xE();
                }
                Au au0 = TTFullScreenExpressVideoActivity.this.Zh.yIW;
                if(au0 != null && au0.PjT() != null) {
                    TTFullScreenExpressVideoActivity.this.Zh.yIW.PjT().setTime(String.valueOf(TTFullScreenExpressVideoActivity.this.cz), ((int)(v / 1000L)), 0, false);
                }
                if(TTFullScreenExpressVideoActivity.this.Zh.yIW.Au() || TTFullScreenExpressVideoActivity.this.Zh.Zh.es()) {
                    TTFullScreenExpressVideoActivity.this.ReZ(((int)(v / 1000L)));
                    TTFullScreenExpressVideoActivity tTFullScreenExpressVideoActivity0 = TTFullScreenExpressVideoActivity.this;
                    if(tTFullScreenExpressVideoActivity0.cz >= 0) {
                        tTFullScreenExpressVideoActivity0.Zh.wN.cr(true);
                        TTFullScreenExpressVideoActivity.this.Zh.wN.PjT(String.valueOf(TTFullScreenExpressVideoActivity.this.cz), null);
                    }
                }
            }

            @Override  // x.b$a
            public void Zh(long v, int v1) {
                TTFullScreenExpressVideoActivity.this.cr.removeMessages(300);
                gK gK0 = TTFullScreenExpressVideoActivity.this.Zh.Zd.qla;
                if(gK0 != null) {
                    gK0.DWo();
                }
                if(TTFullScreenExpressVideoActivity.this.Zh.tT.Zh()) {
                    TTFullScreenExpressVideoActivity.this.qla();
                    return;
                }
                TTFullScreenExpressVideoActivity.this.Zh.tT.fDm();
                TTFullScreenExpressVideoActivity.this.Zh.yIW.PjT(true);
                TTFullScreenExpressVideoActivity tTFullScreenExpressVideoActivity0 = TTFullScreenExpressVideoActivity.this;
                if(tTFullScreenExpressVideoActivity0.Zh.ReZ) {
                    tTFullScreenExpressVideoActivity0.PjT(false, 3);
                    ub ub0 = TTFullScreenExpressVideoActivity.this.Zh.tT;
                    ub0.PjT(true ^ ub0.Yo(), 2);
                    return;
                }
                tTFullScreenExpressVideoActivity0.finish();
            }
        });
        return this.Zh.tT.PjT(v, z, hashMap0, this.ReZ);
    }

    @Override  // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean ltE() {
        return true;
    }
}

