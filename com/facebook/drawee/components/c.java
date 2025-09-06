package com.facebook.drawee.components;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import k1.n.a;
import k1.n;

@n(a.a)
public class c {
    public static enum com.facebook.drawee.components.c.a {
        ON_SET_HIERARCHY,
        ON_CLEAR_HIERARCHY,
        ON_SET_CONTROLLER,
        ON_CLEAR_OLD_CONTROLLER,
        ON_CLEAR_CONTROLLER,
        ON_INIT_CONTROLLER,
        ON_ATTACH_CONTROLLER,
        ON_DETACH_CONTROLLER,
        ON_RELEASE_CONTROLLER,
        ON_DATASOURCE_SUBMIT,
        ON_DATASOURCE_RESULT,
        ON_DATASOURCE_RESULT_INT,
        ON_DATASOURCE_FAILURE,
        ON_DATASOURCE_FAILURE_INT,
        ON_HOLDER_ATTACH,
        ON_HOLDER_DETACH,
        ON_DRAWABLE_SHOW,
        ON_DRAWABLE_HIDE,
        ON_ACTIVITY_START,
        ON_ACTIVITY_STOP,
        ON_RUN_CLEAR_CONTROLLER,
        ON_SCHEDULE_CLEAR_CONTROLLER,
        ON_SAME_CONTROLLER_SKIPPED,
        ON_SUBMIT_CACHE_HIT;

    }

    private final Queue a;
    private static final int b = 20;
    private static final c c;
    private static boolean d;

    static {
        c.c = new c();
        c.d = true;
    }

    private c() {
        this.a = new ArrayBlockingQueue(20);
    }

    public static void a() {
        c.d = false;
    }

    // 去混淆评级： 低(20)
    public static c b() {
        return c.d ? new c() : c.c;
    }

    public void c(com.facebook.drawee.components.c.a c$a0) {
        if(!c.d) {
            return;
        }
        for(int v = 5; !this.a.offer(c$a0) && v > 0; --v) {
            this.a.poll();
        }
    }

    @Override
    public String toString() [...] // 潜在的解密器
}

