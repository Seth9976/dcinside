package com.bytedance.sdk.openadsdk.core.qj;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.SM;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.qj.Zh.ReZ.Zh;
import com.bytedance.sdk.openadsdk.core.qj.Zh.ReZ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class cr {
    public List Au;
    public List DWo;
    public List JQp;
    private boolean Owx;
    public List PjT;
    private String RD;
    public List ReZ;
    public List SM;
    public List XX;
    public List Zh;
    public List cr;
    public List cz;
    private final AtomicBoolean fDm;
    private boolean gK;
    private boolean ltE;
    public List qj;
    private final AtomicBoolean qla;
    private Owx ub;
    private long xE;
    public List xf;
    private final PjT xs;

    public cr(PjT pjT0) {
        this.PjT = new ArrayList();
        this.Zh = new ArrayList();
        this.ReZ = new ArrayList();
        this.cr = new ArrayList();
        this.JQp = new ArrayList();
        this.cz = new ArrayList();
        this.XX = new ArrayList();
        this.Au = new ArrayList();
        this.SM = new ArrayList();
        this.DWo = new ArrayList();
        this.qj = new ArrayList();
        this.xf = new ArrayList();
        this.fDm = new AtomicBoolean(false);
        this.qla = new AtomicBoolean(false);
        this.xs = pjT0;
    }

    public void Au(long v) {
        this.PjT(v, this.SM, null);
    }

    public void Au(List list0) {
        this.qj.addAll(list0);
        Collections.sort(this.qj);
    }

    public void DWo(List list0) {
        this.PjT.addAll(list0);
    }

    public void JQp(long v) {
        if(this.qla.compareAndSet(false, true)) {
            this.PjT(v, this.cz, null);
        }
    }

    public void JQp(List list0) {
        this.cz.addAll(list0);
    }

    private void PjT(long v, List list0, com.bytedance.sdk.openadsdk.core.qj.PjT.PjT pjT0) {
        this.PjT(v, list0, pjT0, null);
    }

    private void PjT(long v, List list0, com.bytedance.sdk.openadsdk.core.qj.PjT.PjT pjT0, Zh reZ$Zh0) {
        ReZ.PjT(list0, pjT0, v, (this.xs == null ? null : this.xs.XX()), reZ$Zh0);
    }

    private void PjT(cz cz0, int v) {
        SM.Zh().post(new Runnable() {
            final cr ReZ;

            @Override
            public void run() {
                cz cz0 = cz0;
                if(cz0 != null) {
                    cz0.PjT(v);
                }
            }
        });
    }

    public List PjT(long v, float f) {
        List list0 = new ArrayList();
        for(int v2 = 0; v2 < this.qj.size(); ++v2) {
            com.bytedance.sdk.openadsdk.core.qj.Zh.Zh zh0 = (com.bytedance.sdk.openadsdk.core.qj.Zh.Zh)this.qj.get(v2);
            if(zh0.PjT(f)) {
                list0.add(zh0);
            }
        }
        for(int v1 = 0; v1 < this.xf.size(); ++v1) {
            com.bytedance.sdk.openadsdk.core.qj.Zh.PjT pjT0 = (com.bytedance.sdk.openadsdk.core.qj.Zh.PjT)this.xf.get(v1);
            if(pjT0.PjT(v)) {
                list0.add(pjT0);
            }
        }
        return list0;
    }

    public JSONObject PjT() throws JSONException {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("errorTrackers", ReZ.PjT(this.PjT));
        jSONObject0.put("impressionTrackers", ReZ.PjT(this.Zh));
        jSONObject0.put("pauseTrackers", ReZ.PjT(this.ReZ));
        jSONObject0.put("resumeTrackers", ReZ.PjT(this.cr));
        jSONObject0.put("completeTrackers", ReZ.PjT(this.JQp));
        jSONObject0.put("closeTrackers", ReZ.PjT(this.cz));
        jSONObject0.put("skipTrackers", ReZ.PjT(this.XX));
        jSONObject0.put("clickTrackers", ReZ.PjT(this.Au));
        jSONObject0.put("muteTrackers", ReZ.PjT(this.SM));
        jSONObject0.put("unMuteTrackers", ReZ.PjT(this.DWo));
        jSONObject0.put("fractionalTrackers", this.Zh());
        jSONObject0.put("absoluteTrackers", this.ReZ());
        return jSONObject0;
    }

    public void PjT(long v) {
        if(this.fDm.compareAndSet(false, true)) {
            this.PjT(v, this.Zh, null, new Zh("show_impression", this.ub));
        }
    }

    public void PjT(long v, long v1, cz cz0) {
        if(System.currentTimeMillis() - this.xE < 1000L) {
            return;
        }
        if(v >= 0L && v1 > 0L) {
            this.xE = System.currentTimeMillis();
            float f = ((float)v) / ((float)v1);
            List list0 = this.PjT(v, f);
            if(f >= 0.25f && !this.gK) {
                this.Zh("firstQuartile");
                this.gK = true;
                if(cz0 != null) {
                    this.PjT(cz0, 6);
                }
                f = 0.25f;
            }
            else if(f >= 0.5f && !this.ltE) {
                this.Zh("midpoint");
                this.ltE = true;
                if(cz0 != null) {
                    this.PjT(cz0, 7);
                }
                f = 0.5f;
            }
            else if(f >= 0.75f && !this.Owx) {
                this.Zh("thirdQuartile");
                this.Owx = true;
                if(cz0 != null) {
                    this.PjT(cz0, 8);
                }
                f = 0.75f;
            }
            if(f < 0.03f) {
                f = 0.0f;
            }
            this.PjT(v, list0, null, new Zh("video_progress", this.ub, f));
        }
    }

    public void PjT(Owx owx0) {
        this.ub = owx0;
    }

    public void PjT(com.bytedance.sdk.openadsdk.core.qj.PjT.PjT pjT0) {
        this.PjT(-1L, this.PjT, pjT0);
    }

    public void PjT(cr cr0) {
        this.DWo(cr0.PjT);
        this.PjT(cr0.Zh);
        this.Zh(cr0.ReZ);
        this.ReZ(cr0.cr);
        this.cr(cr0.JQp);
        this.JQp(cr0.cz);
        this.cz(cr0.XX);
        this.XX(cr0.Au);
        this.qj(cr0.SM);
        this.xf(cr0.DWo);
        this.Au(cr0.qj);
        this.SM(cr0.xf);
    }

    public void PjT(String s) {
        this.RD = s;
    }

    public void PjT(String s, float f) {
        if(!TextUtils.isEmpty(s) && f >= 0.0f) {
            this.Au(Collections.singletonList(new com.bytedance.sdk.openadsdk.core.qj.Zh.Zh.PjT(s, f).PjT()));
        }
    }

    public void PjT(String s, long v) {
        if(!TextUtils.isEmpty(s) && v >= 0L) {
            this.SM(Collections.singletonList(new com.bytedance.sdk.openadsdk.core.qj.Zh.PjT.PjT(s, v).PjT()));
        }
    }

    public void PjT(List list0) {
        this.Zh.addAll(list0);
    }

    public void PjT(JSONObject jSONObject0) {
        this.DWo(ReZ.PjT(jSONObject0.optJSONArray("errorTrackers")));
        this.PjT(ReZ.PjT(jSONObject0.optJSONArray("impressionTrackers")));
        this.Zh(ReZ.PjT(jSONObject0.optJSONArray("pauseTrackers"), true));
        this.ReZ(ReZ.PjT(jSONObject0.optJSONArray("resumeTrackers"), true));
        this.cr(ReZ.PjT(jSONObject0.optJSONArray("completeTrackers")));
        this.JQp(ReZ.PjT(jSONObject0.optJSONArray("closeTrackers")));
        this.cz(ReZ.PjT(jSONObject0.optJSONArray("skipTrackers")));
        this.XX(ReZ.PjT(jSONObject0.optJSONArray("clickTrackers")));
        this.qj(ReZ.PjT(jSONObject0.optJSONArray("muteTrackers"), true));
        this.xf(ReZ.PjT(jSONObject0.optJSONArray("unMuteTrackers"), true));
        this.Au(ReZ.Zh(jSONObject0.optJSONArray("fractionalTrackers")));
        this.SM(ReZ.ReZ(jSONObject0.optJSONArray("absoluteTrackers")));
    }

    private JSONArray ReZ() throws JSONException {
        JSONArray jSONArray0 = new JSONArray();
        for(Object object0: this.xf) {
            jSONArray0.put(((com.bytedance.sdk.openadsdk.core.qj.Zh.PjT)object0).PjT());
        }
        return jSONArray0;
    }

    public void ReZ(long v) {
        this.PjT(v, this.cr, null);
    }

    public void ReZ(List list0) {
        this.cr.addAll(list0);
    }

    public void SM(long v) {
        this.PjT(v, this.DWo, null);
    }

    public void SM(List list0) {
        this.xf.addAll(list0);
        Collections.sort(this.xf);
    }

    public void XX(long v) {
        this.PjT(v, this.Au, null, new Zh("click", this.ub));
    }

    public void XX(List list0) {
        this.Au.addAll(list0);
    }

    private JSONArray Zh() throws JSONException {
        JSONArray jSONArray0 = new JSONArray();
        for(Object object0: this.qj) {
            jSONArray0.put(((com.bytedance.sdk.openadsdk.core.qj.Zh.Zh)object0).Zh());
        }
        return jSONArray0;
    }

    private void Zh(String s) {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("event", s);
            com.bytedance.sdk.openadsdk.cr.ReZ.Zh(this.ub, this.RD, "vast_play_track", jSONObject0);
        }
        catch(Throwable unused_ex) {
        }
    }

    public void Zh(long v) {
        this.PjT(v, this.ReZ, null);
    }

    public void Zh(List list0) {
        this.ReZ.addAll(list0);
    }

    public void cr(long v) {
        this.PjT(v, this.JQp, null, new Zh("video_progress", this.ub, 1.0f));
    }

    public void cr(List list0) {
        this.JQp.addAll(list0);
    }

    public void cz(long v) {
        this.PjT(v, this.XX, null);
    }

    public void cz(List list0) {
        this.XX.addAll(list0);
    }

    public void qj(List list0) {
        this.SM.addAll(list0);
    }

    public void xf(List list0) {
        this.DWo.addAll(list0);
    }
}

