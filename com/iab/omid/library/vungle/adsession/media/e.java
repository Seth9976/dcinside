package com.iab.omid.library.vungle.adsession.media;

import com.iab.omid.library.vungle.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {
    private final boolean a;
    private final Float b;
    private final boolean c;
    private final d d;

    private e(boolean z, Float float0, boolean z1, d d0) {
        this.a = z;
        this.b = float0;
        this.c = z1;
        this.d = d0;
    }

    public JSONObject a() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("skippable", this.a);
            if(this.a) {
                jSONObject0.put("skipOffset", this.b);
            }
            jSONObject0.put("autoPlay", this.c);
            jSONObject0.put("position", this.d);
            return jSONObject0;
        }
        catch(JSONException jSONException0) {
        }
        com.iab.omid.library.vungle.utils.d.b("VastProperties: JSON error", jSONException0);
        return jSONObject0;
    }

    public static e b(boolean z, d d0) {
        g.d(d0, "Position is null");
        return new e(false, null, z, d0);
    }

    public static e c(float f, boolean z, d d0) {
        g.d(d0, "Position is null");
        return new e(true, f, z, d0);
    }

    public d d() {
        return this.d;
    }

    public Float e() {
        return this.b;
    }

    public boolean f() {
        return this.c;
    }

    public boolean g() {
        return this.a;
    }
}

