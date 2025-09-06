package com.bytedance.adsdk.Zh.JQp;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.adsdk.Zh.ReZ.PjT.JQp;
import com.bytedance.adsdk.Zh.ReZ.PjT.SM;
import com.bytedance.adsdk.Zh.ReZ.PjT.Zh;
import com.bytedance.adsdk.Zh.ReZ.PjT.xs;
import com.bytedance.adsdk.Zh.XX;
import com.bytedance.adsdk.Zh.cz.cz;
import java.io.IOException;
import java.util.ArrayList;

public class PjT {
    public static JQp PjT(JsonReader jsonReader0, XX xX0) throws IOException {
        ArrayList arrayList0 = new ArrayList();
        if(jsonReader0.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader0.beginArray();
            while(jsonReader0.hasNext()) {
                arrayList0.add(yIW.PjT(jsonReader0, xX0));
            }
            jsonReader0.endArray();
            RD.PjT(arrayList0);
            return new JQp(arrayList0);
        }
        arrayList0.add(new com.bytedance.adsdk.Zh.XX.PjT(ltE.Zh(jsonReader0, cz.PjT())));
        return new JQp(arrayList0);
    }

    static xs Zh(JsonReader jsonReader0, XX xX0) throws IOException {
        jsonReader0.beginObject();
        xs xs0 = null;
        Zh zh0 = null;
        Zh zh1 = null;
        boolean z = false;
        while(jsonReader0.peek() != JsonToken.END_OBJECT) {
            String s = jsonReader0.nextName();
            s.hashCode();
            switch(s) {
                case "k": {
                    xs0 = PjT.PjT(jsonReader0, xX0);
                    continue;
                }
                case "x": {
                    if(jsonReader0.peek() == JsonToken.STRING) {
                        z = true;
                        break;
                    }
                    else {
                        zh0 = cr.PjT(jsonReader0, xX0);
                        continue;
                    }
                    goto label_17;
                }
                case "y": {
                label_17:
                    if(jsonReader0.peek() == JsonToken.STRING) {
                        z = true;
                    }
                    else {
                        goto label_21;
                    }
                }
            }
            jsonReader0.skipValue();
            continue;
        label_21:
            zh1 = cr.PjT(jsonReader0, xX0);
        }
        jsonReader0.endObject();
        if(z) {
            xX0.PjT("Lottie doesn\'t support expressions.");
        }
        return xs0 != null ? xs0 : new SM(zh0, zh1);
    }
}

