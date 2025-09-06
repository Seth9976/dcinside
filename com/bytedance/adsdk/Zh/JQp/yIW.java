package com.bytedance.adsdk.Zh.JQp;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.adsdk.Zh.PjT.Zh.SM;
import com.bytedance.adsdk.Zh.XX;
import com.bytedance.adsdk.Zh.cz.cz;
import java.io.IOException;

class yIW {
    static SM PjT(JsonReader jsonReader0, XX xX0) throws IOException {
        return jsonReader0.peek() == JsonToken.BEGIN_OBJECT ? new SM(xX0, Owx.PjT(jsonReader0, xX0, cz.PjT(), (JsonReader jsonReader0, float f) -> this.PjT(jsonReader0, f), true, false)) : new SM(xX0, Owx.PjT(jsonReader0, xX0, cz.PjT(), (JsonReader jsonReader0, float f) -> this.PjT(jsonReader0, f), false, false));
    }
}

