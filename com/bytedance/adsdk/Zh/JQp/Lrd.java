package com.bytedance.adsdk.Zh.JQp;

import android.util.JsonReader;
import com.bytedance.adsdk.Zh.ReZ.PjT.cr;
import com.bytedance.adsdk.Zh.ReZ.Zh.Au.PjT;
import com.bytedance.adsdk.Zh.ReZ.Zh.Au;
import com.bytedance.adsdk.Zh.XX;
import java.io.IOException;

class Lrd {
    // This method was un-flattened
    static Au PjT(JsonReader jsonReader0, XX xX0) throws IOException {
        jsonReader0.beginObject();
        PjT au$PjT0 = null;
        com.bytedance.adsdk.Zh.ReZ.PjT.Au au0 = null;
        cr cr0 = null;
        boolean z = false;
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
        alab1:
            switch(s) {
                case "inv": {
                    z = jsonReader0.nextBoolean();
                    continue;
                }
                case "mode": {
                    String s1 = jsonReader0.nextString();
                    s1.hashCode();
                    switch(s1) {
                        case "a": {
                            au$PjT0 = PjT.PjT;
                            break alab1;
                        }
                        case "i": {
                            xX0.PjT("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            au$PjT0 = PjT.ReZ;
                            break alab1;
                        }
                        case "n": {
                            au$PjT0 = PjT.cr;
                            break alab1;
                        }
                        case "s": {
                            au$PjT0 = PjT.Zh;
                            break alab1;
                        }
                        default: {
                            au$PjT0 = PjT.PjT;
                            break alab1;
                        }
                    }
                }
                case "o": {
                    cr0 = com.bytedance.adsdk.Zh.JQp.cr.Zh(jsonReader0, xX0);
                    continue;
                }
                case "pt": {
                    au0 = com.bytedance.adsdk.Zh.JQp.cr.JQp(jsonReader0, xX0);
                    continue;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return new Au(au$PjT0, au0, cr0, z);
    }
}

