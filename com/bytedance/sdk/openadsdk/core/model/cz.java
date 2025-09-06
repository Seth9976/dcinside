package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.component.utils.RD;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class cz {
    private List JQp;
    private int PjT;
    private List ReZ;
    private int XX;
    private int Zh;
    private int cr;
    private int cz;

    public JSONObject Au() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("interceptor_x", this.PjT);
            jSONObject0.put("interceptor_y", this.Zh);
            if(this.ReZ != null) {
                JSONArray jSONArray0 = new JSONArray();
                for(Object object0: this.ReZ) {
                    jSONArray0.put(((int)(((Integer)object0))));
                }
                jSONObject0.put("interceptor_page", jSONArray0);
            }
            jSONObject0.put("interceptor_interval_time", this.cr);
            if(this.JQp != null) {
                JSONArray jSONArray1 = new JSONArray();
                for(Object object1: this.JQp) {
                    jSONArray1.put(((String)object1));
                }
                jSONObject0.put("url_regular", jSONArray1);
            }
            jSONObject0.put("is_act", this.cz);
            jSONObject0.put("boc_index", this.XX);
            return jSONObject0;
        }
        catch(Throwable throwable0) {
        }
        RD.Zh(throwable0.getMessage(), new Object[0]);
        return jSONObject0;
    }

    public int JQp() {
        return this.Zh;
    }

    public void JQp(int v) {
        this.cr = v;
    }

    public void PjT(int v) {
        this.cz = v;
    }

    public void PjT(List list0) {
        this.JQp = list0;
    }

    public boolean PjT() {
        return this.cz == 1;
    }

    public List ReZ() {
        return this.JQp;
    }

    public void ReZ(int v) {
        this.PjT = v;
    }

    public int XX() {
        return this.cr;
    }

    public int Zh() {
        return this.XX < 2 ? 0 : this.XX;
    }

    public void Zh(int v) {
        this.XX = v;
    }

    public void Zh(List list0) {
        this.ReZ = list0;
    }

    public int cr() {
        return this.PjT;
    }

    public void cr(int v) {
        this.Zh = v;
    }

    public List cz() {
        return this.ReZ;
    }
}

