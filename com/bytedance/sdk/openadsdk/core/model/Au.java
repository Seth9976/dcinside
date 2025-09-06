package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.RD;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class Au {
    private String PjT;
    private List Zh;

    public Au(String s) {
        this.PjT = "";
        this.Zh = new ArrayList();
        HashMap hashMap0 = TextUtils.isEmpty(s) ? new HashMap() : Au.PjT(s);
        try {
            this.PjT = (String)hashMap0.get("auto_test_param");
            JSONArray jSONArray0 = new JSONArray(((String)hashMap0.get("auto_test_hosts")));
            this.Zh = new ArrayList();
            for(int v = 0; v < jSONArray0.length(); ++v) {
                String s1 = jSONArray0.optString(v);
                this.Zh.add(s1);
            }
        }
        catch(Exception exception0) {
            RD.Zh("AutoTestModel", exception0.getMessage());
        }
    }

    private static final HashMap PjT(String s) {
        if(TextUtils.isEmpty(s)) {
            return new HashMap();
        }
        HashMap hashMap0 = new HashMap();
        try {
            JSONArray jSONArray0 = new JSONArray(s);
            for(int v = 0; v < jSONArray0.length(); ++v) {
                JSONObject jSONObject0 = jSONArray0.optJSONObject(v);
                hashMap0.put(jSONObject0.optString("name"), jSONObject0.optString("value"));
            }
            return hashMap0;
        }
        catch(Exception unused_ex) {
            return new HashMap();
        }
    }

    public String PjT() {
        return this.PjT;
    }

    public List Zh() {
        return this.Zh;
    }
}

