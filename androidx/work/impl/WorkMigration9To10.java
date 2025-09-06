package androidx.work.impl;

import android.content.Context;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.work.impl.utils.IdGeneratorKt;
import androidx.work.impl.utils.PreferenceUtils;
import kotlin.jvm.internal.L;
import y4.l;

public final class WorkMigration9To10 extends Migration {
    @l
    private final Context c;

    public WorkMigration9To10(@l Context context0) {
        L.p(context0, "context");
        super(9, 10);
        this.c = context0;
    }

    @Override  // androidx.room.migration.Migration
    public void a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
        L.p(supportSQLiteDatabase0, "db");
        supportSQLiteDatabase0.W1("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        PreferenceUtils.g(this.c, supportSQLiteDatabase0);
        IdGeneratorKt.c(this.c, supportSQLiteDatabase0);
    }
}

