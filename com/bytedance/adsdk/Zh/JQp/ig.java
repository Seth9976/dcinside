package com.bytedance.adsdk.Zh.JQp;

import android.util.JsonReader;
import com.bytedance.adsdk.Zh.ReZ.PjT.Au;
import com.bytedance.adsdk.Zh.ReZ.Zh.ub;
import com.bytedance.adsdk.Zh.XX;
import java.io.IOException;

class ig {
    static ub PjT(JsonReader jsonReader0, XX xX0) throws IOException {
        String s = null;
        Au au0 = null;
        int v = 0;
        boolean z = false;
        while(jsonReader0.hasNext()) {
            String s1 = jsonReader0.nextName();
            s1.hashCode();
            switch(s1) {
                case "hd": {
                    z = jsonReader0.nextBoolean();
                    break;
                }
                case "ind": {
                    v = jsonReader0.nextInt();
                    break;
                }
                case "ks": {
                    au0 = cr.JQp(jsonReader0, xX0);
                    break;
                }
                case "nm": {
                    s = jsonReader0.nextString();
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        return new ub(s, v, au0, z);
    }
}

