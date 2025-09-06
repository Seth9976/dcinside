package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class m0 {
    private final Context a;
    private final Q b;
    private final K c;
    private final FirebaseMessaging d;
    @GuardedBy("pendingOperations")
    private final Map e;
    private final ScheduledExecutorService f;
    @GuardedBy("this")
    private boolean g;
    private final k0 h;
    static final String i = "INTERNAL_SERVER_ERROR";
    static final String j = "SERVICE_NOT_AVAILABLE";
    private static final long k = 30L;
    private static final long l = 30L;
    private static final long m;

    static {
        m0.m = TimeUnit.HOURS.toSeconds(8L);
    }

    private m0(FirebaseMessaging firebaseMessaging0, Q q0, k0 k00, K k0, Context context0, @NonNull ScheduledExecutorService scheduledExecutorService0) {
        this.e = new ArrayMap();
        this.g = false;
        this.d = firebaseMessaging0;
        this.b = q0;
        this.h = k00;
        this.c = k0;
        this.a = context0;
        this.f = scheduledExecutorService0;
    }

    private void b(j0 j00, TaskCompletionSource taskCompletionSource0) {
        ArrayDeque arrayDeque0;
        synchronized(this.e) {
            String s = j00.e();
            if(this.e.containsKey(s)) {
                arrayDeque0 = (ArrayDeque)this.e.get(s);
            }
            else {
                ArrayDeque arrayDeque1 = new ArrayDeque();
                this.e.put(s, arrayDeque1);
                arrayDeque0 = arrayDeque1;
            }
            arrayDeque0.add(taskCompletionSource0);
        }
    }

    @WorkerThread
    private static void c(Task task0) throws IOException {
        try {
            Tasks.await(task0, 30L, TimeUnit.SECONDS);
            return;
        }
        catch(ExecutionException executionException0) {
            Throwable throwable0 = executionException0.getCause();
            if(throwable0 instanceof IOException) {
                throw (IOException)throwable0;
            }
            if(throwable0 instanceof RuntimeException) {
                throw (RuntimeException)throwable0;
            }
            throw new IOException(executionException0);
        }
        catch(InterruptedException | TimeoutException interruptedException0) {
            throw new IOException("SERVICE_NOT_AVAILABLE", interruptedException0);
        }
    }

    @WorkerThread
    private void d(String s) throws IOException {
        String s1 = this.d.r();
        m0.c(this.c.n(s1, s));
    }

    @WorkerThread
    private void e(String s) throws IOException {
        String s1 = this.d.r();
        m0.c(this.c.o(s1, s));
    }

    @VisibleForTesting
    static Task f(FirebaseMessaging firebaseMessaging0, Q q0, K k0, Context context0, @NonNull ScheduledExecutorService scheduledExecutorService0) {
        return Tasks.call(scheduledExecutorService0, () -> new m0(firebaseMessaging0, q0, k0.d(context0, scheduledExecutorService0), k0, context0, scheduledExecutorService0));
    }

    @VisibleForTesting
    k0 g() {
        return this.h;
    }

    boolean h() {
        return this.h.e() != null;
    }

    // 去混淆评级： 低(30)
    static boolean i() {
        return Log.isLoggable("FirebaseMessaging", 3) || Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
    }

    boolean j() {
        synchronized(this) {
        }
        return this.g;
    }

    // 检测为 Lambda 实现
    private static m0 k(Context context0, ScheduledExecutorService scheduledExecutorService0, FirebaseMessaging firebaseMessaging0, Q q0, K k0) throws Exception [...]

    private void l(j0 j00) {
        synchronized(this.e) {
            String s = j00.e();
            if(!this.e.containsKey(s)) {
                return;
            }
            ArrayDeque arrayDeque0 = (ArrayDeque)this.e.get(s);
            TaskCompletionSource taskCompletionSource0 = (TaskCompletionSource)arrayDeque0.poll();
            if(taskCompletionSource0 != null) {
                taskCompletionSource0.setResult(null);
            }
            if(arrayDeque0.isEmpty()) {
                this.e.remove(s);
            }
        }
    }

    @WorkerThread
    boolean m(j0 j00) throws IOException {
        try {
            switch(j00.b()) {
                case "S": {
                    this.d(j00.c());
                    if(m0.i()) {
                        Log.d("FirebaseMessaging", "Subscribe to topic: " + j00.c() + " succeeded.");
                        return true;
                    }
                    break;
                }
                case "U": {
                    this.e(j00.c());
                    if(m0.i()) {
                        Log.d("FirebaseMessaging", "Unsubscribe from topic: " + j00.c() + " succeeded.");
                        return true;
                    }
                    break;
                }
                default: {
                    if(m0.i()) {
                        Log.d("FirebaseMessaging", "Unknown topic operation" + j00 + ".");
                        return true;
                    }
                }
            }
            return true;
        }
        catch(IOException iOException0) {
        }
        if(!"SERVICE_NOT_AVAILABLE".equals(iOException0.getMessage()) && !"INTERNAL_SERVER_ERROR".equals(iOException0.getMessage()) && !"TOO_MANY_SUBSCRIBERS".equals(iOException0.getMessage())) {
            if(iOException0.getMessage() != null) {
                throw iOException0;
            }
            Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
            return false;
        }
        Log.e("FirebaseMessaging", "Topic operation failed: " + iOException0.getMessage() + ". Will retry Topic operation.");
        return false;
    }

    void n(Runnable runnable0, long v) {
        this.f.schedule(runnable0, v, TimeUnit.SECONDS);
    }

    @VisibleForTesting
    Task o(j0 j00) {
        this.h.a(j00);
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        this.b(j00, taskCompletionSource0);
        return taskCompletionSource0.getTask();
    }

    void p(boolean z) {
        synchronized(this) {
            this.g = z;
        }
    }

    private void q() {
        if(!this.j()) {
            this.u(0L);
        }
    }

    void r() {
        if(this.h()) {
            this.q();
        }
    }

    Task s(String s) {
        Task task0 = this.o(j0.f(s));
        this.r();
        return task0;
    }

    @WorkerThread
    boolean t() throws IOException {
        j0 j00;
        while(true) {
            synchronized(this) {
                j00 = this.h.e();
                if(j00 == null) {
                    if(m0.i()) {
                        Log.d("FirebaseMessaging", "topic sync succeeded");
                    }
                    return true;
                }
            }
            if(!this.m(j00)) {
                return false;
            }
            this.h.i(j00);
            this.l(j00);
        }
    }

    void u(long v) {
        this.n(new n0(this, this.a, this.b, Math.min(Math.max(30L, 2L * v), m0.m)), v);
        this.p(true);
    }

    Task v(String s) {
        Task task0 = this.o(j0.g(s));
        this.r();
        return task0;
    }
}

