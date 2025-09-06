package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.Preference;
import kotlin.jvm.internal.L;
import y4.l;

public final class IdGeneratorKt {
    public static final int a = 0;
    @l
    public static final String b = "next_job_scheduler_id";
    @l
    public static final String c = "next_alarm_manager_id";
    @l
    public static final String d = "androidx.work.util.id";

    public static final void c(@l Context context0, @l SupportSQLiteDatabase supportSQLiteDatabase0) {
        L.p(context0, "context");
        L.p(supportSQLiteDatabase0, "sqLiteDatabase");
        SharedPreferences sharedPreferences0 = context0.getSharedPreferences("androidx.work.util.id", 0);
        if(sharedPreferences0.contains("next_job_scheduler_id") || sharedPreferences0.contains("next_job_scheduler_id")) {
            int v = sharedPreferences0.getInt("next_job_scheduler_id", 0);
            int v1 = sharedPreferences0.getInt("next_alarm_manager_id", 0);
            supportSQLiteDatabase0.beginTransaction();
            try {
                supportSQLiteDatabase0.v2("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", v});
                supportSQLiteDatabase0.v2("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", v1});
                sharedPreferences0.edit().clear().apply();
                supportSQLiteDatabase0.u2();
            }
            finally {
                supportSQLiteDatabase0.H2();
            }
        }
    }

    private static final int d(WorkDatabase workDatabase0, String s) {
        Long long0 = workDatabase0.U().c(s);
        int v = 0;
        int v1 = long0 == null ? 0 : ((int)(((long)long0)));
        if(v1 != 0x7FFFFFFF) {
            v = v1 + 1;
        }
        IdGeneratorKt.e(workDatabase0, s, v);
        return v1;
    }

    private static final void e(WorkDatabase workDatabase0, String s, int v) {
        workDatabase0.U().b(new Preference(s, ((long)v)));
    }
}

