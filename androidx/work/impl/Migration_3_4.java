package androidx.work.impl;

import android.os.Build.VERSION;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.L;
import y4.l;

public final class Migration_3_4 extends Migration {
    @l
    public static final Migration_3_4 c;

    static {
        Migration_3_4.c = new Migration_3_4();
    }

    private Migration_3_4() {
        super(3, 4);
    }

    @Override  // androidx.room.migration.Migration
    public void a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
        L.p(supportSQLiteDatabase0, "db");
        if(Build.VERSION.SDK_INT >= 23) {
            supportSQLiteDatabase0.W1("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
        }
    }
}

