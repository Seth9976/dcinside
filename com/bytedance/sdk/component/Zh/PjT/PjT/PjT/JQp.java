package com.bytedance.sdk.component.Zh.PjT.PjT.PjT;

import com.bytedance.sdk.component.Zh.PjT.cr;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class JQp extends cr {
    private ExecutorService PjT;
    private List ReZ;
    private List Zh;
    private AtomicInteger cr;

    public JQp() {
        this.Zh = new CopyOnWriteArrayList();
        this.ReZ = new CopyOnWriteArrayList();
        this.cr = new AtomicInteger(0x40);
        if(this.PjT == null) {
            this.PjT = new ThreadPoolExecutor(0, 0x7FFFFFFF, 20L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() {
                final JQp PjT;

                @Override
                public Thread newThread(Runnable runnable0) {
                    Thread thread0 = new Thread(runnable0, "systemHttp Dispatcher");
                    thread0.setDaemon(false);
                    thread0.setPriority(10);
                    return thread0;
                }
            });
        }
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.cr
    public int PjT() {
        return this.cr.get();
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.cr
    public void PjT(int v) {
        this.cr.set(v);
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.cr
    public List ReZ() {
        return this.Zh;
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.cr
    public ExecutorService Zh() {
        return this.PjT;
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.cr
    public List cr() {
        return this.ReZ;
    }
}

