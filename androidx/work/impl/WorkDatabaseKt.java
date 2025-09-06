package androidx.work.impl;

import java.util.concurrent.TimeUnit;
import y4.l;
import z3.f;

public final class WorkDatabaseKt {
    @l
    private static final String a = "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ";
    @l
    private static final String b = " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    @f
    public static final long c;

    static {
        WorkDatabaseKt.c = TimeUnit.DAYS.toMillis(1L);
    }
}

