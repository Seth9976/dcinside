package com.bytedance.adsdk.Zh.JQp;

import android.util.JsonReader;
import com.bytedance.adsdk.Zh.ReZ.ReZ;
import java.io.IOException;

class fDm {
    static ReZ PjT(JsonReader jsonReader0) throws IOException {
        jsonReader0.beginObject();
        String s = null;
        String s1 = null;
        String s2 = null;
        float f = 0.0f;
        while(jsonReader0.hasNext()) {
            String s3 = jsonReader0.nextName();
            s3.hashCode();
            switch(s3) {
                case "ascent": {
                    f = (float)jsonReader0.nextDouble();
                    break;
                }
                case "fFamily": {
                    s = jsonReader0.nextString();
                    break;
                }
                case "fName": {
                    s1 = jsonReader0.nextString();
                    break;
                }
                case "fStyle": {
                    s2 = jsonReader0.nextString();
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return new ReZ(s, s1, s2, f);
    }
}

