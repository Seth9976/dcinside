package androidx.media3.exoplayer.scheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

@UnstableApi
public final class RequirementsWatcher {
    class DeviceStatusChangeReceiver extends BroadcastReceiver {
        final RequirementsWatcher a;

        private DeviceStatusChangeReceiver() {
        }

        DeviceStatusChangeReceiver(androidx.media3.exoplayer.scheduler.RequirementsWatcher.1 requirementsWatcher$10) {
        }

        @Override  // android.content.BroadcastReceiver
        public void onReceive(Context context0, Intent intent0) {
            if(!this.isInitialStickyBroadcast()) {
                RequirementsWatcher.this.e();
            }
        }
    }

    public interface Listener {
        void a(RequirementsWatcher arg1, int arg2);
    }

    @RequiresApi(24)
    final class NetworkCallback extends ConnectivityManager.NetworkCallback {
        private boolean a;
        private boolean b;
        final RequirementsWatcher c;

        private NetworkCallback() {
        }

        NetworkCallback(androidx.media3.exoplayer.scheduler.RequirementsWatcher.1 requirementsWatcher$10) {
        }

        // 检测为 Lambda 实现
        private void c() [...]

        // 检测为 Lambda 实现
        private void d() [...]

        private void e() {
            RequirementsWatcher.this.d.post(() -> if(RequirementsWatcher.this.g != null) {
                RequirementsWatcher.this.e();
            });
        }

        private void f() {
            f f0 = () -> if(RequirementsWatcher.this.g != null) {
                RequirementsWatcher.this.g();
            };
            RequirementsWatcher.this.d.post(f0);
        }

        @Override  // android.net.ConnectivityManager$NetworkCallback
        public void onAvailable(Network network0) {
            this.e();
        }

        @Override  // android.net.ConnectivityManager$NetworkCallback
        public void onBlockedStatusChanged(Network network0, boolean z) {
            if(!z) {
                this.f();
            }
        }

        @Override  // android.net.ConnectivityManager$NetworkCallback
        public void onCapabilitiesChanged(Network network0, NetworkCapabilities networkCapabilities0) {
            boolean z = networkCapabilities0.hasCapability(16);
            if(!this.a || this.b != z) {
                this.a = true;
                this.b = z;
                this.e();
            }
            else if(z) {
                this.f();
            }
        }

        @Override  // android.net.ConnectivityManager$NetworkCallback
        public void onLost(Network network0) {
            this.e();
        }
    }

    private final Context a;
    private final Listener b;
    private final Requirements c;
    private final Handler d;
    @Nullable
    private DeviceStatusChangeReceiver e;
    private int f;
    @Nullable
    private NetworkCallback g;

    public RequirementsWatcher(Context context0, Listener requirementsWatcher$Listener0, Requirements requirements0) {
        this.a = context0.getApplicationContext();
        this.b = requirementsWatcher$Listener0;
        this.c = requirements0;
        this.d = Util.J();
    }

    private void e() {
        int v = this.c.e(this.a);
        if(this.f != v) {
            this.f = v;
            this.b.a(this, v);
        }
    }

    public Requirements f() {
        return this.c;
    }

    private void g() {
        if((this.f & 3) == 0) {
            return;
        }
        this.e();
    }

    @RequiresApi(24)
    private void h() {
        ConnectivityManager connectivityManager0 = (ConnectivityManager)Assertions.g(((ConnectivityManager)this.a.getSystemService("connectivity")));
        NetworkCallback requirementsWatcher$NetworkCallback0 = new NetworkCallback(this, null);
        this.g = requirementsWatcher$NetworkCallback0;
        connectivityManager0.registerDefaultNetworkCallback(requirementsWatcher$NetworkCallback0);
    }

    public int i() {
        this.f = this.c.e(this.a);
        IntentFilter intentFilter0 = new IntentFilter();
        if(this.c.o()) {
            if(Util.a >= 24) {
                this.h();
            }
            else {
                intentFilter0.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if(this.c.g()) {
            intentFilter0.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter0.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if(this.c.l()) {
            if(Util.a >= 23) {
                intentFilter0.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            }
            else {
                intentFilter0.addAction("android.intent.action.SCREEN_ON");
                intentFilter0.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if(this.c.r()) {
            intentFilter0.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter0.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        DeviceStatusChangeReceiver requirementsWatcher$DeviceStatusChangeReceiver0 = new DeviceStatusChangeReceiver(this, null);
        this.e = requirementsWatcher$DeviceStatusChangeReceiver0;
        this.a.registerReceiver(requirementsWatcher$DeviceStatusChangeReceiver0, intentFilter0, null, this.d);
        return this.f;
    }

    public void j() {
        BroadcastReceiver broadcastReceiver0 = (BroadcastReceiver)Assertions.g(this.e);
        this.a.unregisterReceiver(broadcastReceiver0);
        this.e = null;
        if(Util.a >= 24 && this.g != null) {
            this.k();
        }
    }

    @RequiresApi(24)
    private void k() {
        ((ConnectivityManager)Assertions.g(((ConnectivityManager)this.a.getSystemService("connectivity")))).unregisterNetworkCallback(((ConnectivityManager.NetworkCallback)Assertions.g(this.g)));
        this.g = null;
    }

    class androidx.media3.exoplayer.scheduler.RequirementsWatcher.1 {
    }

}

