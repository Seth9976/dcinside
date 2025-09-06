package com.bytedance.adsdk.Zh.JQp;

import android.util.JsonReader;
import com.bytedance.adsdk.Zh.ReZ.Zh.xE;
import com.bytedance.adsdk.Zh.ReZ.cr;
import com.bytedance.adsdk.Zh.XX;
import java.io.IOException;
import java.util.ArrayList;

class xs {
    static cr PjT(JsonReader jsonReader0, XX xX0) throws IOException {
        ArrayList arrayList0 = new ArrayList();
        jsonReader0.beginObject();
        double f = 0.0;
        String s = null;
        String s1 = null;
        double f1 = 0.0;
        int v = 0;
        while(jsonReader0.hasNext()) {
            String s2 = jsonReader0.nextName();
            s2.hashCode();
            switch(s2) {
                case "ch": {
                    v = jsonReader0.nextString().charAt(0);
                    break;
                }
                case "data": {
                    jsonReader0.beginObject();
                    while(jsonReader0.hasNext()) {
                        if("shapes".equals(jsonReader0.nextName())) {
                            jsonReader0.beginArray();
                            while(jsonReader0.hasNext()) {
                                arrayList0.add(((xE)Au.PjT(jsonReader0, xX0)));
                            }
                            jsonReader0.endArray();
                        }
                        else {
                            jsonReader0.skipValue();
                        }
                    }
                    jsonReader0.endObject();
                    break;
                }
                case "fFamily": {
                    s1 = jsonReader0.nextString();
                    break;
                }
                case "size": {
                    f1 = jsonReader0.nextDouble();
                    break;
                }
                case "style": {
                    s = jsonReader0.nextString();
                    break;
                }
                case "w": {
                    f = jsonReader0.nextDouble();
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return new cr(arrayList0, ((char)v), f1, f, s, s1);
    }
}

