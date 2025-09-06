package com.bytedance.adsdk.ugeno.XX;

import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Zh {
    public static JSONArray PjT(String s, JSONArray jSONArray0) {
        if(TextUtils.isEmpty(s)) {
            return jSONArray0;
        }
        try {
            return new JSONArray(s);
        }
        catch(JSONException unused_ex) {
            return jSONArray0;
        }
    }

    public static JSONObject PjT(String s, JSONObject jSONObject0) {
        if(TextUtils.isEmpty(s)) {
            return jSONObject0;
        }
        try {
            return new JSONObject(s);
        }
        catch(JSONException unused_ex) {
            return jSONObject0;
        }
    }

    public static void PjT(JSONArray jSONArray0, JSONArray jSONArray1) {
        if(jSONArray1 != null && jSONArray1.length() > 0) {
            if(jSONArray0 == null) {
                jSONArray0 = new JSONArray();
            }
            for(int v = 0; v < jSONArray1.length(); ++v) {
                Object object0 = jSONArray1.opt(v);
                if(object0 != null) {
                    jSONArray0.put(object0);
                }
            }
        }
    }

    public static void PjT(JSONObject jSONObject0, JSONObject jSONObject1) {
        if(jSONObject0 != null && jSONObject1 != null) {
            Iterator iterator0 = jSONObject0.keys();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                String s = (String)object0;
                try {
                    jSONObject1.put(s, jSONObject0.opt(s));
                }
                catch(JSONException unused_ex) {
                }
            }
        }
    }
}

