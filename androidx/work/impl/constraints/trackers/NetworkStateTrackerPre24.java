package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.jvm.internal.L;
import y4.l;

public final class NetworkStateTrackerPre24 extends BroadcastReceiverConstraintTracker {
    @l
    private final ConnectivityManager g;

    public NetworkStateTrackerPre24(@l Context context0, @l TaskExecutor taskExecutor0) {
        L.p(context0, "context");
        L.p(taskExecutor0, "taskExecutor");
        super(context0, taskExecutor0);
        Object object0 = this.d().getSystemService("connectivity");
        L.n(object0, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.g = (ConnectivityManager)object0;
    }

    @Override  // androidx.work.impl.constraints.trackers.ConstraintTracker
    public Object f() {
        return this.n();
    }

    @Override  // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    @l
    public IntentFilter k() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override  // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public void l(@l Intent intent0) {
        L.p(intent0, "intent");
        if(L.g(intent0.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            Logger.e().a("WM-NetworkStateTracker", "Network broadcast received");
            this.h(NetworkStateTrackerKt.c(this.g));
        }
    }

    public static void m() {
    }

    @l
    public NetworkState n() {
        return NetworkStateTrackerKt.c(this.g);
    }
}

