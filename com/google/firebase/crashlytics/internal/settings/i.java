package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.H;
import com.google.firebase.crashlytics.internal.g;
import org.json.JSONException;
import org.json.JSONObject;

public class i {
    private final H a;

    i(H h0) {
        this.a = h0;
    }

    private static j a(int v) {
        if(v != 3) {
            g.f().d("Could not determine SettingsJsonTransform for settings version " + v + ". Using default settings values.");
            return new b();
        }
        return new n();
    }

    public d b(JSONObject jSONObject0) throws JSONException {
        return i.a(jSONObject0.getInt("settings_version")).a(this.a, jSONObject0);
    }
}

