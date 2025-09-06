package com.apm.insight.l;

import java.net.BindException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.SSLException;
import org.apache.http.conn.ConnectTimeoutException;

public final class g {
    private static final Set a;

    static {
        HashSet hashSet0 = new HashSet();
        g.a = hashSet0;
        hashSet0.add("HeapTaskDaemon");
        hashSet0.add("ThreadPlus");
        hashSet0.add("ApiDispatcher");
        hashSet0.add("ApiLocalDispatcher");
        hashSet0.add("AsyncLoader");
        hashSet0.add("AsyncTask");
        hashSet0.add("Binder");
        hashSet0.add("PackageProcessor");
        hashSet0.add("SettingsObserver");
        hashSet0.add("WifiManager");
        hashSet0.add("JavaBridge");
        hashSet0.add("Compiler");
        hashSet0.add("Signal Catcher");
        hashSet0.add("GC");
        hashSet0.add("ReferenceQueueDaemon");
        hashSet0.add("FinalizerDaemon");
        hashSet0.add("FinalizerWatchdogDaemon");
        hashSet0.add("CookieSyncManager");
        hashSet0.add("RefQueueWorker");
        hashSet0.add("CleanupReference");
        hashSet0.add("VideoManager");
        hashSet0.add("DBHelper-AsyncOp");
        hashSet0.add("InstalledAppTracker2");
        hashSet0.add("AppData-AsyncOp");
        hashSet0.add("IdleConnectionMonitor");
        hashSet0.add("LogReaper");
        hashSet0.add("ActionReaper");
        hashSet0.add("Okio Watchdog");
        hashSet0.add("CheckWaitingQueue");
        hashSet0.add("NPTH-CrashTimer");
        hashSet0.add("NPTH-JavaCallback");
        hashSet0.add("NPTH-LocalParser");
        hashSet0.add("ANR_FILE_MODIFY");
    }

    public static Set a() {
        return g.a;
    }

    public static boolean a(Throwable throwable0) {
        if(throwable0 == null) {
            return true;
        }
        if(throwable0 instanceof ConnectTimeoutException) {
            return true;
        }
        if(throwable0 instanceof SocketTimeoutException) {
            return true;
        }
        if(throwable0 instanceof BindException) {
            return true;
        }
        if(throwable0 instanceof ConnectException) {
            return true;
        }
        if(throwable0 instanceof NoRouteToHostException) {
            return true;
        }
        if(throwable0 instanceof PortUnreachableException) {
            return true;
        }
        if(throwable0 instanceof SocketException) {
            return true;
        }
        if(throwable0 instanceof UnknownHostException) {
            return true;
        }
        return throwable0 instanceof ProtocolException ? true : throwable0 instanceof SSLException;
    }
}

