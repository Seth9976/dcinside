package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build.VERSION;
import androidx.annotation.RequiresApi;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.utils.NetworkApi21;
import androidx.work.impl.utils.NetworkApi24;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(24)
public final class NetworkStateTracker24 extends ConstraintTracker {
    @l
    private final ConnectivityManager f;
    @l
    private final androidx.work.impl.constraints.trackers.NetworkStateTracker24.networkCallback.1 g;

    public NetworkStateTracker24(@l Context context0, @l TaskExecutor taskExecutor0) {
        L.p(context0, "context");
        L.p(taskExecutor0, "taskExecutor");
        super(context0, taskExecutor0);
        Object object0 = this.d().getSystemService("connectivity");
        L.n(object0, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f = (ConnectivityManager)object0;
        this.g = new ConnectivityManager.NetworkCallback() {
            @Override  // android.net.ConnectivityManager$NetworkCallback
            public void onCapabilitiesChanged(Network network0, NetworkCapabilities networkCapabilities0) {
                L.p(network0, "network");
                L.p(networkCapabilities0, "capabilities");
                Logger.e().a("WM-NetworkStateTracker", "Network capabilities changed: " + networkCapabilities0);
                NetworkState networkState0 = Build.VERSION.SDK_INT < 28 ? NetworkStateTrackerKt.c(this.a.f) : NetworkStateTrackerKt.d(networkCapabilities0);
                this.a.h(networkState0);
            }

            @Override  // android.net.ConnectivityManager$NetworkCallback
            public void onLost(Network network0) {
                L.p(network0, "network");
                Logger.e().a("WM-NetworkStateTracker", "Network connection lost");
                NetworkState networkState0 = NetworkStateTrackerKt.c(this.a.f);
                this.a.h(networkState0);
            }
        };
    }

    @Override  // androidx.work.impl.constraints.trackers.ConstraintTracker
    public Object f() {
        return this.l();
    }

    @Override  // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void i() {
        try {
            Logger.e().a("WM-NetworkStateTracker", "Registering network callback");
            NetworkApi24.a(this.f, this.g);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            Logger.e().d("WM-NetworkStateTracker", "Received exception while registering network callback", illegalArgumentException0);
        }
        catch(SecurityException securityException0) {
            Logger.e().d("WM-NetworkStateTracker", "Received exception while registering network callback", securityException0);
        }
    }

    @Override  // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void j() {
        try {
            Logger.e().a("WM-NetworkStateTracker", "Unregistering network callback");
            NetworkApi21.c(this.f, this.g);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            Logger.e().d("WM-NetworkStateTracker", "Received exception while unregistering network callback", illegalArgumentException0);
        }
        catch(SecurityException securityException0) {
            Logger.e().d("WM-NetworkStateTracker", "Received exception while unregistering network callback", securityException0);
        }
    }

    @l
    public NetworkState l() {
        return NetworkStateTrackerKt.c(this.f);
    }
}

