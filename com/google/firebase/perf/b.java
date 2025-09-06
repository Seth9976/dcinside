package com.google.firebase.perf;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.firebase.h;
import com.google.firebase.perf.config.a;
import com.google.firebase.perf.metrics.AppStartTrace.c;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.u;
import java.util.concurrent.Executor;

public class b {
    public b(h h0, @Nullable u u0, Executor executor0) {
        Context context0 = h0.n();
        a.h().R(context0);
        com.google.firebase.perf.application.a a0 = com.google.firebase.perf.application.a.c();
        a0.n(context0);
        a0.o(new g());
        if(u0 != null) {
            AppStartTrace appStartTrace0 = AppStartTrace.k();
            appStartTrace0.C(context0);
            executor0.execute(new c(appStartTrace0));
        }
        SessionManager.getInstance().initializeGaugeCollection();
    }
}

