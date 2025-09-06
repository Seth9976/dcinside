package androidx.core.os;

import android.os.Build.VERSION;
import android.os.Trace;
import android.util.Log;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;

@Deprecated
public final class TraceCompat {
    @RequiresApi(29)
    static class Api29Impl {
        static void a(String s, int v) {
            Trace.beginAsyncSection(s, v);
        }

        static void b(String s, int v) {
            Trace.endAsyncSection(s, v);
        }

        static boolean c() {
            return Trace.isEnabled();
        }

        static void d(String s, long v) {
            Trace.setCounter(s, v);
        }
    }

    private static final String a = "TraceCompat";
    private static long b;
    private static Method c;
    private static Method d;
    private static Method e;
    private static Method f;

    static {
        Class class0 = String.class;
        Class class1 = Trace.class;
        if(Build.VERSION.SDK_INT < 29) {
            try {
                TraceCompat.b = class1.getField("TRACE_TAG_APP").getLong(null);
                Class class2 = Long.TYPE;
                TraceCompat.c = class1.getMethod("isTagEnabled", class2);
                Class class3 = Integer.TYPE;
                TraceCompat.d = class1.getMethod("asyncTraceBegin", class2, class0, class3);
                TraceCompat.e = class1.getMethod("asyncTraceEnd", class2, class0, class3);
                TraceCompat.f = class1.getMethod("traceCounter", class2, class0, class3);
            }
            catch(Exception exception0) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", exception0);
            }
        }
    }

    public static void a(String s, int v) {
        if(Build.VERSION.SDK_INT >= 29) {
            Api29Impl.a(s, v);
            return;
        }
        try {
            TraceCompat.d.invoke(null, TraceCompat.b, s, v);
        }
        catch(Exception unused_ex) {
            Log.v("TraceCompat", "Unable to invoke asyncTraceBegin() via reflection.");
        }
    }

    public static void b(String s) {
        Trace.beginSection(s);
    }

    public static void c(String s, int v) {
        if(Build.VERSION.SDK_INT >= 29) {
            Api29Impl.b(s, v);
            return;
        }
        try {
            TraceCompat.e.invoke(null, TraceCompat.b, s, v);
        }
        catch(Exception unused_ex) {
            Log.v("TraceCompat", "Unable to invoke endAsyncSection() via reflection.");
        }
    }

    public static void d() {
        Trace.endSection();
    }

    public static boolean e() {
        if(Build.VERSION.SDK_INT >= 29) {
            return Api29Impl.c();
        }
        try {
            return ((Boolean)TraceCompat.c.invoke(null, TraceCompat.b)).booleanValue();
        }
        catch(Exception unused_ex) {
            Log.v("TraceCompat", "Unable to invoke isTagEnabled() via reflection.");
            return false;
        }
    }

    public static void f(String s, int v) {
        if(Build.VERSION.SDK_INT >= 29) {
            Api29Impl.d(s, ((long)v));
            return;
        }
        try {
            TraceCompat.f.invoke(null, TraceCompat.b, s, v);
        }
        catch(Exception unused_ex) {
            Log.v("TraceCompat", "Unable to invoke traceCounter() via reflection.");
        }
    }
}

