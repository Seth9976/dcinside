package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.Logger;
import androidx.work.RunnableScheduler;
import androidx.work.impl.model.WorkGenerationalId;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({Scope.b})
public class WorkTimer {
    @RestrictTo({Scope.b})
    public interface TimeLimitExceededListener {
        void a(@NonNull WorkGenerationalId arg1);
    }

    @RestrictTo({Scope.b})
    public static class WorkTimerRunnable implements Runnable {
        private final WorkTimer a;
        private final WorkGenerationalId b;
        static final String c = "WrkTimerRunnable";

        WorkTimerRunnable(@NonNull WorkTimer workTimer0, @NonNull WorkGenerationalId workGenerationalId0) {
            this.a = workTimer0;
            this.b = workGenerationalId0;
        }

        @Override
        public void run() {
            synchronized(this.a.d) {
                if(((WorkTimerRunnable)this.a.b.remove(this.b)) == null) {
                    Logger.e().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.b));
                }
                else {
                    TimeLimitExceededListener workTimer$TimeLimitExceededListener0 = (TimeLimitExceededListener)this.a.c.remove(this.b);
                    if(workTimer$TimeLimitExceededListener0 != null) {
                        workTimer$TimeLimitExceededListener0.a(this.b);
                    }
                }
            }
        }
    }

    final RunnableScheduler a;
    final Map b;
    final Map c;
    final Object d;
    private static final String e;

    static {
        WorkTimer.e = "WM-WorkTimer";
    }

    public WorkTimer(@NonNull RunnableScheduler runnableScheduler0) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new Object();
        this.a = runnableScheduler0;
    }

    @NonNull
    @VisibleForTesting
    public Map a() {
        synchronized(this.d) {
        }
        return this.c;
    }

    @NonNull
    @VisibleForTesting
    public Map b() {
        synchronized(this.d) {
        }
        return this.b;
    }

    public void c(@NonNull WorkGenerationalId workGenerationalId0, long v, @NonNull TimeLimitExceededListener workTimer$TimeLimitExceededListener0) {
        synchronized(this.d) {
            Logger.e().a("WM-WorkTimer", "Starting timer for " + workGenerationalId0);
            this.d(workGenerationalId0);
            WorkTimerRunnable workTimer$WorkTimerRunnable0 = new WorkTimerRunnable(this, workGenerationalId0);
            this.b.put(workGenerationalId0, workTimer$WorkTimerRunnable0);
            this.c.put(workGenerationalId0, workTimer$TimeLimitExceededListener0);
            this.a.b(v, workTimer$WorkTimerRunnable0);
        }
    }

    public void d(@NonNull WorkGenerationalId workGenerationalId0) {
        synchronized(this.d) {
            if(((WorkTimerRunnable)this.b.remove(workGenerationalId0)) != null) {
                Logger.e().a("WM-WorkTimer", "Stopping timer for " + workGenerationalId0);
                this.c.remove(workGenerationalId0);
            }
        }
    }
}

