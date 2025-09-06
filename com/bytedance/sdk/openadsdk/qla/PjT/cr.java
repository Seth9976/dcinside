package com.bytedance.sdk.openadsdk.qla.PjT;

import android.os.Build.VERSION;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.component.utils.ltE;
import com.bytedance.sdk.openadsdk.core.SM;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.utils.wN;
import org.json.JSONObject;

public class cr implements ReZ {
    private int Au;
    private String DWo;
    private long JQp;
    private String PjT;
    private String ReZ;
    private String SM;
    private String XX;
    private String Zh;
    private final String cr;
    private int cz;
    private String qj;
    private String xf;

    public cr() {
        this.cr = "7.1.0.4";
        this.JQp = System.currentTimeMillis() / 1000L;
        this.cz = 0;
        this.Au = 0;
    }

    public long Au() {
        return this.JQp;
    }

    public cr Au(String s) {
        this.xf = s;
        return this;
    }

    public String DWo() {
        return this.XX;
    }

    public cr JQp(String s) {
        this.XX = s;
        return this;
    }

    public String JQp() {
        return this.Zh;
    }

    public cr PjT(int v) {
        this.cz = v;
        return this;
    }

    public cr PjT(String s) {
        this.PjT = s;
        return this;
    }

    @Override  // com.bytedance.sdk.openadsdk.qla.PjT.ReZ
    public JSONObject PjT() {
        JSONObject jSONObject1;
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("ad_sdk_version", "7.1.0.4");
            jSONObject0.put("app_version", wN.XX());
            jSONObject0.put("timestamp", this.Au());
            jSONObject0.put("conn_type", ltE.Zh(ub.PjT()));
            jSONObject0.put("appid", (TextUtils.isEmpty(SM.Zh().cr()) ? "" : SM.Zh().cr()));
            jSONObject0.put("device_info", this.qla());
            if(!TextUtils.isEmpty(this.ReZ())) {
                jSONObject0.put("type", this.ReZ());
            }
            jSONObject0.put("error_code", this.qj());
            if(!TextUtils.isEmpty(this.xf())) {
                jSONObject0.put("error_msg", this.xf());
            }
            if(!TextUtils.isEmpty(this.JQp())) {
                jSONObject0.put("rit", this.JQp());
            }
            if(!TextUtils.isEmpty(this.cz())) {
                jSONObject0.put("creative_id", this.cz());
            }
            if(this.SM() > 0) {
                jSONObject0.put("adtype", this.SM());
            }
            if(!TextUtils.isEmpty(this.DWo())) {
                jSONObject0.put("req_id", this.DWo());
            }
            if(!TextUtils.isEmpty(this.xs())) {
                jSONObject0.put("extra", this.xs());
            }
            String s = this.cr();
            if(TextUtils.isEmpty(s)) {
                jSONObject1 = new JSONObject();
            }
            else {
                try {
                    jSONObject1 = null;
                    jSONObject1 = new JSONObject(s);
                }
                catch(Exception unused_ex) {
                }
            }
            if(jSONObject1 != null) {
                jSONObject1.put("os_version_int", Build.VERSION.SDK_INT);
                jSONObject0.put("event_extra", jSONObject1.toString());
            }
            else if(!TextUtils.isEmpty(s)) {
                jSONObject0.put("event_extra", s);
            }
            if(!TextUtils.isEmpty(this.fDm())) {
                jSONObject0.put("duration", this.fDm());
                return jSONObject0;
            }
        }
        catch(Throwable throwable0) {
            RD.Zh("LogStatsBase", throwable0.getMessage());
        }
        return jSONObject0;
    }

    public cr ReZ(String s) {
        this.Zh = s;
        return this;
    }

    public String ReZ() {
        return this.PjT;
    }

    public int SM() {
        return this.cz;
    }

    public cr XX(String s) {
        this.DWo = s;
        return this;
    }

    // 去混淆评级： 低(40)
    public String XX() [...] // 潜在的解密器

    public static cr Zh() {
        return new cr();
    }

    public cr Zh(int v) {
        this.Au = v;
        return this;
    }

    public cr Zh(String s) {
        this.qj = s;
        return this;
    }

    public cr cr(String s) {
        this.ReZ = s;
        return this;
    }

    public String cr() {
        return this.qj;
    }

    public cr cz(String s) {
        this.SM = s;
        return this;
    }

    public String cz() {
        return this.ReZ;
    }

    public String fDm() {
        return this.xf;
    }

    public int qj() {
        return this.Au;
    }

    private JSONObject qla() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("os", 1);
            jSONObject0.put("model", Build.MODEL);
            jSONObject0.put("vendor", Build.MANUFACTURER);
            jSONObject0.put("package_name", wN.JQp());
            jSONObject0.put("ua", wN.ReZ());
        }
        catch(Throwable unused_ex) {
        }
        return jSONObject0;
    }

    private cr xE() [...] // Inlined contents

    public String xf() {
        return this.SM;
    }

    public String xs() {
        return this.DWo;
    }
}

