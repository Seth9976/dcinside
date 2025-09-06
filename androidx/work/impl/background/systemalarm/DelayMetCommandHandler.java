package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager.WakeLock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.work.Logger;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.constraints.ConstraintsState.ConstraintsMet;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener;
import java.util.concurrent.Executor;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.K;

@RestrictTo({Scope.b})
public class DelayMetCommandHandler implements OnConstraintsStateChangedListener, TimeLimitExceededListener {
    private final Context a;
    private final int b;
    private final WorkGenerationalId c;
    private final SystemAlarmDispatcher d;
    private final WorkConstraintsTracker e;
    private final Object f;
    private int g;
    private final Executor h;
    private final Executor i;
    @Nullable
    private PowerManager.WakeLock j;
    private boolean k;
    private final StartStopToken l;
    private final K m;
    private volatile I0 n;
    private static final String o = null;
    private static final int p = 0;
    private static final int q = 1;
    private static final int r = 2;

    static {
        DelayMetCommandHandler.o = "WM-DelayMetCommandHandl";
    }

    DelayMetCommandHandler(@NonNull Context context0, int v, @NonNull SystemAlarmDispatcher systemAlarmDispatcher0, @NonNull StartStopToken startStopToken0) {
        this.a = context0;
        this.b = v;
        this.d = systemAlarmDispatcher0;
        this.c = startStopToken0.a();
        this.l = startStopToken0;
        Trackers trackers0 = systemAlarmDispatcher0.g().T();
        this.h = systemAlarmDispatcher0.f().d();
        this.i = systemAlarmDispatcher0.f().c();
        this.m = systemAlarmDispatcher0.f().a();
        this.e = new WorkConstraintsTracker(trackers0);
        this.k = false;
        this.g = 0;
        this.f = new Object();
    }

    @Override  // androidx.work.impl.utils.WorkTimer$TimeLimitExceededListener
    public void a(@NonNull WorkGenerationalId workGenerationalId0) {
        Logger.e().a("WM-DelayMetCommandHandl", "Exceeded time limits on execution for " + workGenerationalId0);
        a a0 = () -> {
            String s = this.c.f();
            if(this.g < 2) {
                this.g = 2;
                Logger.e().a("WM-DelayMetCommandHandl", "Stopping work for WorkSpec " + s);
                Intent intent0 = CommandHandler.g(this.a, this.c);
                AddRunnable systemAlarmDispatcher$AddRunnable0 = new AddRunnable(this.d, intent0, this.b);
                this.i.execute(systemAlarmDispatcher$AddRunnable0);
                if(this.d.e().l(this.c.f())) {
                    Logger.e().a("WM-DelayMetCommandHandl", "WorkSpec " + s + " needs to be rescheduled");
                    Intent intent1 = CommandHandler.f(this.a, this.c);
                    AddRunnable systemAlarmDispatcher$AddRunnable1 = new AddRunnable(this.d, intent1, this.b);
                    this.i.execute(systemAlarmDispatcher$AddRunnable1);
                    return;
                }
                Logger.e().a("WM-DelayMetCommandHandl", "Processor does not have WorkSpec " + s + ". No need to reschedule");
                return;
            }
            Logger.e().a("WM-DelayMetCommandHandl", "Already stopped work for " + s);
        };
        this.h.execute(a0);
    }

    private void d() {
        synchronized(this.f) {
            if(this.n != null) {
                this.n.e(null);
            }
            this.d.h().d(this.c);
            if(this.j != null && this.j.isHeld()) {
                Logger.e().a("WM-DelayMetCommandHandl", "Releasing wakelock " + this.j + "for WorkSpec " + this.c);
                this.j.release();
            }
        }
    }

