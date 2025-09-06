package com.google.firebase.perf;

import com.google.firebase.perf.application.a.a;

public final class g implements a {
    private static final com.google.firebase.perf.logging.a a;

    static {
        g.a = com.google.firebase.perf.logging.a.e();
    }

    @Override  // com.google.firebase.perf.application.a$a
    public void a() {
        try {
            e.c();
        }
        catch(IllegalStateException illegalStateException0) {
            g.a.m("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", new Object[]{illegalStateException0});
        }
    }
}

