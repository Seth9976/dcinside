package com.bytedance.adsdk.PjT;

import android.text.TextUtils;
import com.bytedance.adsdk.PjT.Zh.PjT;
import org.json.JSONException;
import org.json.JSONObject;

public class cr implements cz {
    @Override  // com.bytedance.adsdk.PjT.cz
    public Object PjT(JSONObject jSONObject0, Object[] arr_object) {
        return this.Zh(jSONObject0, arr_object);
    }

    public String Zh(JSONObject jSONObject0, Object[] arr_object) {
        if(arr_object != null && arr_object.length == 3) {
            String s = String.valueOf(arr_object[0]);
            if(TextUtils.isEmpty(s)) {
                return null;
            }
            try {
                JSONObject jSONObject1 = new JSONObject(s);
                String s1 = String.valueOf(arr_object[1]);
                if(TextUtils.isEmpty(s1)) {
                    return null;
                }
                Object object0 = PjT.PjT(s1).PjT(jSONObject1);
                return TextUtils.isEmpty(String.valueOf(object0)) ? String.valueOf(arr_object[2]) : String.valueOf(object0);
            }
            catch(JSONException unused_ex) {
            }
        }
        return null;
    }
}

