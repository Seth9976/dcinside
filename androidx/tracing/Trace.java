package androidx.tracing;

import android.os.Build.VERSION;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class Trace {
    static final String a = "Trace";
    static final int b = 0x7F;
    private static long c;
    private static Method d;
    private static Method e;
    private static Method f;
    private static Method g;
    private static boolean h;

    public static void a(@NonNull String s, int v) {
        if(Build.VERSION.SDK_INT >= 29) {
            TraceApi29Impl.a(Trace.m(s), v);
            return;
        }
        Trace.b(Trace.m(s), v);
    }

    private static void b(@NonNull String s, int v) {
        try {
            if(Trace.e == null) {
                Trace.e = android.os.Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            Trace.e.invoke(null, Trace.c, s, v);
            return;
        }
        catch(Exception exception0) {
        }
        Trace.h("asyncTraceBegin", exception0);
    }

    public static void c(@NonNull String s) {
        TraceApi18Impl.a(Trace.m(s));
    }

    public static void d(@NonNull String s, int v) {
        if(Build.VERSION.SDK_INT >= 29) {
            TraceApi29Impl.b(Trace.m(s), v);
            return;
        }
        Trace.e(Trace.m(s), v);
    }

    private static void e(@NonNull String s, int v) {
        try {
            if(Trace.f == null) {
                Trace.f = android.os.Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            Trace.f.invoke(null, Trace.c, s, v);
            return;
        }
        catch(Exception exception0) {
        }
        Trace.h("asyncTraceEnd", exception0);
    }

    public static void f() {
        TraceApi18Impl.b();
    }

    public static void g() {
        if(Build.VERSION.SDK_INT < 0x1F && !Trace.h) {
            try {
                Trace.h = true;
                android.os.Trace.class.getMethod("setAppTracingAllowed", Boolean.TYPE).invoke(null, Boolean.TRUE);
            }
            catch(Exception exception0) {
                Trace.h("setAppTracingAllowed", exception0);
            }
        }
    }

    private static void h(@NonNull String s, @NonNull Exception exception0) {
        if(exception0 instanceof InvocationTargetException) {
            Throwable throwable0 = exception0.getCause();
            throw throwable0 instanceof RuntimeException ? ((RuntimeException)throwable0) : new RuntimeException(throwable0);
        }
        Log.v("Trace", "Unable to call " + s + " via reflection", exception0);
    }

    public static boolean i() {
        return Build.VERSION.SDK_INT < 29 ? Trace.j() : TraceApi29Impl.c();
    }

    private static boolean j() {
        try {
            Class class0 = android.os.Trace.class;
            if(Trace.d == null) {
                Trace.c = class0.getField("TRACE_TAG_APP").getLong(null);
                Trace.d = class0.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean)Trace.d.invoke(null, Trace.c)).booleanValue();
        }
        catch(Exception exception0) {
        }
        Trace.h("isTagEnabled", exception0);
        return false;
    }

    public static void k(@NonNull String s, int v) {
        if(Build.VERSION.SDK_INT >= 29) {
            TraceApi29Impl.d(Trace.m(s), v);
            return;
        }
        Trace.l(Trace.m(s), v);
    }

    private static void l(@NonNull String s, int v) {
        try {
            if(Trace.g == null) {
                Trace.g = android.os.Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            Trace.g.invoke(null, Trace.c, s, v);
            return;
        }
        catch(Exception exception0) {
        }
        Trace.h("traceCounter", exception0);
    }

    @NonNull
    private static String m(@NonNull String s) {
        return s.length() > 0x7F ? s.substring(0, 0x7F) : s;
    }
}

