package com.bytedance.adsdk.ugeno.cr.cr;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.Zh.ReZ;
import com.bytedance.adsdk.ugeno.cr.DWo;
import com.bytedance.adsdk.ugeno.cr.XX;
import com.bytedance.adsdk.ugeno.cr.cz;
import com.bytedance.adsdk.ugeno.cr.qj;
import java.util.Map;
import org.json.JSONObject;

public abstract class PjT {
    public static class com.bytedance.adsdk.ugeno.cr.cr.PjT.PjT {
        public static PjT PjT(Context context0, ReZ reZ0, JSONObject jSONObject0, JSONObject jSONObject1) {
            if(reZ0 != null && jSONObject0 != null) {
                cz cz0 = cz.PjT(jSONObject0, jSONObject1);
                if(cz0 == null) {
                    return null;
                }
                com.bytedance.adsdk.ugeno.cr.cz.PjT cz$PjT0 = cz0.PjT();
                if(cz$PjT0 == null) {
                    return null;
                }
                if(TextUtils.equals("global", "custom")) {
                    PjT pjT0 = new Zh(context0);
                    pjT0.PjT(reZ0);
                    pjT0.PjT(cz0);
                    pjT0.PjT();
                    return pjT0;
                }
                XX xX0 = TextUtils.isEmpty("global") || TextUtils.equals("global", "global") ? DWo.PjT(cz$PjT0.Zh()) : DWo.PjT(cz$PjT0.JQp());
                if(xX0 == null) {
                    return null;
                }
                PjT pjT1 = xX0.PjT(context0);
                pjT1.PjT(reZ0);
                pjT1.PjT(cz0);
                pjT1.PjT();
                return pjT1;
            }
            return null;
        }
    }

    protected String Au;
    protected Context DWo;
    protected Map JQp;
    protected qj PjT;
    protected cz ReZ;
    protected String SM;
    protected String XX;
    protected ReZ Zh;
    protected com.bytedance.adsdk.ugeno.cr.cz.PjT cr;
    protected String cz;

    public PjT(Context context0) {
        this.DWo = context0;
    }

    public void PjT() {
        this.cr = this.ReZ.PjT();
        cz cz0 = this.ReZ;
        if(cz0 == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.cr.cz.PjT cz$PjT0 = cz0.PjT();
        this.cr = cz$PjT0;
        if(cz$PjT0 == null) {
            return;
        }
        this.JQp = cz$PjT0.ReZ();
        this.cz = this.cr.Zh();
        this.XX = "global";
        this.Au = this.cr.cr();
        this.SM = this.cr.JQp();
    }

    public void PjT(ReZ reZ0) {
        this.Zh = reZ0;
    }

    public void PjT(cz cz0) {
        this.ReZ = cz0;
    }

    public void PjT(qj qj0) {
        this.PjT = qj0;
    }

    public abstract boolean PjT(Object[] arg1);

    public String ReZ() {
        return this.SM;
    }

    public String Zh() {
        return this.cz;
    }
}

