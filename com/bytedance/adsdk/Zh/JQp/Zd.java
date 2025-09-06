package com.bytedance.adsdk.Zh.JQp;

import android.util.JsonReader;
import com.bytedance.adsdk.Zh.ReZ.Zh.ReZ;
import com.bytedance.adsdk.Zh.ReZ.Zh.xE;
import com.bytedance.adsdk.Zh.XX;
import java.io.IOException;
import java.util.ArrayList;

class Zd {
    static xE PjT(JsonReader jsonReader0, XX xX0) throws IOException {
        ArrayList arrayList0 = new ArrayList();
        String s = null;
        boolean z = false;
        while(jsonReader0.hasNext()) {
            String s1 = jsonReader0.nextName();
            s1.hashCode();
            switch(s1) {
                case "hd": {
                    z = jsonReader0.nextBoolean();
                    break;
                }
                case "it": {
                    jsonReader0.beginArray();
                    while(jsonReader0.hasNext()) {
                        ReZ reZ0 = Au.PjT(jsonReader0, xX0);
                        if(reZ0 != null) {
                            arrayList0.add(reZ0);
                        }
                    }
                    jsonReader0.endArray();
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
        return new xE(s, arrayList0, z);
    }
}

