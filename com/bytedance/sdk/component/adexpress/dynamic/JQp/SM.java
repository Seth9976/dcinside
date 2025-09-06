package com.bytedance.sdk.component.adexpress.dynamic.JQp;

import com.bytedance.sdk.component.adexpress.Zh;
import com.bytedance.sdk.component.adexpress.cr;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SM {
    public static String PjT(String s) [...] // 潜在的解密器

    public static String PjT(String s, String s1) [...] // 潜在的解密器

    public static JSONObject PjT(String s, JSONObject jSONObject0, JSONObject jSONObject1) {
        JSONObject jSONObject2 = Zh.Nv(s);
        if(jSONObject2 == null) {
            return null;
        }
        if(jSONObject0 == null) {
            jSONObject0 = new JSONObject();
        }
        return SM.PjT(new JSONObject[]{jSONObject1, jSONObject2.optJSONObject("themeValues"), jSONObject0});
    }

    public static JSONObject PjT(JSONArray jSONArray0) {
        if(jSONArray0 != null && jSONArray0.length() > 0) {
            JSONObject jSONObject0 = jSONArray0.optJSONObject(0);
            return jSONObject0 == null ? null : jSONObject0.optJSONObject("values");
        }
        return null;
    }

    public static JSONObject PjT(JSONObject[] arr_jSONObject) {
        JSONObject jSONObject0 = new JSONObject();
        for(int v = 0; v < arr_jSONObject.length; ++v) {
            JSONObject jSONObject1 = arr_jSONObject[v];
            if(jSONObject1 != null) {
                Iterator iterator0 = jSONObject1.keys();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    String s = (String)object0;
                    try {
                        jSONObject0.put(s, jSONObject1.opt(s));
                    }
                    catch(JSONException unused_ex) {
                    }
                }
            }
        }
        return jSONObject0;
    }

    public static void PjT(String s, JSONObject jSONObject0) {
        JSONObject jSONObject1 = Zh.Nv(s);
        if(jSONObject1 == null) {
            return;
        }
        if(jSONObject0 == null) {
            jSONObject0 = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObject1.optJSONObject("values");
        if(jSONObject2 == null) {
            return;
        }
        SM.PjT(jSONObject2, jSONObject0);
    }

    private static void PjT(JSONObject jSONObject0, JSONObject jSONObject1) {
        if(jSONObject1 == null) {
            jSONObject1 = new JSONObject();
        }
        if(jSONObject0 == null) {
            return;
        }
        Iterator iterator0 = jSONObject0.keys();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s = (String)object0;
            if(!jSONObject1.has(s)) {
                try {
                    jSONObject1.put(s, jSONObject0.opt(s));
                }
                catch(JSONException unused_ex) {
                }
            }
        }
    }

    public static String Zh(String s, String s1) {
        if(cr.Zh()) {
            if(s.indexOf(46) < 0) {
                s = s + ".png";
            }
            return s1 + "static/images/" + s;
        }
        return "https://sf16-static.i18n-pglstatp.com/obj/ad-pattern-sg/static/images/" + s;
    }
}

