package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.AlarmManager.AlarmClockInfo;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Build.VERSION;
import androidx.annotation.ReplaceWith;
import androidx.annotation.RequiresApi;

public final class AlarmManagerCompat {
    @RequiresApi(21)
    static class Api21Impl {
        static AlarmManager.AlarmClockInfo a(long v, PendingIntent pendingIntent0) {
            return new AlarmManager.AlarmClockInfo(v, pendingIntent0);
        }

        static void b(AlarmManager alarmManager0, Object object0, PendingIntent pendingIntent0) {
            alarmManager0.setAlarmClock(((AlarmManager.AlarmClockInfo)object0), pendingIntent0);
        }
    }

    @RequiresApi(23)
    static class Api23Impl {
        static void a(AlarmManager alarmManager0, int v, long v1, PendingIntent pendingIntent0) {
            alarmManager0.setAndAllowWhileIdle(v, v1, pendingIntent0);
        }

        static void b(AlarmManager alarmManager0, int v, long v1, PendingIntent pendingIntent0) {
            alarmManager0.setExactAndAllowWhileIdle(v, v1, pendingIntent0);
        }
    }

    @RequiresApi(0x1F)
    static class Api31Impl {
        static boolean a(AlarmManager alarmManager0) {
            return alarmManager0.canScheduleExactAlarms();
        }
    }

    public static boolean a(AlarmManager alarmManager0) {
        return Build.VERSION.SDK_INT < 0x1F ? true : Api31Impl.a(alarmManager0);
    }

    @SuppressLint({"MissingPermission"})
    public static void b(AlarmManager alarmManager0, long v, PendingIntent pendingIntent0, PendingIntent pendingIntent1) {
        Api21Impl.b(alarmManager0, Api21Impl.a(v, pendingIntent0), pendingIntent1);
    }

    public static void c(AlarmManager alarmManager0, int v, long v1, PendingIntent pendingIntent0) {
        if(Build.VERSION.SDK_INT >= 23) {
            Api23Impl.a(alarmManager0, v, v1, pendingIntent0);
            return;
        }
        alarmManager0.set(v, v1, pendingIntent0);
    }

    @ReplaceWith(expression = "alarmManager.setExact(type, triggerAtMillis, operation)")
    @Deprecated
    public static void d(AlarmManager alarmManager0, int v, long v1, PendingIntent pendingIntent0) {
        alarmManager0.setExact(v, v1, pendingIntent0);
    }

    public static void e(AlarmManager alarmManager0, int v, long v1, PendingIntent pendingIntent0) {
        if(Build.VERSION.SDK_INT >= 23) {
            Api23Impl.b(alarmManager0, v, v1, pendingIntent0);
            return;
        }
        AlarmManagerCompat.d(alarmManager0, v, v1, pendingIntent0);
    }
}

