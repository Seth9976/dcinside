package com.bytedance.sdk.openadsdk.core.DWo;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.DWo.PjT.Zh;
import com.bytedance.sdk.openadsdk.core.SM;
import com.bytedance.sdk.openadsdk.core.model.Owx.PjT;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.xf;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ReZ {
    private static String PjT = "";

    static {
    }

    // 去混淆评级： 低(20)
    public static String PjT() [...] // 潜在的解密器

    public static JSONObject PjT(Owx owx0, com.bytedance.sdk.openadsdk.core.DWo.cz.ReZ reZ0) {
        JSONObject jSONObject1;
        reZ0.PjT("ad");
        String s = "";
        ReZ.PjT = "";
        JSONObject jSONObject0 = null;
        try {
            PjT owx$PjT0 = owx0.VY();
            if(owx$PjT0 != null) {
                s = owx$PjT0.ub();
                if(TextUtils.isEmpty(s) && !TextUtils.isEmpty(owx$PjT0.xE()) && !TextUtils.isEmpty(owx$PjT0.cz())) {
                    s = Zh.PjT().PjT("ad", owx$PjT0.cz(), owx$PjT0.xE());
                }
            }
            if(TextUtils.isEmpty(s)) {
                String s1 = "local data is null id is " + owx$PjT0.cz() + " md5 is " + owx$PjT0.xE();
                ReZ.PjT = s1;
                reZ0.PjT(3, s1, "net");
                return null;
            }
            try {
                jSONObject1 = null;
                jSONObject1 = new JSONObject(s);
                goto label_19;
            }
            catch(JSONException unused_ex) {
                goto label_22;
            }
        }
        catch(Throwable throwable0) {
        }
        goto label_28;
        try {
            try {
            label_19:
                ReZ.PjT = "getTemplate success";
                reZ0.Zh("local");
                return jSONObject1;
            }
            catch(JSONException unused_ex) {
            label_22:
                ReZ.PjT = "parse json exception data is " + s;
                reZ0.PjT(2, "parse json exception data is " + s, "local");
                return null;
            }
        }
        catch(Throwable throwable1) {
            jSONObject0 = jSONObject1;
            throwable0 = throwable1;
        }
    label_28:
        String s2 = "get template error " + throwable0.getMessage();
        ReZ.PjT = s2;
        reZ0.PjT(2, s2, "local");
        return jSONObject0;
    }

    public static JSONObject PjT(Owx owx0, String s) {
        JSONObject jSONObject0 = owx0.dDm();
        try {
            jSONObject0.put("show_dislike", owx0.jp());
            jSONObject0.put("language", xf.Zh());
            if("open_ad".equals(s)) {
                JSONObject jSONObject1 = new JSONObject();
                SM.Zh().SM();
                jSONObject1.put("app_name", "");
                jSONObject1.put("app_icon_id", "@0");
                jSONObject0.put("open_app_info", jSONObject1);
            }
            jSONObject0.put("os", "Android");
            JSONArray jSONArray0 = ReZ.ReZ(owx0);
            if(jSONArray0 != null) {
                jSONObject0.put("dpa_data", jSONArray0);
                return jSONObject0;
            }
        }
        catch(Throwable throwable0) {
            RD.Zh("UgenUtils", new Object[]{"parseUGenDataInfo exception", throwable0.getMessage()});
        }
        return jSONObject0;
    }

    public static boolean PjT(int v) {
        return v == 9 || v == 10;
    }

    public static boolean PjT(Owx owx0) {
        return owx0 == null ? false : owx0.ZX() == 7;
    }

    private static JSONArray ReZ(Owx owx0) {
        JSONArray jSONArray2;
        JSONArray jSONArray1;
        try {
            PjT owx$PjT0 = owx0.VY();
            if(owx$PjT0 != null) {
                JSONObject jSONObject0 = new JSONObject(owx$PjT0.qj());
                JSONObject jSONObject1 = new JSONObject();
                jSONObject1.putOpt("original_price", jSONObject0.optDouble("original_price", 0.0));
                jSONObject1.putOpt("price_unit", jSONObject0.optString("price_unit"));
                jSONObject1.putOpt("discount", jSONObject0.optDouble("discount", 0.0));
                jSONObject1.putOpt("product_name", jSONObject0.optString("dpa_product_name"));
                jSONObject1.putOpt("description", jSONObject0.optString("dpa_description"));
                JSONArray jSONArray0 = jSONObject0.optJSONArray("dpa_images");
                if(jSONArray0 != null && jSONArray0.length() > 0) {
                    jSONObject1.putOpt("image", jSONArray0.get(0));
                }
                jSONObject1.putOpt("brand_name", jSONObject0.optString("dpa_brand_name"));
                jSONObject1.putOpt("sale_price_i18n", jSONObject0.optInt("sale_price_i18n"));
                jSONObject1.putOpt("real_price", jSONObject0.optDouble("real_price", 0.0));
                jSONObject1.put("button_text", owx0.Nv());
                jSONArray1 = new JSONArray();
                jSONArray2 = jSONObject0.optJSONArray("dpa_related_products");
                if(jSONArray2 != null) {
                    jSONArray1.put(jSONObject1);
                    goto label_21;
                }
                return jSONArray1;
            }
        }
        catch(Throwable unused_ex) {
        }
        return null;
        try {
            for(int v = 0; true; ++v) {
            label_21:
                if(v >= jSONArray2.length()) {
                    return jSONArray1;
                }
                JSONObject jSONObject2 = jSONArray2.getJSONObject(v);
                jSONObject2.put("button_text", owx0.Nv());
                jSONArray1.put(jSONObject2);
            }
        }
        catch(Throwable unused_ex) {
            try {
                return jSONArray1;
            }
            catch(Throwable unused_ex) {
            }
            return null;
        }
    }

    public static boolean Zh(Owx owx0) {
        return owx0 == null ? false : owx0.ZX() == 10;
    }
}

