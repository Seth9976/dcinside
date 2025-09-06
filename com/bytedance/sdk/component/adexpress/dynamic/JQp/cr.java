package com.bytedance.sdk.component.adexpress.dynamic.JQp;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class cr {
    private static JSONArray PjT(JSONArray jSONArray0, JSONArray jSONArray1) {
        if(jSONArray1 != null && jSONArray1.length() > 0) {
            if(jSONArray0 != null && jSONArray0.length() > 0) {
                JSONArray jSONArray2 = new JSONArray();
                try {
                    for(int v = 0; v < jSONArray0.length(); ++v) {
                        Object object0 = jSONArray0.opt(v);
                        Object object1 = jSONArray1.opt(v);
                        if(object1 == null || object1 == JSONObject.NULL) {
                            jSONArray2.put(v, object0);
                        }
                        else if(object0 instanceof JSONObject && object1 instanceof JSONObject) {
                            jSONArray2.put(v, cr.PjT(((JSONObject)object0), ((JSONObject)object1)));
                        }
                        else if(!(object0 instanceof JSONArray) || !(object1 instanceof JSONArray)) {
                            jSONArray2.put(v, object1);
                        }
                        else {
                            jSONArray2.put(v, cr.PjT(((JSONArray)object0), ((JSONArray)object1)));
                        }
                    }
                }
                catch(JSONException unused_ex) {
                }
                return jSONArray2;
            }
            return null;
        }
        return jSONArray0;
    }

    public static JSONObject PjT(JSONObject jSONObject0, JSONObject jSONObject1) {
        JSONObject jSONObject2 = new JSONObject();
        if(jSONObject1 != null && jSONObject1.length() > 0 && jSONObject0 != null) {
            try {
                Iterator iterator0 = jSONObject0.keys();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    String s = (String)object0;
                    Object object1 = jSONObject0.opt(s);
                    Object object2 = jSONObject1.opt(s);
                    if(object2 == null || object2 == JSONObject.NULL) {
                        jSONObject2.put(s, object1);
                    }
                    else if(object1 instanceof JSONObject && object2 instanceof JSONObject) {
                        jSONObject2.put(s, cr.PjT(((JSONObject)object1), ((JSONObject)object2)));
                    }
                    else if(!(object1 instanceof JSONArray) || !(object2 instanceof JSONArray)) {
                        jSONObject2.put(s, object2);
                    }
                    else {
                        jSONObject2.put(s, cr.PjT(((JSONArray)object1), ((JSONArray)object2)));
                    }
                }
                Iterator iterator1 = jSONObject1.keys();
                while(iterator1.hasNext()) {
                    Object object3 = iterator1.next();
                    String s1 = (String)object3;
                    if(!jSONObject0.has(s1)) {
                        jSONObject2.put(s1, jSONObject1.opt(s1));
                    }
                }
            }
            catch(JSONException unused_ex) {
            }
            return jSONObject2;
        }
        return jSONObject0;
    }
}

