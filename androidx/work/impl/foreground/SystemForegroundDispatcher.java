package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.ForegroundInfo;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.ConstraintsState.ConstraintsNotMet;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.UUID;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.K;

@RestrictTo({Scope.b})
public class SystemForegroundDispatcher implements ExecutionListener, OnConstraintsStateChangedListener {
    interface Callback {
        @MainThread
        void a(int arg1, @NonNull Notification arg2);

        @MainThread
        void c(int arg1, int arg2, @NonNull Notification arg3);

        @MainThread
        void d(int arg1);

        @MainThread
        void stop();
    }

    private Context a;
    private WorkManagerImpl b;
    private final TaskExecutor c;
    final Object d;
    WorkGenerationalId e;
    final Map f;
    final Map g;
    final Map h;
    final WorkConstraintsTracker i;
    @Nullable
    private Callback j;
    static final String k = null;
    private static final String l = "KEY_NOTIFICATION";
    private static final String m = "KEY_NOTIFICATION_ID";
    private static final String n = "KEY_FOREGROUND_SERVICE_TYPE";
    private static final String o = "KEY_WORKSPEC_ID";
    private static final String p = "KEY_GENERATION";
    private static final String q = "ACTION_START_FOREGROUND";
    private static final String r = "ACTION_NOTIFY";
    private static final String s = "ACTION_CANCEL_WORK";
    private static final String t = "ACTION_STOP_FOREGROUND";

    static {
        SystemForegroundDispatcher.k = "WM-SystemFgDispatcher";
    }

    SystemForegroundDispatcher(@NonNull Context context0) {
        this.a = context0;
        this.d = new Object();
        WorkManagerImpl workManagerImpl0 = WorkManagerImpl.O(context0);
        this.b = workManagerImpl0;
        this.c = workManagerImpl0.X();
        this.e = null;
        this.f = new LinkedHashMap();
        this.h = new HashMap();
        this.g = new HashMap();
        this.i = new WorkConstraintsTracker(this.b.T());
        this.b.Q().e(this);
    }

    @VisibleForTesting
    SystemForegroundDispatcher(@NonNull Context context0, @NonNull WorkManagerImpl workManagerImpl0, @NonNull WorkConstraintsTracker workConstraintsTracker0) {
        this.a = context0;
        this.d = new Object();
        this.b = workManagerImpl0;
        this.c = workManagerImpl0.X();
        this.e = null;
        this.f = new LinkedHashMap();
        this.h = new HashMap();
        this.g = new HashMap();
        this.i = workConstraintsTracker0;
        this.b.Q().e(this);
    }

    @NonNull
    public static Intent c(@NonNull Context context0, @NonNull String s) {
        Intent intent0 = new Intent(context0, SystemForegroundService.class);
        intent0.setAction("ACTION_CANCEL_WORK");
        intent0.setData(Uri.parse(("workspec://" + s)));
        intent0.putExtra("KEY_WORKSPEC_ID", s);
        return intent0;
    }

    @Override  // androidx.work.impl.ExecutionListener
    @MainThread
    public void d(@NonNull WorkGenerationalId workGenerationalId0, boolean z) {
        synchronized(this.d) {
            I0 i00 = ((WorkSpec)this.g.remove(workGenerationalId0)) == null ? null : ((I0)this.h.remove(workGenerationalId0));
            if(i00 != null) {
                i00.e(null);
            }
        }
        ForegroundInfo foregroundInfo0 = (ForegroundInfo)this.f.remove(workGenerationalId0);
        if(workGenerationalId0.equals(this.e)) {
            if(this.f.size() > 0) {
                Iterator iterator0 = this.f.entrySet().iterator();
                Object object1 = iterator0.next();
                Map.Entry map$Entry0;
                for(map$Entry0 = (Map.Entry)object1; iterator0.hasNext(); map$Entry0 = (Map.Entry)object2) {
                    Object object2 = iterator0.next();
                }
                this.e = (WorkGenerationalId)map$Entry0.getKey();
                if(this.j != null) {
                    ForegroundInfo foregroundInfo1 = (ForegroundInfo)map$Entry0.getValue();
                    this.j.c(foregroundInfo1.c(), foregroundInfo1.a(), foregroundInfo1.b());
                    this.j.d(foregroundInfo1.c());
                }
            }
            else {
                this.e = null;
            }
        }
        Callback systemForegroundDispatcher$Callback0 = this.j;
        if(foregroundInfo0 != null && systemForegroundDispatcher$Callback0 != null) {
            Logger.e().a("WM-SystemFgDispatcher", "Removing Notification (id: " + foregroundInfo0.c() + ", workSpecId: " + workGenerationalId0 + ", notificationType: " + foregroundInfo0.a());
            systemForegroundDispatcher$Callback0.d(foregroundInfo0.c());
        }
    }

