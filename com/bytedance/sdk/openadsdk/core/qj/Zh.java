package com.bytedance.sdk.openadsdk.core.qj;

import com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.PjT;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class Zh extends ReZ {
    private long DWo;
    private long qj;

    public Zh(int v, int v1, long v2, long v3, PjT pjT$PjT0, com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.Zh pjT$Zh0, String s, List list0, List list1, String s1) {
        super(v, v1, pjT$PjT0, pjT$Zh0, s, list0, list1, s1);
        this.DWo = v2;
        this.qj = v3;
        this.SM = "icon_click";
    }

    public static Zh PjT(JSONObject jSONObject0) {
        ReZ reZ0 = ReZ.Zh(jSONObject0);
        if(reZ0 == null) {
            return null;
        }
        long v = jSONObject0.optLong("offset", -1L);
        long v1 = jSONObject0.optLong("duration", -1L);
        return new Zh(reZ0.PjT, reZ0.Zh, v, v1, reZ0.ReZ, reZ0.cr, reZ0.JQp, reZ0.cz, reZ0.XX, reZ0.Au);
    }

    @Override  // com.bytedance.sdk.openadsdk.core.qj.ReZ
    public JSONObject PjT() throws JSONException {
        JSONObject jSONObject0 = super.PjT();
        if(jSONObject0 != null) {
            jSONObject0.put("offset", this.DWo);
            jSONObject0.put("duration", this.qj);
        }
        return jSONObject0;
    }
}

