package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver.PendingResult;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.Logger;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.utils.PackageManagerHelper;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    static final String a = null;
    static final String b = "androidx.work.impl.background.systemalarm.UpdateProxies";
    static final String c = "KEY_BATTERY_NOT_LOW_PROXY_ENABLED";
    static final String d = "KEY_BATTERY_CHARGING_PROXY_ENABLED";
    static final String e = "KEY_STORAGE_NOT_LOW_PROXY_ENABLED";
    static final String f = "KEY_NETWORK_STATE_PROXY_ENABLED";

    static {
        ConstraintProxyUpdateReceiver.a = "WM-ConstrntProxyUpdtRec";
    }

    @NonNull
    public static Intent a(@NonNull Context context0, boolean z, boolean z1, boolean z2, boolean z3) {
        Intent intent0 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent0.setComponent(new ComponentName(context0, ConstraintProxyUpdateReceiver.class));
        intent0.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z1).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z2).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z3);
        return intent0;
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context0, @Nullable Intent intent0) {
        String s = intent0 == null ? null : intent0.getAction();
        if(!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(s)) {
            Logger.e().a("WM-ConstrntProxyUpdtRec", "Ignoring unknown action " + s);
            return;
        }
        BroadcastReceiver.PendingResult broadcastReceiver$PendingResult0 = this.goAsync();
        WorkManagerImpl.O(context0).X().b(new Runnable() {
            final ConstraintProxyUpdateReceiver d;

            @Override
            public void run() {
                try {
                    boolean z = intent0.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean z1 = intent0.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean z2 = intent0.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean z3 = intent0.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    Logger.e().a("WM-ConstrntProxyUpdtRec", "Updating proxies: (BatteryNotLowProxy (" + z + "), BatteryChargingProxy (" + z1 + "), StorageNotLowProxy (" + z2 + "), NetworkStateProxy (" + z3 + "), ");
                    PackageManagerHelper.e(context0, BatteryNotLowProxy.class, z);
                    PackageManagerHelper.e(context0, BatteryChargingProxy.class, z1);
                    PackageManagerHelper.e(context0, StorageNotLowProxy.class, z2);
                    PackageManagerHelper.e(context0, NetworkStateProxy.class, z3);
                }
                finally {
                    broadcastReceiver$PendingResult0.finish();
                }
            }
        });
    }
}

