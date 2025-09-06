package com.bytedance.adsdk.Zh.JQp;

import android.util.JsonReader;
import com.bytedance.adsdk.Zh.ReZ.PjT.ReZ;
import com.bytedance.adsdk.Zh.ReZ.PjT.Zh;
import com.bytedance.adsdk.Zh.ReZ.PjT.cr;
import com.bytedance.adsdk.Zh.ReZ.Zh.cz;
import com.bytedance.adsdk.Zh.ReZ.Zh.gK.PjT;
import com.bytedance.adsdk.Zh.XX;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

class ub {
    // This method was un-flattened
    static cz PjT(JsonReader jsonReader0, XX xX0) throws IOException {
        com.bytedance.adsdk.Zh.ReZ.Zh.XX xX2;
        ArrayList arrayList0 = new ArrayList();
        String s = null;
        com.bytedance.adsdk.Zh.ReZ.Zh.XX xX1 = null;
        ReZ reZ0 = null;
        com.bytedance.adsdk.Zh.ReZ.PjT.cz cz0 = null;
        com.bytedance.adsdk.Zh.ReZ.PjT.cz cz1 = null;
        Zh zh0 = null;
        PjT gK$PjT0 = null;
        com.bytedance.adsdk.Zh.ReZ.Zh.gK.Zh gK$Zh0 = null;
        float f = 0.0f;
        Zh zh1 = null;
        boolean z = false;
        cr cr0 = null;
        while(jsonReader0.hasNext()) {
            String s1 = jsonReader0.nextName();
            s1.hashCode();
            switch(s1) {
                case "d": {
                    jsonReader0.beginArray();
                    while(jsonReader0.hasNext()) {
                        jsonReader0.beginObject();
                        Zh zh2 = null;
                        String s2 = null;
                        while(jsonReader0.hasNext()) {
                            String s3 = jsonReader0.nextName();
                            s3.hashCode();
                            if(s3.equals("n")) {
                                s2 = jsonReader0.nextString();
                            }
                            else if(s3.equals("v")) {
                                zh2 = com.bytedance.adsdk.Zh.JQp.cr.PjT(jsonReader0, xX0);
                            }
                            else {
                                jsonReader0.skipValue();
                            }
                        }
                        jsonReader0.endObject();
                        if(s2.equals("o")) {
                            zh1 = zh2;
                        }
                        else {
                            if(!s2.equals("d") && !s2.equals("g")) {
                                continue;
                            }
                            xX0.PjT(true);
                            arrayList0.add(zh2);
                        }
                    }
                    jsonReader0.endArray();
                    if(arrayList0.size() != 1) {
                        continue;
                    }
                    arrayList0.add(arrayList0.get(0));
                    continue;
                }
                case "e": {
                    cz1 = com.bytedance.adsdk.Zh.JQp.cr.ReZ(jsonReader0, xX0);
                    continue;
                }
                case "g": {
                    xX2 = xX1;
                    jsonReader0.beginObject();
                    int v = -1;
                    while(jsonReader0.hasNext()) {
                        String s4 = jsonReader0.nextName();
                        s4.hashCode();
                        if(s4.equals("k")) {
                            reZ0 = com.bytedance.adsdk.Zh.JQp.cr.PjT(jsonReader0, xX0, v);
                        }
                        else if(s4.equals("p")) {
                            v = jsonReader0.nextInt();
                        }
                        else {
                            jsonReader0.skipValue();
                        }
                    }
                    jsonReader0.endObject();
                    xX1 = xX2;
                    continue;
                }
                case "hd": {
                    z = jsonReader0.nextBoolean();
                    continue;
                }
                case "lc": {
                    PjT[] arr_gK$PjT = PjT.values();
                    gK$PjT0 = arr_gK$PjT[jsonReader0.nextInt() - 1];
                    continue;
                }
                case "lj": {
                    com.bytedance.adsdk.Zh.ReZ.Zh.gK.Zh[] arr_gK$Zh = com.bytedance.adsdk.Zh.ReZ.Zh.gK.Zh.values();
                    gK$Zh0 = arr_gK$Zh[jsonReader0.nextInt() - 1];
                    continue;
                }
                case "ml": {
                    xX2 = xX1;
                    f = (float)jsonReader0.nextDouble();
                    xX1 = xX2;
                    continue;
                }
                case "nm": {
                    break;
                }
                case "o": {
                    cr0 = com.bytedance.adsdk.Zh.JQp.cr.Zh(jsonReader0, xX0);
                    continue;
                }
                case "s": {
                    cz0 = com.bytedance.adsdk.Zh.JQp.cr.ReZ(jsonReader0, xX0);
                    continue;
                }
                case "t": {
                    xX1 = jsonReader0.nextInt() == 1 ? com.bytedance.adsdk.Zh.ReZ.Zh.XX.PjT : com.bytedance.adsdk.Zh.ReZ.Zh.XX.Zh;
                    continue;
                }
                case "w": {
                    zh0 = com.bytedance.adsdk.Zh.JQp.cr.PjT(jsonReader0, xX0);
                    continue;
                }
                default: {
                    jsonReader0.skipValue();
                    continue;
                }
            }
            s = jsonReader0.nextString();
        }
        return cr0 == null ? new cz(s, xX1, reZ0, new cr(Collections.singletonList(new com.bytedance.adsdk.Zh.XX.PjT(100))), cz0, cz1, zh0, gK$PjT0, gK$Zh0, f, arrayList0, zh1, z) : new cz(s, xX1, reZ0, cr0, cz0, cz1, zh0, gK$PjT0, gK$Zh0, f, arrayList0, zh1, z);
    }
}

