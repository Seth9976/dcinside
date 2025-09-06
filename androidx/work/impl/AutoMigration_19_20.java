package androidx.work.impl;

import androidx.room.migration.AutoMigrationSpec;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.L;
import y4.l;

public final class AutoMigration_19_20 implements AutoMigrationSpec {
    @Override  // androidx.room.migration.AutoMigrationSpec
    public void a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
        L.p(supportSQLiteDatabase0, "db");
        supportSQLiteDatabase0.W1("UPDATE WorkSpec SET `last_enqueue_time` = -1 WHERE `last_enqueue_time` = 0");
    }
}

