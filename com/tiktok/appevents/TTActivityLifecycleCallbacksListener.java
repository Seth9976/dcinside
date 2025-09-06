package com.tiktok.appevents;

import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;
import com.tiktok.b.d;
import com.tiktok.b;
import com.tiktok.util.f;
import com.tiktok.util.g;
import org.json.JSONObject;

class TTActivityLifecycleCallbacksListener extends TTLifeCycleCallbacksAdapter {
    private final p a;
    private boolean b;
    private long c;
    private long d;
    private static final String e = "com.tiktok.appevents.TTActivityLifecycleCallbacksListener";
    private static final f f;

    static {
        d b$d0 = b.o();
        TTActivityLifecycleCallbacksListener.f = new f(TTActivityLifecycleCallbacksListener.class.getCanonicalName(), b$d0);
    }

    public TTActivityLifecycleCallbacksListener(p p0) {
        this.b = false;
        this.d = 0L;
        this.a = p0;
        this.c = System.currentTimeMillis();
    }

    private void a(@NonNull long v) {
        try {
            JSONObject jSONObject0 = g.c(v).put("latency", System.currentTimeMillis() - v);
            this.a.I("background", jSONObject0, null);
        }
        catch(Exception unused_ex) {
        }
    }

    private void b(@NonNull long v) {
        try {
            JSONObject jSONObject0 = g.c(v).put("latency", System.currentTimeMillis() - v);
            this.a.I("foreground", jSONObject0, null);
        }
        catch(Exception unused_ex) {
        }
    }

    @Override  // com.tiktok.appevents.TTLifeCycleCallbacksAdapter
    public void m(@NonNull LifecycleOwner lifecycleOwner0) {
        if(this.b) {
            this.a(this.d);
            this.c = System.currentTimeMillis();
            this.a.r(0);
            this.a.L();
            this.a.j.c();
        }
    }

    @Override  // com.tiktok.appevents.TTLifeCycleCallbacksAdapter
    public void n(@NonNull LifecycleOwner lifecycleOwner0) {
        this.b(this.c);
        this.d = System.currentTimeMillis();
        this.a.N();
        this.b = true;
    }

    @Override  // com.tiktok.appevents.TTLifeCycleCallbacksAdapter
    public void onDestroy(@NonNull LifecycleOwner lifecycleOwner0) {
        this.a.N();
    }

    @Override  // com.tiktok.appevents.TTLifeCycleCallbacksAdapter
    public void onStop(@NonNull LifecycleOwner lifecycleOwner0) {
        this.a.J();
        this.a.K();
    }
}

