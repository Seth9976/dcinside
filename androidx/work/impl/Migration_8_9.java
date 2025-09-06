package androidx.work.impl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.L;
import y4.l;

public final class Migration_8_9 extends Migration {
    @l
    public static final Migration_8_9 c;

    static {
        Migration_8_9.c = new Migration_8_9();
    }

    private Migration_8_9() {
        super(8, 9);
    }

    @Override  // androidx.room.migration.Migration
    public void a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
        L.p(supportSQLiteDatabase0, "db");
        supportSQLiteDatabase0.W1("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}

