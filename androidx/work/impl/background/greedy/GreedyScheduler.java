package androidx.work.impl.background.greedy;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.Configuration;
import androidx.work.Constraints;
import androidx.work.Logger;
import androidx.work.RunnableScheduler;
import androidx.work.WorkInfo.State;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.Scheduler;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkLauncher;
import androidx.work.impl.constraints.ConstraintsState.ConstraintsMet;
import androidx.work.impl.constraints.ConstraintsState.ConstraintsNotMet;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.f;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.ProcessUtils;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.K;

@RestrictTo({Scope.b})
public class GreedyScheduler implements ExecutionListener, Scheduler, OnConstraintsStateChangedListener {
    static class AttemptData {
        final int a;
        final long b;

        private AttemptData(int v, long v1) {
            this.a = v;
            this.b = v1;
        }

        AttemptData(int v, long v1, androidx.work.impl.background.greedy.GreedyScheduler.1 greedyScheduler$10) {
            this(v, v1);
        }
    }

    private final Context a;
    private final Map b;
    private DelayedWorkTracker c;
    private boolean d;
    private final Object e;
    private final StartStopTokens f;
    private final Processor g;
    private final WorkLauncher h;
    private final Configuration i;
    private final Map j;
    Boolean k;
    private final WorkConstraintsTracker l;
    private final TaskExecutor m;
    private final TimeLimiter n;
    private static final String o = null;
    private static final int p = 5;

    static {
        GreedyScheduler.o = "WM-GreedyScheduler";
    }

    public GreedyScheduler(@NonNull Context context0, @NonNull Configuration configuration0, @NonNull Trackers trackers0, @NonNull Processor processor0, @NonNull WorkLauncher workLauncher0, @NonNull TaskExecutor taskExecutor0) {
        this.b = new HashMap();
        this.e = new Object();
        this.f = f.c();
        this.j = new HashMap();
        this.a = context0;
        RunnableScheduler runnableScheduler0 = configuration0.k();
        this.c = new DelayedWorkTracker(this, runnableScheduler0, configuration0.a());
        this.n = new TimeLimiter(runnableScheduler0, workLauncher0);
        this.m = taskExecutor0;
        this.l = new WorkConstraintsTracker(trackers0);
        this.i = configuration0;
        this.g = processor0;
        this.h = workLauncher0;
    }

    @Override  // androidx.work.impl.Scheduler
    public boolean a() {
        return false;
    }

    @Override  // androidx.work.impl.Scheduler
    public void b(@NonNull String s) {
        if(this.k == null) {
            this.f();
        }
        if(!this.k.booleanValue()) {
            Logger.e().f("WM-GreedyScheduler", "Ignoring schedule request in non-main process");
            return;
        }
        this.g();
        Logger.e().a("WM-GreedyScheduler", "Cancelling work ID " + s);
        DelayedWorkTracker delayedWorkTracker0 = this.c;
        if(delayedWorkTracker0 != null) {
            delayedWorkTracker0.b(s);
        }
        for(Object object0: this.f.remove(s)) {
            this.n.b(((StartStopToken)object0));
            this.h.e(((StartStopToken)object0));
        }
    }

    @Override  // androidx.work.impl.Scheduler
    public void c(@NonNull WorkSpec[] arr_workSpec) {
        if(this.k == null) {
            this.f();
        }
        if(!this.k.booleanValue()) {
            Logger.e().f("WM-GreedyScheduler", "Ignoring schedule request in a secondary process");
            return;
        }
        this.g();
        HashSet hashSet0 = new HashSet();
        HashSet hashSet1 = new HashSet();
        for(int v = 0; v < arr_workSpec.length; ++v) {
            WorkSpec workSpec0 = arr_workSpec[v];
            WorkGenerationalId workGenerationalId0 = WorkSpecKt.a(workSpec0);
            if(!this.f.b(workGenerationalId0)) {
                long v1 = this.j(workSpec0);
                long v2 = Math.max(workSpec0.c(), v1);
                long v3 = this.i.a().currentTimeMillis();
                if(workSpec0.b == State.a) {
                    if(v3 < v2) {
                        DelayedWorkTracker delayedWorkTracker0 = this.c;
                        if(delayedWorkTracker0 != null) {
                            delayedWorkTracker0.a(workSpec0, v2);
                        }
                    }
                    else if(workSpec0.J()) {
                        Constraints constraints0 = workSpec0.j;
                        int v4 = Build.VERSION.SDK_INT;
                        if(v4 >= 23 && constraints0.j()) {
                            Logger.e().a("WM-GreedyScheduler", "Ignoring " + workSpec0 + ". Requires device idle.");
                        }
                        else if(v4 < 24 || !constraints0.g()) {
                            hashSet0.add(workSpec0);
                            hashSet1.add(workSpec0.a);
                        }
                        else {
                            Logger.e().a("WM-GreedyScheduler", "Ignoring " + workSpec0 + ". Requires ContentUri triggers.");
                        }
                    }
                    else {
                        WorkGenerationalId workGenerationalId1 = WorkSpecKt.a(workSpec0);
                        if(!this.f.b(workGenerationalId1)) {
                            Logger.e().a("WM-GreedyScheduler", "Starting work for " + workSpec0.a);
                            StartStopToken startStopToken0 = this.f.d(workSpec0);
                            this.n.c(startStopToken0);
                            this.h.b(startStopToken0);
                        }
                    }
                }
            }
        }
        synchronized(this.e) {
            if(!hashSet0.isEmpty()) {
                String s = TextUtils.join(",", hashSet1);
                Logger.e().a("WM-GreedyScheduler", "Starting tracking for " + s);
                for(Object object1: hashSet0) {
                    WorkSpec workSpec1 = (WorkSpec)object1;
                    WorkGenerationalId workGenerationalId2 = WorkSpecKt.a(workSpec1);
                    if(!this.b.containsKey(workGenerationalId2)) {
                        K k0 = this.m.a();
                        I0 i00 = WorkConstraintsTrackerKt.d(this.l, workSpec1, k0, this);
                        this.b.put(workGenerationalId2, i00);
                    }
                }
            }
        }
    }

