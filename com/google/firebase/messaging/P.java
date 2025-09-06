package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.messaging.threads.b;
import com.google.firebase.messaging.threads.c;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class p {
    private static final String a = "Firebase-Messaging-Network-Io";
    private static final String b = "Firebase-Messaging-Task";
    private static final String c = "Firebase-Messaging-File";
    private static final String d = "Firebase-Messaging-Intent-Handle";
    private static final String e = "Firebase-Messaging-Topics-Io";
    private static final String f = "Firebase-Messaging-Init";
    static final String g = "Firebase-Messaging-File-Io";
    static final String h = "Firebase-Messaging-Rpc-Task";

    @SuppressLint({"ThreadPoolCreation"})
    private static Executor a(String s) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory(s));
    }

    @SuppressLint({"ThreadPoolCreation"})
    static ExecutorService b() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-File"));
    }

    static Executor c() {
        return p.a("Firebase-Messaging-File-Io");
    }

    @SuppressLint({"ThreadPoolCreation"})
    static ScheduledExecutorService d() {
        return new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
    }

    @SuppressLint({"ThreadPoolCreation"})
    static ExecutorService e() {
        return b.a().d(new NamedThreadFactory("Firebase-Messaging-Intent-Handle"), c.b);
    }

    @SuppressLint({"ThreadPoolCreation"})
    static ExecutorService f() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Network-Io"));
    }

    static Executor g() {
        return p.a("Firebase-Messaging-Rpc-Task");
    }

    @SuppressLint({"ThreadPoolCreation"})
    static ExecutorService h() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
    }

    @SuppressLint({"ThreadPoolCreation"})
    static ScheduledExecutorService i() {
        return new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
    }
}

