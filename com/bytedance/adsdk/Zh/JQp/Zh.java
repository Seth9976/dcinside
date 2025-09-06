package com.bytedance.adsdk.Zh.JQp;

import android.util.JsonReader;
import com.bytedance.adsdk.Zh.ReZ.PjT.PjT;
import com.bytedance.adsdk.Zh.ReZ.PjT.qj;
import com.bytedance.adsdk.Zh.XX;
import java.io.IOException;

public class Zh {
    public static qj PjT(JsonReader jsonReader0, XX xX0) throws IOException {
        jsonReader0.beginObject();
        qj qj0 = null;
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            if(s.equals("a")) {
                qj0 = Zh.Zh(jsonReader0, xX0);
            }
            else {
                jsonReader0.skipValue();
            }
        }
        jsonReader0.endObject();
        return qj0 == null ? new qj(null, null, null, null) : qj0;
    }

    private static qj Zh(JsonReader jsonReader0, XX xX0) throws IOException {
        jsonReader0.beginObject();
        PjT pjT0 = null;
        PjT pjT1 = null;
        com.bytedance.adsdk.Zh.ReZ.PjT.Zh zh0 = null;
        com.bytedance.adsdk.Zh.ReZ.PjT.Zh zh1 = null;
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            switch(s) {
                case "fc": {
                    pjT0 = cr.XX(jsonReader0, xX0);
                    break;
                }
                case "sc": {
                    pjT1 = cr.XX(jsonReader0, xX0);
                    break;
                }
                case "sw": {
                    zh0 = cr.PjT(jsonReader0, xX0);
                    break;
                }
                case "t": {
                    zh1 = cr.PjT(jsonReader0, xX0);
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return new qj(pjT0, pjT1, zh0, zh1);
    }
}

