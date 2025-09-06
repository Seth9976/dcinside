package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.SystemIdInfoKt;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.utils.IdGenerator;

@RestrictTo({Scope.b})
class Alarms {
    private static final String a;

    static {
        Alarms.a = "WM-Alarms";
    }

    public static void a(@NonNull Context context0, @NonNull WorkDatabase workDatabase0, @NonNull WorkGenerationalId workGenerationalId0) {
        SystemIdInfoDao systemIdInfoDao0 = workDatabase0.W();
        SystemIdInfo systemIdInfo0 = systemIdInfoDao0.d(workGenerationalId0);
        if(systemIdInfo0 != null) {
            Alarms.b(context0, workGenerationalId0, systemIdInfo0.c);
            Logger.e().a("WM-Alarms", "Removing SystemIdInfo for workSpecId (" + workGenerationalId0 + ")");
            systemIdInfoDao0.b(workGenerationalId0);
        }
    }

    private static void b(@NonNull Context context0, @NonNull WorkGenerationalId workGenerationalId0, int v) {
        AlarmManager alarmManager0 = (AlarmManager)context0.getSystemService("alarm");
        PendingIntent pendingIntent0 = PendingIntent.getService(context0, v, CommandHandler.b(context0, workGenerationalId0), (Build.VERSION.SDK_INT < 23 ? 0x20000000 : 0x24000000));
        if(pendingIntent0 != null && alarmManager0 != null) {
            Logger.e().a("WM-Alarms", "Cancelling existing alarm with (workSpecId, systemId) (" + workGenerationalId0 + ", " + v + ")");
            alarmManager0.cancel(pendingIntent0);
        }
    }

    public static void c(@NonNull Context context0, @NonNull WorkDatabase workDatabase0, @NonNull WorkGenerationalId workGenerationalId0, long v) {
        SystemIdInfoDao systemIdInfoDao0 = workDatabase0.W();
        SystemIdInfo systemIdInfo0 = systemIdInfoDao0.d(workGenerationalId0);
        if(systemIdInfo0 != null) {
            Alarms.b(context0, workGenerationalId0, systemIdInfo0.c);
            Alarms.d(context0, workGenerationalId0, systemIdInfo0.c, v);
            return;
        }
        int v1 = new IdGenerator(workDatabase0).c();
        systemIdInfoDao0.c(SystemIdInfoKt.a(workGenerationalId0, v1));
        Alarms.d(context0, workGenerationalId0, v1, v);
    }

    private static void d(@NonNull Context context0, @NonNull WorkGenerationalId workGenerationalId0, int v, long v1) {
        AlarmManager alarmManager0 = (AlarmManager)context0.getSystemService("alarm");
        int v2 = Build.VERSION.SDK_INT < 23 ? 0x8000000 : 0xC000000;
        PendingIntent pendingIntent0 = PendingIntent.getService(context0, v, CommandHandler.b(context0, workGenerationalId0), v2);
        if(alarmManager0 != null) {
            alarmManager0.setExact(0, v1, pendingIntent0);
        }
    }
}

