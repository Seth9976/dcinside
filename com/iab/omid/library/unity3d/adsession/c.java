package com.iab.omid.library.unity3d.adsession;

import com.iab.omid.library.unity3d.utils.g;
import org.json.JSONObject;

public class c {
    private final l a;
    private final l b;
    private final boolean c;
    private final f d;
    private final j e;

    private c(f f0, j j0, l l0, l l1, boolean z) {
        this.d = f0;
        this.e = j0;
        this.a = l0;
        this.b = l1 == null ? l.d : l1;
        this.c = z;
    }

    public static c a(f f0, j j0, l l0, l l1, boolean z) {
        g.d(f0, "CreativeType is null");
        g.d(j0, "ImpressionType is null");
        g.d(l0, "Impression owner is null");
        g.b(l0, f0, j0);
        return new c(f0, j0, l0, l1, z);
    }

    public boolean b() {
        return l.b == this.a;
    }

    public boolean c() {
        return l.b == this.b;
    }

    public JSONObject d() {
        JSONObject jSONObject0 = new JSONObject();
        com.iab.omid.library.unity3d.utils.c.i(jSONObject0, "impressionOwner", this.a);
        com.iab.omid.library.unity3d.utils.c.i(jSONObject0, "mediaEventsOwner", this.b);
        com.iab.omid.library.unity3d.utils.c.i(jSONObject0, "creativeType", this.d);
        com.iab.omid.library.unity3d.utils.c.i(jSONObject0, "impressionType", this.e);
        com.iab.omid.library.unity3d.utils.c.i(jSONObject0, "isolateVerificationScripts", Boolean.valueOf(this.c));
        return jSONObject0;
    }
}

