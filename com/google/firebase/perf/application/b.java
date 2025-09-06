package com.google.firebase.perf.application;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.v1.g;
import java.lang.ref.WeakReference;

public abstract class b implements com.google.firebase.perf.application.a.b {
    private final WeakReference appStateCallback;
    private final a appStateMonitor;
    private g currentAppState;
    private boolean isRegisteredForAppState;

    protected b() {
        this(a.c());
    }

    protected b(@NonNull a a0) {
        this.isRegisteredForAppState = false;
        this.currentAppState = g.b;
        this.appStateMonitor = a0;
        this.appStateCallback = new WeakReference(this);
    }

    public g getAppState() {
        return this.currentAppState;
    }

    @VisibleForTesting
    public WeakReference getAppStateCallback() {
        return this.appStateCallback;
    }

    protected void incrementTsnsCount(int v) {
        this.appStateMonitor.i(v);
    }

    @Override  // com.google.firebase.perf.application.a$b
    public void onUpdateAppState(g g0) {
        g g1 = this.currentAppState;
        g g2 = g.b;
        if(g1 == g2) {
            this.currentAppState = g0;
            return;
        }
        if(g1 != g0 && g0 != g2) {
            this.currentAppState = g.e;
        }
    }

    protected void registerForAppState() {
        if(this.isRegisteredForAppState) {
            return;
        }
        this.currentAppState = this.appStateMonitor.b();
        this.appStateMonitor.p(this.appStateCallback);
        this.isRegisteredForAppState = true;
    }

    protected void unregisterForAppState() {
        if(!this.isRegisteredForAppState) {
            return;
        }
        this.appStateMonitor.x(this.appStateCallback);
        this.isRegisteredForAppState = false;
    }
}

