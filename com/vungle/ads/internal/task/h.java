package com.vungle.ads.internal.task;

import kotlin.jvm.internal.L;
import y4.l;

public final class h implements k {
    @Override  // com.vungle.ads.internal.task.k
    public int makeAndroidThreadPriority(@l e e0) {
        L.p(e0, "jobInfo");
        return Math.min(19, Math.abs(Math.min(0, e0.getPriority() - 2)) + 10);
    }
}

