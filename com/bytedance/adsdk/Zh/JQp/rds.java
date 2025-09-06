package com.bytedance.adsdk.Zh.JQp;

import android.util.JsonReader;
import com.bytedance.adsdk.Zh.ReZ.PjT.PjT;
import com.bytedance.adsdk.Zh.ReZ.PjT.Zh;
import com.bytedance.adsdk.Zh.ReZ.PjT.cr;
import com.bytedance.adsdk.Zh.ReZ.Zh.gK;
import com.bytedance.adsdk.Zh.XX;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

class rds {
    // This method was un-flattened
    static gK PjT(JsonReader jsonReader0, XX xX0) throws IOException {
        String s2;
        ArrayList arrayList0 = new ArrayList();
        String s = null;
        Zh zh0 = null;
        PjT pjT0 = null;
        Zh zh1 = null;
        com.bytedance.adsdk.Zh.ReZ.Zh.gK.PjT gK$PjT0 = null;
        com.bytedance.adsdk.Zh.ReZ.Zh.gK.Zh gK$Zh0 = null;
        float f = 0.0f;
        boolean z = false;
        cr cr0 = null;
        while(jsonReader0.hasNext()) {
            String s1 = jsonReader0.nextName();
            s1.hashCode();
            switch(s1) {
                case "c": {
                    pjT0 = com.bytedance.adsdk.Zh.JQp.cr.XX(jsonReader0, xX0);
                    continue;
                }
                case "d": {
                    s2 = s;
                    jsonReader0.beginArray();
                    while(jsonReader0.hasNext()) {
                        jsonReader0.beginObject();
                        Zh zh2 = null;
                        String s3 = null;
                        while(jsonReader0.hasNext()) {
                            String s4 = jsonReader0.nextName();
                            s4.hashCode();
                            if(s4.equals("n")) {
                                s3 = jsonReader0.nextString();
                            }
                            else if(s4.equals("v")) {
                                zh2 = com.bytedance.adsdk.Zh.JQp.cr.PjT(jsonReader0, xX0);
                            }
                            else {
                                jsonReader0.skipValue();
                            }
                        }
                        jsonReader0.endObject();
                        s3.hashCode();
                        switch(s3) {
                            case "d": 
                            case "g": {
                                xX0.PjT(true);
                                arrayList0.add(zh2);
                                continue;
                            }
                            case "o": {
                                zh0 = zh2;
                            }
                        }
                    }
                    jsonReader0.endArray();
                    if(arrayList0.size() == 1) {
                        arrayList0.add(arrayList0.get(0));
                    }
                    s = s2;
                    continue;
                }
                case "hd": {
                    z = jsonReader0.nextBoolean();
                    continue;
                }
                case "lc": {
                    s2 = s;
                    com.bytedance.adsdk.Zh.ReZ.Zh.gK.PjT[] arr_gK$PjT = com.bytedance.adsdk.Zh.ReZ.Zh.gK.PjT.values();
                    gK$PjT0 = arr_gK$PjT[jsonReader0.nextInt() - 1];
                    s = s2;
                    continue;
                }
                case "lj": {
                    s2 = s;
                    com.bytedance.adsdk.Zh.ReZ.Zh.gK.Zh[] arr_gK$Zh = com.bytedance.adsdk.Zh.ReZ.Zh.gK.Zh.values();
                    gK$Zh0 = arr_gK$Zh[jsonReader0.nextInt() - 1];
                    s = s2;
                    continue;
                }
                case "ml": {
                    s2 = s;
                    f = (float)jsonReader0.nextDouble();
                    s = s2;
                    continue;
                }
                case "nm": {
                    break;
                }
                case "o": {
                    cr0 = com.bytedance.adsdk.Zh.JQp.cr.Zh(jsonReader0, xX0);
                    continue;
                }
                case "w": {
                    zh1 = com.bytedance.adsdk.Zh.JQp.cr.PjT(jsonReader0, xX0);
                    continue;
                }
                default: {
                    jsonReader0.skipValue();
                    s2 = s;
                    s = s2;
                    continue;
                }
            }
            s = jsonReader0.nextString();
        }
        return cr0 == null ? new gK(s, zh0, arrayList0, pjT0, new cr(Collections.singletonList(new com.bytedance.adsdk.Zh.XX.PjT(100))), zh1, gK$PjT0, gK$Zh0, f, z) : new gK(s, zh0, arrayList0, pjT0, cr0, zh1, gK$PjT0, gK$Zh0, f, z);
    }
}