    @Override  // androidx.work.impl.constraints.OnConstraintsStateChangedListener
    public void e(@NonNull WorkSpec workSpec0, @NonNull ConstraintsState constraintsState0) {
        if(constraintsState0 instanceof ConstraintsNotMet) {
            Logger.e().a("WM-SystemFgDispatcher", "Constraints unmet for WorkSpec " + workSpec0.a);
            this.b.d0(WorkSpecKt.a(workSpec0), ((ConstraintsNotMet)constraintsState0).d());
        }
    }

    @NonNull
    public static Intent f(@NonNull Context context0, @NonNull WorkGenerationalId workGenerationalId0, @NonNull ForegroundInfo foregroundInfo0) {
        Intent intent0 = new Intent(context0, SystemForegroundService.class);
        intent0.setAction("ACTION_NOTIFY");
        intent0.putExtra("KEY_NOTIFICATION_ID", foregroundInfo0.c());
        intent0.putExtra("KEY_FOREGROUND_SERVICE_TYPE", foregroundInfo0.a());
        intent0.putExtra("KEY_NOTIFICATION", foregroundInfo0.b());
        intent0.putExtra("KEY_WORKSPEC_ID", workGenerationalId0.f());
        intent0.putExtra("KEY_GENERATION", workGenerationalId0.e());
        return intent0;
    }

    @NonNull
    public static Intent g(@NonNull Context context0, @NonNull WorkGenerationalId workGenerationalId0, @NonNull ForegroundInfo foregroundInfo0) {
        Intent intent0 = new Intent(context0, SystemForegroundService.class);
        intent0.setAction("ACTION_START_FOREGROUND");
        intent0.putExtra("KEY_WORKSPEC_ID", workGenerationalId0.f());
        intent0.putExtra("KEY_GENERATION", workGenerationalId0.e());
        intent0.putExtra("KEY_NOTIFICATION_ID", foregroundInfo0.c());
        intent0.putExtra("KEY_FOREGROUND_SERVICE_TYPE", foregroundInfo0.a());
        intent0.putExtra("KEY_NOTIFICATION", foregroundInfo0.b());
        return intent0;
    }

    @NonNull
    public static Intent h(@NonNull Context context0) {
        Intent intent0 = new Intent(context0, SystemForegroundService.class);
        intent0.setAction("ACTION_STOP_FOREGROUND");
        return intent0;
    }

    @MainThread
    private void i(@NonNull Intent intent0) {
        Logger.e().f("WM-SystemFgDispatcher", "Stopping foreground work for " + intent0);
        String s = intent0.getStringExtra("KEY_WORKSPEC_ID");
        if(s != null && !TextUtils.isEmpty(s)) {
            this.b.h(UUID.fromString(s));
        }
    }

