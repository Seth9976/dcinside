package com.google.common.util.concurrent;

import J1.c;
import J1.d;
import com.google.common.base.H;
import j..util.Objects;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import o3.a;

@c
@d
@N
public final class a1 {
    @a
    private String a;
    @a
    private Boolean b;
    @a
    private Integer c;
    @a
    private Thread.UncaughtExceptionHandler d;
    @a
    private ThreadFactory e;

    public a1() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
    }

    public ThreadFactory b() {
        return a1.c(this);
    }

    private static ThreadFactory c(a1 a10) {
        class com.google.common.util.concurrent.a1.a implements ThreadFactory {
            final ThreadFactory a;
            final String b;
            final AtomicLong c;
            final Boolean d;
            final Integer e;
            final Thread.UncaughtExceptionHandler f;

            com.google.common.util.concurrent.a1.a(ThreadFactory threadFactory0, String s, AtomicLong atomicLong0, Boolean boolean0, Integer integer0, Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0) {
                this.b = s;
                this.c = atomicLong0;
                this.d = boolean0;
                this.e = integer0;
                this.f = thread$UncaughtExceptionHandler0;
                super();
            }

            @Override
            public Thread newThread(Runnable runnable0) {
                Thread thread0 = this.a.newThread(runnable0);
                Objects.requireNonNull(thread0);
                String s = this.b;
                if(s != null) {
                    Objects.requireNonNull(this.c);
                    thread0.setName(a1.d(s, new Object[]{this.c.getAndIncrement()}));
                }
                Boolean boolean0 = this.d;
                if(boolean0 != null) {
                    thread0.setDaemon(boolean0.booleanValue());
                }
                Integer integer0 = this.e;
                if(integer0 != null) {
                    thread0.setPriority(((int)integer0));
                }
                Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0 = this.f;
                if(thread$UncaughtExceptionHandler0 != null) {
                    thread0.setUncaughtExceptionHandler(thread$UncaughtExceptionHandler0);
                }
                return thread0;
            }
        }

        String s = a10.a;
        Boolean boolean0 = a10.b;
        Integer integer0 = a10.c;
        Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0 = a10.d;
        ThreadFactory threadFactory0 = a10.e == null ? Executors.defaultThreadFactory() : a10.e;
        return s == null ? new com.google.common.util.concurrent.a1.a(threadFactory0, null, null, boolean0, integer0, thread$UncaughtExceptionHandler0) : new com.google.common.util.concurrent.a1.a(threadFactory0, s, new AtomicLong(0L), boolean0, integer0, thread$UncaughtExceptionHandler0);
    }

    private static String d(String s, Object[] arr_object) {
        return String.format(Locale.ROOT, s, arr_object);
    }

    @O1.a
    public a1 e(boolean z) {
        this.b = Boolean.valueOf(z);
        return this;
    }

    @O1.a
    public a1 f(String s) {
        this.a = s;
        return this;
    }

    @O1.a
    public a1 g(int v) {
        boolean z = false;
        H.m(v >= 1, "Thread priority (%s) must be >= %s", v, 1);
        if(v <= 10) {
            z = true;
        }
        H.m(z, "Thread priority (%s) must be <= %s", v, 10);
        this.c = v;
        return this;
    }

    @O1.a
    public a1 h(ThreadFactory threadFactory0) {
        this.e = (ThreadFactory)H.E(threadFactory0);
        return this;
    }

    @O1.a
    public a1 i(Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0) {
        this.d = (Thread.UncaughtExceptionHandler)H.E(thread$UncaughtExceptionHandler0);
        return this;
    }
}

