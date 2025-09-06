package com.google.firebase.crashlytics.internal.concurrency;

import O1.a;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class j implements Executor {
    private final ExecutorService a;
    private final Object b;
    private Task c;

    j(ExecutorService executorService0) {
        this.b = new Object();
        this.c = Tasks.forResult(null);
        this.a = executorService0;
    }

    public static void c() {
    }

    @Override
    public void execute(Runnable runnable0) {
        this.a.execute(runnable0);
    }

    @VisibleForTesting
    public void h() throws ExecutionException, InterruptedException, TimeoutException {
        Tasks.await(this.q(new e()), 30L, TimeUnit.SECONDS);
        Thread.sleep(1L);
    }

    public ExecutorService i() {
        return this.a;
    }

    private static void j() {
    }

    // 检测为 Lambda 实现
    private static Task k(Callable callable0, Task task0) throws Exception [...]

    // 检测为 Lambda 实现
    private static Task l(Runnable runnable0, Task task0) throws Exception [...]

    // 检测为 Lambda 实现
    private static Task m(Callable callable0, Task task0) throws Exception [...]

    // 检测为 Lambda 实现
    private static Task n(Callable callable0, Task task0) throws Exception [...]

    // 检测为 Lambda 实现
    private static Task o(Callable callable0, Task task0) throws Exception [...]

    // 检测为 Lambda 实现
    private static Task p(SuccessContinuation successContinuation0, Task task0) throws Exception [...]

    @a
    public Task q(Runnable runnable0) {
        synchronized(this.b) {
            Task task0 = this.c;
            c c0 = (Task task0) -> {
                runnable0.run();
                return Tasks.forResult(null);
            };
            Task task1 = task0.continueWithTask(this.a, c0);
            this.c = task1;
            return task1;
        }
    }

    @a
    public Task r(Callable callable0) {
        synchronized(this.b) {
            Task task0 = this.c;
            d d0 = (Task task0) -> Tasks.forResult(callable0.call());
            Task task1 = task0.continueWithTask(this.a, d0);
            this.c = task1;
            return task1;
        }
    }

    @a
    public Task s(Callable callable0) {
        synchronized(this.b) {
            Task task0 = this.c;
            f f0 = (Task task0) -> ((Task)callable0.call());
            Task task1 = task0.continueWithTask(this.a, f0);
            this.c = task1;
            return task1;
        }
    }

    @a
    public Task t(Callable callable0, Continuation continuation0) {
        synchronized(this.b) {
            Task task0 = this.c;
            g g0 = (Task task0) -> ((Task)callable0.call());
            Task task1 = task0.continueWithTask(this.a, g0).continueWithTask(this.a, continuation0);
            this.c = task1;
            return task1;
        }
    }

    @a
    public Task u(Callable callable0, SuccessContinuation successContinuation0) {
        synchronized(this.b) {
            Task task0 = this.c;
            h h0 = (Task task0) -> ((Task)callable0.call());
            Task task1 = task0.continueWithTask(this.a, h0);
            i i0 = (Task task0) -> {
                if(task0.isSuccessful()) {
                    return successContinuation0.then(task0.getResult());
                }
                return task0.getException() == null ? Tasks.forCanceled() : Tasks.forException(task0.getException());
            };
            Task task2 = task1.continueWithTask(this.a, i0);
            this.c = task2;
            return task2;
        }
    }
}

