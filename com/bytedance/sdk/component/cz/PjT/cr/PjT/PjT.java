package com.bytedance.sdk.component.cz.PjT.cr.PjT;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class PjT implements com.bytedance.sdk.component.cz.PjT.cr.PjT {
    private String Au;
    private byte DWo;
    private long JQp;
    protected JSONObject PjT;
    private byte ReZ;
    private String SM;
    private long XX;
    private Zh Zh;
    private byte cr;
    private long cz;
    private String qj;
    private int xf;

    private PjT() {
    }

    public PjT(String s, Zh zh0) {
        this.SM = s;
        this.Zh = zh0;
    }

    public PjT(String s, JSONObject jSONObject0) {
        this.SM = s;
        this.PjT = jSONObject0;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.cr.PjT
    public long Au() {
        return this.JQp;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.cr.PjT
    public int DWo() {
        return this.xf;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.cr.PjT
    public byte JQp() {
        return this.cr;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.cr.PjT
    public Zh PjT() {
        return this.Zh;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.cr.PjT
    public void PjT(byte b) {
        this.ReZ = b;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.cr.PjT
    public void PjT(int v) {
        this.xf = v;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.cr.PjT
    public void PjT(long v) {
        this.JQp = v;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.cr.PjT
    public void PjT(String s) {
        this.SM = s;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.cr.PjT
    public void PjT(JSONObject jSONObject0) {
        this.PjT = jSONObject0;
    }

    public static com.bytedance.sdk.component.cz.PjT.cr.PjT ReZ(String s) {
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            int v = jSONObject0.optInt("type");
            int v1 = jSONObject0.optInt("priority");
            com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0 = new PjT();
            pjT0.PjT(((byte)v));
            pjT0.Zh(((byte)v1));
            pjT0.PjT(jSONObject0.optJSONObject("event"));
            pjT0.PjT(jSONObject0.optString("localId"));
            pjT0.Zh(jSONObject0.optString("genTime"));
            pjT0.PjT(jSONObject0.optInt("channel"));
            return pjT0;
        }
        catch(JSONException unused_ex) {
            return null;
        }
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.cr.PjT
    public String ReZ() {
        return this.SM;
    }

    public void ReZ(byte b) {
        this.DWo = b;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.cr.PjT
    public void ReZ(long v) {
        this.XX = v;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.cr.PjT
    public long SM() {
        return this.cz;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.cr.PjT
    public JSONObject XX() {
        synchronized(this) {
            if(this.PjT == null) {
                Zh zh0 = this.Zh;
                if(zh0 != null) {
                    this.PjT = zh0.PjT(this.qj());
                }
            }
            return this.PjT;
        }
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.cr.PjT
    public byte Zh() {
        return this.DWo;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.cr.PjT
    public void Zh(byte b) {
        this.cr = b;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.cr.PjT
    public void Zh(long v) {
        this.cz = v;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.cr.PjT
    public void Zh(String s) {
        this.Au = s;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.cr.PjT
    public byte cr() {
        return this.ReZ;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.cr.PjT
    public String cz() {
        if(!TextUtils.isEmpty(this.SM)) {
            JSONObject jSONObject0 = new JSONObject();
            try {
                jSONObject0.put("localId", this.SM);
                jSONObject0.put("event", this.XX());
                jSONObject0.put("genTime", this.xf());
                jSONObject0.put("priority", ((int)this.cr));
                jSONObject0.put("type", ((int)this.ReZ));
                jSONObject0.put("channel", this.xf);
            }
            catch(Throwable unused_ex) {
            }
            return jSONObject0.toString();
        }
        return null;
    }

    public String qj() {
        return this.qj;
    }

    public String xf() {
        return this.Au;
    }
}

