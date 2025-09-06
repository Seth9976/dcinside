package com.bytedance.adsdk.Zh.JQp;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.adsdk.Zh.PjT.Zh.SM;
import com.bytedance.adsdk.Zh.XX.PjT;
import com.bytedance.adsdk.Zh.XX;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class RD {
    static List PjT(JsonReader jsonReader0, XX xX0, float f, IJ iJ0, boolean z) throws IOException {
        List list0 = new ArrayList();
        if(jsonReader0.peek() == JsonToken.STRING) {
            xX0.PjT("Lottie doesn\'t support expressions.");
            return list0;
        }
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            if(!s.equals("k")) {
                jsonReader0.skipValue();
            }
            else if(jsonReader0.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader0.beginArray();
                if(jsonReader0.peek() == JsonToken.NUMBER) {
                    list0.add(Owx.PjT(jsonReader0, xX0, f, iJ0, false, z));
                }
                else {
                    while(jsonReader0.hasNext()) {
                        list0.add(Owx.PjT(jsonReader0, xX0, f, iJ0, true, z));
                    }
                }
                jsonReader0.endArray();
            }
            else {
                list0.add(Owx.PjT(jsonReader0, xX0, f, iJ0, false, z));
            }
        }
        jsonReader0.endObject();
        RD.PjT(list0);
        return list0;
    }

    public static void PjT(List list0) {
        int v = list0.size();
        int v1 = 0;
        while(v1 < v - 1) {
            PjT pjT0 = (PjT)list0.get(v1);
            ++v1;
            PjT pjT1 = (PjT)list0.get(v1);
            pjT0.XX = pjT1.cz;
            if(pjT0.Zh == null) {
                Object object0 = pjT1.PjT;
                if(object0 != null) {
                    pjT0.Zh = object0;
                    if(pjT0 instanceof SM) {
                        ((SM)pjT0).PjT();
                    }
                }
            }
        }
        PjT pjT2 = (PjT)list0.get(v - 1);
        if((pjT2.PjT == null || pjT2.Zh == null) && list0.size() > 1) {
            list0.remove(pjT2);
        }
    }
}

