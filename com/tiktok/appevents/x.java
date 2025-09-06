package com.tiktok.appevents;

import org.json.JSONObject;

public class x {
    public static class a extends Exception {
        public a(String s) {
            super(s);
        }
    }

    private final JSONObject a;
    private final JSONObject b;
    private String c;
    private boolean d;

    public x(JSONObject jSONObject0, JSONObject jSONObject1) throws a {
        if(!this.e(jSONObject0)) {
            throw new a("Not a valid purchase object");
        }
        if(!this.f(jSONObject1)) {
            throw new a("Not a valid skuDetails Object");
        }
        if(!jSONObject0.optString("productId").equals(jSONObject1.optString("productId"))) {
            throw new a("Product Id does not match");
        }
        this.a = jSONObject0;
        this.b = jSONObject1;
    }

    public x(JSONObject jSONObject0, JSONObject jSONObject1, String s) throws a {
        this(jSONObject0, jSONObject1);
        this.c = s;
    }

    public String a() {
        return this.c;
    }

    public JSONObject b() {
        return this.a;
    }

    public JSONObject c() {
        return this.b;
    }

    public boolean d() {
        return this.d;
    }

    // 去混淆评级： 低(20)
    private boolean e(JSONObject jSONObject0) {
        return !jSONObject0.isNull("orderId") && !jSONObject0.isNull("productId");
    }

    // 去混淆评级： 低(20)
    private boolean f(JSONObject jSONObject0) {
        return !jSONObject0.isNull("price") && !jSONObject0.isNull("productId");
    }

    public void g(boolean z) {
        this.d = z;
    }
}

