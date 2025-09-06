package com.kakao.adfit.common.matrix.transport;

import com.kakao.adfit.g.c;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public final class f implements RejectedExecutionHandler {
    public final c a;

    public f(c c0) {
        this.a = c0;
    }

    @Override
    public final void rejectedExecution(Runnable runnable0, ThreadPoolExecutor threadPoolExecutor0) {
        b.a(this.a, runnable0, threadPoolExecutor0);
    }
}

