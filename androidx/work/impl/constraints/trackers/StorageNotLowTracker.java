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
public final class StorageNotLowTracker extends BroadcastReceiverConstraintTracker {
    public StorageNotLowTracker(@l Context context0, @l TaskExecutor taskExecutor0) {
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
        intentFilter0.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter0.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter0;
    }

    @Override  // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public void l(@l Intent intent0) {
        L.p(intent0, "intent");
        if(intent0.getAction() == null) {
            return;
        }
        Logger.e().a("WM-StorageNotLowTracker", "Received " + intent0.getAction());
        String s = intent0.getAction();
        if(s != null) {
            switch(s) {
                case "android.intent.action.DEVICE_STORAGE_LOW": {
                    this.h(Boolean.FALSE);
                    break;
                }
                case "android.intent.action.DEVICE_STORAGE_OK": {
                    this.h(Boolean.TRUE);
                }
            }
        }
    }

    @l
    public Boolean m() {
        Intent intent0 = this.d().registerReceiver(null, this.k());
        boolean z = true;
        if(intent0 != null && intent0.getAction() != null) {
            String s = intent0.getAction();
            if(s == null || s.hashCode() != -730838620 || !s.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}

