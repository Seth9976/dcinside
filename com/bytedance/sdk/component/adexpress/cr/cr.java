package com.bytedance.sdk.component.adexpress.cr;

import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.Au.cz;
import com.bytedance.sdk.component.adexpress.PjT.PjT.PjT;
import com.bytedance.sdk.component.adexpress.PjT.PjT.ReZ;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class cr {
    public static ScheduledFuture PjT(Runnable runnable0, long v, TimeUnit timeUnit0) {
        return cz.cz().schedule(runnable0, v, timeUnit0);
    }

    public static void PjT(Au au0, int v) {
        if(au0 == null) {
            return;
        }
        ReZ reZ0 = PjT.PjT().ReZ();
        ExecutorService executorService0 = reZ0 == null ? null : reZ0.fDm();
        if(executorService0 != null) {
            au0.setPriority(v);
            executorService0.execute(au0);
            return;
        }
        cz.PjT(au0, v);
    }

    public static void Zh(Au au0, int v) {
        if(au0 == null) {
            return;
        }
        ReZ reZ0 = PjT.PjT().ReZ();
        ExecutorService executorService0 = reZ0 == null ? null : reZ0.xs();
        if(executorService0 != null) {
            au0.setPriority(v);
            executorService0.execute(au0);
            return;
        }
        cz.PjT(au0);
    }
}

