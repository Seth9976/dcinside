package com.bykv.vk.openvk.preload.geckox.f;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class b {
    private final Map a;
    private AtomicBoolean b;
    private String c;

    public b(Context context0, String s, File file0) {
        this.a = new HashMap();
        this.b = new AtomicBoolean(false);
        if(TextUtils.isEmpty(s)) {
            throw new RuntimeException("access key empty");
        }
        if(file0 == null) {
            this.c = new File(context0.getFilesDir(), "gecko_offline_res_x/" + s).getAbsolutePath();
            return;
        }
        this.c = new File(file0, s).getAbsolutePath();
    }

    public final InputStream a(String s) throws Exception {
        if(this.b.get()) {
            throw new RuntimeException("released");
        }
        if(TextUtils.isEmpty(s)) {
            throw new RuntimeException("relativePath empty");
        }
        return this.d(s.trim()).a(s);
    }

    public final String a() {
        return this.c;
    }

    public final int b(String s) throws Exception {
        if(this.b.get()) {
            throw new RuntimeException("released");
        }
        if(TextUtils.isEmpty(s)) {
            throw new RuntimeException("relativePath empty");
        }
        return this.d(s.trim()).c(s);
    }

    public final Map b() {
        Map map0 = new HashMap();
        Map map1 = this.a;
        __monitor_enter(map1);
        try {
            Collection collection0 = this.a.values();
            if(collection0 == null) {
                __monitor_exit(map1);
                return map0;
            }
            for(Object object0: collection0) {
                map0.put(((a)object0).b(), ((a)object0).a());
            }
            __monitor_exit(map1);
            return map0;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(map1);
        throw throwable0;
    }

    public final void c() throws Exception {
        if(this.b.getAndSet(true)) {
            return;
        }
        GeckoLogger.d("Loader", new Object[]{"release version res loader"});
        Map map0 = this.a;
        __monitor_enter(map0);
        try {
            for(Object object0: this.a.values()) {
                ((a)object0).c();
            }
            this.a.clear();
            __monitor_exit(map0);
            return;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(map0);
        throw throwable0;
    }

    public final boolean c(String s) throws Exception {
        if(this.b.get()) {
            throw new RuntimeException("released");
        }
        if(TextUtils.isEmpty(s)) {
            throw new RuntimeException("relativePath empty");
        }
        return this.d(s.trim()).b(s);
    }

    private a d(String s) {
        int v = s.indexOf("/");
        if(v == -1) {
            new RuntimeException("channel：" + s);
        }
        String s1 = s.substring(0, v);
        Map map0 = this.a;
        __monitor_enter(map0);
        try {
            a a0 = (a)this.a.get(s1);
            if(a0 == null) {
                a0 = new a(this.c, s1);
                this.a.put(s1, a0);
            }
            __monitor_exit(map0);
            return a0;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(map0);
        throw throwable0;
    }
}

