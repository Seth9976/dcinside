package com.bytedance.adsdk.Zh.JQp;

import android.util.JsonReader;
import com.bytedance.adsdk.Zh.ReZ.PjT.Zh;
import com.bytedance.adsdk.Zh.ReZ.PjT.xs;
import com.bytedance.adsdk.Zh.ReZ.Zh.DWo.PjT;
import com.bytedance.adsdk.Zh.ReZ.Zh.DWo;
import com.bytedance.adsdk.Zh.XX;
import java.io.IOException;

class KM {
    static DWo PjT(JsonReader jsonReader0, XX xX0, int v) throws IOException {
        boolean z = v == 3;
        String s = null;
        PjT dWo$PjT0 = null;
        Zh zh0 = null;
        xs xs0 = null;
        Zh zh1 = null;
        Zh zh2 = null;
        Zh zh3 = null;
        Zh zh4 = null;
        Zh zh5 = null;
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
                    xs0 = com.bytedance.adsdk.Zh.JQp.PjT.Zh(jsonReader0, xX0);
                    break;
                }
                case "hd": {
                    z1 = jsonReader0.nextBoolean();
                    break;
                }
                case "ir": {
                    zh2 = cr.PjT(jsonReader0, xX0);
                    break;
                }
                case "is": {
                    zh4 = cr.PjT(jsonReader0, xX0, false);
                    break;
                }
                case "nm": {
                    s = jsonReader0.nextString();
                    break;
                }
                case "or": {
                    zh3 = cr.PjT(jsonReader0, xX0);
                    break;
                }
                case "os": {
                    zh5 = cr.PjT(jsonReader0, xX0, false);
                    break;
                }
                case "p": {
                    xs0 = com.bytedance.adsdk.Zh.JQp.PjT.Zh(jsonReader0, xX0);
                    break;
                }
                case "pt": {
                    zh0 = cr.PjT(jsonReader0, xX0, false);
                    break;
                }
                case "r": {
                    zh1 = cr.PjT(jsonReader0, xX0, false);
                    break;
                }
                case "sy": {
                    dWo$PjT0 = PjT.PjT(jsonReader0.nextInt());
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        return new DWo(s, dWo$PjT0, zh0, xs0, zh1, zh2, zh3, zh4, zh5, z1, z);
    }
}

