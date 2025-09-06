package com.google.android.datatransport.runtime;

import android.annotation.SuppressLint;
import androidx.annotation.WorkerThread;
import com.google.android.datatransport.h;
import com.google.android.datatransport.l;
import z1.a;

public final class m {
    private static final String a = "ForcedSender";

    @SuppressLint({"DiscouragedApi"})
    @WorkerThread
    public static void a(l l0, h h0) {
        if(l0 instanceof u) {
            r r0 = ((u)l0).d().f(h0);
            w.c().e().u(r0, 1);
            return;
        }
        a.i("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", l0);
    }
}

