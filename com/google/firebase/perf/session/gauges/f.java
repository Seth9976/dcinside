package com.google.firebase.perf.session.gauges;

import h2.b;
import java.util.concurrent.Executors;

public final class f implements b {
    @Override  // h2.b
    public final Object get() {
        return Executors.newSingleThreadScheduledExecutor();
    }
}

