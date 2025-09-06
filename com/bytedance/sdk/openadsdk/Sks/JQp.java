package com.bytedance.sdk.openadsdk.Sks;

import android.app.ActivityThread;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

public class JQp implements cr {
    Handler PjT;
    private cr Zh;

    JQp(cr cr0) {
        this.PjT = null;
        this.Zh = cr0;
    }

    private Context Au() {
        ActivityThread.class.getMethod("currentActivityThread", null).setAccessible(true);
        ActivityThread activityThread0 = ActivityThread.currentActivityThread();
        return (Application)activityThread0.getClass().getMethod("getApplication", null).invoke(activityThread0, null);
    }

    @Override  // com.bytedance.sdk.openadsdk.Sks.cr
    public String JQp() {
        return this.Zh == null ? null : this.Zh.JQp();
    }

    @Override  // com.bytedance.sdk.openadsdk.Sks.cr
    public HandlerThread PjT(String s, int v) {
        cr cr0 = this.Zh;
        if(cr0 != null) {
            HandlerThread handlerThread0 = cr0.PjT(s, v);
            if(handlerThread0 != null) {
                return handlerThread0;
            }
        }
        HandlerThread handlerThread1 = new HandlerThread("pag_strategy", -1);
        handlerThread1.start();
        return handlerThread1;
    }

    @Override  // com.bytedance.sdk.openadsdk.Sks.cr
    public ExecutorService PjT() {
        return this.Zh == null || this.Zh.PjT() == null ? Executors.newCachedThreadPool() : this.Zh.PjT();
    }

    @Override  // com.bytedance.sdk.openadsdk.Sks.cr
    public JSONObject PjT(JSONObject jSONObject0) {
        return this.Zh == null ? jSONObject0 : this.Zh.PjT(jSONObject0);
    }

    @Override  // com.bytedance.sdk.openadsdk.Sks.cr
    public String ReZ() {
        return this.Zh == null || TextUtils.isEmpty(this.Zh.ReZ()) ? "null" : this.Zh.ReZ();
    }

    @Override  // com.bytedance.sdk.openadsdk.Sks.cr
    public Map XX() {
        return this.Zh != null && this.Zh.XX() != null ? this.Zh.XX() : new HashMap();
    }

    @Override  // com.bytedance.sdk.openadsdk.Sks.cr
    public Context Zh() {
        return this.Zh == null || this.Zh.Zh() == null ? this.Au() : this.Zh.Zh();
    }

    @Override  // com.bytedance.sdk.openadsdk.Sks.cr
    public Handler cr() {
        if(this.Zh != null && this.Zh.XX() != null) {
            return this.Zh.cr();
        }
        Handler handler0 = new Handler(this.PjT("pag_strategy", -1).getLooper());
        this.PjT = handler0;
        return handler0;
    }

    @Override  // com.bytedance.sdk.openadsdk.Sks.cr
    public JSONObject cz() {
        return this.Zh == null ? null : this.Zh.cz();
    }
}

