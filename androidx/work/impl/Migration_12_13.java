package androidx.work.impl;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.L;
import y4.l;

public final class Migration_12_13 extends Migration {
    @l
    public static final Migration_12_13 c;

    static {
        Migration_12_13.c = new Migration_12_13();
    }

    private Migration_12_13() {
        super(12, 13);
    }

    @Override  // androidx.room.migration.Migration
    public void a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
        L.p(supportSQLiteDatabase0, "db");
        supportSQLiteDatabase0.W1("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        supportSQLiteDatabase0.W1("UPDATE workspec SET content_uri_triggers = x\'\' WHERE content_uri_triggers is NULL");
    }
}

