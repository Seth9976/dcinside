package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
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
public abstract class BroadcastReceiverConstraintTracker extends ConstraintTracker {
    @l
    private final BroadcastReceiver f;

    public BroadcastReceiverConstraintTracker(@l Context context0, @l TaskExecutor taskExecutor0) {
        L.p(context0, "context");
        L.p(taskExecutor0, "taskExecutor");
        super(context0, taskExecutor0);
        this.f = new BroadcastReceiver() {
            @Override  // android.content.BroadcastReceiver
            public void onReceive(Context context0, Intent intent0) {
                L.p(context0, "context");
                L.p(intent0, "intent");
                this.a.l(intent0);
            }
        };
    }

    @Override  // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void i() {
        Logger.e().a("WM-BrdcstRcvrCnstrntTrc", this.getClass().getSimpleName() + ": registering receiver");
        IntentFilter intentFilter0 = this.k();
        this.d().registerReceiver(this.f, intentFilter0);
    }

    @Override  // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void j() {
        Logger.e().a("WM-BrdcstRcvrCnstrntTrc", this.getClass().getSimpleName() + ": unregistering receiver");
        this.d().unregisterReceiver(this.f);
    }

    @l
    public abstract IntentFilter k();

    public abstract void l(@l Intent arg1);
}

