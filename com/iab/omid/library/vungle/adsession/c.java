package com.iab.omid.library.vungle.adsession;

import com.iab.omid.library.vungle.utils.g;
import org.json.JSONObject;

public class c {
    private final m a;
    private final m b;
    private final boolean c;
    private final f d;
    private final j e;

    private c(f f0, j j0, m m0, m m1, boolean z) {
        this.d = f0;
        this.e = j0;
        this.a = m0;
        this.b = m1 == null ? m.d : m1;
        this.c = z;
    }

    public static c a(f f0, j j0, m m0, m m1, boolean z) {
        g.d(f0, "CreativeType is null");
        g.d(j0, "ImpressionType is null");
        g.d(m0, "Impression owner is null");
        g.b(m0, f0, j0);
        return new c(f0, j0, m0, m1, z);
    }

    public boolean b() {
        return m.b == this.a;
    }

    public boolean c() {
        return m.b == this.b;
    }

    public JSONObject d() {
        JSONObject jSONObject0 = new JSONObject();
        com.iab.omid.library.vungle.utils.c.i(jSONObject0, "impressionOwner", this.a);
        com.iab.omid.library.vungle.utils.c.i(jSONObject0, "mediaEventsOwner", this.b);
        com.iab.omid.library.vungle.utils.c.i(jSONObject0, "creativeType", this.d);
        com.iab.omid.library.vungle.utils.c.i(jSONObject0, "impressionType", this.e);
        com.iab.omid.library.vungle.utils.c.i(jSONObject0, "isolateVerificationScripts", Boolean.valueOf(this.c));
        return jSONObject0;
    }
}

