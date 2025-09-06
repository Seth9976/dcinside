package com.bytedance.adsdk.PjT;

import android.text.TextUtils;
import org.json.JSONObject;

public class ReZ implements cz {
    @Override  // com.bytedance.adsdk.PjT.cz
    public Object PjT(JSONObject jSONObject0, Object[] arr_object) {
        if(arr_object != null && arr_object.length > 0) {
            for(int v = 0; v < arr_object.length; ++v) {
                String s = String.valueOf(arr_object[v]);
                if(!TextUtils.isEmpty(s) && !TextUtils.equals(s, "null")) {
                    return s;
                }
            }
        }
        return null;
    }
}

