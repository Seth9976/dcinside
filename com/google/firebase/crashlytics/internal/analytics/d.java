package com.google.firebase.crashlytics.internal.analytics;

import V1.a;
import V1.b;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.g;
import org.json.JSONException;
import org.json.JSONObject;

public class d implements b, com.google.firebase.crashlytics.internal.analytics.b {
    @Nullable
    private a a;
    private static final String b = "name";
    private static final String c = "parameters";
    private static final String d = "$A$:";

    @Override  // com.google.firebase.crashlytics.internal.analytics.b
    public void B(@NonNull String s, @NonNull Bundle bundle0) {
        a a0 = this.a;
        if(a0 != null) {
            try {
                a0.a("$A$:" + d.b(s, bundle0));
            }
            catch(JSONException unused_ex) {
                g.f().m("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }

    @Override  // V1.b
    public void a(@Nullable a a0) {
        this.a = a0;
        g.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @NonNull
    private static String b(@NonNull String s, @NonNull Bundle bundle0) throws JSONException {
        JSONObject jSONObject0 = new JSONObject();
        JSONObject jSONObject1 = new JSONObject();
        for(Object object0: bundle0.keySet()) {
            jSONObject1.put(((String)object0), bundle0.get(((String)object0)));
        }
        jSONObject0.put("name", s);
        jSONObject0.put("parameters", jSONObject1);
        return jSONObject0.toString();
    }
}

