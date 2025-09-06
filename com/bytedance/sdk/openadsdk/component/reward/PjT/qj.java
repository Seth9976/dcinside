package com.bytedance.sdk.openadsdk.component.reward.PjT;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.activity.cz;
import com.bytedance.sdk.openadsdk.component.reward.view.Au;
import com.bytedance.sdk.openadsdk.core.SM;
import com.bytedance.sdk.openadsdk.core.Zh.JQp;
import com.bytedance.sdk.openadsdk.core.Zh.Zh;
import com.bytedance.sdk.openadsdk.core.model.DWo;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.model.cRA;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.cr.ReZ;
import com.bytedance.sdk.openadsdk.qla.PjT.cr;
import com.bytedance.sdk.openadsdk.utils.Co;
import com.bytedance.sdk.openadsdk.utils.qZS;
import com.bytedance.sdk.openadsdk.utils.qla;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class qj {
    private final PjT PjT;
    private final JQp ReZ;
    private final Zh Zh;

    public qj(PjT pjT0) {
        this.PjT = pjT0;
        this.ReZ = this.PjT(pjT0, pjT0.Zh);
        this.Zh = new Zh(pjT0.rds, pjT0.Zh, pjT0.JQp, (pjT0.cr ? 7 : 5)) {
            final qj PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.Zh.Zh
            public void PjT(View view0, float f, float f1, float f2, float f3, SparseArray sparseArray0, boolean z) {
                try {
                    qj.this.PjT(view0, f, f1, f2, f3, sparseArray0, this.KM, this.iZZ, this.Yo);
                }
                catch(Exception exception0) {
                    RD.Zh("TTAD.RFReportManager", "onClickReport error :" + exception0.getMessage());
                }
                com.bytedance.sdk.openadsdk.Lrd.Zh.JQp.PjT(qj.this.PjT.Zh, 9);
                qj.this.PjT.tT.Co();
            }
        };
    }

    private boolean Au() {
        Owx owx0 = this.PjT.Zh;
        return owx0 == null ? false : owx0.dwk() == 1;
    }

    public JQp JQp() {
        return this.ReZ;
    }

    private void PjT(View view0, float f, float f1, float f2, float f3, SparseArray sparseArray0, int v, int v1, int v2) {
        if(view0 == null) {
            return;
        }
        if(view0.getId() == qla.JQp) {
            this.PjT("click_play_star_level", null);
        }
        else if(view0.getId() == qla.cr || view0.getId() == qla.XX) {
            this.PjT("click_play_star_nums", null);
        }
        else if(view0.getId() == qla.ReZ) {
            this.PjT("click_play_source", null);
        }
        else if(view0.getId() == qla.Zh) {
            this.PjT("click_play_logo", null);
        }
        else if(view0.getId() == qla.xf || view0.getId() == qla.UR || view0.getId() == qla.ub) {
            this.PjT("click_start_play_bar", this.SM());
        }
        else if(view0.getId() == 0x1F000009) {
            this.PjT("click_start_play", this.SM());
        }
        else if(view0.getId() == qla.qj) {
            this.PjT("click_video", this.SM());
        }
        else if(view0.getId() == 0x1F00000B || view0.getId() == qla.Au) {
            this.PjT("fallback_endcard_click", this.SM());
        }
        this.Zh(view0, f, f1, f2, f3, sparseArray0, v, v1, v2);
    }

    private void PjT(com.bytedance.sdk.openadsdk.Lrd.Zh.JQp.PjT jQp$PjT0) {
        PjT pjT0 = this.PjT;
        if(pjT0.ix) {
            cz cz0 = pjT0.hN;
            if(cz0 != null) {
                if(pjT0.Nv && cz0.cRA() != null) {
                    jQp$PjT0.Zh = this.PjT.hN.cRA().PjT(this.PjT.hN);
                    return;
                }
                if(this.PjT.hN.cRA() != null) {
                    jQp$PjT0.Zh = this.PjT.hN.SM;
                }
            }
        }
    }

    private void PjT(String s, JSONObject jSONObject0) {
        Owx owx0 = this.PjT.Zh;
        String s1 = this.PjT.JQp;
        if(!this.PjT.cr) {
            jSONObject0 = null;
        }
        ReZ.PjT(owx0, s1, s, jSONObject0);
    }

    private void PjT(JSONObject jSONObject0) {
        Owx owx0 = this.PjT.Zh;
        if(owx0 instanceof com.bytedance.sdk.openadsdk.core.model.RD && ((com.bytedance.sdk.openadsdk.core.model.RD)owx0).wk()) {
            try {
                jSONObject0.put("choose_one_ad_real_show", true);
            }
            catch(JSONException jSONException0) {
                RD.PjT("TTAD.RFReportManager", "reportShow json error", jSONException0);
            }
        }
        PjT pjT0 = this.PjT;
        if(pjT0.ix) {
            cz cz0 = pjT0.hN;
            if(cz0 != null) {
                try {
                    ReZ.PjT((pjT0.Nv ? cz0.cRA().PjT(this.PjT.hN) : cz0.SM) + 1, jSONObject0);
                }
                catch(Throwable unused_ex) {
                }
            }
        }
    }

    // 去混淆评级： 低(20)
    public JQp PjT(PjT pjT0, Owx owx0) {
        return pjT0.cr ? new JQp(pjT0.rds, owx0, pjT0.JQp, 7) {
            final qj ReZ;

            @Override  // com.bytedance.sdk.openadsdk.core.Zh.JQp
            public void PjT(View view0, float f, float f1, float f2, float f3, SparseArray sparseArray0, int v, int v1, int v2, boolean z) {
                if(owx0.uvo() && view0 != null) {
                    Object object0 = view0.getTag(0x22000001);
                    if(object0 instanceof String) {
                        this.PjT(((String)object0));
                    }
                }
                HashMap hashMap0 = new HashMap();
                hashMap0.put("duration", pjT0.tT.XX());
                if(pjT0.DWo.get()) {
                    hashMap0.put("click_scence", 2);
                }
                else if(cRA.gK(owx0)) {
                    hashMap0.put("click_scence", 3);
                }
                else {
                    hashMap0.put("click_scence", 1);
                }
                this.PjT(hashMap0);
                pjT0.kph.c_();
                if(view0.getId() == qla.AjB && cRA.gK(owx0)) {
                    JSONObject jSONObject0 = new JSONObject();
                    if(owx0.MWx() != null) {
                        try {
                            jSONObject0.put("playable_url", owx0.MWx().M());
                        }
                        catch(JSONException jSONException0) {
                            RD.PjT("TTAD.RFReportManager", "onRewardBarClick json error", jSONException0);
                        }
                    }
                    ReZ.Zh(owx0, pjT0.JQp, "click_playable_download_button_loading", jSONObject0);
                }
                com.bytedance.sdk.openadsdk.component.reward.PjT.qj.4.1 qj$4$10 = new com.bytedance.sdk.openadsdk.component.reward.PjT.cr.PjT() {
                    final com.bytedance.sdk.openadsdk.component.reward.PjT.qj.4 PjT;

                    @Override  // com.bytedance.sdk.openadsdk.component.reward.PjT.cr$PjT
                    public void PjT(View view0, float f, float f1, float f2, float f3, SparseArray sparseArray0, int v, int v1, int v2) {
                        qj.this.PjT(view0, f, f1, f2, f3, sparseArray0, v, v1, v2);
                    }

                    @Override  // com.bytedance.sdk.openadsdk.component.reward.PjT.cr$PjT
                    public void PjT(String s, JSONObject jSONObject0) {
                        qj.this.PjT(s, jSONObject0);
                    }
                };
                pjT0.Lrd.PjT(view0, f, f1, f2, f3, sparseArray0, v, v1, v2, qj$4$10);
                com.bytedance.sdk.openadsdk.Lrd.Zh.JQp.PjT(owx0, 9);
                pjT0.tT.Co();
            }
        } : new JQp(pjT0.rds, owx0, pjT0.JQp, 5) {
            final qj ReZ;

            @Override  // com.bytedance.sdk.openadsdk.core.Zh.JQp
            public void PjT(View view0, float f, float f1, float f2, float f3, SparseArray sparseArray0, int v, int v1, int v2, boolean z) {
                if(owx0.uvo() && view0 != null) {
                    Object object0 = view0.getTag(0x22000001);
                    if(object0 instanceof String) {
                        this.PjT(((String)object0));
                    }
                }
                HashMap hashMap0 = new HashMap();
                hashMap0.put("duration", pjT0.tT.XX());
                if(pjT0.DWo.get()) {
                    hashMap0.put("click_scence", 2);
                }
                else if(cRA.gK(owx0)) {
                    hashMap0.put("click_scence", 3);
                }
                else {
                    hashMap0.put("click_scence", 1);
                }
                this.PjT(hashMap0);
                pjT0.kph.c_();
                if(view0.getId() == qla.AjB && cRA.gK(owx0)) {
                    JSONObject jSONObject0 = new JSONObject();
                    if(owx0.MWx() != null) {
                        try {
                            jSONObject0.put("playable_url", owx0.MWx().M());
                        }
                        catch(JSONException jSONException0) {
                            RD.PjT("TTAD.RFReportManager", "onRewardBarClick json error", jSONException0);
                        }
                    }
                    ReZ.Zh(owx0, pjT0.JQp, "click_playable_download_button_loading", jSONObject0);
                }
                com.bytedance.sdk.openadsdk.component.reward.PjT.qj.4.1 qj$4$10 = new com.bytedance.sdk.openadsdk.component.reward.PjT.cr.PjT() {
                    final com.bytedance.sdk.openadsdk.component.reward.PjT.qj.4 PjT;

                    @Override  // com.bytedance.sdk.openadsdk.component.reward.PjT.cr$PjT
                    public void PjT(View view0, float f, float f1, float f2, float f3, SparseArray sparseArray0, int v, int v1, int v2) {
                        qj.this.PjT(view0, f, f1, f2, f3, sparseArray0, v, v1, v2);
                    }

                    @Override  // com.bytedance.sdk.openadsdk.component.reward.PjT.cr$PjT
                    public void PjT(String s, JSONObject jSONObject0) {
                        qj.this.PjT(s, jSONObject0);
                    }
                };
                pjT0.Lrd.PjT(view0, f, f1, f2, f3, sparseArray0, v, v1, v2, qj$4$10);
                com.bytedance.sdk.openadsdk.Lrd.Zh.JQp.PjT(owx0, 9);
                pjT0.tT.Co();
            }
        };
    }

    public void PjT() {
        if(this.PjT.xs.get()) {
            return;
        }
        JSONObject jSONObject0 = new JSONObject();
        Owx owx0 = this.PjT.Zh;
        this.PjT(jSONObject0);
        if(!this.PjT.xs.compareAndSet(false, true)) {
            return;
        }
        ReZ.PjT(owx0, this.PjT.JQp, jSONObject0);
        this.PjT.kph.cz();
        com.bytedance.sdk.openadsdk.Lrd.Zh.JQp.PjT jQp$PjT0 = new com.bytedance.sdk.openadsdk.Lrd.Zh.JQp.PjT(-1);
        this.PjT(jQp$PjT0);
        com.bytedance.sdk.openadsdk.Lrd.Zh.JQp.PjT(this.PjT.rds.findViewById(0x1020002), owx0, jQp$PjT0);
        com.bytedance.sdk.openadsdk.Lrd.PjT.ReZ.PjT(owx0);
    }

    public void PjT(Map map0) {
        if(this.PjT.xs.get()) {
            return;
        }
        this.PjT.xs.set(true);
        View view0 = this.PjT.rds.findViewById(0x1020002);
        if(view0 == null) {
            view0 = this.PjT.rds.getWindow().getDecorView();
        }
        view0.post(new Runnable() {
            final qj ReZ;

            @Override
            public void run() {
                JSONObject jSONObject0;
                Owx owx0;
                if(!qj.this.PjT.fDm.compareAndSet(false, true)) {
                    return;
                }
                try {
                    owx0 = qj.this.PjT.Zh;
                    jSONObject0 = null;
                    jSONObject0 = map0 == null ? new JSONObject() : new JSONObject(map0);
                    JSONObject jSONObject1 = new JSONObject();
                    jSONObject1.put("width", view0.getWidth());
                    jSONObject1.put("height", view0.getHeight());
                    jSONObject1.put("alpha", ((double)view0.getAlpha()));
                    jSONObject0.put("root_view", jSONObject1.toString());
                    qj.this.PjT(jSONObject0);
                }
                catch(Throwable throwable0) {
                    RD.PjT("TTAD.RFReportManager", "run: ", throwable0);
                }
                ReZ.PjT(owx0, qj.this.PjT.JQp, jSONObject0);
                qj.this.PjT.kph.cz();
                com.bytedance.sdk.openadsdk.Lrd.Zh.JQp.PjT jQp$PjT0 = new com.bytedance.sdk.openadsdk.Lrd.Zh.JQp.PjT((qj.this.PjT.yIW == null || (map0 == null || !map0.containsKey("dynamic_show_type")) ? -1 : qj.this.PjT.yIW.SM()));
                qj.this.PjT(jQp$PjT0);
                com.bytedance.sdk.openadsdk.Lrd.Zh.JQp.PjT(qj.this.PjT.rds.findViewById(0x1020002), owx0, jQp$PjT0);
                com.bytedance.sdk.openadsdk.Lrd.PjT.ReZ.PjT(owx0);
            }
        });
    }

    public void PjT(boolean z) {
        Owx owx0 = this.PjT.Zh;
        if(owx0 == null) {
            return;
        }
        int v = owx0.joj();
        String s = this.PjT.Zh.ydj();
        cr cr0 = cr.Zh().PjT((z ? 7 : 8)).ReZ(String.valueOf(v)).JQp(s);
        cr0.Zh(this.PjT.Jo.tT()).cz(this.PjT.Jo.Lrd());
        cr0.XX(this.PjT.Zh.xR()).cr(this.PjT.Zh.dIF());
        com.bytedance.sdk.openadsdk.qla.ReZ.PjT().Zh(cr0);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public JQp ReZ() {
        View view0 = this.PjT.rds.findViewById(0x1020002);
        this.ReZ.PjT(view0);
        View view1 = this.PjT.ig.findViewById(0x1F000011);
        this.ReZ.Zh(view1);
        if(this.PjT.Lrd.ReZ() != null) {
            this.ReZ.PjT(this.PjT.Lrd.ReZ());
        }
        this.PjT.cRA.PjT(this.ReZ);
        com.bytedance.sdk.openadsdk.component.reward.PjT.qj.3 qj$30 = new com.bytedance.sdk.openadsdk.core.Zh.PjT.PjT() {
            final qj PjT;

            @Override  // com.bytedance.sdk.openadsdk.core.Zh.PjT$PjT
            public long getVideoProgress() {
                return qj.this.PjT.tT.XX();
            }
        };
        this.ReZ.PjT(qj$30);
        this.PjT.Zd.PjT(this.ReZ, this.ReZ, this.Zh);
        this.PjT.qZS.PjT(this.ReZ);
        return this.ReZ;
    }

    public void ReZ(boolean z) {
        PjT pjT0 = this.PjT;
        if(pjT0 == null) {
            return;
        }
        if(z && pjT0.Zh.en() && !this.PjT.Zh.JDf()) {
            this.PjT.Zh.XX(true);
            Co co0 = this.PjT.Zh.zSs();
            ReZ.PjT(this.PjT.Zh, this.PjT.JQp, co0);
        }
    }

    private JSONObject SM() {
        JSONObject jSONObject0;
        try {
            long v = this.PjT.tT.ub();
            int v1 = this.PjT.tT.gK();
            jSONObject0 = null;
            jSONObject0 = new JSONObject();
            jSONObject0.put("duration", v);
            jSONObject0.put("percent", v1);
        }
        catch(Throwable unused_ex) {
        }
        return jSONObject0;
    }

    public void XX() {
        JSONObject jSONObject0 = new JSONObject();
        this.PjT(jSONObject0);
        ReZ.JQp(this.PjT.Zh, this.PjT.JQp, jSONObject0);
    }

    private void Zh(View view0, float f, float f1, float f2, float f3, SparseArray sparseArray0, int v, int v1, int v2) {
        if(this.Au() && this.PjT.Zh != null && view0 != null) {
            int v3 = view0.getId();
            if(v3 == qla.JQp || v3 == qla.cr || v3 == qla.ReZ || v3 == qla.Zh || v3 == qla.xf || v3 == qla.UR || v3 == qla.ub || v3 == 0x1F000009 || v3 == qla.qj || v3 == 0x1F00000B || v3 == qla.XX) {
                int v4 = qZS.SM(ub.PjT());
                float f4 = qZS.XX(ub.PjT());
                float f5 = qZS.Au(ub.PjT());
                DWo dWo0 = new com.bytedance.sdk.openadsdk.core.model.DWo.PjT().cz(f).JQp(f1).cr(f2).ReZ(f3).Zh(System.currentTimeMillis()).PjT(0L).Zh(qZS.PjT(this.PjT.Zd.qj())).PjT(qZS.PjT(null)).ReZ(qZS.ReZ(this.PjT.Zd.qj())).cr(qZS.ReZ(null)).cr(v1).JQp(v2).cz(v).PjT(sparseArray0).Zh((SM.Zh().PjT() ? 1 : 2)).ReZ(v4).PjT(f4).Zh(f5).PjT();
                HashMap hashMap0 = new HashMap();
                hashMap0.put("duration", this.PjT.tT.XX());
                ReZ.PjT("click_other", this.PjT.Zh, dWo0, this.PjT.JQp, true, hashMap0, -1);
            }
        }
    }

    public void Zh() {
        JSONObject jSONObject1;
        View view0;
        Owx owx0;
        boolean z;
        JSONObject jSONObject0;
        if(this.PjT.xs.get()) {
            return;
        }
        try {
            jSONObject0 = new JSONObject();
            if(this.PjT.Zh.cr()) {
                Au au0 = this.PjT.yIW;
                if(au0 == null) {
                    z = false;
                }
                else {
                    jSONObject0.put("dynamic_show_type", au0.SM());
                    this.PjT.yIW.PjT(jSONObject0);
                    z = true;
                }
            }
            else {
                z = false;
            }
            owx0 = this.PjT.Zh;
            this.PjT(jSONObject0);
            view0 = this.PjT.rds.findViewById(0x1020002);
            jSONObject1 = new JSONObject();
        }
        catch(JSONException jSONException0) {
            RD.PjT("TTAD.RFReportManager", "reportShowWhenBindVideoAd error", jSONException0);
            return;
        }
        try {
            jSONObject1.put("width", view0.getWidth());
            jSONObject1.put("height", view0.getHeight());
            jSONObject1.put("alpha", ((double)view0.getAlpha()));
        }
        catch(Throwable unused_ex) {
        }
        try {
            jSONObject0.put("root_view", jSONObject1.toString());
            if(!this.PjT.xs.compareAndSet(false, true)) {
                return;
            }
            ReZ.PjT(owx0, this.PjT.JQp, jSONObject0);
            this.PjT.kph.cz();
            com.bytedance.sdk.openadsdk.Lrd.Zh.JQp.PjT jQp$PjT0 = new com.bytedance.sdk.openadsdk.Lrd.Zh.JQp.PjT((z ? this.PjT.yIW.SM() : -1));
            this.PjT(jQp$PjT0);
            com.bytedance.sdk.openadsdk.Lrd.Zh.JQp.PjT(this.PjT.rds.findViewById(0x1020002), owx0, jQp$PjT0);
            com.bytedance.sdk.openadsdk.Lrd.PjT.ReZ.PjT(owx0);
            return;
        }
        catch(JSONException jSONException0) {
        }
        RD.PjT("TTAD.RFReportManager", "reportShowWhenBindVideoAd error", jSONException0);
    }

    public void Zh(boolean z) {
        PjT pjT0 = this.PjT;
        if(pjT0 == null) {
            return;
        }
        if(z || !pjT0.xs.get() || this.PjT.CY <= 0L) {
            this.PjT.CY = SystemClock.elapsedRealtime();
        }
        else {
            ReZ.PjT(String.valueOf(SystemClock.elapsedRealtime() - this.PjT.CY), this.PjT.Zh, this.PjT.JQp, this.PjT.tT.PjT());
            this.PjT.CY = 0L;
        }
        int v = 8;
        com.bytedance.sdk.openadsdk.Lrd.Zh.JQp.PjT(this.PjT.Zh, (z ? 4 : 8));
        Owx owx0 = this.PjT.Zh;
        if(z) {
            v = 4;
        }
        com.bytedance.sdk.openadsdk.Lrd.PjT.ReZ.PjT(owx0, v);
    }

    public Zh cr() {
        return this.Zh;
    }

    public void cz() {
        JSONObject jSONObject0 = new JSONObject();
        if(cRA.gK(this.PjT.Zh)) {
            this.PjT.cRA.PjT(jSONObject0);
        }
        int v = 1;
        if(this.PjT.DWo.get()) {
            if(!this.PjT.Jo.ReZ()) {
                if(this.PjT.Co.cr()) {
                    v = 3;
                }
                else {
                    v = this.PjT.Jo.cr() ? 2 : 0;
                }
            }
            try {
                jSONObject0.put("endcard_content", v);
                goto label_13;
            label_12:
                jSONObject0.put("endCardNotShow", 1);
            }
            catch(JSONException unused_ex) {
            }
        }
        else {
            goto label_12;
        }
    label_13:
        ReZ.Zh(this.PjT.Zh, this.PjT.JQp, "click_close", jSONObject0);
    }
}

