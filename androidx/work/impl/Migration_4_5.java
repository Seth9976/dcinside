package androidx.work.impl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.L;
import y4.l;

public final class Migration_4_5 extends Migration {
    @l
    public static final Migration_4_5 c;

    static {
        Migration_4_5.c = new Migration_4_5();
    }

    private Migration_4_5() {
        super(4, 5);
    }

    @Override  // androidx.room.migration.Migration
    public void a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
        L.p(supportSQLiteDatabase0, "db");
        supportSQLiteDatabase0.W1("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        supportSQLiteDatabase0.W1("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}

