package com.bumptech.glide.load.engine;

import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.g;
import com.bumptech.glide.util.f;
import com.bumptech.glide.util.m;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

final class a {
    @VisibleForTesting
    interface c {
        void a();
    }

    @VisibleForTesting
    static final class d extends WeakReference {
        final g a;
        final boolean b;
        @Nullable
        v c;

        d(@NonNull g g0, @NonNull p p0, @NonNull ReferenceQueue referenceQueue0, boolean z) {
            super(p0, referenceQueue0);
            this.a = (g)m.e(g0);
            this.c = !p0.d() || !z ? null : ((v)m.e(p0.c()));
            this.b = p0.d();
        }

        void a() {
            this.c = null;
            this.clear();
        }
    }

    private final boolean a;
    private final Executor b;
    @VisibleForTesting
    final Map c;
    private final ReferenceQueue d;
    private com.bumptech.glide.load.engine.p.a e;
    private volatile boolean f;
    @Nullable
    private volatile c g;

    a(boolean z) {
        class com.bumptech.glide.load.engine.a.a implements ThreadFactory {
            com.bumptech.glide.load.engine.a.a() {
                super();
            }

            @Override
            public Thread newThread(@NonNull Runnable runnable0) {
                class com.bumptech.glide.load.engine.a.a.a implements Runnable {
                    final Runnable a;
                    final com.bumptech.glide.load.engine.a.a b;

                    com.bumptech.glide.load.engine.a.a.a(Runnable runnable0) {
                        this.a = runnable0;
                        super();
                    }

                    @Override
                    public void run() {
                        Process.setThreadPriority(10);
                        this.a.run();
                    }
                }

                return new Thread(new com.bumptech.glide.load.engine.a.a.a(this, runnable0), "glide-active-resources");
            }
        }

        this(z, Executors.newSingleThreadExecutor(new com.bumptech.glide.load.engine.a.a()));
    }

    @VisibleForTesting
    a(boolean z, Executor executor0) {
        class b implements Runnable {
            final a a;

            @Override
            public void run() {
                a.this.b();
            }
        }

        this.c = new HashMap();
        this.d = new ReferenceQueue();
        this.a = z;
        this.b = executor0;
        executor0.execute(() -> while(!a.this.f) {
            try {
                a.this.c(((d)a.this.d.remove()));
                c a$c0 = a.this.g;
                if(a$c0 == null) {
                    continue;
                }
                a$c0.a();
            }
            catch(InterruptedException unused_ex) {
                Thread.currentThread().interrupt();
            }
        });
    }

    void a(g g0, p p0) {
        synchronized(this) {
            d a$d0 = new d(g0, p0, this.d, this.a);
            d a$d1 = (d)this.c.put(g0, a$d0);
            if(a$d1 != null) {
                a$d1.a();
            }
        }
    }

    // 检测为 Lambda 实现
    void b() [...]

    void c(@NonNull d a$d0) {
        synchronized(this) {
            this.c.remove(a$d0.a);
            if(a$d0.b) {
                v v1 = a$d0.c;
                if(v1 != null) {
                    p p0 = new p(v1, true, false, a$d0.a, this.e);
                    this.e.c(a$d0.a, p0);
                }
            }
        }
    }

    void d(g g0) {
        synchronized(this) {
            d a$d0 = (d)this.c.remove(g0);
            if(a$d0 != null) {
                a$d0.a();
            }
        }
    }

    @Nullable
    p e(g g0) {
        synchronized(this) {
            d a$d0 = (d)this.c.get(g0);
            if(a$d0 == null) {
                return null;
            }
            p p0 = (p)a$d0.get();
            if(p0 == null) {
                this.c(a$d0);
            }
            return p0;
        }
    }

    @VisibleForTesting
    void f(c a$c0) {
        this.g = a$c0;
    }

    void g(com.bumptech.glide.load.engine.p.a p$a0) {
        synchronized(p$a0) {
            synchronized(this) {
                this.e = p$a0;
            }
        }
    }

    @VisibleForTesting
    void h() {
        this.f = true;
        Executor executor0 = this.b;
        if(executor0 instanceof ExecutorService) {
            f.c(((ExecutorService)executor0));
        }
    }
}

