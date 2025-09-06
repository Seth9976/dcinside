package com.google.common.util.concurrent;

import J1.c;
import J1.d;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@c
@d
@N
public abstract class e implements L0 {
    class a extends p {
        final e p;

        // 去混淆评级： 低(20)
        // 检测为 Lambda 实现
        private String B() [...]

        // 检测为 Lambda 实现
        private void C() [...]

        @Override  // com.google.common.util.concurrent.p
        protected final void n() {
            C0.q(e.this.l(), () -> // 去混淆评级： 低(20)
            "e").execute(() -> try {
                this.v();
                if(this.isRunning()) {
                    try {
                        e.this.n();
                    }
                    catch(Throwable throwable1) {
                        H0.b(throwable1);
                        this.u(throwable1);
                        return;
                    }
                }
                this.w();
            }
            catch(Throwable throwable0) {
                H0.b(throwable0);
                this.u(throwable0);
            });
        }

        @Override  // com.google.common.util.concurrent.p
        protected void o() {
        }

        // 去混淆评级： 低(20)
        @Override  // com.google.common.util.concurrent.p
        public String toString() {
            return "e [NEW]";
        }
    }

    private final L0 a;
    private static final s0 b;

    static {
        e.b = new s0(e.class);
    }

    protected e() {
        this.a = new a(this);
    }

    @Override  // com.google.common.util.concurrent.L0
    public final void a(com.google.common.util.concurrent.L0.a l0$a0, Executor executor0) {
        this.a.a(l0$a0, executor0);
    }

    @Override  // com.google.common.util.concurrent.L0
    public final void b(long v, TimeUnit timeUnit0) throws TimeoutException {
        this.a.b(v, timeUnit0);
    }

    @Override  // com.google.common.util.concurrent.L0
    public final void c(long v, TimeUnit timeUnit0) throws TimeoutException {
        this.a.c(v, timeUnit0);
    }

    @Override  // com.google.common.util.concurrent.L0
    public final void d() {
        this.a.d();
    }

    @Override  // com.google.common.util.concurrent.L0
    public final Throwable e() {
        return this.a.e();
    }

    @Override  // com.google.common.util.concurrent.L0
    public final void f() {
        this.a.f();
    }

    @Override  // com.google.common.util.concurrent.L0
    @O1.a
    public final L0 g() {
        this.a.g();
        return this;
    }

    @Override  // com.google.common.util.concurrent.L0
    public final b h() {
        return this.a.h();
    }

    @Override  // com.google.common.util.concurrent.L0
    @O1.a
    public final L0 i() {
        this.a.i();
        return this;
    }

    @Override  // com.google.common.util.concurrent.L0
    public final boolean isRunning() {
        return this.a.isRunning();
    }

    static s0 k() {
        return e.b;
    }

    protected Executor l() {
        return (Runnable runnable0) -> C0.n("e", runnable0).start();
    }

    // 检测为 Lambda 实现
    private void m(Runnable runnable0) [...]

    protected abstract void n() throws Exception;

    protected String o() [...] // 潜在的解密器

    protected void p() throws Exception {
    }

    protected void q() throws Exception {
    }

    protected void r() {
    }

    // 去混淆评级： 低(40)
    @Override
    public String toString() [...] // 潜在的解密器
}

