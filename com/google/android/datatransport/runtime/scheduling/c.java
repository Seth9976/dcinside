package com.google.android.datatransport.runtime.scheduling;

import B1.b;
import com.google.android.datatransport.n;
import com.google.android.datatransport.runtime.j;
import com.google.android.datatransport.runtime.r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.y;
import com.google.android.datatransport.runtime.scheduling.persistence.d;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import r3.a;

public class c implements e {
    private final y a;
    private final Executor b;
    private final com.google.android.datatransport.runtime.backends.e c;
    private final d d;
    private final b e;
    private static final Logger f;

    static {
        c.f = Logger.getLogger("com.google.android.datatransport.runtime.w");
    }

    @a
    public c(Executor executor0, com.google.android.datatransport.runtime.backends.e e0, y y0, d d0, b b0) {
        this.b = executor0;
        this.c = e0;
        this.a = y0;
        this.d = d0;
        this.e = b0;
    }

    @Override  // com.google.android.datatransport.runtime.scheduling.e
    public void a(r r0, j j0, n n0) {
        com.google.android.datatransport.runtime.scheduling.a a0 = () -> {
            try {
                String s = r0.b();
                com.google.android.datatransport.runtime.backends.n n1 = this.c.get(s);
                if(n1 == null) {
                    String s1 = String.format("Transport backend \'%s\' is not registered", r0.b());
                    c.f.warning(s1);
                    n0.a(new IllegalArgumentException(s1));
                    return;
                }
                com.google.android.datatransport.runtime.scheduling.b b0 = () -> {
                    this.d.K3(r0, n1.a(j0));
                    this.a.b(r0, 1);
                    return null;
                };
                this.e.e(b0);
                n0.a(null);
                return;
            }
            catch(Exception exception0) {
            }
            c.f.warning("Error scheduling event " + exception0.getMessage());
            n0.a(exception0);
        };
        this.b.execute(a0);
    }

    // 检测为 Lambda 实现
    private Object d(r r0, j j0) [...]

    // 检测为 Lambda 实现
    private void e(r r0, n n0, j j0) [...]
}

