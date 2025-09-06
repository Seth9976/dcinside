package com.bytedance.adsdk.Zh.JQp;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.SparseArray;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.adsdk.Zh.XX.PjT;
import com.bytedance.adsdk.Zh.XX;
import com.bytedance.adsdk.Zh.cz.JQp;
import com.bytedance.adsdk.Zh.ub;
import java.io.IOException;
import java.lang.ref.WeakReference;

class Owx {
    private static final Interpolator PjT;
    private static SparseArray Zh;

    static {
        Owx.PjT = new LinearInterpolator();
    }

    private static SparseArray PjT() {
        if(Owx.Zh == null) {
            Owx.Zh = new SparseArray();
        }
        return Owx.Zh;
    }

    private static Interpolator PjT(PointF pointF0, PointF pointF1) {
        try {
            pointF0.x = JQp.Zh(pointF0.x, -1.0f, 1.0f);
            pointF0.y = JQp.Zh(pointF0.y, -100.0f, 100.0f);
            pointF1.x = JQp.Zh(pointF1.x, -1.0f, 1.0f);
            pointF1.y = JQp.Zh(pointF1.y, -100.0f, 100.0f);
            return ub.PjT(pointF0.x, pointF0.y, pointF1.x, pointF1.y);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            return "The Path cannot loop back on itself.".equals(illegalArgumentException0.getMessage()) ? ub.PjT(Math.min(pointF0.x, 1.0f), pointF0.y, Math.max(pointF1.x, 0.0f), pointF1.y) : new LinearInterpolator();
        }
    }

    private static PjT PjT(JsonReader jsonReader0, float f, IJ iJ0) throws IOException {
        return new PjT(iJ0.Zh(jsonReader0, f));
    }

    static PjT PjT(JsonReader jsonReader0, XX xX0, float f, IJ iJ0, boolean z, boolean z1) throws IOException {
        if(z && z1) {
            return Owx.Zh(xX0, jsonReader0, f, iJ0);
        }
        return z ? Owx.PjT(xX0, jsonReader0, f, iJ0) : Owx.PjT(jsonReader0, f, iJ0);
    }

