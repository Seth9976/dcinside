package com.bytedance.sdk.openadsdk.core.qj;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PjT {
    private double Au;
    private int DWo;
    private String JQp;
    cr PjT;
    ReZ ReZ;
    private int SM;
    private String XX;
    Zh Zh;
    private String cr;
    private String cz;
    private boolean fDm;
    private String qj;
    private String qla;
    private final Set xf;
    private String xs;

    public PjT() {
        this.PjT = new cr(this);
        this.xf = new HashSet();
        this.xs = "VAST_ACTION_BUTTON";
        this.fDm = false;
    }

    public double Au() {
        return this.Au;
    }

    public JSONObject DWo() throws JSONException {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("videoTrackers", this.PjT.PjT());
        Zh zh0 = this.Zh;
        if(zh0 != null) {
            jSONObject0.put("vastIcon", zh0.PjT());
        }
        ReZ reZ0 = this.ReZ;
        if(reZ0 != null) {
            jSONObject0.put("endCard", reZ0.PjT());
        }
        jSONObject0.put("title", this.cr);
        jSONObject0.put("description", this.JQp);
        jSONObject0.put("clickThroughUrl", this.cz);
        jSONObject0.put("videoUrl", this.XX);
        jSONObject0.put("videDuration", this.Au);
        jSONObject0.put("tag", this.qj);
        jSONObject0.put("videoWidth", this.SM);
        jSONObject0.put("videoHeight", this.DWo);
        jSONObject0.put("viewabilityVendor", this.xE());
        return jSONObject0;
    }

    public String JQp() {
        return this.JQp;
    }

    public void JQp(String s) {
        this.xs = s;
    }

    public static PjT PjT(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return null;
        }
        PjT pjT0 = new PjT();
        pjT0.PjT.PjT(jSONObject0.optJSONObject("videoTrackers"));
        pjT0.Zh = Zh.PjT(jSONObject0.optJSONObject("vastIcon"));
        pjT0.ReZ = ReZ.Zh(jSONObject0.optJSONObject("endCard"));
        pjT0.cr = jSONObject0.optString("title");
        pjT0.JQp = jSONObject0.optString("description");
        pjT0.cz = jSONObject0.optString("clickThroughUrl");
        pjT0.XX = jSONObject0.optString("videoUrl");
        pjT0.Au = jSONObject0.optDouble("videDuration");
        pjT0.qj = jSONObject0.optString("tag");
        pjT0.SM = jSONObject0.optInt("videoWidth");
        pjT0.SM = jSONObject0.optInt("videoHeight");
        Set set0 = DWo.PjT(jSONObject0.optJSONArray("viewabilityVendor"));
        pjT0.xf.addAll(set0);
        return pjT0;
    }

    public cr PjT() {
        return this.PjT;
    }

    public void PjT(double f) {
        this.Au = f;
    }

    public void PjT(int v) {
        this.SM = v;
    }

    public void PjT(Owx owx0) {
        this.PjT.PjT(owx0);
        Zh zh0 = this.Zh;
        if(zh0 != null) {
            zh0.PjT(owx0);
        }
        ReZ reZ0 = this.ReZ;
        if(reZ0 != null) {
            reZ0.PjT(owx0);
        }
    }

    public void PjT(ReZ reZ0) {
        if(reZ0 != null) {
            reZ0.PjT(this.XX);
        }
        this.ReZ = reZ0;
    }

    public void PjT(Zh zh0) {
        if(zh0 != null) {
            zh0.PjT(this.XX);
        }
        this.Zh = zh0;
    }

    public void PjT(String s) {
        this.cr = s;
    }

    public void PjT(Set set0) {
        if(set0 != null && set0.size() > 0) {
            this.xf.addAll(set0);
        }
    }

    public ReZ ReZ() {
        return this.ReZ;
    }

    public void ReZ(String s) {
        this.cz = s;
    }

    public String SM() {
        String s = this.cz;
        if(!TextUtils.isEmpty(this.qla)) {
            String s1 = this.qla;
            this.qla = null;
            return s1;
        }
        String s2 = this.xs;
        s2.hashCode();
        if(s2.equals("VAST_ICON")) {
            if(this.Zh != null && !TextUtils.isEmpty(this.Zh.Au)) {
                s = this.Zh.Au;
            }
        }
        else if(s2.equals("VAST_END_CARD") && (this.ReZ != null && !TextUtils.isEmpty(this.ReZ.Au))) {
            s = this.ReZ.Au;
        }
        this.xs = "VAST_ACTION_BUTTON";
        return s;
    }

    public String XX() {
        return this.XX;
    }

    public void XX(String s) {
        this.qla = s;
    }

    public Zh Zh() {
        return this.Zh;
    }

    public void Zh(int v) {
        this.DWo = v;
    }

    public void Zh(String s) {
        this.JQp = s;
    }

    public String cr() {
        return this.cr;
    }

    public void cr(String s) {
        this.XX = s;
    }

    public String cz() {
        return this.cz;
    }

    public void cz(String s) {
        this.qj = s;
        this.PjT.PjT(s);
    }

    public Set fDm() {
        return this.xf;
    }

    public String qj() {
        return this.qj;
    }

    public void qla() {
        this.fDm = true;
    }

    private JSONArray xE() {
        JSONArray jSONArray0 = new JSONArray();
        for(Object object0: this.xf) {
            DWo dWo0 = (DWo)object0;
            if(dWo0 != null) {
                jSONArray0.put(dWo0.cr());
            }
        }
        return jSONArray0;
    }

    public int xf() {
        return this.SM;
    }

    public int xs() {
        return this.DWo;
    }
}

