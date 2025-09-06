package com.google.firebase.messaging.threads;

import O1.d;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

public interface a {
    ScheduledExecutorService a(int arg1, c arg2);

    ExecutorService b(int arg1, ThreadFactory arg2, c arg3);

    ExecutorService c(int arg1, c arg2);

    ExecutorService d(ThreadFactory arg1, c arg2);

    ExecutorService e(c arg1);

    ScheduledExecutorService f(int arg1, ThreadFactory arg2, c arg3);

    ExecutorService g(c arg1);

    Future h(@d String arg1, @d String arg2, c arg3, Runnable arg4);

    void i(@d String arg1, @d String arg2, c arg3, Runnable arg4);

    ExecutorService j(ThreadFactory arg1, c arg2);
}

