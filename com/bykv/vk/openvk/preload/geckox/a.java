package com.bykv.vk.openvk.preload.geckox;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONObject;

public final class a {
    private com.bykv.vk.openvk.preload.falconx.a.a a;
    private Queue b;
    private b c;
    private File d;

    private a(b b0) {
        new ArrayList();
        this.a = new com.bykv.vk.openvk.preload.falconx.a.a();
        this.b = new LinkedBlockingQueue();
        this.c = b0;
        File file0 = b0.n();
        this.d = file0;
        file0.mkdirs();
        com.bykv.vk.openvk.preload.geckox.statistic.b.a(this, this.c);
    }

    public static a a(b b0) {
        List list0 = b0.e();
        if(list0 == null || list0.isEmpty()) {
            throw new IllegalArgumentException("access key empty");
        }
        return new a(b0);
    }

    private boolean a() {
        List list0 = this.c.d();
        List list1 = this.c.e();
        if(list0 != null && !list0.isEmpty() && list1 != null && !list1.isEmpty()) {
            for(Object object0: list1) {
                String s = (String)object0;
                boolean z = false;
                for(Object object1: list0) {
                    if(TextUtils.equals(s, ((String)object1))) {
                        z = true;
                    }
                }
                if(!z) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }
        return false;
    }

    public final void a(Class class0, com.bykv.vk.openvk.preload.b.b.a a0) {
        this.a.a(class0, a0);
    }

    public final void a(Map map0) {
        if(TextUtils.isEmpty("default")) {
            throw new IllegalArgumentException("groupType == null");
        }
        if(!this.a()) {
            throw new IllegalArgumentException("deployments keys not in local keys");
        }
        if(!this.b(map0)) {
            throw new IllegalArgumentException("target keys not in deployments keys");
        }
        b.h().execute(new Runnable() {
            private a e;

            @Override
            public final void run() {
                com.bykv.vk.openvk.preload.geckox.a.a.b b0;
                GeckoLogger.d("gecko-debug-tag", new Object[]{"start check update...", "default"});
                if(a.this.c.b() == null) {
                    b0 = null;
                }
                else {
                    b0 = a.this.c.b().a();
                    b0.a(a.this.c.b(), a.this.c.n(), a.this.c.e());
                }
                try {
                    a.this.c.a(new JSONObject());
                    GeckoLogger.d("gecko-debug-tag", new Object[]{"update finished", com.bykv.vk.openvk.preload.geckox.h.a.a(null, a.this.d, a.this.c, a.this.a, null, map0, "default").a("default")});
                }
                catch(Exception exception0) {
                    try {
                        JSONObject jSONObject0 = new JSONObject();
                        jSONObject0.put("success", false);
                        jSONObject0.put("msg", exception0.toString());
                        jSONObject0.put("code", 2);
                        a.this.c.a(jSONObject0);
                    }
                    catch(Throwable unused_ex) {
                    }
                    try {
                        GeckoLogger.w("gecko-debug-tag", "Gecko update failed:", exception0);
                        if(b0 != null) {
                            goto label_17;
                        }
                        goto label_18;
                    }
                    catch(Throwable throwable0) {
                        goto label_26;
                    }
                label_17:
                    b0.a();
                label_18:
                    JSONObject jSONObject1 = a.this.c.f();
                    if(jSONObject1 == null) {
                        jSONObject1 = new JSONObject();
                    }
                    try {
                        jSONObject1.put("download_duration", SystemClock.elapsedRealtime() - a.this.c.s());
                    }
                    catch(Throwable unused_ex) {
                    }
                    a.this.c.q().upload("download_gecko_end", jSONObject1);
                    GeckoLogger.d("gecko-debug-tag", new Object[]{"all channel update finished"});
                    a.d(a.this);
                    return;
                }
                catch(Throwable throwable0) {
                label_26:
                    if(b0 != null) {
                        b0.a();
                    }
                    JSONObject jSONObject2 = a.this.c.f();
                    if(jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                    }
                    try {
                        jSONObject2.put("download_duration", SystemClock.elapsedRealtime() - a.this.c.s());
                    }
                    catch(Throwable unused_ex) {
                    }
                    a.this.c.q().upload("download_gecko_end", jSONObject2);
                    GeckoLogger.d("gecko-debug-tag", new Object[]{"all channel update finished"});
                    throw throwable0;
                }
                if(b0 != null) {
                    b0.a();
                }
                JSONObject jSONObject3 = a.this.c.f();
                if(jSONObject3 == null) {
                    jSONObject3 = new JSONObject();
                }
                try {
                    jSONObject3.put("download_duration", SystemClock.elapsedRealtime() - a.this.c.s());
                }
                catch(Throwable unused_ex) {
                }
                a.this.c.q().upload("download_gecko_end", jSONObject3);
                GeckoLogger.d("gecko-debug-tag", new Object[]{"all channel update finished"});
                a.d(a.this);
            }
        });
    }

    private boolean b(Map map0) {
        if(map0 != null && !map0.isEmpty()) {
            List list0 = this.c.e();
            for(Object object0: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                boolean z = false;
                for(Object object1: list0) {
                    if(TextUtils.equals(((String)object1), ((CharSequence)map$Entry0.getKey()))) {
                        z = true;
                    }
                }
                if(!z) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
        }
        return true;
    }

    static void d(a a0) {
        new ArrayList().addAll(a0.c.e());
        com.bykv.vk.openvk.preload.geckox.a.a a1 = new com.bykv.vk.openvk.preload.geckox.a.a();
        try {
            String s = com.bykv.vk.openvk.preload.geckox.c.b.a().b().a(a1);
            if(a0.c.p() != null && a0.c.p().a()) {
                return;
            }
            if(a0.b.size() < 10) {
                a0.b.add(s);
            }
        }
        catch(Throwable unused_ex) {
        }
    }
}

