package com.bytedance.sdk.component.adexpress.dynamic.cr;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ReZ {
    private HashMap PjT;
    private JSONObject Zh;

    public ReZ(JSONObject jSONObject0) {
        this.PjT = new HashMap();
        this.Zh = jSONObject0;
    }

    private void PjT(String s, String s1, Object object0) {
        Iterator iterator0 = ((JSONObject)object0).keys();
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            String s2 = (String)object1;
            Object object2 = ((JSONObject)object0).opt(s2);
            if(object2 instanceof JSONArray && TextUtils.equals(s2, "product_infos")) {
                for(int v = 0; v < ((JSONArray)object2).length(); ++v) {
                    JSONObject jSONObject0 = ((JSONArray)object2).optJSONObject(v);
                    Iterator iterator1 = jSONObject0.keys();
                    while(iterator1.hasNext()) {
                        Object object3 = iterator1.next();
                        Object object4 = jSONObject0.opt(((String)object3));
                        this.PjT.put(s + "." + s1 + "." + s2 + "." + v + "." + ((String)object3), object4);
                    }
                }
            }
            else {
                this.PjT.put(s + "." + s1 + "." + s2, object2);
            }
        }
    }

    // 去混淆评级： 低(20)
    public Object PjT(String s) {
        return this.PjT.containsKey(s) ? this.PjT.get(s) : null;
    }

    public void PjT() {
        Iterator iterator0 = this.Zh.keys();
    label_1:
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s = (String)object0;
            Object object1 = this.Zh.opt(s);
            if(!TextUtils.equals("image", s)) {
                if(TextUtils.equals("dynamic_creative", s)) {
                    if(object1 instanceof String) {
                        goto label_22;
                    }
                    else {
                        continue;
                        try {
                        label_22:
                            JSONObject jSONObject1 = new JSONObject(((String)object1));
                            Iterator iterator2 = jSONObject1.keys();
                            while(true) {
                            label_24:
                                if(!iterator2.hasNext()) {
                                    goto label_49;
                                }
                                Object object4 = iterator2.next();
                                String s1 = (String)object4;
                                Object object5 = jSONObject1.opt(s1);
                                if(object5 instanceof JSONArray && !TextUtils.equals(s1, "short_phrase") && !TextUtils.equals(s1, "long_phrase")) {
                                    for(int v1 = 0; v1 < ((JSONArray)object5).length(); ++v1) {
                                        this.PjT.put(s + "." + s1 + "." + v1, ((JSONArray)object5).opt(v1));
                                    }
                                }
                                else if(object5 instanceof JSONObject && TextUtils.equals(s1, "coupon")) {
                                    Iterator iterator3 = ((JSONObject)object5).keys();
                                    while(iterator3.hasNext()) {
                                        Object object6 = iterator3.next();
                                        Object object7 = ((JSONObject)object5).opt(((String)object6));
                                        this.PjT.put(s + "." + s1 + "." + ((String)object6), object7);
                                    }
                                }
                                else if(!(object5 instanceof JSONObject) || !TextUtils.equals(s1, "live_room_data")) {
                                    this.PjT.put(s + "." + s1, object5);
                                }
                                else {
                                    this.PjT(s, s1, object5);
                                }
                            }
                        }
                        catch(JSONException unused_ex) {
                            continue label_1;
                        }
                        goto label_24;
                    label_49:
                        continue;
                    }
                }
                if(object1 instanceof JSONObject) {
                    if(object1 == null) {
                        continue;
                    }
                    JSONObject jSONObject2 = (JSONObject)object1;
                    Iterator iterator4 = jSONObject2.keys();
                    while(iterator4.hasNext()) {
                        Object object8 = iterator4.next();
                        Object object9 = jSONObject2.opt(((String)object8));
                        this.PjT.put(s + "." + ((String)object8), object9);
                    }
                }
                else {
                    this.PjT.put(s, object1);
                    if(object1 instanceof String) {
                        this.PjT.put(s, object1);
                    }
                }
            }
            else if(object1 instanceof JSONArray) {
                for(int v = 0; v < ((JSONArray)object1).length(); ++v) {
                    JSONObject jSONObject0 = ((JSONArray)object1).optJSONObject(v);
                    if(jSONObject0 != null) {
                        Iterator iterator1 = jSONObject0.keys();
                        while(iterator1.hasNext()) {
                            Object object2 = iterator1.next();
                            Object object3 = jSONObject0.opt(((String)object2));
                            this.PjT.put(s + "." + v + "." + ((String)object2), object3);
                        }
                    }
                }
            }
        }
    }

    public boolean Zh(String s) {
        return this.PjT.containsKey(s);
    }
}

