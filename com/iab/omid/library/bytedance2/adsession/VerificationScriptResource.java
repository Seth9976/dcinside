package com.iab.omid.library.bytedance2.adsession;

import com.iab.omid.library.bytedance2.utils.c;
import com.iab.omid.library.bytedance2.utils.g;
import java.net.URL;
import org.json.JSONObject;

public final class VerificationScriptResource {
    private final URL resourceUrl;
    private final String vendorKey;
    private final String verificationParameters;

    private VerificationScriptResource(String s, URL uRL0, String s1) {
        this.vendorKey = s;
        this.resourceUrl = uRL0;
        this.verificationParameters = s1;
    }

    public static VerificationScriptResource createVerificationScriptResourceWithParameters(String s, URL uRL0, String s1) {
        g.a(s, "VendorKey is null or empty");
        g.a(uRL0, "ResourceURL is null");
        g.a(s1, "VerificationParameters is null or empty");
        return new VerificationScriptResource(s, uRL0, s1);
    }

    public static VerificationScriptResource createVerificationScriptResourceWithoutParameters(URL uRL0) {
        g.a(uRL0, "ResourceURL is null");
        return new VerificationScriptResource(null, uRL0, null);
    }

    public URL getResourceUrl() {
        return this.resourceUrl;
    }

    public String getVendorKey() {
        return this.vendorKey;
    }

    public String getVerificationParameters() {
        return this.verificationParameters;
    }

    public JSONObject toJsonObject() {
        JSONObject jSONObject0 = new JSONObject();
        c.a(jSONObject0, "vendorKey", this.vendorKey);
        c.a(jSONObject0, "resourceUrl", this.resourceUrl.toString());
        c.a(jSONObject0, "verificationParameters", this.verificationParameters);
        return jSONObject0;
    }
}

