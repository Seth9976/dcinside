package com.fsn.cauly.Y;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class d extends u0 {
    public static j0 a(j0 j00, String s) {
        int v1;
        if(j00 != null && !TextUtils.isEmpty(s)) {
            try {
                j00.L = new ArrayList();
                JSONArray jSONArray0 = new JSONObject(s.replace("&quot;", "\"")).getJSONArray("list");
                for(int v = 0; true; v = v1 + 1) {
                    if(v >= jSONArray0.length()) {
                        return j00;
                    }
                    k0 k00 = new k0();
                    JSONObject jSONObject0 = (JSONObject)jSONArray0.get(v);
                    if(jSONObject0.isNull("name")) {
                        v1 = v;
                    }
                    else {
                        v1 = v;
                        k00.a = jSONObject0.getString("name");
                    }
                    if(!jSONObject0.isNull("link")) {
                        k00.d = jSONObject0.getString("link");
                    }
                    if(!jSONObject0.isNull("color")) {
                        k00.b = jSONObject0.getString("color");
                    }
                    if(!jSONObject0.isNull("text")) {
                        k00.c = jSONObject0.getString("text");
                    }
                    if(!jSONObject0.isNull("font")) {
                        k00.f = jSONObject0.getString("font");
                    }
                    if(!jSONObject0.isNull("url")) {
                        k00.e = jSONObject0.getString("url");
                    }
                    if(!jSONObject0.isNull("x")) {
                        k00.i = jSONObject0.getInt("x");
                    }
                    if(!jSONObject0.isNull("y")) {
                        k00.j = jSONObject0.getInt("y");
                    }
                    if(!jSONObject0.isNull("width")) {
                        k00.g = jSONObject0.getInt("width");
                    }
                    if(!jSONObject0.isNull("height")) {
                        k00.h = jSONObject0.getInt("height");
                    }
                    if(!jSONObject0.isNull("url2")) {
                        k00.k = jSONObject0.getString("url2");
                    }
                    if(!jSONObject0.isNull("btn_id")) {
                        k00.l = jSONObject0.getString("btn_id");
                    }
                    j00.L.add(k00);
                }
            }
            catch(JSONException jSONException0) {
            }
            jSONException0.printStackTrace();
        }
        return j00;
    }

    public static j0 c(String s) {
        JSONArray jSONArray1;
        j0 j00 = new j0();
        try {
            j00.L = new ArrayList();
            JSONArray jSONArray0 = new JSONObject(s.replace("&quot;", "\"")).getJSONArray("list");
            int v = 0;
            while(true) {
                if(v >= jSONArray0.length()) {
                    return j00;
                }
                k0 k00 = new k0();
                JSONObject jSONObject0 = (JSONObject)jSONArray0.get(v);
                if(jSONObject0.isNull("name")) {
                    jSONArray1 = jSONArray0;
                }
                else {
                    jSONArray1 = jSONArray0;
                    k00.a = jSONObject0.getString("name");
                }
                if(!jSONObject0.isNull("link")) {
                    k00.d = jSONObject0.getString("link");
                }
                if(!jSONObject0.isNull("color")) {
                    k00.b = jSONObject0.getString("color");
                }
                if(!jSONObject0.isNull("text")) {
                    k00.c = jSONObject0.getString("text");
                }
                if(!jSONObject0.isNull("font")) {
                    k00.f = jSONObject0.getString("font");
                }
                if(!jSONObject0.isNull("url")) {
                    k00.e = jSONObject0.getString("url");
                }
                if(!jSONObject0.isNull("x")) {
                    k00.i = jSONObject0.getInt("x");
                }
                if(!jSONObject0.isNull("y")) {
                    k00.j = jSONObject0.getInt("y");
                }
                if(!jSONObject0.isNull("width")) {
                    k00.g = jSONObject0.getInt("width");
                }
                if(!jSONObject0.isNull("height")) {
                    k00.h = jSONObject0.getInt("height");
                }
                if(!jSONObject0.isNull("url2")) {
                    k00.k = jSONObject0.getString("url2");
                }
                j00.L.add(k00);
                ++v;
                jSONArray0 = jSONArray1;
            }
        }
        catch(JSONException jSONException0) {
        }
        jSONException0.printStackTrace();
        return j00;
    }
}

