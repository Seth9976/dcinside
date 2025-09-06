package com.apm.insight.d;

import android.content.Context;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.e;
import com.apm.insight.k.d;
import com.apm.insight.runtime.a.f;
import com.apm.insight.runtime.m;
import java.util.Map;
import org.json.JSONObject;

public final class a {
    public String a;
    public long b;

    public static void a(String s) {
        a.a(s, null, null, null);
    }

    public static void a(String s, @Nullable Map map0, @Nullable Map map1, @Nullable com.apm.insight.b.h.a h$a0) {
        a.a(s, map0, map1, null, h$a0);
    }

    public static void a(String s, @Nullable Map map0, @Nullable Map map1, @Nullable Map map2, @Nullable com.apm.insight.b.h.a h$a0) {
        try {
            m.a().a(new Runnable() {
                @Override
                public final void run() {
                    try {
                        Context context0 = e.g();
                        long v = System.currentTimeMillis();
                        String s = s;
                        com.apm.insight.entity.a a0 = new com.apm.insight.entity.a();
                        a0.a("is_dart", 1);
                        a0.a("crash_time", v);
                        a0.a("process_name", com.apm.insight.l.a.d(context0));
                        a0.a("data", s);
                        com.apm.insight.l.a.a(context0, a0.c());
                        com.apm.insight.entity.a a1 = f.a().a(CrashType.DART, a0);
                        if(map0 != null) {
                            JSONObject jSONObject0 = a1.c().optJSONObject("custom");
                            if(jSONObject0 == null) {
                                jSONObject0 = new JSONObject();
                            }
                            com.apm.insight.entity.a.a(jSONObject0, map0);
                            a1.a("custom", jSONObject0);
                        }
                        if(map1 != null) {
                            JSONObject jSONObject1 = a1.c().optJSONObject("custom_long");
                            if(jSONObject1 == null) {
                                jSONObject1 = new JSONObject();
                            }
                            com.apm.insight.entity.a.a(jSONObject1, map1);
                            a1.a("custom_long", jSONObject1);
                        }
                        if(map2 != null) {
                            JSONObject jSONObject2 = a1.c().optJSONObject("filters");
                            if(jSONObject2 == null) {
                                jSONObject2 = new JSONObject();
                                a1.a("filters", jSONObject2);
                            }
                            com.apm.insight.entity.a.a(jSONObject2, map2);
                        }
                        d.a().a(a1.c());
                    }
                    catch(Throwable unused_ex) {
                    }
                }
            });
        }
        catch(Throwable unused_ex) {
        }
    }

    public static a b(String s) {
        a a0 = new a();
        a0.a = s;
        a0.b = System.currentTimeMillis();
        return a0;
    }
}

