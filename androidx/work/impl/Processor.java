package androidx.work.impl;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager.WakeLock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.work.Configuration;
import androidx.work.ForegroundInfo;
import androidx.work.Logger;
import androidx.work.WorkerParameters.RuntimeExtras;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.t0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

@RestrictTo({Scope.b})
public class Processor implements ForegroundProcessor {
    @Nullable
    private PowerManager.WakeLock a;
    private Context b;
    private Configuration c;
    private TaskExecutor d;
    private WorkDatabase e;
    private Map f;
    private Map g;
    private Map h;
    private Set i;
    private final List j;
    private final Object k;
    private static final String l = null;
    private static final String m = "ProcessorForegroundLck";

    static {
        Processor.l = "WM-Processor";
    }

    public Processor(@NonNull Context context0, @NonNull Configuration configuration0, @NonNull TaskExecutor taskExecutor0, @NonNull WorkDatabase workDatabase0) {
        this.b = context0;
        this.c = configuration0;
        this.d = taskExecutor0;
        this.e = workDatabase0;
        this.g = new HashMap();
        this.f = new HashMap();
        this.i = new HashSet();
        this.j = new ArrayList();
        this.a = null;
        this.k = new Object();
        this.h = new HashMap();
    }

    @Override  // androidx.work.impl.foreground.ForegroundProcessor
    public void a(@NonNull String s, @NonNull ForegroundInfo foregroundInfo0) {
        synchronized(this.k) {
            Logger.e().f("WM-Processor", "Moving WorkSpec (" + s + ") to the foreground");
            WorkerWrapper workerWrapper0 = (WorkerWrapper)this.g.remove(s);
            if(workerWrapper0 != null) {
                if(this.a == null) {
                    PowerManager.WakeLock powerManager$WakeLock0 = WakeLocks.b(this.b, "ProcessorForegroundLck");
                    this.a = powerManager$WakeLock0;
                    powerManager$WakeLock0.acquire();
                }
                this.f.put(s, workerWrapper0);
                Intent intent0 = SystemForegroundDispatcher.g(this.b, workerWrapper0.l(), foregroundInfo0);
                ContextCompat.startForegroundService(this.b, intent0);
            }
        }
    }

    public void e(@NonNull ExecutionListener executionListener0) {
        synchronized(this.k) {
            this.j.add(executionListener0);
        }
    }

    @Nullable
    private WorkerWrapper f(@NonNull String s) {
        WorkerWrapper workerWrapper0 = (WorkerWrapper)this.f.remove(s);
        boolean z = workerWrapper0 != null;
        if(!z) {
            workerWrapper0 = (WorkerWrapper)this.g.remove(s);
        }
        this.h.remove(s);
        if(z) {
            this.v();
        }
        return workerWrapper0;
    }

    @Nullable
    public WorkSpec g(@NonNull String s) {
        synchronized(this.k) {
            WorkerWrapper workerWrapper0 = this.h(s);
            return workerWrapper0 != null ? workerWrapper0.m() : null;
        }
    }

    @Nullable
    private WorkerWrapper h(@NonNull String s) {
        WorkerWrapper workerWrapper0 = (WorkerWrapper)this.f.get(s);
        return workerWrapper0 == null ? ((WorkerWrapper)this.g.get(s)) : workerWrapper0;
    }

    public boolean i() {
        synchronized(this.k) {
            return !this.g.isEmpty() || !this.f.isEmpty();
        }
    }

    private static boolean j(@NonNull String s, @Nullable WorkerWrapper workerWrapper0, int v) {
        if(workerWrapper0 != null) {
            workerWrapper0.o(v);
            Logger.e().a("WM-Processor", "WorkerWrapper interrupted for " + s);
            return true;
        }
        Logger.e().a("WM-Processor", "WorkerWrapper could not be found for " + s);
        return false;
    }

    public boolean k(@NonNull String s) {
        synchronized(this.k) {
        }
        return this.i.contains(s);
    }

    public boolean l(@NonNull String s) {
        synchronized(this.k) {
            return this.h(s) != null;
        }
    }

    // 检测为 Lambda 实现
    private void m(WorkGenerationalId workGenerationalId0, boolean z) [...]

    // 检测为 Lambda 实现
    private WorkSpec n(ArrayList arrayList0, String s) throws Exception [...]

    // 检测为 Lambda 实现
    private void o(t0 t00, WorkerWrapper workerWrapper0) [...]

    private void p(@NonNull WorkerWrapper workerWrapper0, boolean z) {
        synchronized(this.k) {
            WorkGenerationalId workGenerationalId0 = workerWrapper0.l();
            String s = workGenerationalId0.f();
            if(this.h(s) == workerWrapper0) {
                this.f(s);
            }
            Logger.e().a("WM-Processor", this.getClass().getSimpleName() + " " + s + " executed; reschedule = " + z);
            for(Object object1: this.j) {
                ((ExecutionListener)object1).d(workGenerationalId0, z);
            }
        }
    }

