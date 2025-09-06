package com.unity3d.ads.core.extensions;

import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.sequences.p;
import kotlin.text.v;
import y4.l;

public final class ExceptionExtensionsKt {
    @l
    public static final String getShortenedStackTrace(@l Throwable throwable0, int v) {
        String s1;
        L.p(throwable0, "<this>");
        try {
            StringWriter stringWriter0 = new StringWriter();
            try {
                PrintWriter printWriter0 = new PrintWriter(stringWriter0);
                try {
                    throwable0.printStackTrace(printWriter0);
                    String s = stringWriter0.toString();
                    L.o(s, "stringWriter.toString()");
                    s1 = p.e1(p.Y2(v.M3(v.G5(s).toString()), v), "\n", null, null, 0, null, null, 62, null);
                }
                catch(Throwable throwable2) {
                    c.a(printWriter0, throwable2);
                    throw throwable2;
                }
                c.a(printWriter0, null);
            }
            catch(Throwable throwable1) {
                c.a(stringWriter0, throwable1);
                throw throwable1;
            }
            c.a(stringWriter0, null);
            return s1;
        }
        catch(Throwable unused_ex) {
            return "";
        }
    }

    public static String getShortenedStackTrace$default(Throwable throwable0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 15;
        }
        return ExceptionExtensionsKt.getShortenedStackTrace(throwable0, v);
    }

    @l
    public static final String retrieveUnityCrashValue(@l Throwable throwable0) {
        boolean z;
        StackTraceElement stackTraceElement0;
        L.p(throwable0, "<this>");
        StackTraceElement[] arr_stackTraceElement = throwable0.getStackTrace();
        L.o(arr_stackTraceElement, "this.stackTrace");
        for(int v = 0; true; ++v) {
            stackTraceElement0 = null;
            if(v >= arr_stackTraceElement.length) {
                break;
            }
            StackTraceElement stackTraceElement1 = arr_stackTraceElement[v];
            if(stackTraceElement1 == null) {
                z = false;
            }
            else {
                String s = stackTraceElement1.getClassName();
                if(s != null) {
                    L.o(s, "className");
                    z = v.W2(s, "com.unity3d", false, 2, null);
                }
            }
            if(z) {
                stackTraceElement0 = stackTraceElement1;
                break;
            }
        }
        if(stackTraceElement0 != null) {
            String s1 = stackTraceElement0.getFileName();
            if(s1 == null) {
                s1 = "unknown";
            }
            else {
                L.o(s1, "it.fileName ?: SDKErrorHandler.UNKNOWN_FILE");
            }
            String s2 = s1 + '_' + stackTraceElement0.getLineNumber();
            return s2 == null ? "unknown" : s2;
        }
        return "unknown";
    }
}

