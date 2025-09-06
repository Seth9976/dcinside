package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.os.UserManagerCompat;
import androidx.core.util.Consumer;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.WorkInfo.State;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabasePathHelper;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.background.systemjob.SystemJobScheduler;
import androidx.work.impl.model.WorkProgressDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestrictTo({Scope.b})
public class ForceStopRunnable implements Runnable {
    @RestrictTo({Scope.b})
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        private static final String a;

        static {
            BroadcastReceiver.a = "WM-ForceStopRunnable$Rc";
        }

        @Override  // android.content.BroadcastReceiver
        public void onReceive(@NonNull Context context0, @Nullable Intent intent0) {
            if(intent0 != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent0.getAction())) {
                Logger.e().j("WM-ForceStopRunnable$Rc", "Rescheduling alarm that keeps track of force-stops.");
                ForceStopRunnable.g(context0);
            }
        }
    }

    private final Context a;
    private final WorkManagerImpl b;
    private final PreferenceUtils c;
    private int d;
    private static final String e = null;
    @VisibleForTesting
    static final String f = "ACTION_FORCE_STOP_RESCHEDULE";
    @VisibleForTesting
    static final int g = 3;
    private static final int h = -1;
    private static final long i = 300L;
    private static final long j;

    static {
        ForceStopRunnable.e = "WM-ForceStopRunnable";
        ForceStopRunnable.j = TimeUnit.DAYS.toMillis(3650L);
    }

    public ForceStopRunnable(@NonNull Context context0, @NonNull WorkManagerImpl workManagerImpl0) {
        this.a = context0.getApplicationContext();
        this.b = workManagerImpl0;
        this.c = workManagerImpl0.P();
        this.d = 0;
    }

    @VisibleForTesting
    public boolean a() {
        boolean z = Build.VERSION.SDK_INT < 23 ? false : SystemJobScheduler.i(this.a, this.b.U());
        WorkDatabase workDatabase0 = this.b.U();
        WorkSpecDao workSpecDao0 = workDatabase0.Z();
        WorkProgressDao workProgressDao0 = workDatabase0.Y();
        workDatabase0.e();
        try {
            List list0 = workSpecDao0.O();
            boolean z1 = list0 != null && !list0.isEmpty();
            if(z1) {
                for(Object object0: list0) {
                    workSpecDao0.q(State.a, ((WorkSpec)object0).a);
                    workSpecDao0.a(((WorkSpec)object0).a, 0xFFFFFE00);
                    workSpecDao0.J(((WorkSpec)object0).a, -1L);
                }
            }
            workProgressDao0.d();
            workDatabase0.Q();
            return z1 || z;
        }
        finally {
            workDatabase0.k();
        }
    }

    @VisibleForTesting
    public void b() {
        boolean z = this.a();
        if(this.h()) {
            Logger.e().a("WM-ForceStopRunnable", "Rescheduling Workers.");
            this.b.a0();
            this.b.P().j(false);
            return;
        }
        if(this.e()) {
            Logger.e().a("WM-ForceStopRunnable", "Application was force-stopped, rescheduling.");
            this.b.a0();
            long v = this.b.o().a().currentTimeMillis();
            this.c.i(v);
            return;
        }
        if(z) {
            Logger.e().a("WM-ForceStopRunnable", "Found unfinished work, scheduling it.");
            Schedulers.h(this.b.o(), this.b.U(), this.b.S());
        }
    }

    @VisibleForTesting
    static Intent c(Context context0) {
        Intent intent0 = new Intent();
        intent0.setComponent(new ComponentName(context0, BroadcastReceiver.class));
        intent0.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent0;
    }

    private static PendingIntent d(Context context0, int v) {
        return PendingIntent.getBroadcast(context0, -1, ForceStopRunnable.c(context0), v);
    }

    @SuppressLint({"ClassVerificationFailure"})
    @VisibleForTesting
    public boolean e() {
        try {
            int v = Build.VERSION.SDK_INT;
            PendingIntent pendingIntent0 = ForceStopRunnable.d(this.a, (v < 0x1F ? 0x20000000 : 0x22000000));
            if(v < 30) {
                if(pendingIntent0 != null) {
                    return false;
                }
                ForceStopRunnable.g(this.a);
                return true;
            }
            if(pendingIntent0 != null) {
                pendingIntent0.cancel();
            }
            List list0 = ((ActivityManager)this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if(list0 == null || list0.isEmpty()) {
                return false;
            }
            long v1 = this.c.d();
            for(int v2 = 0; true; ++v2) {
                if(v2 >= list0.size()) {
                    return false;
                }
                ApplicationExitInfo applicationExitInfo0 = f.a(list0.get(v2));
                if(applicationExitInfo0.getReason() == 10 && applicationExitInfo0.getTimestamp() >= v1) {
                    return true;
                }
            }
        }
        catch(SecurityException | IllegalArgumentException securityException0) {
        }
        Logger.e().m("WM-ForceStopRunnable", "Ignoring exception", securityException0);
        return true;
    }

    @VisibleForTesting
    public boolean f() {
        Configuration configuration0 = this.b.o();
        if(TextUtils.isEmpty(configuration0.c())) {
            Logger.e().a("WM-ForceStopRunnable", "The default process name was not specified.");
            return true;
        }
        boolean z = ProcessUtils.b(this.a, configuration0);
        Logger.e().a("WM-ForceStopRunnable", "Is default app process = " + z);
        return z;
    }

    @SuppressLint({"ClassVerificationFailure"})
    static void g(Context context0) {
        AlarmManager alarmManager0 = (AlarmManager)context0.getSystemService("alarm");
        PendingIntent pendingIntent0 = ForceStopRunnable.d(context0, (Build.VERSION.SDK_INT < 0x1F ? 0x8000000 : 0xA000000));
        long v = System.currentTimeMillis() + ForceStopRunnable.j;
        if(alarmManager0 != null) {
            alarmManager0.setExact(0, v, pendingIntent0);
        }
    }

    @VisibleForTesting
    public boolean h() {
        return this.b.P().e();
    }

    @VisibleForTesting
    public void i(long v) {
        try {
            Thread.sleep(v);
        }
        catch(InterruptedException unused_ex) {
        }
    }

    @Override
    public void run() {
        try {
            if(!this.f()) {
                return;
            }
            while(true) {
                try {
                    WorkDatabasePathHelper.d(this.a);
                }
                catch(SQLiteException sQLiteException0) {
                    Logger.e().c("WM-ForceStopRunnable", "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException0 = new IllegalStateException("Unexpected SQLite exception during migrations", sQLiteException0);
                    Consumer consumer0 = this.b.o().e();
                    if(consumer0 == null) {
                        throw illegalStateException0;
                    }
                    consumer0.accept(illegalStateException0);
                    break;
                }
                Logger.e().a("WM-ForceStopRunnable", "Performing cleanup operations.");
                try {
                    this.b();
                    break;
                }
                catch(SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException sQLiteAccessPermException0) {
                    int v1 = this.d + 1;
                    this.d = v1;
                    if(v1 >= 3) {
                        String s = UserManagerCompat.a(this.a) ? "The file system on the device is in a bad state. WorkManager cannot access the app\'s internal data store." : "WorkManager can\'t be accessed from direct boot, because credential encrypted storage isn\'t accessible.\nDon\'t access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                        Logger.e().d("WM-ForceStopRunnable", s, sQLiteAccessPermException0);
                        IllegalStateException illegalStateException1 = new IllegalStateException(s, sQLiteAccessPermException0);
                        Consumer consumer1 = this.b.o().e();
                        if(consumer1 == null) {
                            throw illegalStateException1;
                        }
                        Logger.e().b("WM-ForceStopRunnable", "Routing exception to the specified exception handler", illegalStateException1);
                        consumer1.accept(illegalStateException1);
                        break;
                    }
                    Logger.e().b("WM-ForceStopRunnable", "Retrying after " + ((long)v1) * 300L, sQLiteAccessPermException0);
                    this.i(((long)this.d) * 300L);
                }
            }
        }
        finally {
            this.b.Z();
        }
    }
}

