package com.bytedance.adsdk.Zh.JQp;

import android.util.JsonReader;
import com.bytedance.adsdk.Zh.ReZ.PjT.Zh;
import com.bytedance.adsdk.Zh.ReZ.PjT.xs;
import com.bytedance.adsdk.Zh.ReZ.Zh.qj;
import com.bytedance.adsdk.Zh.XX;
import java.io.IOException;

class Qf {
    static qj PjT(JsonReader jsonReader0, XX xX0) throws IOException {
        String s = null;
        xs xs0 = null;
        xs xs1 = null;
        Zh zh0 = null;
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
                case "p": {
                    xs0 = PjT.Zh(jsonReader0, xX0);
                    break;
                }
                case "r": {
                    zh0 = cr.PjT(jsonReader0, xX0);
                    break;
                }
                case "s": {
                    xs1 = cr.ReZ(jsonReader0, xX0);
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        return new qj(s, xs0, xs1, zh0, z);
    }
}

