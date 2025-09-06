package com.bykv.vk.openvk.preload.geckox.utils;

import com.bykv.vk.openvk.preload.geckox.b;
import java.util.concurrent.Executor;

public class c implements Executor {
    private static volatile c a;

    public static c a() {
        if(c.a == null) {
            Class class0 = c.class;
            __monitor_enter(class0);
            try {
                if(c.a == null) {
                    c.a = new c();
                }
                __monitor_exit(class0);
                return c.a;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return c.a;
    }

    @Override
    public void execute(Runnable runnable0) {
        b.t().execute(runnable0);
    }
}

