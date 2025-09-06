package com.bytedance.adsdk.Zh.JQp;

import android.util.JsonReader;
import com.bytedance.adsdk.Zh.ReZ.PjT.xs;
import com.bytedance.adsdk.Zh.ReZ.Zh.Zh;
import com.bytedance.adsdk.Zh.XX;
import java.io.IOException;

class cz {
    static Zh PjT(JsonReader jsonReader0, XX xX0, int v) throws IOException {
        boolean z = v == 3;
        String s = null;
        xs xs0 = null;
        com.bytedance.adsdk.Zh.ReZ.PjT.cz cz0 = null;
        boolean z1 = false;
        while(jsonReader0.hasNext()) {
            String s1 = jsonReader0.nextName();
            s1.hashCode();
            switch(s1) {
                case "d": {
                    if(jsonReader0.nextInt() == 3) {
                        z = true;
                        continue;
                    }
                    else {
                        z = false;
                        break;
                    }
                    xs0 = PjT.Zh(jsonReader0, xX0);
                    break;
                }
                case "hd": {
                    z1 = jsonReader0.nextBoolean();
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
                case "s": {
                    cz0 = cr.ReZ(jsonReader0, xX0);
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        return new Zh(s, xs0, cz0, z, z1);
    }
}

