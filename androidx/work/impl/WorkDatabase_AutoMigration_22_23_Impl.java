package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

final class WorkDatabase_AutoMigration_22_23_Impl extends Migration {
    public WorkDatabase_AutoMigration_22_23_Impl() {
        super(22, 23);
    }

    @Override  // androidx.room.migration.Migration
    public void a(@NonNull SupportSQLiteDatabase supportSQLiteDatabase0) {
        supportSQLiteDatabase0.W1("ALTER TABLE `WorkSpec` ADD COLUMN `trace_tag` TEXT DEFAULT NULL");
    }
}

