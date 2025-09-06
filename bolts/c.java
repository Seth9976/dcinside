package bolts;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

final class c {
    static class a {
    }

    static class b implements Executor {
        private ThreadLocal a;
        private static final int b = 15;

        private b() {
            this.a = new ThreadLocal();
        }

        b(a c$a0) {
        }

        private int a() {
            Integer integer0 = (Integer)this.a.get();
            if(integer0 == null) {
                integer0 = 0;
            }
            int v = (int)integer0;
            if(v - 1 == 0) {
                this.a.remove();
                return 0;
            }
            this.a.set(((int)(v - 1)));
            return v - 1;
        }

        private int b() {
            Integer integer0 = (Integer)this.a.get();
            if(integer0 == null) {
                integer0 = 0;
            }
            int v = (int)integer0;
            this.a.set(((int)(v + 1)));
            return v + 1;
        }

        @Override
        public void execute(Runnable runnable0) {
            boolean z = this.b() > 15;
            try {
                if(z) {
                    c.a().execute(runnable0);
                }
                else {
                    runnable0.run();
                }
            }
            finally {
                this.a();
            }
        }
    }

    private final ExecutorService a;
    private final ScheduledExecutorService b;
    private final Executor c;
    private static final c d;

    static {
        c.d = new c();
    }

    private c() {
        this.a = c.c() ? bolts.b.b() : Executors.newCachedThreadPool();
        this.b = Executors.newSingleThreadScheduledExecutor();
        this.c = new b(null);
    }

    public static ExecutorService a() {
        return c.d.a;
    }

    static Executor b() {
        return c.d.c;
    }

    // 去混淆评级： 中等(90)
    private static boolean c() {
        return true;
    }

    static ScheduledExecutorService d() {
        return c.d.b;
    }
}

