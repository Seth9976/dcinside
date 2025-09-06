package com.bytedance.adsdk.Zh.JQp;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.adsdk.Zh.ReZ.PjT.JQp;
import com.bytedance.adsdk.Zh.ReZ.PjT.SM;
import com.bytedance.adsdk.Zh.ReZ.PjT.Zh;
import com.bytedance.adsdk.Zh.ReZ.PjT.cr;
import com.bytedance.adsdk.Zh.ReZ.PjT.xf;
import com.bytedance.adsdk.Zh.ReZ.PjT.xs;
import com.bytedance.adsdk.Zh.XX;
import java.io.IOException;

public class ReZ {
    public static xf PjT(JsonReader jsonReader0, XX xX0) throws IOException {
        boolean z = jsonReader0.peek() == JsonToken.BEGIN_OBJECT;
        if(z) {
            jsonReader0.beginObject();
        }
        Zh zh0 = null;
        JQp jQp0 = null;
        xs xs0 = null;
        com.bytedance.adsdk.Zh.ReZ.PjT.XX xX1 = null;
        Zh zh1 = null;
        Zh zh2 = null;
        cr cr0 = null;
        Zh zh3 = null;
        Zh zh4 = null;
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            switch(s) {
                case "a": {
                    jsonReader0.beginObject();
                    while(jsonReader0.hasNext()) {
                        String s1 = jsonReader0.nextName();
                        s1.hashCode();
                        if(s1.equals("k")) {
                            jQp0 = PjT.PjT(jsonReader0, xX0);
                        }
                        else {
                            jsonReader0.skipValue();
                        }
                    }
                    jsonReader0.endObject();
                    break;
                }
                case "eo": {
                    zh4 = com.bytedance.adsdk.Zh.JQp.cr.PjT(jsonReader0, xX0, false);
                    break;
                }
                case "o": {
                    cr0 = com.bytedance.adsdk.Zh.JQp.cr.Zh(jsonReader0, xX0);
                    break;
                }
                case "p": {
                    xs0 = PjT.Zh(jsonReader0, xX0);
                    break;
                }
                case "r": {
                    goto label_39;
                }
                case "rz": {
                    xX0.PjT("Lottie doesn\'t support 3D layers.");
                label_39:
                    Zh zh5 = com.bytedance.adsdk.Zh.JQp.cr.PjT(jsonReader0, xX0, false);
                    if(zh5.ReZ().isEmpty()) {
                        zh5.ReZ().add(new com.bytedance.adsdk.Zh.XX.PjT(xX0, 0.0f, 0.0f, null, 0.0f, xX0.XX()));
                    }
                    else if(((com.bytedance.adsdk.Zh.XX.PjT)zh5.ReZ().get(0)).PjT == null) {
                        zh5.ReZ().set(0, new com.bytedance.adsdk.Zh.XX.PjT(xX0, 0.0f, 0.0f, null, 0.0f, xX0.XX()));
                    }
                    zh0 = zh5;
                    break;
                }
                case "s": {
                    xX1 = com.bytedance.adsdk.Zh.JQp.cr.cr(jsonReader0, xX0);
                    break;
                }
                case "sa": {
                    zh2 = com.bytedance.adsdk.Zh.JQp.cr.PjT(jsonReader0, xX0, false);
                    break;
                }
                case "sk": {
                    zh1 = com.bytedance.adsdk.Zh.JQp.cr.PjT(jsonReader0, xX0, false);
                    break;
                }
                case "so": {
                    zh3 = com.bytedance.adsdk.Zh.JQp.cr.PjT(jsonReader0, xX0, false);
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        if(z) {
            jsonReader0.endObject();
        }
        JQp jQp1 = ReZ.PjT(jQp0) ? null : jQp0;
        if(ReZ.PjT(xs0)) {
            xs0 = null;
        }
        Zh zh6 = ReZ.PjT(zh0) ? null : zh0;
        com.bytedance.adsdk.Zh.ReZ.PjT.XX xX2 = ReZ.PjT(xX1) ? null : xX1;
        Zh zh7 = ReZ.Zh(zh1) ? null : zh1;
        return ReZ.ReZ(zh2) ? new xf(jQp1, xs0, xX2, zh6, cr0, zh3, zh4, zh7, null) : new xf(jQp1, xs0, xX2, zh6, cr0, zh3, zh4, zh7, zh2);
    }

    // 去混淆评级： 低(20)
    private static boolean PjT(JQp jQp0) {
        return jQp0 == null || jQp0.Zh() && ((PointF)((com.bytedance.adsdk.Zh.XX.PjT)jQp0.ReZ().get(0)).PjT).equals(0.0f, 0.0f);
    }

    // 去混淆评级： 低(20)
    private static boolean PjT(com.bytedance.adsdk.Zh.ReZ.PjT.XX xX0) {
        return xX0 == null || xX0.Zh() && ((com.bytedance.adsdk.Zh.XX.ReZ)((com.bytedance.adsdk.Zh.XX.PjT)xX0.ReZ().get(0)).PjT).Zh(1.0f, 1.0f);
    }

    private static boolean PjT(Zh zh0) {
        return zh0 == null || zh0.Zh() && ((float)(((Float)((com.bytedance.adsdk.Zh.XX.PjT)zh0.ReZ().get(0)).PjT))) == 0.0f;
    }

    // 去混淆评级： 低(30)
    private static boolean PjT(xs xs0) {
        return xs0 == null || !(xs0 instanceof SM) && xs0.Zh() && ((PointF)((com.bytedance.adsdk.Zh.XX.PjT)xs0.ReZ().get(0)).PjT).equals(0.0f, 0.0f);
    }

    private static boolean ReZ(Zh zh0) {
        return zh0 == null || zh0.Zh() && ((float)(((Float)((com.bytedance.adsdk.Zh.XX.PjT)zh0.ReZ().get(0)).PjT))) == 0.0f;
    }

    private static boolean Zh(Zh zh0) {
        return zh0 == null || zh0.Zh() && ((float)(((Float)((com.bytedance.adsdk.Zh.XX.PjT)zh0.ReZ().get(0)).PjT))) == 0.0f;
    }
}

