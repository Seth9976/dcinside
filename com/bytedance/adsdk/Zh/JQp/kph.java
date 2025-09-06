package com.bytedance.adsdk.Zh.JQp;

import android.util.JsonReader;
import com.bytedance.adsdk.Zh.ReZ.PjT.Zh;
import com.bytedance.adsdk.Zh.ReZ.Zh.ltE.PjT;
import com.bytedance.adsdk.Zh.ReZ.Zh.ltE;
import com.bytedance.adsdk.Zh.XX;
import java.io.IOException;

class kph {
    static ltE PjT(JsonReader jsonReader0, XX xX0) throws IOException {
        String s = null;
        PjT ltE$PjT0 = null;
        Zh zh0 = null;
        Zh zh1 = null;
        Zh zh2 = null;
        boolean z = false;
        while(jsonReader0.hasNext()) {
            String s1 = jsonReader0.nextName();
            s1.hashCode();
            switch(s1) {
                case "e": {
                    zh1 = cr.PjT(jsonReader0, xX0, false);
                    break;
                }
                case "hd": {
                    z = jsonReader0.nextBoolean();
                    break;
                }
                case "m": {
                    ltE$PjT0 = PjT.PjT(jsonReader0.nextInt());
                    break;
                }
                case "nm": {
                    s = jsonReader0.nextString();
                    break;
                }
                case "o": {
                    zh2 = cr.PjT(jsonReader0, xX0, false);
                    break;
                }
                case "s": {
                    zh0 = cr.PjT(jsonReader0, xX0, false);
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        return new ltE(s, ltE$PjT0, zh0, zh1, zh2, z);
    }
}

