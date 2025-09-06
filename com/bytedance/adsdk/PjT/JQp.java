package com.bytedance.adsdk.PjT;

import org.json.JSONObject;

public class JQp implements cz {
    @Override  // com.bytedance.adsdk.PjT.cz
    public Object PjT(JSONObject jSONObject0, Object[] arr_object) {
        return this.Zh(jSONObject0, arr_object);
    }

    public Boolean Zh(JSONObject jSONObject0, Object[] arr_object) {
        if(arr_object != null && arr_object.length > 0) {
            try {
                Double.parseDouble(String.valueOf(arr_object[0]));
                return true;
            }
            catch(NumberFormatException unused_ex) {
                return false;
            }
        }
        return false;
    }
}

