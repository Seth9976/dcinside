package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.qla.PjT.cr;
import com.bytedance.sdk.openadsdk.qla.Zh;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class ReZ {
    public AdSlot JQp;
    public String PjT;
    public int ReZ;
    public int Zh;
    public ArrayList cr;

    public ReZ() {
        this.ReZ = 1;
    }

    public ArrayList JQp() {
        return this.cr;
    }

    public static void PjT(ReZ reZ0) {
        if(reZ0 != null && reZ0.cr() != null) {
            int v = reZ0.Zh();
            if(v < 0 && v != -8) {
                com.bytedance.sdk.openadsdk.qla.ReZ.PjT();
                com.bytedance.sdk.openadsdk.qla.ReZ.PjT("rd_client_custom_error", false, new Zh() {
                    @Override  // com.bytedance.sdk.openadsdk.qla.Zh
                    public com.bytedance.sdk.openadsdk.qla.PjT.ReZ getLogStats() throws Exception {
                        JSONObject jSONObject0 = new JSONObject();
                        jSONObject0.put("from", reZ0.ReZ());
                        jSONObject0.put("err_code", reZ0.Zh());
                        jSONObject0.put("server_res_str", reZ0.PjT());
                        if(reZ0.JQp() != null && reZ0.JQp().size() > 0) {
                            jSONObject0.put("mate_unavailable_code_list", new JSONArray(reZ0.JQp()).toString());
                        }
                        return cr.Zh().PjT("rd_client_custom_error").PjT(reZ0.cr().getDurationSlotType()).Zh(jSONObject0.toString());
                    }
                });
            }
        }
    }

    public String PjT() {
        return this.PjT;
    }

    public void PjT(int v) {
        this.Zh = v;
    }

    public void PjT(AdSlot adSlot0) {
        this.JQp = adSlot0;
    }

    public void PjT(String s) {
        this.PjT = s;
    }

    public void PjT(ArrayList arrayList0) {
        this.cr = arrayList0;
    }

    public int ReZ() {
        return this.ReZ;
    }

    public int Zh() {
        return this.Zh;
    }

    public void Zh(int v) {
        this.ReZ = v;
    }

    public AdSlot cr() {
        return this.JQp;
    }
}

