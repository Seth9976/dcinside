package com.bytedance.adsdk.Zh.JQp;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

public class Yo implements IJ {
    public static final Yo PjT;

    static {
        Yo.PjT = new Yo();
    }

    public PointF PjT(JsonReader jsonReader0, float f) throws IOException {
        JsonToken jsonToken0 = jsonReader0.peek();
        if(jsonToken0 == JsonToken.BEGIN_ARRAY) {
            return ltE.Zh(jsonReader0, f);
        }
        if(jsonToken0 == JsonToken.BEGIN_OBJECT) {
            return ltE.Zh(jsonReader0, f);
        }
        if(jsonToken0 != JsonToken.NUMBER) {
            throw new IllegalArgumentException("Cannot convert json to point. Next token is " + jsonToken0);
        }
        PointF pointF0 = new PointF(((float)jsonReader0.nextDouble()) * f, ((float)jsonReader0.nextDouble()) * f);
        while(jsonReader0.hasNext()) {
            jsonReader0.skipValue();
        }
        return pointF0;
    }

    // 检测为 Lambda 实现
    @Override  // com.bytedance.adsdk.Zh.JQp.IJ
    public Object Zh(JsonReader jsonReader0, float f) throws IOException [...]
}

