package com.bytedance.adsdk.Zh.JQp;

import android.graphics.Color;
import android.graphics.Rect;
import android.util.JsonReader;
import com.bytedance.adsdk.Zh.ReZ.PjT.DWo;
import com.bytedance.adsdk.Zh.ReZ.PjT.qj;
import com.bytedance.adsdk.Zh.ReZ.PjT.xf;
import com.bytedance.adsdk.Zh.ReZ.ReZ.JQp.Zh;
import com.bytedance.adsdk.Zh.ReZ.ReZ.JQp;
import com.bytedance.adsdk.Zh.ReZ.Zh.PjT;
import com.bytedance.adsdk.Zh.XX;
import com.bytedance.adsdk.Zh.cz.cz;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sks {
    public static JQp PjT(JsonReader jsonReader0, XX xX0) throws IOException {
        String s6;
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        jsonReader0.beginObject();
        long v = 0L;
        Zh jQp$Zh0 = Zh.PjT;
        String s = null;
        xf xf0 = null;
        DWo dWo0 = null;
        qj qj0 = null;
        com.bytedance.adsdk.Zh.ReZ.PjT.Zh zh0 = null;
        PjT pjT0 = null;
        com.bytedance.adsdk.Zh.JQp.DWo dWo1 = null;
        long v1 = -1L;
        float f = 0.0f;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        float f1 = 1.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        boolean z = false;
        float f5 = 0.0f;
        com.bytedance.adsdk.Zh.ReZ.ReZ.JQp.PjT jQp$PjT0 = null;
        String s1 = "UNSET";
        String s2 = null;
        while(jsonReader0.hasNext()) {
            String s3 = jsonReader0.nextName();
            s3.hashCode();
        alab1:
            switch(s3) {
                case "cl": {
                    s2 = jsonReader0.nextString();
                    continue;
                }
                case "ef": {
                    jsonReader0.beginArray();
                    ArrayList arrayList2 = new ArrayList();
                    while(jsonReader0.hasNext()) {
                        jsonReader0.beginObject();
                        while(jsonReader0.hasNext()) {
                            String s5 = jsonReader0.nextName();
                            s5.hashCode();
                            if(s5.equals("nm")) {
                                arrayList2.add(jsonReader0.nextString());
                            }
                            else if(s5.equals("ty")) {
                                int v5 = jsonReader0.nextInt();
                                if(v5 == 29) {
                                    pjT0 = com.bytedance.adsdk.Zh.JQp.JQp.PjT(jsonReader0, xX0);
                                }
                                else {
                                    if(v5 != 25) {
                                        continue;
                                    }
                                    dWo1 = new com.bytedance.adsdk.Zh.JQp.qj().PjT(jsonReader0, xX0);
                                }
                            }
                            else {
                                jsonReader0.skipValue();
                            }
                        }
                        jsonReader0.endObject();
                    }
                    jsonReader0.endArray();
                    xX0.PjT("Lottie doesn\'t support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList2);
                    continue;
                }
                case "h": {
                    f4 = (float)(jsonReader0.nextDouble() * ((double)cz.PjT()));
                    continue;
                }
                case "hd": {
                    z = jsonReader0.nextBoolean();
                    continue;
                }
                case "ind": {
                    v = (long)jsonReader0.nextInt();
                    continue;
                }
                case "ip": {
                    f = (float)jsonReader0.nextDouble();
                    continue;
                }
                case "ks": {
                    xf0 = ReZ.PjT(jsonReader0, xX0);
                    continue;
                }
                case "masksProperties": {
                    jsonReader0.beginArray();
                    while(true) {
                        if(!jsonReader0.hasNext()) {
                            break alab1;
                        }
                        arrayList0.add(Lrd.PjT(jsonReader0, xX0));
                    }
                }
                case "nm": {
                    s1 = jsonReader0.nextString();
                    continue;
                }
                case "op": {
                    f5 = (float)jsonReader0.nextDouble();
                    continue;
                }
                case "parent": {
                    v1 = (long)jsonReader0.nextInt();
                    continue;
                }
                case "refId": {
                    s = jsonReader0.nextString();
                    continue;
                }
                case "sc": {
                    v4 = Color.parseColor(jsonReader0.nextString());
                    continue;
                }
                case "sh": {
                    v3 = (int)(((float)jsonReader0.nextInt()) * cz.PjT());
                    continue;
                }
                case "shapes": {
                    jsonReader0.beginArray();
                    while(jsonReader0.hasNext()) {
                        com.bytedance.adsdk.Zh.ReZ.Zh.ReZ reZ0 = Au.PjT(jsonReader0, xX0);
                        if(reZ0 != null) {
                            arrayList1.add(reZ0);
                        }
                    }
                    jsonReader0.endArray();
                    continue;
                }
                case "sr": {
                    f1 = (float)jsonReader0.nextDouble();
                    continue;
                }
                case "st": {
                    f2 = (float)jsonReader0.nextDouble();
                    continue;
                }
                case "sw": {
                    v2 = (int)(((float)jsonReader0.nextInt()) * cz.PjT());
                    continue;
                }
                case "t": {
                    jsonReader0.beginObject();
                    while(jsonReader0.hasNext()) {
                        String s4 = jsonReader0.nextName();
                        s4.hashCode();
                        if(s4.equals("a")) {
                            jsonReader0.beginArray();
                            if(jsonReader0.hasNext()) {
                                qj0 = com.bytedance.adsdk.Zh.JQp.Zh.PjT(jsonReader0, xX0);
                            }
                            while(jsonReader0.hasNext()) {
                                jsonReader0.skipValue();
                            }
                            jsonReader0.endArray();
                        }
                        else if(s4.equals("d")) {
                            dWo0 = cr.cz(jsonReader0, xX0);
                        }
                        else {
                            jsonReader0.skipValue();
                        }
                    }
                    jsonReader0.endObject();
                    continue;
                }
                case "tm": {
                    zh0 = cr.PjT(jsonReader0, xX0, false);
                    continue;
                }
                case "tt": {
                    int v6 = jsonReader0.nextInt();
                    if(v6 >= Zh.values().length) {
                        xX0.PjT("Unsupported matte type: " + v6);
                    }
                    else {
                        jQp$Zh0 = Zh.values()[v6];
                        switch(jQp$Zh0) {
                            case 1: {
                                xX0.PjT("Unsupported matte type: Luma");
                                break;
                            }
                            case 2: {
                                xX0.PjT("Unsupported matte type: Luma Inverted");
                            }
                        }
                        xX0.PjT(1);
                    }
                    continue;
                }
                case "ty": {
                    int v7 = jsonReader0.nextInt();
                    com.bytedance.adsdk.Zh.ReZ.ReZ.JQp.PjT jQp$PjT1 = com.bytedance.adsdk.Zh.ReZ.ReZ.JQp.PjT.XX;
                    jQp$PjT0 = v7 >= jQp$PjT1.ordinal() ? jQp$PjT1 : com.bytedance.adsdk.Zh.ReZ.ReZ.JQp.PjT.values()[v7];
                    continue;
                }
                case "w": {
                    f3 = (float)(jsonReader0.nextDouble() * ((double)cz.PjT()));
                    continue;
                }
                default: {
                    jsonReader0.skipValue();
                    continue;
                }
            }
            xX0.PjT(arrayList0.size());
            jsonReader0.endArray();
        }
        jsonReader0.endObject();
        ArrayList arrayList3 = new ArrayList();
        if(f > 0.0f) {
            s6 = s2;
            arrayList3.add(new com.bytedance.adsdk.Zh.XX.PjT(xX0, 0.0f, 0.0f, null, 0.0f, f));
        }
        else {
            s6 = s2;
        }
        if(f5 <= 0.0f) {
            f5 = xX0.XX();
        }
        arrayList3.add(new com.bytedance.adsdk.Zh.XX.PjT(xX0, 1.0f, 1.0f, null, f, f5));
        arrayList3.add(new com.bytedance.adsdk.Zh.XX.PjT(xX0, 0.0f, 0.0f, null, f5, 3.402823E+38f));
        if(s1.endsWith(".ai") || "ai".equals(s6)) {
            xX0.PjT("Convert your Illustrator layers to shape layers.");
        }
        return new JQp(arrayList1, xX0, s1, v, jQp$PjT0, v1, s, arrayList0, xf0, v2, v3, v4, f1, f2, f3, f4, dWo0, qj0, arrayList3, jQp$Zh0, zh0, z, pjT0, dWo1);
    }

    public static JQp PjT(XX xX0) {
        Rect rect0 = xX0.cr();
        List list0 = Collections.emptyList();
        List list1 = Collections.emptyList();
        xf xf0 = new xf();
        float f = (float)rect0.width();
        float f1 = (float)rect0.height();
        List list2 = Collections.emptyList();
        return new JQp(list0, xX0, "__container", -1L, com.bytedance.adsdk.Zh.ReZ.ReZ.JQp.PjT.PjT, -1L, null, list1, xf0, 0, 0, 0, 0.0f, 0.0f, f, f1, null, null, list2, Zh.PjT, null, false, null, null);
    }
}

