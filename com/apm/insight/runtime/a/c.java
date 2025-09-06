package com.apm.insight.runtime.a;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.apm.insight.AttachUserData;
import com.apm.insight.CrashType;
import com.apm.insight.ICommonParams;
import com.apm.insight.e;
import com.apm.insight.l.m;
import com.apm.insight.l.n;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import org.json.JSONObject;

public abstract class c {
    public interface a {
        com.apm.insight.entity.a a(int arg1, com.apm.insight.entity.a arg2);

        com.apm.insight.entity.a b(int arg1, com.apm.insight.entity.a arg2);
    }

    protected CrashType a;
    protected Context b;
    private ICommonParams c;
    private b d;
    private d e;

    c(CrashType crashType0, Context context0, b b0, d d0) {
        this.a = crashType0;
        this.b = context0;
        this.d = b0;
        this.e = d0;
        this.c = e.a().c();
    }

    public int a() {
        return 6;
    }

    public com.apm.insight.entity.a a(int v, com.apm.insight.entity.a a0) {
        if(a0 == null) {
            a0 = new com.apm.insight.entity.a();
        }
        int v1 = 0;
        if(v == 0) {
            this.b(a0);
        }
        else {
            switch(v) {
                case 1: {
                    goto label_6;
                }
                case 2: {
                    goto label_49;
                }
                case 5: {
                    goto label_55;
                }
            }
            return a0;
        label_6:
            this.c(a0);
            List list0 = e.b().a(this.a);
            HashMap hashMap0 = new HashMap();
            JSONObject jSONObject0 = a0.c().optJSONObject("custom");
            if(jSONObject0 == null) {
                jSONObject0 = new JSONObject();
                a0.a("custom", jSONObject0);
            }
            if(list0 != null) {
                for(int v2 = 0; v2 < list0.size(); ++v2) {
                    try {
                        AttachUserData attachUserData0 = (AttachUserData)list0.get(v2);
                        long v3 = SystemClock.uptimeMillis();
                        com.apm.insight.entity.a.a(jSONObject0, attachUserData0.getUserData(this.a));
                        hashMap0.put("custom_cost_" + attachUserData0.getClass().getName() + "_" + hashMap0.size(), ((long)(SystemClock.uptimeMillis() - v3)));
                    }
                    catch(Throwable throwable0) {
                        com.apm.insight.entity.a.a(jSONObject0, throwable0);
                    }
                }
            }
            try {
                jSONObject0.put("fd_count", com.apm.insight.a.f());
            }
            catch(Throwable unused_ex) {
            }
            List list1 = e.b().b(this.a);
            if(list1 != null) {
                JSONObject jSONObject1 = a0.c().optJSONObject("custom_long");
                if(jSONObject1 == null) {
                    jSONObject1 = new JSONObject();
                    a0.a("custom_long", jSONObject1);
                }
                while(v1 < list1.size()) {
                    try {
                        AttachUserData attachUserData1 = (AttachUserData)list1.get(v1);
                        long v4 = SystemClock.uptimeMillis();
                        com.apm.insight.entity.a.a(jSONObject1, attachUserData1.getUserData(this.a));
                        hashMap0.put("custom_cost_" + attachUserData1.getClass().getName() + "_" + hashMap0.size(), ((long)(SystemClock.uptimeMillis() - v4)));
                    }
                    catch(Throwable throwable1) {
                        com.apm.insight.entity.a.a(jSONObject1, throwable1);
                    }
                    ++v1;
                }
            }
            for(Object object0: hashMap0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                try {
                    jSONObject0.put(((String)map$Entry0.getKey()), map$Entry0.getValue());
                }
                catch(Throwable unused_ex) {
                }
            }
            return a0;
        label_49:
            d d0 = this.e;
            if(d0 != null) {
                v1 = d0.a();
            }
            a0.a("battery", v1);
            a0.c(e.b().a());
            return a0;
        label_55:
            if(this.c()) {
                a0.b(n.a());
                return a0;
            }
        }
        return a0;
    }

    public com.apm.insight.entity.a a(com.apm.insight.entity.a a0) {
        return a0;
    }

    public final com.apm.insight.entity.a a(@Nullable com.apm.insight.entity.a a0, @Nullable a c$a0, boolean z) {
        if(a0 == null) {
            a0 = new com.apm.insight.entity.a();
        }
        com.apm.insight.entity.a a1 = a0;
        for(int v = 0; v < this.a(); ++v) {
            long v1 = SystemClock.uptimeMillis();
            if(c$a0 != null) {
                try {
                    a1 = c$a0.a(v, a1);
                }
                catch(Throwable unused_ex) {
                }
            }
            try {
                a1 = this.a(v, a1);
            }
            catch(Throwable unused_ex) {
            }
            if(c$a0 != null) {
                try {
                    this.a();
                    a1 = c$a0.b(v, a1);
                }
                catch(Throwable unused_ex) {
                }
                if(z) {
                    if(v == 0) {
                        a0 = a1;
                    }
                    else {
                        a0.c(a1.c());
                    }
                    a1 = new com.apm.insight.entity.a();
                }
            }
            a0.b("step_cost_" + v, String.valueOf(SystemClock.uptimeMillis() - v1));
        }
        return this.a(a0);
    }

    private com.apm.insight.entity.a b(com.apm.insight.entity.a a0) {
        a0.a(0, e.r());
        try {
            a0.a(this.c.getPluginInfo());
        }
        catch(Throwable throwable0) {
            try {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("Data fetch failed since source misstake:\n" + m.a(throwable0), 0);
                a0.a(hashMap0);
            }
            catch(Throwable unused_ex) {
            }
        }
        a0.b(e.p());
        a0.a("process_name", "");
        return a0;
    }

    protected boolean b() {
        return true;
    }

    private com.apm.insight.entity.a c(com.apm.insight.entity.a a0) {
        if(!com.apm.insight.l.a.c(e.g())) {
            a0.a("remote_process", 1);
        }
        a0.a("pid", Process.myPid());
        a0.a(0L);
        if(this.b()) {
            b b0 = this.d;
            if(b0 != null) {
                a0.a(b0);
            }
        }
        try {
            a0.a(this.c.getPatchInfo());
        }
        catch(Throwable throwable0) {
            try {
                a0.a(Arrays.asList(new String[]{"Data fetch failed since source misstake:\n" + m.a(throwable0)}));
            }
            catch(Throwable unused_ex) {
            }
        }
        a0.a("business", "default");
        a0.a("is_background", Boolean.valueOf(!com.apm.insight.l.a.a(this.b)));
        return a0;
    }

    protected boolean c() {
        return true;
    }
}

