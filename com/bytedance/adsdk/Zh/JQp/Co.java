package com.bytedance.adsdk.Zh.JQp;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.adsdk.Zh.XX.ReZ;
import java.io.IOException;

public class Co implements IJ {
    public static final Co PjT;

    static {
        Co.PjT = new Co();
    }

    public ReZ PjT(JsonReader jsonReader0, float f) throws IOException {
        boolean z = jsonReader0.peek() == JsonToken.BEGIN_ARRAY;
        if(z) {
            jsonReader0.beginArray();
        }
        float f1 = (float)jsonReader0.nextDouble();
        float f2 = (float)jsonReader0.nextDouble();
        while(jsonReader0.hasNext()) {
            jsonReader0.skipValue();
        }
        if(z) {
            jsonReader0.endArray();
        }
        return new ReZ(f1 / 100.0f * f, f2 / 100.0f * f);
    }

    // 检测为 Lambda 实现
    @Override  // com.bytedance.adsdk.Zh.JQp.IJ
    public Object Zh(JsonReader jsonReader0, float f) throws IOException [...]
}