    @Override  // androidx.work.impl.ExecutionListener
    public void d(@NonNull WorkGenerationalId workGenerationalId0, boolean z) {
        StartStopToken startStopToken0 = this.f.c(workGenerationalId0);
        if(startStopToken0 != null) {
            this.n.b(startStopToken0);
        }
        this.h(workGenerationalId0);
        if(!z) {
            synchronized(this.e) {
                this.j.remove(workGenerationalId0);
            }
        }
    }

    @Override  // androidx.work.impl.constraints.OnConstraintsStateChangedListener
    public void e(@NonNull WorkSpec workSpec0, @NonNull ConstraintsState constraintsState0) {
        WorkGenerationalId workGenerationalId0 = WorkSpecKt.a(workSpec0);
        if(!(constraintsState0 instanceof ConstraintsMet)) {
            Logger.e().a("WM-GreedyScheduler", "Constraints not met: Cancelling work ID " + workGenerationalId0);
            StartStopToken startStopToken1 = this.f.c(workGenerationalId0);
            if(startStopToken1 != null) {
                this.n.b(startStopToken1);
                int v = ((ConstraintsNotMet)constraintsState0).d();
                this.h.a(startStopToken1, v);
            }
        }
        else if(!this.f.b(workGenerationalId0)) {
            Logger.e().a("WM-GreedyScheduler", "Constraints met: Scheduling work ID " + workGenerationalId0);
            StartStopToken startStopToken0 = this.f.e(workGenerationalId0);
            this.n.c(startStopToken0);
            this.h.b(startStopToken0);
        }
    }

    private void f() {
        this.k = Boolean.valueOf(ProcessUtils.b(this.a, this.i));
    }

    private void g() {
        if(!this.d) {
            this.g.e(this);
            this.d = true;
        }
    }

    private void h(@NonNull WorkGenerationalId workGenerationalId0) {
        I0 i00;
        synchronized(this.e) {
            i00 = (I0)this.b.remove(workGenerationalId0);
        }
        if(i00 != null) {
            Logger.e().a("WM-GreedyScheduler", "Stopping tracking for " + workGenerationalId0);
            i00.e(null);
        }
    }

    @VisibleForTesting
    public void i(@NonNull DelayedWorkTracker delayedWorkTracker0) {
        this.c = delayedWorkTracker0;
    }

    private long j(WorkSpec workSpec0) {
        AttemptData greedyScheduler$AttemptData0;
        synchronized(this.e) {
            WorkGenerationalId workGenerationalId0 = WorkSpecKt.a(workSpec0);
            greedyScheduler$AttemptData0 = (AttemptData)this.j.get(workGenerationalId0);
            if(greedyScheduler$AttemptData0 == null) {
                greedyScheduler$AttemptData0 = new AttemptData(workSpec0.k, this.i.a().currentTimeMillis(), null);
                this.j.put(workGenerationalId0, greedyScheduler$AttemptData0);
            }
        }
        return greedyScheduler$AttemptData0.b + ((long)Math.max(workSpec0.k - greedyScheduler$AttemptData0.a - 5, 0)) * 30000L;
    }

    class androidx.work.impl.background.greedy.GreedyScheduler.1 {
    }

}

