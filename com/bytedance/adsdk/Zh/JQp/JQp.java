package com.bytedance.adsdk.Zh.JQp;

import android.util.JsonReader;
import com.bytedance.adsdk.Zh.ReZ.Zh.PjT;
import com.bytedance.adsdk.Zh.XX;
import java.io.IOException;

class JQp {
    static PjT PjT(JsonReader jsonReader0, XX xX0) throws IOException {
        PjT pjT0 = null;
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            if(s.equals("ef")) {
                jsonReader0.beginArray();
                while(jsonReader0.hasNext()) {
                    PjT pjT1 = JQp.Zh(jsonReader0, xX0);
                    if(pjT1 != null) {
                        pjT0 = pjT1;
                    }
                }
                jsonReader0.endArray();
            }
            else {
                jsonReader0.skipValue();
            }
        }
        return pjT0;
    }

    private static PjT Zh(JsonReader jsonReader0, XX xX0) throws IOException {
        boolean z;
        jsonReader0.beginObject();
        PjT pjT0 = null;
        do {
            z = false;
        label_3:
            if(!jsonReader0.hasNext()) {
                jsonReader0.endObject();
                return pjT0;
            }
            String s = jsonReader0.nextName();
            s.hashCode();
            if(s.equals("v")) {
                goto label_13;
            }
            if(!s.equals("ty")) {
                jsonReader0.skipValue();
                goto label_3;
            }
        }
        while(jsonReader0.nextInt() != 0);
        z = true;
        goto label_3;
    label_13:
        if(z) {
            pjT0 = new PjT(cr.PjT(jsonReader0, xX0));
        }
        else {
            jsonReader0.skipValue();
        }
        goto label_3;
    }
}

