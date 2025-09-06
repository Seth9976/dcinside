package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.g;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class c implements a, b {
    private final e a;
    private final int b;
    private final TimeUnit c;
    private final Object d;
    private CountDownLatch e;
    private boolean f;
    static final String g = "_ae";

    public c(@NonNull e e0, int v, TimeUnit timeUnit0) {
        this.d = new Object();
        this.f = false;
        this.a = e0;
        this.b = v;
        this.c = timeUnit0;
    }

    @Override  // com.google.firebase.crashlytics.internal.analytics.b
    public void B(@NonNull String s, @NonNull Bundle bundle0) {
        CountDownLatch countDownLatch0 = this.e;
        if(countDownLatch0 == null) {
            return;
        }
        if("_ae".equals(s)) {
            countDownLatch0.countDown();
        }
    }

    @Override  // com.google.firebase.crashlytics.internal.analytics.a
    public void a(@NonNull String s, @Nullable Bundle bundle0) {
        synchronized(this.d) {
            g.f().k("Logging event " + s + " to Firebase Analytics with params " + bundle0);
            this.e = new CountDownLatch(1);
            this.f = false;
            this.a.a(s, bundle0);
            g.f().k("Awaiting app exception callback from Analytics...");
            try {
                if(this.e.await(((long)this.b), this.c)) {
                    this.f = true;
                    g.f().k("App exception callback received from Analytics listener.");
                }
                else {
                    g.f().m("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                }
            }
            catch(InterruptedException unused_ex) {
                g.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
            }
            this.e = null;
        }
    }

    boolean b() {
        return this.f;
    }
}

