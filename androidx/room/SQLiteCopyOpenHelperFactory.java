package androidx.room;

import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Factory;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.File;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class SQLiteCopyOpenHelperFactory implements Factory {
    @m
    private final String a;
    @m
    private final File b;
    @m
    private final Callable c;
    @l
    private final Factory d;

    public SQLiteCopyOpenHelperFactory(@m String s, @m File file0, @m Callable callable0, @l Factory supportSQLiteOpenHelper$Factory0) {
        L.p(supportSQLiteOpenHelper$Factory0, "mDelegate");
        super();
        this.a = s;
        this.b = file0;
        this.c = callable0;
        this.d = supportSQLiteOpenHelper$Factory0;
    }

    @Override  // androidx.sqlite.db.SupportSQLiteOpenHelper$Factory
    @l
    public SupportSQLiteOpenHelper a(@l Configuration supportSQLiteOpenHelper$Configuration0) {
        L.p(supportSQLiteOpenHelper$Configuration0, "configuration");
        SupportSQLiteOpenHelper supportSQLiteOpenHelper0 = this.d.a(supportSQLiteOpenHelper$Configuration0);
        return new SQLiteCopyOpenHelper(supportSQLiteOpenHelper$Configuration0.a, this.a, this.b, this.c, supportSQLiteOpenHelper$Configuration0.c.a, supportSQLiteOpenHelper0);
    }
}

