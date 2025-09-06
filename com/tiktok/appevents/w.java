package com.tiktok.appevents;

import java.math.BigDecimal;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class w {
    static final String a = "com.tiktok.appevents.w";

    static {
    }

    private static JSONObject a(String s, JSONObject jSONObject0) throws JSONException {
        double f;
        JSONObject jSONObject1 = new JSONObject();
        JSONObject jSONObject2 = new JSONObject().put("content_id", s);
        if(jSONObject0 != null) {
            jSONObject2.put("content_type", w.c(jSONObject0, "type"));
            jSONObject1.put("currency", w.c(jSONObject0, "price_currency_code"));
            jSONObject2.put("quantity", 1);
            try {
                f = 0.0;
                f = new BigDecimal(((double)jSONObject0.optLong("price_amount_micros", 0L)) / 1000000.0).doubleValue();
            }
            catch(Exception unused_ex) {
            }
            jSONObject2.put("price", f);
            jSONObject1.put("value", f);
        }
        jSONObject1.put("contents", new JSONArray().put(jSONObject2));
        return jSONObject1;
    }

    static JSONObject b(x x0) {
        try {
            JSONObject jSONObject0 = w.a(x0.b().getString("productId"), x0.c());
            if(x0.d() && jSONObject0 != null) {
                jSONObject0.putOpt("type", "auto");
                jSONObject0.putOpt("order_id", x0.b().optString("orderId"));
                return jSONObject0;
            }
            return jSONObject0;
        }
        catch(JSONException jSONException0) {
            u.b("com.tiktok.appevents.w", jSONException0, 2);
            return null;
        }
    }

    private static String c(JSONObject jSONObject0, String s) {
        try {
            return jSONObject0.get(s).toString();
        }
        catch(JSONException unused_ex) {
            return "";
        }
    }
}

