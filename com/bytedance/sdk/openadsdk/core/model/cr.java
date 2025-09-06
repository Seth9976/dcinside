package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.component.utils.RD;
import org.json.JSONObject;

public class cr {
    private double JQp;
    private String PjT;
    private String ReZ;
    private int XX;
    private String Zh;
    private String cr;
    private int cz;

    public cr() {
        this.PjT = "";
        this.Zh = "";
        this.ReZ = "";
        this.cr = "";
        this.JQp = -1.0;
        this.cz = -1;
    }

    public JSONObject Au() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("app_name", "");
            jSONObject0.put("app_size", this.cz());
            jSONObject0.put("comment_num", this.JQp());
            jSONObject0.put("download_url", "");
            jSONObject0.put("package_name", "");
            jSONObject0.put("score", this.cr());
            jSONObject0.put("app_category", "");
        }
        catch(Exception exception0) {
            RD.Zh(exception0.toString(), new Object[0]);
        }
        return jSONObject0;
    }

    public int JQp() {
        return this.cz;
    }

    public String PjT() [...] // 潜在的解密器

    public void PjT(double f) {
        if(f >= 1.0 && f <= 5.0) {
            this.JQp = f;
            return;
        }
        this.JQp = -1.0;
    }

    public void PjT(int v) {
        if(v <= 0) {
            this.cz = -1;
            return;
        }
        this.cz = v;
    }

    public void PjT(String s) {
        this.PjT = s;
    }

    public String ReZ() [...] // 潜在的解密器

    public void ReZ(String s) {
        this.ReZ = s;
    }

    public String XX() [...] // 潜在的解密器

    public String Zh() [...] // 潜在的解密器

    public void Zh(int v) {
        this.XX = v;
    }

    public void Zh(String s) {
        this.Zh = s;
    }

    public double cr() {
        return this.JQp;
    }

    public void cr(String s) {
        this.cr = s;
    }

    public int cz() {
        return this.XX;
    }
}

