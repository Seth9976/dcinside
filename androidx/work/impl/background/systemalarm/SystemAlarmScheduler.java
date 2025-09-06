package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.Scheduler;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;

@RestrictTo({Scope.b})
public class SystemAlarmScheduler implements Scheduler {
    private final Context a;
    private static final String b;

    static {
        SystemAlarmScheduler.b = "WM-SystemAlarmScheduler";
    }

    public SystemAlarmScheduler(@NonNull Context context0) {
        this.a = context0.getApplicationContext();
    }

    @Override  // androidx.work.impl.Scheduler
    public boolean a() {
        return true;
    }

    @Override  // androidx.work.impl.Scheduler
    public void b(@NonNull String s) {
        Intent intent0 = CommandHandler.h(this.a, s);
        this.a.startService(intent0);
    }

    @Override  // androidx.work.impl.Scheduler
    public void c(@NonNull WorkSpec[] arr_workSpec) {
        for(int v = 0; v < arr_workSpec.length; ++v) {
            this.d(arr_workSpec[v]);
        }
    }

    private void d(@NonNull WorkSpec workSpec0) {
        Logger.e().a("WM-SystemAlarmScheduler", "Scheduling work with workSpecId " + workSpec0.a);
        WorkGenerationalId workGenerationalId0 = WorkSpecKt.a(workSpec0);
        Intent intent0 = CommandHandler.f(this.a, workGenerationalId0);
        this.a.startService(intent0);
    }
}

