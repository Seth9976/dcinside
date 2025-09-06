package com.bytedance.adsdk.PjT;

import android.text.TextUtils;
import org.json.JSONObject;

public class XX implements cz {
    @Override  // com.bytedance.adsdk.PjT.cz
    public Object PjT(JSONObject jSONObject0, Object[] arr_object) {
        if(arr_object != null && arr_object.length == 0) {
            String s = String.valueOf(arr_object[2]);
            String s1 = String.valueOf(arr_object[1]);
            String s2 = String.valueOf(arr_object[0]);
            if(TextUtils.isEmpty(s2)) {
                return s;
            }
            if(jSONObject0 == null) {
                return s;
            }
            JSONObject jSONObject1 = jSONObject0.optJSONObject("i18n");
            if(jSONObject1 == null) {
                return s;
            }
            JSONObject jSONObject2 = jSONObject1.optJSONObject(s1);
            if(jSONObject2 == null) {
                return s;
            }
            String s3 = jSONObject2.optString(s2);
            return TextUtils.isEmpty(s3) ? s : s3;
        }
        return null;
    }
}

