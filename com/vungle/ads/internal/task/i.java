package com.vungle.ads.internal.task;

import com.vungle.ads.internal.executor.i.b;
import kotlin.jvm.internal.L;
import y4.l;

public abstract class i implements b {
    @Override
    public int compareTo(@l Object object0) {
        L.p(object0, "other");
        if(object0 instanceof i) {
            int v = this.getPriority();
            return L.t(((i)object0).getPriority(), v);
        }
        return -1;
    }

    public abstract int getPriority();
}

