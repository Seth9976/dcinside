package com.iab.omid.library.unity3d.adsession;

import com.iab.omid.library.unity3d.utils.c;
import com.iab.omid.library.unity3d.utils.g;
import java.net.URL;
import org.json.JSONObject;

public final class o {
    private final String a;
    private final URL b;
    private final String c;

    private o(String s, URL uRL0, String s1) {
        this.a = s;
        this.b = uRL0;
        this.c = s1;
    }

    public static o a(String s, URL uRL0, String s1) {
        g.f(s, "VendorKey is null or empty");
        g.d(uRL0, "ResourceURL is null");
        g.f(s1, "VerificationParameters is null or empty");
        return new o(s, uRL0, s1);
    }

    public static o b(URL uRL0) {
        g.d(uRL0, "ResourceURL is null");
        return new o(null, uRL0, null);
    }

    public URL c() {
        return this.b;
    }

    public String d() {
        return this.a;
    }

    public String e() {
        return this.c;
    }

    public JSONObject f() {
        JSONObject jSONObject0 = new JSONObject();
        c.i(jSONObject0, "vendorKey", this.a);
        c.i(jSONObject0, "resourceUrl", this.b.toString());
        c.i(jSONObject0, "verificationParameters", this.c);
        return jSONObject0;
    }
}

