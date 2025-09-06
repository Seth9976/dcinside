package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.jvm.internal.L;
import y4.l;

@RestrictTo({Scope.b})
public final class BatteryChargingTracker extends BroadcastReceiverConstraintTracker {
    public BatteryChargingTracker(@l Context context0, @l TaskExecutor taskExecutor0) {
        L.p(context0, "context");
        L.p(taskExecutor0, "taskExecutor");
        super(context0, taskExecutor0);
    }

    @Override  // androidx.work.impl.constraints.trackers.ConstraintTracker
    public Object f() {
        return this.n();
    }

    @Override  // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    @l
    public IntentFilter k() {
        IntentFilter intentFilter0 = new IntentFilter();
        if(Build.VERSION.SDK_INT >= 23) {
            intentFilter0.addAction("android.os.action.CHARGING");
            intentFilter0.addAction("android.os.action.DISCHARGING");
            return intentFilter0;
        }
        intentFilter0.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter0.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        return intentFilter0;
    }

    @Override  // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public void l(@l Intent intent0) {
        L.p(intent0, "intent");
        String s = intent0.getAction();
        if(s == null) {
            return;
        }
        Logger.e().a("WM-BatteryChrgTracker", "Received " + s);
        switch(s) {
            case "android.intent.action.ACTION_POWER_CONNECTED": {
                this.h(Boolean.TRUE);
                return;
            }
            case "android.intent.action.ACTION_POWER_DISCONNECTED": {
                this.h(Boolean.FALSE);
                return;
            }
            case "android.os.action.CHARGING": {
                this.h(Boolean.TRUE);
                return;
            }
            case "android.os.action.DISCHARGING": {
                this.h(Boolean.FALSE);
            }
        }
    }

    private final boolean m(Intent intent0) {
        if(Build.VERSION.SDK_INT >= 23) {
            switch(intent0.getIntExtra("status", -1)) {
                case 2: 
                case 5: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        return intent0.getIntExtra("plugged", 0) != 0;
    }

    @l
    public Boolean n() {
        Intent intent0 = this.d().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if(intent0 == null) {
            Logger.e().c("WM-BatteryChrgTracker", "getInitialState - null intent received");
            return false;
        }
        return Boolean.valueOf(this.m(intent0));
    }
}

