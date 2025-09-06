package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import androidx.annotation.AnyThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import j..util.Objects;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@AnyThread
public class g {
    static class a {
    }

    static class b implements OnCanceledListener, OnFailureListener, OnSuccessListener {
        private final CountDownLatch a;

        private b() {
            this.a = new CountDownLatch(1);
        }

        b(a g$a0) {
        }

        public void a() throws InterruptedException {
            this.a.await();
        }

        public boolean b(long v, TimeUnit timeUnit0) throws InterruptedException {
            return this.a.await(v, timeUnit0);
        }

        @Override  // com.google.android.gms.tasks.OnCanceledListener
        public void onCanceled() {
            this.a.countDown();
        }

        @Override  // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(@NonNull Exception exception0) {
            this.a.countDown();
        }

        @Override  // com.google.android.gms.tasks.OnSuccessListener
        public void onSuccess(Object object0) {
            this.a.countDown();
        }
    }

    private final Executor a;
    private final v b;
    @GuardedBy("this")
    @Nullable
    private Task c;
    static final long d = 5L;
    @GuardedBy("ConfigCacheClient.class")
    private static final Map e;
    private static final Executor f;

    static {
        g.e = new HashMap();
        g.f = new androidx.media3.exoplayer.dash.offline.a();
    }

    private g(Executor executor0, v v0) {
        this.a = executor0;
        this.b = v0;
        this.c = null;
    }

    private static Object c(Task task0, long v, TimeUnit timeUnit0) throws ExecutionException, InterruptedException, TimeoutException {
        b g$b0 = new b(null);
        task0.addOnSuccessListener(g.f, g$b0);
        task0.addOnFailureListener(g.f, g$b0);
        task0.addOnCanceledListener(g.f, g$b0);
        if(!g$b0.b(v, timeUnit0)) {
            throw new TimeoutException("Task await timed out.");
        }
        if(!task0.isSuccessful()) {
            throw new ExecutionException(task0.getException());
        }
        return task0.getResult();
    }

    public void d() {
        synchronized(this) {
            this.c = Tasks.forResult(null);
        }
        this.b.a();
    }

    @VisibleForTesting
    public static void e() {
        synchronized(g.class) {
            g.e.clear();
        }
    }

    public Task f() {
        synchronized(this) {
            if(this.c == null || this.c.isComplete() && !this.c.isSuccessful()) {
                Objects.requireNonNull(this.b);
                f f0 = new f(this.b);
                this.c = Tasks.call(this.a, f0);
            }
            return this.c;
        }
    }

    @Nullable
    public h g() {
        return this.h(5L);
    }

    @Nullable
    @VisibleForTesting
    h h(long v) {
        synchronized(this) {
            if(this.c != null && this.c.isSuccessful()) {
                return (h)this.c.getResult();
            }
        }
        try {
            return (h)g.c(this.f(), v, TimeUnit.SECONDS);
        }
        catch(InterruptedException | ExecutionException | TimeoutException interruptedException0) {
            Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", interruptedException0);
            return null;
        }
    }

    @Nullable
    @VisibleForTesting
    Task i() {
        synchronized(this) {
        }
        return this.c;
    }

    public static g j(Executor executor0, v v0) {
        synchronized(g.class) {
            String s = v0.c();
            Map map0 = g.e;
            if(!map0.containsKey(s)) {
                map0.put(s, new g(executor0, v0));
            }
            return (g)map0.get(s);
        }
    }

    // 检测为 Lambda 实现
    private Void k(h h0) throws Exception [...]

    // 检测为 Lambda 实现
    private Task l(boolean z, h h0, Void void0) throws Exception [...]

    public Task m(h h0) {
        return this.n(h0, true);
    }

    public Task n(h h0, boolean z) {
        d d0 = () -> this.b.f(h0);
        Task task0 = Tasks.call(this.a, d0);
        e e0 = (Void void0) -> {
            if(z) {
                this.o(h0);
            }
            return Tasks.forResult(h0);
        };
        return task0.onSuccessTask(this.a, e0);
    }

    private void o(h h0) {
        synchronized(this) {
            this.c = Tasks.forResult(h0);
        }
    }
}

