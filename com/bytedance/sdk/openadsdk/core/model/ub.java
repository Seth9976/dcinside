package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.component.utils.RD;
import org.json.JSONObject;

public class ub {
    private int Au;
    private int DWo;
    private int JQp;
    public static int PjT = 1;
    private int ReZ;
    private int SM;
    private int XX;
    public static int Zh = 2;
    private int cr;
    private int cz;

    static {
    }

    public ub() {
        this.ReZ = 5;
        this.cr = 30;
        this.JQp = 70;
        this.cz = 1;
        this.XX = ub.PjT;
        this.Au = 0;
        this.SM = 0;
        this.DWo = 3;
    }

    public int Au() {
        return this.XX;
    }

    public void Au(int v) {
        this.XX = v;
    }

    public int JQp() {
        return this.cr;
    }

    public void JQp(int v) {
        this.cr = v;
    }

    public int PjT() {
        return this.DWo;
    }

    public JSONObject PjT(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            jSONObject0 = new JSONObject();
        }
        try {
            jSONObject0.put("ceiling_time", this.ReZ);
            jSONObject0.put("ceiling_ratio", this.cr);
            jSONObject0.put("expand_ratio", this.JQp);
            jSONObject0.put("back_type", this.cz);
            jSONObject0.put("boc_return_type", this.XX);
            jSONObject0.put("pre_render_status", this.Au);
            jSONObject0.put("pre_render_use_gecko", this.SM);
            jSONObject0.put("pre_render_add_type", this.DWo);
        }
        catch(Throwable throwable0) {
            RD.Zh("InteractionParams", throwable0.getMessage());
        }
        return jSONObject0;
    }

    public void PjT(int v) {
        this.DWo = v;
    }

    // 去混淆评级： 低(20)
    public boolean PjT(boolean z) {
        return z ? this.Au == 1 || this.Au == 3 : this.Au == 2 || this.Au == 3;
    }

    public int ReZ() {
        return this.Au;
    }

    public void ReZ(int v) {
        this.Au = v;
    }

    public int XX() {
        return this.cz;
    }

    public void XX(int v) {
        this.cz = v;
    }

    public int Zh() {
        return this.SM;
    }

    public void Zh(int v) {
        this.SM = v;
    }

    public int cr() {
        return this.ReZ;
    }

    public void cr(int v) {
        this.ReZ = v;
    }

    public int cz() {
        return this.JQp;
    }

    public void cz(int v) {
        this.JQp = v;
    }
}

