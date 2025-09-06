package com.apm.insight.entity;

import android.os.Environment;
import com.apm.insight.a;
import com.apm.insight.l.f;
import java.io.IOException;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {
    private static String a;
    private static JSONObject b;

    static {
    }

    private static void a() {
        if(d.a == null) {
            d.a = Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/" + "com.dcinside.app.android" + "/AutomationTestInfo.json";
        }
        if(d.b == null) {
            try {
                d.b = new JSONObject(f.a(d.a, "\n"));
            }
            catch(JSONException unused_ex) {
                d.b = new JSONObject();
            }
            catch(IOException unused_ex) {
                d.b = new JSONObject();
            }
        }
    }

    public static void a(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return;
        }
        try {
            d.a();
            JSONObject jSONObject1 = d.b;
            if(jSONObject1 != null) {
                Iterator iterator0 = jSONObject1.keys();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    String s = (String)object0;
                    if(!"slardar_filter".equals(s)) {
                        Object object1 = d.b.opt(s);
                        if(object1 != null) {
                            try {
                                jSONObject0.put(s, object1);
                            }
                            catch(JSONException unused_ex) {
                            }
                        }
                    }
                }
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    public static void b(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return;
        }
        try {
            d.a();
            JSONObject jSONObject1 = d.b;
            if(jSONObject1 != null) {
                JSONObject jSONObject2 = jSONObject1.optJSONObject("slardar_filter");
                if(!a.a(jSONObject2)) {
                    JSONObject jSONObject3 = jSONObject0.optJSONObject("filters");
                    if(jSONObject3 == null) {
                        jSONObject3 = new JSONObject();
                        try {
                            jSONObject0.put("filters", jSONObject3);
                        }
                        catch(JSONException unused_ex) {
                        }
                    }
                    com.apm.insight.entity.a.b(jSONObject3, jSONObject2);
                }
            }
        }
        catch(Throwable unused_ex) {
        }
    }
}

