package com.iab.omid.library.bytedance2.adsession.media;

import com.iab.omid.library.bytedance2.utils.d;
import com.iab.omid.library.bytedance2.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

public final class VastProperties {
    private final boolean a;
    private final Float b;
    private final boolean c;
    private final Position d;

    private VastProperties(boolean z, Float float0, boolean z1, Position position0) {
        this.a = z;
        this.b = float0;
        this.c = z1;
        this.d = position0;
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
        }
        catch(JSONException jSONException0) {
            d.a("VastProperties: JSON error", jSONException0);
        }
        return jSONObject0;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z, Position position0) {
        g.a(position0, "Position is null");
        return new VastProperties(false, null, z, position0);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f, boolean z, Position position0) {
        g.a(position0, "Position is null");
        return new VastProperties(true, f, z, position0);
    }

    public Position getPosition() {
        return this.d;
    }

    public Float getSkipOffset() {
        return this.b;
    }

    public boolean isAutoPlay() {
        return this.c;
    }

    public boolean isSkippable() {
        return this.a;
    }
}

