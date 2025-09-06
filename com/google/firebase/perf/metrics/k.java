package com.google.firebase.perf.metrics;

import androidx.annotation.NonNull;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.v1.u;
import com.google.firebase.perf.v1.x.b;
import com.google.firebase.perf.v1.x;
import java.util.Arrays;
import java.util.List;

class k {
    private final Trace a;

    k(@NonNull Trace trace0) {
        this.a = trace0;
    }

    x a() {
        b x$b0 = x.Xb().Xb(this.a.g()).Ub(this.a.i().f()).Vb(this.a.i().e(this.a.f()));
        for(Object object0: this.a.e().values()) {
            x$b0.Ob(((Counter)object0).c(), ((Counter)object0).a());
        }
        List list0 = this.a.l();
        if(!list0.isEmpty()) {
            for(Object object1: list0) {
                x$b0.Db(new k(((Trace)object1)).a());
            }
        }
        x$b0.Nb(this.a.getAttributes());
        u[] arr_u = PerfSession.c(this.a.h());
        if(arr_u != null) {
            x$b0.ub(Arrays.asList(arr_u));
        }
        return (x)x$b0.build();
    }
}

