package com.apm.insight.k;

import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class c {
    public static final class a {
        private JSONObject a;
        private JSONObject b;
        private CrashType c;

        a(JSONObject jSONObject0, CrashType crashType0) {
            this.c = crashType0;
            this.a = crashType0 == CrashType.LAUNCH ? ((JSONArray)jSONObject0.opt("data")).optJSONObject(0) : jSONObject0;
            this.b = jSONObject0.optJSONObject("header");
        }

        @Nullable
        public final String a() {
            return this.a.optString("crash_thread_name", null);
        }

        public final long b() {
            return (long)this.a.optInt("app_start_time", -1);
        }

        @Nullable
        public final String c() {
            switch(this.c) {
                case 1: {
                    return this.a.optString("data", null);
                }
                case 2: {
                    return this.a.optString("stack", null);
                }
                case 3: {
                    return this.a.optString("data", null);
                }
                default: {
                    return null;
                }
            }
        }
    }

    private static ConcurrentLinkedQueue a;

    static {
        c.a = new ConcurrentLinkedQueue();
    }

    static void a(CrashType crashType0, JSONObject jSONObject0) {
        if(c.a != null && !c.a.isEmpty()) {
            new a(jSONObject0, crashType0);
            while(!c.a.isEmpty()) {
                c.a.poll();
            }
            c.a = null;
        }
    }
}