    @MainThread
    private void j(@NonNull Intent intent0) {
        if(this.j == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int v = 0;
        int v1 = intent0.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int v2 = intent0.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String s = intent0.getStringExtra("KEY_WORKSPEC_ID");
        WorkGenerationalId workGenerationalId0 = new WorkGenerationalId(s, intent0.getIntExtra("KEY_GENERATION", 0));
        Notification notification0 = (Notification)intent0.getParcelableExtra("KEY_NOTIFICATION");
        Logger.e().a("WM-SystemFgDispatcher", "Notifying with (id:" + v1 + ", workSpecId: " + s + ", notificationType :" + v2 + ")");
        if(notification0 == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        ForegroundInfo foregroundInfo0 = new ForegroundInfo(v1, notification0, v2);
        this.f.put(workGenerationalId0, foregroundInfo0);
        ForegroundInfo foregroundInfo1 = (ForegroundInfo)this.f.get(this.e);
        if(foregroundInfo1 == null) {
            this.e = workGenerationalId0;
        }
        else {
            this.j.a(v1, notification0);
            if(Build.VERSION.SDK_INT >= 29) {
                for(Object object0: this.f.entrySet()) {
                    v |= ((ForegroundInfo)((Map.Entry)object0).getValue()).a();
                }
                foregroundInfo0 = new ForegroundInfo(foregroundInfo1.c(), foregroundInfo1.b(), v);
            }
            else {
                foregroundInfo0 = foregroundInfo1;
            }
        }
        this.j.c(foregroundInfo0.c(), foregroundInfo0.a(), foregroundInfo0.b());
    }

    @MainThread
    private void k(@NonNull Intent intent0) {
        Logger.e().f("WM-SystemFgDispatcher", "Started foreground service " + intent0);
        androidx.work.impl.foreground.SystemForegroundDispatcher.1 systemForegroundDispatcher$10 = new Runnable() {
            final SystemForegroundDispatcher b;

            @Override
            public void run() {
                WorkSpec workSpec0 = SystemForegroundDispatcher.this.b.Q().g(intent0.getStringExtra("KEY_WORKSPEC_ID"));
                if(workSpec0 != null && workSpec0.J()) {
                    synchronized(SystemForegroundDispatcher.this.d) {
                        WorkGenerationalId workGenerationalId0 = WorkSpecKt.a(workSpec0);
                        SystemForegroundDispatcher.this.g.put(workGenerationalId0, workSpec0);
                        K k0 = SystemForegroundDispatcher.this.c.a();
                        I0 i00 = WorkConstraintsTrackerKt.d(SystemForegroundDispatcher.this.i, workSpec0, k0, SystemForegroundDispatcher.this);
                        WorkGenerationalId workGenerationalId1 = WorkSpecKt.a(workSpec0);
                        SystemForegroundDispatcher.this.h.put(workGenerationalId1, i00);
                    }
                }
            }
        };
        this.c.b(systemForegroundDispatcher$10);
    }

    @MainThread
    void l(@NonNull Intent intent0) {
        Logger.e().f("WM-SystemFgDispatcher", "Stopping foreground service");
        Callback systemForegroundDispatcher$Callback0 = this.j;
        if(systemForegroundDispatcher$Callback0 != null) {
            systemForegroundDispatcher$Callback0.stop();
        }
    }

    @MainThread
    void m() {
        this.j = null;
        synchronized(this.d) {
            for(Object object1: this.h.values()) {
                ((I0)object1).e(null);
            }
        }
        this.b.Q().q(this);
    }

    @MainThread
    void n(@NonNull Intent intent0) {
        String s = intent0.getAction();
        if("ACTION_START_FOREGROUND".equals(s)) {
            this.k(intent0);
            this.j(intent0);
            return;
        }
        if("ACTION_NOTIFY".equals(s)) {
            this.j(intent0);
            return;
        }
        if("ACTION_CANCEL_WORK".equals(s)) {
            this.i(intent0);
            return;
        }
        if("ACTION_STOP_FOREGROUND".equals(s)) {
            this.l(intent0);
        }
    }

    @MainThread
    void o(int v, int v1) {
        Logger.e().f("WM-SystemFgDispatcher", "Foreground service timed out, FGS type: " + v1);
        for(Object object0: this.f.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(((ForegroundInfo)map$Entry0.getValue()).a() == v1) {
                WorkGenerationalId workGenerationalId0 = (WorkGenerationalId)map$Entry0.getKey();
                this.b.d0(workGenerationalId0, 0xFFFFFF80);
            }
        }
        Callback systemForegroundDispatcher$Callback0 = this.j;
        if(systemForegroundDispatcher$Callback0 != null) {
            systemForegroundDispatcher$Callback0.stop();
        }
    }

    @MainThread
    void p(@NonNull Callback systemForegroundDispatcher$Callback0) {
        if(this.j != null) {
            Logger.e().c("WM-SystemFgDispatcher", "A callback already exists.");
            return;
        }
        this.j = systemForegroundDispatcher$Callback0;
    }
}

