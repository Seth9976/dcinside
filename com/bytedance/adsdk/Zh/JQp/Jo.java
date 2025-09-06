package com.bytedance.adsdk.Zh.JQp;

import android.util.JsonReader;
import com.bytedance.adsdk.Zh.ReZ.Zh.xs;
import com.bytedance.adsdk.Zh.XX;
import java.io.IOException;

public class Jo {
    static xs PjT(JsonReader jsonReader0, XX xX0) throws IOException {
        String s = null;
        com.bytedance.adsdk.Zh.ReZ.PjT.xs xs0 = null;
        boolean z = false;
        while(jsonReader0.hasNext()) {
            String s1 = jsonReader0.nextName();
            s1.hashCode();
            switch(s1) {
                case "hd": {
                    z = jsonReader0.nextBoolean();
                    break;
                }
                case "nm": {
                    s = jsonReader0.nextString();
                    break;
                }
                case "r": {
                    xs0 = cr.PjT(jsonReader0, xX0, true);
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        return z ? null : new xs(s, xs0);
    }
}

