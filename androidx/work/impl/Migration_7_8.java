package androidx.work.impl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.L;
import y4.l;

public final class Migration_7_8 extends Migration {
    @l
    public static final Migration_7_8 c;

    static {
        Migration_7_8.c = new Migration_7_8();
    }

    private Migration_7_8() {
        super(7, 8);
    }

    @Override  // androidx.room.migration.Migration
    public void a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
        L.p(supportSQLiteDatabase0, "db");
        supportSQLiteDatabase0.W1("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}

