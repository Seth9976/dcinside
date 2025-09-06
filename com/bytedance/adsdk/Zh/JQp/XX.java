package com.bytedance.adsdk.Zh.JQp;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

public class XX implements IJ {
    public static final XX PjT;

    static {
        XX.PjT = new XX();
    }

    public Integer PjT(JsonReader jsonReader0, float f) throws IOException {
        boolean z = jsonReader0.peek() == JsonToken.BEGIN_ARRAY;
        if(z) {
            jsonReader0.beginArray();
        }
        double f1 = jsonReader0.nextDouble();
        double f2 = jsonReader0.nextDouble();
        double f3 = jsonReader0.nextDouble();
        double f4 = jsonReader0.peek() == JsonToken.NUMBER ? jsonReader0.nextDouble() : 1.0;
        if(z) {
            jsonReader0.endArray();
        }
        if(f1 <= 1.0 && f2 <= 1.0 && f3 <= 1.0) {
            f1 *= 255.0;
            f2 *= 255.0;
            f3 *= 255.0;
            if(f4 <= 1.0) {
                f4 *= 255.0;
            }
        }
        return Color.argb(((int)f4), ((int)f1), ((int)f2), ((int)f3));
    }

    @Override  // com.bytedance.adsdk.Zh.JQp.IJ
    public Object Zh(JsonReader jsonReader0, float f) throws IOException {
        return this.PjT(jsonReader0, f);
    }
}

