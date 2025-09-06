package com.bytedance.adsdk.Zh.JQp;

import android.util.JsonReader;
import com.bytedance.adsdk.Zh.ReZ.PjT.Zh;
import com.bytedance.adsdk.Zh.ReZ.Zh.xf;
import com.bytedance.adsdk.Zh.XX;
import java.io.IOException;

class ZX {
    static xf PjT(JsonReader jsonReader0, XX xX0) throws IOException {
        String s = null;
        Zh zh0 = null;
        Zh zh1 = null;
        com.bytedance.adsdk.Zh.ReZ.PjT.xf xf0 = null;
        boolean z = false;
        while(jsonReader0.hasNext()) {
            String s1 = jsonReader0.nextName();
            s1.hashCode();
            switch(s1) {
                case "c": {
                    zh0 = cr.PjT(jsonReader0, xX0, false);
                    break;
                }
                case "hd": {
                    z = jsonReader0.nextBoolean();
                    break;
                }
                case "nm": {
                    s = jsonReader0.nextString();
                    break;
                }
                case "o": {
                    zh1 = cr.PjT(jsonReader0, xX0, false);
                    break;
                }
                case "tr": {
                    xf0 = ReZ.PjT(jsonReader0, xX0);
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        return new xf(s, zh0, zh1, xf0, z);
    }
}

