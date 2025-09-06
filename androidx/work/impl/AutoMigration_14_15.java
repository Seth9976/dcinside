package androidx.work.impl;

import android.content.ContentValues;
import androidx.room.RenameColumn;
import androidx.room.migration.AutoMigrationSpec;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.L;
import y4.l;

@RenameColumn(fromColumnName = "period_start_time", tableName = "WorkSpec", toColumnName = "last_enqueue_time")
public final class AutoMigration_14_15 implements AutoMigrationSpec {
    @Override  // androidx.room.migration.AutoMigrationSpec
    public void a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
        L.p(supportSQLiteDatabase0, "db");
        supportSQLiteDatabase0.W1("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues0 = new ContentValues(1);
        contentValues0.put("last_enqueue_time", System.currentTimeMillis());
        supportSQLiteDatabase0.t3("WorkSpec", 3, contentValues0, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }
}

