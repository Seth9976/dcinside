package com.bytedance.adsdk.Zh.JQp;

import android.util.JsonReader;
import com.bytedance.adsdk.Zh.ReZ.Zh.SM.PjT;
import com.bytedance.adsdk.Zh.ReZ.Zh.SM;
import java.io.IOException;

class cRA {
    static SM PjT(JsonReader jsonReader0) throws IOException {
        String s = null;
        PjT sM$PjT0 = null;
        boolean z = false;
        while(jsonReader0.hasNext()) {
            String s1 = jsonReader0.nextName();
            s1.hashCode();
            switch(s1) {
                case "hd": {
                    z = jsonReader0.nextBoolean();
                    break;
                }
                case "mm": {
                    sM$PjT0 = PjT.PjT(jsonReader0.nextInt());
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
        return new SM(s, sM$PjT0, z);
    }
}

