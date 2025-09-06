package com.bytedance.sdk.openadsdk;

import android.app.ActivityThread;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.openadsdk.ub.Zh;
import java.util.List;

public class BusMonitorDependWrapper implements Zh {
    private Zh PjT;
    private Handler Zh;

    public BusMonitorDependWrapper(Zh zh0) {
        this.PjT = zh0;
    }

    @Override  // com.bytedance.sdk.openadsdk.ub.Zh
    public Context getContext() {
        return this.PjT == null || this.PjT.getContext() == null ? BusMonitorDependWrapper.getReflectContext() : this.PjT.getContext();
    }

    @Override  // com.bytedance.sdk.openadsdk.ub.Zh
    public Handler getHandler() {
        if(this.PjT != null && this.PjT.getHandler() != null) {
            return this.PjT.getHandler();
        }
        if(this.Zh == null) {
            this.Zh = new Handler(this.getSafeHandlerThread("pag_monitor", 0).getLooper());
        }
        return this.Zh;
    }

    @Override  // com.bytedance.sdk.openadsdk.ub.Zh
    public int getOnceLogCount() {
        return this.PjT == null ? 20 : this.PjT.getOnceLogCount();
    }

    @Override  // com.bytedance.sdk.openadsdk.ub.Zh
    public int getOnceLogInterval() {
        return this.PjT == null ? 1000 : this.PjT.getOnceLogInterval();
    }

    public static Context getReflectContext() {
        ActivityThread.class.getMethod("currentActivityThread", null).setAccessible(true);
        ActivityThread activityThread0 = ActivityThread.currentActivityThread();
        return (Application)activityThread0.getClass().getMethod("getApplication", null).invoke(activityThread0, null);
    }

    @Override  // com.bytedance.sdk.openadsdk.ub.Zh
    public HandlerThread getSafeHandlerThread(String s, int v) {
        Zh zh0 = this.PjT;
        if(zh0 != null) {
            HandlerThread handlerThread0 = zh0.getSafeHandlerThread(s, v);
            if(handlerThread0 != null) {
                return handlerThread0;
            }
        }
        HandlerThread handlerThread1 = new HandlerThread("pag_monitor");
        handlerThread1.start();
        return handlerThread1;
    }

    @Override  // com.bytedance.sdk.openadsdk.ub.Zh
    public int getUploadIntervalTime() {
        Zh zh0 = this.PjT;
        if(zh0 != null) {
            int v = zh0.getUploadIntervalTime();
            return v < 1800000 ? 1800000 : v;
        }
        return 1800000;
    }

    @Override  // com.bytedance.sdk.openadsdk.ub.Zh
    public boolean isMonitorOpen() {
        return this.PjT == null ? false : this.PjT.isMonitorOpen();
    }

    @Override  // com.bytedance.sdk.openadsdk.ub.Zh
    public void onMonitorUpload(List list0) {
        Zh zh0 = this.PjT;
        if(zh0 != null) {
            zh0.onMonitorUpload(list0);
        }
    }
}

