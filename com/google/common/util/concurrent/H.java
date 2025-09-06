package com.google.common.util.concurrent;

import J1.c;
import J1.d;
import com.google.common.base.Q;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@c
@d
@N
public abstract class h implements L0 {
    static class a {
    }

    final class b extends p {
        final h p;

        private b() {
        }

        b(a h$a0) {
        }

        // 检测为 Lambda 实现
        private void B() [...]

        // 检测为 Lambda 实现
        private void C() [...]

        @Override  // com.google.common.util.concurrent.p
        protected final void n() {
            C0.q(h.this.l(), h.this.a).execute(() -> try {
                h.this.p();
                this.v();
            }
            catch(Throwable throwable0) {
                H0.b(throwable0);
                this.u(throwable0);
            });
        }

        @Override  // com.google.common.util.concurrent.p
        protected final void o() {
            C0.q(h.this.l(), h.this.a).execute(() -> try {
                h.this.o();
                this.w();
            }
            catch(Throwable throwable0) {
                H0.b(throwable0);
                this.u(throwable0);
            });
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.common.util.concurrent.p
        public String toString() {
            return "h [NEW]";
        }
    }

    final class com.google.common.util.concurrent.h.c implements Q {
        final h a;

        private com.google.common.util.concurrent.h.c() {
        }

        com.google.common.util.concurrent.h.c(a h$a0) {
        }

        // 去混淆评级： 低(40)
        public String a() {
            return "h " + h.this.h();
        }

        @Override  // com.google.common.base.Q
        public Object get() {
            return this.a();
        }
    }

    private final Q a;
    private final L0 b;

    protected h() {
        this.a = new com.google.common.util.concurrent.h.c(this, null);
        this.b = new b(this, null);
    }

    @Override  // com.google.common.util.concurrent.L0
    public final void a(com.google.common.util.concurrent.L0.a l0$a0, Executor executor0) {
        this.b.a(l0$a0, executor0);
    }

    @Override  // com.google.common.util.concurrent.L0
    public final void b(long v, TimeUnit timeUnit0) throws TimeoutException {
        this.b.b(v, timeUnit0);
    }

    @Override  // com.google.common.util.concurrent.L0
    public final void c(long v, TimeUnit timeUnit0) throws TimeoutException {
        this.b.c(v, timeUnit0);
    }

    @Override  // com.google.common.util.concurrent.L0
    public final void d() {
        this.b.d();
    }

    @Override  // com.google.common.util.concurrent.L0
    public final Throwable e() {
        return this.b.e();
    }

    @Override  // com.google.common.util.concurrent.L0
    public final void f() {
        this.b.f();
    }

    @Override  // com.google.common.util.concurrent.L0
    @O1.a
    public final L0 g() {
        this.b.g();
        return this;
    }

    @Override  // com.google.common.util.concurrent.L0
    public final com.google.common.util.concurrent.L0.b h() {
        return this.b.h();
    }

    @Override  // com.google.common.util.concurrent.L0
    @O1.a
    public final L0 i() {
        this.b.i();
        return this;
    }

    @Override  // com.google.common.util.concurrent.L0
    public final boolean isRunning() {
        return this.b.isRunning();
    }

    protected Executor l() {
        return (Runnable runnable0) -> C0.n(((String)this.a.get()), runnable0).start();
    }

    // 检测为 Lambda 实现
    private void m(Runnable runnable0) [...]

    protected String n() [...] // 潜在的解密器

    protected abstract void o() throws Exception;

    protected abstract void p() throws Exception;

    // 去混淆评级： 低(40)
    @Override
    public String toString() [...] // 潜在的解密器
}

