package com.bytedance.adsdk.Zh.JQp;

import android.util.JsonReader;
import com.bytedance.adsdk.Zh.ReZ.PjT.PjT;
import com.bytedance.adsdk.Zh.ReZ.PjT.Zh;
import com.bytedance.adsdk.Zh.XX;
import java.io.IOException;

public class qj {
    private Zh JQp;
    private PjT PjT;
    private Zh ReZ;
    private Zh Zh;
    private Zh cr;

    DWo PjT(JsonReader jsonReader0, XX xX0) throws IOException {
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            if(s.equals("ef")) {
                jsonReader0.beginArray();
                while(jsonReader0.hasNext()) {
                    this.Zh(jsonReader0, xX0);
                }
                jsonReader0.endArray();
            }
            else {
                jsonReader0.skipValue();
            }
        }
        PjT pjT0 = this.PjT;
        if(pjT0 != null) {
            Zh zh0 = this.Zh;
            if(zh0 != null) {
                Zh zh1 = this.ReZ;
                if(zh1 != null) {
                    Zh zh2 = this.cr;
                    if(zh2 != null) {
                        return this.JQp == null ? null : new DWo(pjT0, zh0, zh1, zh2, this.JQp);
                    }
                }
            }
        }
        return null;
    }

    private void Zh(JsonReader jsonReader0, XX xX0) throws IOException {
        jsonReader0.beginObject();
        String s = "";
        while(jsonReader0.hasNext()) {
            String s1 = jsonReader0.nextName();
            s1.hashCode();
            if(s1.equals("v")) {
                s.hashCode();
                switch(s) {
                    case "Direction": {
                        this.ReZ = cr.PjT(jsonReader0, xX0, false);
                        break;
                    }
                    case "Distance": {
                        this.cr = cr.PjT(jsonReader0, xX0);
                        break;
                    }
                    case "Opacity": {
                        this.Zh = cr.PjT(jsonReader0, xX0, false);
                        break;
                    }
                    case "Shadow Color": {
                        this.PjT = cr.XX(jsonReader0, xX0);
                        break;
                    }
                    case "Softness": {
                        this.JQp = cr.PjT(jsonReader0, xX0);
                        break;
                    }
                    default: {
                        jsonReader0.skipValue();
                    }
                }
            }
            else if(s1.equals("nm")) {
                s = jsonReader0.nextString();
            }
            else {
                jsonReader0.skipValue();
            }
        }
        jsonReader0.endObject();
    }
}

