package com.bytedance.sdk.openadsdk.tool;

import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.FilterWord;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PjT {
    private static FilterWord PjT(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return null;
        }
        try {
            FilterWord filterWord0 = new FilterWord();
            filterWord0.setId(jSONObject0.optString("id"));
            filterWord0.setName(jSONObject0.optString("name"));
            filterWord0.setIsSelected(jSONObject0.optBoolean("is_selected"));
            JSONArray jSONArray0 = jSONObject0.optJSONArray("options");
            if(jSONArray0 != null && jSONArray0.length() > 0) {
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    FilterWord filterWord1 = PjT.PjT(jSONArray0.optJSONObject(v));
                    if(filterWord1 != null && filterWord1.isValid()) {
                        filterWord0.addOption(filterWord1);
                    }
                }
            }
            return filterWord0;
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public static String PjT(List list0) {
        if(list0 != null) {
            JSONArray jSONArray0 = new JSONArray();
            for(Object object0: list0) {
                JSONObject jSONObject0 = PjT.PjT(((FilterWord)object0));
                if(jSONObject0 != null) {
                    jSONArray0.put(jSONObject0);
                }
            }
            return jSONArray0.toString();
        }
        return null;
    }

    public static List PjT(String s) {
        List list0 = new ArrayList();
        try {
            JSONArray jSONArray0 = new JSONArray(s);
            for(int v = 0; v < jSONArray0.length(); ++v) {
                FilterWord filterWord0 = PjT.PjT(jSONArray0.optJSONObject(v));
                if(filterWord0 != null && filterWord0.isValid()) {
                    list0.add(filterWord0);
                }
            }
        }
        catch(JSONException jSONException0) {
            RD.Zh("MaterialMetaTools", jSONException0.getMessage());
        }
        return list0;
    }

    private static JSONObject PjT(FilterWord filterWord0) {
        if(filterWord0 == null) {
            return null;
        }
        try {
            if(filterWord0.isValid()) {
                JSONObject jSONObject0 = new JSONObject();
                jSONObject0.put("id", filterWord0.getId());
                jSONObject0.put("name", filterWord0.getName());
                jSONObject0.put("is_selected", filterWord0.getIsSelected());
                if(filterWord0.hasSecondOptions()) {
                    JSONArray jSONArray0 = new JSONArray();
                    for(Object object0: filterWord0.getOptions()) {
                        jSONArray0.put(PjT.PjT(((FilterWord)object0)));
                    }
                    if(jSONArray0.length() > 0) {
                        jSONObject0.put("options", jSONArray0);
                    }
                }
                return jSONObject0;
            }
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }
}

