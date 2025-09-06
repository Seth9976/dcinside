package com.google.android.gms.ads.internal.util;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzfbt;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbs {
    @Nullable
    public static Bundle zza(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return null;
        }
        Iterator iterator0 = jSONObject0.keys();
        Bundle bundle0 = new Bundle();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            String s = (String)object0;
            Object object1 = jSONObject0.opt(s);
            if(object1 == null) {
            }
            else if(object1 instanceof Boolean) {
                bundle0.putBoolean(s, ((Boolean)object1).booleanValue());
            }
            else if(object1 instanceof Double) {
                bundle0.putDouble(s, ((double)(((Double)object1))));
            }
            else if(object1 instanceof Integer) {
                bundle0.putInt(s, ((int)(((Integer)object1))));
            }
            else if(object1 instanceof Long) {
                bundle0.putLong(s, ((long)(((Long)object1))));
            }
            else if(object1 instanceof String) {
                bundle0.putString(s, ((String)object1));
            }
            else if(object1 instanceof JSONArray) {
                JSONArray jSONArray0 = (JSONArray)object1;
                if(jSONArray0.length() == 0) {
                    continue;
                }
                int v = jSONArray0.length();
                Object object2 = null;
                for(int v1 = 0; object2 == null && v1 < v; ++v1) {
                    object2 = jSONArray0.isNull(v1) ? null : jSONArray0.opt(v1);
                }
                if(object2 == null) {
                    zzo.zzj(("Expected JSONArray with at least 1 non-null element for key:" + s));
                }
                else if(object2 instanceof JSONObject) {
                    Bundle[] arr_bundle = new Bundle[v];
                    for(int v2 = 0; v2 < v; ++v2) {
                        arr_bundle[v2] = jSONArray0.isNull(v2) ? null : zzbs.zza(jSONArray0.optJSONObject(v2));
                    }
                    bundle0.putParcelableArray(s, arr_bundle);
                }
                else if(object2 instanceof Number) {
                    double[] arr_f = new double[jSONArray0.length()];
                    for(int v3 = 0; v3 < v; ++v3) {
                        arr_f[v3] = jSONArray0.optDouble(v3);
                    }
                    bundle0.putDoubleArray(s, arr_f);
                }
                else if(object2 instanceof CharSequence) {
                    String[] arr_s = new String[v];
                    for(int v4 = 0; v4 < v; ++v4) {
                        arr_s[v4] = jSONArray0.isNull(v4) ? null : jSONArray0.optString(v4);
                    }
                    bundle0.putStringArray(s, arr_s);
                }
                else if(object2 instanceof Boolean) {
                    boolean[] arr_z = new boolean[v];
                    for(int v5 = 0; v5 < v; ++v5) {
                        arr_z[v5] = jSONArray0.optBoolean(v5);
                    }
                    bundle0.putBooleanArray(s, arr_z);
                }
                else {
                    zzo.zzj(String.format("JSONArray with unsupported type %s for key:%s", object2.getClass().getCanonicalName(), s));
                }
            }
            else if(object1 instanceof JSONObject) {
                bundle0.putBundle(s, zzbs.zza(((JSONObject)object1)));
            }
            else {
                zzo.zzj(("Unsupported type for key:" + s));
            }
        }
        return bundle0;
    }

    public static String zzb(String s, JSONObject jSONObject0, String[] arr_s) {
        JSONObject jSONObject1 = zzbs.zzn(jSONObject0, arr_s);
        return jSONObject1 == null ? "" : jSONObject1.optString(arr_s[0], "");
    }

    @NonNull
    public static List zzc(@Nullable JSONArray jSONArray0, @Nullable List list0) throws JSONException {
        if(list0 == null) {
            list0 = new ArrayList();
        }
        if(jSONArray0 != null) {
            for(int v = 0; v < jSONArray0.length(); ++v) {
                list0.add(jSONArray0.getString(v));
            }
        }
        return list0;
    }

    public static List zzd(JsonReader jsonReader0) throws IllegalStateException, IOException {
        List list0 = new ArrayList();
        jsonReader0.beginArray();
        while(jsonReader0.hasNext()) {
            list0.add(jsonReader0.nextString());
        }
        jsonReader0.endArray();
        return list0;
    }

    public static Map zze(JsonReader jsonReader0) throws IOException, IllegalStateException {
        Map map0 = new HashMap();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            HashMap hashMap0 = new HashMap();
            jsonReader0.beginObject();
            while(jsonReader0.hasNext()) {
                hashMap0.put(jsonReader0.nextName(), jsonReader0.nextString());
            }
            jsonReader0.endObject();
            map0.put(s, hashMap0);
        }
        jsonReader0.endObject();
        return map0;
    }

    public static JSONArray zzf(JsonReader jsonReader0) throws IllegalStateException, IOException, JSONException {
        JSONArray jSONArray0 = new JSONArray();
        jsonReader0.beginArray();
        while(jsonReader0.hasNext()) {
            JsonToken jsonToken0 = jsonReader0.peek();
            if(JsonToken.BEGIN_ARRAY.equals(jsonToken0)) {
                jSONArray0.put(zzbs.zzf(jsonReader0));
            }
            else if(JsonToken.BEGIN_OBJECT.equals(jsonToken0)) {
                jSONArray0.put(zzbs.zzi(jsonReader0));
            }
            else if(JsonToken.BOOLEAN.equals(jsonToken0)) {
                jSONArray0.put(jsonReader0.nextBoolean());
            }
            else if(JsonToken.NUMBER.equals(jsonToken0)) {
                jSONArray0.put(jsonReader0.nextDouble());
            }
            else {
                if(!JsonToken.STRING.equals(jsonToken0)) {
                    throw new IllegalStateException("unexpected json token: " + jsonToken0);
                }
                jSONArray0.put(jsonReader0.nextString());
            }
        }
        jsonReader0.endArray();
        return jSONArray0;
    }

    public static JSONObject zzg(JSONObject jSONObject0, String s) throws JSONException {
        try {
            return jSONObject0.getJSONObject(s);
        }
        catch(JSONException unused_ex) {
            JSONObject jSONObject1 = new JSONObject();
            jSONObject0.put(s, jSONObject1);
            return jSONObject1;
        }
    }

    @Nullable
    public static JSONObject zzh(JSONObject jSONObject0, String[] arr_s) {
        JSONObject jSONObject1 = zzbs.zzn(jSONObject0, arr_s);
        return jSONObject1 == null ? null : jSONObject1.optJSONObject(arr_s[1]);
    }

    public static JSONObject zzi(JsonReader jsonReader0) throws IllegalStateException, IOException, JSONException {
        JSONObject jSONObject0 = new JSONObject();
        jsonReader0.beginObject();
        while(jsonReader0.hasNext()) {
            String s = jsonReader0.nextName();
            JsonToken jsonToken0 = jsonReader0.peek();
            if(JsonToken.BEGIN_ARRAY.equals(jsonToken0)) {
                jSONObject0.put(s, zzbs.zzf(jsonReader0));
            }
            else if(JsonToken.BEGIN_OBJECT.equals(jsonToken0)) {
                jSONObject0.put(s, zzbs.zzi(jsonReader0));
            }
            else if(JsonToken.BOOLEAN.equals(jsonToken0)) {
                jSONObject0.put(s, jsonReader0.nextBoolean());
            }
            else if(JsonToken.NUMBER.equals(jsonToken0)) {
                jSONObject0.put(s, jsonReader0.nextDouble());
            }
            else {
                if(!JsonToken.STRING.equals(jsonToken0)) {
                    throw new IllegalStateException("unexpected json token: " + jsonToken0);
                }
                jSONObject0.put(s, jsonReader0.nextString());
            }
        }
        jsonReader0.endObject();
        return jSONObject0;
    }

    public static void zzj(JsonWriter jsonWriter0, JSONArray jSONArray0) throws IOException {
        try {
            jsonWriter0.beginArray();
            for(int v = 0; v < jSONArray0.length(); ++v) {
                Object object0 = jSONArray0.get(v);
                if(object0 instanceof String) {
                    jsonWriter0.value(((String)object0));
                }
                else if(object0 instanceof Number) {
                    jsonWriter0.value(((Number)object0));
                }
                else if(object0 instanceof Boolean) {
                    jsonWriter0.value(((Boolean)object0).booleanValue());
                }
                else if(object0 instanceof JSONObject) {
                    zzbs.zzk(jsonWriter0, ((JSONObject)object0));
                }
                else {
                    if(!(object0 instanceof JSONArray)) {
                        throw new JSONException("unable to write field: " + object0);
                    }
                    zzbs.zzj(jsonWriter0, ((JSONArray)object0));
                }
            }
            jsonWriter0.endArray();
            return;
        }
        catch(JSONException jSONException0) {
        }
        throw new IOException(jSONException0);
    }

    public static void zzk(JsonWriter jsonWriter0, JSONObject jSONObject0) throws IOException {
        try {
            jsonWriter0.beginObject();
            Iterator iterator0 = jSONObject0.keys();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                String s = (String)object0;
                Object object1 = jSONObject0.get(s);
                if(object1 instanceof String) {
                    jsonWriter0.name(s).value(((String)object1));
                }
                else if(object1 instanceof Number) {
                    jsonWriter0.name(s).value(((Number)object1));
                }
                else if(object1 instanceof Boolean) {
                    jsonWriter0.name(s).value(((Boolean)object1).booleanValue());
                }
                else if(object1 instanceof JSONObject) {
                    zzbs.zzk(jsonWriter0.name(s), ((JSONObject)object1));
                }
                else {
                    if(!(object1 instanceof JSONArray)) {
                        throw new JSONException("unable to write field: " + object1);
                    }
                    zzbs.zzj(jsonWriter0.name(s), ((JSONArray)object1));
                }
            }
            jsonWriter0.endObject();
            return;
        }
        catch(JSONException jSONException0) {
        }
        throw new IOException(jSONException0);
    }

    public static boolean zzl(boolean z, JSONObject jSONObject0, String[] arr_s) {
        JSONObject jSONObject1 = zzbs.zzn(jSONObject0, arr_s);
        return jSONObject1 == null ? false : jSONObject1.optBoolean(arr_s[arr_s.length - 1], false);
    }

    public static String zzm(@Nullable zzfbt zzfbt0) {
        if(zzfbt0 != null) {
            StringWriter stringWriter0 = new StringWriter();
            try {
                JsonWriter jsonWriter0 = new JsonWriter(stringWriter0);
                zzbs.zzo(jsonWriter0, zzfbt0);
                jsonWriter0.close();
                return stringWriter0.toString();
            }
            catch(IOException iOException0) {
                zzo.zzh("Error when writing JSON.", iOException0);
            }
        }
        return null;
    }

    @Nullable
    private static JSONObject zzn(JSONObject jSONObject0, String[] arr_s) {
        for(int v = 0; v < arr_s.length - 1; v = 1) {
            if(jSONObject0 == null) {
                return null;
            }
            jSONObject0 = jSONObject0.optJSONObject(arr_s[0]);
        }
        return jSONObject0;
    }

    private static void zzo(JsonWriter jsonWriter0, Object object0) throws IOException {
        if(object0 == null) {
            jsonWriter0.nullValue();
            return;
        }
        if(object0 instanceof Number) {
            jsonWriter0.value(((Number)object0));
            return;
        }
        if(object0 instanceof Boolean) {
            jsonWriter0.value(((Boolean)object0).booleanValue());
            return;
        }
        if(object0 instanceof String) {
            jsonWriter0.value(((String)object0));
            return;
        }
        if(object0 instanceof zzfbt) {
            zzbs.zzk(jsonWriter0, ((zzfbt)object0).zzd);
            return;
        }
        if(object0 instanceof Map) {
            jsonWriter0.beginObject();
            for(Object object1: ((Map)object0).entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object1;
                Object object2 = map$Entry0.getKey();
                if(object2 instanceof String) {
                    Object object3 = map$Entry0.getValue();
                    zzbs.zzo(jsonWriter0.name(((String)object2)), object3);
                }
            }
            jsonWriter0.endObject();
            return;
        }
        if(object0 instanceof List) {
            jsonWriter0.beginArray();
            for(Object object4: ((List)object0)) {
                zzbs.zzo(jsonWriter0, object4);
            }
            jsonWriter0.endArray();
            return;
        }
        jsonWriter0.nullValue();
    }
}

