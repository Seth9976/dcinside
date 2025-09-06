package com.bytedance.sdk.openadsdk.cr;

import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONObject;

public class cz extends PjT {
    public static final SimpleDateFormat ReZ;

    static {
        cz.ReZ = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
    }

    public cz(String s, JSONObject jSONObject0) {
        super(s, jSONObject0);
    }

    @Override  // com.bytedance.sdk.openadsdk.cr.PjT
    public JSONObject ReZ() {
        return this.Zh;
    }
}

