package com.vungle.ads.internal.executor;

import com.vungle.ads.N0;
import com.vungle.ads.internal.util.p;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.S0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class i extends ThreadPoolExecutor {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        private final Callable getWrappedCallableWithFallback(Callable callable0, A3.a a0) {
            return () -> {
                L.p(callable0, "$command");
                L.p(a0, "$failFallback");
                try {
                    return callable0.call();
                }
                catch(OutOfMemoryError unused_ex) {
                    a0.invoke();
                    return null;
                }
            };
        }

        // 检测为 Lambda 实现
        private static final Object getWrappedCallableWithFallback$lambda-0(Callable callable0, A3.a a0) [...]

        private final b getWrappedRunnableWithFail(Runnable runnable0, Runnable runnable1) {
            public static final class com.vungle.ads.internal.executor.i.a.a extends com.vungle.ads.internal.task.i implements b {
                final Runnable $command;
                final Runnable $fail;

                com.vungle.ads.internal.executor.i.a.a(Runnable runnable0, Runnable runnable1) {
                    this.$command = runnable0;
                    this.$fail = runnable1;
                    super();
                }

                @Override  // com.vungle.ads.internal.task.i
                public int compareTo(@l Object object0) {
                    L.p(object0, "other");
                    if(object0 instanceof com.vungle.ads.internal.task.i) {
                        int v = this.getPriority();
                        return L.t(((com.vungle.ads.internal.task.i)object0).getPriority(), v);
                    }
                    return 0;
                }

                @Override  // com.vungle.ads.internal.task.i
                public int getPriority() {
                    return ((com.vungle.ads.internal.task.i)this.$command).getPriority();
                }

                @Override
                public void run() {
                    i.Companion.wrapRunnableWithFail(this.$command, this.$fail);
                }
            }


            public static final class com.vungle.ads.internal.executor.i.a.b implements b {
                final Runnable $command;
                final Runnable $fail;

                com.vungle.ads.internal.executor.i.a.b(Runnable runnable0, Runnable runnable1) {
                    this.$command = runnable0;
                    this.$fail = runnable1;
                    super();
                }

                @Override
                public int compareTo(@l Object object0) {
                    L.p(object0, "other");
                    return this.$command instanceof com.vungle.ads.internal.task.i ? ((com.vungle.ads.internal.task.i)this.$command).compareTo(object0) : 0;
                }

                @Override
                public void run() {
                    i.Companion.wrapRunnableWithFail(this.$command, this.$fail);
                }
            }

            return runnable0 instanceof com.vungle.ads.internal.task.i ? new com.vungle.ads.internal.executor.i.a.a(runnable0, runnable1) : new com.vungle.ads.internal.executor.i.a.b(runnable0, runnable1);
        }

        private final void wrapRunnableWithFail(Runnable runnable0, Runnable runnable1) {
            try {
                runnable0.run();
            }
            catch(OutOfMemoryError unused_ex) {
                runnable1.run();
            }
        }
    }

    public interface b extends Comparable, Runnable {
    }

    @l
    public static final a Companion = null;
    @l
    private static final String TAG = "VungleThreadPool";
    @m
    private final c threadFactory;

    static {
        i.Companion = new a(null);
    }

    public i(int v, int v1, long v2, @m TimeUnit timeUnit0, @m BlockingQueue blockingQueue0, @m c c0) {
        super(v, v1, v2, timeUnit0, blockingQueue0, c0);
        this.threadFactory = c0;
        this.allowCoreThreadTimeOut(true);
    }

    @Override
    public void execute(@l Runnable runnable0) {
        L.p(runnable0, "command");
        try {
            f f0 = () -> {
                L.p(this, "this$0");
                new N0("execute error in " + this.executorName()).logErrorNoReturnValue$vungle_ads_release();
            };
            super.execute(i.Companion.getWrappedRunnableWithFail(runnable0, f0));
        }
        catch(Exception exception0) {
            p.Companion.e("VungleThreadPool", "execute exception", exception0);
        }
        catch(OutOfMemoryError outOfMemoryError0) {
            String s = "execute error in " + this.executorName() + ": " + outOfMemoryError0.getLocalizedMessage();
            p.Companion.e("VungleThreadPool", s, outOfMemoryError0);
            new N0(s).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    public final void execute(@l Runnable runnable0, @l Runnable runnable1) {
        L.p(runnable0, "command");
        L.p(runnable1, "fail");
        try {
            super.execute(i.Companion.getWrappedRunnableWithFail(runnable0, runnable1));
        }
        catch(Exception exception0) {
            p.Companion.e("VungleThreadPool", "execute exception with fail", exception0);
            runnable1.run();
        }
        catch(OutOfMemoryError outOfMemoryError0) {
            String s = "execute error with fail in " + this.executorName() + ": " + outOfMemoryError0.getLocalizedMessage();
            p.Companion.e("VungleThreadPool", s, outOfMemoryError0);
            new N0(s).logErrorNoReturnValue$vungle_ads_release();
            runnable1.run();
        }
    }

    // 检测为 Lambda 实现
    private static final void execute$lambda-0(i i0) [...]

    private final String executorName() {
        c c0 = this.threadFactory;
        if(c0 != null) {
            String s = c0.getName();
            return s == null ? "VungleThreadPoolExecutor" : s;
        }
        return "VungleThreadPoolExecutor";
    }

    @m
    public final c getThreadFactory() {
        return this.threadFactory;
    }

    @Override
    @l
    public Future submit(@l Runnable runnable0) {
        L.p(runnable0, "task");
        try {
            g g0 = () -> {
                L.p(this, "this$0");
                new N0("submit error in " + this.executorName()).logErrorNoReturnValue$vungle_ads_release();
            };
            Future future0 = super.submit(i.Companion.getWrappedRunnableWithFail(runnable0, g0));
            L.o(future0, "{\n            super.subm…\n            })\n        }");
            return future0;
        }
        catch(Exception exception0) {
            p.Companion.e("VungleThreadPool", "submit exception", exception0);
            return new com.vungle.ads.internal.executor.b(null);
        }
        catch(OutOfMemoryError outOfMemoryError0) {
            String s = "submit error in " + this.executorName() + ": " + outOfMemoryError0.getLocalizedMessage();
            p.Companion.e("VungleThreadPool", s, outOfMemoryError0);
            new N0(s).logErrorNoReturnValue$vungle_ads_release();
            return new com.vungle.ads.internal.executor.b(null);
        }
    }

    @Override
    @l
    public Future submit(@l Runnable runnable0, Object object0) {
        L.p(runnable0, "task");
        try {
            e e0 = () -> {
                L.p(this, "this$0");
                new N0("submit error with result in " + this.executorName()).logErrorNoReturnValue$vungle_ads_release();
            };
            Future future0 = super.submit(i.Companion.getWrappedRunnableWithFail(runnable0, e0), object0);
            L.o(future0, "{\n            super.subm…     }, result)\n        }");
            return future0;
        }
        catch(Exception exception0) {
            p.Companion.e("VungleThreadPool", "submit exception with result", exception0);
            return new com.vungle.ads.internal.executor.b(null);
        }
        catch(OutOfMemoryError outOfMemoryError0) {
            String s = "submit error with result in " + this.executorName() + ": " + outOfMemoryError0.getLocalizedMessage();
            p.Companion.e("VungleThreadPool", s, outOfMemoryError0);
            new N0(s).logErrorNoReturnValue$vungle_ads_release();
            return new com.vungle.ads.internal.executor.b(null);
        }
    }

    @Override
    @l
    public Future submit(@l Callable callable0) {
        static final class com.vungle.ads.internal.executor.i.c extends N implements A3.a {
            com.vungle.ads.internal.executor.i.c(i i0) {
                i.this = i0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                new N0("submit callable error in " + i.this.executorName()).logErrorNoReturnValue$vungle_ads_release();
            }
        }

        L.p(callable0, "task");
        try {
            com.vungle.ads.internal.executor.i.c i$c0 = new com.vungle.ads.internal.executor.i.c(this);
            Future future0 = super.submit(i.Companion.getWrappedCallableWithFallback(callable0, i$c0));
            L.o(future0, "override fun <T> submit(…Future<T>\n        }\n    }");
            return future0;
        }
        catch(Exception exception0) {
            p.Companion.e("VungleThreadPool", "submit exception callable: " + exception0);
            return new com.vungle.ads.internal.executor.b(null);
        }
        catch(OutOfMemoryError outOfMemoryError0) {
            String s = "submit error callable in " + this.executorName() + ": " + outOfMemoryError0.getLocalizedMessage();
            p.Companion.e("VungleThreadPool", s, outOfMemoryError0);
            new N0(s).logErrorNoReturnValue$vungle_ads_release();
            return new com.vungle.ads.internal.executor.b(null);
        }
    }

    // 检测为 Lambda 实现
    private static final void submit$lambda-1(i i0) [...]

    // 检测为 Lambda 实现
    private static final void submit$lambda-2(i i0) [...]

    @l
    public final Future submit$vungle_ads_release(@l Runnable runnable0, @l Runnable runnable1) {
        L.p(runnable0, "task");
        L.p(runnable1, "fail");
        try {
            Future future0 = super.submit(i.Companion.getWrappedRunnableWithFail(runnable0, runnable1));
            L.o(future0, "{\n            super.subm…il(task, fail))\n        }");
            return future0;
        }
        catch(Exception exception0) {
            p.Companion.e("VungleThreadPool", "submit exception with fail", exception0);
            runnable1.run();
            return new com.vungle.ads.internal.executor.b(null);
        }
        catch(OutOfMemoryError outOfMemoryError0) {
            String s = "submit error with fail in " + this.executorName() + ": " + outOfMemoryError0.getLocalizedMessage();
            p.Companion.e("VungleThreadPool", s, outOfMemoryError0);
            new N0(s).logErrorNoReturnValue$vungle_ads_release();
            runnable1.run();
            return new com.vungle.ads.internal.executor.b(null);
        }
    }
}

