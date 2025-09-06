package com.bytedance.adsdk.ugeno.PjT;

import android.text.TextUtils;
import android.util.Pair;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

public class ReZ {
    public static int PjT(int v) {
        if(v < 0) {
            return -1;
        }
        return v == 0 ? 1 : v - 1;
    }

    public static int PjT(String s) {
        return s.hashCode() != -1408024454 || !s.equals("alternate") ? 1 : 2;
    }

    public static int PjT(String s, int v) {
        if(TextUtils.isEmpty(s)) {
            return v / 2;
        }
        s.hashCode();
        switch(s) {
            case "bottom": {
                return v;
            }
            case "center": {
                return v / 2;
            }
            case "left": {
                return 0;
            }
            case "right": {
                return v;
            }
            case "top": {
                return 0;
            }
            default: {
                if(s.endsWith("%")) {
                    try {
                        return (int)(((float)v) * Float.parseFloat(s.substring(0, s.length() - 1)) / 100.0f);
                    }
                    catch(NumberFormatException unused_ex) {
                        return v / 2;
                    }
                }
                try {
                    return Integer.parseInt(s);
                }
                catch(NumberFormatException unused_ex) {
                    return v / 2;
                }
            }
        }
    }

    public static Zh PjT(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return null;
        }
        Zh zh0 = new Zh();
        zh0.Zh(jSONObject0.optLong("delay"));
        zh0.PjT(jSONObject0.optLong("duration"));
        zh0.PjT(jSONObject0.optInt("playCount", 1));
        zh0.PjT(jSONObject0.optString("playDirection"));
        zh0.PjT(ReZ.cr(jSONObject0.optString("transformOrigin")));
        zh0.Zh(jSONObject0.optString("timingFunction", "linear"));
        zh0.PjT(jSONObject0.optJSONObject("effect"));
        zh0.PjT(ReZ.PjT(jSONObject0.optJSONArray("keyframes")));
        return zh0;
    }

    public static Map PjT(JSONArray jSONArray0) {
        if(jSONArray0 != null && jSONArray0.length() > 0) {
            Map map0 = new HashMap();
            for(int v = 0; v < jSONArray0.length(); ++v) {
                JSONObject jSONObject0 = jSONArray0.optJSONObject(v);
                if(jSONObject0 != null) {
                    float f = (float)jSONObject0.optDouble("offset");
                    Iterator iterator0 = jSONObject0.keys();
                    while(iterator0.hasNext()) {
                        Object object0 = iterator0.next();
                        String s = (String)object0;
                        TreeMap treeMap0 = (TreeMap)map0.get(s);
                        if(TextUtils.equals(s, "offset")) {
                        }
                        else if(map0.containsKey(s) && treeMap0 != null) {
                            treeMap0.put(f, jSONObject0.optString(s));
                        }
                        else {
                            TreeMap treeMap1 = new TreeMap();
                            new Pair(f, jSONObject0.optString(s));
                            treeMap1.put(f, jSONObject0.optString(s));
                            map0.put(s, treeMap1);
                        }
                    }
                }
            }
            return map0;
        }
        return null;
    }

    public static float[] ReZ(String s) {
        float[] arr_f = {0.0f, 0.0f};
        JSONArray jSONArray0 = com.bytedance.adsdk.ugeno.XX.Zh.PjT(s, null);
        if(jSONArray0 != null && jSONArray0.length() == 2) {
            arr_f[0] = (float)jSONArray0.optDouble(0);
            arr_f[1] = (float)jSONArray0.optDouble(1);
        }
        return arr_f;
    }

    public static Interpolator Zh(String s) {
        switch(s) {
            case "ease_in": {
                return new AccelerateInterpolator();
            }
            case "ease_in_out": {
                return new AccelerateDecelerateInterpolator();
            }
            case "ease_out": {
                return new DecelerateInterpolator();
            }
            case "linear": {
                return new LinearInterpolator();
            }
            default: {
                return new LinearInterpolator();
            }
        }
    }

    public static PjT cr(String s) {
        if(TextUtils.isEmpty(s)) {
            return null;
        }
        JSONArray jSONArray0 = com.bytedance.adsdk.ugeno.XX.Zh.PjT(s, null);
        if(jSONArray0 != null && jSONArray0.length() == 2) {
            PjT zh$PjT0 = new PjT();
            zh$PjT0.PjT = jSONArray0.optString(0);
            zh$PjT0.Zh = jSONArray0.optString(1);
            return zh$PjT0;
        }
        return null;
    }
}

