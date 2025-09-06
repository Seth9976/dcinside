package com.bytedance.adsdk.Zh.JQp;

import android.graphics.PointF;
import android.util.JsonReader;
import com.bytedance.adsdk.Zh.ReZ.Zh.PjT;
import com.bytedance.adsdk.Zh.ReZ.Zh;
import java.io.IOException;

public class SM implements IJ {
    public static final SM PjT;

    static {
        SM.PjT = new SM();
    }

    public Zh PjT(JsonReader jsonReader0, float f) throws IOException {
        jsonReader0.beginObject();
        PjT zh$PjT0 = PjT.ReZ;
        String s = null;
        String s1 = null;
        PointF pointF0 = null;
        PointF pointF1 = null;
        float f1 = 0.0f;
        int v = 0;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int v1 = 0;
        int v2 = 0;
        float f4 = 0.0f;
        boolean z = true;
        while(jsonReader0.hasNext()) {
            String s2 = jsonReader0.nextName();
            s2.hashCode();
            switch(s2) {
                case "f": {
                    s1 = jsonReader0.nextString();
                    break;
                }
                case "fc": {
                    v1 = ltE.PjT(jsonReader0);
                    break;
                }
                case "j": {
                    int v3 = jsonReader0.nextInt();
                    PjT zh$PjT1 = PjT.ReZ;
                    if(v3 <= zh$PjT1.ordinal() && v3 >= 0) {
                        zh$PjT0 = PjT.values()[v3];
                        break;
                    }
                    else {
                        zh$PjT0 = zh$PjT1;
                        continue;
                    }
                    f1 = (float)jsonReader0.nextDouble();
                    break;
                }
                case "lh": {
                    f2 = (float)jsonReader0.nextDouble();
                    break;
                }
                case "ls": {
                    f3 = (float)jsonReader0.nextDouble();
                    break;
                }
                case "of": {
                    z = jsonReader0.nextBoolean();
                    break;
                }
                case "ps": {
                    jsonReader0.beginArray();
                    PointF pointF2 = new PointF(((float)jsonReader0.nextDouble()) * f, ((float)jsonReader0.nextDouble()) * f);
                    jsonReader0.endArray();
                    pointF0 = pointF2;
                    break;
                }
                case "s": {
                    f1 = (float)jsonReader0.nextDouble();
                    break;
                }
                case "sc": {
                    v2 = ltE.PjT(jsonReader0);
                    break;
                }
                case "sw": {
                    f4 = (float)jsonReader0.nextDouble();
                    break;
                }
                case "sz": {
                    jsonReader0.beginArray();
                    PointF pointF3 = new PointF(((float)jsonReader0.nextDouble()) * f, ((float)jsonReader0.nextDouble()) * f);
                    jsonReader0.endArray();
                    pointF1 = pointF3;
                    break;
                }
                case "t": {
                    s = jsonReader0.nextString();
                    break;
                }
                case "tr": {
                    v = jsonReader0.nextInt();
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        return new Zh(s, s1, f1, zh$PjT0, v, f2, f3, v1, v2, f4, z, pointF0, pointF1);
    }

    @Override  // com.bytedance.adsdk.Zh.JQp.IJ
    public Object Zh(JsonReader jsonReader0, float f) throws IOException {
        return this.PjT(jsonReader0, f);
    }
}

