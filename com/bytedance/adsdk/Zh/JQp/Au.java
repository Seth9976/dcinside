package com.bytedance.adsdk.Zh.JQp;

import android.util.JsonReader;
import com.bytedance.adsdk.Zh.ReZ.Zh.ReZ;
import com.bytedance.adsdk.Zh.XX;
import java.io.IOException;

class Au {
    static ReZ PjT(JsonReader jsonReader0, XX xX0) throws IOException {
        ReZ reZ0;
        jsonReader0.beginObject();
        int v = 2;
        while(true) {
            String s = null;
            reZ0 = null;
            if(jsonReader0.hasNext()) {
                String s1 = jsonReader0.nextName();
                s1.hashCode();
                if(s1.equals("d")) {
                    v = jsonReader0.nextInt();
                    continue;
                }
                else {
                    if(!s1.equals("ty")) {
                        jsonReader0.skipValue();
                        continue;
                    }
                    s = jsonReader0.nextString();
                }
            }
            break;
        }
        if(s == null) {
            return null;
        }
        switch(s) {
            case "el": {
                reZ0 = cz.PjT(jsonReader0, xX0, v);
                break;
            }
            case "fl": {
                reZ0 = qZS.PjT(jsonReader0, xX0);
                break;
            }
            case "gf": {
                reZ0 = xE.PjT(jsonReader0, xX0);
                break;
            }
            case "gr": {
                reZ0 = Zd.PjT(jsonReader0, xX0);
                break;
            }
            case "gs": {
                reZ0 = ub.PjT(jsonReader0, xX0);
                break;
            }
            case "mm": {
                reZ0 = cRA.PjT(jsonReader0);
                xX0.PjT("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            }
            case "rc": {
                reZ0 = Qf.PjT(jsonReader0, xX0);
                break;
            }
            case "rd": {
                reZ0 = Jo.PjT(jsonReader0, xX0);
                break;
            }
            case "rp": {
                reZ0 = ZX.PjT(jsonReader0, xX0);
                break;
            }
            case "sh": {
                reZ0 = ig.PjT(jsonReader0, xX0);
                break;
            }
            case "sr": {
                reZ0 = KM.PjT(jsonReader0, xX0, v);
                break;
            }
            case "st": {
                reZ0 = rds.PjT(jsonReader0, xX0);
                break;
            }
            case "tm": {
                reZ0 = kph.PjT(jsonReader0, xX0);
                break;
            }
            case "tr": {
                reZ0 = com.bytedance.adsdk.Zh.JQp.ReZ.PjT(jsonReader0, xX0);
            }
        }
        while(jsonReader0.hasNext()) {
            jsonReader0.skipValue();
        }
        jsonReader0.endObject();
        return reZ0;
    }
}

