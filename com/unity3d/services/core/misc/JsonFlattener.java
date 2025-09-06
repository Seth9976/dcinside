package com.unity3d.services.core.misc;

import com.unity3d.services.core.log.DeviceLog;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonFlattener {
    private final JSONObject _jsonData;

    public JsonFlattener(JSONObject jSONObject0) {
        this._jsonData = jSONObject0;
    }

    public JSONObject flattenJson(String s, JsonFlattenerRules jsonFlattenerRules0) {
        return jsonFlattenerRules0 == null ? new JSONObject() : this.flattenJson(s, jsonFlattenerRules0.getTopLevelToInclude(), jsonFlattenerRules0.getReduceKeys(), jsonFlattenerRules0.getSkipKeys());
    }

    public JSONObject flattenJson(String s, List list0, List list1, List list2) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            Iterator iterator0 = this._jsonData.keys();
            while(true) {
                if(!iterator0.hasNext()) {
                    return jSONObject0;
                }
                Object object0 = iterator0.next();
                String s1 = (String)object0;
                if(this.shouldIncludeKey(s1, list0, list2)) {
                    Object object1 = this._jsonData.opt(s1);
                    if(object1 instanceof JSONObject) {
                        new JsonFlattener(((JSONObject)object1)).flattenJson(s, s1, jSONObject0, list1, list2);
                    }
                    else {
                        jSONObject0.put(s1, object1);
                    }
                }
            }
        }
        catch(JSONException jSONException0) {
        }
        DeviceLog.error("Could not flatten JSON: %s", new Object[]{jSONException0.getMessage()});
        return jSONObject0;
    }

    public void flattenJson(String s, String s1, JSONObject jSONObject0, List list0, List list1) throws JSONException {
        Iterator iterator0 = this._jsonData.keys();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s2 = (String)object0;
            if(!list1.contains(s2)) {
                Object object1 = this._jsonData.get(s2);
                String s3 = list0.contains(s2) ? s1 : String.format("%s%s%s", s1, s, s2);
                if(object1 instanceof JSONObject) {
                    new JsonFlattener(((JSONObject)object1)).flattenJson(s, s3, jSONObject0, list0, list1);
                }
                else {
                    jSONObject0.put(s3, object1);
                }
            }
        }
    }

    private boolean shouldIncludeKey(String s, List list0, List list1) {
        if(list1.contains(s)) {
            return false;
        }
        return list0.size() > 0 ? list0.contains(s) : false;
    }
}

