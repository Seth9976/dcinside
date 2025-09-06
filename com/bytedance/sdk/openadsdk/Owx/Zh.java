package com.bytedance.sdk.openadsdk.Owx;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Zh {
    public interface PjT {
    }

    private PjT JQp;
    private ScheduledExecutorService PjT;
    private long ReZ;
    private Au Zh;
    private int cr;

    public Zh(Au au0, int v) {
        this.PjT = null;
        this.ReZ = 0L;
        this.Zh = au0;
        this.cr = v;
    }

    static PjT JQp(Zh zh0) {
        return zh0.JQp;
    }

    public void PjT() {
        ScheduledExecutorService scheduledExecutorService0 = this.PjT;
        if(scheduledExecutorService0 != null) {
            scheduledExecutorService0.shutdown();
        }
    }

    public void PjT(int v) {
        ScheduledExecutorService scheduledExecutorService0 = Executors.newScheduledThreadPool(1);
        this.PjT = scheduledExecutorService0;
        scheduledExecutorService0.scheduleAtFixedRate(new Runnable() {
            final Zh PjT;

            @Override
            public void run() {
                if(System.currentTimeMillis() - Zh.this.ReZ > ((long)Zh.this.cr)) {
                    Zh.this.PjT.shutdown();
                    if(Zh.this.Zh != null) {
                        Zh.this.Zh.Zh(0, "Automatic detection of stuck");
                    }
                }
            }
        }, 0L, ((long)v), TimeUnit.MILLISECONDS);
    }

    public void PjT(long v) {
        this.ReZ = v;
    }

    public boolean Zh() {
        return this.PjT == null ? true : this.PjT.isShutdown();
    }
}

