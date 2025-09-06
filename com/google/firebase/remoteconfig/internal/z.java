package com.google.firebase.remoteconfig.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.firebase.analytics.connector.a;
import h2.b;
import j..util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class z {
    private final b a;
    private final Map b;
    public static final String c = "fp";
    public static final String d = "personalization_assignment";
    public static final String e = "arm_key";
    public static final String f = "arm_value";
    public static final String g = "personalizationId";
    public static final String h = "personalization_id";
    public static final String i = "armIndex";
    public static final String j = "arm_index";
    public static final String k = "group";
    public static final String l = "group";
    public static final String m = "_fpc";
    public static final String n = "choiceId";
    public static final String o = "_fpid";

    public z(b b0) {
        this.b = DesugarCollections.synchronizedMap(new HashMap());
        this.a = b0;
    }

    public void a(@NonNull String s, @NonNull h h0) {
        a a0 = (a)this.a.get();
        if(a0 == null) {
            return;
        }
        JSONObject jSONObject0 = h0.i();
        if(jSONObject0.length() < 1) {
            return;
        }
        JSONObject jSONObject1 = h0.g();
        if(jSONObject1.length() < 1) {
            return;
        }
        JSONObject jSONObject2 = jSONObject0.optJSONObject(s);
        if(jSONObject2 == null) {
            return;
        }
        String s1 = jSONObject2.optString("choiceId");
        if(s1.isEmpty()) {
            return;
        }
        synchronized(this.b) {
            if(s1.equals(this.b.get(s))) {
                return;
            }
            this.b.put(s, s1);
        }
        Bundle bundle0 = new Bundle();
        bundle0.putString("arm_key", s);
        bundle0.putString("arm_value", jSONObject1.optString(s));
        bundle0.putString("personalization_id", jSONObject2.optString("personalizationId"));
        bundle0.putInt("arm_index", jSONObject2.optInt("armIndex", -1));
        bundle0.putString("group", jSONObject2.optString("group"));
        a0.a("fp", "personalization_assignment", bundle0);
        Bundle bundle1 = new Bundle();
        bundle1.putString("_fpid", s1);
        a0.a("fp", "_fpc", bundle1);
    }
}

