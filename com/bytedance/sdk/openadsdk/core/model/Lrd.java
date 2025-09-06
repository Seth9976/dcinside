package com.bytedance.sdk.openadsdk.core.model;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.RD;
import java.util.Iterator;
import org.json.JSONObject;

public class Lrd {
    private int Au;
    private String DWo;
    private String JQp;
    private String PjT;
    private int ReZ;
    private String SM;
    private String XX;
    private String Zh;
    private int cr;
    private String cz;
    private int qj;

    public boolean Au() {
        return this.qj == 1;
    }

    public JSONObject DWo() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            if(!TextUtils.isEmpty(this.PjT)) {
                jSONObject0.put("market_dpl", this.PjT);
            }
            if(!TextUtils.isEmpty(this.Zh)) {
                jSONObject0.put("market_dpl_auto", this.Zh);
            }
            if(!TextUtils.isEmpty(this.JQp)) {
                jSONObject0.put("market_pkg", this.JQp);
            }
            if(!TextUtils.isEmpty(this.XX)) {
                jSONObject0.put("app_pkg", this.XX);
            }
            if(!TextUtils.isEmpty(this.cz)) {
                jSONObject0.put("regex", this.cz);
            }
            jSONObject0.put("exec_type", this.ReZ);
            jSONObject0.put("oem_vendor_type", this.cr);
            jSONObject0.put("overlay", this.Au);
            jSONObject0.put("gp_card", this.qj);
            if(!TextUtils.isEmpty(this.SM)) {
                jSONObject0.put("caller_id", this.SM);
            }
            if(!TextUtils.isEmpty(this.DWo)) {
                jSONObject0.put("ext_map", this.DWo);
            }
            return jSONObject0;
        }
        catch(Throwable throwable0) {
        }
        RD.Zh("OemModel", throwable0.getMessage());
        return null;
    }

    public String JQp() {
        return this.cz;
    }

    public void JQp(String s) {
        this.cz = s;
    }

    public static Lrd PjT(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return null;
        }
        Lrd lrd0 = new Lrd();
        try {
            lrd0.cz(jSONObject0.optString("market_dpl", ""));
            lrd0.XX(jSONObject0.optString("market_dpl_auto", ""));
            lrd0.ReZ(jSONObject0.optInt("exec_type", 0));
            lrd0.cr(jSONObject0.optInt("oem_vendor_type", 0));
            lrd0.cr(jSONObject0.optString("market_pkg", ""));
            lrd0.JQp(jSONObject0.optString("regex", ""));
            lrd0.Zh(jSONObject0.optInt("overlay", 1));
            lrd0.Zh(jSONObject0.optString("caller_id", ""));
            lrd0.ReZ(jSONObject0.optString("ext_map", null));
            lrd0.PjT(jSONObject0.optInt("gp_card", 0));
            lrd0.PjT(jSONObject0.optString("app_pkg", ""));
        }
        catch(Throwable throwable0) {
            RD.Zh("OemModel", throwable0.getMessage());
        }
        return lrd0;
    }

    public String PjT() {
        return this.XX;
    }

    public void PjT(int v) {
        this.qj = v;
    }

    public void PjT(Intent intent0) {
        if(!TextUtils.isEmpty(this.DWo)) {
            try {
                JSONObject jSONObject0 = new JSONObject(this.DWo);
                Iterator iterator0 = jSONObject0.keys();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    String s = (String)object0;
                    Object object1 = jSONObject0.get(s);
                    if(object1 instanceof String) {
                        intent0.putExtra(s, ((String)object1));
                    }
                    else if(object1 instanceof Integer) {
                        intent0.putExtra(s, ((Integer)object1));
                    }
                    else if(object1 instanceof Boolean) {
                        intent0.putExtra(s, ((Boolean)object1));
                    }
                    else if(object1 instanceof Long) {
                        intent0.putExtra(s, ((Long)object1));
                    }
                    else if(object1 instanceof Double) {
                        intent0.putExtra(s, ((Double)object1));
                    }
                    else {
                        if(!(object1 instanceof Float)) {
                            continue;
                        }
                        intent0.putExtra(s, ((Float)object1));
                    }
                }
            }
            catch(Throwable unused_ex) {
            }
        }
    }

    public void PjT(String s) {
        this.XX = s;
    }

    public String ReZ() {
        return this.SM;
    }

    public void ReZ(int v) {
        this.ReZ = v;
    }

    public void ReZ(String s) {
        this.DWo = s;
    }

    public String SM() {
        return this.ReZ == 2 ? this.Zh : this.PjT;
    }

    public void XX(String s) {
        this.Zh = s;
    }

    public boolean XX() {
        return this.cr == 1;
    }

    public int Zh() {
        return this.Au;
    }

    public void Zh(int v) {
        this.Au = v;
    }

    public void Zh(String s) {
        this.SM = s;
    }

    public String cr() {
        return this.JQp;
    }

    public void cr(int v) {
        this.cr = v;
    }

    public void cr(String s) {
        this.JQp = s;
    }

    public int cz() {
        return this.cr;
    }

    public void cz(String s) {
        this.PjT = s;
    }
}

