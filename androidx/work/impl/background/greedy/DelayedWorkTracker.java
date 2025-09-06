package androidx.work.impl.background.greedy;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.Clock;
import androidx.work.Logger;
import androidx.work.RunnableScheduler;
import androidx.work.impl.Scheduler;
import androidx.work.impl.model.WorkSpec;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({Scope.b})
public class DelayedWorkTracker {
    final Scheduler a;
    private final RunnableScheduler b;
    private final Clock c;
    private final Map d;
    static final String e;

    static {
        DelayedWorkTracker.e = "WM-DelayedWorkTracker";
    }

    public DelayedWorkTracker(@NonNull Scheduler scheduler0, @NonNull RunnableScheduler runnableScheduler0, @NonNull Clock clock0) {
        this.a = scheduler0;
        this.b = runnableScheduler0;
        this.c = clock0;
        this.d = new HashMap();
    }

    public void a(@NonNull WorkSpec workSpec0, long v) {
        Runnable runnable0 = (Runnable)this.d.remove(workSpec0.a);
        if(runnable0 != null) {
            this.b.a(runnable0);
        }
        androidx.work.impl.background.greedy.DelayedWorkTracker.1 delayedWorkTracker$10 = new Runnable() {
            final DelayedWorkTracker b;

            @Override
            public void run() {
                Logger.e().a("WM-DelayedWorkTracker", "Scheduling work " + workSpec0.a);
                DelayedWorkTracker.this.a.c(new WorkSpec[]{workSpec0});
            }
        };
        this.d.put(workSpec0.a, delayedWorkTracker$10);
        long v1 = this.c.currentTimeMillis();
        this.b.b(v - v1, delayedWorkTracker$10);
    }

    public void b(@NonNull String s) {
        Runnable runnable0 = (Runnable)this.d.remove(s);
        if(runnable0 != null) {
            this.b.a(runnable0);
        }
    }
}

