package com.google.firebase.perf;

import com.google.firebase.d;
import com.google.firebase.perf.metrics.Trace;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nPerformance.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Performance.kt\ncom/google/firebase/perf/PerformanceKt\n*L\n1#1,68:1\n49#1,5:69\n*S KotlinDebug\n*F\n+ 1 Performance.kt\ncom/google/firebase/perf/PerformanceKt\n*L\n61#1:69,5\n*E\n"})
public final class i {
    @l
    public static final e a(@l d d0) {
        L.p(d0, "<this>");
        e e0 = e.c();
        L.o(e0, "getInstance()");
        return e0;
    }

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

    public static final void d(@l com.google.firebase.perf.metrics.i i0, @l Function1 function10) {
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

