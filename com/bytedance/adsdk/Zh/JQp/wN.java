package com.bytedance.adsdk.Zh.JQp;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.adsdk.Zh.ReZ.PjT;
import com.bytedance.adsdk.Zh.ReZ.Zh.fDm;
import com.bytedance.adsdk.Zh.cz.JQp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class wN implements IJ {
    public static final wN PjT;

    static {
        wN.PjT = new wN();
    }

    public fDm PjT(JsonReader jsonReader0, float f) throws IOException {
        if(jsonReader0.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader0.beginArray();
        }
        jsonReader0.beginObject();
        List list0 = null;
        List list1 = null;
        List list2 = null;
        boolean z = false;
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            switch(s) {
                case "c": {
                    z = jsonReader0.nextBoolean();
                    break;
                }
                case "i": {
                    list1 = ltE.PjT(jsonReader0, f);
                    break;
                }
                case "o": {
                    list2 = ltE.PjT(jsonReader0, f);
                    break;
                }
                case "v": {
                    list0 = ltE.PjT(jsonReader0, f);
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        if(jsonReader0.peek() == JsonToken.END_ARRAY) {
            jsonReader0.endArray();
        }
        if(list0 == null || list1 == null || list2 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if(list0.isEmpty()) {
            return new fDm(new PointF(), false, Collections.emptyList());
        }
        int v = list0.size();
        PointF pointF0 = (PointF)list0.get(0);
        ArrayList arrayList0 = new ArrayList(v);
        for(int v1 = 1; v1 < v; ++v1) {
            PointF pointF1 = (PointF)list0.get(v1);
            PointF pointF2 = (PointF)list0.get(v1 - 1);
            PointF pointF3 = (PointF)list2.get(v1 - 1);
            PointF pointF4 = (PointF)list1.get(v1);
            arrayList0.add(new PjT(JQp.PjT(pointF2, pointF3), JQp.PjT(pointF1, pointF4), pointF1));
        }
        if(z) {
            PointF pointF5 = (PointF)list0.get(0);
            PointF pointF6 = (PointF)list0.get(v - 1);
            PointF pointF7 = (PointF)list2.get(v - 1);
            PointF pointF8 = (PointF)list1.get(0);
            arrayList0.add(new PjT(JQp.PjT(pointF6, pointF7), JQp.PjT(pointF5, pointF8), pointF5));
        }
        return new fDm(pointF0, z, arrayList0);
    }

    @Override  // com.bytedance.adsdk.Zh.JQp.IJ
    public Object Zh(JsonReader jsonReader0, float f) throws IOException {
        return this.PjT(jsonReader0, f);
    }
}

