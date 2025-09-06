package com.bykv.vk.openvk.preload.geckox.utils;

import com.bykv.vk.openvk.preload.geckox.b;
import java.util.concurrent.Executor;

public class f implements Executor {
    private static volatile f a;

    public static f a() {
        if(f.a == null) {
            Class class0 = f.class;
            __monitor_enter(class0);
            try {
                if(f.a == null) {
                    f.a = new f();
                }
                __monitor_exit(class0);
                return f.a;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return f.a;
    }

    @Override
    public void execute(Runnable runnable0) {
        b.t().execute(runnable0);
    }
}

