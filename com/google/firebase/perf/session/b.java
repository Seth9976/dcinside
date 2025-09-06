package com.google.firebase.perf.session;

import android.content.Context;

public final class b implements Runnable {
    public final SessionManager a;
    public final Context b;
    public final PerfSession c;

    public b(SessionManager sessionManager0, Context context0, PerfSession perfSession0) {
        this.a = sessionManager0;
        this.b = context0;
        this.c = perfSession0;
    }

    @Override
    public final void run() {
        this.a.lambda$setApplicationContext$0(this.b, this.c);
    }
}

