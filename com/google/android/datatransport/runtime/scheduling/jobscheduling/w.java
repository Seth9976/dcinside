package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import B1.b;
import com.google.android.datatransport.runtime.r;
import com.google.android.datatransport.runtime.scheduling.persistence.d;
import java.util.concurrent.Executor;
import r3.a;

public class w {
    private final Executor a;
    private final d b;
    private final y c;
    private final b d;

    @a
    w(Executor executor0, d d0, y y0, b b0) {
        this.a = executor0;
        this.b = d0;
        this.c = y0;
        this.d = b0;
    }

    public void c() {
        u u0 = () -> {
            v v0 = () -> {
                for(Object object0: this.b.k2()) {
                    this.c.b(((r)object0), 1);
                }
                return null;
            };
            this.d.e(v0);
        };
        this.a.execute(u0);
    }

    // 检测为 Lambda 实现
    private Object d() [...]

    // 检测为 Lambda 实现
    private void e() [...]
}

