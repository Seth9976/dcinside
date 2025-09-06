package com.bytedance.adsdk.Zh.JQp;

import android.graphics.Rect;
import android.util.JsonReader;
import android.util.LongSparseArray;
import android.util.SparseArray;
import com.bytedance.adsdk.Zh.DWo;
import com.bytedance.adsdk.Zh.ReZ.ReZ.JQp;
import com.bytedance.adsdk.Zh.ReZ.cr;
import com.bytedance.adsdk.Zh.XX.PjT;
import com.bytedance.adsdk.Zh.XX.ReZ;
import com.bytedance.adsdk.Zh.XX.Zh;
import com.bytedance.adsdk.Zh.XX;
import com.bytedance.adsdk.Zh.cz.cz;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class tT {
    public static XX PjT(JsonReader jsonReader0) throws IOException {
        float f = cz.PjT();
        LongSparseArray longSparseArray0 = new LongSparseArray();
        ArrayList arrayList0 = new ArrayList();
        HashMap hashMap0 = new HashMap();
        HashMap hashMap1 = new HashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList1 = new ArrayList();
        SparseArray sparseArray0 = new SparseArray();
        ReZ xX$ReZ0 = new ReZ();
        PjT xX$PjT0 = new PjT();
        Zh xX$Zh0 = new Zh();
        XX xX0 = new XX();
        jsonReader0.beginObject();
        String s = null;
        float f1 = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int v = 0;
        int v1 = 0;
        while(jsonReader0.hasNext()) {
            String s1 = jsonReader0.nextName();
            s1.hashCode();
            switch(s1) {
                case "assets": {
                    tT.PjT(jsonReader0, xX0, hashMap0, hashMap1);
                    break;
                }
                case "chars": {
                    tT.PjT(jsonReader0, xX0, sparseArray0);
                    break;
                }
                case "dl": {
                    s = jsonReader0.nextString();
                    break;
                }
                case "fonts": {
                    tT.PjT(jsonReader0, hashMap2);
                    break;
                }
                case "fr": {
                    f3 = (float)jsonReader0.nextDouble();
                    break;
                }
                case "gc": {
                    tT.PjT(jsonReader0, xX$PjT0);
                    break;
                }
                case "globalEvent": {
                    tT.PjT(jsonReader0, xX$Zh0);
                    break;
                }
                case "h": {
                    v1 = jsonReader0.nextInt();
                    break;
                }
                case "ip": {
                    f2 = (float)jsonReader0.nextDouble();
                    break;
                }
                case "layers": {
                    tT.PjT(jsonReader0, xX0, arrayList0, longSparseArray0);
                    break;
                }
                case "markers": {
                    tT.PjT(jsonReader0, arrayList1);
                    break;
                }
                case "op": {
                    f1 = ((float)jsonReader0.nextDouble()) - 0.01f;
                    break;
                }
                case "timer": {
                    tT.PjT(jsonReader0, xX$ReZ0);
                    break;
                }
                case "v": {
                    String[] arr_s = jsonReader0.nextString().split("\\.");
                    if(cz.PjT(Integer.parseInt(arr_s[0]), Integer.parseInt(arr_s[1]), Integer.parseInt(arr_s[2]), 4, 4, 0)) {
                        continue;
                    }
                    xX0.PjT("Lottie only supports bodymovin >= 4.4.0");
                    break;
                }
                case "w": {
                    v = jsonReader0.nextInt();
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        jsonReader0.endObject();
        xX0.PjT(new Rect(0, 0, ((int)(((float)v) * f)), ((int)(((float)v1) * f))), f2, f1, f3, arrayList0, longSparseArray0, hashMap0, hashMap1, sparseArray0, hashMap2, arrayList1, xX$ReZ0, s, xX$PjT0, xX$Zh0);
        return xX0;
    }

    // This method was un-flattened
    private static void PjT(JsonReader jsonReader0, PjT xX$PjT0) {
        try {
            jsonReader0.beginObject();
            while(jsonReader0.hasNext()) {
                switch(jsonReader0.nextName()) {
                    case "be": {
                        xX$PjT0.Zh = tT.Zh(jsonReader0);
                        break;
                    }
                    case "cpf": {
                        tT.Zh(jsonReader0, xX$PjT0);
                        break;
                    }
                    case "ee": {
                        xX$PjT0.ReZ = tT.Zh(jsonReader0);
                        break;
                    }
                    case "pc": {
                        xX$PjT0.cr = jsonReader0.nextInt();
                        break;
                    }
                    case "se": {
                        xX$PjT0.PjT = jsonReader0.nextInt();
                        break;
                    }
                    default: {
                        jsonReader0.skipValue();
                    }
                }
            }
            jsonReader0.endObject();
        }
        catch(Exception unused_ex) {
        }
    }

    // This method was un-flattened
    private static void PjT(JsonReader jsonReader0, ReZ xX$ReZ0) {
        try {
            jsonReader0.beginObject();
            while(jsonReader0.hasNext()) {
            alab1:
                switch(jsonReader0.nextName()) {
                    case "at": {
                        xX$ReZ0.cr = jsonReader0.nextString();
                        continue;
                    }
                    case "el": {
                        xX$ReZ0.cz = jsonReader0.nextString();
                        continue;
                    }
                    case "id": {
                        xX$ReZ0.Zh = jsonReader0.nextString();
                        continue;
                    }
                    case "inel": {
                        xX$ReZ0.JQp = new int[]{-1, -1};
                        jsonReader0.beginArray();
                        for(int v = 0; true; ++v) {
                            if(v >= 2) {
                                break alab1;
                            }
                            if(jsonReader0.hasNext()) {
                                int[] arr_v = xX$ReZ0.JQp;
                                arr_v[v] = jsonReader0.nextInt();
                            }
                        }
                    }
                    case "ke": {
                        xX$ReZ0.PjT = jsonReader0.nextInt();
                        continue;
                    }
                    case "lel": {
                        xX$ReZ0.XX = tT.ReZ(jsonReader0);
                        continue;
                    }
                    case "tl": {
                        xX$ReZ0.ReZ = jsonReader0.nextString();
                        continue;
                    }
                    default: {
                        jsonReader0.skipValue();
                        continue;
                    }
                }
                jsonReader0.endArray();
            }
            jsonReader0.endObject();
        }
        catch(Exception unused_ex) {
        }
    }

    // This method was un-flattened
    private static void PjT(JsonReader jsonReader0, Zh xX$Zh0) {
        try {
            jsonReader0.beginObject();
            while(jsonReader0.hasNext()) {
                switch(jsonReader0.nextName()) {
                    case "el": {
                        xX$Zh0.PjT = jsonReader0.nextString();
                        continue;
                    }
                    case "inel": {
                        xX$Zh0.Zh = new int[][]{new int[]{-1, -1}};
                        jsonReader0.beginArray();
                        if(jsonReader0.hasNext()) {
                            jsonReader0.beginArray();
                            for(int v = 0; v < 2; ++v) {
                                if(jsonReader0.hasNext()) {
                                    int[] arr_v = xX$Zh0.Zh[0];
                                    arr_v[v] = jsonReader0.nextInt();
                                }
                            }
                            jsonReader0.endArray();
                        }
                        break;
                    }
                    case "lel": {
                        xX$Zh0.ReZ = tT.ReZ(jsonReader0);
                        continue;
                    }
                    default: {
                        jsonReader0.skipValue();
                        continue;
                    }
                }
                jsonReader0.endArray();
            }
            jsonReader0.endObject();
        }
        catch(Exception unused_ex) {
        }
    }

    private static void PjT(JsonReader jsonReader0, XX xX0, SparseArray sparseArray0) throws IOException {
        jsonReader0.beginArray();
        while(jsonReader0.hasNext()) {
            cr cr0 = xs.PjT(jsonReader0, xX0);
            sparseArray0.put(cr0.hashCode(), cr0);
        }
        jsonReader0.endArray();
    }

    private static void PjT(JsonReader jsonReader0, XX xX0, List list0, LongSparseArray longSparseArray0) throws IOException {
        jsonReader0.beginArray();
        while(jsonReader0.hasNext()) {
            JQp jQp0 = Sks.PjT(jsonReader0, xX0);
            list0.add(jQp0);
            longSparseArray0.put(jQp0.JQp(), jQp0);
        }
        jsonReader0.endArray();
    }

    // This method was un-flattened
    private static void PjT(JsonReader jsonReader0, XX xX0, Map map0, Map map1) throws IOException {
        int[][] arr2_v1;
        jsonReader0.beginArray();
        while(jsonReader0.hasNext()) {
            ArrayList arrayList0 = new ArrayList();
            LongSparseArray longSparseArray0 = new LongSparseArray();
            jsonReader0.beginObject();
            String s = null;
            String s1 = null;
            String s2 = null;
            String s3 = null;
            List list0 = null;
            String s4 = null;
            int[][] arr2_v = null;
            JSONArray jSONArray0 = null;
            int v = 0;
            int v1 = 0;
            while(jsonReader0.hasNext()) {
                String s5 = jsonReader0.nextName();
                s5.hashCode();
                switch(s5) {
                    case "el": {
                        s4 = jsonReader0.nextString();
                        continue;
                    }
                    case "h": {
                        v1 = jsonReader0.nextInt();
                        continue;
                    }
                    case "id": {
                        s = jsonReader0.nextString();
                        continue;
                    }
                    case "inel": {
                        arr2_v1 = new int[][]{new int[]{-1, -1}};
                        jsonReader0.beginArray();
                        if(jsonReader0.hasNext()) {
                            jsonReader0.beginArray();
                            for(int v2 = 0; v2 < 2; ++v2) {
                                if(jsonReader0.hasNext()) {
                                    int[] arr_v = arr2_v1[0];
                                    arr_v[v2] = jsonReader0.nextInt();
                                }
                            }
                            jsonReader0.endArray();
                        }
                        break;
                    }
                    case "layers": {
                        jsonReader0.beginArray();
                        while(jsonReader0.hasNext()) {
                            JQp jQp0 = Sks.PjT(jsonReader0, xX0);
                            longSparseArray0.put(jQp0.JQp(), jQp0);
                            arrayList0.add(jQp0);
                        }
                        jsonReader0.endArray();
                        continue;
                    }
                    case "lel": {
                        jSONArray0 = tT.ReZ(jsonReader0);
                        continue;
                    }
                    case "p": {
                        s1 = jsonReader0.nextString();
                        continue;
                    }
                    case "rel": {
                        s3 = jsonReader0.nextString();
                        continue;
                    }
                    case "tc": {
                        jsonReader0.beginArray();
                        list0 = tT.cr(jsonReader0);
                        jsonReader0.endArray();
                        continue;
                    }
                    case "u": {
                        s2 = jsonReader0.nextString();
                        continue;
                    }
                    case "w": {
                        v = jsonReader0.nextInt();
                        continue;
                    }
                    default: {
                        jsonReader0.skipValue();
                        continue;
                    }
                }
                jsonReader0.endArray();
                arr2_v = arr2_v1;
            }
            jsonReader0.endObject();
            if(s1 == null) {
                map0.put(s, arrayList0);
            }
            else {
                DWo dWo0 = new DWo(v, v1, s, s1, s2, s3, list0, s4, arr2_v, jSONArray0);
                map1.put(dWo0.Au(), dWo0);
            }
        }
        jsonReader0.endArray();
    }

    private static void PjT(JsonReader jsonReader0, List list0) throws IOException {
        jsonReader0.beginArray();
        while(jsonReader0.hasNext()) {
            jsonReader0.beginObject();
            float f = 0.0f;
            String s = null;
            float f1 = 0.0f;
            while(jsonReader0.hasNext()) {
                String s1 = jsonReader0.nextName();
                s1.hashCode();
                switch(s1) {
                    case "cm": {
                        s = jsonReader0.nextString();
                        break;
                    }
                    case "dr": {
                        f1 = (float)jsonReader0.nextDouble();
                        break;
                    }
                    case "tm": {
                        f = (float)jsonReader0.nextDouble();
                        break;
                    }
                    default: {
                        jsonReader0.skipValue();
                    }
                }
            }
            jsonReader0.endObject();
            list0.add(new com.bytedance.adsdk.Zh.ReZ.cz(s, f, f1));
        }
        jsonReader0.endArray();
    }

    private static void PjT(JsonReader jsonReader0, Map map0) throws IOException {
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            if(s.equals("list")) {
                jsonReader0.beginArray();
                while(jsonReader0.hasNext()) {
                    com.bytedance.adsdk.Zh.ReZ.ReZ reZ0 = fDm.PjT(jsonReader0);
                    map0.put(reZ0.Zh(), reZ0);
                }
                jsonReader0.endArray();
            }
            else {
                jsonReader0.skipValue();
            }
        }
        jsonReader0.endObject();
    }

    // This method was un-flattened
    private static JSONArray ReZ(JsonReader jsonReader0) {
        JSONArray jSONArray0 = new JSONArray();
        try {
            jsonReader0.beginArray();
            while(jsonReader0.hasNext()) {
                JSONObject jSONObject0 = new JSONObject();
                jSONArray0.put(jSONObject0);
                jsonReader0.beginObject();
            label_6:
                if(!jsonReader0.hasNext()) {
                    jsonReader0.endObject();
                    continue;
                }
                switch(jsonReader0.nextName()) {
                    case "hd": {
                        try {
                            jSONObject0.put("hd", jsonReader0.nextInt());
                            break;
                        label_14:
                            jSONObject0.put("vid", jsonReader0.nextString());
                        }
                        catch(JSONException unused_ex) {
                        }
                        break;
                    }
                    case "vid": {
                        goto label_14;
                    }
                    default: {
                        jsonReader0.skipValue();
                    }
                }
                goto label_6;
            }
            jsonReader0.endArray();
        }
        catch(Exception unused_ex) {
        }
        return jSONArray0;
    }

    private static Map Zh(JsonReader jsonReader0) throws IOException {
        Map map0 = new HashMap();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            s.hashCode();
            if(s.equals("lel")) {
                map0.put("lel", tT.ReZ(jsonReader0));
            }
            else if(s.equals("lottie_back")) {
                JSONObject jSONObject0 = new JSONObject();
                map0.put("lottie_back", jSONObject0);
                jsonReader0.beginObject();
                while(jsonReader0.hasNext()) {
                    String s1 = jsonReader0.nextName();
                    s1.hashCode();
                    if(s1.equals("hd")) {
                        try {
                            jSONObject0.putOpt("hd", jsonReader0.nextInt());
                            jSONObject0.putOpt("vid", "lottie_back");
                        }
                        catch(JSONException unused_ex) {
                        }
                    }
                    else {
                        jsonReader0.skipValue();
                    }
                }
                jsonReader0.endObject();
            }
            else {
                jsonReader0.skipValue();
            }
        }
        jsonReader0.endObject();
        Object object0 = map0.remove("lottie_back");
        if(object0 instanceof JSONObject) {
            Object object1 = map0.get("lel");
            if(object1 instanceof JSONArray) {
                ((JSONArray)object1).put(object0);
                return map0;
            }
            JSONArray jSONArray0 = new JSONArray();
            jSONArray0.put(object0);
            map0.put("lel", jSONArray0);
        }
        return map0;
    }

    // This method was un-flattened
    private static void Zh(JsonReader jsonReader0, PjT xX$PjT0) {
        try {
            jsonReader0.beginObject();
            while(jsonReader0.hasNext()) {
                switch(jsonReader0.nextName()) {
                    case "el": {
                        xX$PjT0.cz = jsonReader0.nextString();
                        break;
                    }
                    case "fr": {
                        xX$PjT0.JQp = jsonReader0.nextInt();
                        break;
                    }
                    case "lel": {
                        xX$PjT0.XX = tT.ReZ(jsonReader0);
                        break;
                    }
                    default: {
                        jsonReader0.skipValue();
                    }
                }
            }
            jsonReader0.endObject();
        }
        catch(IOException unused_ex) {
        }
    }

    // This method was un-flattened
    private static List cr(JsonReader jsonReader0) {
        com.bytedance.adsdk.Zh.DWo.PjT dWo$PjT0;
        try {
            List list0 = new ArrayList();
            while(true) {
                if(!jsonReader0.hasNext()) {
                    return list0;
                }
                dWo$PjT0 = new com.bytedance.adsdk.Zh.DWo.PjT();
                jsonReader0.beginObject();
            label_5:
                if(jsonReader0.hasNext()) {
                    break;
                }
                jsonReader0.endObject();
                list0.add(dWo$PjT0);
            }
            switch(jsonReader0.nextName()) {
                case "ali": {
                    dWo$PjT0.XX = jsonReader0.nextString();
                    break;
                }
                case "bs": {
                    dWo$PjT0.cz = jsonReader0.nextInt();
                    break;
                }
                case "c": {
                    dWo$PjT0.ReZ = jsonReader0.nextString();
                    break;
                }
                case "f": {
                    dWo$PjT0.cr = jsonReader0.nextString();
                    break;
                }
                case "l": {
                    dWo$PjT0.PjT = jsonReader0.nextInt();
                    break;
                }
                case "le": {
                    dWo$PjT0.Zh = jsonReader0.nextInt();
                    break;
                }
                case "s": {
                    dWo$PjT0.JQp = jsonReader0.nextInt();
                    break;
                }
                default: {
                    jsonReader0.skipValue();
                }
            }
        }
        catch(Exception unused_ex) {
            return null;
        }
        goto label_5;
    }
}

