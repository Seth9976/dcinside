package com.facebook.imagepipeline.core;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.j;

public final class r0 implements ThreadFactory {
    private final int a;
    @l
    private final String b;
    private final boolean c;
    @l
    private final AtomicInteger d;

    @j
    public r0(int v) {
        this(v, null, false, 6, null);
    }

    @j
    public r0(int v, @l String s) {
        L.p(s, "prefix");
        this(v, s, false, 4, null);
    }

    @j
    public r0(int v, @l String s, boolean z) {
        L.p(s, "prefix");
        super();
        this.a = v;
        this.b = s;
        this.c = z;
        this.d = new AtomicInteger(1);
    }

    public r0(int v, String s, boolean z, int v1, w w0) {
        if((v1 & 2) != 0) {
            s = "PriorityThreadFactory";
        }
        if((v1 & 4) != 0) {
            z = true;
        }
        this(v, s, z);
    }

    // 检测为 Lambda 实现
    private static final void b(r0 r00, Runnable runnable0) [...]

    @Override
    @l
    public Thread newThread(@l Runnable runnable0) {
        L.p(runnable0, "runnable");
        q0 q00 = () -> {
            L.p(this, "this$0");
            L.p(runnable0, "$runnable");
            try {
                Process.setThreadPriority(this.a);
            }
            catch(Throwable unused_ex) {
            }
            runnable0.run();
        };
        if(this.c) {
            int v = this.d.getAndIncrement();
            return new Thread(q00, this.b + "-" + v);
        }
        return new Thread(q00, this.b);
    }
}

