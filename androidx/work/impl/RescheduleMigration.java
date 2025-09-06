package androidx.work.impl;

import android.content.Context;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.L;
import y4.l;

public final class RescheduleMigration extends Migration {
    @l
    private final Context c;

    public RescheduleMigration(@l Context context0, int v, int v1) {
        L.p(context0, "mContext");
        super(v, v1);
        this.c = context0;
    }

    @Override  // androidx.room.migration.Migration
    public void a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
        L.p(supportSQLiteDatabase0, "db");
        if(this.b >= 10) {
            supportSQLiteDatabase0.v2("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            return;
        }
        this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
    }

    @l
    public final Context b() {
        return this.c;
    }
}

