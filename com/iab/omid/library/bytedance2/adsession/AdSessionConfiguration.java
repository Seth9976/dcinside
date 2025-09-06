package com.iab.omid.library.bytedance2.adsession;

import com.iab.omid.library.bytedance2.utils.c;
import com.iab.omid.library.bytedance2.utils.g;
import org.json.JSONObject;

public class AdSessionConfiguration {
    private final CreativeType creativeType;
    private final Owner impressionOwner;
    private final ImpressionType impressionType;
    private final boolean isolateVerificationScripts;
    private final Owner mediaEventsOwner;

    private AdSessionConfiguration(CreativeType creativeType0, ImpressionType impressionType0, Owner owner0, Owner owner1, boolean z) {
        this.creativeType = creativeType0;
        this.impressionType = impressionType0;
        this.impressionOwner = owner0;
        this.mediaEventsOwner = owner1 == null ? Owner.NONE : owner1;
        this.isolateVerificationScripts = z;
    }

    public static AdSessionConfiguration createAdSessionConfiguration(CreativeType creativeType0, ImpressionType impressionType0, Owner owner0, Owner owner1, boolean z) {
        g.a(creativeType0, "CreativeType is null");
        g.a(impressionType0, "ImpressionType is null");
        g.a(owner0, "Impression owner is null");
        g.a(owner0, creativeType0, impressionType0);
        return new AdSessionConfiguration(creativeType0, impressionType0, owner0, owner1, z);
    }

    public boolean isNativeImpressionOwner() {
        return Owner.NATIVE == this.impressionOwner;
    }

    public boolean isNativeMediaEventsOwner() {
        return Owner.NATIVE == this.mediaEventsOwner;
    }

    public JSONObject toJsonObject() {
        JSONObject jSONObject0 = new JSONObject();
        c.a(jSONObject0, "impressionOwner", this.impressionOwner);
        c.a(jSONObject0, "mediaEventsOwner", this.mediaEventsOwner);
        c.a(jSONObject0, "creativeType", this.creativeType);
        c.a(jSONObject0, "impressionType", this.impressionType);
        c.a(jSONObject0, "isolateVerificationScripts", Boolean.valueOf(this.isolateVerificationScripts));
        return jSONObject0;
    }
}

