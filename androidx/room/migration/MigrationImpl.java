package androidx.room.migration;

import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.functions.Function1;
import y4.l;

final class MigrationImpl extends Migration {
    @l
    private final Function1 c;

    public MigrationImpl(int v, int v1, @l Function1 function10) {
        super(v, v1);
        this.c = function10;
    }

    @Override  // androidx.room.migration.Migration
    public void a(@l SupportSQLiteDatabase supportSQLiteDatabase0) {
        this.c.invoke(supportSQLiteDatabase0);
    }

    @l
    public final Function1 b() {
        return this.c;
    }
}

