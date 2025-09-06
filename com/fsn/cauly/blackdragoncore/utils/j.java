package com.fsn.cauly.blackdragoncore.utils;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class j {
    public static long a(Context context0, String s, long v) {
        return j.d(context0, "Default").getLong(s, v);
    }

    public static String a(Context context0, String s, String s1) {
        return j.d(context0, "Default").getString(s, s1);
    }

    public static void a(Context context0, String s, int v) {
        SharedPreferences.Editor sharedPreferences$Editor0 = j.d(context0, "Default").edit();
        sharedPreferences$Editor0.putInt(s, v);
        sharedPreferences$Editor0.commit();
    }

    public static void a(Context context0, String s, ArrayList arrayList0) {
        if(arrayList0 != null) {
            SharedPreferences.Editor sharedPreferences$Editor0 = j.d(context0, "Default").edit();
            JSONArray jSONArray0 = new JSONArray();
            for(int v = 0; v < arrayList0.size(); ++v) {
                jSONArray0.put(arrayList0.get(v));
            }
            sharedPreferences$Editor0.putString(s, jSONArray0.toString());
            sharedPreferences$Editor0.commit();
        }
    }

    public static void a(Context context0, String s, Map map0) {
        SharedPreferences sharedPreferences0 = j.d(context0, "Default");
        if(sharedPreferences0 != null) {
            String s1 = new JSONObject(map0).toString();
            SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
            sharedPreferences$Editor0.remove(s).commit();
            sharedPreferences$Editor0.putString(s, s1);
            sharedPreferences$Editor0.commit();
        }
    }

    public static boolean a(Context context0, String s) {
        return j.d(context0, "Default").contains(s);
    }

    public static boolean a(Context context0, String s, boolean z) {
        return j.d(context0, "Default").getBoolean(s, z);
    }

    public static ArrayList b(Context context0, String s) {
        ArrayList arrayList0 = new ArrayList();
        String s1 = j.d(context0, "Default").getString(s, null);
        if(s1 != null) {
            try {
                JSONArray jSONArray0 = new JSONArray(s1);
                for(int v = 0; v < jSONArray0.length(); ++v) {
                    arrayList0.add(jSONArray0.optString(v));
                }
                return arrayList0;
            }
            catch(JSONException unused_ex) {
            }
        }
        return arrayList0;
    }

    public static void b(Context context0, String s, long v) {
        SharedPreferences.Editor sharedPreferences$Editor0 = j.d(context0, "Default").edit();
        sharedPreferences$Editor0.putLong(s, v);
        sharedPreferences$Editor0.commit();
    }

    public static void b(Context context0, String s, String s1) {
        SharedPreferences.Editor sharedPreferences$Editor0 = j.d(context0, "Default").edit();
        sharedPreferences$Editor0.putString(s, s1);
        sharedPreferences$Editor0.commit();
    }

    public static void b(Context context0, String s, boolean z) {
        SharedPreferences.Editor sharedPreferences$Editor0 = j.d(context0, "Default").edit();
        sharedPreferences$Editor0.putBoolean(s, z);
        sharedPreferences$Editor0.commit();
    }

    public static Map c(Context context0, String s) {
        Map map0 = new HashMap();
        SharedPreferences sharedPreferences0 = j.d(context0, "Default");
        if(sharedPreferences0 != null) {
            try {
                JSONObject jSONObject0 = new JSONObject(sharedPreferences0.getString(s, "{}"));
                Iterator iterator0 = jSONObject0.keys();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    map0.put(((String)object0), ((String)jSONObject0.get(((String)object0))));
                }
            }
            catch(Exception exception0) {
                exception0.printStackTrace();
            }
        }
        return map0;
    }

    public static SharedPreferences d(Context context0, String s) {
        return context0.getSharedPreferences(s, 0);
    }
}