    @Override  // androidx.work.impl.constraints.OnConstraintsStateChangedListener
    public void e(@NonNull WorkSpec workSpec0, @NonNull ConstraintsState constraintsState0) {
        if(constraintsState0 instanceof ConstraintsMet) {
            b b0 = () -> {
                if(this.g == 0) {
                    this.g = 1;
                    Logger.e().a("WM-DelayMetCommandHandl", "onAllConstraintsMet for " + this.c);
                    if(this.d.e().s(this.l)) {
                        this.d.h().c(this.c, 600000L, this);
                        return;
                    }
                    this.d();
                    return;
                }
                Logger.e().a("WM-DelayMetCommandHandl", "Already started work for " + this.c);
            };
            this.h.execute(b0);
            return;
        }
        a a0 = () -> {
            String s = this.c.f();
            if(this.g < 2) {
                this.g = 2;
                Logger.e().a("WM-DelayMetCommandHandl", "Stopping work for WorkSpec " + s);
                Intent intent0 = CommandHandler.g(this.a, this.c);
                AddRunnable systemAlarmDispatcher$AddRunnable0 = new AddRunnable(this.d, intent0, this.b);
                this.i.execute(systemAlarmDispatcher$AddRunnable0);
                if(this.d.e().l(this.c.f())) {
                    Logger.e().a("WM-DelayMetCommandHandl", "WorkSpec " + s + " needs to be rescheduled");
                    Intent intent1 = CommandHandler.f(this.a, this.c);
                    AddRunnable systemAlarmDispatcher$AddRunnable1 = new AddRunnable(this.d, intent1, this.b);
                    this.i.execute(systemAlarmDispatcher$AddRunnable1);
                    return;
                }
                Logger.e().a("WM-DelayMetCommandHandl", "Processor does not have WorkSpec " + s + ". No need to reschedule");
                return;
            }
            Logger.e().a("WM-DelayMetCommandHandl", "Already stopped work for " + s);
        };
        this.h.execute(a0);
    }

    @WorkerThread
    void f() {
        String s = this.c.f();
        this.j = WakeLocks.b(this.a, s + " (" + this.b + ")");
        Logger.e().a("WM-DelayMetCommandHandl", "Acquiring wakelock " + this.j + "for WorkSpec " + s);
        this.j.acquire();
        WorkSpec workSpec0 = this.d.g().U().Z().G(s);
        if(workSpec0 == null) {
            a a0 = () -> {
                String s = this.c.f();
                if(this.g < 2) {
                    this.g = 2;
                    Logger.e().a("WM-DelayMetCommandHandl", "Stopping work for WorkSpec " + s);
                    Intent intent0 = CommandHandler.g(this.a, this.c);
                    AddRunnable systemAlarmDispatcher$AddRunnable0 = new AddRunnable(this.d, intent0, this.b);
                    this.i.execute(systemAlarmDispatcher$AddRunnable0);
                    if(this.d.e().l(this.c.f())) {
                        Logger.e().a("WM-DelayMetCommandHandl", "WorkSpec " + s + " needs to be rescheduled");
                        Intent intent1 = CommandHandler.f(this.a, this.c);
                        AddRunnable systemAlarmDispatcher$AddRunnable1 = new AddRunnable(this.d, intent1, this.b);
                        this.i.execute(systemAlarmDispatcher$AddRunnable1);
                        return;
                    }
                    Logger.e().a("WM-DelayMetCommandHandl", "Processor does not have WorkSpec " + s + ". No need to reschedule");
                    return;
                }
                Logger.e().a("WM-DelayMetCommandHandl", "Already stopped work for " + s);
            };
            this.h.execute(a0);
            return;
        }
        boolean z = workSpec0.J();
        this.k = z;
        if(!z) {
            Logger.e().a("WM-DelayMetCommandHandl", "No constraints for " + s);
            b b0 = () -> {
                if(this.g == 0) {
                    this.g = 1;
                    Logger.e().a("WM-DelayMetCommandHandl", "onAllConstraintsMet for " + this.c);
                    if(this.d.e().s(this.l)) {
                        this.d.h().c(this.c, 600000L, this);
                        return;
                    }
                    this.d();
                    return;
                }
                Logger.e().a("WM-DelayMetCommandHandl", "Already started work for " + this.c);
            };
            this.h.execute(b0);
            return;
        }
        this.n = WorkConstraintsTrackerKt.d(this.e, workSpec0, this.m, this);
    }

    void g(boolean z) {
        Logger.e().a("WM-DelayMetCommandHandl", "onExecuted " + this.c + ", " + z);
        this.d();
        if(z) {
            Intent intent0 = CommandHandler.f(this.a, this.c);
            AddRunnable systemAlarmDispatcher$AddRunnable0 = new AddRunnable(this.d, intent0, this.b);
            this.i.execute(systemAlarmDispatcher$AddRunnable0);
        }
        if(this.k) {
            Intent intent1 = CommandHandler.a(this.a);
            AddRunnable systemAlarmDispatcher$AddRunnable1 = new AddRunnable(this.d, intent1, this.b);
            this.i.execute(systemAlarmDispatcher$AddRunnable1);
        }
    }

    // 检测为 Lambda 实现
    private void h() [...]

    // 检测为 Lambda 实现
    private void i() [...]
}

