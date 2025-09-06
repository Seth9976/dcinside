package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.d;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class t implements h0 {
    @l
    private final h0 a;
    @m
    private final ScheduledExecutorService b;

    public t(@l h0 h00, @m ScheduledExecutorService scheduledExecutorService0) {
        L.p(h00, "inputProducer");
        super();
        this.a = h00;
        this.b = scheduledExecutorService0;
    }

    @Override  // com.facebook.imagepipeline.producers.h0
    public void a(@l n n0, @l j0 j00) {
        L.p(n0, "consumer");
        L.p(j00, "context");
        d d0 = j00.b();
        ScheduledExecutorService scheduledExecutorService0 = this.b;
        if(scheduledExecutorService0 != null) {
            scheduledExecutorService0.schedule(() -> {
                L.p(this, "this$0");
                L.p(n0, "$consumer");
                L.p(j00, "$context");
                this.a.a(n0, j00);
            }, ((long)d0.h()), TimeUnit.MILLISECONDS);
            return;
        }
        this.a.a(n0, j00);
    }

    // 检测为 Lambda 实现
    private static final void d(t t0, n n0, j0 j00) [...]
}

