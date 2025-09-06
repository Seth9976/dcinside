package r2;

import com.google.firebase.perf.e;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.metrics.i;
import kotlin.c0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.k;
import n2.b;
import y4.l;

@s0({"SMAP\nPerformance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Performance.kt\ncom/google/firebase/perf/ktx/PerformanceKt\n*L\n1#1,117:1\n78#1,5:118\n*S KotlinDebug\n*F\n+ 1 Performance.kt\ncom/google/firebase/perf/ktx/PerformanceKt\n*L\n99#1:118,5\n*E\n"})
public final class c {
    @l
    public static final e a(@l b b0) {
        L.p(b0, "<this>");
        e e0 = e.c();
        L.o(e0, "getInstance()");
        return e0;
    }

    @k(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @c0(expression = "", imports = {}))
    public static final Object b(@l Trace trace0, @l Function1 function10) {
        L.p(trace0, "<this>");
        L.p(function10, "block");
        trace0.start();
        try {
            return function10.invoke(trace0);
        }
        finally {
            trace0.stop();
        }
    }

    @k(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @c0(expression = "", imports = {}))
    public static final Object c(@l String s, @l Function1 function10) {
        L.p(s, "name");
        L.p(function10, "block");
        Trace trace0 = Trace.d(s);
        L.o(trace0, "create(name)");
        trace0.start();
        try {
            return function10.invoke(trace0);
        }
        finally {
            trace0.stop();
        }
    }

    @k(message = "Migrate to use the KTX API from the main module: https://firebase.google.com/docs/android/kotlin-migration.", replaceWith = @c0(expression = "", imports = {}))
    public static final void d(@l i i0, @l Function1 function10) {
        L.p(i0, "<this>");
        L.p(function10, "block");
        i0.h();
        try {
            function10.invoke(i0);
        }
        finally {
            i0.i();
        }
    }
}