    public void q(@NonNull ExecutionListener executionListener0) {
        synchronized(this.k) {
            this.j.remove(executionListener0);
        }
    }

    private void r(@NonNull WorkGenerationalId workGenerationalId0, boolean z) {
        this.d.c().execute(() -> synchronized(this.k) {
            for(Object object1: this.j) {
                ((ExecutionListener)object1).d(workGenerationalId0, z);
            }
        });
    }

    public boolean s(@NonNull StartStopToken startStopToken0) {
        return this.t(startStopToken0, null);
    }

    public boolean t(@NonNull StartStopToken startStopToken0, @Nullable RuntimeExtras workerParameters$RuntimeExtras0) {
        WorkGenerationalId workGenerationalId0 = startStopToken0.a();
        String s = workGenerationalId0.f();
        ArrayList arrayList0 = new ArrayList();
        WorkSpec workSpec0 = (WorkSpec)this.e.N(() -> {
            arrayList0.addAll(this.e.a0().c(s));
            return this.e.Z().G(s);
        });
        if(workSpec0 == null) {
            Logger.e().l("WM-Processor", "Didn\'t find WorkSpec for id " + workGenerationalId0);
            this.r(workGenerationalId0, false);
            return false;
        }
        synchronized(this.k) {
            if(this.l(s)) {
                Set set0 = (Set)this.h.get(s);
                Object object1 = set0.iterator().next();
                if(((StartStopToken)object1).a().e() == workGenerationalId0.e()) {
                    set0.add(startStopToken0);
                    Logger.e().a("WM-Processor", "Work " + workGenerationalId0 + " is already enqueued for processing");
                }
                else {
                    this.r(workGenerationalId0, false);
                }
                return false;
            }
            if(workSpec0.D() != workGenerationalId0.e()) {
                this.r(workGenerationalId0, false);
                return false;
            }
            WorkerWrapper workerWrapper0 = new Builder(this.b, this.c, this.d, this, this.e, workSpec0, arrayList0).m(workerParameters$RuntimeExtras0).a();
            t0 t00 = workerWrapper0.q();
            t00.addListener(() -> {
                boolean z;
                try {
                    z = ((Boolean)t00.get()).booleanValue();
                }
                catch(InterruptedException | ExecutionException unused_ex) {
                    z = true;
                }
                this.p(workerWrapper0, z);
            }, this.d.c());
            this.g.put(s, workerWrapper0);
            HashSet hashSet0 = new HashSet();
            hashSet0.add(startStopToken0);
            this.h.put(s, hashSet0);
        }
        Logger.e().a("WM-Processor", this.getClass().getSimpleName() + ": processing " + workGenerationalId0);
        return true;
    }

    public boolean u(@NonNull String s, int v) {
        WorkerWrapper workerWrapper0;
        synchronized(this.k) {
            Logger.e().a("WM-Processor", "Processor cancelling " + s);
            this.i.add(s);
            workerWrapper0 = this.f(s);
        }
        return Processor.j(s, workerWrapper0, v);
    }

    private void v() {
        synchronized(this.k) {
            if(this.f.isEmpty()) {
                Intent intent0 = SystemForegroundDispatcher.h(this.b);
                try {
                    this.b.startService(intent0);
                }
                catch(Throwable throwable0) {
                    Logger.e().d("WM-Processor", "Unable to stop foreground service", throwable0);
                }
                PowerManager.WakeLock powerManager$WakeLock0 = this.a;
                if(powerManager$WakeLock0 != null) {
                    powerManager$WakeLock0.release();
                    this.a = null;
                }
            }
        }
    }

    public boolean w(@NonNull StartStopToken startStopToken0, int v) {
        WorkerWrapper workerWrapper0;
        String s = startStopToken0.a().f();
        synchronized(this.k) {
            workerWrapper0 = this.f(s);
        }
        return Processor.j(s, workerWrapper0, v);
    }

    public boolean x(@NonNull StartStopToken startStopToken0, int v) {
        String s = startStopToken0.a().f();
        synchronized(this.k) {
            if(this.f.get(s) != null) {
                Logger.e().a("WM-Processor", "Ignored stopWork. WorkerWrapper " + s + " is in foreground");
                return false;
            }
            Set set0 = (Set)this.h.get(s);
            if(set0 != null && set0.contains(startStopToken0)) {
                WorkerWrapper workerWrapper0 = this.f(s);
                return Processor.j(s, workerWrapper0, v);
            }
            return false;
        }
    }
}

