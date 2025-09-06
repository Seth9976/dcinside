package com.bytedance.adsdk.Zh.JQp;

import android.graphics.Path.FillType;
import android.util.JsonReader;
import com.bytedance.adsdk.Zh.ReZ.PjT.ReZ;
import com.bytedance.adsdk.Zh.ReZ.PjT.cr;
import com.bytedance.adsdk.Zh.ReZ.PjT.cz;
import com.bytedance.adsdk.Zh.ReZ.Zh.JQp;
import com.bytedance.adsdk.Zh.XX.PjT;
import com.bytedance.adsdk.Zh.XX;
import java.io.IOException;
import java.util.Collections;

class xE {
    // This method was un-flattened
    static JQp PjT(JsonReader jsonReader0, XX xX0) throws IOException {
        cr cr0 = null;
        Path.FillType path$FillType0 = Path.FillType.WINDING;
        String s = null;
        com.bytedance.adsdk.Zh.ReZ.Zh.XX xX1 = null;
        ReZ reZ0 = null;
        cz cz0 = null;
        cz cz1 = null;
        boolean z = false;
        while(jsonReader0.hasNext()) {
            String s1 = jsonReader0.nextName();
            s1.hashCode();
            switch(s1) {
                case "e": {
                    cz1 = com.bytedance.adsdk.Zh.JQp.cr.ReZ(jsonReader0, xX0);
                    break;
                }
                case "g": {
                    jsonReader0.beginObject();
                    int v = -1;
                    while(jsonReader0.hasNext()) {
                        String s2 = jsonReader0.nextName();
                        s2.hashCode();
                        if(s2.equals("k")) {
                            reZ0 = com.bytedance.adsdk.Zh.JQp.cr.PjT(jsonReader0, xX0, v);
                        }
                        else if(s2.equals("p")) {
                            v = jsonReader0.nextInt();
                        }
                        else {
                            jsonReader0.skipValue();
                        }
                    }
                    jsonReader0.endObject();
                    break;
                }
                case "hd": {
                    z = jsonReader0.nextBoolean();
                    break;
                }
                case "nm": {
                    s = jsonReader0.nextString();
                    break;
                }
                case "o": {
                    cr0 = com.bytedance.adsdk.Zh.JQp.cr.Zh(jsonReader0, xX0);
                    break;
                }
                case "r": {
                    path$FillType0 = jsonReader0.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                }
                case "s": {
                    cz0 = com.bytedance.adsdk.Zh.JQp.cr.ReZ(jsonReader0, xX0);
                    break;
                }
                case "t": {
                    xX1 = jsonReader0.nextInt() == 1 ? com.bytedance.adsdk.Zh.ReZ.Zh.XX.PjT : com.bytedance.adsdk.Zh.ReZ.Zh.XX.Zh;
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        return cr0 == null ? new JQp(s, xX1, path$FillType0, reZ0, new cr(Collections.singletonList(new PjT(100))), cz0, cz1, null, null, z) : new JQp(s, xX1, path$FillType0, reZ0, cr0, cz0, cz1, null, null, z);
    }
}

