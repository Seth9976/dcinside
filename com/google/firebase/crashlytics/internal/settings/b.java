package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.H;
import org.json.JSONObject;

class b implements j {
    @Override  // com.google.firebase.crashlytics.internal.settings.j
    public d a(H h0, JSONObject jSONObject0) {
        return b.b(h0);
    }

    static d b(H h0) {
        com.google.firebase.crashlytics.internal.settings.d.b d$b0 = new com.google.firebase.crashlytics.internal.settings.d.b(8, 4);
        a d$a0 = new a(true, false, false);
        return new d(h0.a() + 3600000L, d$b0, d$a0, 0, 3600, 10.0, 1.2, 60);
    }
}

