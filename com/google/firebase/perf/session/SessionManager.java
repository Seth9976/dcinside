package com.google.firebase.perf.session;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.application.a;
import com.google.firebase.perf.application.b;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.v1.g;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Keep
public class SessionManager extends b {
    private final a appStateMonitor;
    private final Set clients;
    private final GaugeManager gaugeManager;
    @SuppressLint({"StaticFieldLeak"})
    private static final SessionManager instance;
    private PerfSession perfSession;
    private Future syncInitFuture;

    static {
        SessionManager.instance = new SessionManager();
    }

    private SessionManager() {
        this(GaugeManager.getInstance(), PerfSession.d("8c7f7057-1e21-4487-a6f3-509cc587fd42"), a.c());
    }

    @VisibleForTesting
    public SessionManager(GaugeManager gaugeManager0, PerfSession perfSession0, a a0) {
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager0;
        this.perfSession = perfSession0;
        this.appStateMonitor = a0;
        this.registerForAppState();
    }

    public static SessionManager getInstance() {
        return SessionManager.instance;
    }

    @VisibleForTesting
    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        this.logGaugeMetadataIfCollectionEnabled(g.c);
        this.startOrStopCollectingGauges(g.c);
    }

    // 检测为 Lambda 实现
    private void lambda$setApplicationContext$0(Context context0, PerfSession perfSession0) [...]

    private void logGaugeMetadataIfCollectionEnabled(g g0) {
        if(this.perfSession.f()) {
            this.gaugeManager.logGaugeMetadata(this.perfSession.l(), g0);
        }
    }

    @Override  // com.google.firebase.perf.application.b
    public void onUpdateAppState(g g0) {
        super.onUpdateAppState(g0);
        if(this.appStateMonitor.j()) {
            return;
        }
        if(g0 == g.c) {
            this.updatePerfSession(PerfSession.d("87121ebc-4d45-49aa-ace2-eaf1c4a2d7f8"));
            return;
        }
        if(this.perfSession.g()) {
            this.updatePerfSession(PerfSession.d("c06bd853-d561-4a82-9b37-c455fbc80bd3"));
            return;
        }
        this.startOrStopCollectingGauges(g0);
    }

    public final PerfSession perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference weakReference0) {
        synchronized(this.clients) {
            this.clients.add(weakReference0);
        }
    }

    public void setApplicationContext(Context context0) {
        PerfSession perfSession0 = this.perfSession;
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(() -> {
            this.gaugeManager.initializeGaugeMetadataManager(context0);
            if(perfSession0.f()) {
                this.gaugeManager.logGaugeMetadata(perfSession0.l(), g.c);
            }
        });
    }

    @VisibleForTesting
    public void setPerfSession(PerfSession perfSession0) {
        this.perfSession = perfSession0;
    }

    private void startOrStopCollectingGauges(g g0) {
        if(this.perfSession.f()) {
            this.gaugeManager.startCollectingGauges(this.perfSession, g0);
            return;
        }
        this.gaugeManager.stopCollectingGauges();
    }

    public void stopGaugeCollectionIfSessionRunningTooLong() {
        if(this.perfSession.g()) {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public void unregisterForSessionUpdates(WeakReference weakReference0) {
        synchronized(this.clients) {
            this.clients.remove(weakReference0);
        }
    }

    public void updatePerfSession(PerfSession perfSession0) {
        if(perfSession0.l() == this.perfSession.l()) {
            return;
        }
        this.perfSession = perfSession0;
        synchronized(this.clients) {
            Iterator iterator0 = this.clients.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                com.google.firebase.perf.session.a a0 = (com.google.firebase.perf.session.a)((WeakReference)object0).get();
                if(a0 == null) {
                    iterator0.remove();
                }
                else {
                    a0.a(perfSession0);
                }
            }
        }
        this.logGaugeMetadataIfCollectionEnabled(this.appStateMonitor.b());
        this.startOrStopCollectingGauges(this.appStateMonitor.b());
    }
}

