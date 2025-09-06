package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.jvm.internal.L;
import y4.l;

@RestrictTo({Scope.b})
public final class BatteryNotLowTracker extends BroadcastReceiverConstraintTracker {
    public BatteryNotLowTracker(@l Context context0, @l TaskExecutor taskExecutor0) {
        L.p(context0, "context");
        L.p(taskExecutor0, "taskExecutor");
        super(context0, taskExecutor0);
    }

    @Override  // androidx.work.impl.constraints.trackers.ConstraintTracker
    public Object f() {
        return this.m();
    }

    @Override  // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    @l
    public IntentFilter k() {
        IntentFilter intentFilter0 = new IntentFilter();
        intentFilter0.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter0.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter0;
    }

    @Override  // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public void l(@l Intent intent0) {
        L.p(intent0, "intent");
        if(intent0.getAction() == null) {
            return;
        }
        Logger.e().a("WM-BatteryNotLowTracker", "Received " + intent0.getAction());
        String s = intent0.getAction();
        if(s != null) {
            switch(s) {
                case "android.intent.action.BATTERY_LOW": {
                    this.h(Boolean.FALSE);
                    return;
                }
                case "android.intent.action.BATTERY_OKAY": {
                    this.h(Boolean.TRUE);
                    break;
                }
            }
        }
    }

    @l
    public Boolean m() {
        boolean z = true;
        Intent intent0 = this.d().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if(intent0 == null) {
            Logger.e().c("WM-BatteryNotLowTracker", "getInitialState - null intent received");
            return false;
        }
        if(intent0.getIntExtra("status", -1) != 1 && ((float)intent0.getIntExtra("level", -1)) / ((float)intent0.getIntExtra("scale", -1)) <= 0.15f) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

