package com.bytedance.sdk.component.adexpress.dynamic.cr;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class cr {
    public static class PjT {
        public int PjT;
        public JSONObject Zh;

    }

    public List PjT;
    public String ReZ;
    public String Zh;
    public String cr;

    public static cr PjT(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return null;
        }
        cr cr0 = new cr();
        String s = jSONObject0.optString("custom_components");
        ArrayList arrayList0 = new ArrayList();
        try {
            JSONArray jSONArray0 = new JSONArray(s);
            for(int v = 0; v < jSONArray0.length(); ++v) {
                JSONObject jSONObject1 = jSONArray0.optJSONObject(v);
                if(jSONObject1 != null) {
                    PjT cr$PjT0 = new PjT();
                    cr$PjT0.PjT = jSONObject1.optInt("id");
                    cr$PjT0.Zh = new JSONObject(jSONObject1.optString("componentLayout"));
                    arrayList0.add(cr$PjT0);
                }
            }
        }
        catch(JSONException unused_ex) {
        }
        cr0.PjT = arrayList0;
        cr0.Zh = jSONObject0.optString("diff_data");
        cr0.ReZ = jSONObject0.optString("style_diff");
        cr0.cr = jSONObject0.optString("tag_diff");
        return cr0;
    }
}

