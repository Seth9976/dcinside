package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager.WakeLock;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkLauncher;
import androidx.work.impl.WorkLauncherImpl;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.f;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.WorkTimer;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.ArrayList;
import java.util.List;

@RestrictTo({Scope.b})
public class SystemAlarmDispatcher implements ExecutionListener {
    static class AddRunnable implements Runnable {
        private final SystemAlarmDispatcher a;
        private final Intent b;
        private final int c;

        AddRunnable(@NonNull SystemAlarmDispatcher systemAlarmDispatcher0, @NonNull Intent intent0, int v) {
            this.a = systemAlarmDispatcher0;
            this.b = intent0;
            this.c = v;
        }

        @Override
        public void run() {
            this.a.a(this.b, this.c);
        }
    }

    interface CommandsCompletedListener {
        void b();
    }

    static class DequeueAndCheckForCompletion implements Runnable {
        private final SystemAlarmDispatcher a;

        DequeueAndCheckForCompletion(@NonNull SystemAlarmDispatcher systemAlarmDispatcher0) {
            this.a = systemAlarmDispatcher0;
        }

        @Override
        public void run() {
            this.a.c();
        }
    }

    final Context a;
    final TaskExecutor b;
    private final WorkTimer c;
    private final Processor d;
    private final WorkManagerImpl e;
    final CommandHandler f;
    final List g;
    Intent h;
    @Nullable
    private CommandsCompletedListener i;
    private StartStopTokens j;
    private final WorkLauncher k;
    static final String l = null;
    private static final String m = "ProcessCommand";
    private static final String n = "KEY_START_ID";
    private static final int o;

    static {
        SystemAlarmDispatcher.l = "WM-SystemAlarmDispatche";
    }

    SystemAlarmDispatcher(@NonNull Context context0) {
        this(context0, null, null, null);
    }

    @VisibleForTesting
    SystemAlarmDispatcher(@NonNull Context context0, @Nullable Processor processor0, @Nullable WorkManagerImpl workManagerImpl0, @Nullable WorkLauncher workLauncher0) {
        Context context1 = context0.getApplicationContext();
        this.a = context1;
        this.j = f.c();
        if(workManagerImpl0 == null) {
            workManagerImpl0 = WorkManagerImpl.O(context0);
        }
        this.e = workManagerImpl0;
        this.f = new CommandHandler(context1, workManagerImpl0.o().a(), this.j);
        this.c = new WorkTimer(workManagerImpl0.o().k());
        if(processor0 == null) {
            processor0 = workManagerImpl0.Q();
        }
        this.d = processor0;
        TaskExecutor taskExecutor0 = workManagerImpl0.X();
        this.b = taskExecutor0;
        if(workLauncher0 == null) {
            workLauncher0 = new WorkLauncherImpl(processor0, taskExecutor0);
        }
        this.k = workLauncher0;
        processor0.e(this);
        this.g = new ArrayList();
        this.h = null;
    }

    // 检测为 Lambda 实现
    @MainThread
    public boolean a(@NonNull Intent intent0, int v) [...]

