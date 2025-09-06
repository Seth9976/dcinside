package com.apm.insight.entity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class c extends a {
    private String a;

    private c(String s) {
        this.a = s;
    }

    @NonNull
    public static c a(@NonNull StackTraceElement stackTraceElement0, @NonNull String s, @Nullable String s1, @NonNull String s2, boolean z, String s3, String s4) {
        c c0 = new c(s4);
        String s5 = stackTraceElement0.getClassName();
        String s6 = stackTraceElement0.getMethodName();
        int v = stackTraceElement0.getLineNumber();
        c0.a("event_type", "exception");
        c0.a("log_type", s4);
        c0.a("timestamp", System.currentTimeMillis());
        c0.a("crash_time", System.currentTimeMillis());
        c0.a("class_ref", s5);
        c0.a("method", s6);
        c0.a("line_num", v);
        c0.a("stack", s);
        c0.a("exception_type", 1);
        c0.a("ensure_type", s3);
        c0.a("is_core", ((int)z));
        c0.a("message", s1);
        c0.a("process_name", "");
        c0.a("crash_thread_name", s2);
        d.b(c0.c());
        return c0;
    }
}

