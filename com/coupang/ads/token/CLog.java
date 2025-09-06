package com.coupang.ads.token;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class CLog {
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int HIDE = 1;
    public static final int INFO = 4;
    @l
    public static final CLog INSTANCE = null;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;

    static {
        CLog.INSTANCE = new CLog();
    }

    public final int d(@m String s, @l String s1) {
        L.p(s1, "msg");
        return this.println(3, s, s1);
    }

    public final int d(@m String s, @l String s1, @m Throwable throwable0) {
        L.p(s1, "msg");
        return this.println(3, s, s1 + '\n' + this.getStackTraceString(throwable0));
    }

    public final int e(@m String s, @l String s1) {
        L.p(s1, "msg");
        return this.println(6, s, s1);
    }

    public final int e(@m String s, @l String s1, @m Throwable throwable0) {
        L.p(s1, "msg");
        return this.println(6, s, s1 + '\n' + this.getStackTraceString(throwable0));
    }

    private final String getStackTraceString(Throwable throwable0) {
        if(throwable0 == null) {
            return "";
        }
        for(Throwable throwable1 = throwable0; throwable1 != null; throwable1 = throwable1.getCause()) {
            if(throwable1 instanceof UnknownHostException) {
                return "";
            }
        }
        StringWriter stringWriter0 = new StringWriter();
        PrintWriter printWriter0 = new PrintWriter(stringWriter0);
        throwable0.printStackTrace(printWriter0);
        printWriter0.flush();
        String s = stringWriter0.toString();
        L.o(s, "sw.toString()");
        return s;
    }

    public final int h(@m String s, @l String s1) {
        L.p(s1, "msg");
        return this.println(1, s, s1);
    }

    public final int h(@m String s, @l String s1, @m Throwable throwable0) {
        L.p(s1, "msg");
        return this.println(1, s, s1 + '\n' + this.getStackTraceString(throwable0));
    }

    public final int i(@m String s, @l String s1) {
        L.p(s1, "msg");
        return this.println(4, s, s1);
    }

    public final int i(@m String s, @l String s1, @m Throwable throwable0) {
        L.p(s1, "msg");
        return this.println(4, s, s1 + '\n' + this.getStackTraceString(throwable0));
    }

    private final int println(int v, String s, String s1) {
        Log.println(v, s, s1);
        return 0;
    }

    public final int v(@m String s, @l String s1) {
        L.p(s1, "msg");
        return this.println(2, s, s1);
    }

    public final int v(@m String s, @l String s1, @m Throwable throwable0) {
        L.p(s1, "msg");
        return this.println(2, s, s1 + '\n' + this.getStackTraceString(throwable0));
    }

    public final int w(@m String s, @l String s1) {
        L.p(s1, "msg");
        return this.println(5, s, s1);
    }

    public final int w(@m String s, @l String s1, @m Throwable throwable0) {
        L.p(s1, "msg");
        return this.println(5, s, s1 + '\n' + this.getStackTraceString(throwable0));
    }

    public final int w(@m String s, @m Throwable throwable0) {
        return this.println(5, s, this.getStackTraceString(throwable0));
    }
}

