package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleService;
import androidx.work.Logger;
import androidx.work.impl.utils.WakeLocks;

@RestrictTo({Scope.b})
public class SystemAlarmService extends LifecycleService implements CommandsCompletedListener {
    private SystemAlarmDispatcher b;
    private boolean c;
    private static final String d;

    static {
        SystemAlarmService.d = "WM-SystemAlarmService";
    }

    @Override  // androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$CommandsCompletedListener
    @MainThread
    public void b() {
        this.c = true;
        Logger.e().a("WM-SystemAlarmService", "All commands completed in dispatcher");
        WakeLocks.a();
        this.stopSelf();
    }

    @MainThread
    private void e() {
        SystemAlarmDispatcher systemAlarmDispatcher0 = new SystemAlarmDispatcher(this);
        this.b = systemAlarmDispatcher0;
        systemAlarmDispatcher0.m(this);
    }

    @Override  // androidx.lifecycle.LifecycleService
    public void onCreate() {
        super.onCreate();
        this.e();
        this.c = false;
    }

    @Override  // androidx.lifecycle.LifecycleService
    public void onDestroy() {
        super.onDestroy();
        this.c = true;
        this.b.k();
    }

    @Override  // androidx.lifecycle.LifecycleService
    public int onStartCommand(Intent intent0, int v, int v1) {
        super.onStartCommand(intent0, v, v1);
        if(this.c) {
            Logger.e().f("WM-SystemAlarmService", "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.b.k();
            this.e();
            this.c = false;
        }
        if(intent0 != null) {
            this.b.a(intent0, v1);
        }
        return 3;
    }
}

