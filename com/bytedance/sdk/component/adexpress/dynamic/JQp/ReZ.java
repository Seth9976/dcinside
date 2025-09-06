package com.bytedance.sdk.component.adexpress.dynamic.JQp;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.cr.cr.PjT;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class ReZ {
    private static JSONObject PjT(JSONObject jSONObject0, JSONObject jSONObject1) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = jSONObject0.optJSONObject("customComponentDefaultValues");
            JSONObject jSONObject4 = jSONObject0.optJSONObject("values");
            Iterator iterator0 = jSONObject4.keys();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                jSONObject3.put(((String)object0), jSONObject4.opt(((String)object0)));
            }
            Iterator iterator1 = jSONObject0.keys();
            while(iterator1.hasNext()) {
                Object object1 = iterator1.next();
                String s = (String)object1;
                if(TextUtils.equals(s, "customComponentDefaultValues")) {
                }
                else if(TextUtils.equals(s, "values")) {
                    jSONObject2.put(s, jSONObject3);
                }
                else {
                    jSONObject2.put(s, jSONObject0.opt(s));
                }
            }
            jSONObject2.put("type", "vessel");
            JSONObject jSONObject5 = jSONObject1.optJSONObject("values");
            JSONObject jSONObject6 = jSONObject2.optJSONObject("values");
            if(jSONObject5 != null && jSONObject6 != null) {
                Iterator iterator2 = jSONObject5.keys();
                while(iterator2.hasNext()) {
                    Object object2 = iterator2.next();
                    String s1 = (String)object2;
                    if(!"clickArea".equals(s1)) {
                        jSONObject6.put(s1, jSONObject5.opt(s1));
                    }
                }
            }
        }
        catch(JSONException unused_ex) {
        }
        return jSONObject2;
    }

    public JSONObject PjT(List list0, int v, JSONObject jSONObject0) {
        if(list0 != null && list0.size() > 0) {
            PjT cr$PjT0 = null;
            for(Object object0: list0) {
                PjT cr$PjT1 = (PjT)object0;
                if(cr$PjT1 != null && cr$PjT1.PjT == v) {
                    cr$PjT0 = cr$PjT1;
                    break;
                }
            }
            if(cr$PjT0 == null) {
                return null;
            }
            return cr$PjT0.Zh == null ? null : ReZ.PjT(cr$PjT0.Zh, jSONObject0);
        }
        return null;
    }
}

