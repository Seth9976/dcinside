package com.bytedance.sdk.openadsdk.core.qj;

import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.PjT;
import com.bytedance.sdk.openadsdk.core.qj.ReZ.PjT.Zh;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ReZ {
    protected String Au;
    private String DWo;
    protected String JQp;
    protected int PjT;
    protected PjT ReZ;
    protected String SM;
    protected List XX;
    protected int Zh;
    protected Zh cr;
    protected List cz;
    private final AtomicBoolean qj;
    private Owx xf;

    public ReZ(int v, int v1, PjT pjT$PjT0, Zh pjT$Zh0, String s, List list0, List list1, String s1) {
        this.cz = new ArrayList();
        this.XX = new ArrayList();
        this.qj = new AtomicBoolean(false);
        this.PjT = v;
        this.Zh = v1;
        this.ReZ = pjT$PjT0;
        this.cr = pjT$Zh0;
        this.JQp = s;
        this.cz = list0;
        this.XX = list1;
        this.Au = s1;
        this.SM = "endcard_click";
    }

    public String JQp() {
        return this.cr != Zh.Zh || this.ReZ != PjT.Zh ? null : this.JQp;
    }

    public static float PjT(int v, int v1, int v2, int v3, Zh pjT$Zh0, PjT pjT$PjT0) {
        return v1 == 0 || v3 == 0 ? 0.0f : ReZ.PjT(pjT$Zh0, pjT$PjT0) / (Math.abs(((float)v) / ((float)v1) - ((float)v2) / ((float)v3)) + Math.abs((((float)v) - ((float)v2)) / ((float)v)) + 1.0f);
    }

    private static float PjT(Zh pjT$Zh0, PjT pjT$PjT0) {
        switch(pjT$Zh0) {
            case 1: {
                if(PjT.ReZ.equals(pjT$PjT0)) {
                    return 1.0f;
                }
                return PjT.Zh.equals(pjT$PjT0) ? 0.8f : 0.0f;
            }
            case 2: {
                return 1.2f;
            }
            case 3: {
                return 1.0f;
            }
            default: {
                return 0.0f;
            }
        }
    }

    public JSONObject PjT() throws JSONException {
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("width", this.PjT);
        jSONObject0.put("height", this.Zh);
        jSONObject0.put("creativeType", this.ReZ.toString());
        jSONObject0.put("resourceType", this.cr.toString());
        jSONObject0.put("contentUrl", this.JQp);
        jSONObject0.put("clickThroughUri", this.Au);
        jSONObject0.put("clickTrackers", com.bytedance.sdk.openadsdk.core.qj.Zh.ReZ.PjT(this.cz));
        jSONObject0.put("creativeViewTrackers", com.bytedance.sdk.openadsdk.core.qj.Zh.ReZ.PjT(this.XX));
        return jSONObject0;
    }

    public void PjT(long v) {
        com.bytedance.sdk.openadsdk.core.qj.Zh.ReZ.PjT(this.cz, null, v, this.DWo, new com.bytedance.sdk.openadsdk.core.qj.Zh.ReZ.Zh(this.SM, this.xf));
    }

    public void PjT(Owx owx0) {
        this.xf = owx0;
    }

    public void PjT(String s) {
        this.DWo = s;
    }

    public int ReZ() {
        return this.Zh;
    }

    public static ReZ Zh(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return null;
        }
        int v = jSONObject0.optInt("width");
        int v1 = jSONObject0.optInt("height");
        String s = jSONObject0.optString("creativeType", "NONE");
        String s1 = jSONObject0.optString("resourceType", "HTML_RESOURCE");
        String s2 = jSONObject0.optString("contentUrl");
        String s3 = jSONObject0.optString("clickThroughUri");
        JSONArray jSONArray0 = jSONObject0.optJSONArray("clickTrackers");
        JSONArray jSONArray1 = jSONObject0.optJSONArray("creativeViewTrackers");
        ArrayList arrayList0 = new ArrayList();
        for(int v3 = 0; v3 < jSONArray0.length(); ++v3) {
            arrayList0.add(new com.bytedance.sdk.openadsdk.core.qj.Zh.ReZ.PjT(jSONArray0.optString(v3)).PjT());
        }
        ArrayList arrayList1 = new ArrayList();
        for(int v2 = 0; v2 < jSONArray1.length(); ++v2) {
            arrayList1.add(new com.bytedance.sdk.openadsdk.core.qj.Zh.ReZ.PjT(jSONArray1.optString(v2)).PjT());
        }
        return new ReZ(v, v1, PjT.valueOf(s), Zh.valueOf(s1), s2, arrayList0, arrayList1, s3);
    }

    public int Zh() {
        return this.PjT;
    }

    public void Zh(long v) {
        if(this.qj.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.core.qj.Zh.ReZ.Zh(this.XX, null, v, this.DWo);
        }
    }

    public String cr() {
        switch(this.cr) {
            case 1: {
                PjT pjT$PjT0 = this.ReZ;
                if(pjT$PjT0 == PjT.Zh) {
                    return "<html><head></head><body style=\"margin:0;padding:0\"><img src=\"" + this.JQp + "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>";
                }
                return pjT$PjT0 == PjT.ReZ ? "<script src=\"" + this.JQp + "\"></script>" : null;
            }
            case 2: {
                return this.JQp;
            }
            case 3: {
                return "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"" + this.PjT + "\" height=\"" + this.Zh + "\" src=\"" + this.JQp + "\"></iframe>";
            }
            default: {
                return null;
            }
        }
    }

    public String cz() {
        return this.JQp;
    }
}

