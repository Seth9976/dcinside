package com.bytedance.adsdk.Zh.JQp;

import android.graphics.Path.FillType;
import android.util.JsonReader;
import com.bytedance.adsdk.Zh.ReZ.PjT.PjT;
import com.bytedance.adsdk.Zh.ReZ.PjT.cr;
import com.bytedance.adsdk.Zh.ReZ.Zh.qla;
import com.bytedance.adsdk.Zh.XX;
import java.io.IOException;
import java.util.Collections;

class qZS {
    static qla PjT(JsonReader jsonReader0, XX xX0) throws IOException {
        cr cr0 = null;
        String s = null;
        PjT pjT0 = null;
        int v = 1;
        boolean z = false;
        boolean z1 = false;
        while(jsonReader0.hasNext()) {
            String s1 = jsonReader0.nextName();
            s1.hashCode();
            switch(s1) {
                case "c": {
                    pjT0 = com.bytedance.adsdk.Zh.JQp.cr.XX(jsonReader0, xX0);
                    break;
                }
                case "fillEnabled": {
                    z = jsonReader0.nextBoolean();
                    break;
                }
                case "hd": {
                    z1 = jsonReader0.nextBoolean();
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
                    v = jsonReader0.nextInt();
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        if(cr0 == null) {
            cr0 = new cr(Collections.singletonList(new com.bytedance.adsdk.Zh.XX.PjT(100)));
        }
        return v == 1 ? new qla(s, z, Path.FillType.WINDING, pjT0, cr0, z1) : new qla(s, z, Path.FillType.EVEN_ODD, pjT0, cr0, z1);
    }
}