    private static PjT PjT(XX xX0, JsonReader jsonReader0, float f, IJ iJ0) throws IOException {
        Interpolator interpolator0;
        jsonReader0.beginObject();
        PointF pointF0 = null;
        PointF pointF1 = null;
        Object object0 = null;
        Object object1 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        boolean z = false;
        float f1 = 0.0f;
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            switch(s) {
                case "e": {
                    object0 = iJ0.Zh(jsonReader0, f);
                    break;
                }
                case "h": {
                    if(jsonReader0.nextInt() == 1) {
                        z = true;
                        continue;
                    }
                    else {
                        z = false;
                        break;
                    }
                    pointF1 = ltE.Zh(jsonReader0, 1.0f);
                    break;
                }
                case "i": {
                    pointF1 = ltE.Zh(jsonReader0, 1.0f);
                    break;
                }
                case "o": {
                    pointF0 = ltE.Zh(jsonReader0, 1.0f);
                    break;
                }
                case "s": {
                    object1 = iJ0.Zh(jsonReader0, f);
                    break;
                }
                case "t": {
                    f1 = (float)jsonReader0.nextDouble();
                    break;
                }
                case "ti": {
                    pointF3 = ltE.Zh(jsonReader0, f);
                    break;
                }
                case "to": {
                    pointF2 = ltE.Zh(jsonReader0, f);
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        if(z) {
            object0 = object1;
            interpolator0 = Owx.PjT;
        }
        else {
            interpolator0 = pointF0 == null || pointF1 == null ? Owx.PjT : Owx.PjT(pointF0, pointF1);
        }
        PjT pjT0 = new PjT(xX0, object1, object0, interpolator0, f1, null);
        pjT0.Au = pointF2;
        pjT0.SM = pointF3;
        return pjT0;
    }

    private static WeakReference PjT(int v) {
        synchronized(Owx.class) {
            return (WeakReference)Owx.PjT().get(v);
        }
    }

    private static void PjT(int v, WeakReference weakReference0) {
        synchronized(Owx.class) {
            Owx.Zh.put(v, weakReference0);
        }
    }

    private static PjT Zh(XX xX0, JsonReader jsonReader0, float f, IJ iJ0) throws IOException {
        Object object3;
        Interpolator interpolator2;
        Interpolator interpolator1;
        Interpolator interpolator0;
        PointF pointF8;
        Object object2;
        PointF pointF9;
        jsonReader0.beginObject();
        PointF pointF0 = null;
        PointF pointF1 = null;
        PointF pointF2 = null;
        boolean z = false;
        PointF pointF3 = null;
        PointF pointF4 = null;
        PointF pointF5 = null;
        Object object0 = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        float f1 = 0.0f;
        Object object1 = null;
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            switch(s.hashCode()) {
                case 101: {
                    pointF8 = pointF2;
                    if(s.equals("e")) {
                        object1 = iJ0.Zh(jsonReader0, f);
                        pointF2 = pointF8;
                        continue;
                    }
                    break;
                }
                case 104: {
                    pointF8 = pointF2;
                    if(s.equals("h")) {
                        z = jsonReader0.nextInt() == 1;
                        goto label_145;
                    }
                    break;
                }
                case 105: {
                    pointF8 = pointF2;
                    if(s.equals("i")) {
                        if(jsonReader0.peek() == JsonToken.BEGIN_OBJECT) {
                            jsonReader0.beginObject();
                            float f2 = 0.0f;
                            float f3 = 0.0f;
                            float f4 = 0.0f;
                            float f5 = 0.0f;
                            while(jsonReader0.hasNext()) {
                                String s1 = jsonReader0.nextName();
                                s1.hashCode();
                                if(s1.equals("x")) {
                                label_53:
                                    JsonToken jsonToken2 = jsonReader0.peek();
                                    JsonToken jsonToken3 = JsonToken.NUMBER;
                                    if(jsonToken2 == jsonToken3) {
                                        f4 = (float)jsonReader0.nextDouble();
                                        f2 = f4;
                                        continue;
                                    }
                                    else {
                                        jsonReader0.beginArray();
                                        f2 = (float)jsonReader0.nextDouble();
                                        f4 = jsonReader0.peek() == jsonToken3 ? ((float)jsonReader0.nextDouble()) : f2;
                                    }
                                }
                                else {
                                    if(s1.equals("y")) {
                                        JsonToken jsonToken0 = jsonReader0.peek();
                                        JsonToken jsonToken1 = JsonToken.NUMBER;
                                        if(jsonToken0 == jsonToken1) {
                                            f5 = (float)jsonReader0.nextDouble();
                                            f3 = f5;
                                            continue;
                                        }
                                        else {
                                            jsonReader0.beginArray();
                                            f3 = (float)jsonReader0.nextDouble();
                                            f5 = jsonReader0.peek() == jsonToken1 ? ((float)jsonReader0.nextDouble()) : f3;
                                            goto label_62;
                                        }
                                    }
                                    else {
                                        jsonReader0.skipValue();
                                        continue;
                                    }
                                    goto label_53;
                                }
                            label_62:
                                jsonReader0.endArray();
                            }
                            pointF7 = new PointF(f2, f3);
                            pointF0 = new PointF(f4, f5);
                            jsonReader0.endObject();
                        }
                        else {
                            pointF4 = ltE.Zh(jsonReader0, f);
                        }
                        goto label_145;
                    }
                    break;
                }
                case 0x6F: {
                    pointF8 = pointF2;
                    if(s.equals("o")) {
                        if(jsonReader0.peek() == JsonToken.BEGIN_OBJECT) {
                            jsonReader0.beginObject();
                            float f6 = 0.0f;
                            float f7 = 0.0f;
                            float f8 = 0.0f;
                            float f9 = 0.0f;
                            while(jsonReader0.hasNext()) {
                                String s2 = jsonReader0.nextName();
                                s2.hashCode();
                                if(s2.equals("x")) {
                                label_100:
                                    JsonToken jsonToken6 = jsonReader0.peek();
                                    JsonToken jsonToken7 = JsonToken.NUMBER;
                                    if(jsonToken6 == jsonToken7) {
                                        f8 = (float)jsonReader0.nextDouble();
                                        f6 = f8;
                                        continue;
                                    }
                                    else {
                                        jsonReader0.beginArray();
                                        f6 = (float)jsonReader0.nextDouble();
                                        f8 = jsonReader0.peek() == jsonToken7 ? ((float)jsonReader0.nextDouble()) : f6;
                                    }
                                }
                                else {
                                    if(s2.equals("y")) {
                                        JsonToken jsonToken4 = jsonReader0.peek();
                                        JsonToken jsonToken5 = JsonToken.NUMBER;
                                        if(jsonToken4 == jsonToken5) {
                                            f9 = (float)jsonReader0.nextDouble();
                                            f7 = f9;
                                            continue;
                                        }
                                        else {
                                            jsonReader0.beginArray();
                                            float f10 = (float)jsonReader0.nextDouble();
                                            if(jsonReader0.peek() == jsonToken5) {
                                                f7 = f10;
                                                f9 = (float)jsonReader0.nextDouble();
                                            }
                                            else {
                                                f7 = f10;
                                                f9 = f7;
                                            }
                                            goto label_109;
                                        }
                                    }
                                    else {
                                        jsonReader0.skipValue();
                                        continue;
                                    }
                                    goto label_100;
                                }
                            label_109:
                                jsonReader0.endArray();
                            }
                            pointF9 = pointF1;
                            object2 = object0;
                            PointF pointF10 = new PointF(f6, f7);
                            PointF pointF11 = new PointF(f8, f9);
                            jsonReader0.endObject();
                            pointF5 = pointF10;
                            pointF6 = pointF11;
                        }
                        else {
                            pointF9 = pointF1;
                            object2 = object0;
                            pointF3 = ltE.Zh(jsonReader0, f);
                        }
                        pointF1 = pointF9;
                        pointF2 = pointF8;
                        object0 = object2;
                        continue;
                    }
                    break;
                }
                case 0x73: {
                    pointF8 = pointF2;
                    if(s.equals("s")) {
                        object0 = iJ0.Zh(jsonReader0, f);
                        goto label_145;
                    }
                    break;
                }
                case 0x74: {
                    pointF8 = pointF2;
                    if(s.equals("t")) {
                        f1 = (float)jsonReader0.nextDouble();
                        pointF2 = pointF8;
                        continue;
                    }
                    break;
                }
                case 3701: {
                    if(s.equals("ti")) {
                        pointF2 = ltE.Zh(jsonReader0, f);
                        continue;
                    }
                    else {
                        pointF8 = pointF2;
                        break;
                    }
                    goto label_140;
                }
                case 3707: {
                label_140:
                    pointF8 = pointF2;
                    if(s.equals("to")) {
                        pointF1 = ltE.Zh(jsonReader0, f);
                        goto label_145;
                    }
                    break;
                }
                default: {
                    pointF8 = pointF2;
                }
            }
            jsonReader0.skipValue();
        label_145:
            pointF2 = pointF8;
        }
        jsonReader0.endObject();
        if(z) {
            object1 = object0;
            interpolator0 = Owx.PjT;
            object3 = object1;
            interpolator1 = null;
            interpolator2 = null;
        }
        else if(pointF3 != null && pointF4 != null) {
            interpolator0 = Owx.PjT(pointF3, pointF4);
            object3 = object1;
            interpolator1 = null;
            interpolator2 = null;
        }
        else if(pointF5 == null || pointF6 == null || pointF7 == null || pointF0 == null) {
            interpolator0 = Owx.PjT;
            object3 = object1;
            interpolator1 = null;
            interpolator2 = null;
        }
        else {
            interpolator1 = Owx.PjT(pointF5, pointF7);
            interpolator2 = Owx.PjT(pointF6, pointF0);
            object3 = object1;
            interpolator0 = null;
        }
        PjT pjT0 = interpolator1 == null || interpolator2 == null ? new PjT(xX0, object0, object3, interpolator0, f1, null) : new PjT(xX0, object0, object3, interpolator1, interpolator2, f1, null);
        pjT0.Au = pointF1;
        pjT0.SM = pointF2;
        return pjT0;
    }
}