    private void b() {
        if(Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @MainThread
    void c() {
        Logger.e().a("WM-SystemAlarmDispatche", "Checking if commands are complete.");
        this.b();
        synchronized(this.g) {
            if(this.h != null) {
                Logger.e().a("WM-SystemAlarmDispatche", "Removing command " + this.h);
                if(!((Intent)this.g.remove(0)).equals(this.h)) {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
                this.h = null;
            }
            SerialExecutor serialExecutor0 = this.b.d();
            if(!this.f.p() && this.g.isEmpty() && !serialExecutor0.l1()) {
                Logger.e().a("WM-SystemAlarmDispatche", "No more commands & intents.");
                CommandsCompletedListener systemAlarmDispatcher$CommandsCompletedListener0 = this.i;
                if(systemAlarmDispatcher$CommandsCompletedListener0 != null) {
                    systemAlarmDispatcher$CommandsCompletedListener0.b();
                }
            }
            else if(!this.g.isEmpty()) {
                this.l();
            }
        }
    }

    @Override  // androidx.work.impl.ExecutionListener
    public void d(@NonNull WorkGenerationalId workGenerationalId0, boolean z) {
        this.b.c().execute(() -> {
            Logger.e().a("WM-SystemAlarmDispatche", "Adding command " + CommandHandler.c(this.a, workGenerationalId0, z) + " (" + 0 + ")");
            this.b();
            String s = CommandHandler.c(this.a, workGenerationalId0, z).getAction();
            if(TextUtils.isEmpty(s)) {
                Logger.e().l("WM-SystemAlarmDispatche", "Unknown command. Ignoring");
                return false;
            }
            if("ACTION_CONSTRAINTS_CHANGED".equals(s) && this.j("ACTION_CONSTRAINTS_CHANGED")) {
                return false;
            }
            CommandHandler.c(this.a, workGenerationalId0, z).putExtra("KEY_START_ID", 0);
            synchronized(this.g) {
                this.g.add(CommandHandler.c(this.a, workGenerationalId0, z));
                if(this.g.isEmpty()) {
                    this.l();
                }
                return true;
            }
        });
    }

    Processor e() {
        return this.d;
    }

    TaskExecutor f() {
        return this.b;
    }

    WorkManagerImpl g() {
        return this.e;
    }

    WorkTimer h() {
        return this.c;
    }

    WorkLauncher i() {
        return this.k;
    }

    @MainThread
    private boolean j(@NonNull String s) {
        this.b();
        synchronized(this.g) {
            for(Object object0: this.g) {
                if(s.equals(((Intent)object0).getAction())) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
            return false;
        }
    }

    void k() {
        Logger.e().a("WM-SystemAlarmDispatche", "Destroying SystemAlarmDispatcher");
        this.d.q(this);
        this.i = null;
    }

    @MainThread
    private void l() {
        this.b();
        PowerManager.WakeLock powerManager$WakeLock0 = WakeLocks.b(this.a, "ProcessCommand");
        try {
            powerManager$WakeLock0.acquire();
            androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.1 systemAlarmDispatcher$10 = new Runnable() {
                final SystemAlarmDispatcher a;

                @Override
                public void run() {
                    synchronized(SystemAlarmDispatcher.this.g) {
                        SystemAlarmDispatcher.this.h = (Intent)SystemAlarmDispatcher.this.g.get(0);
                    }
                    Intent intent0 = SystemAlarmDispatcher.this.h;
                    if(intent0 != null) {
                        String s = intent0.getAction();
                        int v1 = SystemAlarmDispatcher.this.h.getIntExtra("KEY_START_ID", 0);
                        Logger.e().a("WM-SystemAlarmDispatche", "Processing command " + SystemAlarmDispatcher.this.h + ", " + v1);
                        PowerManager.WakeLock powerManager$WakeLock0 = WakeLocks.b(SystemAlarmDispatcher.this.a, s + " (" + v1 + ")");
                        try {
                            Logger.e().a("WM-SystemAlarmDispatche", "Acquiring operation wake lock (" + s + ") " + powerManager$WakeLock0);
                            powerManager$WakeLock0.acquire();
                            SystemAlarmDispatcher.this.f.q(SystemAlarmDispatcher.this.h, v1, SystemAlarmDispatcher.this);
                        }
                        catch(Throwable throwable0) {
                            Logger.e().d("WM-SystemAlarmDispatche", "Unexpected error in onHandleIntent", throwable0);
                        }
                        finally {
                            Logger.e().a("WM-SystemAlarmDispatche", "Releasing operation wake lock (" + s + ") " + powerManager$WakeLock0);
                            powerManager$WakeLock0.release();
                            SystemAlarmDispatcher.this.b.c().execute(new DequeueAndCheckForCompletion(SystemAlarmDispatcher.this));
                        }
                    }
                }
            };
            this.e.X().b(systemAlarmDispatcher$10);
        }
        finally {
            powerManager$WakeLock0.release();
        }
    }

    void m(@NonNull CommandsCompletedListener systemAlarmDispatcher$CommandsCompletedListener0) {
        if(this.i != null) {
            Logger.e().c("WM-SystemAlarmDispatche", "A completion listener for SystemAlarmDispatcher already exists.");
            return;
        }
        this.i = systemAlarmDispatcher$CommandsCompletedListener0;
    }
}

