package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class u0 implements ServiceConnection {
    static class a {
        final Intent a;
        private final TaskCompletionSource b;

        a(Intent intent0) {
            this.b = new TaskCompletionSource();
            this.a = intent0;
        }

        void c(ScheduledExecutorService scheduledExecutorService0) {
            this.e().addOnCompleteListener(scheduledExecutorService0, (Task task0) -> scheduledExecutorService0.schedule(() -> {
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + this.a.getAction() + " finishing.");
                this.d();
            }, 20L, TimeUnit.SECONDS).cancel(false));
        }

        void d() {
            this.b.trySetResult(null);
        }

        Task e() {
            return this.b.getTask();
        }

        // 检测为 Lambda 实现
        private void f() [...]

        // 检测为 Lambda 实现
        private static void g(ScheduledFuture scheduledFuture0, Task task0) [...]
    }

    private final Context a;
    private final Intent b;
    private final ScheduledExecutorService c;
    private final Queue d;
    @Nullable
    private r0 e;
    @GuardedBy("this")
    private boolean f;

    @SuppressLint({"ThreadPoolCreation"})
    u0(Context context0, String s) {
        this(context0, s, new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    @VisibleForTesting
    u0(Context context0, String s, ScheduledExecutorService scheduledExecutorService0) {
        this.d = new ArrayDeque();
        this.f = false;
        this.a = context0.getApplicationContext();
        this.b = new Intent(s).setPackage("com.dcinside.app.android");
        this.c = scheduledExecutorService0;
    }

    @GuardedBy("this")
    private void a() {
        while(!this.d.isEmpty()) {
            ((a)this.d.poll()).d();
        }
    }

    private void b() {
        synchronized(this) {
            if(Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while(!this.d.isEmpty()) {
                if(Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                if(this.e != null && this.e.isBinderAlive()) {
                    if(Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                    }
                    a u0$a0 = (a)this.d.poll();
                    this.e.c(u0$a0);
                    continue;
                }
                this.d();
                return;
            }
        }
    }

    @O1.a
    Task c(Intent intent0) {
        synchronized(this) {
            if(Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            a u0$a0 = new a(intent0);
            u0$a0.c(this.c);
            this.d.add(u0$a0);
            this.b();
            return u0$a0.e();
        }
    }

    @GuardedBy("this")
    private void d() {
        if(Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "binder is dead. start connection? " + !this.f);
        }
        if(this.f) {
            return;
        }
        try {
            this.f = true;
            if(ConnectionTracker.getInstance().bindService(this.a, this.b, this, 65)) {
                return;
            }
            Log.e("FirebaseMessaging", "binding to the service failed");
        }
        catch(SecurityException securityException0) {
            Log.e("FirebaseMessaging", "Exception while binding the service", securityException0);
        }
        this.f = false;
        this.a();
    }

    @Override  // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        synchronized(this) {
            if(Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName0);
            }
            this.f = false;
            if(!(iBinder0 instanceof r0)) {
                Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder0);
                this.a();
                return;
            }
            this.e = (r0)iBinder0;
            this.b();
        }
    }

    @Override  // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName0) {
        if(Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName0);
        }
        this.b();
    }
}

