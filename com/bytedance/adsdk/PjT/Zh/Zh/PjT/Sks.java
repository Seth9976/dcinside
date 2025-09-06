package com.bytedance.adsdk.PjT.Zh.Zh.PjT;

import android.text.TextUtils;
import com.bytedance.adsdk.PjT.Zh.Zh.PjT;
import com.bytedance.adsdk.PjT.Zh.cr.JQp;
import com.bytedance.adsdk.PjT.Zh.cr.cz;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Sks implements PjT {
    private final String PjT;

    public Sks(String s) {
        this.PjT = s;
    }

    private Object PjT(String[] arr_s, int v, JSONObject jSONObject0) {
        Object object1;
        int v3;
        if(arr_s != null && arr_s.length > 0 && v < arr_s.length && jSONObject0 != null) {
            String s = arr_s[v];
            int v1 = s.indexOf("[");
            int v2 = s.indexOf("]");
            if(v1 < 0 || v2 < 0 || v1 > v2) {
                object1 = jSONObject0.opt(s);
            }
            else {
                try {
                    v3 = Integer.parseInt(s.substring(v1 + 1, v2));
                }
                catch(NumberFormatException unused_ex) {
                    return null;
                }
                Object object0 = jSONObject0.opt(s.substring(0, v1));
                object1 = object0 instanceof JSONArray ? ((JSONArray)object0).opt(v3) : null;
            }
            if(v == arr_s.length - 1) {
                return object1;
            }
            if(object1 instanceof String) {
                try {
                    return this.PjT(arr_s, v + 1, new JSONObject(((String)object1)));
                }
                catch(JSONException unused_ex) {
                    return object1;
                }
            }
            return object1 instanceof JSONObject ? this.PjT(arr_s, v + 1, ((JSONObject)object1)) : null;
        }
        return null;
    }

    @Override  // com.bytedance.adsdk.PjT.Zh.Zh.PjT
    public JQp PjT() {
        return cz.ReZ;
    }

    // 去混淆评级： 低(20)
    public Object PjT(String s, JSONObject jSONObject0) {
        return TextUtils.isEmpty(s) ? null : this.PjT(s.split("\\."), 0, jSONObject0);
    }

    @Override  // com.bytedance.adsdk.PjT.Zh.Zh.PjT
    public Object PjT(Map map0) {
        if(map0 != null && map0.size() > 0) {
            JSONObject jSONObject0 = (JSONObject)map0.get("default_key");
            Object object0 = this.PjT(this.PjT, jSONObject0);
            return object0 == JSONObject.NULL ? null : object0;
        }
        return null;
    }

    @Override  // com.bytedance.adsdk.PjT.Zh.Zh.PjT
    public String Zh() {
        return this.PjT;
    }

    @Override
    public String toString() {
        return "VariableNode [literals=" + this.PjT + "]";
    }
}

