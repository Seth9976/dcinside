package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.Preference;

@RestrictTo({Scope.b})
public class PreferenceUtils {
    private final WorkDatabase a;
    public static final String b = "INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)";
    public static final String c = "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))";
    public static final String d = "androidx.work.util.preferences";
    public static final String e = "last_cancel_all_time_ms";
    public static final String f = "reschedule_needed";
    private static final String g = "last_force_stop_ms";

    public PreferenceUtils(@NonNull WorkDatabase workDatabase0) {
        this.a = workDatabase0;
    }

    public long b() {
        Long long0 = this.a.U().c("last_cancel_all_time_ms");
        return long0 == null ? 0L : ((long)long0);
    }

    @NonNull
    public LiveData c() {
        return Transformations.c(this.a.U().a("last_cancel_all_time_ms"), (Long long0) -> (long0 == null ? 0L : ((long)long0)));
    }

    public long d() {
        Long long0 = this.a.U().c("last_force_stop_ms");
        return long0 == null ? 0L : ((long)long0);
    }

    public boolean e() {
        Long long0 = this.a.U().c("reschedule_needed");
        return long0 != null && ((long)long0) == 1L;
    }

    // 检测为 Lambda 实现
    private static Long f(Long long0) [...]

    public static void g(@NonNull Context context0, @NonNull SupportSQLiteDatabase supportSQLiteDatabase0) {
        SharedPreferences sharedPreferences0 = context0.getSharedPreferences("androidx.work.util.preferences", 0);
        if(sharedPreferences0.contains("reschedule_needed") || sharedPreferences0.contains("last_cancel_all_time_ms")) {
            long v = 0L;
            long v1 = sharedPreferences0.getLong("last_cancel_all_time_ms", 0L);
            if(sharedPreferences0.getBoolean("reschedule_needed", false)) {
                v = 1L;
            }
            supportSQLiteDatabase0.beginTransaction();
            try {
                supportSQLiteDatabase0.v2("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", v1});
                supportSQLiteDatabase0.v2("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", v});
                sharedPreferences0.edit().clear().apply();
                supportSQLiteDatabase0.u2();
            }
            finally {
                supportSQLiteDatabase0.H2();
            }
        }
    }

    public void h(long v) {
        Preference preference0 = new Preference("last_cancel_all_time_ms", v);
        this.a.U().b(preference0);
    }

    public void i(long v) {
        Preference preference0 = new Preference("last_force_stop_ms", v);
        this.a.U().b(preference0);
    }

    public void j(boolean z) {
        Preference preference0 = new Preference("reschedule_needed", z);
        this.a.U().b(preference0);
    }
}

