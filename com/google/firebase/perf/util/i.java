package com.google.firebase.perf.util;

import com.google.firebase.perf.logging.a;
import com.google.firebase.perf.metrics.Trace;

public class i {
    private static final a a;

    static {
        i.a = a.e();
    }

    public static Trace a(Trace trace0, com.google.firebase.perf.metrics.h.a h$a0) {
        if(h$a0.d() > 0) {
            trace0.putMetric("_fr_tot", ((long)h$a0.d()));
        }
        if(h$a0.c() > 0) {
            trace0.putMetric("_fr_slo", ((long)h$a0.c()));
        }
        if(h$a0.b() > 0) {
            trace0.putMetric("_fr_fzn", ((long)h$a0.b()));
        }
        i.a.a("Screen trace: " + trace0.g() + " _fr_tot:" + h$a0.d() + " _fr_slo:" + h$a0.c() + " _fr_fzn:" + h$a0.b());
        return trace0;
    }
}

