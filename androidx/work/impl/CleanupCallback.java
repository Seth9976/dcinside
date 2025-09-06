package androidx.work.impl;

import androidx.room.RoomDatabase.Callback;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.work.Clock;
import kotlin.jvm.internal.L;
import y4.l;

public final class CleanupCallback extends Callback {
    @l
    private final Clock a;

    public CleanupCallback(@l Clock clock0) {
        L.p(clock0, "clock");
        super();
        this.a = clock0;
    }

    @Override  // androidx.room.RoomDatabase$Callback
    public void c(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
        L.p(supportSQLiteDatabase0, "db");
        super.c(supportSQLiteDatabase0);
        supportSQLiteDatabase0.beginTransaction();
        try {
            supportSQLiteDatabase0.W1(this.f());
            supportSQLiteDatabase0.u2();
        }
        finally {
            supportSQLiteDatabase0.H2();
        }
    }

    @l
    public final Clock d() {
        return this.a;
    }

    private final long e() {
        return this.a.currentTimeMillis() - WorkDatabaseKt.c;
    }

    private final String f() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + this.e() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }
}

