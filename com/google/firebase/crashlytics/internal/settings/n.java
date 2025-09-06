package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.H;
import org.json.JSONException;
import org.json.JSONObject;

class n implements j {
    @Override  // com.google.firebase.crashlytics.internal.settings.j
    public d a(H h0, JSONObject jSONObject0) throws JSONException {
        int v = jSONObject0.optInt("settings_version", 0);
        int v1 = jSONObject0.optInt("cache_duration", 3600);
        double f = jSONObject0.optDouble("on_demand_upload_rate_per_minute", 10.0);
        double f1 = jSONObject0.optDouble("on_demand_backoff_base", 1.2);
        int v2 = jSONObject0.optInt("on_demand_backoff_step_duration_seconds", 60);
        b d$b0 = jSONObject0.has("session") ? n.c(jSONObject0.getJSONObject("session")) : n.c(new JSONObject());
        a d$a0 = n.b(jSONObject0.getJSONObject("features"));
        return new d(n.d(h0, ((long)v1), jSONObject0), d$b0, d$a0, v, v1, f, f1, v2);
    }

    private static a b(JSONObject jSONObject0) {
        return new a(jSONObject0.optBoolean("collect_reports", true), jSONObject0.optBoolean("collect_anrs", false), jSONObject0.optBoolean("collect_build_ids", false));
    }

    private static b c(JSONObject jSONObject0) {
        return new b(jSONObject0.optInt("max_custom_exception_events", 8), 4);
    }

    // 去混淆评级： 低(20)
    private static long d(H h0, long v, JSONObject jSONObject0) {
        return jSONObject0.has("expires_at") ? jSONObject0.optLong("expires_at") : h0.a() + v * 1000L;
    }
}

