package androidx.room.migration;

import androidx.sqlite.db.SupportSQLiteDatabase;
import y4.l;
import z3.f;

public abstract class Migration {
    @f
    public final int a;
    @f
    public final int b;

    public Migration(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    public abstract void a(@l SupportSQLiteDatabase arg1);
}

