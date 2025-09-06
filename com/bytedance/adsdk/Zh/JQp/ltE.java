package com.bytedance.adsdk.Zh.JQp;

import android.graphics.Color;
import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class ltE {
    private static PointF JQp(JsonReader jsonReader0, float f) throws IOException {
        jsonReader0.beginObject();
        float f1 = 0.0f;
        float f2 = 0.0f;
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            if(s.equals("x")) {
                f1 = ltE.Zh(jsonReader0);
            }
            else if(s.equals("y")) {
                f2 = ltE.Zh(jsonReader0);
            }
            else {
                jsonReader0.skipValue();
            }
        }
        jsonReader0.endObject();
        return new PointF(f1 * f, f2 * f);
    }

    static int PjT(JsonReader jsonReader0) throws IOException {
        jsonReader0.beginArray();
        double f = jsonReader0.nextDouble();
        double f1 = jsonReader0.nextDouble();
        double f2 = jsonReader0.nextDouble();
        while(jsonReader0.hasNext()) {
            jsonReader0.skipValue();
        }
        jsonReader0.endArray();
        return Color.argb(0xFF, ((int)(f * 255.0)), ((int)(f1 * 255.0)), ((int)(f2 * 255.0)));
    }

    static List PjT(JsonReader jsonReader0, float f) throws IOException {
        List list0 = new ArrayList();
        jsonReader0.beginArray();
        while(jsonReader0.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader0.beginArray();
            list0.add(ltE.Zh(jsonReader0, f));
            jsonReader0.endArray();
        }
        jsonReader0.endArray();
        return list0;
    }

    private static PointF ReZ(JsonReader jsonReader0, float f) throws IOException {
        float f1 = (float)jsonReader0.nextDouble();
        float f2 = (float)jsonReader0.nextDouble();
        while(jsonReader0.hasNext()) {
            jsonReader0.skipValue();
        }
        return new PointF(f1 * f, f2 * f);
    }

    static float Zh(JsonReader jsonReader0) throws IOException {
        JsonToken jsonToken0 = jsonReader0.peek();
        switch(com.bytedance.adsdk.Zh.JQp.ltE.1.PjT[jsonToken0.ordinal()]) {
            case 1: {
                return (float)jsonReader0.nextDouble();
            }
            case 2: {
                jsonReader0.beginArray();
                float f = (float)jsonReader0.nextDouble();
                while(jsonReader0.hasNext()) {
                    jsonReader0.skipValue();
                }
                jsonReader0.endArray();
                return f;
            }
            default: {
                throw new IllegalArgumentException("Unknown value for token of type " + jsonToken0);
            }
        }
    }

    static PointF Zh(JsonReader jsonReader0, float f) throws IOException {
        switch(com.bytedance.adsdk.Zh.JQp.ltE.1.PjT[jsonReader0.peek().ordinal()]) {
            case 1: {
                return ltE.ReZ(jsonReader0, f);
            }
            case 2: {
                return ltE.cr(jsonReader0, f);
            }
            case 3: {
                return ltE.JQp(jsonReader0, f);
            }
            default: {
                throw new IllegalArgumentException("Unknown point starts with " + jsonReader0.peek());
            }
        }
    }

    private static PointF cr(JsonReader jsonReader0, float f) throws IOException {
        jsonReader0.beginArray();
        float f1 = (float)jsonReader0.nextDouble();
        float f2 = (float)jsonReader0.nextDouble();
        while(jsonReader0.peek() != JsonToken.END_ARRAY) {
            jsonReader0.skipValue();
        }
        jsonReader0.endArray();
        return new PointF(f1 * f, f2 * f);
    }

    class com.bytedance.adsdk.Zh.JQp.ltE.1 {
        static final int[] PjT;

        static {
            int[] arr_v = new int[JsonToken.values().length];
            com.bytedance.adsdk.Zh.JQp.ltE.1.PjT = arr_v;
            try {
                arr_v[JsonToken.NUMBER.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bytedance.adsdk.Zh.JQp.ltE.1.PjT[JsonToken.BEGIN_ARRAY.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.bytedance.adsdk.Zh.JQp.ltE.1.PjT[JsonToken.BEGIN_OBJECT.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

}

