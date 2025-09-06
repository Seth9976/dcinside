package com.bytedance.adsdk.PjT;

import org.json.JSONArray;
import org.json.JSONObject;

public class PjT implements cz {
    @Override  // com.bytedance.adsdk.PjT.cz
    public Object PjT(JSONObject jSONObject0, Object[] arr_object) {
        if(arr_object != null && arr_object.length == 2) {
            String s = String.valueOf(arr_object[0]);
            JSONArray jSONArray0 = new JSONArray();
            try {
                JSONArray jSONArray1 = new JSONArray(s);
                int v = Integer.parseInt(String.valueOf(arr_object[1]));
                for(int v1 = 0; v1 < jSONArray1.length(); v1 += v) {
                    JSONObject jSONObject1 = new JSONObject();
                    JSONArray jSONArray2 = new JSONArray();
                    for(int v2 = 0; v2 < v; ++v2) {
                        int v3 = v1 + v2;
                        if(v3 >= jSONArray1.length()) {
                            break;
                        }
                        jSONArray2.put(jSONArray1.optJSONObject(v3));
                    }
                    jSONObject1.put("$chunk", jSONArray2);
                    jSONArray0.put(jSONObject1);
                }
            }
            catch(Throwable unused_ex) {
            }
            return jSONArray0;
        }
        return null;
    }
}

