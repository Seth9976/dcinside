package com.bytedance.sdk.openadsdk.core.qj;

import android.text.TextUtils;
import j..util.Objects;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class DWo {
    private final String PjT;
    private final String ReZ;
    private final URL Zh;
    private final String cr;

    private DWo(String s, String s1, String s2, String s3) throws MalformedURLException {
        this.PjT = s1;
        this.Zh = new URL(s);
        this.ReZ = s2;
        this.cr = s3;
    }

    public static DWo PjT(String s, String s1, String s2, String s3, String s4) {
        if("omid".equalsIgnoreCase(s) && !TextUtils.isEmpty(s1)) {
            try {
                return new DWo(s1, s2, s3, s4);
            }
            catch(Throwable unused_ex) {
            }
        }
        return null;
    }

    public static DWo PjT(JSONObject jSONObject0) {
        try {
            String s = jSONObject0.optString("apiFramework");
            String s1 = jSONObject0.optString("javascriptResourceUrl");
            return !"omid".equalsIgnoreCase(s) || TextUtils.isEmpty(s1) ? null : new DWo(s1, jSONObject0.optString("vendorKey"), jSONObject0.optString("verificationParameters"), jSONObject0.optString("verificationNotExecuted"));
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }

    public static Set PjT(JSONArray jSONArray0) {
        Set set0 = new HashSet();
        if(jSONArray0 == null) {
            return set0;
        }
        try {
            for(int v = 0; v < jSONArray0.length(); ++v) {
                set0.add(DWo.PjT(jSONArray0.getJSONObject(v)));
            }
        }
        catch(Throwable unused_ex) {
        }
        return set0;
    }

    private boolean PjT(Object object0, Object object1) {
        return Objects.equals(object0, object1);
    }

    public String PjT() {
        return this.PjT;
    }

    public URL ReZ() {
        return this.Zh;
    }

    public String Zh() {
        return this.ReZ;
    }

    public JSONObject cr() {
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("apiFramework", "omid");
            jSONObject0.put("javascriptResourceUrl", this.Zh.toString());
            if(!TextUtils.isEmpty(this.PjT)) {
                jSONObject0.put("vendorKey", this.PjT);
            }
            if(!TextUtils.isEmpty(this.ReZ)) {
                jSONObject0.put("verificationParameters", this.ReZ);
            }
            if(!TextUtils.isEmpty(this.cr)) {
                jSONObject0.put("verificationNotExecuted", this.cr);
            }
            return jSONObject0;
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DWo)) {
            return false;
        }
        if(!this.PjT(this.PjT, ((DWo)object0).PjT)) {
            return false;
        }
        if(!this.PjT(this.Zh, ((DWo)object0).Zh)) {
            return false;
        }
        return this.PjT(this.ReZ, ((DWo)object0).ReZ) ? this.PjT(this.cr, ((DWo)object0).cr) : false;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.PjT == null ? 0 : this.PjT.hashCode();
        int v2 = this.Zh.hashCode();
        int v3 = this.ReZ == null ? 0 : this.ReZ.hashCode();
        String s = this.cr;
        if(s != null) {
            v = s.hashCode();
        }
        return ((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v;
    }
}

